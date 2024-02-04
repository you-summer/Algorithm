import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();

		
		if(1000>=A&&A>0&&1000>=B&&B>0) {
			System.out.println(1);
		}else if(0>A&&A>=-1000&&1000>=B&&B>0){
			System.out.println(2);
		}else if(0>A&&A>=-1000&&0>B&&B>=-1000) {
			System.out.println(3);
		}else if(1000>=A&&A>0&&0>B&&B>=-1000) {
			System.out.println(4);
		}
		

	}

}