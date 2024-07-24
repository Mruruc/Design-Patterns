package com.mruruc.model;

import java.time.LocalDate;

public class User {
    private final Long userId;
    private String username;
    private String fullName;
    private LocalDate dateOfBirth;
    private Gender gender;

    public User(Long userId, String username, String fullName, LocalDate dateOfBirth, Gender gender) {
        this.userId = userId;
        this.username = username;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private Long userId;
        private String username;
        private String fullName;
        private LocalDate dateOfBirth;
        private Gender gender;

        public UserBuilder() {}

        public UserBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public UserBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public UserBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(userId, username, fullName, dateOfBirth, gender);
        }
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender + '}';
    }
}






