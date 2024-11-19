import java.util.Scanner;

public class Request {
    private final Scanner scanner = new Scanner(System.in);

    public String readRequest() {
        System.out.print("Введите запрос: ");
        return scanner.nextLine();
    }

}
