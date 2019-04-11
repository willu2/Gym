package gym.gh.com;

import java.util.Random;

/*item entity class*/
public class SimulatorEntity implements Comparable<SimulatorEntity>{

    enum SimulatorName {
       CROSS_BAR,
       DUMP_BELLS,
       HOOP,
       TREADMILL,
       STEP_MACHINE,
       FITNES_CYCLE;


        public static SimulatorName getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    private SimulatorName simulatorName;
    private Integer time;

    private String exercise;

    public SimulatorEntity(SimulatorName simulatorName, String exercise, Integer time) {
        this.simulatorName = simulatorName;
        this.exercise = exercise;
        this.time = time;
    }

    public String getExercise() {
        return exercise;
    }

    public SimulatorName getSimulatorName() {
        return simulatorName;
    }

    public Integer getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Simulator [time=" + time + "]";
    }

    @Override
    public int compareTo(SimulatorEntity o) {
        return this.getTime().compareTo(o.getTime());
    }
}
