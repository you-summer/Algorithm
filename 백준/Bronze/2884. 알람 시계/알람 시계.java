import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();

		if(44>=m&&23>=h&&h!=0) {
			System.out.println(h-1);
			System.out.println(m-45+60);
		}else if(45<=m&&23>=h&&h!=0){
			System.out.println(h);
			System.out.println(m-45);
		}
		
		if(h==0&&44>=m) {
			System.out.println(h+23);
			System.out.println(m-45+60);
		}else if(h==0&&45<=m){
			System.out.println(h);
			System.out.println(m-45);
		}


	}

}
