package mypkg;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public boolean evenNum(int a){
		if(a%2 == 0){
		   return true;
		}
		else {
		   return false;
		}
	}
	public void display()
	{
		System.out.println("This is master Branch");
	}
	public void demo()
	{
		System.out.println("This is demo fcuntion");
	}

	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		System.out.println("Sum is: "+calc.sum(20, 10));
		System.out.println("Diff is: "+calc.diff(20, 10));
		System.out.println("Mul is: "+calc.mul(20, 10));
		System.out.println("Div is: "+calc.div(20, 10));
		System.out.println("Even: "+calc.evenNum(10));
		calc.display();
		calc.demo();
	}

}
