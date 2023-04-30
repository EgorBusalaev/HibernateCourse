package com.example;


import com.example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EmployeesTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        // configuration.addAnnotatedClass(Employee.class);
        configuration.configure();

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession()) {

            session.beginTransaction();
            Employee employee = new Employee(1,"Egor", "Busalaev", "It", 500);
            session.save(employee);
            session.getTransaction().commit();
           // System.out.println("++++++++++++++++++++++++++++++++++++");
        }

    }
}