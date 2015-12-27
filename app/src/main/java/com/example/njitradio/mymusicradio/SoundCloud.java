package com.example.njitradio.mymusicradio;

import retrofit.RestAdapter;
//

public class SoundCloud {

    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private static final SCServices SERVICE = REST_ADAPTER.create(SCServices.class);

    public static SCServices getService() {
        return SERVICE;
    }
}
