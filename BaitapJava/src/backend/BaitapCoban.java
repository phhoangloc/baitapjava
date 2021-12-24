package backend;

import java.util.Scanner;

public class BaitapCoban {
	Scanner sc = new Scanner(System.in);
	
	public void question() {
		while(true) {
		System.out.println("chọn bài tập để chương trình chạy");
		int inputnumber=sc.nextInt();
		switch (inputnumber) {
		case 1: conghaisotrongjava();break;
		case 2: kiemtrachanle();break;
		case 3: nhanhaiso();break;
		default: System.err.println("kết thúc chương trình!");
			}
		}
	}

	private void nhanhaiso() {
		// TODO Auto-generated method stub
		System.out.println("nhập số thứ nhất:");
		Float number1= sc.nextFloat();
		System.out.println("nhập số thứ hai:");
		Float number2= sc.nextFloat();
		float c=number1*number2;
		System.out.println(c);
	}

	private void kiemtrachanle() {
		System.out.println("nhập số cần kiểm tra:");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("số " + number + "chia hết cho 2");
			}
		else {
			System.out.println("số " + number + " không chia hết cho 2");
		}
	}

	private void conghaisotrongjava() {
		// TODO Auto-generated method stub
		System.out.println("nhập số thứ nhất:");
		Float number1= sc.nextFloat();
		System.out.println("nhập số thứ hai:");
		Float number2= sc.nextFloat();
		float c=number1+number2;
		System.out.println(c);
	}
}
