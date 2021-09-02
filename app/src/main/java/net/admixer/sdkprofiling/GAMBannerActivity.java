package net.admixer.sdkprofiling;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.tracing.Trace;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

public class GAMBannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gam_banner);

        findViewById(R.id.banner_gam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadGAMBanner();
            }
        });

        findViewById(R.id.interstitial_gam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadGAMInterstitial();
            }
        });

    }

    private void loadGAMBanner(){
        AdManagerAdView adView = new AdManagerAdView(this);
        adView.setAdUnitId("/22595974/sdk-banner");
        adView.setAdSizes(new AdSize(300, 250));
        Trace.beginSection(Const.LOAD_BANNER_GAM);
        adView.loadAd(new AdManagerAdRequest.Builder().build());

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                Trace.endSection();
            }
        });

        LinearLayout container = findViewById(R.id.container);
        container.removeAllViews();
        container.addView(adView);
    }

    private void loadGAMInterstitial(){
        Trace.beginSection(Const.LOAD_INTERSTITIAL_GAM);
        AdManagerInterstitialAd.load(this, "/6499/example/interstitial", new AdManagerAdRequest.Builder().build(),
                new AdManagerInterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull AdManagerInterstitialAd adManagerInterstitialAd) {
                        super.onAdLoaded(adManagerInterstitialAd);
                        Trace.endSection();
                        adManagerInterstitialAd.show(GAMBannerActivity.this);
                    }
                });
    }

}
