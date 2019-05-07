package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("Enter customer name: ");
        customer.setName(scanner.nextLine());

        System.out.println("Enter customer address: ");
        customer.setAddress(scanner.nextLine());

        System.out.println("Enter customer phone: ");
        customer.setPhone(scanner.nextLine());

        System.out.println("Enter customer number: ");
        customer.setNumber(scanner.nextInt());

        System.out.println("Did you need customer to be in mailing list ?(Y/N)");
        customer.setInMailingList(scanner.next().equalsIgnoreCase("Y") ? true: false);

        System.out.println("Here is Customer Details: ");
        System.out.println(customer.toString());

    }
}
