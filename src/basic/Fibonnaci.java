package basic;

public class Fibonnaci {

	public static int Fab(int n){
		if(n==1||n==2) return 1;
		else return Fab(n-1)+Fab(n-2);
	}
	public static void main(String[] args) {
		// f1=1,f2=1, fn=f(n-1)+f(n-2)
		for(int i=1;i<=40;i++){
			System.out.print(Fab(i)+" ");
		}
	}

}
