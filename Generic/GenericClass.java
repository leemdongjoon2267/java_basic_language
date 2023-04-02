package Generic;

public class GenericClass<T> {
    private T name;
    private T age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
