package Chapter6;

public class Ex_12 {
    public static void printSquare(double x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        printSquare(3);
        //입력한 값은 정수 3 이지만 printSquare에서 실수로 자동 형변환
	}

}
