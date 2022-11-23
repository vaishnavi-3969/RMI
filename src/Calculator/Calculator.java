package Calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements Interface {
    public Calculator() throws RemoteException {
        int a, b;
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }

    public int mul(int a, int b) throws RemoteException {
        return a * b;
    }

    public int div(int a, int b) throws RemoteException {
        return a / b;
    }
}