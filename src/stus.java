
public class stus {
	private int id;
	private String name;
	private char sex;
	private int cla;
	private int ages;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getCla() {
		return cla;
	}

	public void setCla(int cla) {
		this.cla = cla;
	}

	public int getAges() {
		return ages;
	}

	public void setAges(int ages) {
		this.ages = ages;
	}

	public stus(int id, String name, char sex, int cla, int ages) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.cla = cla;
		this.ages = ages;
	}

	public stus() {
		super();
	}	
}
