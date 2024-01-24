package christmasgifts;

// imports
import java.io.Serializable;

/*
 * Gift.java
 * 5th December 2020
 * @author Ruby Lennon
 * description: Gift class
 */

// create a Gift class
public class Gift implements Serializable{
    // declare variables
    private String recipientName;
    private String giftIdea;
    private String url;
    
    // create a class constructor for the Gift class
    public Gift(){
        recipientName = new String();
        giftIdea = new String();
        url = new String();      
    }
    
    // getters and setters
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getGiftIdea() {
        return giftIdea;
    }

    public void setGiftIdea(String giftIdea) {
        this.giftIdea = giftIdea;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
