package instance_class;

public class ClassInstanceDifference1 {
////    클래스 변수
//    static int total = 0;
////    객체변수
//    int instance_total = 0;
////    클래스 함수
//    public static int add(int a1){
//        total+= a1;
//        return total;
//
//    }
////    메서드
//    public  int instance_add(int a1){
//        this.instance_total +=a1;
//    return  this.instance_total;
//    }


//    클래스변수로 했을대와 객체변수로 했을때의 차이를 위주로 봐보자
//    static int total = 0; // static은 객체를 생성 안해도 사용 가능
//    int instance_total = 0;
////    public static int add(int a){
////        total += a;
////        return total;
////    }
//    public  void instance_add(int a){ // int말고 void로 하면 return없이 가능
//        instance_total += a;
//        return instance_total;

//    static이 붙어있는 변수와 함수는 메모리상에 항상 떠있는 형태이다
//    static이 붙으면 클래스 변수라 부른다
static int static_total = 0;
//메서드 밖에서 static없이 선언된 변수는 instance(객체)변수라 부른다
    int instance_total = 0;


//    static이 붙으면 메서드가 아니라, 클래스 함수라 부른다
    //    void는 비어있다라는 의미로서, 여기서는 return값이 없다는 뜻이다
    public static int static_add(int a){
//        메서드 안에서 선언된 변수는 지역변수라 부른다
        static_total += a;
        return static_total; //return값을 받아야 int totalA ,int totalB로 받을 수 있음
    }

//    instance변수또한 클래스변수처럼 메모리상에 상시적으로 저장된다
//    static변수와의 메모리상의 차이점은 garbage컬렉터를 통해 인스턴스변수는 관리된다는 것
//    garbage컬렉터란 jvm에 내장된 불필요한 데이터를 자동식제관리 해주는 기능이다
//    그래서 return을 해도되고 안해도 되는 선택적 사항이다
//    this를 붙이는 이유는 매개변수명(input)과 구분을 짓기 위함이다
    public  void instance_add(int a) {
        this.instance_total += a;

    }


}
