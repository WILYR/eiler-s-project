public class Function {

	public void func() {
		long a = 100000000000L;
		int count = 0;
		long num = 0;
		for(int i = 1; i < a; i++) {
			for(int j = 1; j <= 20; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 20) {
				num = i;
				break;
			} else {
				count = 0;
			}
		}
		System.out.println(num);
	}
}