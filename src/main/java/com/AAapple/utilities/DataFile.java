package com.AAapple.utilities;

public class DataFile {

	Xls_Reader d = new Xls_Reader("C:\\Selenium_Workspace\\AAapple\\src\\main\\java\\File.xlsx");

	public String LoanAmount = d.getCellData("Data1", "LoanAmount", 2);
	public String Purpose = d.getCellData("Data1", "Purpose", 4);
	

	public String Firstname = d.getCellData("Data1", "Firstname", 2);
	public String Lastname = d.getCellData("Data1", "Lastname", 2);
	public String DateOfBirth = d.getCellData("Data1", "DateOfBirth", 2);

	public String address = d.getCellData("Data1", "address", 2);
	public String City = d.getCellData("Data1", "City", 2);
	public String State = d.getCellData("Data1", "State", 2);
	public String AreaCode = d.getCellData("Data1", "AreaCode", 2);

	public String Income = d.getCellData("Data1", "Income", 2);
	public String AdditionalIncome = d.getCellData("Data1", "AdditionalIncome", 2);

	public String UserName = d.getCellData("Data1", "UserName", 2);
	public String Password = d.getCellData("Data1", "Password", 2);

}
