package com.example.njitradio.mymusicradio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;


public class CreateRadio extends AppCompatActivity {

//
    private Button button_station;
    private Button button_station2;
    private ImageButton button_stop;
    private ImageButton button_stop1;
    private MediaPlayer mMediaPlayer;
    private String STREAM_URL = "http://listen.radionomy.com:80/HitsandBeats";
    private String STREAM_URL2 = "http://80.195.148.109:3384";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_radio);

        button_station = (Button) findViewById(R.id.button_station);
        mMediaPlayer = new MediaPlayer();
        button_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mMediaPlayer.reset();
                    mMediaPlayer.setDataSource(STREAM_URL);
                    mMediaPlayer.prepareAsync();

                    mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.start();

                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();

                }

            }

        });

        button_station2 = (Button) findViewById(R.id.button_station2);
        mMediaPlayer = new MediaPlayer();
        button_station2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mMediaPlayer.reset();
                    mMediaPlayer.setDataSource(STREAM_URL2);
                    mMediaPlayer.prepareAsync();

                    mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.start();

                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();

                }

            }

        });

        button_stop = (ImageButton) findViewById(R.id.button_stop);
        button_stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mMediaPlayer.stop();
            }
        });

        button_stop1 = (ImageButton) findViewById(R.id.button_stop);
        button_stop1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mMediaPlayer.stop();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_radio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
