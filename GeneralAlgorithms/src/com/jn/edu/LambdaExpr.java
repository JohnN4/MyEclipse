/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class LambdaExpr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LambdaFunc a=(int x)-> System.out.println(2*x);
//		a.abstractMethod(4);

//		LambdaFunc isEven=(int x)->(x % 2)==0;
//		System.out.println(isEven.DivisiblityTest(4));

//		LambdaFunc isEven=(int x)->{
//			boolean retVal =(x %2)==0;
//			return retVal;
//		};
//		System.out.println(isEven.DivisiblityTest(4));

		LambdaFunc strOp = (x) -> {

			String retVal;
			StringBuilder test = new StringBuilder();
			retVal = test.reverse().toString();
			return retVal;
		};
		LambdaFunc strOp2 = (x) -> {
			StringBuffer temp = new StringBuffer();
			// for(int i=0;)
			return x;
		};
	}

	interface LambdaFunc {
		// void abstractMethod(int x);
		// boolean DivisiblityTest(int x);
		String action(String x);

		default void normalMethod() {
			System.out.println("Hello");
		}
	}

}
