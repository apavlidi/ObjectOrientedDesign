package SRP.dao;

import SRP.database.DatabaseConnectionManager;
import SRP.domain.Employee;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        DatabaseConnectionManager database = new DatabaseConnectionManager();
        database.persistEmployee(employee);
        System.out.println("Saved employee to database with id " + employee.getId());
    }

    public void deleteEmployee(Employee employee) {
        DatabaseConnectionManager database = new DatabaseConnectionManager();
        database.persistEmployee(employee);
        System.out.println("Deleted employee to database with id +" + employee.getId());
    }

}
