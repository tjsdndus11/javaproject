import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;

		System.out.printf("1 ~ 4 �߿� �����ϼ��� : ");
		a = s.nextInt();

		switch (a) {
		case 1:
			System.out.printf("1�� �����ߴ�\n");
			break;
		case 2:
			System.out.printf("2�� �����ߴ�\n");
			break;
		case 3:
			System.out.printf("3�� �����ߴ�\n");
			break;
		case 4:
			System.out.printf("4�� �����ߴ�\n");
			break;
		default:
			System.out.printf("�̻��Ѱ� �����ߴ�.\n");
		}
	}

}
