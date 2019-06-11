package tryresources;
 public class TryTest {
	public static void main(String[] args) {
		try(TestResource tr = new TestResource()) {
			System.out.println("Doing stuff!");
		}
		System.out.println("Done!");
	}
}
 /**
 * AutoCloseable interface describes a resource which can
 * automatically be closed with a try-with-resources block.
 * 
 */
class TestResource implements AutoCloseable {
 	public TestResource() {
		System.out.println("Resource being created");
	}
	
	@Override
	public void close() {
		System.out.println("Resource closing");
	}
	
} 