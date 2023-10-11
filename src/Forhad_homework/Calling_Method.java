package Forhad_homework;

public class Calling_Method {

	public static void main(String[] args) {
		profitOfCompany();

	}
	//accessModifiers---static/Non-static keyword---
	public static void profitOfCompany() {
	int income=100000;
	int expense=30000;
	int profit=income-expense;
	System.out.println(profit);
	}
}
