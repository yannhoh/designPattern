package ch.yannickhohler.depa.prototype.example.copy;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private final List<Employee> employees;

	public Company(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}

	protected Company(Company c) {
		this.name = c.name;
		// shallow copy:
		// this.employees = c.employees;

		// deep copy
		// this.employees = new ArrayList<>(c.employees);

		// really deep copy
		this.employees = new ArrayList<>();
		for (Employee e : c.employees) {
			this.employees.add(e.clone()); // Correct: clone is called on the dynamic type!
		}

        // or better:
		// this.employees = c.employees.stream().map(Employee::clone).collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getSize() {
		return employees.size();
	}

	public void addEmployee(Employee p) {
		this.employees.add(p);
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o.getClass() == this.getClass()) {
			Company c = (Company) o;
			return name.equals(c.name) && employees.equals(c.employees);
		} else {
			return false;
		}
	}

	@Override
	public Company clone() {
		return new Company(this);
	}
}
