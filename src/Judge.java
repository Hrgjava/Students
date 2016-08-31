import java.util.Scanner;

public class Judge {
		public static void Judge(){
		String a;
		stus []stu=StusInfo.initArrays();
		do{
			System.out.println("欢迎使用TZL学生管理系统");
			System.out.println("________________________");
			System.out.println("1.显示所有学生信息");
			System.out.println("2.根据编号查询学生信息");
			System.out.println("3.根据编号修改学生年龄");
			System.out.println("4.根据姓名修改学生班级");
			System.out.println("5.根据班级查询全部学生信息");
			System.out.println("________________________");
			System.out.println("请选择[1/2/3/4/5]");
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num>5){
				System.out.println("______________________");
				System.out.println("该学生信息不存在");
				System.out.println("______________________");
			}
			switch (num) {	
			case 1:
				
				StusInfo.displayStus(stu);///
				break;
			case 2:
				System.out.println("请输入你要查询的学生编号[1/2/3/4/5]");
				int num1=sc.nextInt();
				System.out.println("_____________________________");
				System.out.println(stu[num1-1].getId()+" "+stu[num1-1].getName()+" "+stu[num1-1].getAges()+" "+stu[num1-1].getSex()+" "+stu[num1-1].getCla());
				System.out.println("_____________________________");
				break;
			case 3:
				System.out.println("请输入你要修改信息的学生编号[1/2/3/4/5]");
				
				int num2=sc.nextInt();
				System.out.println("_____________________________");
				System.out.println(stu[num2-1].getId()+" "+stu[num2-1].getName()+" "+stu[num2-1].getAges()+" "+stu[num2-1].getSex()+" "+stu[num2-1].getCla());
				System.out.println("_____________________________");
				
				System.out.println("你要将年龄修改为：");
				stu[num2-1].setAges(sc.nextInt());
				System.out.println(stu[num2-1].getId()+" "+stu[num2-1].getName()+" "+stu[num2-1].getAges()+" "+stu[num2-1].getSex()+" "+stu[num2-1].getCla());
				break;
			case 4:
				int i;
				System.out.println("请输入你要修改信息的学生名字：");
				String name=sc.next();
				for (i = 0; i < stu.length; i++) {
					if(stu[i].getName().equals(name)){
						System.out.print(stu[i].getId()+" "+stu[i].getName()+" "+stu[i].getAges()+" "+stu[i].getSex()+" "+stu[i].getCla());
					}
				}
				System.out.println("你要将该学生的班级修改为：");
				stu[i].setCla(sc.nextInt());
				break;
				
			case 5:
				System.out.println("请输入你要查找的班级[11301/11302]：");
				int clas=sc.nextInt();
				for (int j = 0; j < stu.length; j++) {
					if(stu[j].getCla()==clas){
						System.out.println(stu[j].getId()+" "+stu[j].getName()+" "+stu[j].getAges()+" "+stu[j].getSex()+" "+stu[j].getCla());	
					}
				}
				break;	
			}
			System.out.println("请问是否继续[y/n]");
			a=sc.next();		
		}while(a.equals("y"));	
			
		}
}

