import java.util.Random;

public class SimulatorEntity implements Comparable<SimulatorEntity>{

    enum SimulstorName {
       CROSS_BAR,
       DUMP_BELLS,
       HOOP,
       TREADMILL,
       STEP_MACHINE,
       FITNES_CYCLE;


        public static SimulstorName getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    private SimulstorName simulstorName;
    private Integer time;

    private String exercise;

    public SimulatorEntity(SimulstorName simulstorName, String exercise, Integer time) {
        this.simulstorName = simulstorName;
        this.exercise = exercise;
        this.time = time;
    }

    public String getExercise() {
        return exercise;
    }

    public SimulstorName getSimulstorName() {
        return simulstorName;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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
