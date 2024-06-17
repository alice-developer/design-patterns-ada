package DesignPatterns.behavioral.template_methods.repairs;

import DesignPatterns.behavioral.template_methods.VehicleToRepair;

public class CommonVehicleRepair extends RepairVehicleService {
    private VehicleToRepair vehicle;

    public CommonVehicleRepair(VehicleToRepair vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    protected boolean vehicleToRepair() {
        return vehicle.getDamagePercentage() <= 70;
    }
}
