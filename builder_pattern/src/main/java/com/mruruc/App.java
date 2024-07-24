package com.mruruc;


import com.mruruc.model.Gender;
import com.mruruc.model.User;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        User.UserBuilder builder = new User.UserBuilder();
        builder
                .userId(256482L)
                .username("john@doe")
                .fullName("John Doe")
                .dateOfBirth(LocalDate.now())
                .gender(Gender.MAEL)
                .build();

        User user2 = User.builder()
                .userId(5658L)
                .username("jane@doe")
                .dateOfBirth(LocalDate.now())
                .build();

        System.out.println(user2);
        System.out.println(builder.toString());
    }
}
