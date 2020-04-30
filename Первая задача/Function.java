public class Function {
	private int num = 1000;

	public void sum() {
		num--;
		int count = 0;
		while(num > 0) {
			if(num % 3 == 0 || num % 5 == 0) {
				count += num;
			}
			num--;
		}
		System.out.print("Summ = " + count);
	}
}