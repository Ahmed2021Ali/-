
package test;

public class faculty extends employee
{
    
	 // احمد علي عبدالغني 
	private String officeHours;
	private String rank;

	
	public faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

    faculty(String ahmed, String ali, String string, String  eng.ahmedali1419@gmail.com, int i, int i0, String pmto7pm, String student) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

	
	public String getOfficeHours() {
		return officeHours;
	}

	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	
	public String getRank() {
		return rank;
	}

	
	public void setRank(String rank) {
		this.rank = rank;
	}

	
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
} 
    

