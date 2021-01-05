package Chapter6;

import java.util.Scanner;


class BMICalculator {
    public static double calculateBMI(double weight, double tall) {
    	
    	double bmi = weight / (tall*tall);
    	
        return bmi;
    }
    public static void printBMIClassification(double bmi) {
    	
    	if(bmi>=30) {
    		System.out.println("Bmi는 : "+bmi);
    		System.out.println("비만 입니다.");
    	}else if(bmi>25) {
    		System.out.println("Bmi는 : "+bmi);
    		System.out.println("과체중 입니다.");
    	}else if(bmi>18.5) {
    		System.out.println("Bmi는 : "+bmi);
    		System.out.println("정상 입니다.");
    	}else if(bmi<18.5) {
    		System.out.println("Bmi는 : "+bmi);
    		System.out.println("저체중 입니다.");
    	}
    	
    }


public static class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요");
        double weight = input.nextDouble();
        System.out.println("신장을 입력하세요");
        double tall = input.nextDouble();
        double bmi = calculateBMI(weight, tall);
        printBMIClassification(bmi);
        

	}
}
}


