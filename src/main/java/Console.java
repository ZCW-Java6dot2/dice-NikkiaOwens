import java.util.Scanner;

public class Console {

    public Integer getIntegerInput(String prompt) {
        Console useConsole = new Console();
        Scanner scanner = new Scanner(System.in);


        Integer userInput = 0;
        System.out.println(prompt);

        userInput = scanner.nextInt();
        return userInput;
    }
}
