package thread.tortoise;

public class Tortoise extends Thread {
    private static final int MILESTONE = 5;
    private final Thread tortoise;
    private float timeTakenByTortoiseToCompleteTheRace = 0f;

    public Tortoise(Thread tortoise) {
        this.tortoise = tortoise;
    }

    /**
     * This method return the time taken by tortoise to finish his race.
     *
     * @return time taken by tortoise to complete the race
     */
    public float getTimeTakenByTortoiseToCompleteTheRace() {
        return timeTakenByTortoiseToCompleteTheRace;
    }

    /**
     * This method sets the value of time taken by tortoise to finish his race
     *
     * @param timeTakenByTortoise time taken by tortoise to complete the race
     */
    public void setTimeTakenByTortoiseToCompleteTheRace(float timeTakenByTortoise) {
        this.timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoise;
    }

    public Thread getTortoise() {
        return tortoise;
    }
}
