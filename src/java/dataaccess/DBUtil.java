package dataaccess;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;


public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("Lab6PU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
