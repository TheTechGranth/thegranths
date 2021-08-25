package DesignPatterns.ChainOfResponsibility;

public class CORMain {
    public static void main(String[] args) {
        ChainCreator chainCreator = new ChainCreator();
        Managers manager = chainCreator.createChain();
        manager.approveSalary(5000);
        manager.approveSalary(15000);
        manager.approveSalary(45000);
        manager.approveSalary(5000000);
    }
}
