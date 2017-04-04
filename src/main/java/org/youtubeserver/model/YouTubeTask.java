package org.youtubeserver.model;

/**
 * Created by Marcin on 04.04.2017.
 */

public class YouTubeTask {

    private Long id;

    private TypeOfTask type;

    private String url;

    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfTask getType() {
        return type;
    }

    public void setType(TypeOfTask type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
