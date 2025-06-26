import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByEmpAge {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("raj");
        employee.setAge("23");
        employee.setSalary(10000.0);
        Employee employee1 = new Employee();
        employee1.setName("kavitha");
        employee1.setAge("28");
        employee1.setSalary(12000.0);
        Employee employee2 = new Employee();
        employee2.setName("abitha");
        employee2.setAge("21");
        employee2.setSalary(8000.0);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        List<Employee> sortedList =employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println("sorted emp by name"+sortedList.toString());




    }
}
