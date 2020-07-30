public class Dog {
    
String breed;
boolean hasOwner;
int age;

public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
}

public static void main(String[] args) {
    Dog dobie = new Dog("doberman" , false, 6);
    Dog wolfhound = new Dog("irish wolfhound", false, 5);
    Dog akita = new Dog("akita", false, 10);
    System.out.println("We found three dogs: " + dobie.breed + ", " + wolfhound.breed + ", " + ", and an " + akita.breed + ".");
    System.out.println("The " + dobie.breed + "is " + dobie.age + ", the " + wolfhound.breed + "is " + wolfhound.age + ", and the " + akita.breed + "is " + akita.age + ".");
    System.out.println("We love dogs!");
    System.out.println("We will take them all!");



    }

}