abstract class MedicalService {
    private String serviceName;
    private double basePrice;



    public MedicalService(String serviceName , double basePrice){
        this.serviceName = serviceName;
        this.basePrice = basePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract void calculateCost();
}

