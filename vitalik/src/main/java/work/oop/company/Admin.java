package work.oop.company;

/**
 * ����� ��� ������
 */
public class Admin extends Empleey{

    private String osName;


    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    @Override
    public String toString() {
        return getName() +
                "osName='" + osName + '\'' +
                '}';
    }
}
