
/*������� ������ ������������� ����������
        1���������������� ���������� ���� byte ����������� ����� ���� ����� �����
        2���������������� ���������� ���� short  ����������� ��������� ���� ����� �����
        3���������������� ���������� ���� int ����������� ������� ���� ����� �����
        4���������������� ���������� ���� long ����������� ��������� ���� ����� �����
        5�������� ��������� ���� byte ��������� ����� ���� ���������� ���� byte
        6�������� ���������� ���� byte ��������� ����� ���� ���������� ���� short , �������� �� ������ ���������� ���� byte
        7���������� ���� int �������� ��������� ������� ���� short , ���������� �� ��������� ������� ���� byte
        8�������� �������� ���� ������������� ���������� ��������� ������
        9�������� �������� ���� ���������� ��� ������������� ������ */


class Main {

    public static void main(String[] args) {
        //1
        byte a = 2+1; //byte ���������������� ������� ��� ����������
        //2
        short c = 5-1;
        //3
        int b = 6/2;
        //4
        long d = 2*3;

        //5
        byte a1 = 2, a2=3;
        System.out.println(a1 += a2);
        //6
        byte a3 =1, a4 =4;
        short c1 =5, c2 =6;
        System.out.println(a3 = (byte) ((c1+c2)/a4));
        //7
        byte a5 = 12, a6=3;
        short c3 = 1, c4=3;
        int b1 = 6/2;
        System.out.println(b1 = (c3/c4)*(a5/a6));
        //8
        int b2 = 2, b3 = 3, b4 = 4 ;
        System.out.println(b4=b2);
        System.out.println(b2=b3);
        System.out.println(b3=b4);
        //9
        int b5 = 2, b6 = 3;
        System.out.println(b5=b5+b6);
        System.out.println(b6=b5-b6);
        System.out.println(b5=b5-b6);

        /*���������� � �������� ���������(if-else)
        ������������
        1������ ��� ����������, ����� ���������� � ������������ ��������� (�������� ��� ���������� ������).
        2�������� �������� �������� � �������� ������� ��������� ������ ����� �� 1 �� 127 � ����������� ��� � ���� ������ byte. ������ 19 � �������� ������� 10011, � ������������� byte ��� 0001 0011
        3�������� ���������, �������� �������� �������� ��������, �� �������� � ������������.
                �� ������������
        4������ ������ ����������, ����� ������ �� ��������
*/




        int f1 = 2, f2 = 11, f3 = 5 ;
        String v="max";
        if ((f1 > f2) && (f1 > f2)) System.out.println(v = "b1 max");
            else {if ((f2 > f1) && (f2 > f3)) System.out.println(v = "b2 max");
                else {if ((f3 > f1) && (f3 > f2)) {System.out.println(v = "b3 max");
                    }
        else {
            System.out.println(v = "non max");
        }
        }
        }
                int n = 100;
                //System.out.print("Binary n is : ");
                StringBuilder sb = new StringBuilder();
                do {
                    sb.append(n % 2);
                    n = n / 2;
                } while (n != 0);

                System.out.println(sb.reverse());
        //sb=Byte.parseByte(sb);
        //int i4= 0x64;
        System.out.println(Integer.parseInt("1000", 2));
        System.out.println(Integer.toString(Integer.parseInt("10"), 2));

        }
        }

