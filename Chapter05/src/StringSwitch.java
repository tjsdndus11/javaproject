import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDK 7 ���� ���� ����
		// ���ڿ��� switch-case �����Ҽ� ����.

		String month;

		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ���: ");
		month = scan.next();

		int monthNumber;

		switch (month) {
		case "january":
			monthNumber = 1;
			break;
		case "feruary":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		default:
			monthNumber = 0;
			break;
		}
		System.out.println(monthNumber);

	}

}
