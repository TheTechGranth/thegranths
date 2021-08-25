package DesignPatterns.ChainOfResponsibility;

public class HiringManager extends Managers {
    public HiringManager(int approvalLimit, String managerName) {
           this.approvalLimit = approvalLimit;
           this.ManagerName = managerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the salary at level 1, for salary amount "+ employeeSalary );
    }
}
