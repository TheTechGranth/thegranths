package SystemDesign.ParkingLot.Model;

public enum ParkingSlotType {
    TwoWheeler{
        public double getPriceForParking(long duration){
            return duration*0.5;
        }
    },
    Compact{
        public double getPriceForParking(long duration){
            return duration*0.75;
        }
    },
    Medium{
        public double getPriceForParking(long duration){
            return duration*0.9;
        }
    },
    Large{
        public double getPriceForParking(long duration){
            return duration*1.0;
        }
    };

   public abstract double getPriceForParking(long duration);
}
