import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ExerciseCreator {

    SimulatorEntity simulatorEntity;
    private String  loseW = "LooseWeight";
    private String  createMuscels = "createMuscels";
    List allEx = new ArrayList();
    private List looseWeight = new ArrayList();
    private List createMuscles = new ArrayList();

    public ExerciseCreator() {
        looseWeightAdd();
        createMusclesAdd();
        createEx();
    }

    private void looseWeightAdd(){
        looseWeight.add(SimulatorEntity.SimulstorName.FITNES_CYCLE);
        looseWeight.add(SimulatorEntity.SimulstorName.STEP_MACHINE);
        looseWeight.add(SimulatorEntity.SimulstorName.HOOP);
        looseWeight.add(SimulatorEntity.SimulstorName.TREADMILL);
    }

    private void createMusclesAdd(){
        createMuscles.add(SimulatorEntity.SimulstorName.CROSS_BAR);
        createMuscles.add(SimulatorEntity.SimulstorName.DUMP_BELLS);
    }

    private int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }

    private void createEx(){
        for (Iterator<SimulatorEntity.SimulstorName> it = looseWeight.iterator(); it.hasNext(); ) {
            SimulatorEntity.SimulstorName simulstorName = it.next();
            simulatorEntity = new SimulatorEntity(simulstorName, loseW, ranDig(30));
            allEx.add(simulatorEntity);
        }

        for (Iterator<SimulatorEntity.SimulstorName> it = createMuscles.iterator(); it.hasNext(); ) {
            SimulatorEntity.SimulstorName simulstorName = it.next();
            simulatorEntity = new SimulatorEntity(simulstorName, createMuscels, ranDig(25));
            allEx.add(simulatorEntity);
        }
    }

    public void showAllExercise(){
        //sortItemList();
        for (Iterator<SimulatorEntity> it = allEx.iterator(); it.hasNext(); ) {
            SimulatorEntity simulatorEntity = it.next();
            printBouqetList(simulatorEntity);
        }
    }

    private void printBouqetList(SimulatorEntity simulatorEntity){
        System.out.print("Simulator: > " + simulatorEntity.getSimulstorName());
        System.out.print(" ||_Exersice type: > " + simulatorEntity.getExercise());
        System.out.print(" ||_time: > " + simulatorEntity.getTime()  + " min");
        System.out.println();
    }


}
