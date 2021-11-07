
package test;

public class employee extends person{
    	// احمد علي عبدالغني علي 
	private int office;
	private double salary;
	private myData dateHired;

	
	public employee(String name, String address, String phone, 
		String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new myData();
	}

    employee(String ahmed, String ali, String string, String  eng.ahmedali1419@gmail.com, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	
	public int getOffice() {
		return office;
	}

	
	public String getSalary() 
        {
		return String.format("%.2f", salary);
	}


	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() 
				 + "/" + dateHired.getYear();
	}

	/** Set new office */
	public void setOffice(int office) {
		this.office = office;
	}

	/** Set new salary */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public void setDateHired() {
		dateHired = new myData();
	}

	
	public String toString() {
		return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
    
}
