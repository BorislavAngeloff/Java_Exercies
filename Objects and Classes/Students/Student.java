public class Student {
    // first name, last name, age and hometown
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    //constructor
    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    //methods
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }
}
