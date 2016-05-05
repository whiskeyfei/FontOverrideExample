package org.digitalsprouts.examples.fontoverride;

import android.app.Activity;
import android.os.Bundle;

public class FontDisplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_font_display 想要配置设置textStyle 和typeface，针对与部分需要修改的字体
        setContentView(R.layout.activity_font_display);

        //activity_font_display2 不设置字体的textStyle 和typeface，
        // 利用配置全局主题来达到换字体的效果，前提是我们通过反射来更换了我们想要的字体文件
        //配置主题为 android:theme="@style/AppFontTheme"
//        setContentView(R.layout.activity_font_display2);
    }

}
