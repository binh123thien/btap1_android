package com.example.modernartui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //show option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
//select option menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_Information:
                Dialog();
                break;
            case R.id.LinearLayout:
                setContentView(R.layout.linearlayout);
                break;
            case R.id.RelativeLayout:
                setContentView(R.layout.relativelayout);
                break;
            case R.id.TableLayout:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
//show dialog
    private void Dialog(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        dialog.show();
    }



}