package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {
    @Id
    @Column(name = "project_Id")
    private int projectNo;
    @Column(name = "project_name")
    private String projectName;
    @ManyToMany(mappedBy = "employeeProjects")
    private Set<Employee> projectEmployeeSet = new HashSet<>();

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public Set<Employee> getProjectEmployeeSet() {
        return projectEmployeeSet;
    }

    public void setProjectEmployeeSet(Set<Employee> projectEmployeeSet) {
        this.projectEmployeeSet = projectEmployeeSet;
    }
}
