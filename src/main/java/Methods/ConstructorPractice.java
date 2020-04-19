package Methods;//object-oriented java practice(codeacademy)

public class ConstructorPractice {
    String breed;
    boolean hasOwner;
    int age;

    public ConstructorPractice(String dogBreed, boolean dogOwned, int dogYears) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        ConstructorPractice fido = new ConstructorPractice("poodle", false, 4);
        ConstructorPractice nunzio = new ConstructorPractice("shiba inu", true, 12);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}