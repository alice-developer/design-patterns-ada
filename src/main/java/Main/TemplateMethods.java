package Main;

import DesignPatterns.behavioral.template_methods.VehicleToRepair;
import DesignPatterns.behavioral.template_methods.repairs.CommonVehicleRepair;
import DesignPatterns.behavioral.template_methods.repairs.LuxuryVehicleRepair;

public class TemplateMethods {
    public static void main(String[] args) {
        System.out.println("----------------- LUXO -----------------");
        VehicleToRepair luxuryVehicle = new VehicleToRepair(51);
        LuxuryVehicleRepair luxuryRepair = new LuxuryVehicleRepair(luxuryVehicle);

        luxuryRepair.repairVehicle();
        System.out.println("----------------- COMUM -----------------");
        VehicleToRepair commonVehicle = new VehicleToRepair(70);
        CommonVehicleRepair commonRepair = new CommonVehicleRepair(commonVehicle);

        commonRepair.repairVehicle();
    }
}
