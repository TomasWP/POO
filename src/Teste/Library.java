package Teste;
import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary{
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(int itemId) {
        for (LibraryItem item : items) {
            if (item.getId() == itemId) {
                items.remove(item);
                System.out.println("Item removido!");
                return;
            }
        }
        System.out.println("Item não encontrado!");

    }

    public LibraryItem searchForItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public boolean borrowItem(int itemId, String borrowerName) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Item com ID " + itemId + " não encontrado!");
            return false;
        }
        if (item.getDisponiblidade()) {
            System.out.println("Item com ID " + itemId + " não encontrado!");
            return false;
        }
        item.checkout(borrowerName);
        System.out.println("Item com ID " + itemId + " foi emprestado por " + borrowerName + "!");
        return true;
    }

    private LibraryItem findItemById(int itemId) {
        for (LibraryItem item : items) {
            if (item.getId() == itemId) {
                return item;
            }
        }
        return null;
    }

    public boolean returnItem(int itemId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Item com ID " + itemId + " não encontrado");
            return false;
        }
        if (item.getDisponiblidade()) {
            System.out.println("Item com ID " + itemId + " já está disponivel!");
            return false;
        }
        item.returnItem();
        System.out.println("Item com ID " + itemId + " foi devolvido!");
        return true;
    }

    public void printInventory() {
        for (LibraryItem item : items) {
            System.out.println(item.toString());
        }
    }
}
