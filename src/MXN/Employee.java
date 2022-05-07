package MXN;


import java.util.Objects;

public class Employee {
    private String name;
    private String familyName;
    private String patronymic;
    private int salary;
    private int department;
    private int id;

    public Employee(String name, String familyName, String patronymic, int salary, int department, int id) {
        this.name = name;
        this.familyName = familyName;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        this.id = id++;

    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(familyName, employee.familyName) && Objects.equals(patronymic, employee.patronymic);
    }


    public int hashCode() {
        return Objects.hash(name, familyName, patronymic, salary, department);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment() {
        this.department = department;
    }


    public String toString() {
        return
                "Full name: " + familyName + " " + name + " " + patronymic + "; " + "Monthly salary: " + getSalary() + "; " + "Number department: " + getDepartment() + ". " + "Number id: " + id;

    }

    public String list() {
        return
        "Full name list: " + familyName + " " + name + " " + patronymic + "; ";
    }
}
