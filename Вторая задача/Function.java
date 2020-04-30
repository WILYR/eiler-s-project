public class Function {
	private int end = 4000000;

	public void fibb() {
		int arr[] = new int[50];
		arr[0] = 1;
		arr[1] = 2;
		int count = 0;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			//System.out.print("\na[" + i+ "] = " + arr[i]);
 		}
 		for(int j = 0; j < arr.length; j++) {
 			if(arr[j] % 2 == 0) {
				count += arr[j];
			}
			if(arr[j] > end) {
				break;
			}
 		}
 		System.out.print("\nСумма = " + count);
	}
}