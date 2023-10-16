package javaProgram;

public class Assignment1 {
	public static void main(String[] args) {
		
		char customerType='T';
		int Rewardpoints=24000;
		
		if(Rewardpoints>15000)
		{
			System.out.println("you got 30% discount");
			if(customerType=='T'){
				System.out.println("You got extra 2% discount");	
			}else if(customerType=='D'){
				System.out.println("You got extra 5% discount");
			}
		}
		else if(Rewardpoints>10000) {
			System.out.println("You got 20% discount");
			if(customerType=='T'){
				System.out.println("You got extra 2% discount");	
			}else if(customerType=='D'){
				System.out.println("You got extra 5% discount");
			}
		}

		else 
		{
			System.out.println("You have not any discount");
		}
		
		
	}
}
