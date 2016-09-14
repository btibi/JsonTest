package hu.btibi.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookmarkResponse {

    public BookmarkResponse(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
        this.size = bookmarks.size();
    }

    public BookmarkResponse(Bookmark bookmark) {
        this.bookmarks = Arrays.asList(bookmark);
    }

    @JsonProperty("Title")
    private List<Bookmark> bookmarks;
    @JsonProperty("Size")
    private Integer size;

}
