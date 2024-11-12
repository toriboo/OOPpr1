import java.util.Scanner;

public class Question {
    private final Scanner scanner = new Scanner(System.in);

    public String readQuestion() {
        System.out.print("Введите запрос: ");
        return scanner.nextLine();
    }

}
