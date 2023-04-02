package Thread;

public class LibraryMultiThread implements Runnable{
    static int book_total = 100;
    @Override
    public synchronized void run() {
//            System.out.println("대출완료");
//            book_total -= 1;
//            System.out.println("현재 남아있는 책수량 " + book_total);

        borrowBooks();
    }
    public static void borrowBooks(){
        if(book_total<=0){
            return;
        }
        System.out.println("대출완료");
        book_total -= 1;
        System.out.println("현재 남아있는 책수량 " + book_total);
    }
}
