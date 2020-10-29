package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;
    private final Thread tortoise;
    private float timeTakenByTortoiseToCompleteTheRace = 0f;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");
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

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0 -> System.out.println("The Tortoise has started from the start line!");
                case 1 -> System.out.println("The Tortoise has reached the Cool River!");
                case 2 -> System.out.println("The Tortoise has reached the Mountain Hill!");
                case 3 -> System.out.println("The Tortoise has reached the Big Oak Tree!");
                case 4 -> System.out.println("The Tortoise has reached the finish line!");
            }
            try {
                Thread.sleep(3000L);
                timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace + 3f;

            } catch (InterruptedException e) {
                System.err.println("The Tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
