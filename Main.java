//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MedicalService [] medicalServices = new MedicalService[3];

        medicalServices [0]  = new Surgery("Surgery" , 1500 , 3000);
        medicalServices [1] = new Therapy("Therapy",500 , 5 );
        medicalServices [2] = new Consultation("Consultation" ,50 , "Professor" );

        System.out.println("---Medical-Hospital---/n");


        for (MedicalService  m : medicalServices){
            m.calculateCost();
            System.out.println("-----------------");
        }

    }
}