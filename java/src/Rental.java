import java.time.LocalDate;

public class Rental {
    private  int ID ;
    private String rentalDescription;
    private float cost;
    private LocalDate DateStart;
    private LocalDate DateEnd;
    enum RentalStatic {RENT_READY,HELD, RESERVED,EXCEPTIONAL,PICKED_UP};
    private RentalStatic rentalStatic = RentalStatic.RENT_READY	;
    private Payment payment;
    private Customer customer;
    private Car car;

    public Rental(int i,String rentalDesc, float cost, RentalStatic rentalStatic,LocalDate dateStart,LocalDate dateEnd, Payment payment,Customer customer,Car car)
    {
        this.ID =i;
        this.rentalDescription = rentalDesc;
        this.cost = cost;
        this.DateEnd = dateEnd;
        this.DateStart = dateStart;
        this.payment = payment;
        this.customer = customer;
        this.rentalStatic = rentalStatic;
        this.car = car;
    }
    public float getCost() {
        return cost;
    }
    public Customer getCustomer() {
        return customer;
    }
    public LocalDate getDateEnd() {
        return DateEnd;
    }
    public LocalDate getDateStart() {
        return DateStart;
    }
    public  int getID() {
        return ID;
    }
    public Payment getPayment() {
        return payment;
    }
    public String getRentalDescription() {
        return rentalDescription;
    }
    public RentalStatic getRentalStatic() {
        return rentalStatic;
    }
    public void setRentalStatic(RentalStatic rentalStatic) {
        this.rentalStatic = rentalStatic;
    }
}
