import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Date;
//import java.text.SimpleDateFormat;
public class Fabrika {

    public static void main(String[] args) {

        ArrayList <Machine> NewCar = new ArrayList<Machine>();

        NewCar.add(Stroy());   //строит машины по требованию заказчика,как только машина построена, её параметры автоматически сохраняются в файл.
        NewCar.addAll(getPark());
        show(NewCar);         //Загрузить из файла(в который машини сохранялись)
        MaxPrice(NewCar);     //Найти самую дорогую машину
        SameColor(NewCar);    //Найти машины одного цвета

    }

    public static void show(ArrayList <Machine> t){
        for (int i = 0; i < t.size(); i++) {
            System.out.print(t.get(i).getName() + " ");
        }
        System.out.println();
    }

    public static void MaxPrice(ArrayList <Machine> t){           // Найти самую дорогую машину
        double max=t.get(0).getPrice();
        String WinnerName=t.get(0).getName();
        for (int i = 0; i < t.size(); i++) {
            if( t.get(i).getPrice() > max) {
                max = t.get(i).getPrice();
                WinnerName=t.get(i).getName();
            }
        }
        System.out.println(WinnerName+" "+max);
    }

    public static void  SameColor(ArrayList <Machine> t){          //Найти машины одного цвета
        String col = t.get(0).getColor();
        String name = t.get(0).getName();
        for (int i = 1; i <t.size(); i++) {
            if(t.get(i).getColor().equals(col)) {
                System.out.println(name+" "+col);
                System.out.println(t.get(i).getName()+" "+t.get(i).getColor());
            }
            else {
                col=t.get(i).getColor();
                name=t.get(0).getName();
            }

        }
    }

    public static ArrayList<Machine> getPark(){          //Park gotovih mashin
        ArrayList <Machine> Park = new ArrayList<Machine>();
        Machine car1 = new Machine();
        car1.setName("AudiTT");
        car1.setType("sedan");
        car1.setOwner("Borya");
        car1.setNomber(30156);
        car1.setColor("Black");
        car1.setFactoryname("Audi Ink.");
        car1.setStatus("Ready");
        car1.setDesc("goodCar");
        car1.setPrice(180500);
        car1.setProdDate("16.06.15");
        Park.add(car1);

        Machine car2 = new Machine();
        car2.setName("Ford");
        car2.setType("4*4");
        car2.setOwner("Egor");
        car2.setNomber(15498);
        car2.setColor("White");
        car2.setFactoryname("Ford Ink.");
        car2.setStatus("Ready");
        car2.setDesc("Notbed");
        car2.setPrice(350660);
        car2.setProdDate("19.07.15");
        Park.add(car2);

        Machine car3 = new Machine();
        car3.setName("Porshe");
        car3.setType("sedan");
        car3.setOwner("Larisa");
        car3.setNomber(6666);
        car3.setColor("White");
        car3.setFactoryname("Porshe Ink.");
        car3.setStatus("Ready");
        car3.setDesc("NiceCar");
        car3.setPrice(500100);
        car3.setProdDate("11.05.15");
        Park.add(car3);

        return Park;
    }

    public static Machine Stroy(){

        Scanner input= new Scanner(System.in);


        Machine car = new Machine();

        System.out.print("VVedite name: ");
        car.setName(input.nextLine());
        System.out.print("VVedite type: ");
        car.setType(input.nextLine());
        System.out.print("VVedite owner: ");
        car.setOwner(input.nextLine());
        System.out.print("VVedite color: ");
        car.setColor(input.nextLine());
        System.out.print("VVedite nomber: ");
        car.setNomber(input.nextInt());

        car.setFactoryname("Mitsubishi");
        car.setStatus("Ready");
        car.setDesc("NewGen");
        car.setPrice(235000);
        car.setProdDate("12.06.15");


        return car;
    }
}
