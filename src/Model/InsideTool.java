package Model;

import java.time.LocalDate;
import java.util.Arrays;

public class InsideTool extends Tool {

    private float optimalTemperature;
    private MaterialType materialType;

    public InsideTool(float optimalTemperature, MaterialType materialType) {
        this.optimalTemperature = optimalTemperature;
        this.materialType = materialType;
    }

    public InsideTool(char[] availableEnergyLevels, boolean isWorking, boolean fixable, String description, LocalDate productionDate, String name, float optimalTemperature, MaterialType materialType) {
        super(availableEnergyLevels, isWorking, fixable, description, productionDate, name);
        this.optimalTemperature = optimalTemperature;
        this.materialType = materialType;
    }


    public float getOptimalTemperature() {
        return optimalTemperature;
    }

    public void setOptimalTemperature(float optimalTemperature) {
        this.optimalTemperature = optimalTemperature;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return "InsideTool{" +
                "optimalTemperature=" + getOptimalTemperature() +
                ", materialType=" + getMaterialType() +
                "availableEnergyLevels=" + Arrays.toString(getAvailableEnergyLevels()) +
                ", isWorking=" + isWorking() +
                ", fixable=" + isFixable() +
                ", description='" + getDescription() + '\'' +
                ", productionDate=" + getProductionDate() +
                ", name='" + getName();
    }
}
