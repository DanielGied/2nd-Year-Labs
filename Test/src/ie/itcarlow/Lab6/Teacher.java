package ie.itcarlow.Lab6;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Teacher extends Person 
{
	private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
    }

    // Getter & Setter methods
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    // Misc methods
    public boolean addCourse(String course) {
		return true;
    	
    }

    public boolean removeCourse(String course) {
		return true;
    	
    }

	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

	



	
}
