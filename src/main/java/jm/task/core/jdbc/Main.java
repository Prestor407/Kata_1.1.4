package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Sanya", "Borivos", (byte) 24);
        userService.saveUser("Sasha", "Borivos", (byte) 24);
        userService.saveUser("Sanyok", "Borivos", (byte) 24);
        userService.saveUser("Sanchez", "Borivos", (byte) 24);
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
