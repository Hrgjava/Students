import java.util.Scanner;

public class Judge {
		public static void Judge(){
		String a;
		stus []stu=StusInfo.initArrays();
		do{
			System.out.println("��ӭʹ��TZLѧ������ϵͳ");
			System.out.println("________________________");
			System.out.println("1.��ʾ����ѧ����Ϣ");
			System.out.println("2.���ݱ�Ų�ѯѧ����Ϣ");
			System.out.println("3.���ݱ���޸�ѧ������");
			System.out.println("4.���������޸�ѧ���༶");
			System.out.println("5.���ݰ༶��ѯȫ��ѧ����Ϣ");
			System.out.println("________________________");
			System.out.println("��ѡ��[1/2/3/4/5]");
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num>5){
				System.out.println("______________________");
				System.out.println("��ѧ����Ϣ������");
				System.out.println("______________________");
			}
			switch (num) {	
			case 1:
				
				StusInfo.displayStus(stu);///
				break;
			case 2:
				System.out.println("��������Ҫ��ѯ��ѧ�����[1/2/3/4/5]");
				int num1=sc.nextInt();
				System.out.println("_____________________________");
				System.out.println(stu[num1-1].getId()+" "+stu[num1-1].getName()+" "+stu[num1-1].getAges()+" "+stu[num1-1].getSex()+" "+stu[num1-1].getCla());
				System.out.println("_____________________________");
				break;
			case 3:
				System.out.println("��������Ҫ�޸���Ϣ��ѧ�����[1/2/3/4/5]");
				
				int num2=sc.nextInt();
				System.out.println("_____________________________");
				System.out.println(stu[num2-1].getId()+" "+stu[num2-1].getName()+" "+stu[num2-1].getAges()+" "+stu[num2-1].getSex()+" "+stu[num2-1].getCla());
				System.out.println("_____________________________");
				
				System.out.println("��Ҫ�������޸�Ϊ��");
				stu[num2-1].setAges(sc.nextInt());
				System.out.println(stu[num2-1].getId()+" "+stu[num2-1].getName()+" "+stu[num2-1].getAges()+" "+stu[num2-1].getSex()+" "+stu[num2-1].getCla());
				break;
			case 4:
				int i;
				System.out.println("��������Ҫ�޸���Ϣ��ѧ�����֣�");
				String name=sc.next();
				for (i = 0; i < stu.length; i++) {
					if(stu[i].getName().equals(name)){
						System.out.print(stu[i].getId()+" "+stu[i].getName()+" "+stu[i].getAges()+" "+stu[i].getSex()+" "+stu[i].getCla());
					}
				}
				System.out.println("��Ҫ����ѧ���İ༶�޸�Ϊ��");
				stu[i].setCla(sc.nextInt());
				break;
				
			case 5:
				System.out.println("��������Ҫ���ҵİ༶[11301/11302]��");
				int clas=sc.nextInt();
				for (int j = 0; j < stu.length; j++) {
					if(stu[j].getCla()==clas){
						System.out.println(stu[j].getId()+" "+stu[j].getName()+" "+stu[j].getAges()+" "+stu[j].getSex()+" "+stu[j].getCla());	
					}
				}
				break;	
			}
			System.out.println("�����Ƿ����[y/n]");
			a=sc.next();		
		}while(a.equals("y"));	
			
		}
}

