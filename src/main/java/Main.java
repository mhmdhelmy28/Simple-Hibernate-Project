import models.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Skill skill1 = new Skill();
        skill1.setSkillId(3);
        skill1.setSkillName("Kind");
        Skill skill2 = new Skill();
        skill2.setSkillId(4);
        skill2.setSkillName("Extrovert");
        Dependent dependent = new Dependent();
        dependent.setRelation("Cousin");
        dependent.setName("Sami");
        Dependent dependent1 = new Dependent();
        dependent1.setName("Ibra");
        dependent1.setRelation("Uncle");
        Project project1 = new Project();
        project1.setProjectName("Third Project");
        project1.setProjectNo(3);
        Project project2 =new Project();
        project2.setProjectNo(4);
        project2.setProjectName("Fourth Project");
        Department department =new Department();
        department.setDepartmentName("Educational");
        department.setLocation("Main Branch");
        department.setDepartmentNo(2);
        Contract contract1 =new Contract();
        contract1.setContractId(3);
        contract1.setContractType("Parmanent");
        contract1.setStartDate(new Date());
        Contract contract2 =new Contract();
        contract2.setContractId(4);
        contract2.setContractType("Contract");
        contract2.setStartDate(new Date());
        Address address1 = new Address();
        address1.setStreet("Main");
        address1.setZone("Mansoura");
        Address address2 = new Address();
        address2.setZone("Egypt");
        address2.setStreet("Cairo");
        Car car = new Car();
        car.setPlateNo(303);
        car.setModel(2020);
        car.setColor("Blue");
        Employee employee2 = new Employee();
        employee2.setCar(car);
        employee2.setDepartment(department);
        employee2.getEmployeeProjects().add(project1);
        employee2.setSalary(200);
        employee2.setSSN(123456);
        employee2.setPhone(12456789);
        employee2.setId(2);
        employee2.setName("Ahmed");
        employee2.getAddressSet().add(address1);
        employee2.getAddressSet().add(address2);
        employee2.getEmployeeSkills().add(skill1);
        employee2.getEmployeeSkills().add(skill2);
        employee2.getEmployeeFamily().add(dependent);
        employee2.getEmployeeFamily().add(dependent1);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee2);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
