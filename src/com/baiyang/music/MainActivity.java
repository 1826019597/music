package com.baiyang.music;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;
public class MainActivity extends Activity {
    private MediaPlayer mediaPlayer;
    private boolean isPlaying = false;
    private Button playButton;
    private TextView statusText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        playButton = (Button) findViewById(R.id.play_button);
        statusText = (TextView) findViewById(R.id.status_text);
        
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    pausePlayback();
                } else {
                    startPlayback();
                }
            }
        });
        
        statusText.setText("准备就绪，可以播放音乐");
    }
    
    private void startPlayback() {
        // 这里可以指定你的音乐文件路径，或者添加文件选择器
        isPlaying = true;
        playButton.setText("暂停");
        statusText.setText("正在播放...");
    }
    
    private void pausePlayback() {
        isPlaying = false;
        playButton.setText("播放");
        statusText.setText("已暂停");
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
