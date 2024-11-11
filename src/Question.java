import java.util.Scanner;

public class Question {
    Scanner scanner = new Scanner(System.in);
    String user_question;
    public String readQuestion() {
        System.out.print("Введите запрос: ");
        user_question = scanner.nextLine();
        System.out.println(user_question);
        return user_question;
    }
}
