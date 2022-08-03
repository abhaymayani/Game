package com.example.soonchokadi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class Pazzel_Game extends AppCompatActivity implements View.OnClickListener {
    Button btn[] = new Button[9];
    ArrayList arrayList = new ArrayList();
    int min = 0;
    int max = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pazzel__game);

        for (int i = 0; i < btn.length; i++) {
            int bid = getResources().getIdentifier("btn" + i, "id", getPackageName());

            btn[i] = findViewById(bid);
            btn[i].setOnClickListener(this);
        }

        for (int i = 0; i < btn.length; i++) {
            while (true) {
                int randomno = new Random().nextInt(((max - min) + 1) + min);
                if (!arrayList.contains(randomno)) {
                    arrayList.add(randomno);

                    //Log.e( "ab",""+arrayList);

                    if (!arrayList.get(i).toString().equals("0")) {
                        btn[i].setText(arrayList.get(i).toString());
                    }

                    /*if (btn[i].getText().toString().equals("0")){
                        btn[i].setText("");
                    }       ek aa method pn che. jya 0 aave e jagya ne khali karva ni.
                            pela arrayList ma je hoy e bdha digit ne gothavi deva na.pachi je btn ma 0 aave ene khali karva no..easy method
                     */

                    break;
                }
            }
        }
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        if (id == btn[0].getId())
        {
            if (btn[1].getText().toString().isEmpty()){
                btn[1].setText(btn[0].getText().toString());
                btn[0].setText("");
            }
            else if (btn[3].getText().toString().isEmpty()){
                btn[3].setText(btn[0].getText().toString());
                btn[0].setText("");
            }
        }
        else if (id==btn[1].getId())
        {
            if (btn[0].getText().toString().isEmpty()){
                btn[0].setText(btn[1].getText().toString());
                btn[1].setText("");
            }
            else if (btn[2].getText().toString().isEmpty()){
                btn[2].setText(btn[1].getText().toString());
                btn[1].setText("");
            }
            else if (btn[4].getText().toString().isEmpty()){
                btn[4].setText(btn[1].getText().toString());
                btn[1].setText("");
            }
        }
        else if (id == btn[2].getId())
        {
            if (btn[1].getText().toString().isEmpty()){
                btn[1].setText(btn[2].getText().toString());
                btn[2].setText("");
            }
            else if (btn[5].getText().toString().isEmpty()){
                btn[5].setText(btn[2].getText().toString());
                btn[2].setText("");
            }
        }
        else if (id == btn[3].getId())
        {
            if(btn[0].getText().toString().isEmpty()){
                btn[0].setText(btn[3].getText().toString());
                btn[3].setText("");
            }
            else if (btn[4].getText().toString().isEmpty()){
                btn[4].setText(btn[3].getText().toString());
                btn[3].setText("");
            }
            else if (btn[6].getText().toString().isEmpty()){
                btn[6].setText(btn[3].getText().toString());
                btn[3].setText("");
            }
        }
        else if (id == btn[4].getId())
        {
            if (btn[1].getText().toString().isEmpty()){
                btn[1].setText(btn[4].getText().toString());
                btn[4].setText("");
            }
            else if (btn[3].getText().toString().isEmpty()){
                btn[3].setText(btn[4].getText().toString());
                btn[4].setText("");
            }
            else if (btn[5].getText().toString().isEmpty()){
                btn[5].setText(btn[4].getText().toString());
                btn[4].setText("");
            }
            else if (btn[7].getText().toString().isEmpty()){
                btn[7].setText(btn[4].getText().toString());
                btn[4].setText("");
            }
        }
        else if (id == btn[5].getId())
        {
            if (btn[2].getText().toString().isEmpty()){
                btn[2].setText(btn[5].getText().toString());
                btn[5].setText("");
            }
            else if (btn[4].getText().toString().isEmpty()){
                btn[4].setText(btn[5].getText().toString());
                btn[5].setText("");
            }
            else if (btn[8].getText().toString().isEmpty()){
                btn[8].setText(btn[5].getText().toString());
                btn[5].setText("");
            }
        }
        else if (id == btn[6].getId())
        {
            if (btn[3].getText().toString().isEmpty()){
                btn[3].setText(btn[6].getText().toString());
                btn[6].setText("");
            }
            else if (btn[7].getText().toString().isEmpty()){
                btn[7].setText(btn[6].getText().toString());
                btn[6].setText("");
            }
        }
        else if (id == btn[7].getId())
        {
            if (btn[4].getText().toString().isEmpty()){
                btn[4].setText(btn[7].getText().toString());
                btn[7].setText("");
            }
            else if(btn[6].getText().toString().isEmpty()){
                btn[6].setText(btn[7].getText().toString());
                btn[7].setText("");
            }
            else if (btn[8].getText().toString().isEmpty()){
                btn[8].setText(btn[7].getText().toString());
                btn[7].setText("");
            }
        }
        else if (id == btn[8].getId())
        {
            if (btn[5].getText().toString().isEmpty()){
                btn[5].setText(btn[8].getText().toString());
                btn[8].setText("");
            }
            else if (btn[7].getText().toString().isEmpty()){
                btn[7].setText(btn[8].getText().toString());
                btn[8].setText("");
            }
        }
        fun_winning();
    }

    private void fun_winning() {
        if (btn[0].getText().toString().equals("1") && btn[1].getText().toString().equals("2") && btn[2].getText().toString().equals("3")
                && btn[3].getText().toString().equals("4") && btn[4].getText().toString().equals("5") && btn[5].getText().toString().equals("6")
                && btn[6].getText().toString().equals("7") && btn[7].getText().toString().equals("8")
                && btn[8].getText().toString().equals(""))
        {
            Toast.makeText(this, "Congretuless. You are Winner..!", Toast.LENGTH_SHORT).show();
        }
    }

    public void fun_nviramat(View view) {
        Intent intent = new Intent(this, Dashbord.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}