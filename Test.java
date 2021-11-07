
package test;

public class Test {

    
    // احمد علي عبدالغني 
    public static void main(String[] args) {
    
		person person = new person("hussien", "12 saftelkamer", 
			"01017786080", " eng.ahmedali1419@gmail.com");

		student student = new student("ahmed", "ali", "01017786080", 
			"h eng.ahmedali1419@gmail.com",student.FRESHMAN);

		employee employee = new employee("ahmed", " abdulghani","6189999999",
			" eng.ahmedali1419@gmail.com", 910, 60000);

		faculty faculty = new faculty("fci", "mini", "4133333333",
			"fci28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

		staff staff = new staff("hatem", "malawe", "01098242769",
			"hatem@aol.com", 12, 65000, "Executive engeer");

		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
} 
    
    

