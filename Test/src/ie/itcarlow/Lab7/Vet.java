package ie.itcarlow.Lab7;

//Student Name: Daniel Giedraitis
//Student Id Number: C00260331
//Date: November 2021

public class Vet 
{
	private String name;

    //constructors
	public Vet(){
        name="";
    }
	
    public Vet(String name){
    	setName(name);
    }

  //Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	//Misc method
	public void vaccinate(Animal animal){
        System.out.println(getName() + " is vaccinating" );
        if(animal instanceof Dog)
        { 
            System.out.println("Dog has been vaccinated: ");
        }
        else if(animal instanceof Cat)
        {
            System.out.println("Cat has been vaccinated: ");
        }
        System.out.println(animal);
	}
    
    
}
