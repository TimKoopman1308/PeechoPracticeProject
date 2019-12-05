package Model;

public abstract class ToolService {

    private final static double HIGH_PRESSURE_SURTAX = 1.25;


    public int getQuote(InsideTool insideTool) {
        int price;
        switch (insideTool.getMaterialType()) {
            case WOOD:
                price = 10;
                break;
            case ALUMINIUM:
                price = 15;
                break;
            case GLASS:
                price = 35;
                break;
            default:
                price = 20;
        }
        return price;
    }


    public int getQuote(OutsideTool outsideTool) {
        return 30;
    }

    public static int getQuote(WaterTool waterTool) {
        if (waterTool.isSaltWater()) {
            return 25;
        } else return 15;
    }

    public double getQuote(HighPressureTool highPressureTools) {
        return  getQuote(((WaterTool)highPressureTools))+ highPressureTools.getMaxPressure() * HIGH_PRESSURE_SURTAX;
    }

    public static void fix(Tool tool) {
        if (!tool.isWorking()) {
            if (tool.isFixable()) {
                tool.setWorking(true);
            }
        }

    }

}

