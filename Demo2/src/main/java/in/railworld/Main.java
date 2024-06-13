package in.railworld;

import in.railworld.Model.User;
import in.railworld.OneToMany.Department;
import in.railworld.OneToMany.Employee;
import in.railworld.OneToOne.Passport;
import in.railworld.OneToOne.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager em = emf.createEntityManager();

//        User user = new User();
//
//        user.setName("pralekh");
//        user.setEmail("pralekh@example.com");
//
//        em.getTransaction().begin();
//        em.persist(user);
//        em.getTransaction().commit();

//        User foundUser = em.find(User.class, user.getId());
//        System.out.println("User found: " + foundUser.getName()+" " +foundUser.getId());
//
//        em.getTransaction().begin();
//        foundUser.setName("John Smith");
//        em.getTransaction().commit();
//        System.out.println("Updated User Name: " + foundUser.getName());

//        // Delete User
//        em.getTransaction().begin();
//        em.remove(foundUser);
//        em.getTransaction().commit();
//        System.out.println("User deleted.");

//        one to one

//        Person person=new Person();
//        Person person1=new Person();
//        Passport passport=new Passport();
//        Passport passport1=new Passport();
//
//        person1.setName("hi");
//        person.setName("hello");
//        passport.setPassportNumber("456723");
//        passport1.setPassportNumber("gjhgjhgjh");
//        person.setPassport(passport);
//        person1.setPassport(passport1);
//
//
//        passport.setPerson(person);
//        passport1.setPerson(person1);
//
//        em.getTransaction().begin();
//        em.persist(person);
//        em.persist(person1);
////        em.persist(passport);
////        em.persist(passport1);
//        em.getTransaction().commit();
//        em.close();
//        emf.close();


//        one to many and many to one

        Department department = new Department();
        department.setName("HR");

        Employee emp1 = new Employee();
        emp1.setName("John Doe");
        emp1.setDepartment(department);

        Employee emp2 = new Employee();
        emp2.setName("Jane Smith");
        emp2.setDepartment(department);

        department.setEmployees(Arrays.asList(emp1, emp2));
        em.getTransaction().begin();
        em.persist(department);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}