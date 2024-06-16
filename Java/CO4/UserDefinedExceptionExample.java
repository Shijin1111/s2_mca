// Custom exception class to represent invalid age
class InvalidAgeException extends Exception {
    // Constructor with a default message
    public InvalidAgeException() {
        super("Age cannot be negative");
    }

    // Constructor with a custom message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Person class representing a person with name and age
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to demonstrate user-defined exception
public class UserDefinedExceptionExample 
{
    public static void main(String[] args) 
    {
        try {
            // Create a person with a negative age (will throw an exception)
            Person person1 = new Person("John", -30);
        } catch (InvalidAgeException e) {
            // Catch and handle the exception
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a person with a valid age
            Person person2 = new Person("Alice", 25);
            System.out.println("Name: " + person2.getName());
            System.out.println("Age: " + person2.getAge());
        } catch (InvalidAgeException e) {
            // This block will not execute if age is valid
            System.out.println("Error: " + e.getMessage());
        }
    }
}
