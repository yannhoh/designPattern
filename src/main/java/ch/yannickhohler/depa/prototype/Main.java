package ch.yannickhohler.depa.prototype;

import ch.yannickhohler.depa.prototype.example.copy.Company;
import ch.yannickhohler.depa.prototype.example.copy.Employee;
import ch.yannickhohler.depa.prototype.example.copy.PartTimeEmployee;

//import ch.yannickhohler.depa.prototype.example.clone.Company;
//import ch.yannickhohler.depa.prototype.example.clone.Employee;
//import ch.yannickhohler.depa.prototype.example.clone.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("hilde", 1999);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("richi", 1950, 55);
        Company company = new Company("companyName");
        company.addEmployee(employee);
        company.addEmployee(partTimeEmployee);

        var companyClone = company.clone();
        companyClone.addEmployee(new Employee("newGuy", 1989));

        System.out.println("Clone is same class: " + companyClone.getClass().equals(company.getClass()));
        System.out.println("Clone == Original: " + (companyClone == company));
        System.out.println("Original Company Size: " +  company.getSize());
        System.out.println("Cloned Company Size: " + companyClone.getSize());

    }
}
