import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameA = new ArrayList<>();
        ArrayList<String> nameB = new ArrayList<>();
        ArrayList<String> nameC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 names");
        for (int i = 0; i < 5; i++) {
            nameA.add(scanner.next());

        }


        System.out.println("List A " + nameA);
        System.out.println("Write 5 names");
        for (int i = 0; i < 5; i++) {
            nameB.add(scanner.next());

        }

        System.out.println("List B " + nameB );
        for (int i = 0; i < 5; i++) {
            nameC.add(nameA.get(i));
            nameC.add(nameB.get(i));

        }

        System.out.println("List c " + nameC);
        Collections.sort(nameC, Comparator.comparing(String :: length));
        System.out.println("Sort to lenght for line " + nameC);

    }
}