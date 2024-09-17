package c;

public class CarRunner {

    public static void main(String[] args) {
        HybridVehicle aHybrid = new HybridVehicle();

        aHybrid.setElectricMiles(100);
        aHybrid.setTotalkWh(35.0);
        aHybrid.setGallonsfromGas(5.0);
        double MPGe = aHybrid.calcMPGe();
        double gasMPG = aHybrid.calcGasMPG();
        double avg = aHybrid.calcAvgMPG();
        System.out.println(gasMPG);
        System.out.println(MPGe);
        System.out.println(avg);

    }

}