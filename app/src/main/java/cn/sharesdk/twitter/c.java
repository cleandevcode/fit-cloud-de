package cn.sharesdk.twitter;

import a0.q;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.ShareSDKFileProvider;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: b */
    private static c f5506b;

    /* renamed from: c */
    private cn.sharesdk.framework.utils.b f5507c;

    /* renamed from: d */
    private SSDKNetworkHelper f5508d;

    /* renamed from: e */
    private MappedFileReader f5509e;

    /* renamed from: f */
    private int f5510f;

    /* renamed from: g */
    private String f5511g;

    /* renamed from: h */
    private String f5512h;

    /* renamed from: i */
    private boolean f5513i;

    private c(Platform platform) {
        super(platform);
        this.f5510f = 0;
        this.f5507c = new cn.sharesdk.framework.utils.b();
        this.f5508d = SSDKNetworkHelper.getInstance();
    }

    public static c a(Platform platform) {
        if (f5506b == null) {
            f5506b = new c(platform);
        }
        return f5506b;
    }

    private HashMap<String, Object> a(String str, long j10, String str2) {
        HashMap<String, Object> e10 = e(str);
        if (e10 == null || !((String) e10.get("media_id_string")).equals(str)) {
            return null;
        }
        return d(str2, str);
    }

    private HashMap<String, Object> a(String str, String str2, long j10) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("command", "INIT"));
        arrayList.add(new KVPair<>("media_type", "video/mp4"));
        arrayList.add(new KVPair<>("total_bytes", String.valueOf(j10)));
        ArrayList<KVPair<String>> a10 = this.f5507c.a(this.f5507c.a("https://upload.twitter.com/1.1/media/upload.json", arrayList));
        a10.remove(1);
        String httpPost = this.f5508d.httpPost("https://upload.twitter.com/1.1/media/upload.json", arrayList, null, a10, "/1.1/media/upload.json", b());
        if (httpPost == null || httpPost.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpPost);
    }

    private void a(boolean z10) {
        this.f5513i = z10;
    }

    public byte[] a(MappedFileReader mappedFileReader) {
        if (mappedFileReader == null || mappedFileReader.read() == -1) {
            return null;
        }
        return mappedFileReader.getArray();
    }

    private String b(String str, final String str2, final long j10) {
        MappedFileReader mappedFileReader = new MappedFileReader(str, 524288);
        this.f5509e = mappedFileReader;
        byte[] a10 = a(mappedFileReader);
        if (a10 == null) {
            return null;
        }
        a(MappedFileReader.byteToBase64(a10), true, new UpLoadViewCallBack() { // from class: cn.sharesdk.twitter.c.2
            @Override // cn.sharesdk.twitter.UpLoadViewCallBack
            public void onResule(String str3) {
                c cVar = c.this;
                byte[] a11 = cVar.a(cVar.f5509e);
                if (a11 != null) {
                    c.this.a(MappedFileReader.byteToBase64(a11), true, (UpLoadViewCallBack) this, str2, j10);
                } else if (c.this.f5509e != null) {
                    c.this.f5509e.close();
                }
            }
        }, str2, j10);
        return "Done";
    }

    private HashMap<String, Object> e(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("command", "FINALIZE"));
        arrayList.add(new KVPair<>("media_id", str));
        ArrayList<KVPair<String>> a10 = this.f5507c.a(this.f5507c.a("https://upload.twitter.com/1.1/media/upload.json", arrayList));
        a10.remove(1);
        String httpPost = this.f5508d.httpPost("https://upload.twitter.com/1.1/media/upload.json", arrayList, null, a10, "/1.1/media/upload.json", b());
        if (httpPost == null || httpPost.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpPost);
    }

    public String a() {
        return this.f5511g;
    }

    public HashMap<String, Object> a(String str, String[] strArr) {
        String str2;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        ArrayList<KVPair<String>> a10 = this.f5507c.a(this.f5507c.a("https://upload.twitter.com/1.1/media/upload.json", arrayList));
        a10.remove(1);
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < strArr.length && arrayList2.size() <= 3; i10++) {
            try {
                str2 = strArr[i10];
            } catch (Exception unused) {
                SSDKLog.b().a(sb2.toString(), new Object[0]);
            }
            if (str2.startsWith("http")) {
                str2 = BitmapHelper.downloadBitmap(MobSDK.getContext(), str2);
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    if (!new File(str2).exists()) {
                    }
                }
            }
            String httpPost = this.f5508d.httpPost("https://upload.twitter.com/1.1/media/upload.json", arrayList, new KVPair<>("media", str2), a10, "/1.1/media/upload.json", b());
            sb2.append(strArr[i10]);
            sb2.append(": ");
            sb2.append(httpPost);
            sb2.append("\n");
            if (httpPost != null && httpPost.length() > 0) {
                arrayList2.add(new Hashon().fromJson(httpPost));
            }
        }
        sb2.setLength(0);
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            if (((HashMap) arrayList2.get(i11)).containsKey("image")) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(String.valueOf(((HashMap) arrayList2.get(i11)).get("media_id")));
            }
        }
        return d(str, sb2.toString());
    }

    public void a(final AuthorizeListener authorizeListener, boolean z10) {
        if (z10) {
            b(authorizeListener);
        } else {
            a(new SSOListener() { // from class: cn.sharesdk.twitter.c.1
                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onCancel() {
                    try {
                        authorizeListener.onCancel();
                    } catch (Exception e10) {
                        SSDKLog.b().a(e10);
                    }
                }

                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onComplete(Bundle bundle) {
                    try {
                        authorizeListener.onComplete(bundle);
                    } catch (Throwable th2) {
                        onFailed(th2);
                    }
                }

                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onFailed(Throwable th2) {
                    c.this.b(authorizeListener);
                }
            });
        }
    }

    public void a(String str) {
        this.f5511g = str;
    }

    public void a(String str, PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
        try {
            if (TextUtils.isEmpty(str) && platformActionListener != null) {
                platformActionListener.onError(getPlatform(), 9, new Throwable("share text but text is null"));
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.setPackage("com.twitter.android");
            intent.setClassName("com.twitter.android", "com.twitter.composer.ComposerActivity");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            MobSDK.getContext().startActivity(intent);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ShareParams", shareParams);
            platformActionListener.onComplete(this.f5224a, 9, hashMap);
        } catch (Throwable th2) {
            if (platformActionListener != null) {
                SSDKLog b10 = SSDKLog.b();
                b10.a("Twitter system share text catch: " + th2);
                platformActionListener.onError(getPlatform(), 9, th2);
            }
        }
    }

    public void a(String str, String str2) {
        this.f5507c.a(str, str2);
    }

    public void a(String str, String str2, String str3, PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = !TextUtils.isEmpty(str3) ? BitmapHelper.downloadBitmap(MobSDK.getContext(), str3) : null;
            }
            SSDKLog b10 = SSDKLog.b();
            b10.a("shareImage bypassApproval and resultPath is: " + str2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.setPackage("com.twitter.android");
            intent.setClassName("com.twitter.android", "com.twitter.composer.ComposerActivity");
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    File file = new File(str2);
                    Context context = MobSDK.getContext();
                    Uri a10 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
                    MobSDK.getContext().grantUriPermission("com.twitter.android", a10, 3);
                    intent.putExtra("android.intent.extra.STREAM", a10);
                } catch (Exception e10) {
                    SSDKLog b11 = SSDKLog.b();
                    b11.a("ShareSDK", "doShareToQQ() getUriForFile exception:" + e10);
                }
            }
            intent.setType("image/*");
            MobSDK.getContext().startActivity(intent);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ShareParams", shareParams);
            platformActionListener.onComplete(this.f5224a, 9, hashMap);
        } catch (Throwable th2) {
            if (platformActionListener != null) {
                SSDKLog b12 = SSDKLog.b();
                b12.a("Twitter system share image catch: " + th2);
                platformActionListener.onError(getPlatform(), 9, th2);
            }
        }
    }

    public void a(String str, String str2, String str3, boolean z10) {
        this.f5507c.a(str, str2, str3);
        a(str);
        b(str2);
        a(z10);
    }

    public void a(String str, String[] strArr, PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
        try {
            List<String> asList = Arrays.asList(strArr);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (String str2 : asList) {
                if (str2.startsWith("http") || str2.startsWith("https")) {
                    str2 = BitmapHelper.downloadBitmap(MobSDK.getContext(), str2);
                }
                File file = new File(str2);
                if (file.exists()) {
                    String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                    File file2 = new File(cachePath, System.currentTimeMillis() + file.getName());
                    String absolutePath = file2.getAbsolutePath();
                    file2.createNewFile();
                    if (ResHelper.copyFile(str2, absolutePath)) {
                        file = file2;
                    }
                    Context context = MobSDK.getContext();
                    Uri a10 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
                    MobSDK.getContext().grantUriPermission("com.twitter.android", a10, 3);
                    arrayList.add(a10);
                }
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setPackage("com.twitter.android");
            intent.setClassName("com.twitter.android", "com.twitter.composer.ComposerActivity");
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (arrayList.size() <= 0) {
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
            } else {
                String str3 = "image/*";
                if (arrayList.size() != 1 || arrayList.get(0) == null) {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                } else {
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.STREAM", arrayList.get(0));
                    String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(((Uri) arrayList.get(0)).toString());
                    if (contentTypeFor != null && contentTypeFor.length() > 0) {
                        str3 = contentTypeFor;
                    }
                }
                intent.setType(str3);
            }
            MobSDK.getContext().startActivity(intent);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ShareParams", shareParams);
            platformActionListener.onComplete(this.f5224a, 9, hashMap);
        } catch (Throwable th2) {
            if (platformActionListener != null) {
                SSDKLog b10 = SSDKLog.b();
                b10.a("Twitter system share multiple image catch: " + th2);
                platformActionListener.onError(getPlatform(), 9, th2);
            }
        }
    }

    public HashMap<String, Object> b(String str, String str2) {
        boolean z10;
        KVPair<String> kVPair;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("nextCursor", str2));
        try {
            ResHelper.parseLong(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            kVPair = new KVPair<>("user_id", str);
        } else {
            kVPair = new KVPair<>("screen_name", str);
        }
        arrayList.add(kVPair);
        String httpGet = this.f5508d.httpGet("https://api.twitter.com/1.1/friends/list.json", arrayList, this.f5507c.a(this.f5507c.b("https://api.twitter.com/1.1/friends/list.json", arrayList)), null, "/1.1/friends/list.json", b());
        if (httpGet != null && httpGet.length() > 0) {
            return android.support.v4.media.d.b(httpGet);
        }
        return null;
    }

    public void b(String str) {
        this.f5512h = str;
    }

    public String c() {
        return this.f5512h;
    }

    public String c(String str) {
        try {
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("oauth_verifier", str));
            return this.f5508d.httpPost("https://api.twitter.com/oauth/access_token", arrayList, null, this.f5507c.a(this.f5507c.a("https://api.twitter.com/oauth/access_token", arrayList)), "/oauth/access_token", b());
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    public HashMap<String, Object> c(String str, String str2) {
        boolean z10;
        KVPair<String> kVPair;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("nextCursor", str2));
        try {
            ResHelper.parseLong(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            kVPair = new KVPair<>("user_id", str);
        } else {
            kVPair = new KVPair<>("screen_name", str);
        }
        arrayList.add(kVPair);
        String httpGet = this.f5508d.httpGet("https://api.twitter.com/1.1/followers/list.json", arrayList, this.f5507c.a(this.f5507c.b("https://api.twitter.com/1.1/followers/list.json", arrayList)), null, "/1.1/followers/list.json", b());
        if (httpGet != null && httpGet.length() > 0) {
            return android.support.v4.media.d.b(httpGet);
        }
        return null;
    }

    public HashMap<String, Object> d(String str) {
        return d(str, null);
    }

    public HashMap<String, Object> d(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("status", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new KVPair<>("media_ids", str2));
        }
        String httpPost = this.f5508d.httpPost("https://api.twitter.com/1.1/statuses/update.json", arrayList, null, this.f5507c.a(this.f5507c.a("https://api.twitter.com/1.1/statuses/update.json", arrayList)), "/1.1/statuses/update.json", b());
        if (httpPost != null && httpPost.length() > 0) {
            return android.support.v4.media.d.b(httpPost);
        }
        return null;
    }

    public boolean d() {
        return this.f5513i;
    }

    public HashMap<String, Object> f(String str, String str2) {
        long fileSize = ResHelper.getFileSize(str2);
        this.f5510f = 0;
        HashMap<String, Object> a10 = a(str, str2, fileSize);
        if (a10 != null) {
            String str3 = (String) a10.get("media_id_string");
            if (TextUtils.isEmpty(str3) || b(str2, str3, fileSize) == null) {
                return null;
            }
            return a(str3, fileSize, str);
        }
        return null;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        String httpPost;
        try {
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("oauth_callback", getRedirectUri()));
            a((String) null, (String) null);
            httpPost = this.f5508d.httpPost("https://api.twitter.com/oauth/request_token", arrayList, null, this.f5507c.a(this.f5507c.a("https://api.twitter.com/oauth/request_token", arrayList)), "/oauth/request_token", b());
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
        if (httpPost == null) {
            return null;
        }
        String[] split = httpPost.split(ContainerUtils.FIELD_DELIMITER);
        HashMap hashMap = new HashMap();
        for (String str : split) {
            if (str != null) {
                String[] split2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split2.length >= 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        if (hashMap.containsKey("oauth_token")) {
            String str2 = (String) hashMap.get("oauth_token");
            a(str2, (String) hashMap.get("oauth_token_secret"));
            ShareSDK.logApiEvent("/oauth/authorize", b());
            return "https://api.twitter.com/oauth/authorize?oauth_token=" + str2;
        }
        return null;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new b(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return this.f5507c.a().f5301e;
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        d dVar = new d(sSOAuthorizeActivity);
        dVar.a(this.f5511g);
        dVar.b(this.f5512h);
        dVar.a(this.f5513i);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<String, Object> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        KVPair kVPair;
        String str3;
        ArrayList<KVPair<String>> a10;
        if (str2 == null) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                arrayList.add(new KVPair<>(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        if ("GET".equals(str2.toUpperCase())) {
            str3 = this.f5508d.httpGet(str, arrayList, this.f5507c.a(this.f5507c.b(str, arrayList)), (NetworkHelper.NetworkTimeOut) null);
        } else if ("POST".equals(str2.toUpperCase())) {
            if (hashMap2 == null || hashMap2.size() <= 0) {
                a10 = this.f5507c.a(this.f5507c.a(str, arrayList));
            } else {
                a10 = this.f5507c.a(this.f5507c.a(str, new ArrayList<>()));
                a10.remove(1);
            }
            str3 = this.f5508d.httpPost(str, arrayList, kVPair, a10, (NetworkHelper.NetworkTimeOut) null);
        } else {
            str3 = null;
        }
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(str3);
    }

    public HashMap<String, Object> e(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        ArrayList<KVPair<String>> a10 = this.f5507c.a(this.f5507c.a("https://api.twitter.com/1.1/statuses/update_with_media.json", arrayList));
        a10.remove(1);
        arrayList.add(new KVPair<>("status", str));
        String httpPost = this.f5508d.httpPost("https://api.twitter.com/1.1/statuses/update_with_media.json", arrayList, new KVPair<>("media[]", str2), a10, "/1.1/statuses/update_with_media.json", b());
        if (httpPost == null || httpPost.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpPost);
    }

    public HashMap<String, Object> a(String str, boolean z10) {
        long j10;
        SSDKNetworkHelper sSDKNetworkHelper;
        int b10;
        String str2;
        ArrayList<KVPair<String>> arrayList;
        NetworkHelper.NetworkTimeOut networkTimeOut;
        String str3;
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        try {
            j10 = ResHelper.parseLong(str);
        } catch (Throwable unused) {
            j10 = 0;
            str = null;
        }
        String userId = str == null ? this.f5224a.getDb().getUserId() : String.valueOf(j10);
        if (z10) {
            String b11 = a.b.b("https://api.twitter.com/2/users/", userId);
            arrayList2.add(new KVPair<>("user.fields", "created_at,description,pinned_tweet_id"));
            arrayList2.add(new KVPair<>("tweet.fields", "attachments,author_id,conversation_id,created_at,entities,geo,id,in_reply_to_user_id,lang,non_public_metrics,organic_metrics,possibly_sensitive,promoted_metrics,referenced_tweets,source,text,withheld"));
            arrayList2.add(new KVPair<>("expansions", "pinned_tweet_id"));
            ArrayList<KVPair<String>> arrayList3 = new ArrayList<>();
            StringBuilder a10 = android.support.v4.media.d.a("bearer ");
            a10.append(this.f5224a.getDb().getToken());
            arrayList3.add(new KVPair<>("Authorization", a10.toString()));
            sSDKNetworkHelper = this.f5508d;
            b10 = b();
            str2 = "/2/users/";
            arrayList = arrayList3;
            networkTimeOut = null;
            str3 = b11;
        } else {
            arrayList2.add(new KVPair<>("user_id", userId));
            ArrayList<KVPair<String>> a11 = this.f5507c.a(this.f5507c.b("https://api.twitter.com/1.1/users/show.json", arrayList2));
            sSDKNetworkHelper = this.f5508d;
            b10 = b();
            str2 = "/1.1/users/show.json";
            arrayList = a11;
            networkTimeOut = null;
            str3 = "https://api.twitter.com/1.1/users/show.json";
        }
        String httpGet = sSDKNetworkHelper.httpGet(str3, arrayList2, arrayList, networkTimeOut, str2, b10);
        if (httpGet == null || httpGet.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpGet);
    }

    public void a(String str, boolean z10, UpLoadViewCallBack upLoadViewCallBack, String str2, long j10) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("command", "APPEND"));
        arrayList.add(new KVPair<>("media_id", str2));
        arrayList.add(z10 ? new KVPair<>("media_data", str) : new KVPair<>("media", str));
        arrayList.add(new KVPair<>("segment_index", q.b(new StringBuilder(), this.f5510f, "")));
        this.f5510f++;
        String httpPost = this.f5508d.httpPost("https://upload.twitter.com/1.1/media/upload.json", arrayList, null, this.f5507c.a(this.f5507c.a("https://upload.twitter.com/1.1/media/upload.json", arrayList)), "/1.1/media/upload.json", b());
        if (upLoadViewCallBack != null) {
            upLoadViewCallBack.onResule(httpPost);
        }
    }
}
