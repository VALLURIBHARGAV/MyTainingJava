package Assignment;

class Employee {
	private String name;
	private int age;
	private float basicSalary;
	private float hra;
	private float da;
	private float specialAllowance;
	private float grossSalary;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public float getHra() {
		return hra;
	}

	public float getDa() {
		return da;
	}

	public float getSpecialAllowance() {
		return specialAllowance;
	}

	public float getGrossSalary() {
		return grossSalary;
	}

	public Employee(String name, int age, float basicSalary, float hra, float da, float specialAllowance
			) {
		super();
		this.name = name;
		this.age = age;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.specialAllowance = specialAllowance;
	}
	
	public Employee(String name, int age, float basicSalary, float hra, float da
			) {
		this.name = name;
		this.age = age;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.specialAllowance = 0;
		
	}

	public void calculateGrossSalary(float basicSalary, float hra, float da, float specialAllowance) {
		this.grossSalary = basicSalary + hra + da + specialAllowance;
	}

	public void calculateGrossSalary(float basicSalary, float hra, float da) {
		calculateGrossSalary(basicSalary, hra, da, 0);
	}

}
