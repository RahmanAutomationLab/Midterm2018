package datastructure;

import databases.ConnectDB;


import java.util.*;

import static databases.ConnectDB.connect;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> saarcConutryList = new ArrayList<String>();
		saarcConutryList.add("Bangladesh");
		saarcConutryList.add("India");
		saarcConutryList.add("Nepal");
		saarcConutryList.add("Pakistan");
		saarcConutryList.add("Sri-lanka");
		saarcConutryList.add("Bhutan");
		saarcConutryList.add("Malvdives");

		List<String> saarcCapList = new ArrayList<>();
		saarcCapList.add("Dhaka");
		saarcCapList.add("Dilli");
		saarcCapList.add("Kathmandu");
		saarcCapList.add("Colombo");
		saarcCapList.add("Thimpu");
		saarcCapList.add("Islamabad");
		saarcCapList.add("Male");


		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Comuntry", saarcConutryList);
		map.put("Capital", saarcCapList);

		for (Map.Entry key : map.entrySet()) {
			System.out.println(key.getKey() + " " + key.getValue());
		}
		System.out.println("Itr loops: ***");

		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ConnectDB connectDB = new ConnectDB();
		//insertDataFromArrayToMySql(int [] ArrayData, String tableName, String columnName)
		connectDB.insertDataFromStringToMySql("entry", "CountryName", "CapitalName");


	}


}
