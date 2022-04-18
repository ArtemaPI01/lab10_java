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
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite name: ");
        name = sc.nextLine();
        System.out.println("Vvedite surname: ");
        surname = sc.nextLine();
        System.out.println("Vvedite patronymic: ");
        patronymic = sc.nextLine();
    }
    public void print() {
        System.out.println("Fio: " + name + " " + surname + " " + patronymic);
    }
}