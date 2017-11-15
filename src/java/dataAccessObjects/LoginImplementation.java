package dataAccessObjects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoginImplementation implements LoginInterface {

    private static SessionFactory factory;

    public static void setSessionFactory(SessionFactory factory) {
        LoginImplementation.factory = factory;
    }

    // Not done yet. Still working on it...
    @Override
    public void login(String username, String password) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }

            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}