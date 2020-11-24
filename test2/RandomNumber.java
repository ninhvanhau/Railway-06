
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();

		// Question 1: In ngẫu nhiên ra 1 số nguyên
		int i = random.nextInt();
		System.out.println(i);

		// Question 2: In ngẫu nhiên ra 1 số thực
		double d = random.nextDouble();
		System.out.println(d);

		float f = random.nextFloat();
		System.out.println(f);


		// Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số
		i = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(i);
	}
}
