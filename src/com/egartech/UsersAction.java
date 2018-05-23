package com.egartech;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright 2018 LANIT group.
 * http://www.lanit.ru
 * Created by  Dmitriy Bykovets on 23.05.2018 10:33.
 */
public class UsersAction {

    public List<User> getJointUsers(List<User> l1, List<User> l2){
        List<User> jointUsers = new ArrayList<User>();
        for(User user : l1){
            if(l2.contains(user)){
                jointUsers.add(user);
            }
        }
        return jointUsers;
    }
}
