import java.util.Scanner;

public class Main {

	public static long doStuff(int a){
	    //your code here
	    long B = 1;
	    for(int i=1;i<=a;i++){
	    	B = B*i;
	    }
	    return B;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext() ) {

			int a = in.nextInt();
			long result = doStuff(a);
			System.out.println(result);
		}
	}
}
