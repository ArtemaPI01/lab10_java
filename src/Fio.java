import java.util.Scanner;

public class Fio {
    private String name;
    private String surname;
    private String patronymic;
    Fio(){
    }
    Fio(String surname){
        this.surname = surname;
    }
    Fio(String name,String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public void enter(){
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while (a)
            try {
                System.out.println("Vvedite name: ");
                name = sc.nextLine();
                if (new String(name).equals("")) throw new Exception("Error! IIYCTO.");
                System.out.println("Vvedite surname: ");
                surname = sc.nextLine();
                if (new String(surname).equals("")) throw new Exception("Error! IIYCTO.");
                System.out.println("Vvedite patronymic: ");
                patronymic = sc.nextLine();
                if (new String(patronymic).equals("")) throw new Exception("Error! IIYCTO.");
                a = false;
            }
            catch (Exception e){
                System.err.println(e);
                System.out.println("Press Enter key to continue...");
                sc.nextLine();
            }
    }
    public void print() {
        System.out.println("Fio: " + name + " " + surname + " " + patronymic);
    }
}