package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView jointxt, findtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // '비밀번호 찾기' 클릭 시
        findtxt = (TextView) findViewById(R.id.pwFind);
        findtxt.setPaintFlags(findtxt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        findtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1 = new Intent(getApplicationContext(), PwFindActivity.class);
                startActivity(it1);
            }
        });

        // '회원가입' 클릭 시
        jointxt = (TextView) findViewById(R.id.joinText);
        jointxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(getApplicationContext(), JoinStuActivity.class);
                startActivity(it2);
            }
        });

    }
}

