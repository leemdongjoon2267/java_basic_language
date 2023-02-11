import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

//    사용자한테 얼마가 있는지 숫자를 입력을 받아
//    만약에 돈이 10000원 이상 있으면, "택시를 타시오" 출력
//    만약에 돈이 2000원 이상 있으면, "버스를 타시오" 출력
//    만약에 돈이 1000원 이상 있으면, "킥보드를 타시오" 출력
//    그렇지 않으면, "걸어가시오" 출력

//        System.out.println("현재 가지고 있는 돈을 입력하세요");
//        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int money = sc.nextInt();
//        System.out.println("지금 나의 교통수단은?");
//        if (money >= 10000) {
//            System.out.println("택시를 타시오");
//        } else if (money >= 2000 && money < 10000) {
//            System.out.println("버스를 타시오");
//        } else if (money >= 1000 && money < 2000) {
//            System.out.println("킥보르를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }

//        알파벳 문자 1개를 입력받아, 해당 문자가 대문자인지 소문자인지 출력
//        while(ture){ // 무한 반복
//            System.out.println("문자 하나만 입력해주세요");
//            Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//            char input = sc.nextLine().charAt(0);
//            int input_num = input; // 아스키코드 형변환
//            System.out.println(input_num);
//       소문자는 아스키코드 97~122
//        대문자는 아스키코드 65~90
//            if(input_num>=97 && input_num<=122){
//                System.out.println("소문자입니다");
//            }else if(input_num>=65 && input_num<=90){
//                System.out.println("대문자입니다");
//            }else{
//                System.out.println("잘못된 문자입니다");
//            }
//        }


//        은행고객센터
//        1번을 입력하면, "대출업무입니다"를 출력
//        2번을 입력하면, "예금업무입니다"를 출력
//        3번을 입력하면, "마이데이터업무입니다"를 출력
//        4번을 입력하면, "외화송금업무입니다"를 출력
//        그외의 숫자를 입력하면, "상담원을 연결합니다"를 출력

//        System.out.println("abc은행입니다. 원하는 서비스 번호를 입력하세요");
//        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
//        int ServiceNum = sc.nextInt();
//        if(ServiceNum==1){
//            System.out.println("대출업무입니다");
//        }else if(ServiceNum==2){
//            System.out.println("에금업무입니다");
//        }else if(ServiceNum==3){
//            System.out.println("마이데이터 업무입니다");
//        }else if(ServiceNum==4){
//            System.out.println("에금업무입니다");
//        }else{
//            System.out.println("상담원을 연결합니다");
//        }

        System.out.println("abc은행입니다. 원하는 서비스 번호를 입력하세요");
        Scanner sc = new Scanner(System.in); // 입력 받을때는  out이 아니라 in
        int ServiceNum = sc.nextInt();
        switch(ServiceNum){
            case 1 :
                System.out.println("대출업무입니다");
                break;
            case 2 :
                System.out.println("에금업무입니다");
                break;
            case 3 :
                System.out.println("마이데이터 업무입니다");
                break;
            case 4 :
                System.out.println("에금업무입니다");
                break;
            default:
                System.out.println("상담원을 연결합니다");
                break;
        }

    }
}
