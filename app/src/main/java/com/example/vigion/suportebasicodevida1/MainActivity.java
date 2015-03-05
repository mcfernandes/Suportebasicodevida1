package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity {

    private Button button;
    //ViewPager viewPager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        /*viewPager = (ViewPager) findViewById(R.id.fragmentPrincipal);

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fragmentManager));

        viewPager.setCurrentItem(1);*/
    }

    public void Opcoes(View b)
    {
        switch (((Button) b).getText().toString())
        {
            case "SBV":
                startActivityForResult(new Intent(b.getContext(), MainActivitySBV.class), 0);
                break;
            case "Engasganço":
                startActivityForResult(new Intent(b.getContext(), MainActivityEngasganco.class), 0);
                break;
        }
    }

}
/*
class MeuFragmentAdapter extends FragmentPagerAdapter{

    MeuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if(position == 0)
        {
            fragment = new fragment_engasganco();
        }
        if(position == 1)
        {
            fragment = new fragment_principal();
        }
        if(position == 2)
        {
            fragment = new fragment_sbv();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}*/