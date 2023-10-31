package Assignment;

import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary: ");
		float basicSalary = sc.nextFloat();
		float HRA,DA;
		if(basicSalary>=1 && basicSalary<=4000) {
			HRA = 0.10f*basicSalary;
			DA = 0.50f*basicSalary;
		}
		else if(basicSalary>=4001 && basicSalary<=8000) {
			HRA = 0.20f*basicSalary;
			DA = 0.60f*basicSalary;
		}
		else if(basicSalary>=8001 && basicSalary<=12000) {
			HRA = 0.25f*basicSalary;
			DA = 0.70f*basicSalary;
		}
		else{
			HRA = 0.30f*basicSalary;
			DA = 0.80f*basicSalary;
		}
		
		
		float grossSalary= basicSalary+HRA+DA;
		
		System.out.println("Basic Salary is: " + basicSalary);
		System.out.println("HRA is: "+ HRA);
		System.out.println("DA is: " + DA);
		System.out.println("Gross Salary of the Employee is: " + grossSalary);
		
		sc.close();

	}

}
