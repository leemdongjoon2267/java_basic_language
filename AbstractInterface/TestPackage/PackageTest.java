package AbstractInterface.TestPackage;

//프로그래밍에서 일반적으로 * 의미하는 것은 all을 의미
//package하위 파일단위의 *은 가능하나, 하위패키지까지 모두 가져오는 *은 불가능
import java.util.*;
//import java.*;
//java.lang 폴터는 import를 할필요 없이 자동으로 내장 import되어있음
//package java.lang.String;
public class PackageTest {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        String a = "test";
    }
}
