import java.util.ArrayList;
import java.util.List;

public class HtmlHarvest{

    public class TextBlock{
        private static String textMessage;
        private static int identationIndex;

        public String getTextMessage(){
            return textMessage;
        }
        public int getIdentationIndex(){
            return identationIndex;
        }

        public void setTextMessage(String textMessage) {
            if(textMessage != null && textMessage.strip() != ""){
                TextBlock.textMessage = textMessage;
            }
        }
        public void setIdentationIndex(int identationIndex){
            if(identationIndex >= 0){
                TextBlock.identationIndex = identationIndex;
            }
        }

        public TextBlock(String textMessage, int identationIndex){
            this.setTextMessage(textMessage);
            this.setIdentationIndex(identationIndex);
        }
    }

    public static String MostInternText(String htmlText){
        int identationIndex = 0;

        List<TextBlock> textBlocks = new ArrayList<>();
        
        

        return "";
    }
}