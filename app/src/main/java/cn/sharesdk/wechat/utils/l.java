package cn.sharesdk.wechat.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.u0;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.ShareSDKFileProvider;
import cn.sharesdk.wechat.utils.i;
import com.mob.MobSDK;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private static l f5587a;

    /* renamed from: b */
    private j f5588b = new j();

    /* renamed from: c */
    private k f5589c;

    /* renamed from: d */
    private String f5590d;

    /* renamed from: e */
    private String f5591e;

    /* renamed from: f */
    private boolean f5592f;

    /* renamed from: g */
    private int f5593g;

    private l() {
    }

    private Bitmap a(Bitmap bitmap, double d10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double sqrt = Math.sqrt(d10);
        return Bitmap.createScaledBitmap(bitmap, (int) (width / sqrt), (int) (height / sqrt), true);
    }

    public static l a() {
        if (f5587a == null) {
            f5587a = new l();
        }
        return f5587a;
    }

    private void a(Context context, String str, String str2, Bitmap bitmap, int i10, k kVar) {
        WXImageObject wXImageObject = new WXImageObject();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXImageObject.imageData = byteArrayOutputStream.toByteArray();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i10 != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "img", i10, kVar);
    }

    private void a(Context context, String str, String str2, String str3, int i10, k kVar) {
        WXImageObject wXImageObject = new WXImageObject();
        if (d()) {
            if (e()) {
                String a10 = a(new File(str3));
                wXImageObject.imagePath = a10;
                SSDKLog b10 = SSDKLog.b();
                b10.a("ShareSDK share file with FileProvider path is: " + a10);
            }
        } else if (kVar.c() != null) {
            kVar.c().onError(kVar.b(), 9, new Throwable("Wecaht Version is not new"));
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i10 != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = a(context, str3, false);
        a(wXMediaMessage, "img", i10, kVar);
    }

    public void a(Context context, String str, String str2, String str3, Bitmap bitmap, int i10, k kVar) {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "video", i10, kVar);
    }

    public void a(Context context, String str, String str2, String str3, String str4, int i10, k kVar) {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = a(context, str4, false);
        a(wXMediaMessage, "video", i10, kVar);
    }

    public void a(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, int i10, k kVar) {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "music", i10, kVar);
    }

    public void a(Context context, String str, String str2, String str3, String str4, String str5, int i10, k kVar) {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = a(context, str5, false);
        a(wXMediaMessage, "music", i10, kVar);
    }

    private void a(String str, String str2) {
        i.a aVar = new i.a();
        aVar.f5574a = str;
        aVar.f5575b = str2;
        aVar.f5576c = this.f5593g;
        this.f5588b.b(aVar);
    }

    private void a(String str, String str2, int i10, k kVar) {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = str2;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = str2;
        a(wXMediaMessage, InnerShareParams.TEXT, i10, kVar);
    }

    private byte[] a(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10) {
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                throw new RuntimeException("checkArgs fail, thumbData is recycled");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(compressFormat, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            int i10 = DfuBaseService.ERROR_CONNECTION_STATE_MASK;
            if (z10) {
                i10 = 131072;
            }
            while (length > i10) {
                bitmap = a(bitmap, length / i10);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, 100, byteArrayOutputStream2);
                byteArrayOutputStream2.flush();
                byteArrayOutputStream2.close();
                byteArray = byteArrayOutputStream2.toByteArray();
                length = byteArray.length;
            }
            return byteArray;
        }
        throw new RuntimeException("checkArgs fail, thumbData is null");
    }

    private byte[] a(Context context, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                throw new RuntimeException("checkArgs fail, thumbData is recycled");
            }
            return a(context, bitmap, Bitmap.CompressFormat.PNG, z10);
        }
        throw new RuntimeException("checkArgs fail, thumbData is null");
    }

    private byte[] a(Context context, String str, boolean z10) {
        if (new File(str).exists()) {
            return a(context, BitmapHelper.getBitmap(str), BitmapHelper.getBmpFormat(str), z10);
        }
        throw new FileNotFoundException();
    }

    private void b(Context context, String str, String str2, Bitmap bitmap, int i10, k kVar) {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        byte[] a10 = a(context, bitmap, false);
        wXEmojiObject.emojiData = a10;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = a10;
        a(wXMediaMessage, "emoji", i10, kVar);
    }

    private void b(Context context, String str, String str2, String str3, int i10, k kVar) {
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.imagePath = a(new File(str3));
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i10 != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = a(context, str3, false);
        a(wXMediaMessage, "img", i10, kVar);
    }

    public void b(Context context, String str, String str2, String str3, Bitmap bitmap, int i10, k kVar) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (bitmap != null && !bitmap.isRecycled()) {
            byte[] a10 = a(context, bitmap, false);
            wXMediaMessage.thumbData = a10;
            if (a10 == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
            if (a10.length > 32768) {
                StringBuilder a11 = android.support.v4.media.d.a("checkArgs fail, thumbData is too large: ");
                a11.append(wXMediaMessage.thumbData.length);
                a11.append(" > ");
                a11.append(DfuBaseService.ERROR_CONNECTION_STATE_MASK);
                throw new RuntimeException(a11.toString());
            }
        }
        a(wXMediaMessage, "webpage", i10, kVar);
    }

    private void b(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, int i10, k kVar) {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "appdata", i10, kVar);
    }

    private void b(Context context, String str, String str2, String str3, String str4, String str5, int i10, k kVar) {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = a(context, str5, false);
        a(wXMediaMessage, "appdata", i10, kVar);
    }

    private void c(Context context, String str, String str2, String str3, int i10, k kVar) {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        if (Build.VERSION.SDK_INT >= 24) {
            wXEmojiObject.emojiPath = a(new File(str3));
        } else {
            wXEmojiObject.emojiPath = str3;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = a(context, str3, false);
        a(wXMediaMessage, "emoji", i10, kVar);
    }

    private void c(Context context, String str, String str2, String str3, Bitmap bitmap, int i10, k kVar) {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "filedata", i10, kVar);
    }

    private void c(Context context, String str, String str2, String str3, String str4, int i10, k kVar) {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        if (!TextUtils.isEmpty(str)) {
            wXMediaMessage.title = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.mediaObject = wXFileObject;
        if (!TextUtils.isEmpty(str4)) {
            wXMediaMessage.thumbData = a(context, str4, false);
        }
        a(wXMediaMessage, "filedata", i10, kVar);
    }

    public String a(File file) {
        String str;
        if (file != null && file.exists()) {
            try {
                str = MobSDK.getContext().getPackageName();
            } catch (Throwable th2) {
                SSDKLog.b().a(cn.sharesdk.facebook.e.a("get packagename is catch: ", th2), new Object[0]);
                str = null;
            }
            if (str != null) {
                Uri a10 = ShareSDKFileProvider.a(MobSDK.getContext(), str + ".cn.sharesdk.ShareSDKFileProvider", file);
                MobSDK.getContext().grantUriPermission("com.tencent.mm", a10, 1);
                return a10.toString();
            }
        }
        return null;
    }

    public void a(int i10) {
        this.f5593g = i10;
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
        this.f5588b.a(shareSDKCallback);
    }

    public void a(k kVar) {
        this.f5589c = kVar;
        b bVar = new b();
        bVar.f5547a = "snsapi_userinfo";
        bVar.f5548b = "sharesdk_wechat_auth";
        this.f5588b.a((m) bVar, false);
    }

    public void a(k kVar, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        Platform b10 = kVar.b();
        String str = ((Integer) shareParams.get(InnerShareParams.SCENCE, Integer.class)).intValue() == 1 ? "com.tencent.mm.ui.tools.ShareToTimeLineUI" : "com.tencent.mm.ui.tools.ShareImgUI";
        cn.sharesdk.framework.utils.g gVar = new cn.sharesdk.framework.utils.g();
        gVar.a("com.tencent.mm", str);
        gVar.a(shareParams, b10);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", shareParams);
        platformActionListener.onComplete(b10, 9, hashMap);
    }

    public void a(String str) {
        this.f5591e = str;
    }

    public void a(boolean z10) {
        this.f5592f = z10;
    }

    public boolean a(WechatHandlerActivity wechatHandlerActivity) {
        return this.f5588b.a(wechatHandlerActivity, this.f5589c);
    }

    @SuppressLint({"WrongConstant"})
    public void b(final ShareSDKCallback<Integer> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getAInfoForPkg("com.tencent.mm", 128).request(new DH.DHResponder() { // from class: cn.sharesdk.wechat.utils.l.6
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    shareSDKCallback.onCallback(Integer.valueOf(dHResponse.getAInfoForPkg(new int[0]).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0)));
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("WechatHelper getWXAppSupportAPI() get from metaData failed : ", th2), new Object[0]);
                    shareSDKCallback.onCallback(0);
                }
            }
        });
    }

    public void b(k kVar) {
        this.f5589c = kVar;
        g gVar = new g();
        Platform.ShareParams a10 = kVar.a();
        String valueOf = String.valueOf(a10.getWxTemplateid());
        String valueOf2 = String.valueOf(a10.getWxReserved());
        int scence = a10.getScence();
        gVar.f5562b = valueOf;
        gVar.f5561a = scence;
        gVar.f5563c = valueOf2;
        this.f5588b.a(gVar);
    }

    public void b(String str) {
        this.f5590d = str;
    }

    public boolean b() {
        return this.f5588b.a();
    }

    public void c(final k kVar) {
        final Platform.ShareParams a10 = kVar.a();
        final int shareType = a10.getShareType();
        final PlatformActionListener c10 = kVar.c();
        b(new ShareSDKCallback<Integer>() { // from class: cn.sharesdk.wechat.utils.l.1
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Integer num) {
                l lVar;
                k kVar2;
                int i10;
                Platform.ShareParams shareParams;
                try {
                    if (shareType == 11 && num.intValue() < 620756993) {
                        SSDKLog.b().a("not support share miniprogram", new Object[0]);
                        lVar = l.this;
                        kVar2 = kVar;
                        i10 = 4;
                        shareParams = a10;
                    } else {
                        lVar = l.this;
                        kVar2 = kVar;
                        i10 = shareType;
                        shareParams = a10;
                    }
                    lVar.a(kVar2, i10, shareParams, c10);
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("wx share ", th2), new Object[0]);
                }
            }
        });
    }

    public boolean c() {
        return this.f5588b.b();
    }

    public boolean c(String str) {
        return this.f5588b.a(str);
    }

    public boolean d() {
        String str;
        int i10;
        try {
            str = MobSDK.getContext().getPackageManager().getPackageInfo("com.tencent.mm", 0).versionName;
            SSDKLog b10 = SSDKLog.b();
            b10.b("wechat versionName ==>> " + str);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            str = "0";
        }
        String[] split = str.split("_")[0].split("\\.");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                iArr[i11] = ResHelper.parseInt(split[i11]);
            } catch (Throwable th3) {
                SSDKLog.b().a(th3);
                iArr[i11] = 0;
            }
        }
        return length >= 3 && (((i10 = iArr[0]) == 7 && iArr[1] == 0 && iArr[2] >= 13) || i10 >= 8);
    }

    public boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void b(Context context, String str, String str2, String str3, String str4, int i10, k kVar) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (str4 != null && new File(str4).exists()) {
            byte[] a10 = a(context, str4, false);
            wXMediaMessage.thumbData = a10;
            if (a10 == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
            if (a10.length > 32768) {
                StringBuilder a11 = android.support.v4.media.d.a("checkArgs fail, thumbData is too large: ");
                a11.append(wXMediaMessage.thumbData.length);
                a11.append(" > ");
                a11.append(DfuBaseService.ERROR_CONNECTION_STATE_MASK);
                throw new RuntimeException(a11.toString());
            }
        }
        a(wXMediaMessage, "webpage", i10, kVar);
    }

    public void a(Context context, String str, String str2, String str3, String str4, String str5, Bitmap bitmap, int i10, k kVar) {
        StringBuilder sb2;
        String str6;
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.webpageUrl = str;
        if (TextUtils.isEmpty(str2) || !str2.endsWith("@app")) {
            wXMiniProgramObject.userName = a.b.b(str2, "@app");
        } else {
            wXMiniProgramObject.userName = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            String[] split = str3.split("\\?");
            if (split.length > 1) {
                sb2 = new StringBuilder();
                sb2.append(split[0]);
                sb2.append(".html?");
                str6 = split[1];
            } else {
                sb2 = new StringBuilder();
                sb2.append(split[0]);
                str6 = ".html";
            }
            sb2.append(str6);
            wXMiniProgramObject.path = sb2.toString();
            wXMiniProgramObject.withShareTicket = this.f5592f;
            wXMiniProgramObject.miniprogramType = this.f5593g;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str4;
        wXMediaMessage.mediaObject = wXMiniProgramObject;
        wXMediaMessage.description = str5;
        if (bitmap != null && !bitmap.isRecycled()) {
            byte[] a10 = a(context, bitmap, true);
            wXMediaMessage.thumbData = a10;
            if (a10 == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
            if (a10.length > 131072) {
                StringBuilder a11 = android.support.v4.media.d.a("checkArgs fail, thumbData is too large: ");
                a11.append(wXMediaMessage.thumbData.length);
                a11.append(" > ");
                a11.append(131072);
                throw new RuntimeException(a11.toString());
            }
        }
        a(wXMediaMessage, "webpage", i10, kVar);
    }

    public void a(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i10, k kVar) {
        StringBuilder sb2;
        String str7;
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.miniprogramType = this.f5593g;
        wXMiniProgramObject.webpageUrl = str;
        if (TextUtils.isEmpty(str2) || !str2.endsWith("@app")) {
            wXMiniProgramObject.userName = a.b.b(str2, "@app");
        } else {
            wXMiniProgramObject.userName = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            String[] split = str3.split("\\?");
            if (split.length > 1) {
                sb2 = new StringBuilder();
                sb2.append(split[0]);
                sb2.append(".html?");
                str7 = split[1];
            } else {
                sb2 = new StringBuilder();
                sb2.append(split[0]);
                str7 = ".html";
            }
            sb2.append(str7);
            wXMiniProgramObject.path = sb2.toString();
            wXMiniProgramObject.withShareTicket = this.f5592f;
            wXMiniProgramObject.miniprogramType = this.f5593g;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str4;
        wXMediaMessage.mediaObject = wXMiniProgramObject;
        wXMediaMessage.description = str5;
        wXMediaMessage.thumbData = a(context, str6, true);
        a(wXMediaMessage, "miniProgram", i10, kVar);
    }

    private void a(WXMediaMessage wXMediaMessage, String str, int i10, k kVar) {
        Class<?> cls;
        String str2 = DH.SyncMtd.getPackageName() + ".wxapi.WXEntryActivity";
        try {
            cls = Class.forName(str2);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            cls = null;
        }
        if (cls != null && !WechatHandlerActivity.class.isAssignableFrom(cls)) {
            new Throwable(k.f.a(WechatHandlerActivity.class, p.a.a(str2, " does not extend from "))).printStackTrace();
        }
        SendMessageReq sendMessageReq = new SendMessageReq();
        StringBuilder a10 = android.support.v4.media.d.a(str);
        a10.append(System.currentTimeMillis());
        sendMessageReq.f5641e = a10.toString();
        sendMessageReq.f5537a = wXMediaMessage;
        sendMessageReq.f5538b = i10;
        this.f5589c = kVar;
        this.f5588b.a(sendMessageReq, wXMediaMessage.mediaObject instanceof WXMiniProgramObject);
    }

    public void a(final k kVar, int i10, Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        Context context;
        String str;
        File parentFile;
        ShareSDKCallback<String> shareSDKCallback;
        boolean z10;
        Context context2;
        String str2;
        Context context3;
        String str3;
        Context context4;
        Context context5;
        String str4;
        Context context6;
        final Platform b10 = kVar.b();
        final String title = shareParams.getTitle();
        final String text = shareParams.getText();
        final int scence = shareParams.getScence();
        final String imagePath = shareParams.getImagePath();
        String imageFileProviderPath = shareParams.getImageFileProviderPath();
        final String imageUrl = shareParams.getImageUrl();
        final Bitmap imageData = shareParams.getImageData();
        String musicUrl = shareParams.getMusicUrl();
        String url = shareParams.getUrl();
        String filePath = shareParams.getFilePath();
        String extInfo = shareParams.getExtInfo();
        switch (i10) {
            case 1:
                a(title, text, scence, kVar);
                return;
            case 2:
                if (imagePath == null || imagePath.length() <= 0) {
                    if (imageFileProviderPath != null && imageFileProviderPath.length() > 0) {
                        a(MobSDK.getContext(), title, text, imageFileProviderPath, scence, kVar);
                        return;
                    } else if (imageData != null && !imageData.isRecycled()) {
                        a(MobSDK.getContext(), title, text, imageData, scence, kVar);
                        return;
                    } else if (imageUrl == null || imageUrl.length() <= 0) {
                        context = MobSDK.getContext();
                        str = "";
                        b(context, title, text, str, scence, kVar);
                        return;
                    } else {
                        imagePath = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                        try {
                            if (!TextUtils.isEmpty(imagePath) && (parentFile = new File(imagePath).getParentFile()) != null && parentFile.isDirectory()) {
                                File file = new File(parentFile.getAbsolutePath(), ".nomedia");
                                if (!file.exists() || !file.isFile()) {
                                    file.createNewFile();
                                }
                            }
                        } catch (Throwable th2) {
                            SSDKLog.b().a(cn.sharesdk.facebook.e.a("when share iamge wechat that create nomedia catch ", th2), new Object[0]);
                        }
                    }
                }
                context = MobSDK.getContext();
                str = imagePath;
                b(context, title, text, str, scence, kVar);
                return;
            case 3:
            case 10:
            default:
                if (platformActionListener != null) {
                    platformActionListener.onError(b10, 9, new IllegalArgumentException(u0.a("shareType = ", i10)));
                    return;
                }
                return;
            case 4:
                z10 = false;
                shareSDKCallback = new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.4
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str5) {
                        try {
                            kVar.a().setUrl(str5);
                            String str6 = imagePath;
                            if (str6 == null || str6.length() <= 0) {
                                Bitmap bitmap = imageData;
                                if (bitmap == null || bitmap.isRecycled()) {
                                    String str7 = imageUrl;
                                    if (str7 == null || str7.length() <= 0) {
                                        l.this.b(MobSDK.getContext(), title, text, str5, "", scence, kVar);
                                    } else {
                                        l.this.b(MobSDK.getContext(), title, text, str5, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                    }
                                } else {
                                    l.this.b(MobSDK.getContext(), title, text, str5, imageData, scence, kVar);
                                }
                            } else {
                                l.this.b(MobSDK.getContext(), title, text, str5, imagePath, scence, kVar);
                            }
                        } catch (Throwable th3) {
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(b10, 9, th3);
                            }
                        }
                    }
                };
                break;
            case 5:
                b10.getShortLintk(android.support.v4.media.a.a(musicUrl, " ", url), false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.2
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str5) {
                        l lVar;
                        Context context7;
                        String str6;
                        String str7;
                        String str8;
                        int i11;
                        k kVar2;
                        try {
                            String str9 = str5.split(" ")[0];
                            String str10 = str5.split(" ")[1];
                            String str11 = imagePath;
                            if (str11 == null || str11.length() <= 0) {
                                Bitmap bitmap = imageData;
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    l.this.a(MobSDK.getContext(), title, text, str9, str10, imageData, scence, kVar);
                                    return;
                                }
                                String str12 = imageUrl;
                                if (str12 == null || str12.length() <= 0) {
                                    lVar = l.this;
                                    context7 = MobSDK.getContext();
                                    str6 = title;
                                    str7 = text;
                                    str8 = "";
                                    i11 = scence;
                                    kVar2 = kVar;
                                } else {
                                    str8 = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                                    lVar = l.this;
                                    context7 = MobSDK.getContext();
                                    str6 = title;
                                    str7 = text;
                                    i11 = scence;
                                    kVar2 = kVar;
                                }
                            } else {
                                lVar = l.this;
                                context7 = MobSDK.getContext();
                                str6 = title;
                                str7 = text;
                                str8 = imagePath;
                                i11 = scence;
                                kVar2 = kVar;
                            }
                            lVar.a(context7, str6, str7, str9, str10, str8, i11, kVar2);
                        } catch (Throwable th3) {
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(b10, 9, th3);
                            }
                        }
                    }
                });
                return;
            case 6:
                z10 = false;
                shareSDKCallback = new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.3
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str5) {
                        try {
                            kVar.a().setUrl(str5);
                            String str6 = imagePath;
                            if (str6 == null || str6.length() <= 0) {
                                Bitmap bitmap = imageData;
                                if (bitmap == null || bitmap.isRecycled()) {
                                    String str7 = imageUrl;
                                    if (str7 == null || str7.length() <= 0) {
                                        l.this.a(MobSDK.getContext(), title, text, str5, "", scence, kVar);
                                    } else {
                                        l.this.a(MobSDK.getContext(), title, text, str5, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                    }
                                } else {
                                    l.this.a(MobSDK.getContext(), title, text, str5, imageData, scence, kVar);
                                }
                            } else {
                                l.this.a(MobSDK.getContext(), title, text, str5, imagePath, scence, kVar);
                            }
                        } catch (Throwable th3) {
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(b10, 9, th3);
                            }
                        }
                    }
                };
                break;
            case 7:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SAHRE_APP");
                }
                if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SAHRE_APP");
                }
                if (imagePath == null || imagePath.length() <= 0) {
                    if (imageData != null && !imageData.isRecycled()) {
                        b(MobSDK.getContext(), title, text, filePath, extInfo, imageData, scence, kVar);
                        return;
                    } else if (imageUrl == null || imageUrl.length() <= 0) {
                        context2 = MobSDK.getContext();
                        str2 = "";
                        b(context2, title, text, filePath, extInfo, str2, scence, kVar);
                        return;
                    } else {
                        imagePath = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                    }
                }
                context2 = MobSDK.getContext();
                str2 = imagePath;
                b(context2, title, text, filePath, extInfo, str2, scence, kVar);
                return;
            case 8:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_FILE");
                }
                if (imagePath != null && imagePath.length() > 0) {
                    context4 = MobSDK.getContext();
                    str3 = imagePath;
                } else if (imageData != null && !imageData.isRecycled()) {
                    c(MobSDK.getContext(), title, text, filePath, imageData, scence, kVar);
                    return;
                } else {
                    if (imageUrl == null || imageUrl.length() <= 0) {
                        context3 = MobSDK.getContext();
                        filePath = a(new File(filePath));
                        str3 = "";
                    } else {
                        str3 = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                        context3 = MobSDK.getContext();
                    }
                    context4 = context3;
                }
                c(context4, title, text, filePath, str3, scence, kVar);
                return;
            case 9:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_EMOJI");
                }
                if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SHARE_EMOJI");
                }
                if (imagePath == null || imagePath.length() <= 0) {
                    if (imageUrl != null && imageUrl.length() > 0) {
                        str4 = new NetworkHelper().downloadCache(MobSDK.getContext(), imageUrl, "images", true, null);
                        context5 = MobSDK.getContext();
                    } else if (imageData != null && !imageData.isRecycled()) {
                        b(MobSDK.getContext(), title, text, imageData, scence, kVar);
                        return;
                    } else {
                        context5 = MobSDK.getContext();
                        str4 = "";
                    }
                    context6 = context5;
                } else {
                    context6 = MobSDK.getContext();
                    str4 = imagePath;
                }
                c(context6, title, text, str4, scence, kVar);
                return;
            case 11:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SAHRE_WXMINIPROGRAM");
                }
                if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SAHRE_WXMINIPROGRAM");
                }
                if (!TextUtils.isEmpty(this.f5590d)) {
                    z10 = false;
                    shareSDKCallback = new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.5
                        @Override // cn.sharesdk.framework.ShareSDKCallback
                        /* renamed from: a */
                        public void onCallback(String str5) {
                            try {
                                kVar.a().setUrl(str5);
                                String str6 = imagePath;
                                if (str6 == null || str6.length() <= 0) {
                                    Bitmap bitmap = imageData;
                                    if (bitmap == null || bitmap.isRecycled()) {
                                        String str7 = imageUrl;
                                        if (str7 == null || str7.length() <= 0) {
                                            l.this.a(MobSDK.getContext(), str5, l.this.f5590d, l.this.f5591e, title, text, "", scence, kVar);
                                        } else {
                                            l.this.a(MobSDK.getContext(), str5, l.this.f5590d, l.this.f5591e, title, text, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                        }
                                    } else {
                                        l.this.a(MobSDK.getContext(), str5, l.this.f5590d, l.this.f5591e, title, text, imageData, scence, kVar);
                                    }
                                } else {
                                    l.this.a(MobSDK.getContext(), str5, l.this.f5590d, l.this.f5591e, title, text, imagePath, scence, kVar);
                                }
                            } catch (Throwable th3) {
                                PlatformActionListener platformActionListener2 = platformActionListener;
                                if (platformActionListener2 != null) {
                                    platformActionListener2.onError(b10, 9, th3);
                                }
                            }
                        }
                    };
                    break;
                } else if (platformActionListener != null) {
                    platformActionListener.onError(b10, 9, new Throwable("checkArgs fail, UserName or Path is invalid"));
                    return;
                } else {
                    return;
                }
            case 12:
                if (!TextUtils.isEmpty(this.f5590d) && !TextUtils.isEmpty(this.f5591e)) {
                    a(this.f5590d, this.f5591e);
                    return;
                } else if (platformActionListener != null) {
                    platformActionListener.onError(b10, 9, new Throwable("checkArgs fail, UserName or Path is invalid"));
                    return;
                } else {
                    return;
                }
        }
        b10.getShortLintk(url, z10, shareSDKCallback);
    }
}
