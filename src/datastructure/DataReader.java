package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import databases.ConnectDB;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		ConnectDB connectDB = new ConnectDB();
		String textFile =("C:\\Users\\rahma\\MidtemMarch2018\\src\\data\\self-driving-car");


				//System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(textFile);
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		try {
			if (fr != null) {
				br = new BufferedReader(fr);
				String st = "";
				while ((st = br.readLine()) != null) {
					System.out.println(st);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}


		finally{
			if(fr != null){
				try {
					fr.close();
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
			if(br != null){
				try {
					br.close();
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		}

	}
}




