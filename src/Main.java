public class Main {
    public static void main(String[] args){
        Boxoffice v = new Boxoffice();
        v.print();
        Fio fio = new Fio("a","b", "c");
        Owner alisher = new Owner();
        alisher.enter();
        alisher.print();
        int N = 1;
        Shop[] ashan = new Shop[N];
        for (int i = 0; i < N; i++){
            ashan[i] = new Shop("A", "B","C", "10:00-20:00");
            ashan[i].print();
            ashan[i].cloak();
        }
        Shop.CountOfShops();
        String[] x = {"ABS", "BSD", "DSE"};
        Warehouse home = new Warehouse(x);
        home.print();
        home.Poisk("ABS");
        Boxoffice m = new Boxoffice(fio, 20, 20);
        m.print();
        m.Cloak(100);
    }
}