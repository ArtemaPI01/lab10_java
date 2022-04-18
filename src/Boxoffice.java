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
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while (a)
            try {
                fio.enter();
                System.out.println("Vvedite workers: ");
                workers = sc.nextInt();
                if (workers < 0) throw new Exception("Error! Number < 0.");
                System.out.println("Vvedite count: ");
                count = sc.nextInt();
                if (count < 0) throw new Exception("Error! Number < 0.");
                a = false;
            }
            catch (Exception e){
                System.err.println(e);
                System.out.println("Press Enter key to continue...");
                sc.nextLine();
            }
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