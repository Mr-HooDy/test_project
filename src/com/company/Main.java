package com.company;

import com.company.entity.Admin;
import com.company.entity.User;

public class Main {
    public static void main(String[] args) {
        User vassol = new User("Vassol", "Petrov", 25);
        User igor = new User("Igor", "Ivanov", 35);

        Admin admin = new Admin();
        admin.makePersonAdmin(igor);
        admin.makePersonModerator(vassol);
    }
}
