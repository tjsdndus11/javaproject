import java.util.Scanner;

public class Problem_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;
		String[] str;

		System.out.printf("������ ���ٷ� ����� �Է��ϼ��� : ");
		str = s.nextLine().split(" ");

		a = Integer.parseInt(str[0]);
		ch = str[1].charAt(0);
		b = Integer.parseInt(str[2]);

		switch (ch) {
		case '+':
			System.out.printf("%d + %d = %d �Դϴ�. \n", a, b, a + b);
			break;
		case '-':
			System.out.printf("%d - %d = %d �Դϴ�. \n", a, b, a - b);
			break;
		case '*':
			System.out.printf("%d * %d = %d �Դϴ�. \n", a, b, a * b);
			break;
		case '/':
			System.out.printf("%d / %d = %d �Դϴ�. \n", a, b, a / b);
			break;
		case '%':
			System.out.printf("%d %% %d = %d �Դϴ�. \n", a, b, a % b);
			break;
		default:
			System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�. \n");
		}
	}

}
