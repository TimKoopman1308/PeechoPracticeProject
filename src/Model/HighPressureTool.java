package Model;

import java.time.LocalDate;

public class HighPressureTool extends WaterTool {

    private float maxPressure;

    public HighPressureTool(float maxPressure) {
        this.maxPressure = maxPressure;
    }

    public HighPressureTool(char[] availableEnergyLevels, boolean isWorking, boolean fixable, String description, LocalDate productionDate, String name, float maxPressure) {
        super(availableEnergyLevels, isWorking, fixable, description, productionDate, name);
        this.maxPressure = maxPressure;
    }



    public float getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(float maxPressure) {
        this.maxPressure = maxPressure;
    }
}
