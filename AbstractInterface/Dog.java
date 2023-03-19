package AbstractInterface;

public class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void abstract_test() {

    }

    void cry(){
        System.out.println("멍멍");
    }
}
