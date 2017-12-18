package com.marno.easystateview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.marno.easystatelibrary.EasyStatusView;

public class StatusPreviewActivity extends AppCompatActivity {


    private EasyStatusView mEsvLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_preview);
        mEsvLayout = (EasyStatusView) findViewById(R.id.esvlayout);
        mEsvLayout.loading();

        mEsvLayout.setCommonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //如果想对不同的status进行特殊的处理  就可以在这里那到status  进行判断进行处理
                //mEsvLayout.getCurrentStatus() 获取status的状态
                Toast.makeText(StatusPreviewActivity.this, "加载数据" + mEsvLayout.getCurrentStatus(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_content:
                mEsvLayout.content();
                break;
            case R.id.tv_empty:
                mEsvLayout.empty();
                break;
            case R.id.tv_error:
                mEsvLayout.error();
                break;
            case R.id.tv_loading:
                mEsvLayout.loading();
                break;
            case R.id.tv_noNet:
                mEsvLayout.noNet();
                break;
        }
    }
}
