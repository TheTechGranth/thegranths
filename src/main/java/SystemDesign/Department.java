package SystemDesign;

import java.util.List;

public class Department implements Cloneable{
    private int deptId;
    private List<Employee> empList;

    public Department(int deptId, List<Employee> empList) {
        this.deptId = deptId;
        this.empList = empList;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
