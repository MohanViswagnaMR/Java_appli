import java.util.Scanner;
// hotel reservation
public class App {
    //starting point
    public static void main(String[] args) {
        V1();
    }

    public static void V1() {
        int i=0, a=1, cho=0;
        myutiles use = new myutiles();
        Myfuctiona MFC = new Myfuctiona();
        Scanner myin = new Scanner(System.in);
        use.Txt_line("Welcome to our program",100);
        use.Txt_C("created by Mohan & salena", 100);
        use.line(100);
        while(i == 0){
            a=1;
            use.Blank_spc();
            use.Txt_C("what would you like to do", 100);
            use.Blank_spc();
            use.Txt_C("+-------------------------------+-------------------------------+", 100);
            use.Txt_C("|       new reservation(1)      |           cheching in(2)      |", 100);
            use.Txt_C("+-------------------------------+-------------------------------+", 100);
            use.Txt_C("|        checking out(3)        |            payment(4)         |", 100);
            use.Txt_C("+-------------------------------+-------------------------------+", 100);
            use.Txt_C("| cancelation of reservation(5) |        upgrade package(6)     |", 100);
            use.Txt_C("+-------------------------------+-------------------------------+", 100);
            use.Blank_spc();
            use.Myprint("-->", 2);
            cho = myin.nextInt();
            switch(cho){
                case 1:
                    //new reservation 
                    MFC.new_reservation();
                    break;
                case 2: 
                    //cheching in
                    use.Myprint(cho, 1);
                    break;
                case 3: 
                    //checking out
                    use.Myprint(cho, 1);
                    break;
                case 4:
                    // payment
                    use.Myprint(cho, 1);
                    break;
                case 5:
                    // cancelation of reservation 
                    use.Myprint(cho, 1);
                    break;
                case 6:
                    //upgrade package 
                    use.Myprint(cho, 1);
                    break;
                case 7: a=0;i++;
                break;
                default: 
                use.Myprint("ERROR: \"|the value you have enterd is not corrrect, pls try again|\"", 1);
                use.Blank_spc();
                use.line(100);
                a = 0;
                break;
                
                // 1. customer info
                // 2. understanding the recuirment
                // 3. check the reservation
                // 4. showing all avabile rooms
                // 5. conforimg and booking the room
                // 6. payment
                // 7. reservation complete
            }
            if(a!=0){
                use.Blank_spc();
                use.Myprint("would you like to repeat the process: yes-1 no-0", 1);
                a = myin.nextInt();
                if (a==0){
                    i++;
                }
                else{
                    use.Blank_spc();
                    use.line(100);
                }
            }
            
        }
        use.line(100);
        use.Blank_spc();
        use.Txt_C("Thank you, and hope we see you again", 1);
        use.Blank_spc();
        use.Txt_line("End of the program", 100);
        
        
    }
    
    
    
}