import java.util.Scanner;

class Main {
    static int year;
    static int days;
    static int userDays;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = 0;

        while(true){
            System.out.println("Введите год в формате уууу: ");
            year = scanner.nextInt();
            yearMeth();

            System.out.println("Введите количество дней в этом году: ");
            userDays = scanner.nextInt();
            if (days == userDays) {
                System.out.println("Верно");
                x++;
            } else {
                System.out.println("Неверно, в этом году 366 дней");
                break;
            }

        }
        System.out.println("Набрано очков " + x);
    }

    public static int yearMeth() {
        if (year % 4 == 0){
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }
}
