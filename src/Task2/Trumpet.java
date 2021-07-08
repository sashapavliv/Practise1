package Task2;

public class Trumpet implements Instrument{

    int diametr;

    public Trumpet(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Trumpet is plaing, his diametr is "+diametr);

    }
}
