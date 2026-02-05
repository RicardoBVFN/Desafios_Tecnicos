public class TextHtml{
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
            TextHtml.textMessage = textMessage;
        }
    }
    public void setIdentationIndex(int identationIndex){
        if(identationIndex >= 0){
            TextHtml.identationIndex = identationIndex;
        }
    }

    public TextHtml(String textMessage, int identationIndex){
        this.setTextMessage(textMessage);
        this.setIdentationIndex(identationIndex);
    }
}