package DesignPatterns.ChainOfResponsibility;

public class SeniorManager extends Managers{

    public SeniorManager(int approvalLimit, String managerName) {
        this.approvalLimit = approvalLimit;
        this.ManagerName = managerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the salary at level 2, for salary amount "+ employeeSalary );
    }
}
