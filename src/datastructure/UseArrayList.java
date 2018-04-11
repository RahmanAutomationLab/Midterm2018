package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> dayList = new ArrayList<>();
		dayList.add("6:15 am :Fazor prayer!");
		dayList.add("1:30 pm :Zohor prayer!");
		dayList.add("4:00 pm Asor prayer!");
		dayList.add("7:25 pm Magrib prayer!");
		dayList.add("9:15 pm Isha prayer!");
		dayList.add("Rest off the time work time!");
		System.out.println(dayList.size());
		System.out.println("Life of Muslim' dayList = " + dayList);
		System.out.println("start of the day "+ dayList.get(5));

		for (String x : dayList) {
			System.out.println(x);
		}
		//int days = dayList.size();
		//connect to db
		ConnectDB connect = new ConnectDB();
		//connect.insertDataFromArrayListToMySql(dayList,"prayer!","days");

		dayList.remove(5);
		System.out.println(" ");
		System.out.println("printing itr loop :");
		Iterator<String> itr = dayList.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
				//(dayList.size()>days) {

			//System.out.println (dayList.get(days));
		}

	}

}
