package Java_basic_grammer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveCall2 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
//        위 배열을 2개의 숫자로 조합할 수 있는 경우의 수를 나열하라
//        단 10, 20과 20,10은 같은 것으로 판단한다
//        10,20
//        10,30
//        10,40
//        20,30
//        20,40
//        30,40
//        int[] arr_temp = new int[2];
//        for(int i=0; i< arr.length; i++){
//            arr_temp[0] = arr[i];
//            for(int j=i+1; j<arr.length; j++){
//                arr_temp[1] = arr[j];
//                System.out.println(Arrays.toString(arr_temp));
//            }
//        }
//        위 배열을 3개의 숫자로 조합할 수 있는 경우의 수를 나열하라
//        for문이 3개

//        int[] arr_temp2 = new int[3];
//        for(int i=0; i< arr.length; i++){
//            arr_temp2[0] = arr[i];
//            for(int j=i+1; j<arr.length; j++) {
//                arr_temp2[1] = arr[j];
//                for(int g=j+1; g<arr.length; g++){
//                    arr_temp2[2] = arr[g];
//                    System.out.println(Arrays.toString(arr_temp2));
//                }
//            }
//        }

//        3줄짜리 조합을 출력하는 재귀함수 호출
        recur(arr,new int[3], 0, 0);
    }
    //    static int index = 0;
//    static int[] total;
    static List<Integer> lst = new ArrayList<>();
    static void recur(int[] arr, int[] arr_temp, int index, int ijk){
        if(index == arr_temp.length) {
            int total = 0;
            for(int a : arr_temp){
                System.out.println(a);
                total +=a;
            }
            lst.add(total);
            return;
        }
        for(int i=ijk; i< arr.length; i++){
            arr_temp[index] = arr[i];
            recur(arr, arr_temp, index+1, ijk+1); //index는 하나씩 증가하면서 recur을 호출
        }
    }
}
