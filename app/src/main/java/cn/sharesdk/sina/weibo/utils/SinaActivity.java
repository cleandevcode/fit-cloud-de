package cn.sharesdk.sina.weibo.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.LinearLayout;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.UIHandler;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

/* loaded from: classes.dex */
public class SinaActivity extends FakeActivity implements Handler.Callback {
    private static final int ERR_CANCEL = 1;
    private static final int ERR_FAIL = 2;
    private static final int ERR_OK = 0;
    private static final String SDK_VERSION = "0031405000";
    private String appKey;
    private AuthorizeListener authListener;
    private boolean isCallback;
    private Platform.ShareParams params;
    private long thumbSize = 2097152;

    private byte[] bitmapTByte(Context context, Bitmap bitmap) {
        if (bitmap == null) {
            throw new RuntimeException("checkArgs fail, thumbData is null");
        }
        if (bitmap.isRecycled()) {
            throw new RuntimeException("checkArgs fail, thumbData is recycled");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (true) {
            long j10 = this.thumbSize;
            if (length <= j10) {
                return byteArray;
            }
            bitmap = getResizedBitmap(bitmap, length / j10);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream2);
            byteArrayOutputStream2.flush();
            byteArrayOutputStream2.close();
            byteArray = byteArrayOutputStream2.toByteArray();
            length = byteArray.length;
        }
    }

    private String generateGUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    private ImageObject getImageObj() {
        ImageObject imageObject = new ImageObject();
        try {
            if (this.params.getImageData() != null) {
                imageObject.imageData = getThumb(this.activity, this.params.getImageData());
            } else if (!TextUtils.isEmpty(this.params.getImagePath())) {
                imageObject.imageData = getThumb(this.activity, this.params.getImagePath());
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
        return imageObject;
    }

    private Bitmap getResizedBitmap(Bitmap bitmap, double d10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double sqrt = Math.sqrt(d10);
        return Bitmap.createScaledBitmap(bitmap, (int) (width / sqrt), (int) (height / sqrt), true);
    }

    private TextObject getTextObj() {
        TextObject textObject = new TextObject();
        textObject.text = this.params.getText();
        return textObject;
    }

    private byte[] getThumb(Context context, Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                throw new RuntimeException("checkArgs fail, thumbData is recycled");
            }
            return bitmapTByte(context, bitmap);
        }
        throw new RuntimeException("checkArgs fail, thumbData is null");
    }

    private byte[] getThumb(Context context, String str) {
        if (new File(str).exists()) {
            return bitmapTByte(context, BitmapHelper.getBitmap(str));
        }
        throw new FileNotFoundException();
    }

    private void onResponse(int i10, String str) {
        AuthorizeListener authorizeListener;
        if (i10 == 0) {
            AuthorizeListener authorizeListener2 = this.authListener;
            if (authorizeListener2 != null) {
                authorizeListener2.onComplete(null);
            }
        } else if (i10 == 1) {
            AuthorizeListener authorizeListener3 = this.authListener;
            if (authorizeListener3 != null) {
                authorizeListener3.onCancel();
            }
        } else if (i10 == 2 && (authorizeListener = this.authListener) != null) {
            authorizeListener.onError(new Throwable(str));
        }
        finish();
    }

    private void sendMessage() {
        UIHandler.sendEmptyMessageDelayed(1, 200L, this);
    }

    private boolean startClientShare(Activity activity, String str, String str2, Bundle bundle) {
        if (activity == null || TextUtils.isEmpty("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY") || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SSDKLog.b().d("launchWeiboActivity fail, invalid arguments", new Object[0]);
            return false;
        }
        String packageName = activity.getPackageName();
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("_weibo_sdkVersion", SDK_VERSION);
        intent.putExtra("_weibo_appPackage", packageName);
        intent.putExtra("_weibo_appKey", str2);
        intent.putExtra("_weibo_flag", 538116905);
        intent.putExtra("_weibo_transaction", String.valueOf(System.currentTimeMillis()));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        try {
            SSDKLog b10 = SSDKLog.b();
            b10.a("launchWeiboActivity intent=" + intent + ", extra=" + intent.getExtras(), new Object[0]);
            startActivityForResult(intent, 765);
            return true;
        } catch (ActivityNotFoundException e10) {
            SSDKLog.b().d(e10.getMessage(), new Object[0]);
            return false;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AuthorizeListener authorizeListener;
        if (message.what == 1) {
            if (!this.isCallback && (authorizeListener = this.authListener) != null) {
                authorizeListener.onCancel();
            }
            finish();
            return false;
        }
        return false;
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        SSDKLog.b().a("sina activity requestCode = %s, resultCode = %s", Integer.valueOf(i10), Integer.valueOf(i10));
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onNewIntent(Intent intent) {
        this.isCallback = true;
        Bundle extras = intent.getExtras();
        SSDKLog.b().c("onNewIntent ==>>", extras.toString());
        String stringExtra = intent.getStringExtra("_weibo_appPackage");
        String stringExtra2 = intent.getStringExtra("_weibo_transaction");
        if (TextUtils.isEmpty(stringExtra)) {
            SSDKLog.b().d("handleWeiboResponse faild appPackage is null", new Object[0]);
            return;
        }
        SSDKLog.b().a(a.b.b("handleWeiboResponse getCallingPackage : ", this.activity.getCallingPackage()), new Object[0]);
        if (TextUtils.isEmpty(stringExtra2)) {
            SSDKLog.b().d("handleWeiboResponse faild intent _weibo_transaction is null", new Object[0]);
        } else {
            onResponse(extras.getInt("_weibo_resp_errcode"), extras.getString("_weibo_resp_errstr"));
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setShareParams(Platform.ShareParams shareParams) {
        this.params = shareParams;
    }

    public void setSinaAuthListener(AuthorizeListener authorizeListener) {
        this.authListener = authorizeListener;
    }
}
