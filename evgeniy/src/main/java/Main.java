
class Main {
    public static void main(String[] args) {
        int a = 2; //byte ���������������� ������� ��� ����������
        //byte x = a; //short  ����� ���� ������ ��� ����
        int b = 1;

        //System.out.println(x = a);

        System.out.println(a = a);
        System.out.println(b = a - b);
        System.out.println(a = a - b);
    }

}

