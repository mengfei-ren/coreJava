package basic;

public class Factorial {
	
	private static double fn(int n){
		double multiple;
		if(n==1) multiple=1;
		else multiple=fn(n-1)*n;
		return multiple;
	}

	public static void main(String[] args) {
		// Sum of Factorial from 1 to 100 using Recursions
		double sum=0;
		for(int i=1;i<=100;i++){
			sum+=fn(i);
		}
		System.out.println(sum);
	}

}
