package DesignPatterns.behavioral.template_methods;

public class VehicleToRepair {
    private int damagePercentage;

    public VehicleToRepair(int damagePercentage) {
        this.damagePercentage = damagePercentage;
    }

    public int getDamagePercentage() {
        return damagePercentage;
    }

    public void setDamagePercentage(int damagePercentage) {
        this.damagePercentage = damagePercentage;
    }
}
