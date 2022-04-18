import java.util.Scanner;

public class Warehouse {
    private String[] product;
    int station;
    Warehouse(){

    }
    Warehouse(String[] product){
        this.product = product;
    }
    Warehouse(String[] product,int station){
        this.product = product;
        this.station = station;
    }

    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite product: ");
        product = sc.nextLine().split(" ");
        System.out.println("Vvedite station: ");
        station = sc.nextInt();
    }
    public void print() {
        for (int i = 0; i < product.length; i++) {
            System.out.print(product[i] + " ");
        }
        System.out.println("Station: " + station);
    }

    public int Time(int x){
        int i = 0;
        int time = 0;
        while (i < x){
            time+=15;
            i+=station;
        }
        return time;
    }

    public void Poisk(String str) {
        for (int i = 0; i < product.length; i++)
            if (product[i].equals(str)){
                System.out.println("ECTb");
                return;
            }
        System.out.println("HET");
    }
}