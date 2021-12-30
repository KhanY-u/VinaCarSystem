import java.util.HashMap;
import java.util.Map;

public class Car {
    private  int ID;
    private float cost;
    enum CarStatus {RENT_READY, HELD, RESERVED,EXCEPTIONAL,PCIKED_UP, SERVICE_NEEDED,REMOVED,RETURNED}
    private CarStatus carStatus = CarStatus.RENT_READY;
    private int regisNum;
    private String color;
    private int yearOfProduct;
    private Branch branch;
    private CarModel carModel;
    private int mileage;
    private Map<String,Boolean> TypeOfCar = new HashMap<>();
    public Car(int i,float cost, int regisNum,String color,int yearOfProduct,Branch branch, CarModel carModel,int mileage,Boolean[] choice)
    {
        this.ID = i;
        this.cost = cost;
        this.regisNum = regisNum;
        this.color = color;
        this.yearOfProduct = yearOfProduct;
        this.branch = branch;
        this.carModel = carModel;
        this.mileage = mileage;
        Choice(choice);
    }
    public void Choice(Boolean[] choice)
    {
        this.TypeOfCar.put("ECONOMY",choice[0]);
        this.TypeOfCar.put("COMPACT_CAR",choice[1]);
        this.TypeOfCar.put("MEDIUM_SIZE",choice[2]);
        this.TypeOfCar.put("FULL_SIZE",choice[3]);
        this.TypeOfCar.put("STATION_WAGON",choice[4]);
        this.TypeOfCar.put("VAN",choice[5]);
        this.TypeOfCar.put("4_WHEEL",choice[6]);
        this.TypeOfCar.put("SPORTS/LUXURY",choice[7]);

    }
    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    public CarModel getCarModel() {
        return carModel;
    }
    public CarStatus getCarStatus() {
        return carStatus;
    }
    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }
    public String getColor() {
        return color;
    }
    public float getCost() {
        return cost;
    }
    public int getID() {
        return ID;
    }
    public int getMileage() {
        return mileage;
    }
    public int getRegisNum() {
        return regisNum;
    }
    public Map<String, Boolean> getTypeOfCar() {
        return TypeOfCar;
    }
    public int getYearOfProduct() {
        return yearOfProduct;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID:" + getID() + " Color:" +getColor() + " Cost:"+ getCost() + " Register Number:" + getRegisNum()+ " Branch:" + getBranch()+ " Car Model"+ getCarModel()+ " Car Status:"+ getCarStatus()+ " \n Type of Car: " + getTypeOfCar();
    }
}
