public class Task {
	public static void main(String[] args) {
		int count = 0;
		int answer = 0;
		for(int i = 2; i < 100000000; i++) {
			boolean isTrue = true;
			for(int j = 2;j < i; j++) {
				if(i % j == 0) {
					isTrue = false;
					break;
				}
			}
			if(isTrue == true) {
				answer = i;
				count++;
			}
			if (count == 10001) {
				System.out.print(answer);
				break;
			}
		}
	}
}