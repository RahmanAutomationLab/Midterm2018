package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
     //*********************************************************************//
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 1; i<list.length;i++){
            int key = list[i];
            int j = i-1;
            while(j>=0 && list[j]>key ){
                list[j+1]=list[j];
                j--;
            }
            list[j+1] = key;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    //**********************************************************************//

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for (int i=0;i<array.length;i++){
            for (int j=1;j<array.length-1;j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }

            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime ;
        this.executionTime = executionTime;
        return list;
    }
    
    //*********************************************************//

    public void mergeSort(int [] array){

        //implement here
        int temp;
        if (array.length > 1) {
            // split array into two halves
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }

    }
    // left half
    public int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    // right half
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    // result
    public void merge(int[] result, int[] left, int[] right) {
        int j = 0;
        int k = 0;

        for (int i = 0; i < result.length; i++) {
            if (k >= right.length || (j < left.length && left[j] <= right[k])) {
                result[i] = left[j];
                j++;
            } else {
                result[i] = right[k];
                k++;
            }
        }
    }

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here

        return list;
    }


    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
