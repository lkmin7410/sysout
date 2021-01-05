package Chapter6;

public class Ex_11 {
    public static void printSquare(int x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        printSquare("hello"); // Compile Error
        //printSquare가 받는값이 int라서 String형은 입력할 수 없음
        
        printSquare((int)5.5); // Compile Error
        //printSquare가 받는 값이 int라서 실수는 받을 수 없으니 정수르 형변환
    }
}