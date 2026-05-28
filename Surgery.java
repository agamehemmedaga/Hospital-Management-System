public class Surgery extends MedicalService{
    private double equipmentCost;


    public Surgery(String serviceName , double basePrice , double equipmentCost){
        super(serviceName , basePrice);
        this.equipmentCost = equipmentCost;
    }

    @Override
    public void calculateCost(){
        System.out.println(getServiceName()+" Əməliyyatı:");
        System.out.println("-> Əsas xidmət haqqı:"+getBasePrice()+"AZN");
        System.out.println("-> Avadanlıq xərci:"+equipmentCost+"AZN");
        System.out.println("-> Ümumi Cəm :"+(getBasePrice()+equipmentCost)+"AZN");

    }
}

