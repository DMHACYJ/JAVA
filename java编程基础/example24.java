package java±à³Ì»ù´¡;
//Ã°ÅÝÅÅÐò
public class example24 {
	public static void main(String[] args) {
		int[] arr = {9, 8, 3, 5, 2};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		//boolean flag = true;
		for(int i = arr.length; i > 1; i--) {
			for(int j = 1; j < i; j++) {
				if(arr[j - 1] > arr[j]) {
					//flag = false;
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			//if(flag) {
				//break;
			//}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
