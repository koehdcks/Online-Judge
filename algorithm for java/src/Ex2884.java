import java.util.Scanner;

public class Ex2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M < 45) {
			H--;
			M= 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.printf("%d %d",H,M);
		}else {
			System.out.printf("%d %d",H,M-45);
		}
	}	
}
