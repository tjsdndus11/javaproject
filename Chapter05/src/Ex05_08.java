import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;

		System.out.printf("������ �Է��ϼ��� : ");
		a = s.nextInt();

		if (a >= 90)
			System.out.printf("A");
		else if (a >= 80)
			System.out.printf("B");
		else if (a >= 70)
			System.out.printf("C");
		else if (a >= 60)
			System.out.printf("D");
		else
			System.out.printf("F");

		System.out.printf(" ���� �Դϴ�. \n");
	}
}
