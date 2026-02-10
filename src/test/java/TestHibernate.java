import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestHibernate {
    public static void main(String[] args) {
        try (Session session = Util.getSessionFactory().openSession()) {
            System.out.println("Hibernate работает)");

            Transaction transaction = session.beginTransaction();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка");
        } finally {
            Util.shutdown();
        }
    }
}
