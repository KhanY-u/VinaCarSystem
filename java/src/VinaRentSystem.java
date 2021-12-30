import java.util.*;
public class VinaRentSystem
{   
    private static VinaRentSystem instance;
    private List<Rental> rentals = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();
    private List<Branch> branchs = new ArrayList<>();
    private List<CarModel> carModels = new ArrayList<>();
    private List<CarGroup> carGroups = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private VinaRentSystem() { 
        System.out.println("The system is starting");
    }

    public static VinaRentSystem getInstance() {
        if (instance == null) {
            instance = new VinaRentSystem();
        }
        return instance;
    }
    public void addBranch(int id,String phoneNum,String address)
    {
        boolean exit = HelperClass.validate(branchs, phoneNum);
        if(exit == false)
        {
            branchs.add(new Branch(id,address, phoneNum));
            System.out.println("The branch addition is completed with address:" + address +" and phone number: "+ phoneNum);}
        else System.out.println("The branch existed");
    }
    public void addCarGroup(String groupName,String description) {
        boolean a = HelperClass.validateGroup(carGroups, groupName);
        if(  a == false)
        {       carGroups.add(new CarGroup(groupName, description));
            System.out.println("The carGroup addition is completed. " + "Name Group: " + groupName + " and description " + description);
        }
        else System.out.println("The carGroup existed");
        
    }
    public void addCarModel(int i,String desc,CarModel.Control control, float petrolCus,int doorNum,String Name_group)
    {   
        CarGroup a = HelperClass.searchCG(carGroups, Name_group);
        if(a != null)
            {
                carModels.add(new CarModel(i,desc,control,petrolCus,doorNum,a));
                System.out.println("The car model addition is completed. Description: "+ desc + " Control: " + control + " CarGroup: " +a.toString());
            }
        else System.out.println("The carGroup does not exist");
 
 
    }
    public void  addCar(int i,float cost, int regisNum,String color,int yearOfProduct,int branchID, int carModelID,int mileage,Boolean[] choice) {
        Branch a = HelperClass.searchB(branchs, branchID);
        CarModel b = HelperClass.searchM(carModels, carModelID);
        boolean regis_temp = HelperClass.validateCarR(cars, regisNum);
        
        if(regis_temp == false)
        {   if(a != null)
            {
               if(b != null)
                {
                    cars.add(new Car(i,cost,regisNum,color,yearOfProduct,a,b,mileage,choice));
                    System.out.println("The car addition is completed. " + new Car(i,cost,regisNum,color,yearOfProduct,a,b,mileage,choice).toString());
                } else System.out.println("The carModel does not exist");
            }else System.out.println("The branch does not exist");
        }else System.out.println("The register number existed");
          
    }
    public void addCustomer(int i,String firstName, String lastName, String license,String address, String phoneNum,String email)
    {
        boolean a = HelperClass.validateCus(customers, license);
        if(a == false)
        {   
            customers.add(new Customer(i,firstName, lastName, license, address, phoneNum, email));
            System.out.println("The customer addition is completed. Name: "+ firstName + " " + lastName +" License: " + license +" Address: " + address +" Phone Number: " + phoneNum +" Email: " + email);
        }
        else System.out.println("The customer exists");
    }
    public void listCar(int branchID, String carGroupName)
    {
        CarGroup a = HelperClass.searchCG(carGroups, carGroupName);
        Boolean b = HelperClass.validate(branchs, branchID);
        if(a != null)
        {
            if (b == true)
            {
                System.out.println("List car :");
                for(Car temp : cars)
                {   
                    if( temp.getBranch().getID() == branchID && temp.getCarModel().getCarGroup().getNameGroup() == carGroupName)
                    {
                        System.out.println("ID: "+((Car) temp).getID() + ". Cost:" + ((Car) temp).getCost() + ". Register Number: " +((Car) temp).getRegisNum() + ". Branch: "+ ((Car) temp).getBranch().getAddress() +  ". Group: " +((Car) temp).getCarModel().getCarGroup().getNameGroup() );
                    }
                }
            }else  System.out.println("Branch does not exist!");
        } else  System.out.println("CarGroup does not exist!");
        
    }
    public void recordReturnCar(int carID, int end_mileage, int branchID)
    {
        boolean a = HelperClass.validateCar(cars, carID);
        Boolean b = HelperClass.validate(branchs, branchID);
        
        if( a == true)
        {
            if(b == true)
            {   System.out.println("Car returned!");
                for(Car temp : cars){
                    if(  temp.getID() == carID ){
                        temp.setCarStatus(Car.CarStatus.RETURNED);
                        temp.setMileage(end_mileage);
                        for( Branch c : branchs)
                        {
                            if(c.getID() == branchID)
                            {
                                temp.setBranch(c);
                                System.out.println("ID: "+ temp.getID() + ". End mileage: "+ temp.getMileage() + ". Current location: " + temp.getBranch().getAddress());
                            break;
                            }
                        }
                    }
                    break;
                }
            }else  System.out.println("Branch does not exist!");

        }else  System.out.println("Car does not exist!");
        
    }
    public void pairBranch(String addressF,String addressS)
    {
        
        Branch tempF = HelperClass.search(branchs, addressF);
        Branch tempS = HelperClass.search(branchs, addressS);
        if(tempF != null)
        {
            if(tempS != null)
            {
                for(Branch a : branchs)
                {
                    if(  a.getID() == tempF.getID() && (tempF.getID() + 1 == tempS.getID() ||tempF.getID() - 1 == tempS.getID()))
                    {
                        System.out.println(tempF.toString() +" and " + tempS.toString() + " a pair of branches neighbor" );
                        break;
                    }
                }
            } else System.out.println("The second Branch has not already existed");
        }else System.out.println("The first Branch has not already existed");
        
    }
}