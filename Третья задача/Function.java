public class Function {
	private long end = 600851475143L;

	public void dels() {
		long i = 1L;
		while(i < end) {
			while(end % i == 0) {
				//System.out.print("\ni = " + i);
				if(end / i == end) {
					break;
				} else {
					end = end / i;
				}
			}
			i++;
		}
		System.out.print("\nНаибольший делитель " + end);
	}
}