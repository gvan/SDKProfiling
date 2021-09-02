package net.admixer.sdkprofiling;

import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import net.admixer.sdk.AdListener;
import net.admixer.sdk.AdView;
import net.admixer.sdk.BannerAdView;
import net.admixer.sdk.InterstitialAdView;
import net.admixer.sdk.ResultCode;

public class AdmixerBannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admixer_banner);

        findViewById(R.id.banner_admixer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadBannerAdmixer();
            }
        });

        findViewById(R.id.banner_admixer_plus_gam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadBannerAdmixerPlusGAM();
            }
        });

        findViewById(R.id.interstitial_admixer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAdmixer();
            }
        });

        findViewById(R.id.interstitial_admixer_plus_gam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAdmixerPlusGAM();
            }
        });

    }

    private void loadBannerAdmixer(){
        BannerAdView bannerAdView = new BannerAdView(this);
        bannerAdView.setPlacementID("f9a26255-08a2-40ec-9667-3ab35e69625a");
        bannerAdView.setAdSize(300, 250);
        bannerAdView.setAutoRefresh(false);
        Trace.beginSection(Const.LOAD_BANNER_ADMIXER);
        bannerAdView.loadAd();

        bannerAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded(AdView adView) {
                Trace.endSection();
            }

            @Override
            public void onAdRequestFailed(AdView adView, ResultCode resultCode) {

            }

            @Override
            public void onAdExpanded(AdView adView) {

            }

            @Override
            public void onAdCollapsed(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView, String s) {

            }
        });

        LinearLayout container = findViewById(R.id.container);
        container.removeAllViews();
        container.addView(bannerAdView);
    }

    private void loadBannerAdmixerPlusGAM() {

        BannerAdView bannerAdView = new BannerAdView(this);
        bannerAdView.setPlacementID("5881e47c-27c9-4cd7-9f8f-193773c57683");
        bannerAdView.setAdSize(300, 250);
        bannerAdView.setAutoRefresh(false);
        Trace.beginSection(Const.LOAD_BANNER_ADMIXER_PLUS_GAM);
        bannerAdView.loadAd();

        bannerAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded(AdView adView) {
                Trace.endSection();
            }

            @Override
            public void onAdRequestFailed(AdView adView, ResultCode resultCode) {

            }

            @Override
            public void onAdExpanded(AdView adView) {

            }

            @Override
            public void onAdCollapsed(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView, String s) {

            }
        });

        LinearLayout container = findViewById(R.id.container);
        container.removeAllViews();
        container.addView(bannerAdView);
    }

    private void loadInterstitialAdmixer(){
        InterstitialAdView interstitialAdView = new InterstitialAdView(this);
        interstitialAdView.setPlacementID("e94817ae-5d00-4d2a-98d7-5e9600f55ad6");
        Trace.beginSection(Const.LOAD_INTERSTITIAL_ADMIXER);
        interstitialAdView.loadAd();

        interstitialAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded(AdView adView) {
                Trace.endSection();
                interstitialAdView.show();
            }

            @Override
            public void onAdRequestFailed(AdView adView, ResultCode resultCode) {

            }

            @Override
            public void onAdExpanded(AdView adView) {

            }

            @Override
            public void onAdCollapsed(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView, String s) {

            }
        });
    }

    private void loadInterstitialAdmixerPlusGAM(){
        InterstitialAdView interstitialAdView = new InterstitialAdView(this);
        interstitialAdView.setPlacementID("ef302082-1ffb-4e04-bbda-319e37ce4b63");
        Trace.beginSection(Const.LOAD_INTERSTITIAL_ADMIXER_PLUS_GAM);
        interstitialAdView.loadAd();

        interstitialAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded(AdView adView) {
                Trace.endSection();
                interstitialAdView.show();
            }

            @Override
            public void onAdRequestFailed(AdView adView, ResultCode resultCode) {

            }

            @Override
            public void onAdExpanded(AdView adView) {

            }

            @Override
            public void onAdCollapsed(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView) {

            }

            @Override
            public void onAdClicked(AdView adView, String s) {

            }
        });
    }

}
