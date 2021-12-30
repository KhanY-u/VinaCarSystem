public class CarModel {
    private int ID ;
    private String description;
    enum Control {AUTOMATIC,MANUAL};
    private Control control;
    private float petrolConsume;
    private int doorNum;
    private CarGroup carGroup;
    public CarModel(int i,String description, CarModel.Control control, float petrol,int doorNum,CarGroup carGroup)
    {
        this.ID = i;
        this.description = description;
        this.carGroup = carGroup;
        this.control = control;
        this.control = Control.MANUAL;
        this.petrolConsume = petrol;
        this.doorNum = doorNum;
    }
    public CarGroup getCarGroup() {
        return carGroup;
    }
    public String getDescription() {
        return description;
    }
    public int getDoorNum() {
        return doorNum;
    }
    public float getPetrolConsume() {
        return petrolConsume;
    }
    public Control getControl() {
        return control;
    }
    public int getID() {
        return ID;
    }
    @Override
    public String toString() {
        return " Description:"+ description + " Control:" + control + " CarGroup:" + carGroup.toString();
    }
}
