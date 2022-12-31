import java.util.Scanner;

public class Ex2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = sc.next();
		int z = Integer.parseInt(y);
		
		System.out.println(x*(y.charAt(2)-'0'));
		System.out.println(x*(y.charAt(1)-'0'));
		System.out.println(x*(y.charAt(0)-'0'));
		System.out.println(x*z);
		
	}
}
