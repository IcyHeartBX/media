package com.pix.ffmpeghello;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	 @Override  
	    protected void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.activity_main);  
	          
	        final TextView libinfoText = (TextView) findViewById(R.id.text_libinfo);  
	        libinfoText.setMovementMethod(ScrollingMovementMethod.getInstance());   
	          
	        libinfoText.setText(configurationinfo());  
	          
	        Button configurationButton = (Button) this.findViewById(R.id.button_configuration);  
	        Button urlprotocolButton = (Button) this.findViewById(R.id.button_urlprotocol);  
	        Button avformatButton = (Button) this.findViewById(R.id.button_avformat);  
	        Button avcodecButton = (Button) this.findViewById(R.id.button_avcodec);  
	        Button avfilterButton = (Button) this.findViewById(R.id.button_avfilter);  
	          
	        urlprotocolButton.setOnClickListener(new OnClickListener() {  
	            public void onClick(View arg0){  
	                libinfoText.setText(urlprotocolinfo());  
	            }  
	        });  
	          
	        avformatButton.setOnClickListener(new OnClickListener() {  
	            public void onClick(View arg0){  
	                libinfoText.setText(avformatinfo());  
	            }  
	        });  
	          
	        avcodecButton.setOnClickListener(new OnClickListener() {  
	            public void onClick(View arg0){  
	                libinfoText.setText(avcodecinfo());  
	            }  
	        });  
	          
	        avfilterButton.setOnClickListener(new OnClickListener() {  
	            public void onClick(View arg0){  
	                libinfoText.setText(avfilterinfo());  
	            }  
	        });  
	          
	        configurationButton.setOnClickListener(new OnClickListener() {  
	            public void onClick(View arg0){  
	                libinfoText.setText(configurationinfo());  
	            }  
	        });  
	          
	    }  
	      
	    //JNI  
	    public native String urlprotocolinfo();  
	    public native String avformatinfo();  
	    public native String avcodecinfo();  
	    public native String avfilterinfo();  
	    public native String configurationinfo();  
	      
	    static{  
	    	System.loadLibrary("avutil-55");  
	        System.loadLibrary("avcodec-57");  
	        System.loadLibrary("avformat-57");  
	        System.loadLibrary("avdevice-57");  
	        System.loadLibrary("swresample-2");  
	        System.loadLibrary("swscale-4");  
//	        System.loadLibrary("postproc-53");  
	        System.loadLibrary("avfilter-6");  
	        System.loadLibrary("ffmpeg-hello");
	    }  
    
}
