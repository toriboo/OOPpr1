import java.util.Scanner;

public class Variant {
    Scanner scanner = new Scanner(System.in);
    int variant = -1;
    int choice(int counter) {
        if (counter == -1) {
            return -1;
        }
        variant = scanner.nextInt();
        while (variant > counter || variant <=0) {
            System.out.print("Данного номера нет в списке, попробуйте еще раз: ");
            variant = scanner.nextInt();
        }
        System.out.println(variant);
        return variant;
    }

}