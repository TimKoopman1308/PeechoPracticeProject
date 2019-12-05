package Controller;

import Model.*;


import java.time.LocalDate;

public class main {


    public static void main(String[] args) {

        InsideTool insideTool = new InsideTool(new char[]{'a', 'b'}, false, true, "handsaw", LocalDate.now(), "epic hacksaw", 20, MaterialType.WOOD);

        OutsideTool outsideTool = new OutsideTool(new char[]{'a', 'b'},false, true, "Hark", LocalDate.now(),"hark 1",true);

        WaterTool waterTool = new WaterTool(new char[]{'a', 'b'}, false, true, "gardenhose",LocalDate.now(), "Snakey",false);

        HighPressureTool highPressureTools= new HighPressureTool(new char[]{'a', 'b'}, false, true, "hogedrukreiniger",LocalDate.now(),"die harde spuiter", 100);

        System.out.println(ToolService.getQuote(waterTool));

        System.out.println(insideTool.toString());
        ToolService.fix(insideTool);
        System.out.println(insideTool.toString());

    }
}