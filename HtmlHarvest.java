import java.util.ArrayList;
import java.util.List;

public class HtmlHarvest{

    public static String[] HtmlSegmentation(String htmlText){
        String[] parts = htmlText.split("[\\r?\\n]");
        for(int i = 0; i < parts.length; i++){
            parts[i] = parts[i].strip();
        }

        return parts;
    }

    public static String MostInternTxtBlock(String[] htmlParts){
        int identationIndex = 0;
        List<TextBlock> textBlocks = new ArrayList<>();

        for(String part : htmlParts){
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
        
        textBlocks.sort((x, y) -> (x.getIdentationIndex() < y.getIdentationIndex()) ? 1 : ((x == y) ? 0 : -1));

        int mostInternIndex = textBlocks.get(0).getIdentationIndex(),
            iterator = 0;
        String mostInternMessage = "teste de variação";

        for(TextBlock part : textBlocks){
            iterator = part.getIdentationIndex();
            if(iterator < mostInternIndex){
                break;
            }
            mostInternMessage = part.getTextMessage();
        }

        return mostInternMessage;
    }

    public static boolean IsMalformed(String[] htmlParts){
        int identationIndex = 0;

        for(String part : htmlParts){
            if(part.contains("<")){
                if(part.contains("/")){
                    identationIndex--;
                } else{
                    identationIndex++;
                }
            }
        }

        if(identationIndex % 2 == 0){
            return true;
        }   return false;
    }
}