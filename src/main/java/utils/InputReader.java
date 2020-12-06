package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputReader {
    public static final int MANOEUVRE_COMMAND = 0;
    public static final int SHORT_SCAN_COMMAND = 1;
    public static final int LONG_SCAN_COMMAND = 2;
    public static final int BATTLE_COMMAND = 3;
    public static final int GALAXY_MAP_COMMAND = 4;

    public int readCommand() {
        int[] commandsTab = {MANOEUVRE_COMMAND, SHORT_SCAN_COMMAND, LONG_SCAN_COMMAND, BATTLE_COMMAND, GALAXY_MAP_COMMAND};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Command: ");
        int command = Integer.parseInt(scanner.nextLine());
        if(command < 0 || command > 4) {
            System.out.println("INCORRECT COMMAND, PLEASE USE ONE OF THESE COMMANDS: " + Arrays.toString(Arrays.stream(commandsTab).toArray()) + "\n");
            return readCommand();
        }

        return command;
    }

    public List<Integer> readVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VECTOR ? ");
        String vector = scanner.nextLine();
        if(!vector.matches("^-?\\d+,-?\\d+$")) {
            System.out.println("INCORRECT VECTOR FORMAT, PLEASE USE THE FOLLOWING FORMAT: X,Y");
            return readVector();
        }
        return Arrays.stream(vector.split(",")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public int readAmountOfEnergy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much energy use to attack?");
        String amount = scanner.nextLine();
        if(!amount.matches("\\d+")) {
            System.out.println("INCORRECT AMOUNT OF ENERGY");
            return readAmountOfEnergy();
        }
        return Integer.parseInt(amount);
    }
}
