package school;

public class School {
	
	private int staff_id;
	private String name;
	private String position;
	private int age; 
	private int years_teaching;
	private int salary;
	
	public School() {
		super();
	}

	public School(int staff_id, String name, String position, int age, int years_teaching, int salary) {
		super();
		this.staff_id = staff_id;
		this.name = name;
		this.position = position;
		this.age = age;
		this.years_teaching = years_teaching;
		this.salary = salary;
	}

	public School(String name, String position, int age, int years_teaching, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.age = age;
		this.years_teaching = years_teaching;
		this.salary = salary;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYears_teaching() {
		return years_teaching;
	}

	public void setYears_teaching(int years_teaching) {
		this.years_teaching = years_teaching;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	

}
