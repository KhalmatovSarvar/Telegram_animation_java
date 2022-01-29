package com.example.telegram_animation_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.example.telegram_animation_java.adapters.ViewPagerAdapter;
import com.example.telegram_animation_java.fragments.FragmentFifth;
import com.example.telegram_animation_java.fragments.FragmentFirst;
import com.example.telegram_animation_java.fragments.FragmentFourth;
import com.example.telegram_animation_java.fragments.FragmentSecond;
import com.example.telegram_animation_java.fragments.FragmentSixths;
import com.example.telegram_animation_java.fragments.FragmentThird;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    WormDotsIndicator wormDotsIndicator;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.view_pager);
        lottieAnimationView =findViewById(R.id.animation);
        lottieAnimationView.setAnimation("telegram.json");
        lottieAnimationView.playAnimation();
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        wormDotsIndicator = findViewById(R.id.worm_dots_indicator);
        viewPager = findViewById(R.id.view_pager);

        viewPagerAdapter.add(new FragmentFirst());
        viewPagerAdapter.add(new FragmentSecond());
        viewPagerAdapter.add(new FragmentThird());
        viewPagerAdapter.add(new FragmentFourth());
        viewPagerAdapter.add(new FragmentFifth());
        viewPagerAdapter.add(new FragmentSixths());



        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position){

                    case 1:{
                        lottieAnimationView.setAnimation("speed.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                    case 2:{
                        lottieAnimationView.setAnimation("free.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }

                    case 3:{
                        lottieAnimationView.setAnimation("infinity.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }

                    case 4:{
                        lottieAnimationView.setAnimation("secure.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }

                    case 5:{
                        lottieAnimationView.setAnimation("cloud.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }

                    default:{
                        lottieAnimationView.setAnimation("telegram.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        viewPager.setAdapter(viewPagerAdapter);
        wormDotsIndicator.setViewPager(viewPager);

    }
}
