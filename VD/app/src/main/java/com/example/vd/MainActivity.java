package com.example.vd;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo, ivBgImage;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ivLogo = findViewById(R.id.ivLogo);
        ivBgImage = findViewById(R.id.ivBgImage);
        tvTitle = findViewById(R.id.tvTitle);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
        ivLogo.startAnimation(animation);
        ivBgImage.startAnimation(animation);
        tvTitle.startAnimation(animation);

        new Handler()
                .postDelayed(()->{
                    startActivity(new Intent(MainActivity.this, Home.class));
                    finish();
                }, 4000);



    }
}




