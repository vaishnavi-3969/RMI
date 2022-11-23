package Calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws NotBoundException, RemoteException,
            MalformedURLException {
        Scanner sc = new Scanner(System.in);
        try {
            Interface c = (Interface)
                    Naming.lookup("//localhost:1090/Calculator");
            System.out.println("client is connected to server");
            System.out.println("1. Addition \n");
            System.out.println("2. Subtraction \n");
            System.out.println("3. Multiplication \n");
            System.out.println("4. Division \n");
            int choice = sc.nextInt();
            int x, y;
            switch (choice) {
                case 1: {
                    System.out.println("Enter 2 numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Result: " + c.add(x, y));
                }
                case 2: {
                    System.out.println("Enter 2 numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Result: " + c.sub(x, y));
                }
                case 3: {
                    System.out.println("Enter 2 numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Result:" + c.mul(x, y));
                }
                case 4: {
                    System.out.println("Enter 2 numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("result:" + c.div(x, y));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}