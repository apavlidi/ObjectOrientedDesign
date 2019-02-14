package SOLID.SRP.reporting;

public class ReportFormatter {

    private String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML: " + object.toString();
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: " + object.toString();
    }

    public String getFormattedValue() {
        return formattedOutput;
    }
}
