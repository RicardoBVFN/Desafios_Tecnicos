public class TextBlock{
    private String textMessage;
    private Integer identationIndex;
    //private Integer creationIndex;

    public String getTextMessage(){
        return textMessage;
    }
    public Integer getIdentationIndex(){
        return identationIndex;
    }
    // public Integer getCreationIndex(){
    //     return creationIndex;
    // }

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
    // public void setCreationIndex(Integer creationIndex){
    //     if(creationIndex >= 0){
    //         this.creationIndex = creationIndex;
    //     }
    // }

    @Override
    public String toString() {
        return textMessage.concat(Integer.toString(identationIndex));
    }

    public TextBlock(String textMessage, Integer identationIndex){//, Integer creationIndex){
        this.setTextMessage(textMessage);
        this.setIdentationIndex(identationIndex);
        //this.setCreationIndex(creationIndex);
    }
    public TextBlock(){
        this.textMessage = null;
        this.identationIndex = 0;
        //this.creationIndex = 0;
    }
}
