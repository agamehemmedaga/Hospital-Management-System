public class Therapy extends MedicalService{
    private int sessionCount;

    public  Therapy(String serviceName , double basePrice , int sessionCount){
        super(serviceName , basePrice);
        this.sessionCount = sessionCount;
    }

    @Override
    public void calculateCost(){
        System.out.println(getServiceName()+":Müalicəsi:");
        System.out.println("-> Terapiya qiyməti:"+getBasePrice()+"AZN");
        System.out.println("-> Təyin olunan seans sayısı:" +sessionCount+"dəfə");
        System.out.println("-> Toplam ödəniş:"+getBasePrice()*sessionCount+"AZN");
    }

}
