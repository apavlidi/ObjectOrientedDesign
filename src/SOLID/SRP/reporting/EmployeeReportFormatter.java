package SOLID.SRP.reporting;

import SOLID.SRP.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    private Employee employee;

    private FormatType formatType;

    public EmployeeReportFormatter(Object object, FormatType formatType) {
        super(object, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }

}
