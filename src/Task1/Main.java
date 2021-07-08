package Task1;

public class Main {
    public static void main(String[] args) {
        Printable [] array = {new Book("Tom Soyer"),new Book("Ever last"),new Magazine("New York Times"),new Magazine("Forbes")};
        for (Printable i : array){
            i.print();
        }
        System.out.println("----------Static methods---------");
        Magazine.printMagazines(array);
        Book.printBooks(array);
    }
}
