package jfx.baseForm;

public class Employee implements Comparable<Employee> {
    private String name;
    private String secondName;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int compareSalary = o.getSecondName().length();
        return compareSalary - this.secondName.length();
    }
}

