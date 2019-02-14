package SOLID.SRP.clients;

import SOLID.SRP.dao.EmployeeDAO;
import SOLID.SRP.domain.Employee;
import SOLID.SRP.reporting.EmployeeReportFormatter;
import SOLID.SRP.reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee employee = new Employee();

        ClientModule.printEmployee(employee);

        ClientModule.hireEmployee(employee);

        ClientModule.printEmployee(employee);
    }

    public static void hireEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployee(Employee employee) {
        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, FormatType.CSV);
        String formattedEmployee = employeeReportFormatter.getFormattedEmployee();
        System.out.println(formattedEmployee);
    }

}
