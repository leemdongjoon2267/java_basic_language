package AbstractInterface;

public class AccessControll {
//    public : 모두 접근가능
    public String name1 = "public name";
//    protected : 패키지내 + 상속시 모두 접근가능
    protected  String name2 = "protected name";
//    default : 패키지내에서만 접근가능
    String name3 = "default name";
//    private : 클래스 내에서만 접근가능
    private String name4 = "private name";
    void test(){
        System.out.println("access controll 테스트입니다.");
    }
}
