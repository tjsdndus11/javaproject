import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int targetSales = 1000;
		int mySales;
		int bonus;
		String result;

		Scanner input = new Scanner(System.in);

		System.out.printf("������ �Է��ϼ���. (���� : ����)");
		mySales = input.nextInt();

		if (mySales >= targetSales) {
			result = "������ �޼��Ͽ����ϴ�.";
			bonus = (mySales - targetSales) / 10;
		} else {
			result = "���� �޼��� �����Ͽ����ϴ�.";
			bonus = 0;
		}
		System.out.println(result + "\n" + "���ʽ� : " + bonus);

	}

}
