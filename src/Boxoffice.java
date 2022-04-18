import java.util.Scanner;

public class Boxoffice {
    private Fio fio;
    private int workers;
    private int count;

    Boxoffice(){
        this.fio = new Fio();
    }
    Boxoffice(int workers){
        this.workers = workers;
    }
    Boxoffice(Fio fio,int workers,int count){
        this.fio = fio;
        this.workers = workers;
        this.count = count;
    }
    public void enter(){
        fio.enter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite workers: ");
        workers = sc.nextInt();
        System.out.println("Vvedite count: ");
        count = sc.nextInt();
    }

    public void print() {
        fio.print();
        System.out.println("workers=" + workers + "\n" + "count=" + count);
    }

    public void Cloak(int x){
        int a;
        if (count - workers < 0){
            a = (x/count)*2;
        }else
            a = (x/workers)*2;
        System.out.println("Time=" + a);
    }
}