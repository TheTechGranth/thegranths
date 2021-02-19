package SystemDesign.ParkingLot.Model;

import SystemDesign.ParkingLot.ParkingSlot;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Builder
@Getter
@Setter
public class Ticket {
    String ticketNumber;
    String vehicleNumber;
    long startTime;
    long endTime;
    VehicleCategory vehicleCategory;
    ParkingSlot parkingSlot;

    public static Ticket createTicket(String vehicleNumber,VehicleCategory vehicleCategory,ParkingSlot parkingSlot){
        return Ticket.builder()
                .parkingSlot(parkingSlot)
                .startTime(System.currentTimeMillis())
                .vehicleNumber(vehicleNumber)
                .ticketNumber(vehicleNumber+System.currentTimeMillis())
                .vehicleCategory(vehicleCategory)
                .build();
    }
}
