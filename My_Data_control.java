import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class DataControl{
    public static void id_generator(String Dfile) {
        
    }
    public void dataoveride(String user, String Dfile) {
        String Rec_user = ".\\data\\"+Dfile+".txt";
        System.out.println(Rec_user);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Rec_user));
            writer.write("hello i am saving data");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void AddDataline(String user, String Dfile) {
        String Rec_user = ".\\data\\"+Dfile+".txt";
        System.out.println(Rec_user);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Rec_user));
            writer.write("hello i am saving data");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}