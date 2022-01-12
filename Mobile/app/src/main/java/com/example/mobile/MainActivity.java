package com.example.mobile;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isMute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GameActivity.class));
            }
        });
        TextView highscoretxt = findViewById(R.id.highscoretxt);

        final SharedPreferences prefs = getSharedPreferences("Game",MODE_PRIVATE);
        highscoretxt.setText("HighScore: " + prefs.getInt("HighScore", 0));

        isMute = prefs.getBoolean("IsMute", false);

        final ImageView volumectrl = findViewById(R.id.volumectrl);
        if (isMute)
            volumectrl.setImageResource(R.drawable.ic_baseline_volume_off_24);
        else
            volumectrl.setImageResource(R.drawable.ic_baseline_volume_up_24);

        volumectrl.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View view) {
                isMute = !isMute;
                if (isMute)
                    volumectrl.setImageResource(R.drawable.ic_baseline_volume_off_24);
                else
                    volumectrl.setImageResource(R.drawable.ic_baseline_volume_up_24);

                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean("IsMute", isMute);
                editor.apply();
            }
        });
    }
}