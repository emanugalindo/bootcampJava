import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var i = 0;
        while (args.length > i){
            System.out.println(args[i]);
            i++;
        }

        i = 0;

        System.out.println("====================");
        do {
            System.out.println(args[i]);
            i++;
        }while (args.length > i);
    }
}
