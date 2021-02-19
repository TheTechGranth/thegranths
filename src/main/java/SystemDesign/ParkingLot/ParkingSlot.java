package SystemDesign.ParkingLot;

import SystemDesign.ParkingLot.Model.ParkingSlotType;
import SystemDesign.ParkingLot.Model.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSlot {
    String name;

    public ParkingSlot(String name) {
        this.name = name;
    }
    boolean isAvailable;
    Vehicle vehicle;
    ParkingSlotType parkingSlotType;

    private void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable=false;
    }

    private void removeVehicle(Vehicle vehicle){
        this.vehicle=null;
        this.isAvailable=true;
    }
}
