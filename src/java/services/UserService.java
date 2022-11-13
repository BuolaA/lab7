/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;

/**
 *
 * @author BTran
 */
public class UserService {
    public List<ca.sait.models.User> getAll() throws Exception {
        UserDB userDb = new UserDB();
        
        List<ca.sait.models.User> users = userDb.getAll();
        
        return users;
    }
}






