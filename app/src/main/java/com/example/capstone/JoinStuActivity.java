package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class JoinStuActivity extends AppCompatActivity {
    TextView textView,spinnertxt;
    // 깃허브
    String[] items
            = { "가천대학교", "가톨릭대학교", "건국대학교", "경기대학교", "경희대학교", "계원예술대학교",
            "고려대학교", "광운대학교", "국민대학교", "단국대학교", "대림대학교", "덕성여자대학교",
            "동국대학교", "동남보건대학교", "동덕여자대학교", "동서울대학교", "동양미래대학교", "명지대학교",
            "명지전문대학", "배화여자대학교", "부천대학교", "삼육대학교", "삼육보건대학교", "상명대학교",
            "서강대학교", "서경대학교", "서울과학기술대학교", "서울대학교", "서울시립대학교", "서울여자간호대학교",
            "서울여자대학교", "서울예술대학교", "서일대학교", "성결대학교", "성균관대학교", "성신여자대학교",
            "세종대학교", "수원과학대학교", "수원대학교", "숙명여자대학교", "숭실대학교", "숭의여자대학교",
            "아주대학교", "안양대학교", "연성대학교", "연세대학교", "용인대학교", "을지대학교",
            "이화여자대학교", "인덕대학교", "인천대학교", "인하공업전문대학", "인하대학교", "중앙대학교",
            "한국교통대학교", "한국산업기술대학교", "한국외국어대학교", "한국체육대학교", "한국항공대학교",
            "한성대학교", "한양대학교", "한양여자대학교", "협성대학교", "홍익대학교"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_stu);

        /*spinnertxt = (TextView) findViewById(R.id.spinner_txt);
        spinnertxt.setPaintFlags(spinnertxt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);*/

        Switch swt = (Switch) findViewById(R.id.switch1);
        swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    Intent intent = new Intent(getApplicationContext(), JoinProActivity.class);
                    startActivity(intent);
                } else {
                    // The toggle is disabled
                    Intent intent = new Intent(getApplicationContext(), JoinStuActivity.class);
                    startActivity(intent);
                }
            }
        });

        textView = (TextView) findViewById(R.id.spinner_txt);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );

        // 드롭다운 클릭 시 선택 창
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        spinner.setAdapter(adapter);

        // 스피너에서 선택 했을 경우 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText(" ");
            }

        });

    }
}