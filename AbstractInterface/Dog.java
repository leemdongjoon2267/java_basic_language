package AbstractInterface;

public class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }

    void cry(){
        System.out.println("멍멍");
    }
}
