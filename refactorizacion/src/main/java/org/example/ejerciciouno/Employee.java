package org.example.ejerciciouno;

public class Employee {//clase empleado
    String name;
    Department department;

    public Employee(String name, Department department) {//constructor
        this.name = name;
        this.department = department;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
