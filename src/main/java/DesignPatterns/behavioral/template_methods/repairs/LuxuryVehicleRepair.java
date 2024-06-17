package DesignPatterns.behavioral.template_methods.repairs;

import DesignPatterns.behavioral.template_methods.VehicleToRepair;

public class LuxuryVehicleRepair extends RepairVehicleService {
    private VehicleToRepair vehicle;

    public LuxuryVehicleRepair(VehicleToRepair vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    protected boolean vehicleToRepair() {
        return vehicle.getDamagePercentage() <= 50;
    }
}
