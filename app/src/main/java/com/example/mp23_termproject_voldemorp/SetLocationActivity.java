package com.example.mp23_termproject_voldemorp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SetLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);

        // 선택완료 버튼 눌렀을 때 이벤트 -> 메인 화면으로 화면 전환
        Button goToMainBtn = (Button) findViewById(R.id.setLocationSetDoneBtn);
        goToMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                // 화면 전환 시 오른쪽에서 왼쪽으로 밀듯이 나타나는 애니메이션 적용
                overridePendingTransition(R.anim.slide_left_enter, R.anim.none);
            }
        });
    }
}