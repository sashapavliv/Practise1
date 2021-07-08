package Task2;

public class Drum implements Instrument{

    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum is plaing, his size is "+size);
    }
}
