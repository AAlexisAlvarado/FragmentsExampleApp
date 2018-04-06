package pe.edu.tecsup.fragmentsexampleapp;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pe.edu.tecsup.fragmentsexampleapp.fragments.FirstFragment;
import pe.edu.tecsup.fragmentsexampleapp.fragments.SecondFragment;
import pe.edu.tecsup.fragmentsexampleapp.fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFirstFragment(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FirstFragment firstFragment = new FirstFragment();
        fragmentManager.beginTransaction().replace(R.id.content, firstFragment).commit();

    }

    public void showSecondFragment(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();
        SecondFragment secondFragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString("param1", "Hello Second Fragment");
        secondFragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.content, secondFragment).commit();
    }

    public void showThirdFragment(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();

        ThirdFragment thirdFragment = ThirdFragment.newInstance("Hello Third Fragment");

        fragmentManager.beginTransaction().replace(R.id.content, thirdFragment).commit();
    }
}
