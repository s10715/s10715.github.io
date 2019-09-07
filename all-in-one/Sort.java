public class Sort{

	public static void main(String[] args){
		System.out.print("Hello World!");
		long array[] = {100,3,6,4,8,5,7,6,99};
		//quickSort(array, 0, array.length-1);

		insertSort(array);
		for(long l : array){
			System.out.print(l + " ");
		}
	}

	public static void bubbleSort(long[] array){
		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				if(array[i] > array[j]){
					long temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void selectSort(long[] array){
		for(int i=0; i<array.length; i++){
			int minIndex = i;
			for(int j=i; j<array.length; j++){
				if(array[j] < array[minIndex])
					minIndex = j;
			}
			if(minIndex != i){
				long temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void insertSort(long[] array){
		for(int i=1; i<array.length; i++){
			long temp = array[i];
			int tempIndex = i-1;
			while(tempIndex>=0 && array[tempIndex]>temp){
				array[tempIndex+1] = array[tempIndex];
				tempIndex--;
			}
			array[tempIndex+1] = temp;
		}
	}

	public static void quickSort(long[] array, int start, int end){
		if(start >= end) return;
		int left = start;
		int right = end;
		long num = array[end];
		while(left < right){
			while(array[left] <= num && left < right) left++;
			array[right] = array[left];
			while(array[right] >= num && left < right) right--;
			array[left] = array[right];
		}
		array[left] = num;
		quickSort(array,start,left-1);
		quickSort(array,left+1,end);
	}

}