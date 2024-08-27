import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.scrapethissite.com/pages/forms/";
        Document document = Jsoup.connect(url).get();
        Elements teams = document.select(".team");
        for (Element team : teams){
            String name = team.select(".name").text();
            System.out.println(name);
        }
    }
}