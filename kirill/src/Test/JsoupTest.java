import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class JsoupTest {

    @Test
    public void JsoupTest() throws Exception {
        Document doc = Jsoup.connect("http://www.ex.ua/80330191").get();
        String title = doc.title();
        System.out.println("test -" +title);
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            if (link.attr("href").contains("/get/") && link.text().contains(".mp3")) {
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
            }
        }


    }
}
