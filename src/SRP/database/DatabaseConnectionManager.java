package SRP.database;

import SRP.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionManager {

    private List<Employee> employees;

    public DatabaseConnectionManager() {
        initializeEmployees();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void persistEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    private void initializeEmployees() {
        employees = new ArrayList<>();
        employees.add(new Employee(1L, "Alex", "Pavlidis", "alexisomg@hotmail.gr"));
        employees.add(new Employee(2L, "Nick", "Pavlopoulos", "nick@hotmail.gr"));
        employees.add(new Employee(3L, "George", "Maverick", "george@hotmail.gr"));
    }


}
