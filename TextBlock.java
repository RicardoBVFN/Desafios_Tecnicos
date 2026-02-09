public class TextBlock{
    private String textMessage;
    private Integer identationIndex;

    public String getTextMessage(){
        return textMessage;
    }
    public Integer getIdentationIndex(){
        return identationIndex;
    }

    public void setTextMessage(String textMessage) {
        if(textMessage != null && textMessage.strip() != ""){
            this.textMessage = textMessage;
        }
    }
    public void setIdentationIndex(Integer identationIndex){
        if(identationIndex >= 0){
            this.identationIndex = identationIndex;
        }
    }

    @Override
    public String toString() {
        return textMessage.concat(Integer.toString(identationIndex));
    }

    public TextBlock(String textMessage, Integer identationIndex){
        this.setTextMessage(textMessage);
        this.setIdentationIndex(identationIndex);
    }
    public TextBlock(){
        this.textMessage = null;
        this.identationIndex = 0;
    }
}
