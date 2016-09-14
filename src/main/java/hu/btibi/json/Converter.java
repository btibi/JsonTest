package hu.btibi.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;

public class Converter {
    private ObjectMapper mapper = new ObjectMapper();

    {
        mapper.enable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public static void main(String args[]) throws Exception {
        new Converter().run();
    }

    private void run() throws Exception {
        System.out.println(mapper.writeValueAsString(new BookmarkResponse(new Bookmark("test", true, 0))));

        System.out.println(mapper.writeValueAsString(new BookmarkResponse(Arrays.asList(new Bookmark("test", true, 0), new Bookmark("test", true, 0)))));

        System.out.println(mapper.writeValueAsString(new BookmarkResponse(Arrays.<Bookmark>asList())));

        System.out.println(mapper.writeValueAsString(new BookmarkResponse(new Bookmark("test"))));
    }
}
