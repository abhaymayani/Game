package com.example.soonchokadi;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class updated_SoonChokadi extends AppCompatActivity implements View.OnClickListener {

    Button btn[] = new Button[10];
    Button reset, redo, newgame;
    TextView status, scoreX, scoreO;
    int cnt = 0, scoreXcnt = 0, scoreOcnt = 0;
    boolean won = false;      //game jiti gya pachi undo no thavu joye..to ema ek variable levo pade and and ek condition mukvi pade etle aa variable lidho che. etle player jiti gya pachi undo no kari shake

    ArrayList<HashMap> undoarrayList = new ArrayList<HashMap>();
    HashMap undohashMap;

    ArrayList<HashMap> redoarrayList = new ArrayList<HashMap>();
    HashMap redohasMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updated__soon_chokadi);

        status = findViewById(R.id.status);
        scoreX = findViewById(R.id.scoreX);
        scoreO = findViewById(R.id.scoreO);
        reset = findViewById(R.id.reset);
        newgame = findViewById(R.id.newgame);
        redo = findViewById(R.id.redo);

        reset.setOnClickListener(this);
        newgame.setOnClickListener(this);
        redo.setOnClickListener(this);

        for (int i = 1; i < btn.length; i++) {

            int bid = getResources().getIdentifier("btn" + i, "id", getPackageName());
            btn[i] = findViewById(bid);
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        for (int i = 1; i < btn.length; i++) {
            //int id=view.getId();
            if (view.getId() == btn[i].getId()) {
                if (btn[i].getText().toString().isEmpty()) {
                    if (cnt % 2 == 0) {
                        btn[i].setText("X");
                        status.setText("O's Turn.");
                    } else {
                        btn[i].setText("O");
                        status.setText("X's Turn");
                    }
                    cnt++;
                    winningpos();

                    String value = btn[i].getText().toString();

                    undohashMap = new HashMap();

                    undohashMap.put("pos", i);
                    undohashMap.put("value", value);

                    undoarrayList.add(undohashMap);

//                    undoarrayList.add("pos"+i);
//                    undoarrayList.add("value"+value);
//                    Log.e("abhay",""+undoarrayList);
                } else {
                    Toast.makeText(this, "plz..Tap Another blank Space.", Toast.LENGTH_SHORT).show();
                }
            }
        }
        if (view.getId() == reset.getId()) {
            fun_reset();
        }
        if (view.getId() == newgame.getId()) {
            nvigame();
        }
        if (view.getId() == redo.getId()) {
            func_redo();
        }
    }


    private void winningpos() {
        String b1, b2, b3, b4, b5, b6, b7, b8, b9;
        b1 = btn[1].getText().toString();
        b2 = btn[2].getText().toString();
        b3 = btn[3].getText().toString();
        b4 = btn[4].getText().toString();
        b5 = btn[5].getText().toString();
        b6 = btn[6].getText().toString();
        b7 = btn[7].getText().toString();
        b8 = btn[8].getText().toString();
        b9 = btn[9].getText().toString();

        if (b1 == b2 && b2 == b3 && !b1.isEmpty()) {
            if (b1 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[1].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[2].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[3].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[1].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[2].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[3].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b4 == b5 && b5 == b6 && !b4.isEmpty()) {
            if (b4 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[4].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[6].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[4].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[6].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b7 == b8 && b8 == b9 && !b7.isEmpty()) {
            if (b7 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[7].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[8].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[9].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[7].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[8].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[9].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b1 == b4 && b4 == b7 && !b1.isEmpty()) {
            if (b1 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[1].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[4].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[7].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[1].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[4].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[7].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b2 == b5 && b5 == b8 && !b2.isEmpty()) {
            if (b2 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[2].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[8].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[2].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[8].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b3 == b6 && b6 == b9 && !b3.isEmpty()) {
            if (b3 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[3].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[6].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[9].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[3].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[6].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[9].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b1 == b5 && b5 == b9 && !b1.isEmpty()) {
            if (b1 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[1].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[9].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[1].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[9].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else if (b3 == b5 && b5 == b7 && !b3.isEmpty()) {
            if (b3 == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("X is Won");

                scoreXcnt++;
                scoreX.setText(String.valueOf(scoreXcnt));

                btn[3].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[7].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("O is Won");

                scoreOcnt++;
                scoreO.setText(String.valueOf(scoreOcnt));

                btn[3].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[5].setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn[7].setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn_disable();
            }
        } else {
            if (!b1.isEmpty() && !b2.isEmpty() && !b3.isEmpty() && !b4.isEmpty() && !b5.isEmpty() && !b6.isEmpty() && !b7.isEmpty() &&
                    !b8.isEmpty() && !b9.isEmpty()) {
                status.setText("Game Tie.Plz Reset Your Game");
            }
        }
    }

    public void fun_reset() {
        for (int i = 1; i < btn.length; i++) {
            btn[i].setText("");
            btn[i].setEnabled(true);
            cnt = 0;

            btn[i].setBackground(getResources().getDrawable(R.drawable.custom_button_shap));

        }
        undoarrayList.clear();
        redoarrayList.clear();

        won = false;
    }

    private void nvigame() {
        fun_reset();
        Toast.makeText(this, "Welcome To New Game..!", Toast.LENGTH_LONG).show();
        status.setText("X's Turn-Tap To Play");

        scoreOcnt = 0;
        scoreXcnt = 0;

        scoreX.setText(String.valueOf(scoreXcnt));
        scoreO.setText(String.valueOf(scoreOcnt));

        /*undoarrayList.clear();
        redoarrayList.clear();

        won = false;

        aa comment etle karyu ke aa method ma aapde reset call karelu che.. to reset ma aa 3 line lakheli che to aa automatic lakhay java ni aaya*/
    }

    public void btn_disable() {
        for (int i = 1; i < btn.length; i++) {
            btn[i].setEnabled(false);
        }

        won = true;
    }

    public void func_undo(View view) {      //aa xml mathi OnClick vali method banavi che ..etle me aaya "View view" valu aave che

        if (won == true) {
            Toast.makeText(this, "game was win. so not work undo button", Toast.LENGTH_SHORT).show();
        } else {
            if (!undoarrayList.isEmpty()) {
                undohashMap = undoarrayList.get(undoarrayList.size() - 1);

                int pos = (int) undohashMap.get("pos");
                String value = (String) undohashMap.get("value");

                btn[pos].setText("");
                cnt--;

                undoarrayList.remove(undoarrayList.size() - 1);

                redoarrayList.add(undohashMap);
            }
        }
    }

    private void func_redo() {
        try {
            redohasMap = new HashMap();
            redohasMap = redoarrayList.get(redoarrayList.size() - 1);

            int pos = (int) redohasMap.get("pos");
            String value = (String) redohasMap.get("value");

            btn[pos].setText(value);
            cnt++;

            redoarrayList.remove(redoarrayList.size() - 1);
            undoarrayList.add(redohasMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}