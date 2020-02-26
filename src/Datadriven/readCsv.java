package Datadriven;

import java.util.List;

public class readCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readdata();

	}
	
	public static void readdata() {
		String datalocation = "/Users/waquaralam/Desktop/UserAccounts.csv";
		List<String[]> record = Utilities.CSV.get(datalocation);
		
		for (String[] i : record) {
			for (String j: i)
			System.out.println(j);
		}
	}

}
