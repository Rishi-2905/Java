
import java.util.*;

public class SwitchOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any operator  (eg.+,-,*) : ");
		char op = sc.next().charAt(0);
		int a, b, c;
		switch (op) {
		case '+':
			System.out.println("Enter the first value to Additon : ");
			a = sc.nextInt();
			System.out.println(" Enter the second value to Additon : ");
			b = sc.nextInt();
			c = a + b;
			System.out.println("Answer : " + c);
			break;
		case '-':
			System.out.println(" Enter the first value to Subraction");
			a = sc.nextInt();
			System.out.println(" Enter the second value to Subraction");
			b = sc.nextInt();
			c = a - b;
			System.out.println("Ansewr : " + c);
			break;
		case '*':
			System.out.println("\n Enter the first value to Multiplication");
			a = sc.nextInt();
			System.out.println("\n Enter the second value to Multiplication");
			b = sc.nextInt();
			c = a * b;
			System.out.println("Answer : " + c);
			break;
		case '/':
			try {
				System.out.println("\n Enter the first value to Division");
				a = sc.nextInt();
				System.out.println("\n Enter the second value to Division");
				b = sc.nextInt();
				c = a / b;
				System.out.println("Answer : " + c);
				break;
			} catch (Exception e) {
				System.out.println("Numberr can not be divided by zero");
			}
		default:
			System.out.println(" no case matches");
		}
	}

}
