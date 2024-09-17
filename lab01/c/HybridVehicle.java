package c;
public class HybridVehicle implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double AvgMpg;
    private double miles;
    private double gallons;
    private double kWh;

    private final double MPG_E = 33.7;

    public double calcGasMPG() {
        gasMPG = miles/gallons;
        return gasMPG;
    }

    public double calcMPGe() {
        MpgE = (miles/kWh) * MPG_E;
        return  MpgE;
    }

    public double calcAvgMPG(){
        AvgMpg = (calcGasMPG() + calcMPGe()) / 2;
        return AvgMpg;
    }

    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public void setElectricMiles(double totalElectricMiles) {
        miles =  totalElectricMiles;
    }

    public void setTotalkWh(double totalkWh) {
        kWh = totalkWh;
    }

}
