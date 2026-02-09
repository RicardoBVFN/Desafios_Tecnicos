import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException{

        //URI targetUri = URI.create(args[0]);
        //HttpClient client = HttpClient.newHttpClient();
        //HttpRequest request = HttpRequest.newBuilder()
        //                                 .uri(targetUri)                    // code to recive the HTML
        //                                 .GET()
        //                                 .build();

        //HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //String recivedHtml = response.body();

        Path htmlPath = Path.of("test.html");
        String htmlContent = Files.readString(htmlPath, StandardCharsets.UTF_8);

        String[] htmlSegments = HtmlHarvest.HtmlSegmentation(htmlContent);
        String mostInternText = HtmlHarvest.MostInternTxtBlock(htmlSegments);
        System.out.println(mostInternText);
    }
}