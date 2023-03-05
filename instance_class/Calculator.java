package instance_class;

public class Calculator {
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
    int instance_total = 0;
//    public static int add(int a){
//        total += a;
//        return total;
//    }
    public  void instance_add(int a){ // int말고 void로 하면 return없이 가능
        instance_total += a;
//        return instance_total;
    }


}
