package AbstractInterface.TestPackage;

import AbstractInterface.AccessControll;

public class AccessControllMain extends AccessControll{
    public static void main(String[] args) {
//        AccessControll테스트
        AccessControll ac = new AccessControll();
        System.out.println(ac.name1);
//        System.out.println(ac.name2); // 상속을 받지 않아서 출력 불가
//        System.out.println(ac.name3); // 상속을 받지 않아서 출력 불가
//        protected변수의 경우 상속을 받을경우 다른 패키지라 할지라도 접근가능
        AccessControllMain ac2 = new AccessControllMain();
        System.out.println(ac2.name1);
        System.out.println(ac2.name2); // proteced는 상속 받아서 가능해짐
//        System.out.println(ac2.name3); // default는 상속받아도 불가

    }
}
