import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> usersB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add(scanner.next());
        }
        System.out.println("Список A: " + users);

        for (int i = 0; i < 5; i++) {
            usersB.add(scanner.next());
        }
        System.out.println("Список B: " + usersB);

        System.out.println("-----------------------");

        ArrayList<String> usersC = new ArrayList<>();

        usersC.add(0,users.get(0));
        usersC.add(1,usersB.get(4));
        usersC.add(2,users.get(1));
        usersC.add(3,usersB.get(3));
        usersC.add(4,users.get(2));
        usersC.add(5,usersB.get(2));
        usersC.add(6,users.get(3));
        usersC.add(7,usersB.get(1));
        usersC.add(8,users.get(4));
        usersC.add(9,usersB.get(0));
        System.out.println(usersC);

        System.out.println("-------------------------------");

        usersC.sort(Comparator.comparing(String::length));
        System.out.println(usersC);

    }
}