import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

    
        
        //Ex1 : tính cạnh huyền tam giác
        System.out.println("Ex1 : tính cạnh huyền tam giác");
        int a = 3;
        int b = 4;
        double  c = Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2)) ;
        System.out.println("Cạnh huyền c = a^2 + b^2 = " + c);
        System.out.println("--------------------------------------------------");

        //Ex2 : tính BMI kg/cm^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex2 : tính BMI");

        System.out.println("Cân nặng (kg) = ");
        double kg = sc.nextDouble();

        System.out.println("Chiều cao (cm)= ");
        double cm = sc.nextDouble();

        double BMI = kg / (Math.pow(cm/100,2));
        System.out.printf("Chỉ số BMI của bạn: %.5f \n", BMI);

        if (BMI < 18.5) 
            {System.out.println("NGƯỜI GẦY");}
        if (BMI >=18.5 && BMI <=24.9) 
            {System.out.println("NGƯỜI BÌNH THƯỜNG");}
        if (BMI > 24.9) 
            {System.out.println("NGƯỜI BÉO");}
    }
}
