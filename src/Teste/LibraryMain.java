package Teste;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        ILibrary library = new Library();
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("7")) {
            System.out.println("Library Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Search for item");
            System.out.println("4. Borrow item");
            System.out.println("5. Return item");
            System.out.println("6. Print inventory");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.next();

            switch (choice) {
                case "1":
                    // adicionar um item
                    System.out.println("Insira qual item pretende adicionar(1 - Book / 2 - DVD)");
                    int add_item = scanner.nextInt();
                    
                    System.out.println("Insira o seu nome: ");
                    String name = scanner.next();

                    System.out.println("Insira o titulo do item: ");
                    String itemTitle = scanner.next();

                    System.out.println("Insira a ID do item: ");
                    int itemId = Integer.parseInt(scanner.next());

                    if (add_item == 1) {
                        System.out.println("Insira o nome do autor: ");
                        String autor = scanner.next();

                        Book book = new Book(itemId, itemTitle, false , name , autor);
                        library.addItem(book);
                    } else if (add_item == 2) {
                        System.out.println("Insira a duração em minutos: ");
                        int duracao = Integer.parseInt(scanner.next());

                        DVD dvd = new DVD(itemId, itemTitle, false , name , duracao);
                        library.addItem(dvd);
                    } else {
                        System.out.println("Escolha inválida!");
                    }
                    break;
                case "2":
                    // remove item
                    System.out.println("Enter item ID: ");
                    itemId = scanner.nextInt();
                    library.removeItem(itemId);
                    break;
                case "3":
                    // search for item
                    System.out.println("Insira o titulo: ");
                    itemTitle = scanner.nextLine();
                    LibraryItem item = library.searchForItem(itemTitle);
                    if (item == null) {
                        System.out.println("Item não encontrado!");
                    } else {
                        System.out.println(item.toString());
                    }
                    break;
                case "4":
                    // borrow item
                    System.out.println("Insira o ID: ");
                    itemId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Insira o nome do utilizador: ");
                    String borrowerName = scanner.nextLine();
                    boolean success = library.borrowItem(itemId, borrowerName);
                    if (success) {
                        System.out.println("Item emprestado com sucesso!");
                    } else {
                        System.out.println("Item não disponivel para emprestimo!");
                    }
                    break;
                case "5":
                    // return item
                    System.out.println("Insira a ID: ");
                    itemId = Integer.parseInt(scanner.nextLine());
                    success = library.returnItem(itemId);
                    if (success) {
                        System.out.println("Item devolvido!");
                    } else {
                        System.out.println("Item não emprestado ou já devolvido!");
                    }
                    break;
                case "6":
                    // print inventory
                    library.printInventory();
                    break;
                case "7":
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    // imprimir mensagem de erro
                    System.out.println("Opcão Inválida!");
            }
        }
        scanner.close();
    }
}
