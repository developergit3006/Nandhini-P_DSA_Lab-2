package gl.denomination.calculator;

public class MergeSort {
	
private Integer[] inputArray;
	
	public MergeSort(Integer[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public void mergeSort() {
		mergeSortInternal(0, inputArray.length - 1);
	}
	private void mergeSortInternal (int startIndex, int endIndex) {
		if(startIndex < endIndex) {	
			int midPointIndex = (startIndex + endIndex) / 2;
			
			mergeSortInternal(startIndex, midPointIndex); 
			mergeSortInternal( (midPointIndex + 1), endIndex);
			DivideAndConquer divideAndMerge = new  DivideAndConquer(inputArray);
			divideAndMerge.SliceAndMerge(startIndex, midPointIndex, endIndex);
			
		}
		
		
	}

}
