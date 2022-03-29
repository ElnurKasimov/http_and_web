package com.http;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class TaskOne {

    public static User initializeMyUser() {
        Address address = new Address();
        Geo geo = new Geo();
        Company company = new Company();
        User myUser = new User();

        geo.setLat("48.526090");
        geo.setLng("34.957614");

        address.setStreet("Belgradska");
        address.setSuite("Suite 12");
        address.setCity("Dnepr");
        address.setZipcode("49082");
        address.setGeo(geo);

        company.setName("Best choice");
        company.setCatchPhrase("Synchronised bottom-line interface");
        company.setBs("e-enable innovative applications");

        myUser.setId(0);
        myUser.setName("Elnur Kasimov");
        myUser.setUsername("Elnur_Dnepr");
        myUser.setEmail("myEmail@gmail.com");
        myUser.setAddress(address);

        myUser.setPhone("056-67-24-765");
        myUser.setWebsite("mywebsite.com.ua");
        myUser.setCompany(company);

        return myUser;
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        // Homework Task 1 part 1
        User myUser = initializeMyUser();
        HttpUtillities.createNewObject("/users", myUser);

        // Homework Task 1 part 2
        myUser.setPhone("123-45-67-890");
        HttpUtillities.updateObject ("/users/1", myUser);

        // Homework Task 1 part 3
        System.out.println("---------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id юзера, которого надо удалить  (от 1 до 10): ");
        int id = sc.nextInt();
        User userForDeleting = HttpUtillities.getInformationByID("/users" , id);
        System.out.println("Статус операции удаления - " + HttpUtillities.deleteObject("/users/" + id, userForDeleting));

        // Homework Task 1 part 4
        System.out.println("---------------------------------------------------------------------");
        List<User> users = HttpUtillities.getInformationAboutAllUsers("/users");
        System.out.println("Информация о всех пользователях : ");
        for (User user : users) {
            System.out.println(user);
        }

        // Homework Task 1 part 5
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Ведите id интересуемого Вас объекта (от 1 до 10): ");
        id = sc.nextInt();
        User userByID = HttpUtillities.getInformationByID("/users", id);
        System.out.println("Информация о пользователе с id " + id +  ": \n" + userByID);

        // Homework Task 1 part 6
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Ведите username интересуемого Вас объекта : ");
        String username = sc.nextLine();
        username = sc.nextLine();
        sc.close();
        User userByUsername = HttpUtillities.getInformationByUsername ("/users", username);
        System.out.println("Информация о пользователе с username  " + username + ": \n" + userByUsername);

    }
}
