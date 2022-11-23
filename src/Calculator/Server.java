package Calculator;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;

public class Server {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1090);
            r.rebind("Calculator", new Calculator());
            System.out.println("Server is Running....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}