package Teste;

public interface ILibrary {
    public void addItem(LibraryItem item);
    public void removeItem(int id);
    public LibraryItem searchForItem(String title);
    public boolean borrowItem(int itemId, String borrowerName);
    public boolean returnItem(int itemId);
    public void printInventory();
}
