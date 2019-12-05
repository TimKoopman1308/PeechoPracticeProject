package Model;

import java.time.LocalDate;
import java.util.Arrays;

public class Tool {

    private char[] availableEnergyLevels;
    private boolean isWorking; //convention to name working
    private boolean fixable;
    private String description;
    private LocalDate productionDate;
    private String name;


    public Tool() {
    }


    public Tool(char[] availableEnergyLevels, boolean isWorking, boolean fixable, String description, LocalDate productionDate, String name) {
        this.availableEnergyLevels = availableEnergyLevels;
        this.isWorking = isWorking;
        this.fixable = fixable;
        this.description = description;
        this.productionDate = productionDate;
        this.name = name;
    }

    public char[] getAvailableEnergyLevels() {
        return availableEnergyLevels;
    }

    public void setAvailableEnergyLevels(char[] availableEnergyLevels) {
        this.availableEnergyLevels = availableEnergyLevels;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isFixable() {
        return fixable;
    }

    public void setFixable(boolean fixable) {
        this.fixable = fixable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "availableEnergyLevels=" + Arrays.toString(availableEnergyLevels) +
                ", isWorking=" + isWorking +
                ", fixable=" + fixable +
                ", description='" + description + '\'' +
                ", productionDate=" + productionDate +
                ", name='" + name + '\'' +
                '}';
    }
}

