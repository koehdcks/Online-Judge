import java.util.Scanner;
public class Ex2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",N,i,N*i);
		}
	}
}
