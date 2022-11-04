import java.util.*;

public class UpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String ch = "";
		char[] n = name.toCharArray();
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 'a' || n[i] == 'e' || n[i] == 'i' || n[i] == 'o' || n[i] == 'u' || n[i] == 'A' || n[i] == 'E'
					|| n[i] == 'I' || n[i] == 'O' || n[i] == 'U') {
				ch = ch + n[i];
			} else if (Character.isLowerCase(n[i])) {
				ch = ch + Character.toUpperCase(n[i]);
			} else if (Character.isUpperCase(n[i])) {
				ch = ch + Character.toLowerCase(n[i]);
			}
		}
		System.out.println(ch);
	}

}
