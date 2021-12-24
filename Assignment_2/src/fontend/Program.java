package fontend;

import java.util.Scanner;

import backend.Exercise1;
import backend.Exercise2;



public class Program {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			boolean x=true;
			while (x) {
			System.out.println("nhập Exercise muốn tìm!");
			System.out.println("1. Exercise 1");
			System.out.println("2. Exercise 2");
			int num = sc.nextInt();
			switch(num) {
			case 1:ex1();break;
			case 2:ex2();break;
			default: System.out.println("bạn nhập số không hợp lệ");
			return;
			}
		}
	}

		private static void ex2() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Exercise2 ex2 = new Exercise2();
			
			System.out.println("chọn question tương ứng");
			System.out.println("1. Question 1");
			int num = sc.nextInt();
			switch (num) {
			case 1: ex2.question1();break;
			case 2: ex2.question2();break;
			case 3: ex2.question3();break;
			case 4: ex2.question4();break;
			case 5: ex2.question5();break;
			default : System.out.println("mời bạn nhập lại");break;
			}
		}

		private static void ex1() {
			
			Scanner sc = new Scanner(System.in);
			Exercise1 ex1 = new Exercise1();
			
			System.out.println("chọn question tương ứng");
			System.out.println("1. Question 1");
			System.out.println("2. Question 2");
			System.out.println("3. Question 3");
			System.out.println("4. Question 4");
			System.out.println("5. Question 5");
			System.out.println("6. Question 6");
			System.out.println("7. Question 7");
			System.out.println("8. Question 8");
			System.out.println("9. Question 9");
			System.out.println("10. Question 10");
			System.out.println("11. Question 11");
			int num = sc.nextInt();
				switch (num) {
				case 1: ex1.question1();break;
				case 2: ex1.question2();break;
				case 3: ex1.question3();break;
				case 4: ex1.question4();break;
				case 5: ex1.question5();break;
				case 6: ex1.question6();break;
				case 7: ex1.question7();break;
				case 8: ex1.question8();break;
				case 9: ex1.question9();break;
				case 10: ex1.question10();break;
				case 11: ex1.question11();break;
				case 12: ex1.question12();break;
				case 13: ex1.question13();break;
				case 14: ex1.question14();break;
				case 15: ex1.question15();break;
				default : System.out.println("mời bạn nhập lại");break;
			}
		}
	}
