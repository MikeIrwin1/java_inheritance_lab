package management;

import staff.Employee;

public class Manager  extends Employee {

    private String dept;

    public Manager(String name, String niNumber, int salary, String deptName) {
        super(name, niNumber, salary);
        this.dept = deptName;
    }

    public String getDept() {
        return dept;
    }
}
