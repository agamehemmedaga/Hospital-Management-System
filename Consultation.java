public class Consultation extends  MedicalService{
    private String doctorTitle;

    public Consultation(String serviceName , double basePrice , String doctorTitle){
        super(serviceName , basePrice);
        this.doctorTitle = doctorTitle;
    }

    @Override
    public void calculateCost(){
        System.out.println(getServiceName()+ "Xidməti:");
        System.out.println("-> Həkimin dərəcəsi:"+doctorTitle);
        System.out.println("->Konsultasiya qiyməti:"+getBasePrice()+"AZN");
    }
}
