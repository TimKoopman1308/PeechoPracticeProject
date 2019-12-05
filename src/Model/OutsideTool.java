package Model;

import java.time.LocalDate;

public class OutsideTool extends Tool {

    private boolean rainResistant;

    public OutsideTool(boolean rainResistant) {
        this.rainResistant = rainResistant;
    }

    public OutsideTool(char[] availableEnergyLevels, boolean isWorking, boolean fixable, String description, LocalDate productionDate, String name, boolean rainResistant) {
        super(availableEnergyLevels, isWorking, fixable, description, productionDate, name);
        this.rainResistant = rainResistant;
    }

    public boolean isRainResistant() {
        return rainResistant;
    }

    public void setRainResistant(boolean rainResistant) {
        this.rainResistant = rainResistant;
    }
}
