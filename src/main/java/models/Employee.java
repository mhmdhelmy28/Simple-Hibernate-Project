package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "Id")
    private int Id;
    @Column(name = "salary")
    private int salary;
    @Column(name = "ssn")
    private int SSN;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private Date date;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_Id")
    private Car car;
    @Column(name = "phone_no")
    private int phone;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_skills",
    joinColumns = @JoinColumn(name = "employee_Id"),
    inverseJoinColumns = @JoinColumn(name = "skill_Id"))
    private Set<Skill> employeeSkills = new HashSet<>();
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_projects", joinColumns = @JoinColumn(name = "employee_Id"),
    inverseJoinColumns = @JoinColumn(name = "project_Id"))
    private Set<Project> employeeProjects = new HashSet<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_department", joinColumns = @JoinColumn(name = "employee_Id"),
    inverseJoinColumns = @JoinColumn(name = "department_Id"))
    private Department department;
    @ElementCollection
    @JoinTable(name = "employee_dependents")
    private Set<Dependent> employeeFamily = new HashSet<>();
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_contract_Id")
    private Contract employeeContract;
    @ElementCollection
    @JoinTable(name = "employee_address", joinColumns = @JoinColumn(name = "employee_Id"))
    private Set<Address> addressSet = new HashSet<Address>();

    public Contract getEmployeeContract() {
        return employeeContract;
    }

    public void setEmployeeContract(Contract employeeContract) {
        this.employeeContract = employeeContract;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return Id;
    }

    public int getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getSSN() {
        return SSN;
    }

    public String getName() {
        return name;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public Set<Project> getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(Set<Project> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }

    public Set<Dependent> getEmployeeFamily() {
        return employeeFamily;
    }

    public void setEmployeeFamily(Set<Dependent> employeeFamily) {
        this.employeeFamily = employeeFamily;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Skill> getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(Set<Skill> employeeSkills) {
        this.employeeSkills = employeeSkills;
    }
}
