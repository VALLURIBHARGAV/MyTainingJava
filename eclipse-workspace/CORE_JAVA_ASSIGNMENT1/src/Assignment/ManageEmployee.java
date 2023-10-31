package Assignment;

import java.util.*;

public class ManageEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Basic Salary: ");
            float basicSalary = sc.nextFloat();

            System.out.print("HRA: ");
            float hra = sc.nextFloat();

            System.out.print("DA: ");
            float da = sc.nextFloat();

            System.out.print("Special Allowance: ");
            float specialAllowance = sc.nextFloat();

            if (specialAllowance == 0) {
                employees[i] = new Employee(name, age, basicSalary, hra, da);
            } else {
                employees[i] = new Employee(name, age, basicSalary, hra, da, specialAllowance);
            }

            employees[i].calculateGrossSalary(basicSalary, hra, da, specialAllowance);

            sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("\nDetails for Employee " + (i + 1));
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Age: " + employees[i].getAge());
            System.out.println("Basic Salary: " + employees[i].getBasicSalary());
            System.out.println("HRA: " + employees[i].getHra());
            System.out.println("DA: " + employees[i].getDa());
            System.out.println("Special Allowance: " + employees[i].getSpecialAllowance());
            System.out.println("Gross Salary: " + employees[i].getGrossSalary());
        }
        sc.close();

	}

}
