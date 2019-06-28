package com.mistong.apt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.mistong.apt_annotation.BindView;
import com.mistong.apt_library.BindViewTools;

/**
 * @author liuxiaoshuai
 * @date 2019-06-27
 * @desc
 * @email liulingfeng@mistong.com
 */
public class MyActivity extends AppCompatActivity {
    @BindView(R.id.tv_content)
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindViewTools.bind(this);
        textView.setText("我的天啊");
    }
}
