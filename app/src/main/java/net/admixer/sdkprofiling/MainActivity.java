package net.admixer.sdkprofiling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import net.admixer.sdk.AdListener;
import net.admixer.sdk.AdView;
import net.admixer.sdk.BannerAdView;
import net.admixer.sdk.ResultCode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.admixer_banner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdmixerBanner();
            }
        });

        findViewById(R.id.gam_banner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGAMBanner();
            }
        });

    }

    private void openAdmixerBanner(){
        startActivity(new Intent(this, AdmixerBannerActivity.class));
    }

    private void openGAMBanner(){
        startActivity(new Intent(this, GAMBannerActivity.class));
    }

}