package algorithm;

import databases.ConnectDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */
	public static void main(String[] args) throws Exception {

		int[] num = new int[100];
		storeRandomNumbers(num);
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort *******************************************************************//
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
		List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n = num.length;
		randomize(num, n);
		//Insertion Sort
		//****************************************************************************************//
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "insertion_sort", "SortingNumbers");
		List<String> inumbers = connectDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(inumbers);
		int in = num.length;
		randomize(num, in);

		//**BubbleSort**************************************************//
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bubble_sort", "SortingNumbers");
		List<String> bnumbers = connectDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(bnumbers);
		int bn = num.length;
		randomize(num, bn);


		//By following above, Continue for rest of the Sorting Algorithm....
		//MergeSort**************************************************************//

		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "bubble_sort", "SortingNumbers");
		List<String> gnumbers = connectDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(bnumbers);
		int gn = num.length;
		randomize(num, gn);

	}
	//*************************************************************8


		//Come to conclusion about which Sorting Algo is better in given data set.


	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
