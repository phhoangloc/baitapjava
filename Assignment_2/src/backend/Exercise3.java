package backend;

import entity.Account;
import entity.Department;
import entity.EnumPosition;
import entity.Group;
import entity.GroupAccount;
import entity.Position;

public class Exercise3 {
	
	Department dp1 = new Department((byte) 1,"bảo vệ");
	Department dp2 = new Department((byte) 2,"hành chính");
	Department dp3 = new Department((byte) 3,"kế toán");

	Position ps1 = new Position((byte) 1,EnumPosition.Dev);
	Position ps2 = new Position((byte) 2,EnumPosition.Test);
	Position ps3 = new Position((byte) 3,EnumPosition.Scrum_Master);
	Position ps4 = new Position((byte) 4,EnumPosition.Pm);

	Account acc1 = new Account((byte) 1, "a@gmail.com", "a", "nguyễn văn a",dp1,ps1, "2021/12/21");
	Account acc2 = new Account((byte) 2, "b@gmail.com", "b", "nguyễn văn b", null, null , "2021/12/21");
	Account acc3 = new Account((byte) 3, "c@gmail.com", "c", "nguyễn văn c",dp1,ps1, "2021/12/21");
	Account acc4 = new Account((byte) 4, "d@gmail.com", "d", "nguyễn văn d",dp1,ps1, "2021/12/21");
	
	Account[] acc = new Account[] {acc1,acc2,acc4};
	
	Group gr1 = new Group((byte) 1, "xa hoi", acc4, "2021/12/20");
	Group gr2 = new Group((byte) 2, "chinh tri", acc4, "2021/12/20");
	Group gr3 = new Group((byte) 3, "game", acc4, "2021/12/20");
	
	Group [] group = new Group[] {gr1,gr2,gr3};
	
	GroupAccount ga1= new GroupAccount(gr3, acc1, "2021/12/19");
	GroupAccount ga2= new GroupAccount(gr2, acc1, "2021/12/19");
	GroupAccount ga3= new GroupAccount(gr1, acc1, "2021/12/19");
	GroupAccount ga4= new GroupAccount(gr2, acc2, "2021/12/19");
	
	

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

}
