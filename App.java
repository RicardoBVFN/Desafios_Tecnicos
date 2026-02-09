import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException{

        URI targetUri = URI.create(args[0]);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(targetUri) 
                                         .GET()
                                         .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String recivedHtml = response.body();

        System.out.println(recivedHtml);

        String[] htmlSegments = HtmlHarvest.HtmlSegmentation(recivedHtml);
        if(HtmlHarvest.IsMalformed(htmlSegments)){
            String mostInternText = HtmlHarvest.MostInternTxtBlock(htmlSegments);
            System.out.println(mostInternText);
        } else{
            System.out.println("malformed HTML");
        }
    }
}