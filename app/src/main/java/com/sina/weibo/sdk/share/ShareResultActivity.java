package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public class ShareResultActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        String str;
        super.onCreate(bundle);
        try {
            intent = getIntent();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (intent == null) {
            finish();
        } else if (intent.getIntExtra("start_flag", -1) != 1002) {
            finish();
        } else {
            String action = intent.getAction();
            if (!"com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY".equals(action)) {
                str = "com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY".equals(action) ? "com.sina.weibo.sdk.share.ShareStoryActivity" : "com.sina.weibo.sdk.share.ShareStoryActivity";
                startActivity(intent);
                finish();
            }
            str = "com.sina.weibo.sdk.share.ShareTransActivity";
            intent.setClassName(this, str);
            startActivity(intent);
            finish();
        }
    }
}
