package SOLID.ISP;

public class AccountReceivable {

    private CustomerTransaction customerTransation;

    public AccountReceivable(CustomerTransaction customerTransaction) {
        this.customerTransation = customerTransaction;
    }

    public void postPayment() {
        customerTransation.chargeCustomer();
    }

    public void sendInvoice() {
        customerTransation.prepareInvoice();
    }

}
