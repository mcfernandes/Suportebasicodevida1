package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivitySBV extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sbv);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void Sbv(View b)
    {
        switch (((Button) b).getText().toString())
        {
            case "Consciente":
                startActivityForResult(new Intent(b.getContext(), MainActivityConsciente.class), 0);
                break;
            case "Inconsciente":
                startActivityForResult(new Intent(b.getContext(), MainActivityInconsciente.class), 0);
                break;
            case "Voltar ao inicio":
                startActivityForResult(new Intent(b.getContext(), MainActivity.class), 0);
                break;
        }
    }
}
