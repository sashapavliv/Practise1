package Task1;

public class Magazine implements Printable{
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("It's magazine "+name);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("Magazines:");
        for (Printable i : printable) {
            if (i instanceof Magazine) {
                i.print();
            }
        }
    }

}
