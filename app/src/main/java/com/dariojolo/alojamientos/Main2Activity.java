package com.dariojolo.alojamientos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void listarHoteles (View v){
        Intent intent = new Intent(this,ListadoHotelesActivity.class);
        String s_id = "0";
        switch (v.getId()){
            case R.id.button1:{
            s_id = "1";
                break;
            }
            case R.id.button2:{
                s_id = "2";
                break;
            }
            case R.id.button3:{
                s_id = "3";
                break;
            }
            case R.id.button4:{
                s_id = "4";
                break;
            }
            case R.id.button5:{
                s_id = "5";
                break;
            }
        }

        intent.putExtra("ID",s_id);
        startActivity(intent);
    }
}
