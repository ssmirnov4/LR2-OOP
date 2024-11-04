import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?|0)(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?|0)){3})";
        Pattern pt1 = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ip-адресс: ");
        String ip = sc.nextLine();
        Matcher m1 = pt1.matcher(ip);
        boolean b = m1.matches();
        if (b) {
            System.out.println("Вы ввели ip-адресс");
        } else {
            System.out.println("Вы ввели не ip-адресс");
        }

    }
}