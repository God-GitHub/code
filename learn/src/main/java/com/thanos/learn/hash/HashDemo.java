package com.thanos.learn.hash;

public class HashDemo {

    public static void main(String[] args){
        User user = new User();
        user.setId(1);
        user.setName("Thanos");
        User u = new User();
        u.setId(1);
        u.setName("Thanos");
        if(u.equals(user)){
            System.out.println("u equals user");
        }
        System.out.println("user's hashCode"+user.hashCode());
        System.out.println("u's hashCode"+u.hashCode());
        User user1 = new User(3,"Thanos",28);

    }

}
