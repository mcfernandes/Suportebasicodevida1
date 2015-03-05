package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivityEngasganco extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_engasganco);
        /*if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }*/
    }

    public void Engasgamento(View b)
    {
        switch (((Button) b).getText().toString())
        {
            case "Manobras de Armas":
                startActivityForResult(new Intent(b.getContext(), MainActivityManobraDeArmas.class), 0);
                break;
            case "Pancadas":
                startActivityForResult(new Intent(b.getContext(), MainActivityPancadas.class), 0);
                break;
            case "Voltar ao inicio":
                startActivityForResult(new Intent(b.getContext(), MainActivity.class), 0);
                break;
        }
    }
}