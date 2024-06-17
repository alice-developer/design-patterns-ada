package DesignPatterns.behavioral.template_methods.repairs;

public abstract class RepairVehicleService {
    protected abstract boolean vehicleToRepair();

    public void repairVehicle() {
        entranceToWorkshop();
        analyseDamage();

        if (vehicleToRepair()) {
            vehicleToRepair();
            notifyRepairToInsuranceCompany();
        } else {
            notifyTotalLossToInsuranceCompany();
        }
    }

    private void notifyTotalLossToInsuranceCompany() {
        System.out.println("Notificando perda total para a Seguradora...");
    }

    private void entranceToWorkshop() {
        System.out.println("Entrando para a oficina de reparo...");
    }

    private void analyseDamage() {
        System.out.println("Analisando danos...");
    }

    private void notifyRepairToInsuranceCompany() {
        System.out.println("Notificando reparo para a Seguradora...");
    }
}
