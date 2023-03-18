package Java_basic_grammer;
//재귀함수란 특정함수가 자기자신을 호출하는 형태의 함수를 말한다
public class RecursiveCall1 {
    public static void main(String[] args) {
//        숫자n이 있을때 1~n까지의 합게를 구하라
        int n = 10;
        int total = 0;
        for(int i=1; i<=n; i++){
            total +=i;
        }

//        누적합계
//        int recur_test = 1;
////        recur_add(recur_test); //total에 0을 넣어주는게 방법2
////        System.out.println(static_total); //방법2
//        int recur_total = recur_add(recur_test); //방법3
//    }
////    static int total = 0; //방법1
//    static  int static_total = 0;
//    public static int recur_add(int a){
////        방법1 : 클래스 변수를 선언하여 클래스 변수에 더하여 계산
////      total +=a; //방법1
//
////        방법2 : 매개변수에 total값을 달고 다닌다, 그리고 재구함수 밖에서 값을 꺼낼때는 static_total을 활용함
////        total +=a; //방법2
//
////        방법3 : return을 void가 아닌 int로 둔다
//        if(a==10){
////            System.out.println(total); //방법1,2
////            static_total = total; //방법2
//            return 10;
//        }
//        return a + recur_add(a+1);
    }
}
