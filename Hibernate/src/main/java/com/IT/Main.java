package com.IT;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration con = new Configuration();

        
        con.setProperty("hibernate.connection.driver_class",
                "com.mysql.cj.jdbc.Driver");

       
        con.setProperty("hibernate.connection.url",
                "jdbc:mysql://db01.dbhost.dev:5051/db_455a7w8h7");

       
        con.setProperty("hibernate.connection.username",
                "user_455a7w8h7");

       
        con.setProperty("hibernate.connection.password",
                "p455a7w8h7");

      
        con.setProperty("hibernate.hbm2ddl.auto", "update");
        con.setProperty("hibernate.show_sql", "true");

       
        con.addAnnotatedClass(Student.class);

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();

  

        session.beginTransaction();

        session.persist(new Student(
                6,
                "Ramesh",
                "ramesh@gmail.com",
                "Information Technology"
        ));

        session.persist(new Student(
                7,
                "Meena",
                "meena@gmail.com",
                "Computer Science"
        ));

        session.persist(new Student(
                8,
                "Ajay",
                "ajay@gmail.com",
                "Data Science"
        ));

        session.persist(new Student(
                9,
                "Priya",
                "priya@gmail.com",
                "Cyber Security"
        ));

        session.persist(new Student(
                10,
                "Sathish",
                "sathish@gmail.com",
                "Artificial Intelligence"
        ));

        session.getTransaction().commit();

        System.out.println("5 Students inserted successfully!");
    }
}