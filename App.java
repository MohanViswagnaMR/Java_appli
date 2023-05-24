import java.util.Scanner;

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
        use.Txt_line("Wlcome to our program",100);
        use.Txt_C("created by Mohan & salena", 100);
        use.line(100);
        while(i == 0){
            a=1;
            use.Blank_spc();
            use.Myprint("what would you like to do", 1);
            cho = myin.nextInt();
            switch(cho){
                case 1: use.Myprint(cho, 1);
                    break;
                case 2: use.Myprint(cho, 1);
                    break;
                case 3: use.Myprint(cho, 1);
                    break;
                case 4: use.Myprint(cho, 1);
                    break;
                case 5: use.Myprint(cho, 1);
                    break;
                case 6: use.Myprint(cho, 1);
                    break;
                default: 
                    use.Myprint("ERROR: \"|the value you have enterd is not corrrect, pls try again|\"", 1);
                    use.Blank_spc();
                    use.line(100);
                    a = 0;
                    break;

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
    
    // 1. customer info
    // 2. understanding the recuirment
    // 3. check the reservation
    // 4. showing all avabile rooms
    // 5. conforimg and booking the room
    // 6. payment
    // 7. reservation complete
    
    
}