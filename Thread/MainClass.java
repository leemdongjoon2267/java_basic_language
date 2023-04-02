package Thread;

public class MainClass {
    static int total = 100;
    public static void main(String[] args) throws InterruptedException {

//        thread 생성 방법 2가지
//        1. Runnable구현방식
//        Thread th1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("first thread");
//            }
//        });
//        th1.start();
//
////        2. Thread상속방식
//        Thread th2 = new ThreadWithClass();
//        th2.start();
//
//        Thread th3 = new Thread(() -> System.out.println("third thread"));
//        th3.start();
//
////        Runnable의 또다른 방식
//        new Thread(() -> System.out.println("forth thread")).start();


//        동기적 도서대출
//        for(int i=0; i<1000; i++){
//            if(total<=0){
//                break;
//            }
//            System.out.println("대출완료");
//            total-=1;
//            System.out.println("현재 남아있는 책수량 " + total);
//        }
//        System.out.println("최종적으로 남아있는 책수량 " + total);

//        비동기적 대서대출(멀티스레드), 성능은 비동기적 실행이 우세
//        for(int i=0; i<1000; i++){
//            if(total<=0){
//                break;
//            }
//            new Thread(() -> { System.out.println("대출완료");
//                total-=1;
//                System.out.println("현재 남아있는 책수량 " + total);
//            }).start();
//
//        }
//        System.out.println("최종적으로 남아있는 책수량 " + total);


//        비동기적 도서대출방식(멀티쓰레드 방식) 별도의 클래스로 구현
//        멀티스레드 상화에서 동기적 코딩을 하는 방법 : join, synchronized
        for(int i=0; i<1000; i++){
//            if(LibraryMultiThread.book_total<=0){
//                break;
//            }
           Thread th = new Thread(new LibraryMultiThread());
            th.start();
//            th.join();
        }
        System.out.println("최종적으로 남아있는 책수량 " + LibraryMultiThread.book_total);
    }
}
