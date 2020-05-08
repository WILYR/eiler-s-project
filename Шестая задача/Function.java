import java.lang.Math;

public class Function {

	public void func() {
		int range = 100;
		int a = 0;
		int sum = 0;
		for(int i = 1; i <= range; i++) {
			a = (int)Math.pow(i, 2);
			sum += a;
		}
		int b = 0;
		int sum2;
		for(int i = 1; i <= range; i++) {
			b += i;
		}
		sum2 = (int)Math.pow(b, 2);
		sum2 -= sum;
		System.out.println("Ответ: " + sum2);
	}
}