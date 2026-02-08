import java.util.ArrayList;
import java.util.List;

public class HtmlHarvest{

    public static String MostInternText(String htmlText){
        int identationIndex = 0;
        List<TextBlock> textBlocks = new ArrayList<>();
        String mostInternText;
        
        String[] parts = htmlText.split("[\\n?\\r]");
        //String htmlVii = "";

        for(String part : parts){
            part = part.replaceAll("\t", "");
            part = part.trim();

            if(part != "" && part != null){
                if(part.contains("<") ){
                    if(part.contains("/")){
                        identationIndex--;
                    } else{
                        identationIndex++;
                    }
                    continue;
                } else{
                    TextBlock block = new TextBlock();
                    block.setTextMessage(part);
                    block.setIdentationIndex(identationIndex);
                    textBlocks.add(block);
                }
            }
        }

        System.out.println(textBlocks.toString());

        return "";
    }
}