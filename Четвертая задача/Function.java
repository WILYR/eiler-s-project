import java.util.Arrays;

public class Function {
	private int a = 999999;
	private int[] num = new int[6];
		

	public void func() {
		for(int i = 900000; i < a; i++){
			int b = i;
			String str = Integer.toString(b);
			int[] mass = new int[str.length()];
			for(int j = 0; j < str.length(); j++) {
				mass[str.length() - j - 1] = b % 10;
				b /= 10;
			}
			//System.out.println(Arrays.toString(mass));
			int count = 0;
			for(int j = 0; j < mass.length/2; j++) {
				if(mass[j] == mass[mass.length - j -1]) {
					count++;
				}
			}
			if(count == mass.length/2) {
				num = mass;
			}
		}
		System.out.println("Ответ:" + Arrays.toString(num));
	}
}