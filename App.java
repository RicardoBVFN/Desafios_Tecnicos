import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
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

        //htmlContent = htmlContent.replaceAll("[\\n?\\r]", " ");

        String[] parts = htmlContent.split("[\\n?\\r]");
        String htmlVii = "";

        for(String part : parts){
            part = part.trim();
            htmlVii = htmlVii.concat(part);
        }

        //htmlContent = htmlContent.replaceAll("[\\t?\\r]", "");

        //while(htmlContent.indexOf("\n") >= 0 && htmlContent.indexOf("\t") >= 0){
            //if(htmlContent.indexOf("\n") >= 0){

            //}
        //}

        System.out.println("\n" + htmlVii + "\n");
        //System.out.println(htmlContent);



        //System.out.printf("\nHTML recebido da página: %s", recivedHtml);
    }
}