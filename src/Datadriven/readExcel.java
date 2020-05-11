package Datadriven;


public class readExcel {
	public static void main(String[] args) {
		readexcel();
	}
	public static void readexcel() {
		String filename = "/Users/waquaralam/Desktop/emailexcel.xls";
		String [][] data = Utilities.Excel.get(filename);
		
		for (String[] record: data) {			
			for (String j: record)
				System.out.println(j);
			}
		}
	
		
	}
		
	
	


