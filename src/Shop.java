import java.util.Scanner;

public class Shop {
    static private  int counter;
    private String name;
    private String type;
    private String street;
    private String time;
    static {
        counter = 0;
    }
    Shop(){
        counter++;
    }
    Shop(String name,String type, String street, String time){
        counter++;
        this.name = name;
        this.type = type;
        this.street = street;
        this.time = time;
    }
    Shop(String time){
        counter++;
        this.time = time;
    }
    public static int Getcounter(){
        return counter;
    }
    public static void CountOfShops(){
        System.out.println("Kol-vo shops: " + counter);
    }
    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite name: ");
        name = sc.nextLine();
        System.out.println("Vvedite type: ");
        type = sc.nextLine();
        System.out.println("Vvedite street: ");
        street = sc.nextLine();
        System.out.println("Vvedite time: ");
        time = sc.nextLine();
    }
    public void print() {
        System.out.println("Name: " + name + " type: " + type + " street: " + street+ " time: " + time);
    }
    public void cloak() {
        String[] data = time.split("-");
        String[] data0 = data[0].split(":");
        String[] data1 = data[1].split(":");
        int a = Integer.parseInt(data1[0]) - Integer.parseInt(data0[0]);
        int b = Integer.parseInt(data1[1]) - Integer.parseInt(data0[1]);
        if (b < 0){
            b+=60;
            a--;
        }
        System.out.println("Time: " + time + "\nHours: " + a + "   Mins: " + b);
    }
}