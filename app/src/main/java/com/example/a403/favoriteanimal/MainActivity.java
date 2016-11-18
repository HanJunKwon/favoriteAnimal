package com.example.a403.favoriteanimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox);
    View lay = findViewById(R.id.subLayout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetCheckBox();
    }
    void SetCheckBox(){
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                    lay.setVisibility(View.VISIBLE);
                }
                else{
                    lay.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
