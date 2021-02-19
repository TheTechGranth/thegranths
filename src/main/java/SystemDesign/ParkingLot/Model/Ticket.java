package SystemDesign.ParkingLot.Model;

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
    ParkingSlotType parkingSlotType;

    public static Ticket createTicket(String vehicleNumber,VehicleCategory vehicleCategory,ParkingSlotType parkingSlotType){
        return Ticket.builder()
                .parkingSlotType(parkingSlotType)
                .startTime(System.currentTimeMillis())
                .vehicleNumber(vehicleNumber)
                .ticketNumber(vehicleNumber+System.currentTimeMillis())
                .vehicleCategory(vehicleCategory)
                .build();
    }
}
