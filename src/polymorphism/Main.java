package polymorphism;

public class Main {
    public static void groupTalk(Pet[] pets){
        for(Pet pet : pets){
            pet.talk();
        }
    }
    public static void main(String[] args) {
        Pet[] pets = {new Cat(), new Dog(), new Parrot()};
        groupTalk(pets);
    }
}



