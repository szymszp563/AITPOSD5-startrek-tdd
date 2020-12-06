import utils.InputReader;

import java.util.List;

public class Main {
    final static int COMMANDS_MODE = 0;
    final static int MANOEUVRE_MODE = 1;
    final static int BATTLE_MODE = 2;

    public static void main(String[] args) {

        int mode = COMMANDS_MODE; // the current mode
        InputReader inputReader = new InputReader();

        while (true)
        {
            if (mode == COMMANDS_MODE) { // the normal commands mode

                int command = inputReader.readCommand();
                switch (command) { // fill all commands here
                    case InputReader.MANOEUVRE_COMMAND:
                        System.out.println("ENTERING INTO THE MANOEUVRE MODE");
                        mode = MANOEUVRE_MODE;
                        break;
                    case InputReader.BATTLE_COMMAND:
                        System.out.println("ENTERING INTO THE BATTLE MODE");
                        mode = BATTLE_MODE;
                        break;
                }

            } else if (mode == MANOEUVRE_MODE) { // the movement of Enterprise

                List<Integer> vector = inputReader.readVector();
                mode = COMMANDS_MODE;

            } else if (mode == BATTLE_MODE) { // the battle protocol

                System.out.println("ENTERPRISE HAS ? ENERGY");// please code the right thing here
                int amountOfEnergy = inputReader.readAmountOfEnergy();
                if (amountOfEnergy == 0) {
                    System.out.println("ENTERING INTO THE COMMANDS MODE");
                    mode = COMMANDS_MODE;
                }

            }
        }

    }
}
