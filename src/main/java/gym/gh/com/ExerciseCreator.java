package gym.gh.com;

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

    //add lose weight simulators to base
    private void looseWeightAdd(){
        looseWeight.add(SimulatorEntity.SimulatorName.FITNES_CYCLE);
        looseWeight.add(SimulatorEntity.SimulatorName.STEP_MACHINE);
        looseWeight.add(SimulatorEntity.SimulatorName.HOOP);
        looseWeight.add(SimulatorEntity.SimulatorName.TREADMILL);
    }

    //add muscles simulators to base
    private void createMusclesAdd(){
        createMuscles.add(SimulatorEntity.SimulatorName.CROSS_BAR);
        createMuscles.add(SimulatorEntity.SimulatorName.DUMP_BELLS);
    }

    private int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }

    //add all data to listDb
    private void createEx(){
        for (Iterator<SimulatorEntity.SimulatorName> it = looseWeight.iterator(); it.hasNext(); ) {
            SimulatorEntity.SimulatorName simulatorName = it.next();
            simulatorEntity = new SimulatorEntity(simulatorName, loseW, ranDig(30));
            allEx.add(simulatorEntity);
        }

        for (Iterator<SimulatorEntity.SimulatorName> it = createMuscles.iterator(); it.hasNext(); ) {
            SimulatorEntity.SimulatorName simulatorName = it.next();
            simulatorEntity = new SimulatorEntity(simulatorName, createMuscels, ranDig(25));
            allEx.add(simulatorEntity);
        }
    }

    public void showAllExercise(){
        for (Iterator<SimulatorEntity> it = allEx.iterator(); it.hasNext(); ) {
            SimulatorEntity simulatorEntity = it.next();
            printBouqetList(simulatorEntity);
        }
    }

    private void printBouqetList(SimulatorEntity simulatorEntity){
        System.out.print("Simulator: > " + simulatorEntity.getSimulatorName());
        System.out.print(" ||_Exersice type: > " + simulatorEntity.getExercise());
        System.out.print(" ||_time: > " + simulatorEntity.getTime()  + " min");
        System.out.println();
    }


}
