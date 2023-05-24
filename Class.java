import java.util.Scanner;

class child{
    String Name, Gender,passport, DOB;
    int Age, ID;
    double EID;
}

class customer extends child{
    int adult, child;
}

class payment {
    double amount, payable;
    String Card_name;
    double Card_number;
}

class Myfuctiona{
    // 1. customer info
    public void Customer_info() {
        myutiles use = new myutiles();
        use.Myprint("plase enter the ", 1);
        
    }

    private static void member_details() {
        //input
        myutiles use = new myutiles();
        Scanner Myuser = new Scanner(System.in);
        customer C1 = new customer();
        use.Myprint("Enter the name: ", 1);
        C1.Name = Myuser.next();

    }

    // 2. understanding the recuirment
    // 3. check the reservation
    public static void Room_avalabilty() {
        int ch=0;
        switch (ch){
            case 1:
            
            break;
            case 2:
            break;
        }
        
    }

    // 4. showing all avabile rooms
    // 5. conforimg and booking the room
    // 6. payment
    // 7. reservation complete


}