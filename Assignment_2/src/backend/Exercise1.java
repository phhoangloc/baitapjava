package backend;

import entity.Account;
import entity.Department;
import entity.EnumPosition;
import entity.Group;
import entity.GroupAccount;
import entity.Position;

public class Exercise1 {
	
	Department dp1 = new Department((byte) 1,"bảo vệ");
	Department dp2 = new Department((byte) 2,"hành chính");
	Department dp3 = new Department((byte) 3,"kế toán");
	Department[] dps = new Department[]{ dp1,dp2,dp3};
	
	Position ps1 = new Position((byte) 1,EnumPosition.Dev);
	Position ps2 = new Position((byte) 2,EnumPosition.Test);
	Position ps3 = new Position((byte) 3,EnumPosition.Scrum_Master);
	Position ps4 = new Position((byte) 4,EnumPosition.Pm);

	Account acc1 = new Account((byte) 1, "a@gmail.com", "a", "nguyễn văn a",dp1,ps1, "2021/12/21");
	Account acc2 = new Account((byte) 2, "b@gmail.com", "b", "nguyễn văn b", dp1, ps1 , "2021/12/21");
	Account acc3 = new Account((byte) 3, "c@gmail.com", "c", "nguyễn văn c",dp1,ps1, "2021/12/21");
	Account acc4 = new Account((byte) 4, "d@gmail.com", "d", "nguyễn văn d",dp1,ps1, "2021/12/21");
	
	Account[] acc = new Account[] {acc1,acc2,acc3,acc4};
	
	Group gr1 = new Group((byte) 1, "xa hoi", acc4, "2021/12/20");
	Group gr2 = new Group((byte) 2, "chinh tri", acc4, "2021/12/20");
	Group gr3 = new Group((byte) 3, "game", acc4, "2021/12/20");
	
	Group [] group = new Group[] {gr1,gr2,gr3};
	
	GroupAccount ga1= new GroupAccount(gr3, acc1, "2021/12/19");
	GroupAccount ga2= new GroupAccount(gr2, acc1, "2021/12/19");
	GroupAccount ga3= new GroupAccount(gr1, acc1, "2021/12/19");
	GroupAccount ga4= new GroupAccount(gr2, acc2, "2021/12/19");
	
	

	public void question1() {
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text 
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
		if(acc2.getDerpartment()==null) {
			System.out.println("nhân viên này chưa có phòng ban");
		}else {
			System.out.println("nhân viên có phòng ban là: " + acc2.getDerpartment());
		}
	}

	public void question2() {
		// TODO Auto-generated method stub
		acc2.setGroup(group);
		if(acc2.getGroup()==null) {
			System.out.println("Nhân viên này chưa có group");
			}
			else {
				int grlength=acc2.getGroup().length;
				if(grlength==1 && grlength==2) {
					System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				};if(grlength==3 ){
					System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				};if(grlength==4 ) {
					System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
	}

	public void question3() {
		// TODO Auto-generated method stub
		System.out.println(acc2.getDerpartment()==null? "nhân viên này chưa có phòng ban":"nhân viên này thuộc phòng ban: "+acc2.getDerpartment());
	}

	public void question4() {
		// TODO Auto-generated method stub
		if(acc2.getPosition()!=null) {
			if(acc2.getPosition().getPositionName()== EnumPosition.Dev) {
				System.out.println("Đây là Developer");
			}
			else {
				System.out.println("Người này không phải là Developer");
			}
		}else {
			System.out.println("người này không có chức vụ gì!");
		}
	}
	public void question5() {
		gr1.setAccount(acc);
		int acclength = gr1.getAccount().length;
		if(acclength!=0) {
			switch (acclength) {
			case 1 : System.out.println("Nhóm có một thành viên");
			case 2 : System.out.println("Nhóm có hai thành viên");
			case 3 : System.out.println("Nhóm có ba thành viên");
			default : System.out.println("Nhóm có nhiều thành viên");
			}
		}else {
			System.out.println("nhóm không có thành viên nào.");
		}
	}

	public void question6() {
		acc2.setGroup(group);
		if(acc2.getGroup()==null) {
			System.out.println("Nhân viên này chưa có group");
			}
			else {
				int grlength=acc2.getGroup().length;
				switch (grlength) {
					case 1:
						System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
					case 2:
						System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
					case 3:
						System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
					case 4:
						System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
	}

	public void question7() {
		if(acc2.getPosition()!=null){
			 int postionnumber = acc2.getPosition().getPositionId();
			switch(postionnumber) {
			case 1: System.out.println("Đây là Developer");
			default: System.out.println("Đây không phải là Developer");
			}
		}else {
			System.out.println("người này không có chức vụ gì!");
		}
	}

	public void question8() {
		// TODO Auto-generated method stub
		if(acc.length!=0){
			for(Account accs:acc){
				System.out.println(accs.getFullName()+" "+accs.getEmail()+" "+accs.getPosition().getPositionName());
				}
			}
		}

	public void question9() {
		// TODO Auto-generated method stub
			if(dps!=null){
				for(Department dpss:dps) {
					System.out.println(dpss.getDepartmentId()+" "+ dpss.getDepartmentName());
				}
		}
	}

	public void question10() {
		// TODO Auto-generated method stub
		for(int i=0;i<acc.length;i++) {
			System.out.println("thông tin account thứ "+(i+1)+"là: ");
			System.out.println("email "+acc[i].getEmail());
			System.out.println("fullname "+acc[i].getFullName());
			System.out.println("phòng ban "+acc[i].getDerpartment().getDepartmentName());
		}
	}

	public void question11() {
		// TODO Auto-generated method stub
		for(int i=0;i<dps.length;i++) {
			System.out.println("thông tin account thứ "+(i+1)+"là: ");
			System.out.println("Id "+dps[i].getDepartmentId());
			System.out.println("fullname "+dps[i].getDepartmentName());
		}
	}

	public void question12() {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			System.out.println("thông tin account thứ "+(i+1)+"là: ");
			System.out.println("email "+acc[i].getEmail());
			System.out.println("fullname "+acc[i].getFullName());
			System.out.println("phòng ban "+acc[i].getDerpartment().getDepartmentName());
		}
	}

	public void question13() {
		// TODO Auto-generated method stub
		for(int i=0;i<acc.length;i++) {
			if(i==1) {i=2;}
			System.out.println("thông tin account thứ "+(i+1)+"là: ");
			System.out.println("Id "+acc[i].getAccountId());
			System.out.println("fullname "+acc[i].getFullName());
		}
	}
	public void question14() {
		// TODO Auto-generated method stub
		for(int i=0;i<acc.length;i++) {
			if(acc[i].getAccountId()<=4) {
			System.out.println("thông tin account thứ "+(i+1)+"là: ");
			System.out.println("Id "+acc[i].getAccountId());
			System.out.println("fullname "+acc[i].getFullName());
			}
		}
	}

	public void question15() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
