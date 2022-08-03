package com.example.soonchokadi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, undo, reset, redo,newgame;
    int count=0,xcnt=0,ocnt=0;
    TextView status,scoreX,scoreO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        undo = findViewById(R.id.undo);
        reset = findViewById(R.id.reset);
        redo = findViewById(R.id.redo);
        status=findViewById(R.id.status);
        scoreO=findViewById(R.id.scoreO);
        scoreX=findViewById(R.id.scoreX);
        newgame=findViewById(R.id.newgame);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        undo.setOnClickListener(this);
        reset.setOnClickListener(this);
        redo.setOnClickListener(this);
        newgame.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /*switch (view.getId()){
            case R.id.btn1:
                if (count%2==0){
                    btn1.setText("X");
                }
                else{
                    btn1.setText("O");
                }
                count++;
                break;
            case R.id.btn2:
                if (count%2==0){
                    btn2.setText("X");
                }
                else{
                    btn2.setText("O");
                }
                count++;
                break;
            case R.id.btn3:
                if (count%2==0){
                    btn3.setText("X");
                }
                else{
                    btn3.setText("O");
                }
                count++;
                break;
            case R.id.btn4:
                if (count%2==0){
                    btn4.setText("X");
                }
                else{
                    btn4.setText("O");
                }
                count++;
                break;
            case R.id.btn5:
                if (count%2==0){
                    btn5.setText("X");
                }
                else{
                    btn5.setText("O");
                }
                count++;
                break;
            case R.id.btn6:
                if (count%2==0){
                    btn6.setText("X");
                }
                else{
                    btn6.setText("O");
                }
                count++;
                break;
            case R.id.btn7:
                if (count%2==0){
                    btn7.setText("X");
                }
                else{
                    btn7.setText("O");
                }
                count++;
                break;
            case R.id.btn8:
                if (count%2==0){
                    btn8.setText("X");
                }
                else{
                    btn8.setText("O");
                }
                count++;
                break;
            case R.id.btn9:
                if (count%2==0){
                    btn9.setText("X");
                }
                else{
                    btn9.setText("O");
                }
                count++;
                break;
        }*/
        int id = view.getId();
        if (id == R.id.btn1) {
            if (btn1.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn1.setText("X");
                    status.setText("O's Turn");
                }
                else {
                    btn1.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn2) {
            if (btn2.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn2.setText("X");
                    status.setText("O's Turn");
                }
                else {
                    btn2.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn3) {
            if (btn3.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn3.setText("X");
                    status.setText("O's Turn");
                } else {
                    btn3.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali jagya e click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn4) {
            if (btn4.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn4.setText("X");
                    status.setText("O's Turn");
                }
                else {
                    btn4.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn5) {
            if (btn5.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn5.setText("X");
                    status.setText("O's Turn");
                } else {
                    btn5.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn6) {
            if (btn6.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn6.setText("X");
                    status.setText("O's Turn");
                 }
                else {
                    btn6.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn7) {
            if (btn7.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn7.setText("X");
                    status.setText("O's Turn");
                }
                else {
                    btn7.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn8) {
            if (btn8.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn8.setText("X");
                    status.setText("O's Turn");
                }
                else {
                    btn8.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        else if (id == R.id.btn9) {
            if (btn9.getText().toString().isEmpty()) {
                if (count % 2 == 0) {
                    btn9.setText("X");
                    status.setText("O win");
                }
                else {
                    btn9.setText("O");
                    status.setText("X's Turn");
                }
                count++;
                winningpos();
            }
            else {
                Toast.makeText(this, "Biji Khali Jagya Ye Click kar", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == reset.getId()) {
            reset();
        }
        if (id == newgame.getId()){
            nvigame();
        }
    }

    public void winningpos() {

        if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn3.getText() == btn1.getText() && !btn1.getText().toString().isEmpty()) {
            if (btn1.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn1.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn2.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn3.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn1.setTextColor(getResources().getColor(R.color.black));
                btn2.setTextColor(getResources().getColor(R.color.black));
                btn3.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn1.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn2.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn3.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn1.setTextColor(getResources().getColor(R.color.black));
                btn2.setTextColor(getResources().getColor(R.color.black));
                btn3.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && btn6.getText() == btn4.getText() && !btn4.getText().toString().isEmpty()) {
            if (btn4.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn4.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn6.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn4.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn6.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn4.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn6.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn4.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn6.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn9.getText() == btn7.getText() && !btn7.getText().toString().isEmpty()) {
            if (btn7.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn7.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn8.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn9.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn7.setTextColor(getResources().getColor(R.color.black));
                btn8.setTextColor(getResources().getColor(R.color.black));
                btn9.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn7.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn8.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn9.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn7.setTextColor(getResources().getColor(R.color.black));
                btn8.setTextColor(getResources().getColor(R.color.black));
                btn9.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && btn7.getText() == btn1.getText() && !btn1.getText().toString().isEmpty()) {
            if (btn1.getText() == "X") {
                Toast.makeText(this, "x is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn1.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn4.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn7.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn1.setTextColor(getResources().getColor(R.color.black));
                btn4.setTextColor(getResources().getColor(R.color.black));
                btn7.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn1.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn4.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn7.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn1.setTextColor(getResources().getColor(R.color.black));
                btn4.setTextColor(getResources().getColor(R.color.black));
                btn7.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn8.getText() == btn2.getText() && !btn2.getText().toString().isEmpty()) {
            if (btn2.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn2.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn8.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn2.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn8.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn2.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn8.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn2.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn8.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn9.getText() == btn3.getText() && !btn3.getText().toString().isEmpty()) {
            if (btn3.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn3.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn6.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn9.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn3.setTextColor(getResources().getColor(R.color.black));
                btn6.setTextColor(getResources().getColor(R.color.black));
                btn9.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn3.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn6.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn9.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn3.setTextColor(getResources().getColor(R.color.black));
                btn6.setTextColor(getResources().getColor(R.color.black));
                btn9.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && btn9.getText() == btn1.getText() && !btn1.getText().toString().isEmpty()) {
            if (btn1.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn1.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn9.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn1.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn9.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn1.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn9.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn1.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn9.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && btn7.getText() == btn3.getText() && !btn3.getText().toString().isEmpty()) {
            if (btn3.getText() == "X") {
                Toast.makeText(this, "X is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player X Won");

                xcnt++;
                scoreX.setText(String.valueOf(xcnt));

                btn3.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn7.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn3.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn7.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            } else {
                Toast.makeText(this, "O is Won", Toast.LENGTH_SHORT).show();
                status.setText("Player O Won");

                ocnt++;
                scoreO.setText(String.valueOf(ocnt));

                btn3.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn5.setBackground(getResources().getDrawable(R.drawable.winningbutton));
                btn7.setBackground(getResources().getDrawable(R.drawable.winningbutton));

                btn3.setTextColor(getResources().getColor(R.color.black));
                btn5.setTextColor(getResources().getColor(R.color.black));
                btn7.setTextColor(getResources().getColor(R.color.black));

                btn_disable();
            }
        }
        else{
            if (!btn1.getText().toString().isEmpty() && !btn2.getText().toString().isEmpty() && !btn3.getText().toString().isEmpty()
                    && !btn4.getText().toString().isEmpty() && !btn5.getText().toString().isEmpty()
                    && !btn6.getText().toString().isEmpty() && !btn7.getText().toString().isEmpty()
                    && !btn8.getText().toString().isEmpty() && !btn9.getText().toString().isEmpty()){
                Toast.makeText(this, "Game Tie", Toast.LENGTH_SHORT).show();
                status.setText("Game Tie. plz Reset Your Game");
            }
        }
    }

    private void reset() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        count=0;

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn2.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn3.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn4.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn5.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn6.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn7.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn8.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));
        btn9.setBackground(getResources().getDrawable(R.drawable.custom_button_shap));

        btn1.setTextColor(getResources().getColor(R.color.white));
        btn2.setTextColor(getResources().getColor(R.color.white));
        btn3.setTextColor(getResources().getColor(R.color.white));
        btn4.setTextColor(getResources().getColor(R.color.white));
        btn5.setTextColor(getResources().getColor(R.color.white));
        btn6.setTextColor(getResources().getColor(R.color.white));
        btn7.setTextColor(getResources().getColor(R.color.white));
        btn8.setTextColor(getResources().getColor(R.color.white));
        btn9.setTextColor(getResources().getColor(R.color.white));
    }
    private void nvigame() {
        reset();
        xcnt=0;
        ocnt=0;
        scoreO.setText("");
        scoreX.setText("");
        status.setText("X's Turn- Tap to Play");
        Toast.makeText(this, "Welcome To New Game..!", Toast.LENGTH_LONG).show();
    }
    private void btn_disable() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
}