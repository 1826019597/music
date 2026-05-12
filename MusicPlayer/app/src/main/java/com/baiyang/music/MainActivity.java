package com.baiyang.music;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Simple Music Player\nAndroid 5.1 Compatible");
        tv.setTextSize(24);
        tv.setGravity(17);
        setContentView(tv);
    }
}
