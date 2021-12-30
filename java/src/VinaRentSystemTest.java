
public class VinaRentSystemTest
{
    public static void main(String[] args) {
        VinaRentSystem vinaRentSystem = VinaRentSystem.getInstance();
        vinaRentSystem.addBranch(1, "01365","34 Hoang Van Tham");
        vinaRentSystem.addBranch(2, "0834","10 Nga Tu Trung Luong");
        vinaRentSystem.addBranch(3,"034","Go Dau Ha");


        vinaRentSystem.pairBranch("34 Hoang Van Tham", "10 Nga Tu Trung Luong");
        vinaRentSystem.pairBranch("34 Hoang Van Tham", "Go Dau Ha");


        vinaRentSystem.addCarGroup("Group_A", "The new Group_A is as youthful and dynamic as ever, but grown-up and comfortable like never before.");
        vinaRentSystem.addCarGroup("Group_B", "The new Group_B puts the emphasis on sport with the Sports Tourer. It looks more dynamic than its predecessor and is more agile on the road while offering greater comfort.");
        vinaRentSystem.addCarGroup("Group_A", "Automotive intelligence can be this beautiful.");


        vinaRentSystem.addCarModel(1,"The design underlines the coupé character with its stretched form and design elements", CarModel.Control.AUTOMATIC, 30, 4, "Group_B");
        vinaRentSystem.addCarModel(2,"The benchmark in the compact class.", CarModel.Control.MANUAL, 30, 4, "Group_A");
        vinaRentSystem.addCarModel(3,"Compact entry into the world of premium saloon cars..", CarModel.Control.MANUAL, 30, 4, "Group_C");

        vinaRentSystem.addCustomer(1,"Khan", "I", "TLS4255", "Thi Tran Trang Bang", "06985", "THTrueMilk");
        vinaRentSystem.addCustomer(2,"Khan", "II", "TLS5231", "Thanh Pho Tay Ninh", "01644", "Milo");
        vinaRentSystem.addCustomer(3,"Khan", "III", "TLS5231", "Thanh Pho Tay Ninh", "01644", "Milo");

        Boolean[]a = {true,false,true,false,true,false,true,false};
        vinaRentSystem.addCar(1, 4000, 21201, "White gray", 1995, 1, 1, 0, a);
        Boolean[]b = {true,true,true,true,true,false,true,false};
        vinaRentSystem.addCar(2, 3000, 22451, "White gray", 2012, 1, 1, 0, b);
        vinaRentSystem.addCar(3, 2500, 22451, "White gray", 2000, 2, 1, 0, a);
        vinaRentSystem.addCar(4, 2500, 23145, "blue", 1998, 4, 1, 0, b);
        vinaRentSystem.addCar(5, 2500, 21547, "red", 2001, 2, 4, 0, a);


        vinaRentSystem.listCar(1, "Group_B");
        vinaRentSystem.listCar(4, "Group_B");
        vinaRentSystem.listCar(1, "Group_C");

        vinaRentSystem.recordReturnCar(1, 2000, 2);
        vinaRentSystem.recordReturnCar(3, 2000, 2);
        vinaRentSystem.recordReturnCar(1, 2000, 4);

        
    }
}