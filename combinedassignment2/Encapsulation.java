package combinedassignment2;

class Employee {
    private static int employeeCount = 0; 
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;

   
    public Employee(String firstName, String lastName, String email) {
        this.employeeId = ++employeeCount; 
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

  
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

   
    public static int getEmployeeCount() {
        return employeeCount;
    }

    
    public void show() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
    }
}

public class Encapsulation {
	public static void main(String[] args) {
		Employee e=new Employee("mani","con","mani@gmail.com");
		e.show();
	}

}
