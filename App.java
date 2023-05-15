import java.util.Scanner;

public class App {
    // special features
    //outputs
    private static void Myprint(String X, int y) {
        switch (y) {
            case 1:  System.out.println(X);
            break;
            case 2:  System.out.print(X);
            break;
            default:
            System.out.println("ERROR:(String) there is an error pls look for it"); 
            
        }
    }
    private static void Myprint(Integer X, int y) {
        switch (y) {
            case 1:  System.out.println(X);
            break;
            case 2:  System.out.print(X);
            break;
            default:
            System.out.println("ERROR:(intger) there is an error pls look for it"); 
            
        }
    }
    private static void Myprint(Double X, int y) {
        switch (y) {
            case 1:  System.out.println(X);
            break;
            case 2:  System.out.print(X);
                break;
            default:
            System.out.println("ERROR:(Double) there is an error pls look for it"); 
            
        }
    }
    private static void Blank_spc() {
        System.out.println("");
    }
    
    //line
    private static void line(Integer i) {
        i = i-1;
        for(int j = 0; j<i; j++){
            Myprint("*", 2);
        }
        Myprint("*", 1);
    }
    //text at the center with line
    private static void Txt_line(String X, int i) {
        i = (i-2) - X.length();
        int half = i/2;
        for(int j = 0; j<half; j++){
            Myprint("*", 2);
        }
        Myprint(" ", 2);
        Myprint(X, 2);
        Myprint(" ", 2);
        for(int j = 0; j<half; j++){
            Myprint("*", 2);
        }
        if (X.length()%2==1){
            Myprint("*", 1);
        }
        else{
            Myprint("", 1);
        }
    }
    //text at the center without line
    private static void Txt_C(String X, int i) {
        i = (i-2) - X.length();
        int half = i/2;
        for(int j = 0; j<half; j++){
            Myprint(" ", 2);
        }
        Myprint(" ", 2);
        Myprint(X, 2);
        Myprint(" ", 2);
        for(int j = 0; j<half; j++){
            Myprint(" ", 2);
        }
        if (X.length()%2==1){
            Myprint(" ", 1);
        }
        else{
            Myprint("", 1);
        }
    }
    
    //starting point
    public static void main(String[] args) {
        //input
        Scanner Myuser = new Scanner(System.in);
        Txt_line("Welcome to my application", 60);
        Txt_C("My name is Mohan", 60);
    }
}