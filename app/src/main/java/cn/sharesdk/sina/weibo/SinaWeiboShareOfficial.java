package cn.sharesdk.sina.weibo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.widget.LinearLayout;
import cn.sharesdk.facebook.e;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.ShareSDKFileProvider;
import cn.sharesdk.framework.utils.j;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MultiImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.sina.weibo.sdk.share.WbShareCallback;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class SinaWeiboShareOfficial extends FakeActivity implements WbShareCallback {
    private String appkey;
    private IWBAPI iwbapi;
    private AuthorizeListener listener;
    private Platform.ShareParams params;
    private String permissions;
    private String redirectUrl;
    private long thumbSize = 2097152;

    public SinaWeiboShareOfficial(String str, String str2, String str3, Platform.ShareParams shareParams, AuthorizeListener authorizeListener) {
        this.appkey = str;
        this.redirectUrl = str2;
        this.permissions = str3;
        this.params = shareParams;
        this.listener = authorizeListener;
    }

    public void actionShare() {
        MultiImageObject oneImage;
        SSDKLog.b().b("SinaWeiboShareOfficial actionShare");
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        if (!TextUtils.isEmpty(this.params.getText())) {
            TextObject textObject = new TextObject();
            textObject.text = this.params.getText();
            weiboMultiMessage.textObject = textObject;
        }
        if (!TextUtils.isEmpty(this.params.getUrl())) {
            weiboMultiMessage.mediaObject = getWebpageObj();
        } else {
            if (this.params.getImageArray() != null && this.params.getImageArray().length > 0) {
                oneImage = getMultiImageObject();
            } else if (!TextUtils.isEmpty(this.params.getFilePath())) {
                if (getVideoSourceObject() != null) {
                    weiboMultiMessage.videoSourceObject = getVideoSourceObject();
                }
            } else if (this.params.getImageData() != null || !TextUtils.isEmpty(this.params.getImagePath())) {
                if (this.params.getImageData() != null) {
                    weiboMultiMessage.imageObject = getImageObj();
                } else if (!TextUtils.isEmpty(this.params.getImagePath())) {
                    oneImage = getOneImage();
                }
            }
            weiboMultiMessage.multiImageObject = oneImage;
        }
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            try {
                iwbapi.shareMessage(this.activity, weiboMultiMessage, true);
                return;
            } catch (Throwable th2) {
                AuthorizeListener authorizeListener = this.listener;
                if (authorizeListener != null) {
                    authorizeListener.onError(new Throwable(e.a("Share to sina failed: ", th2)));
                }
                SSDKLog b10 = SSDKLog.b();
                b10.a("SinaWeiboShareOfficial share catch: " + th2);
            }
        } else {
            AuthorizeListener authorizeListener2 = this.listener;
            if (authorizeListener2 != null) {
                authorizeListener2.onError(new Throwable("SinaWeibo SDK init failed"));
            }
        }
        finish();
    }

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
            imageObject.imageData = getThumb(this.activity, this.params.getImageData());
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("SinaWeiboShareOfficial getImageObj catch: ", th2), new Object[0]);
        }
        return imageObject;
    }

    private MultiImageObject getMultiImageObject() {
        Uri fromFile;
        MultiImageObject multiImageObject = new MultiImageObject();
        try {
            List<String> asList = Arrays.asList(this.params.getImageArray());
            ArrayList<Uri> arrayList = new ArrayList<>();
            for (String str : asList) {
                File file = new File(str);
                if (file.exists()) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        File file2 = new File(MobSDK.getContext().getExternalFilesDir(null).getPath() + "/" + file.getName());
                        boolean z10 = true;
                        if (!file.getPath().equals(file2.getPath())) {
                            z10 = ResHelper.copyFile(file.getPath(), file2.getPath());
                        }
                        if (z10) {
                            Context context = MobSDK.getContext();
                            fromFile = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
                            MobSDK.getContext().grantUriPermission(BuildConfig.APPLICATION_ID, fromFile, 3);
                        }
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    arrayList.add(fromFile);
                }
            }
            multiImageObject.imageList = arrayList;
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("SinaWeiboShareOfficial getMultiImageObject catch: ", th2), new Object[0]);
        }
        return multiImageObject;
    }

    private MultiImageObject getOneImage() {
        Uri fromFile;
        boolean z10;
        MultiImageObject multiImageObject = new MultiImageObject();
        try {
            List<String> asList = Arrays.asList(this.params.getImagePath());
            ArrayList<Uri> arrayList = new ArrayList<>();
            for (String str : asList) {
                File file = new File(str);
                if (file.exists()) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        File file2 = new File(MobSDK.getContext().getExternalFilesDir(null).getPath() + "/" + file.getName());
                        if (!file.getPath().equals(file2.getPath())) {
                            z10 = ResHelper.copyFile(file.getPath(), file2.getPath());
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            Context context = MobSDK.getContext();
                            fromFile = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
                            MobSDK.getContext().grantUriPermission(BuildConfig.APPLICATION_ID, fromFile, 3);
                        } else {
                            SSDKLog.b().a("QQQ", " SinaWeiboShareOfficial copy failed ");
                        }
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    arrayList.add(fromFile);
                }
            }
            multiImageObject.imageList = arrayList;
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("SinaWeiboShareOfficial getOneImage catch: ", th2), new Object[0]);
            multiImageObject.imageList = null;
        }
        return multiImageObject;
    }

    private Bitmap getResizedBitmap(Bitmap bitmap, double d10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double sqrt = Math.sqrt(d10);
        return Bitmap.createScaledBitmap(bitmap, (int) (width / sqrt), (int) (height / sqrt), true);
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

    private VideoSourceObject getVideoSourceObject() {
        String filePath;
        Uri uri;
        VideoSourceObject videoSourceObject = new VideoSourceObject();
        try {
            filePath = this.params.getFilePath();
            uri = null;
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("SinaWeiboShareOfficial getVideoSourceObject catch: ", th2), new Object[0]);
        }
        if (TextUtils.isEmpty(filePath)) {
            SSDKLog.b().a("SinaWeiboShareOfficial getVideoSourceObject filePath is null ", new Object[0]);
            return null;
        }
        File file = new File(filePath);
        if (file.exists()) {
            if (Build.VERSION.SDK_INT >= 24) {
                Context context = MobSDK.getContext();
                Uri a10 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
                MobSDK.getContext().grantUriPermission(BuildConfig.APPLICATION_ID, a10, 3);
                uri = a10;
            } else {
                uri = Uri.fromFile(file);
            }
        }
        videoSourceObject.videoPath = uri;
        return videoSourceObject;
    }

    private WebpageObject getWebpageObj() {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.title = this.params.getTitle();
        webpageObject.description = this.params.getText();
        webpageObject.actionUrl = this.params.getUrl();
        webpageObject.defaultText = this.params.getText();
        try {
            if (this.params.getImageData() != null) {
                webpageObject.thumbData = getThumb(this.activity, this.params.getImageData());
            } else if (!TextUtils.isEmpty(this.params.getImagePath())) {
                webpageObject.thumbData = getThumb(this.activity, this.params.getImagePath());
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("SinaWeiboShareOfficial getWebpageObj catch: ", th2), new Object[0]);
            webpageObject.thumbData = null;
        }
        return webpageObject;
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            iwbapi.doResultIntent(intent, this);
        } else {
            SSDKLog.b().a("SinaWeiboShareOfficial onActivityResult iwbapi is null");
        }
        super.onActivityResult(i10, i11, intent);
        SSDKLog.b().a("SinaWeiboShareOfficial onActivityResult");
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onCancel() {
        AuthorizeListener authorizeListener = this.listener;
        if (authorizeListener != null) {
            authorizeListener.onCancel();
        }
        SSDKLog.b().a("SinaWeiboShareOfficial doShare onCancel");
        finish();
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onComplete() {
        AuthorizeListener authorizeListener = this.listener;
        if (authorizeListener != null) {
            authorizeListener.onComplete(null);
        }
        SSDKLog.b().a("SinaWeiboShareOfficial doShare onComplete ");
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        super.onCreate();
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
        }
        j.a(new j.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboShareOfficial.1
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    AuthInfo authInfo = new AuthInfo(SinaWeiboShareOfficial.this.activity, SinaWeiboShareOfficial.this.appkey, SinaWeiboShareOfficial.this.redirectUrl, SinaWeiboShareOfficial.this.permissions);
                    SinaWeiboShareOfficial sinaWeiboShareOfficial = SinaWeiboShareOfficial.this;
                    sinaWeiboShareOfficial.iwbapi = WBAPIFactory.createWBAPI(sinaWeiboShareOfficial.activity);
                    SinaWeiboShareOfficial.this.iwbapi.registerApp(SinaWeiboShareOfficial.this.activity, authInfo, new SdkListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboShareOfficial.1.1
                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitFailure(Exception exc) {
                            if (SinaWeiboShareOfficial.this.listener != null) {
                                SinaWeiboShareOfficial.this.listener.onError(exc);
                            }
                            SSDKLog b10 = SSDKLog.b();
                            b10.a("SinaWeiboShareOfficial", "WeiboInitFailure " + exc);
                        }

                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitSuccess() {
                            SinaWeibo.initFlag = true;
                            SinaWeiboShareOfficial.this.actionShare();
                        }
                    });
                } catch (Throwable th2) {
                    if (SinaWeiboShareOfficial.this.listener != null) {
                        SinaWeiboShareOfficial.this.listener.onError(new Throwable(e.a("sinaweibo sdk init failed: ", th2)));
                    }
                    SSDKLog.b().a("SinaWeiboShareOfficial", e.a("onCreate AuthInfo ", th2));
                    SinaWeiboShareOfficial.this.finish();
                }
            }
        });
        j.a(new j.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboShareOfficial.2
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    if (SinaWeibo.initFlag) {
                        SinaWeiboShareOfficial.this.actionShare();
                    }
                    SSDKLog.b().a("SinaWeiboShareOfficial actionShare() ");
                } catch (Throwable th2) {
                    if (SinaWeiboShareOfficial.this.listener != null) {
                        SinaWeiboShareOfficial.this.listener.onError(new Throwable(e.a("Share catch: ", th2)));
                    }
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("SinaWeiboShareOfficial  catch: " + th2);
                    SinaWeiboShareOfficial.this.finish();
                }
            }
        });
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("SinaWeiboShareOfficial doShare onDestroy");
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onError(UiError uiError) {
        if (this.listener != null) {
            StringBuilder a10 = d.a("errorCode: ");
            a10.append(uiError.errorCode);
            a10.append(" errorMessage: ");
            a10.append(uiError.errorMessage);
            a10.append(" errorDetail: ");
            a10.append(uiError.errorDetail);
            this.listener.onError(new Throwable(a10.toString()));
        }
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a11 = d.a("SinaWeiboShareOfficial doShare onError: ");
        a11.append(uiError.errorDetail);
        b10.a(a11.toString());
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("SinaWeiboShareOfficial doShare onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("SinaWeiboShareOfficial doShare onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("SinaWeiboShareOfficial doShare onStop");
    }

    public final void setThumbImage(MultiImageObject multiImageObject, Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                multiImageObject.thumbData = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    SSDKLog.b().a(th);
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                } catch (Throwable th4) {
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Throwable th5) {
                            SSDKLog.b().a(th5);
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            SSDKLog.b().a(th6);
        }
    }
}
