package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import models.Role;
/**
 *
 * @author Alex Tompkins - 821984
 */
public class RoleDB {
    public List<Role> getAll() throws Exception {
     EntityManagerFactory emFactory = DBUtil.getEmFactory();
       
       EntityManager emf = emFactory.createEntityManager();
       
       return emf.createNamedQuery("Role.findAll", Role.class).getResultList();
    }
}
