package com.example.njitradio.mymusicradio;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
/**
 * Created by Shail on 10/20/2015.
 */
public interface SCServices {
    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);
    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    public void getTracksByGenres(@Query("genres") String genres, Callback<List<Track>> cb);
}
