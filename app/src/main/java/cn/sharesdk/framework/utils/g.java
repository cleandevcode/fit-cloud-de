package cn.sharesdk.framework.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import com.mob.MobSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private String f5307a;

    /* renamed from: b */
    private String f5308b;

    /* renamed from: c */
    private boolean f5309c = true;

    public void a(Platform.ShareParams shareParams, Intent intent) {
        try {
            String imagePath = shareParams.getImagePath();
            String imageUrl = shareParams.getImageUrl();
            List<String> arrayList = new ArrayList();
            if (shareParams.getImageArray() != null) {
                arrayList = Arrays.asList(shareParams.getImageArray());
            }
            if (arrayList == null || arrayList.size() <= 0) {
                if (TextUtils.isEmpty(imagePath) || !new File(imagePath).exists()) {
                    Bitmap imageData = shareParams.getImageData();
                    if (imageData != null && !imageData.isRecycled()) {
                        String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                        File file = new File(cachePath, System.currentTimeMillis() + ".png");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        imageData.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        imagePath = file.getAbsolutePath();
                    } else if (!TextUtils.isEmpty(imageUrl)) {
                        imagePath = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                    }
                }
                if (!TextUtils.isEmpty(imagePath)) {
                    arrayList.add(imagePath);
                }
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (String str : arrayList) {
                if (str.startsWith("http")) {
                    str = BitmapHelper.downloadBitmap(MobSDK.getContext(), str);
                }
                File file2 = new File(str);
                if (file2.exists()) {
                    if (str.startsWith("/data/")) {
                        String cachePath2 = ResHelper.getCachePath(MobSDK.getContext(), "images");
                        File file3 = new File(cachePath2, System.currentTimeMillis() + file2.getName());
                        String absolutePath = file3.getAbsolutePath();
                        file3.createNewFile();
                        if (ResHelper.copyFile(str, absolutePath)) {
                            file2 = file3;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Context context = MobSDK.getContext();
                        Uri a10 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file2);
                        MobSDK.getContext().grantUriPermission(this.f5307a, a10, 3);
                        arrayList2.add(a10);
                    } else {
                        arrayList2.add(Uri.fromFile(file2));
                    }
                }
            }
            if (arrayList2.size() <= 0) {
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
            } else {
                String str2 = "image/*";
                if (arrayList2.size() != 1 || arrayList2.get(0) == null) {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
                } else {
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.STREAM", arrayList2.get(0));
                    String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(((Uri) arrayList2.get(0)).toString());
                    if (contentTypeFor != null && contentTypeFor.length() > 0) {
                        str2 = contentTypeFor;
                    }
                }
                intent.setType(str2);
            }
            if (TextUtils.isEmpty(this.f5308b)) {
                intent.setPackage(this.f5307a);
            } else {
                intent.setClassName(this.f5307a, this.f5308b);
            }
            intent.addFlags(335544320);
            MobSDK.getContext().startActivity(intent);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public void a(Uri uri, Platform platform, PlatformActionListener platformActionListener) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("video/*");
        intent.setPackage(this.f5307a);
        intent.putExtra("android.intent.extra.STREAM", uri);
        if (TextUtils.isEmpty(this.f5308b)) {
            intent.setPackage(this.f5307a);
        } else {
            intent.setClassName(this.f5307a, this.f5308b);
        }
        try {
            intent.addFlags(268435456);
            MobSDK.getContext().startActivity(intent);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", null);
        if (platformActionListener != null) {
            platformActionListener.onComplete(platform, 9, hashMap);
        }
    }

    public void a(final Platform.ShareParams shareParams, Platform platform) {
        SSDKLog.b().a("ShareSDK QQ ShareBypassApproval toShare", new Object[0]);
        final Intent intent = new Intent();
        final String text = shareParams.getText();
        if (TextUtils.isEmpty(text)) {
            a(shareParams, intent);
        } else {
            platform.getShortLintk(text, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.framework.utils.g.1
                @Override // cn.sharesdk.framework.ShareSDKCallback
                /* renamed from: a */
                public void onCallback(String str) {
                    if (TextUtils.isEmpty(str)) {
                        shareParams.setText(text);
                    } else {
                        shareParams.setText(str);
                    }
                    intent.putExtra("android.intent.extra.TEXT", str);
                    intent.putExtra("Kdescription", str);
                    g.this.a(shareParams, intent);
                }
            });
        }
    }

    public void a(String str) {
        this.f5307a = str;
        this.f5308b = "";
    }

    public void a(String str, Platform platform, PlatformActionListener platformActionListener) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (str.endsWith("mp4") || str.endsWith("mkv")) {
            intent.setType("video/*");
        }
        if (TextUtils.isEmpty(this.f5308b)) {
            intent.setPackage(this.f5307a);
        } else {
            intent.setClassName(this.f5307a, this.f5308b);
        }
        if (Build.VERSION.SDK_INT < 24) {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
        } else if (!TextUtils.isEmpty(str)) {
            try {
                File file = new File(str);
                Context context = MobSDK.getContext();
                Uri a10 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
                MobSDK.getContext().grantUriPermission(this.f5307a, a10, 3);
                intent.putExtra("android.intent.extra.STREAM", a10);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2, "ShareSDK ShareBypassApproval getUriForFile exception", new Object[0]);
            }
        }
        try {
            intent.addFlags(268435456);
            MobSDK.getContext().startActivity(intent);
        } catch (Throwable th3) {
            SSDKLog.b().a(th3);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", null);
        if (platformActionListener != null) {
            platformActionListener.onComplete(platform, 9, hashMap);
        }
    }

    public void a(String str, String str2) {
        this.f5307a = str;
        this.f5308b = str2;
    }
}
