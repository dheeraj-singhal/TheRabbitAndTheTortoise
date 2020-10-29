package thread.tortoise;

public class Tortoise extends Thread {
    private static final int MILESTONE = 5;
    private float timeTakenByTortoiseToCompleteTheRace = 0f;

    private final Thread tortoise;

    public Tortoise(Thread tortoise) {
        this.tortoise = tortoise;
    }
}
