import java.util.Scanner;

public class App {
    //starting point
    public static void main(String[] args) {
        myutiles use = new myutiles();
        use.Txt_line("Wlcome to our program", 60);
        use.Txt_C("Mohan", 60);
        use.line(60);
        //DataControl data = new DataControl();
        //data.AddData("mohan", "customer");
        //Room_avalabilty();
        //Customer_details();
        //pay();
        
    }
    
    private static void Room_avalabilty() {
        int ch=0;
        switch (ch){
            case 1:
            
            break;
            case 2:
            break;
        }
        
    }
    
    public static void pay() {
        
    }
    
    public static void Customer_details() {
        //input
        myutiles use = new myutiles();
        Scanner Myuser = new Scanner(System.in);
        customer C1 = new customer();
        use.Myprint("Enter the name: ", 1);
        C1.Name = Myuser.next();

    }
}