package DesignPatterns.ChainOfResponsibility;

public class ChainCreator {
    public Managers createChain(){
        HiringManager hiringManager = new HiringManager(10000,"Mike");
        SeniorManager seniorManager = new SeniorManager(30000, "Bill");
        Director director  = new Director(50000, "Ayush");

        hiringManager.setManager(seniorManager);
        seniorManager.setManager(director);
        return hiringManager;
    }
}
