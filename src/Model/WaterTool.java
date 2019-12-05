package Model;

import java.time.LocalDate;

public class WaterTool extends Tool {

    private boolean saltWater;

    public WaterTool(){};

    public WaterTool(boolean saltWater) {
        this.saltWater = saltWater;
    }

    public WaterTool(char[] availableEnergyLevels, boolean isWorking, boolean fixable, String description, LocalDate productionDate, String name) {
        this (availableEnergyLevels, isWorking, fixable, description, productionDate, name,true); //whenever you want to use a constructor and specify some of the values as defaults
    }

    public WaterTool(char[] availableEnergyLevels, boolean isWorking, boolean fixable, String description, LocalDate productionDate, String name, boolean saltWater) {
        super(availableEnergyLevels, isWorking, fixable, description, productionDate, name);
        this.saltWater = saltWater;
    }

    public boolean isSaltWater() {
        return saltWater;
    }

    public void setSaltWater(boolean saltWater) {
        this.saltWater = saltWater;
    }
}
