package com.example.user.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,score;
    Button findgrade,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.EditText1);
        score = (EditText) findViewById(R.id.EditText2);
        findgrade = (Button) findViewById(R.id.button);
        exit = (Button) findViewById(R.id.button2);


        findgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String name1 = String.valueOf(name.getText().toString());
                    Integer score1 = Integer.valueOf(score.getText().toString());
                    String grade =" ";
                if(score1 >= 80){
                    grade = "A";
                }
                else if(score1 >= 70 ){
                    grade = "B";
                }
                else if(score1 >=60 ){
                    grade = "C";
                }
                else if(score1 >=50 ){
                    grade = "D";
                }
                else if(score1 <= 49){
                    grade = "F";
                }
                Intent newpage = new Intent(MainActivity.this,Main2Activity.class);
                newpage.putExtra("name5",name1);
                newpage.putExtra("Sgrade",grade);
                startActivity(newpage);
            }



        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Confirm Exit");
                dialog.setMessage("แน่ใจว่าต้องการออกจากแอพ");
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setPositiveButton("ออก", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                    });
                        dialog.setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) { }
                        });
                dialog.show();
            }
        });


    }
}
