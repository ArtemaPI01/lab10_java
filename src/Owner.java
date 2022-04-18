import java.util.Scanner;

public class Owner {
    private Fio fio;
    private int income;
    private int expenses;

    Owner(){
        this.fio = new Fio();
    }
    Owner(Fio fio){
        this.fio = fio;
    }
    Owner(Fio fio,int income,int expenses){
        this.fio = fio;
        this.income = income;
        this.expenses = expenses;
    }
    public void enter(){
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while (a)
            try {
                fio.enter();
                System.out.println("Vvedite income: ");
                income = sc.nextInt();
                System.out.println("Vvedite expenses: ");
                expenses = sc.nextInt();
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
        System.out.println("income=" + income + "\n" + "expenses=" + expenses + "\n" + "money=" + Money());
    }
    public int Money(){
        return income - expenses;
    }
}