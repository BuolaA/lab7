package dataaccess;


import java.util.List;
import ca.sait.models.User;
import javax.persistence.*;

/**
 *
 * @author Alex Tompkins - 821984
 */
public class UserDB {
    public List<User> getAll() {
       EntityManagerFactory emFactory = DBUtil.getEmFactory();
       
       EntityManager emf = emFactory.createEntityManager();
       
       return emf.createNamedQuery("User.findAll", User.class).getResultList();
    }
}
