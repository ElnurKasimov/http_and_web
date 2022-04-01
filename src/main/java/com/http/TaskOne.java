package com.http;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class TaskOne {

    public static User initializeMyUser() {

        Geo geo = new Geo.Builder().
                withLat("48.526090").withLng("34.957614").build();

        Company company = new Company.Builder().
                withName("Best choice").
                withCatchPhrase("Synchronised bottom-line interface").
                withBS("e-enable innovative applications").build();

        Address address = new Address.Builder().
                withStreet("Belgradska").withSuit("Suite 12").withCity("Dnepr").withZipcode("49082").withGeo(geo).build();


        return new User.Builder().withID(0).withName("Elnur Kasimov").
                withUsername("Elnur_Dnepr").withEmail("myEmail@gmail.com").
                withAddress(address).withPhone("056-67-24-765").
                withWebsite("mywebsite.com.ua").withCompany(company).build();
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        // Homework Task 1 part 1
        User myUser = initializeMyUser();
        System.out.println(myUser);
        HttpUtillities.createNewObject("/users", myUser);

        // Homework Task 1 part 2
        myUser.setPhone("123-45-67-890");
        HttpUtillities.updateObject ("/users/1", myUser);

        // Homework Task 1 part 3
        System.out.println("---------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id юзера, которого надо удалить  (от 1 до 10): ");
        int id = sc.nextInt();
        User userForDeleting = HttpUtillities.getUserInformationByID("/users" , id);
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
        User userByID = HttpUtillities.getUserInformationByID("/users", id);
        System.out.println("Информация о пользователе с id " + id +  ": \n" + userByID);



        // Homework Task 1 part 6

        System.out.println("---------------------------------------------------------------------");
        System.out.print("Ведите username интересуемого Вас объекта : ");
        String username = "";
        while (username.equals("")) {
            username = sc.nextLine();
        }
        sc.close();
        System.out.println("Информация о пользователе/пользователях с username  " + username + ": ");
        List<User> usersByUsername = HttpUtillities.getUserInformationByUsername("/users", username);
        for (User user : usersByUsername) {
            System.out.println(user);
        }
    }
}
