package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Skill {
    @Id
    @Column(name = "skill_Id")
    private int skillId;
    @Column(name = "skill_name")
    private String skillName;
    @ManyToMany(mappedBy = "employeeSkills")
    private Set<Employee> employeesHavingThisSkill = new HashSet<>();

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public Set<Employee> getEmployeesHavingThisSkill() {
        return employeesHavingThisSkill;
    }

    public void setEmployeesHavingThisSkill(Set<Employee> employeesHavingThisSkill) {
        this.employeesHavingThisSkill = employeesHavingThisSkill;
    }
}
