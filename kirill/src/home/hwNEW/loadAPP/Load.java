package loadAPP;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Load {
    @FXML
    TextField adress;
    @FXML
    TextField urladress;
    @FXML
    Label info;

    public void begin(ActionEvent event) throws IOException {
        try {
            FileOutputStream outputStream = null;
            ArrayList<String> urls = new ArrayList<>(loadUrls());
            for (int i = 0; i < urls.size(); i++) {
                URL url = new URL(urls.get(i));
                InputStream is = url.openStream();
                outputStream = new FileOutputStream(new File(adress.getText().toString()+"\\"+i + ".mp3"));
                byte[] buffer = new byte[2048];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                outputStream.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        info.setText("Finished!");
    }

    public Set<String> loadUrls() {   //список ссылок для загрузки
        Set<String> urls = new HashSet<>();
        try {
            URL url = new URL(urladress.getText().toString());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));         //страница в баффере
            String line;
            Pattern pattern = Pattern.compile("href='([^']+)");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    if (matcher.group().contains("/get/")) {
                        urls.add("http://www.ex.ua" + matcher.group(1));                                 //начало ссылки
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls;
    }
}
