
public class StusInfo {
	
	public static void displayStus(stus[] stu){
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].getId()+" "+stu[i].getName()+" "+stu[i].getAges()+" "+stu[i].getSex()+" "+stu[i].getCla());
			System.out.println();
		}
	}
	
	public static stus[] initArrays(){

		stus [] stu=new stus[5];
		stus s1=new stus();
		s1.setAges(20);
		s1.setCla(11301);
		s1.setId(1);
		s1.setName("张三");
		s1.setSex('男');
		
		stus s2=new stus();
		s2.setAges(21);
		s2.setCla(11302);
		s2.setId(2);
		s2.setName("李四");
		s2.setSex('男');
		
		stus s3=new stus();
		s3.setAges(20);
		s3.setCla(11301);
		s3.setId(3);
		s3.setName("王五");
		s3.setSex('男');
		
		stus s4=new stus();
		s4.setAges(19);
		s4.setCla(11301);
		s4.setId(4);
		s4.setName("麻六");
		s4.setSex('男');
		
		stus s5=new stus();
		s5.setAges(18);
		s5.setCla(11301);
		s5.setId(5);
		s5.setName("赵七");
		s5.setSex('男');
		
		stu [0]=s1;
		stu [1]=s2;
		stu [2]=s3;
		stu [3]=s4;
		stu [4]=s5;
		return stu;
	}
}
