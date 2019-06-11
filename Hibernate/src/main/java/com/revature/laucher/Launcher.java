package com.revature.laucher;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;

import com.revature.models.Bear;
import com.revature.models.Cave;
import com.revature.models.Honeyjar;

/*
 * CRUD operations:
 * CREATE
 * -------
 * save - CREATEs new entity record. Returns serializable id.
 * persist - CREATEs new entity record, returns void. Defined by JSR-220 (JPA operation)
 * 
 * READ
 * ------
 * get - READs an entity record, provided an id. Returns the object. If there is no object
 * 		with the provided ID, returns null.
 * load - Provides a proxy of an entity record, READs when accessed. 
 * 		Loading must be done with care, because it could result in a LazyInitializationException or
 * 		ObjectNotFoundException occurs when there is no object with the given ID.
 * 
 * UPDATE
 * ------
 * 	update - Update an instance with the provided entity ID. Transitions detached object
 * 				to a persistent state. If the object was transient then Hibernate 
 * 				will throw a PersistenceException. Not JPA spec.
 * 	merge - Is JPA. Returns a persistent reference. The initial reference used to merge should
 * 				be discarded.
 * 				session.merge(bear); <-- Bad
 * 				Bear persistentBear = session.merge(bear); <-- Good
 * 
 * DELETE
 * ------
 * 	delete - deletes record of entity in transient or persistent state.
 */
public class Launcher {
	
	static SessionFactory sf;
	static Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
		sf = setupSessionFactory();
		Launcher launcher = new Launcher();
//		launcher.criteriaGetBearsByColor("lead");
		launcher.HQLGetBearsByBreed("husky");

//		launcher.loadTest();
		launcher.cacheTest();
		
		
		/* Got an error here - LazyInitializationException - This exception occurs when we try to access
		* a proxy outside of a session. Lazy loaded relations provide a proxy object. A proxy is a fake
		* object. However, this is only possible when there is an active session. If we try to access property
		* inside of a session, hibernate will automatically load the data. If there is no active session, then
		* Hibernate cannot access the database in the current context and we will be left with a 
		* LazyInitializationException. QC will ask about this exception.
		* 
		* Common form of the question: What does it mean when you get a LazyInitializationException and how
		* would you resolve this exception?
		*/
		
//		launcher.createBear();
//		Bear bear = launcher.createBearFamily();
		
//		Bear bear = launcher.findBear(4);
		
		// Creating and assigning the cave to the bear
//		Cave cave = new Cave(0, 100, 10, new ArrayList<Bear>());
//		bear.setCave(cave);
		
//		Honeyjar honeyjar = new Honeyjar(0, 100);
//		bear.setHoneyjar(honeyjar);
		
//		launcher.updateBear(bear);
		
//		bear.setColor("pink");
//		launcher.updateBear(bear);
		
//		log.fatal(bear);
		sf.close();
	}
	
	
	/**
	 * Native Query - Sometimes Hibernate doesn't provide all the same tools
	 * we need for querying from our database. Or perhaps, sometimes our database
	 * offers more functionality that we would like to use that Hibernate doesn't support.
	 * 
	 * In these cases, we can use a native query - Just plain ol' SQL.\
	 * 
	 * We should use native queries sparingly, because native queries aren't something
	 * which Hibernate understands natively, which means it cannot track the entities returned
	 * by the native query. ANd since it can't track them, it can't track changes to them. This means
	 * using a native query will invalidate your entire cache, because it won't know if currently
	 * objects are being manipulated.
	 * @param parentId
	 * @return
	 */
	public List<Bear> nativeQueryFindAllBears() {
		try (Session session = sf.openSession()) {
			List<Bear> bears = session.createNativeQuery("SELECT * FROM bears", Bear.class)
					.getResultList();
			return bears;
		}
	}
	
	public List<Bear> nativeQueryFindBearsByParentId(int parentId) {
		try (Session session = sf.openSession()) {
			List<Bear> bears = session.createNativeQuery(
									"SELECT * FROM bears WHERE parent_id = :id", Bear.class)
					.setParameter("id", parentId)
					.getResultList();
			return bears;
		}
	}
	
	public List<Bear> findCubs(int parentId) {
		try (Session session = sf.openSession()) {
			Bear parent = session.get(Bear.class, parentId);
			List<Bear> cubs = parent.getCubs();
			Hibernate.initialize(cubs); // Hibernate.initialize(proxy) - deproxies an object
//			cubs.size(); Just some method to interact with the object to get Hibernate to load the proxy
			return cubs;
		}
	}
	
	
	/**
	 * HQL-Hibernate Query Language
	 * HQL is similar to SQL, but requires us to use our entity definition and fields
	 * rather than our table definition.also supports named pararmters
	 */
	
	public List<Bear>HQLGetBearsByBreed(String breed){
		try(Session session=sf.openSession()){
			//:breed is a named parameter, like using? in preparedStatements
			List<?> list =session.createQuery("select b from Bear b where b.breed like :breed")
					.setParameter("breed", breed, StringType.INSTANCE)
					.list();
			System.out.println(list);
			return(List<Bear>)list;
		}
		
	}
	
	public List<Bear> HQLGetBearsByHeight(double height) {
		try(Session session = sf.openSession()) {
			// :breed is a named parameter, like using ? in PreparedStatements
			List<?> list = session.createQuery("select b from Bear b where b.height > :height")
					.setParameter("height", height, DoubleType.INSTANCE)
					.list();
			System.out.println(list);
			return (List<Bear>) list;
		}
	}
	
	
	/**
	 * Criteria is an Object Oriented and type safe querying API.
	 * Earlier version of Hibernate had a simpler Hibernate only implementation, which is now
	 * deprecated, and Hibernate supports only the JPA standard Criteria API.
	 * @param color
	 * @return
	 */
	
	public List<Bear> criteriaGetBearsByColor(String color) {
		try(Session session = sf.openSession()) {
			// Gets the CriteriaBuilder singleton instance - a utility class for creating criteria
			CriteriaBuilder cb = session.getCriteriaBuilder();
			
			// Creating an instance of the CriteriaQuery object for type Bear
			CriteriaQuery<Bear> bearQuery = cb.createQuery(Bear.class);
			
			// Setting the root of the query - Because we may be getting our Bears by joining data
			// It's necessary to specify which table our query actually begins on.
			Root<Bear> root = bearQuery.from(Bear.class);
			
			// The query logic itself
			bearQuery
				.select(root) // Data to be returned is the root
				.where(cb.equal(root.get("color"), color)); // Filter applied equal operand (==) on the 
															// root.color column with the value of 'color'
			
			Query<Bear> query = session.createQuery(bearQuery); // Utilize the CriteriaQuery as a standard HibernateQuery
			List<Bear> results = query.getResultList();		// Get the results
			System.out.println(results);
			return results;	
		}
	}
//	
	private void cacheTest() {
		try(Session session = sf.openSession()) {
			Bear bear = session.get(Bear.class, 4);
			System.out.println("-------");
			/* 
			 * The following queries are not actually executed because the 
			 * requested object is already in memory and being tracked by
			 * the session. This means that they are in the persistent state
			 * and are in the L1 cache. b2 and b3 will be the exact same object
			 * as bear, because the session just gives us the object it has in its
			 * cache - which is bear.
			 */
			Bear b2 = session.get(Bear.class, 4);
			Bear b3 = session.get(Bear.class, 4);
			log.fatal(bear == b2);
		}
	}
	
	private void loadTest() {
		Bear bear;
		try(Session session = sf.openSession()) {
			bear = session.load(Bear.class, 26);
			log.fatal(bear);
		}
//		Causes LazyInitializationException due to the session having already ended.
//		log.fatal(bear);
	}

	public void becomeFriends(Bear a, Bear b) {
		try(Session session = sf.openSession()) {
			Transaction tx = session.beginTransaction();
			a.getFriends().add(b);
			session.merge(a);
			tx.commit();
		}
	}
	
	public Bear deleteBear(Bear bear) {
		try(Session session = sf.openSession()) {
			Transaction tx = session.beginTransaction();
			session.delete(bear);
			tx.commit();
		}
		return bear;
	}
	
	public Bear updateBear(Bear bear) {
				
		try(Session session = sf.openSession()) {
			Transaction tx = session.beginTransaction();
			session.update(bear);
			session.flush();
			tx.commit();
		}
		return bear;
		
		
	}
	
	public Bear findBear(int id) {
		try(Session session = sf.openSession()) {
			return session.get(Bear.class, id);
		}
	}
	
	public Bear createBear() {
		try(Session session = sf.openSession()) {
			Bear bear = new Bear(0, "brown", "brown",
						30.0, 10000, null, new ArrayList<Bear>());
			session.save(bear);
//			session.persist(bear);
			return bear;
		}
	}
	
	public Bear createBearFamily() {
		Bear momma = new Bear(0, "bronze", "alien", 3
					, 100, null, new ArrayList<Bear>());
		Bear cubA = new Bear(0, "green", "husky", 1, 2,
						momma, new ArrayList<Bear>());
		Bear cubB = new Bear(0, "lead", "greyhound", 2.5,
						40, momma, new ArrayList<Bear>());
		
		momma.getCubs().add(cubA);
		momma.getCubs().add(cubB);
		
		try(Session session = sf.openSession()) {
			session.save(momma);
		}
		
		return momma;
	}
	
	
	public static SessionFactory setupSessionFactory() {
		Configuration configuration = new Configuration()
				.configure()
//				.setProperty("hibernate.connection.url", System.getenv("DB_URL"))
				.addAnnotatedClass(Bear.class)
				.addAnnotatedClass(Cave.class)
				.addAnnotatedClass(Honeyjar.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}
}
