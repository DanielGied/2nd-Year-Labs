package ie.itcarlow.Lab8;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: December 2021

public class Student extends Person
{
	private String course;

    public Student(String name, String course)
    {
        super(name);
        setCourse(course);
    }

    // Getter and Setter Method
    private void setCourse(String course)
    {
        this.course = course;
    }

    public String getCourse()
    {
        return course;
    }

    // toString Method
    @Override
    public String getDescription()
    {
        return "A student is studying: " + getCourse();
    }
}
