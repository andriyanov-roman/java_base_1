//Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
//как, например, в билетах с номерами 003102 или 567576.
//С помощью программы, подсчитайте сколько счастливых билетов
public class SchastliviBilet {

    public static void main(String[] args) {
        int x=999999,
                count=0,
                digit1,
                digit2,
                digit3,
                digit4,
                digit5,
                digit6;

        while(x>=0){
            x--;
            digit1=  x /1000000;
            digit2 = x %1000000/100000;
            digit3 = x %1000000%100000/10000;
            digit4 = x %1000000%100000%10000/1000;
            digit5 = x %1000000%100000%10000%1000/100;
            digit6 = x %1000000%100000%10000%1000%100/10;

            if(digit1+digit2+digit3==digit4+digit5+digit6){
                count++;}
        }
        System.out.printf("Kolichestvo schastlivih nomerov = "+count);

    }}