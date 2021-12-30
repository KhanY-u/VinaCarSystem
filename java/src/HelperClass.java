
import java.util.*;

  
public class HelperClass {
 

    public HelperClass(){};
    // check branch by address
    public static boolean validate(List<Branch> array, String phoneNum) {
        for(Branch a: array)
        {
            if(a.getPhoneNum() == phoneNum)
            {
                return true;
            }
            
        }
        return false;
    }
    public static boolean validate(List<Branch> array, int ID) {
        for(Branch a: array)
        {
            if(a.getID() == ID)
            {
                return true;
            }
            
        }
        return false;
    }
    public static boolean validateCar(List<Car> array, int ID) {
        for(Car a: array)
        {
            if(a.getID() == ID)
            {
                return true;
            }
            
        }
        return false;
    }
    public static boolean validateCarR(List<Car> array, int regisNum) {
        for(Car a: array)
        {
            if(a.getRegisNum() == regisNum)
            {
                return true;
            }
            
        }
        return false;
    }
    public static Branch searchB(List<Branch> array, int ID) {
        for(Branch a: array)
        {
            if(a.getID() == ID)
            {
                return a;
            }
            
        }
        return null;
    }
    public static CarModel searchM(List<CarModel> array, int ID) {
        for(CarModel a: array)
        {   
            if(a.getID() == ID)
            {
                return a;
            }
            
        }
        return null;
    }

    public static boolean validateCarModel(List<CarModel> carModels, int ID) {
        for(CarModel a: carModels)
        {
            if(a.getID() == ID)
            {
                return true;
            }
            
        }
        return false;
    }
     // search branch in branchList
     public static Branch search(List<Branch> branchs,String address) {
        for( Branch a: branchs)
        {
            if( a.getAddress() == address)
            {
                return a;
            }
        }
        return null;
    }

    // check validate in cargroupList
    public static boolean validateGroup(List<CarGroup> array, String name_group) {
        for(CarGroup a: array)
        {
            if(a.getNameGroup() == name_group)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean validateCus(List<Customer> array, String license) {
        for(Customer a: array)
        {
            if(a.getLicense() == license)
            {
                return true;
            }
            
        }
        return false;
    }

      
   
    public static CarGroup searchCG(List<CarGroup> carGroups,String name_group) {
        for( CarGroup a: carGroups)
        {
            if(a.getNameGroup() == name_group)
            {
                return  a;
            }
        }
        return null;
    }
}
