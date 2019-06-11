package polymorphism;

public class Calculator {
 public int sum(int a, int b) {
	 return a+b;
 }
 
 
 public float sum(float a, float b){
	 System.out.println("float sum method called");
	 return a+b;
 }
 
 public int sum(int[] intArr) {
	 int sum=0;
	 for(int i=0;i<intArr.length; i++) {
		 sum+=intArr[i];
	 }
 }
 
 
 
 
 
 public static void main(String[] args) {
	Calculator calculator =new Calculator();
	System.out.println(calculator.sum(1,2));
	System.out.println(calculator.sum(2.5f, 2.5f));
	
}
 
 
 
 
}
