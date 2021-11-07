
package test;

public class staff extends employee{
    
	  // احمد علي عبدالغني 
	private String title;

	
	public staff(String name, String address, String phone,  
		String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

    staff(String Ahmed, String ALi, String string, String eng.ahmedali1419@gmail.com, int i, int i0, String engger) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
} 
    

