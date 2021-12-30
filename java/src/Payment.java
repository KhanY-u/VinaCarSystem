import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Payment {
    private  int ID ;
    enum PaymentMethod {
        CASH, CREDITCARD
    };

    private PaymentMethod paymentMethod;

    enum PaymentItem {
        DEPOSITE_PAYMENT, COST_LESS_DEPOSITE_PAYMENT
    };

    private PaymentItem paymentItem;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    

    public Payment(int id,PaymentMethod paymentMethod, PaymentItem paymentItem, LocalDate dateStart,LocalDate dateEnd) {
        this.ID = id;
        this.paymentItem = paymentItem;
        this.paymentMethod = paymentMethod;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public PaymentItem getPaymentItem() {
        return paymentItem;
    }
    public int getID() {
        return ID;
    }
    public String getDateEnd() {
        DateTimeFormatter FormatdateEnd = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return (String)dateEnd.format(FormatdateEnd);
    }
    public String getDateStart() {
        DateTimeFormatter FormatdateStart = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return (String)dateStart.format(FormatdateStart);
    }
}
