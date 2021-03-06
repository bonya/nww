package com.nww.munich.newssharer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stefano Pacifici on 25/10/14.
 */
public class Constants {

    @SuppressWarnings("UnusedDeclaration")
    public static final String DEVEL_BASE_URL = "http://192.168.3.164:5050";

    @SuppressWarnings("UnusedDeclaration")
    public static final String STAGING_BASE_URL = "https://sleepy-mountain-8434.herokuapp.com";

    public static final String BASE_URL = STAGING_BASE_URL;

    public static final String CREATE_ARTICLE_URL = BASE_URL + "/api/article?url=%s";

    public static final String POST_ARTICLE_URL = BASE_URL + "/api/article/%s";

    public static final Map<String, Integer> HANDLE_TO_PHOTO;

    public static final Object[][] PERSONS = new Object[][] {
        {
                "Angela Merkel",
                R.string.chancellor_of_germany,
                R.drawable.merkel,
                "angela-merkel",
                "http://sleepy-mountain-8434.herokuapp.com/img/person/angela-merkel/icon"
        },
        {
                "Barack Obama",
                R.string.president_of_united_states,
                R.drawable.obama,
                "barack-obama",
                "http://sleepy-mountain-8434.herokuapp.com/img/person/barack-obama/icon"
        },
        {
                "Vladimir Putin",
                R.string.president_of_russia,
                R.drawable.vladimir,
                "vladimir-putin",
                "http://sleepy-mountain-8434.herokuapp.com/img/person/vladimir-putin/icon"
        },
        {
                "François Hollande",
                R.string.president_of_france,
                R.drawable.francois,
                "francois-hollande",
                "http://sleepy-mountain-8434.herokuapp.com/img/person/francois-hollande/icon"
        }
    };

    static {
        HashMap<String, Integer> handleToPhoto = new HashMap<String, Integer>();
        handleToPhoto.put("angela-merkel", R.drawable.merkel);
        handleToPhoto.put("barack-obama", R.drawable.obama);
        handleToPhoto.put("vladimir-putin", R.drawable.vladimir);
        handleToPhoto.put("francois-hollande",R.drawable.francois);

        HANDLE_TO_PHOTO = Collections.unmodifiableMap(handleToPhoto);
    }
}
