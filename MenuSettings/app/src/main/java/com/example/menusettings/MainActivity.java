package com.example.menusettings;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.app.NotificationCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.menusettings.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);



        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.search_item:
                Toast.makeText(this, "Item is searching... wait for a moment.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.upload_item:
                Toast.makeText(this, "Uploading Item...", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Item uploaded.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.copy_item:
                Toast.makeText(this, "Item copied to your clipboard.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.print_item:
                Toast.makeText(this, "Connecting to printer...", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Connected. Starting to print the item...", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share_item:
                Toast.makeText(this, "Item shared on your feed.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bookmark_item:
                Toast.makeText(this, "Item bookmarked.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this, "This is a toast.", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }



    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }


}