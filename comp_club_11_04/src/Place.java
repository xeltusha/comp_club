import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Place {
    private int price_1hr;
    private int time;
    private int free_place_count;

    public Place(int price_1hr, int time, int free_place_count){
        this.price_1hr = price_1hr;
        this.time = time;
        this.free_place_count = free_place_count;
    }

    public static void registration(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of place: 1) Basic;\n2) VIP;\n3) Console.");
        int registration_option = input.nextInt();
        switch (registration_option){
            case 1:
            case 2:
            case 3:
        }
    }

    public static void print_info(){
        System.out.println("");
    }

    public static void writeFile(){
        try {
            FileWriter fw = new FileWriter("output.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void option(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of option:\n1) Registrate new client:\n2) Show the info about the client:\n3) Get the clients' extract in one file:\n4) Exit out the program.");
        int option = input.nextInt();
        switch (option){
            case 1: registration();
            case 2: print_info();
            case 3:
            case 4: break;
        }
    }

    public int getPrice_1hr() {
        return price_1hr;
    }

    public void setPrice_1hr(int price_1hr) {
        this.price_1hr = price_1hr;
    }

    public int getFree_place_count() {
        return free_place_count;
    }

    public void setFree_place_count(int free_place_count) {
        this.free_place_count = free_place_count;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
