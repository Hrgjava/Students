
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
		s1.setName("����");
		s1.setSex('��');
		
		stus s2=new stus();
		s2.setAges(21);
		s2.setCla(11302);
		s2.setId(2);
		s2.setName("����");
		s2.setSex('��');
		
		stus s3=new stus();
		s3.setAges(20);
		s3.setCla(11301);
		s3.setId(3);
		s3.setName("����");
		s3.setSex('��');
		
		stus s4=new stus();
		s4.setAges(19);
		s4.setCla(11301);
		s4.setId(4);
		s4.setName("����");
		s4.setSex('��');
		
		stus s5=new stus();
		s5.setAges(18);
		s5.setCla(11301);
		s5.setId(5);
		s5.setName("����");
		s5.setSex('��');
		
		stu [0]=s1;
		stu [1]=s2;
		stu [2]=s3;
		stu [3]=s4;
		stu [4]=s5;
		return stu;
	}
}
