package FileStream;

import java.io.*;

public class FileWriteRead {
    public static void main(String[] args)  {

//        Java의 File 라이브러리를 통해 파일을 생성하고 Read한는 벙법
//        기본적으로, 파일을 read하고 write하는 작업은 시간이 오래건리는 작업
//        그래서, 버퍼라는 중간매개 메모리를 사용

        try{
//            파일 입력출력의 경우 예외가 발생할 가능성이 높기 때문에, 라이브러리에서 예외처리강제
//            FileWriter, FileReader방식은 io패키지로, 동기 blocking 방식을 사용
//            nio패키지도 있는데, 이것은 비동기 non-blocking방식을 사용하여 성능을 높힘
            FileWriter fw = new FileWriter("test_file.txt", true); // test_file.txt라는 쓰기전용 파일 생성
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("손흥민");
            bw.newLine();
            bw.write("이강인");
            bw.newLine();
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }

//        file read 또한 buffer를 사용해 read한다
        try{
            FileReader fr = new FileReader("test_file.txt");
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while(true){
//                br.readLine()은 한줄한줄 소모가 되는 메서드
                readLine = br.readLine();
                if(readLine==null){
                    break;
                }
                System.out.println(readLine);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
