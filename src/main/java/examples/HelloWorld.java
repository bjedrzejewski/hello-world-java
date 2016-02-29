package examples;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //create a table
        Table<String, String, String> employeeTable = HashBasedTable.create();

        //initialize the table with employee details
        employeeTable.put("SL", "101","Tyler");
        employeeTable.put("SL", "102","Michael");
        employeeTable.put("SL", "103","David");
    }

}