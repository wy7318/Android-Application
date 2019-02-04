package com.minsub.user.memo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;


public class First extends Activity
{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);

        InnerClassHandler noLeakHandler = new InnerClassHandler(this);
        noLeakHandler.sendEmptyMessageDelayed(0, 2000); // 2초 뒤에 메시지 전달
    }

    // static inner class 로 선언
    static class InnerClassHandler extends Handler
    {
        private final WeakReference<First> mActivity;

        InnerClassHandler(First activity) {
            mActivity = new WeakReference<First>(activity);
        }

        @Override
        public void handleMessage(Message msg)
        {
            First activity = mActivity.get();
            if(activity != null) {
                activity.handleMessage(msg);
            }
        }
    }

    private void handleMessage(Message msg) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();   // MainActivity 종료
    }
}