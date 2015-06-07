package IOfun;

import company.Office;
import company.Plankton;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IoTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    public static void write() throws IOException, ClassNotFoundException {
        LocalDate today = LocalDate.now();
        FileOutputStream outputStream = new FileOutputStream("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\IOfun\\" + today.toString() + ".txt");
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);

        ArrayList<Plankton> ludi = new ArrayList<>();
        ludi.addAll(Office.getProgrammers());

        for (int i = 0; i < ludi.size(); i++) {
            oos.writeObject(ludi.get(i));
        }
        oos.flush();
        outputStream.close();
        oos.close();

//        ArrayList<Plankton> ludi = new ArrayList<>();    <<<ILI tak)
//        ludi.add(Office.getProgrammers().get(0));
//        ludi.addAll(Office.getManagers());
//        oos.writeObject(ludi);
//        oos.flush();
//        oos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        File dir = new File("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\IOfun");
        ArrayList<Plankton> test = new ArrayList<>();
        for (String path : dir.list()) {
            if (path.contains(".txt")) {

                FileInputStream fis = new FileInputStream("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\IOfun\\" + path);
                ObjectInputStream oin = new ObjectInputStream(fis);

//                ArrayList<Plankton> test = (ArrayList<Plankton>) oin.readObject();
//                System.out.println("Proba "+test.get(0).getName());

                while (fis.available() > 0) {
                    Plankton t = (Plankton) oin.readObject();
                    test.add(t);
                }

                String s = path.split("\\.")[0];
                LocalDate specific = LocalDate.now();
                LocalDate x = LocalDate.parse(s);
                if (specific.compareTo(x) >= 3) {
                    byte[] buffer = new byte[1024];
                    FileOutputStream fos = new FileOutputStream("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\IOfun\\MyFile.zip");
                    ZipOutputStream zos = new ZipOutputStream(fos);
                    ZipEntry ze = new ZipEntry(path);
                    zos.putNextEntry(ze);

                    int len;
                    while ((len = oin.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }

                    oin.close();
                    zos.closeEntry();
                    zos.close();

                    System.out.println("Done");
                }
                System.out.println(specific.compareTo(x));
            }
        }
    }
}

