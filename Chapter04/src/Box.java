import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double w, h, area, perimeter;

		Scanner input = new Scanner(System.in); // Ű���� �Է�

		System.out.print("���� : ");
		w = input.nextInt();

		System.out.print("���� : ");
		h = input.nextInt();

		area = w * h;
		perimeter = 2.0 * (w + h);

		System.out.println("����" + area);
		System.out.println("�ѷ�" + perimeter);

	}

}
