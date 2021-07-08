package Task2;

public class Guitar implements Instrument{

    int amountOfChord;

    public Guitar(int amountOfChord) {
        this.amountOfChord = amountOfChord;
    }

    @Override
    public void play() {
        System.out.println("Guitar is plaing and have "+amountOfChord+" chords");
    }
}
