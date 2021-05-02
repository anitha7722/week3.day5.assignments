package week3.day5.assignments3;

public class Students {
    public void getStudentsInfo(int id) {
    System.out.println("Print the students id ");	
    }
    public void getStudentsInfo(int id , String name) {
    	System.out.println("Print the students id + students name"+" ");
    }
    public void getStudentsInfo(String email , long Phonenumber) {
    	System.out.println("Print the students email"+" " + "Students Phone number");
    }
	public static void main(String[] args) {
		Students det = new Students();
		det.getStudentsInfo(227);
		det.getStudentsInfo(227," anitha");
		det.getStudentsInfo("xyz", 3454573);

	}

}
