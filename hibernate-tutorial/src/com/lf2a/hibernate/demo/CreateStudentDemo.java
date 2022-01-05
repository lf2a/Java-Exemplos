package com.lf2a.hibernate.demo;

import com.lf2a.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        // criando session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // criando session
        Session session = factory.getCurrentSession();

        try {
            // criando um objeto Student
            Student tempStudent = new Student("Luiz", "Filipy", "luizfilipy014@gmail.com");

            // iniciando uma transação
            session.beginTransaction();

            // salvando o objeto Student
            session.save(tempStudent);

            // comitando a transação
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
