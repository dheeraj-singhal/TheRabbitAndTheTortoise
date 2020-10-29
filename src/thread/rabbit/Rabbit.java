package thread.rabbit;

import javax.swing.*;

public class Rabbit implements Runnable {

    private static final int MILESTONES = 5;
    private static float timeTakenByRabbitToCompleteTheRace = 0f;

    private final Thread rabbit;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    /**
     * This method return the time taken by rabbit to finish his race.
     *
     * @return time taken by rabbit to complete the race
     */
    public float getTimeTakenByRabbitToCompleteTheRace() {
        return timeTakenByRabbitToCompleteTheRace;
    }

    /**
     * This method sets the value of time taken by rabbit to finish his race
     *
     * @param timeTakenByRabbit time taken by rabbit to complete the race
     */
    public void setTimeTakenByRabbitToCompleteTheRace(float timeTakenByRabbit) {
        Rabbit.timeTakenByRabbitToCompleteTheRace = timeTakenByRabbit;
    }

    public Thread getRabbit() {
        return rabbit;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0 -> System.out.println("The Rabbit has started from the start line!");
                case 1 -> System.out.println("The Rabbit has reached the Cool River!");
                case 2 -> System.out.println("The Rabbit has reached the Mountain Hill!");
                case 3 -> {
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(9000L);
                        timeTakenByRabbitToCompleteTheRace = timeTakenByRabbitToCompleteTheRace + 9f;
                    } catch (InterruptedException e) {
                        System.err.println("The Rabbit's sleep got interrupted!");
                    }
                }
                case 4 -> System.out.println("The Rabbit has reached the finish line!");
            }
            try {
                Thread.sleep(1500L);
                timeTakenByRabbitToCompleteTheRace = timeTakenByRabbitToCompleteTheRace + 1.5f;

            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Rabbit has completed the race!",
                "Rabbit",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
