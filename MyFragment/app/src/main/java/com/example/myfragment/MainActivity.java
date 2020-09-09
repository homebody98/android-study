package com.example.myfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Layout1 layout1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);
        layout1.setImage(R.drawable.ic_launcher_foreground);
        layout1.setName("오영택");
        layout1.setMobile("010-1234-1234");

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                layout1.setName("우왁굳");
                layout1.setImage(R.drawable.ic_launcher_foreground);
                Toast.makeText(MainActivity.this,"바뀜",Toast.LENGTH_SHORT).show();
            }
        });
    }

}