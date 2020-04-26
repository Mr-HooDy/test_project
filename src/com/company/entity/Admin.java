package com.company.entity;

/**
 * @author RapDog
 * @version 1.0
 * @created by 4/24/2020
 */
public class Admin {

    public void makePersonModerator(User user) {
        System.out.println("Making " + user.getName() + " as moderator" );
    }

    public void makePersonAdmin(User user) {
        System.out.println("Making " + user.getName() + " as admin");
    }

    public void makePersonUser(User user) {
        System.out.println("Making " + user.getName() + " as user");
    }

    public void makePersonAdvanced(User user) {
        System.out.println("Making " + user.getName() + " as advanced user");
    }
}
