public class Person {
    // Declaring Private instance variables
    private String name;
    private int age;

    // initializing new instances of the class(Constructor)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Creating a public getter for name
    public String getname() {
        return name;
    }

    // Creating a public setter for name
    public void setname(String name) {
        this.name = name;
    }

    // Creating a public getter for age
    public int getage() {
        return age;
    }

    // Creating a public setter for age and ensuring age is positive 
    public void setage(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Creating a main method for encapsulation
    public static void main(String[] args) {
        Person person = new Person("Adwoaaa", 19);

        // Accessing and printing out attributes using the getter methods created
        System.out.println("Name: " + person.getname()); 
        System.out.println("Age: " + person.getage());  
        
        // Making changes to attributes by use of the setter methods
        person.setname("Arnolddd");
        person.setage(20);

        // Printing out changed attributes using the getter methods
        System.out.println("Updated Name: " + person.getname()); 
        System.out.println("Updated Age: " + person.getage());   
    }
}