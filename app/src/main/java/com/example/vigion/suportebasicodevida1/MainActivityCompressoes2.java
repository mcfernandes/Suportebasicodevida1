package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainActivityCompressoes2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_compressoes2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void btnInicioOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivity.class);
        startActivityForResult(intent, 0);
    }

    public void btnPasso5OnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivityCompressoes3.class);
        startActivityForResult(intent, 0);
    }
}
