package Task2;

public class Main {
    public static void main(String[] args) {
        Instrument [] arrayOfInstruments = {new Guitar(6),new Drum(30),new Trumpet(15)};
        for (Instrument i : arrayOfInstruments){
            i.play();
        }
    }
}
