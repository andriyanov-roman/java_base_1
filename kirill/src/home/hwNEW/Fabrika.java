import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Fabrika {

    public static void main(String[] args) throws IOException {

        ArrayList <Machine> NewCar = new ArrayList<Machine>();

        NewCar.add(Stroy());   //строит машины по требованию заказчика
        NewCar.addAll(getPark());  //gotoviy avtopark
        write(NewCar);         //параметры автоматически сохраняются в файл.
        show();               //Загрузить из файла(в который машини сохранялись)
        MaxPrice(NewCar);     //Найти самую дорогую машину
        SameColor(NewCar);    //Найти машины одного цвета
        dateQty(NewCar);      //Вернуть количество произведенных машин за интервал времени(Например за месяц)

    }

    public static void dateQty(ArrayList<Machine> v){
        int count=0;
        Calendar pered = Calendar.getInstance(); pered.set(2015, 7, 1);
        Calendar posle = Calendar.getInstance(); posle.set(2015, 6, 1);
        for (int i=0; i<v.size(); i++){
            if (v.get(i).getProdDate().before(pered.getTime()) == true &&
                    v.get(i).getProdDate().after(posle.getTime()) == true){
                count++;
            }
        }System.out.println(count+ " - kol-vo machine  za mesac");

    }

    public static void write(ArrayList<Machine> v) throws IOException {

        File f = new File("F:\\a.txt");

        FileWriter writer = new FileWriter(f, true);
        for (int i = 0; i < v.size(); i++) {
            writer.write(v.get(i).getName() + ", ");
            writer.write(v.get(i).getColor() + ", ");
            writer.write(v.get(i).getDesc() + ", ");
            writer.write(v.get(i).getFactoryname() + ", ");
            writer.write(v.get(i).getOwner() + ", ");
            writer.write(v.get(i).getNomber() + ", ");
            writer.write(v.get(i).getStatus() + ", ");
            writer.write(v.get(i).getType() + ", ");
            writer.write(v.get(i).getProdDate() +" "+ '\n');
        }
        writer.flush();
        writer.close();
    }

    public static void show() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
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
        for(int i=0; i<t.size();i++){
            for(int j=0; j<t.size(); j++){
                if (t.get(i).getColor().equals(t.get(j).getColor()) && !t.get(i).getName().equals(t.get(j).getName())){
                    System.out.println(t.get(j).getName()+" "+t.get(j).getColor());
                }
            }
        }
    }

    public static ArrayList<Machine> getPark() throws IOException{          //Park gotovih mashin

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
        car1.setProdDate(2015,06,19);
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
        car2.setProdDate(2015,07,19);
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
        car3.setProdDate(2015,05,11);
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

        car.setFactoryname(car.getName()+" Ink.");
        car.setStatus("Ready");
        car.setDesc("NewGen");
        car.setPrice(235000);
        car.setProdDate(2015,06,15);

        return car;
    }
}