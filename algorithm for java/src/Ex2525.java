import java.util.Scanner;

public class Ex2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 d= b+c;
		
		if(d>=60) {
			a= a+d/60;
			d= d%60;
			if(a>=24) {
				a=a-24;
			}
			System.out.printf("%d %d",a,d);
		}else {
			System.out.printf("%d %d",a,d);
		}
		
	}
}
