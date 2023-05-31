class myutiles{
    // special features
    //outputs
    public void Myprint(String X, int y) {
        int testmode = 2;
        switch (testmode){
            case 1:
                switch (y) {
                    case 1:  
                        for(int i=0;i<X.length();i++){
                            for(Double j=(double) 0;j<10000000;j++){
                
                            }
                            System.out.print(X.charAt(i));
                        }
                        System.out.println("");
        
                        break;
        
                    case 2: 
                        for(int i=0;i<X.length();i++){
                            for(Double j=(double) 0;j<10000000;j++){
                
                            }
                            System.out.print(X.charAt(i));
                        }
                        break;
                    default:
                    System.out.println("ERROR:(String) there is an error pls look for it"); 
                    
                }
                break;
            case 2:
                switch (y) {
                    case 1:  
                        System.out.println(X);
                        break;
                    case 2: 
                        System.out.print(X);
                        break;
                    default:
                    System.out.println("ERROR:(String) there is an error pls look for it"); 
                    
                }
                break;
        }
    }
    public void Myprint(Integer X, int y) {
        switch (y) {
            case 1:  System.out.println(X);
            break;
            case 2:  System.out.print(X);
            break;
            default:
            System.out.println("ERROR:(intger) there is an error pls look for it"); 
            
        }
    }
    public void Myprint(Double X, int y) {
        switch (y) {
            case 1:  System.out.println(X);
            break;
            case 2:  System.out.print(X);
                break;
            default:
            System.out.println("ERROR:(Double) there is an error pls look for it"); 
            
        }
    }
    public void Blank_spc() {
        System.out.println("");
    }
    
    //line
    public void line(Integer i) {
        i = i-1;
        for(int j = 0; j<i; j++){
            Myprint("-", 2);
        }
        Myprint("-", 1);
    }
    //text at the center with line
    public void Txt_line(String X, int i) {
        i = (i-2) - X.length();
        int half = i/2;
        for(int j = 0; j<half; j++){
            Myprint("-", 2);
        }
        Myprint(" ", 2);
        Myprint(X, 2);
        Myprint(" ", 2);
        for(int j = 0; j<half; j++){
            Myprint("-", 2);
        }
        if (X.length()%2==1){
            Myprint("-", 1);
        }
        else{
            Myprint("", 1);
        }
    }
    //text at the center without line
    public void Txt_C(String X, int i) {
        i = (i-2) - X.length();
        int half = i/2;
        for(int j = 0; j<half; j++){
            System.out.print(" ");
            //Myprint(" ", 2);
        }
        Myprint(" ", 2);
        Myprint(X, 2);
        Myprint(" ", 2);
        // for(int j = 0; j<half; j++){
        //     Myprint(" ", 2);
        // }
        // if (X.length()%2==1){
        //     Myprint(" ", 1);
        // }
        // else{
        //     Myprint("", 1);
        // }
        Myprint("", 1);
    }
}

