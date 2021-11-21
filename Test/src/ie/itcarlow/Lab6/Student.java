package ie.itcarlow.Lab6;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Student extends Person
{
	private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        setNumCourses(numCourses);
        setCourses(courses);
        setGrades(grades);

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

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

	@Override
	public String toString() {
		return "Student: " + getName() + "<" + getAddress() + ">";
	}

	// Misc Methods
    public void addCourseGrade(String course, int grade) {
    
    }

    public void printGrades(){
    	
    }

    public double getAverageGrade() {
		return numCourses;
		
    

    }
}
