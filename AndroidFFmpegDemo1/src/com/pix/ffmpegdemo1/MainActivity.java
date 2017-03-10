package com.pix.ffmpegdemo1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        /* Create a TextView and set its content.
         * the text is retrieved by calling a native
         * function.
         */
        TextView  tv = new TextView(this);
        tv.setText( stringFromJNI() );
        setContentView(tv);
    }
    
    
    
    public native String  stringFromJNI();

    static {
    	System.loadLibrary("avutil-55");  
        System.loadLibrary("avcodec-57");  
        System.loadLibrary("avformat-57");  
        System.loadLibrary("avdevice-57");  
        System.loadLibrary("swresample-2");  
        System.loadLibrary("swscale-4");  
//        System.loadLibrary("postproc-53");  
        System.loadLibrary("avfilter-6");  
        System.loadLibrary("ffmpeg-demo1");
    }
    
}
