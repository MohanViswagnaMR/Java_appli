import java.util.Scanner;

class depn{
    String Name, Gender,passport, DOB, Nationality;
    int Age, ID;
    double EID;
}

class customer extends depn{
    int adult, child;
}

class payment {
    double amount, payable;
    String Card_name;
    double Card_number;
}

class Myfuctiona{
//----------------------------------------------Mohan's section----------------------------------------------

    //----------------------------------------------new_reservation
    public void new_reservation() {
        myutiles use = new myutiles();
        use.Blank_spc();
        use.Blank_spc();
        use.Txt_line("New reservation", 100);
        use.Myprint("Plase, enter the customer details", 1);
        use.Blank_spc();
        use.Txt_C("---------------------------------", 100);
        use.Txt_C("Warrning", 100);
        use.Txt_C("---------------------------------", 100);
        use.Myprint("The value you are going to enter can not be changed on the progarm, \na saparate module will be need to run,\ntherefore pls be careful while entering the details", 1);
        use.Blank_spc();
        use.line(100);
        // 1. customer info
        Customer_info();
        // 2. understanding the recuirment
        understanding();
        // 3. check the reservation
        Room_avalabilty();
        // 4. showing all avabile rooms
        // 5. conforimg and booking the room
        // 6. reservation complete
        use.Txt_C("+---------------------+", 100);
        use.Txt_C("|Reservation conformed|", 100);
        use.Txt_C("+---------------------+", 100);
        use.Blank_spc();
        use.line(100);
    }
    
    //customer info
    private void Customer_info() {
        int a = 0;
        myutiles use = new myutiles();
        Scanner Myin = new Scanner(System.in);
        customer c1 = new customer();
        use.Txt_C("Customer info", 100);     
        use.Blank_spc();
        use.Myprint("ID: ", 2);
        c1.ID = Myin.nextInt();
        use.Myprint("Name: ", 2);
        c1.Name = Myin.next();
        use.Myprint("Gender: ", 2);
        c1.Gender = Myin.next();
        use.Myprint("Age: ", 2);
        c1.Age = Myin.nextInt();
        use.Myprint("Date of Birth: ", 2);
        c1.DOB = Myin.next();
        use.Myprint("Nationality: ", 2);
        c1.Nationality = Myin.next();
        use.Myprint("Emirates ID: ", 2);
        c1.EID = Myin.nextInt();
        use.Myprint("Passport: ", 2);
        c1.passport = Myin.next();
        use.Blank_spc();
        use.Myprint("Enter the number of adualt and children staying at the hotal", 1);
        use.Myprint("Adualt: ", 2);
        c1.adult = Myin.nextInt();
        use.Myprint("Children: ", 2);
        c1.child = Myin.nextInt();
        use.Blank_spc();
        if(c1.adult!=1){
            use.Txt_C("---------------------------------", 100);
            use.Txt_C("depandeces deatails", 100);
            use.Txt_C("---------------------------------", 100);
        }

        a = c1.adult - 1;
        for(int i = 0; i<a;i++){
            System.out.println("Enter the adult "+(i+1));
            member_details();
        }
        
        for(int i = 0; i<c1.child;i++){
            System.out.println("Enter the child"+(i+1));
            member_details();
        }
        
        

    }

    private static void member_details() {
        //input
        myutiles use = new myutiles();
        Scanner Myin = new Scanner(System.in);
        depn c1 = new depn();
        use.Myprint("Name: ", 2);
        c1.Name = Myin.next();
        use.Myprint("Gender: ", 2);
        c1.Gender = Myin.next();
        use.Myprint("Age: ", 2);
        c1.Age = Myin.nextInt();
        use.Myprint("Date of Birth: ", 2);
        c1.DOB = Myin.next();
        use.Myprint("Nationality: ", 2);
        c1.Nationality = Myin.next();
        use.Myprint("Emirates ID: ", 2);
        c1.EID = Myin.nextInt();
        use.Myprint("Passport: ", 2);
        c1.passport = Myin.next();
        use.Blank_spc();
        
        
    }
    
    // 2. understanding the recuirment
    private static void understanding() {
        myutiles use = new myutiles();
        use.Blank_spc();
        use.Txt_C("--------------------------------------------------", 100);
        use.Myprint("Enter the number of nights you what to stay", 1);

        use.Myprint("processing:", 2);
        for(int i=0;i<50;i++){
            for(Double j=(double) 0;j<100000000;j++){
                
            }
            System.out.print("-");
        }
        System.out.println("");
        use.Blank_spc();

    }

    // 3. check the reservation
    private static void Room_avalabilty() {
        myutiles use = new myutiles();
        use.Myprint("checking for avalability", 2);
        for(int i=0;i<50;i++){
            for(Double j=(double) 0;j<100000000;j++){
                
            }
            System.out.print("-");
        }
        System.out.println("");
        use.Blank_spc();
        
    }


    //----------------------------------------------Payment
    //----------------------------------------------upgrade package 
    

//----------------------------------------------salena's Section----------------------------------------------
}