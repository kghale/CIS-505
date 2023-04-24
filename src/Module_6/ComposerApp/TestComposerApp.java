package Module_6.ComposerApp;

import java.util.Scanner;

public class TestComposerApp {
    private static ComposerDao composerDao = new MemComposerDao();

    public static void main(String[] args) {
        System.out.println("\tWelcome to the Composer App\n");
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\tMENU OPTIONS");
            System.out.println("\t\t1. View Composers");
            System.out.println("\t\t2. Find Composers");
            System.out.println("\t\t3. Add Composers");
            System.out.println("\t\t4. Exit");
            System.out.print("\n\tPlease choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    listComposers();
                    break;
                case 2:
                    findComposerById(scanner);
                    break;
                case 3:
                    addNewComposer(scanner);
                    break;
                case 4:
                    System.out.println("\n\tProgram terminated by user...");
                    break;
                default:
                    System.out.println("\n\tInvalid option, please try again.");
            }
        } while (option != 4);

        scanner.close();
    }

    private static void listComposers() {
        System.out.println("\n\t--DISPLAYING COMPOSERS--");
        for (Composer composer : composerDao.findAll()) {
            System.out.println(composer.toString());
        }
    }

    private static void findComposerById(Scanner scanner) {
        System.out.print("\n\tEnter an id: ");
        int id = scanner.nextInt();
        Composer composer = composerDao.findBy(id);
        if (composer != null) {
            System.out.println("\n\t--DISPLAYING COMPOSER--");
            System.out.println(composer.toString());
        } else {
            System.out.println("\n\tComposer with id " + id + " not found.\n");
        }
    }

    private static void addNewComposer(Scanner scanner) {
        System.out.print("\n\tEnter an id: ");
        int id = scanner.nextInt();
        System.out.print("\tEnter a name: ");
        String name = scanner.next();
        System.out.print("\tEnter a genre: ");
        String genre = scanner.next();

        Composer newComposer = new Composer(id, name, genre);
        composerDao.insert(newComposer);
    }
}
