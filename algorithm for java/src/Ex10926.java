import java.util.Scanner;

public class Ex10926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if(input.charAt(0)>='a'&&input.charAt(0)<='z') {
			System.out.println(input+"??!");
		}
	}
}
