package studytrail.sprintold;

public class Email {
    private String sender;
    private String text;
    private String date;
    String test;

    Email(String sender, String text, String date){
        setSender(sender);
        setText(text);
        setDate(date);
    }

    String getSender(){
        return this.sender;
    }
    void setSender(String sender){
        this.sender = sender;
    }
    String getText(){
        return this.text;
    }
    void setText(String text){
        this.text = text;
    }
    String getDate(){
        return this.date;
    }
    void setDate(String date){
        this.date = date;
    }
}
