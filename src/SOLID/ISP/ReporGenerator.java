package SOLID.ISP;

public class ReporGenerator {

    private Reporting transactionObject;

    public void generateReport() {
        System.out.println(transactionObject.getName() +
                "\n" + transactionObject.getDate());
    }
}
