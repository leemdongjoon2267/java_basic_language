package AbstractInterface;

//final을 클래스 앞에 붙이면 상속불가능한 클래스가 됨
//하나라도 abstract 메서드가 있으면, 클래스전체에도 abstract 키워드를 붙여야함
public abstract class Animal {
    private String name;
    private int age;
//    접근범위 default 또는 protected
    String nick_name = "야옹이animal";

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    void play(){
        System.out.println("네발로 뜁니다.");
    }
    public final void shape(){
        System.out.println("척추 동물입니다.");
    }

    public abstract void abstract_test();

}
