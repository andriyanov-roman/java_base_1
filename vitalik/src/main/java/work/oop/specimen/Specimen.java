package work.oop.specimen;

public class Specimen {
    private static Specimen instanceClass; //создаем экземпляр

    private Specimen(){} // обозначаем конструктор приватным

    public static Specimen getInstanceClass(){ // инициализируем экземпляр
        if(instanceClass == null){
            instanceClass = new Specimen();
        }
        return instanceClass;
    }
}