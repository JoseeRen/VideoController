/*
 * Create on 2017-7-27 下午1:52
 * FileName: MainActivity.java
 * Author: Ren Yaowei
 * Blog: http://www.renyaowei.top
 * Email renyaowei@foxmail.com
 */

package renyaowei.top.videocontroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.pili.pldroid.player.widget.PLVideoTextureView;

public class MainActivity extends AppCompatActivity {
    String url = "http://121.22.11.84:8008/12703/V/20160110/2016011001051152027.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化播放器
        final PLVideoTextureView videoView = (PLVideoTextureView) findViewById(R.id.videoView);
        //加载动画
        ProgressBar loadingView = (ProgressBar) findViewById(R.id.loadingview);
        //控制器

        MediaController controller = new MediaController(this, true, false);
        videoView.setMediaController(controller);
        videoView.setBufferingIndicator(loadingView);
       videoView.setVideoPath(url);
    }
}
