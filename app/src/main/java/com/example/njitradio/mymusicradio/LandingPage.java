package com.example.njitradio.mymusicradio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class LandingPage extends AppCompatActivity {

    private ImageButton BtnSearch;
    private ImageButton BtnAdd;
    private ImageButton BtnBuy;
    private ImageButton BtnMusic;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        BtnSearch = (ImageButton) findViewById(R.id.button_topright_Search);
        BtnAdd = (ImageButton) findViewById(R.id.button_bottomright_Add);
        BtnBuy = (ImageButton) findViewById(R.id.button_bottomleft_Buy);
        BtnMusic = (ImageButton) findViewById(R.id.button_topleft_Music);
    }

    public void BtnMusic_OnClick(View view)
    {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void BtnBuy_OnClick(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/music?hl=en"));
        startActivity(i);
    }

    public void BtnSearch_OnClick(View view)
    {
        startActivity(new Intent(this, Search.class));
    }

    public void BtnAdd_OnClick(View view)
    {
        startActivity(new Intent (this,CreateRadio.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_landing_page, menu);
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
