import java.util.Scanner;

public class Menu {

    Redactor redactor = new Redactor();
    boolean theEndProgram = !false;

    public void mainMenu() {
        System.out.println("Menu: \n" +
                "Please enter command for action \n" +
                  "C - create \n" +
                  "R - read \n " +
                "U - update \n " +
                "D - delete \n " +
                "Exit - for finish the program");
    }

    public String [] route(String[] arr) {
        String command = readConsoleValue();
        if (command.equalsIgnoreCase("c")) {
            arr = createElement(arr);
        } else if (command.equalsIgnoreCase("r")) {
            readElement(arr);
        } else if (command.equalsIgnoreCase("u")) {
            arr = updateElement(arr);
        }else if (command.equalsIgnoreCase("d")){
            arr = deleteElement(arr);
        } else if (command.equalsIgnoreCase("exit")) {
            System.out.println("You exit from the programm. ");
            theEndProgram = !true;
        } else {
            System.out.println("Incorrect command, try again: ");
        }
        return arr;
    }


    public String[] createElement(String[] arr) {
        System.out.println("Please enter value of element: ");
        String value = readConsoleValue();
        arr = redactor.create(arr, value);
        return arr;
    }

    public String[] updateElement(String[] arr) {
        String value;
        int index;
        System.out.println("Please enter new value to update element: ");
        value = readConsoleValue();
        System.out.println("Please enter index: ");
        index = Integer.parseInt(readConsoleValue());
        arr = redactor.update(arr, index, value);
        return arr;
    }

    public String[] deleteElement(String[] arr) {
        int index;

        System.out.println("Please enter index to delete: ");
        index = Integer.parseInt(readConsoleValue());
        arr = redactor.delete(arr, index);
        return arr;
    }

    public void readElement(String[] arr) {
        redactor.read(arr);
    }


    public String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }

}
