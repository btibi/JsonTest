package hu.btibi.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bookmark {

    public Bookmark(String id, Boolean isViewed, Integer bookmark) {
        this(id);
        this.isViewed = isViewed;
        this.bookmark = bookmark;
    }

    public Bookmark(String id) {
        this.id = id;
    }

    @JsonProperty("id")
    private String id;
    @JsonProperty("IsViewed")
    private Boolean isViewed;
    @JsonProperty("Bookmark")
    private Integer bookmark;
}
