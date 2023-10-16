package javaProgram;

public class ConditionStatement {
	public static void main(String[] args) {
		int x=20;
		int y=45;
		int z=30;
		if(x>y)
		{
			System.out.println("x greater than y");
		}
		else if(y>z)
		{
			System.out.println("y greater than z");
		}
		else if(z>x)
		{
			System.out.println("z greater than x");
		}
		else if(x>z)
		{
			System.out.println("x less than z");
		}
		else
		{
			System.out.println("x less than y");
		}
		
	}
}
