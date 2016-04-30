package cn.studjams.s1.sj53.huanming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by mingming on 2016/4/28.
 */
public class Splash extends Activity {
    private final int SPLASH_DISPLAY_LENGHT = 3000;//延迟3秒

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        //开启线程，加载图片
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent =new Intent(Splash.this,MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);
    }
}
