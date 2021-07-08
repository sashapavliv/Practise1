package Task1;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("It's book " + name);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("Books:");
        for (Printable i : printable) {
            if (i instanceof Book) {
                i.print();
            }
        }
    }
}
