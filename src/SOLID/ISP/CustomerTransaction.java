package SOLID.ISP;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> productList;

    private Customer customer;

    public CustomerTransaction(List<Product> productList, Customer customer) {
        this.productList = productList;
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }


    @Override
    public String productBreakDown() {
        StringBuilder reporting = new StringBuilder();
        for (Product product : productList) {
            reporting.append(product.getProductName());
        }
        return reporting.toString();
    }

    @Override
    public void prepareInvoice() {
        System.out.println("Invoice prepared");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("The customer has been charged");
    }

}
