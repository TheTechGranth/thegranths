package SystemDesign;

import java.util.ArrayList;
import java.util.List;

public class DepartmentMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Employee> l =new ArrayList<>();
        //do db call to get employees for the department
        Department dep1 = new Department(1,l);
        Department dep2 = (Department) dep1.clone();
    }
}
