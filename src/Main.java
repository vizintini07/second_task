public class Main {
    static   float telescope = 14_000; //стоимость телскопа
    static   float account = 1000; //счет
    static   float stipend = 2500; //стипендия
    static   int count = 0; // кол-во месяцев

    public static void main(String[] args) {

        while (account < telescope) {
            count++;
            account += account/100 * 5/12;
            account +=stipend;


            System.out.println("Количество месяцев, требующихся для покупки телескопа - " + count );
            System.out.println(account);
        }
    }
}