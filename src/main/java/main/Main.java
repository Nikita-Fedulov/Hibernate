package main;


import SkillBox.utils.HibernateSession;

public class Main {
    public static void main(String[] args) {
        HibernateSession.getSessionFactory();
        HibernateSession.shutdown();
    }
}
