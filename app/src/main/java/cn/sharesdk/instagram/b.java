package cn.sharesdk.instagram;

import android.content.Intent;
import android.support.v4.media.d;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.g;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import hj.o;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class b extends e {

    /* renamed from: b */
    private static b f5335b;

    /* renamed from: c */
    private String f5336c;

    /* renamed from: d */
    private String f5337d;

    /* renamed from: e */
    private String f5338e;

    /* renamed from: f */
    private String[] f5339f;

    /* renamed from: g */
    private String f5340g;

    private b(Platform platform) {
        super(platform);
        this.f5339f = new String[]{"user_profile", "user_media"};
    }

    public static b a(Platform platform) {
        if (f5335b == null) {
            f5335b = new b(platform);
        }
        return f5335b;
    }

    private String a(String str, ArrayList<KVPair<String>> arrayList, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        Iterator<KVPair<String>> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            strArr[i10] = String.format("%s=%s", next.name, next.value);
            i10++;
        }
        Arrays.sort(strArr);
        for (int i11 = 0; i11 < size; i11++) {
            str = android.support.v4.media.a.a(str, "|", strArr[i11]);
        }
        try {
            return a(str.getBytes("utf-8"), str2.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e10) {
            SSDKLog.b().a(e10);
            return null;
        }
    }

    private String a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return a(mac.doFinal(bArr));
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            SSDKLog.b().a(e10);
            return null;
        }
    }

    private void a(final String str, final String str2, final PlatformActionListener platformActionListener) {
        a(this.f5224a).a(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.instagram.b.2
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0081, code lost:
                if (r5.length() > 0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x0084, code lost:
                r3 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:126:0x016b A[Catch: all -> 0x01b8, TRY_LEAVE, TryCatch #3 {all -> 0x01b8, blocks: (B:79:0x0004, B:81:0x000a, B:84:0x0014, B:87:0x0029, B:90:0x0032, B:92:0x0039, B:94:0x0048, B:95:0x004f, B:98:0x0057, B:100:0x0063, B:109:0x007d, B:113:0x0085, B:120:0x0100, B:119:0x00fb, B:102:0x0069, B:104:0x0071, B:126:0x016b, B:91:0x0036, B:137:0x01a5, B:139:0x01a9, B:116:0x0097, B:122:0x0108, B:129:0x0179, B:131:0x0187), top: B:146:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0187 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #3 {all -> 0x01b8, blocks: (B:79:0x0004, B:81:0x000a, B:84:0x0014, B:87:0x0029, B:90:0x0032, B:92:0x0039, B:94:0x0048, B:95:0x004f, B:98:0x0057, B:100:0x0063, B:109:0x007d, B:113:0x0085, B:120:0x0100, B:119:0x00fb, B:102:0x0069, B:104:0x0071, B:126:0x016b, B:91:0x0036, B:137:0x01a5, B:139:0x01a9, B:116:0x0097, B:122:0x0108, B:129:0x0179, B:131:0x0187), top: B:146:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0048 A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:79:0x0004, B:81:0x000a, B:84:0x0014, B:87:0x0029, B:90:0x0032, B:92:0x0039, B:94:0x0048, B:95:0x004f, B:98:0x0057, B:100:0x0063, B:109:0x007d, B:113:0x0085, B:120:0x0100, B:119:0x00fb, B:102:0x0069, B:104:0x0071, B:126:0x016b, B:91:0x0036, B:137:0x01a5, B:139:0x01a9, B:116:0x0097, B:122:0x0108, B:129:0x0179, B:131:0x0187), top: B:146:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0057 A[Catch: all -> 0x01b8, TRY_ENTER, TryCatch #3 {all -> 0x01b8, blocks: (B:79:0x0004, B:81:0x000a, B:84:0x0014, B:87:0x0029, B:90:0x0032, B:92:0x0039, B:94:0x0048, B:95:0x004f, B:98:0x0057, B:100:0x0063, B:109:0x007d, B:113:0x0085, B:120:0x0100, B:119:0x00fb, B:102:0x0069, B:104:0x0071, B:126:0x016b, B:91:0x0036, B:137:0x01a5, B:139:0x01a9, B:116:0x0097, B:122:0x0108, B:129:0x0179, B:131:0x0187), top: B:146:0x0004 }] */
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onCallback(java.lang.Boolean r10) {
                /*
                    Method dump skipped, instructions count: 455
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.instagram.b.AnonymousClass2.onCallback(java.lang.Boolean):void");
            }
        });
    }

    public static /* synthetic */ Platform c(b bVar) {
        return bVar.f5224a;
    }

    public String a(String str) {
        ArrayList<KVPair<String>> arrayList;
        if (ShareSDK.isFBInstagram()) {
            arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("app_id", this.f5336c));
            arrayList.add(new KVPair<>("app_secret", this.f5337d));
            arrayList.add(new KVPair<>("code", str));
            arrayList.add(new KVPair<>("grant_type", "authorization_code"));
            arrayList.add(new KVPair<>("redirect_uri", this.f5338e));
        } else {
            arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("client_id", this.f5336c));
            arrayList.add(new KVPair<>("client_secret", this.f5337d));
            arrayList.add(new KVPair<>("grant_type", "authorization_code"));
            arrayList.add(new KVPair<>("redirect_uri", this.f5338e));
            arrayList.add(new KVPair<>("code", str));
        }
        return SSDKNetworkHelper.getInstance().httpPost("https://api.instagram.com/oauth/access_token", arrayList, "/oauth/authorize", b());
    }

    public String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; bArr != null && i10 < bArr.length; i10++) {
            String hexString = Integer.toHexString(bArr[i10] & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString().toLowerCase();
    }

    public void a(Platform platform, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        g gVar = new g();
        gVar.a("com.instagram.android", "com.instagram.direct.share.handler.DirectShareHandlerActivity");
        gVar.a(shareParams, platform);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", shareParams);
        platformActionListener.onComplete(platform, 9, hashMap);
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.instagram.android");
        intent.setType("image/*");
        DH.requester(MobSDK.getContext()).resolveActivity(intent, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.instagram.b.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(Boolean.valueOf(dHResponse.resolveActivity(new int[0]) != null));
                    }
                } catch (Throwable unused) {
                    ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                    if (shareSDKCallback3 != null) {
                        shareSDKCallback3.onCallback(Boolean.FALSE);
                    }
                }
            }
        });
    }

    public void a(AuthorizeListener authorizeListener) {
        b(authorizeListener);
    }

    public void a(String str, String str2, String str3) {
        this.f5336c = str;
        this.f5337d = str2;
        this.f5338e = str3;
    }

    public void a(String str, String str2, String str3, PlatformActionListener platformActionListener) {
        Platform platform;
        Throwable th2;
        if (!TextUtils.isEmpty(str)) {
            a(str3, str, platformActionListener);
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                String downloadBitmap = BitmapHelper.downloadBitmap(MobSDK.getContext(), str2);
                SSDKLog b10 = SSDKLog.b();
                b10.a("Ins download filePath is ===> " + downloadBitmap, new Object[0]);
                if (!TextUtils.isEmpty(downloadBitmap) && new File(downloadBitmap).exists()) {
                    a(str3, downloadBitmap, platformActionListener);
                } else if (platformActionListener != null) {
                    platformActionListener.onError(this.f5224a, 9, new Throwable("both imagePath and imageUrl are null"));
                }
                return;
            } catch (Throwable th3) {
                SSDKLog.b().a(th3);
                if (platformActionListener == null) {
                    return;
                }
                platform = this.f5224a;
                th2 = new Throwable("both imagePath and imageUrl are null");
            }
        } else if (platformActionListener == null) {
            return;
        } else {
            platform = this.f5224a;
            th2 = new Throwable("both imagePath and imageUrl are null");
        }
        platformActionListener.onError(platform, 9, th2);
    }

    public void a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f5339f = strArr;
    }

    public void b(String str) {
        this.f5340g = str;
    }

    public HashMap<String, Object> c(String str) {
        if (!ShareSDK.isFBInstagram()) {
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("fields", "id,username"));
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5340g));
            String httpGet = SSDKNetworkHelper.getInstance().httpGet("https://graph.instagram.com/me", arrayList, "me", b());
            if (httpGet != null && httpGet.length() > 0) {
                HashMap<String, Object> b10 = d.b(httpGet);
                if (b10 != null && b10.size() > 0) {
                    return b10;
                }
                throw new Throwable("Instagram getUser fromJson result is empty");
            }
            throw new Throwable("Instagram getUser response is empty");
        }
        String a10 = android.support.v4.media.a.a("https://api.instagram.com/v1/users/", str, "/");
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5340g));
        arrayList2.add(new KVPair<>("sig", a("/users/" + str, arrayList2, this.f5337d)));
        String httpGet2 = SSDKNetworkHelper.getInstance().httpGet(a10, arrayList2, "/v1/users", b());
        if (httpGet2 != null && httpGet2.length() > 0) {
            HashMap<String, Object> b11 = d.b(httpGet2);
            if (b11 != null && b11.size() > 0) {
                HashMap hashMap = (HashMap) b11.get("meta");
                if (hashMap != null && hashMap.size() > 0) {
                    if (200 == ((Integer) hashMap.get("code")).intValue()) {
                        HashMap hashMap2 = (HashMap) b11.get("data");
                        if (hashMap2 != null && hashMap2.size() > 0) {
                            return b11;
                        }
                        throw new Throwable(httpGet2);
                    }
                    throw new Throwable(httpGet2);
                }
                throw new Throwable(httpGet2);
            }
            throw new Throwable("response is empty");
        }
        throw new Throwable("response is empty");
    }

    public HashMap<String, Object> d(String str) {
        String a10 = android.support.v4.media.a.a("https://api.instagram.com/v1/users/", str, "/follows");
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5340g));
        arrayList.add(new KVPair<>("sig", a("/users/" + str + "/follows", arrayList, this.f5337d)));
        String httpGet = SSDKNetworkHelper.getInstance().httpGet(a10, arrayList, "/v1/users/follows", b());
        if (httpGet != null && httpGet.length() > 0) {
            HashMap<String, Object> b10 = d.b(httpGet);
            if (b10 != null && b10.size() > 0) {
                HashMap hashMap = (HashMap) b10.get("meta");
                if (hashMap != null && hashMap.size() > 0) {
                    if (200 == ((Integer) hashMap.get("code")).intValue()) {
                        return b10;
                    }
                    throw new Throwable(httpGet);
                }
                throw new Throwable(httpGet);
            }
            throw new Throwable("response is empty");
        }
        throw new Throwable("response is empty");
    }

    public HashMap<String, Object> e(String str) {
        String a10 = android.support.v4.media.a.a("https://api.instagram.com/v1/users/", str, "/followed-by");
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5340g));
        arrayList.add(new KVPair<>("sig", a("/users/" + str + "/followed-by", arrayList, this.f5337d)));
        String httpGet = SSDKNetworkHelper.getInstance().httpGet(a10, arrayList, "/v1/users/followed-by", b());
        if (httpGet != null && httpGet.length() > 0) {
            HashMap<String, Object> b10 = d.b(httpGet);
            if (b10 != null && b10.size() > 0) {
                HashMap hashMap = (HashMap) b10.get("meta");
                if (hashMap != null && hashMap.size() > 0) {
                    if (200 == ((Integer) hashMap.get("code")).intValue()) {
                        return b10;
                    }
                    throw new Throwable(httpGet);
                }
                throw new Throwable(httpGet);
            }
            throw new Throwable("response is empty");
        }
        throw new Throwable("response is empty");
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        String join;
        StringBuilder sb2 = new StringBuilder();
        if (ShareSDK.isFBInstagram()) {
            sb2.append("https://api.instagram.com/oauth/authorize?");
            sb2.append("app_id=");
            o.a(sb2, this.f5336c, "&redirect_uri=", "https://www.mob.com/", "&response_type=code");
            String[] strArr = this.f5339f;
            if (strArr != null && strArr.length > 0) {
                sb2.append("&scope=");
                join = TextUtils.join(",", this.f5339f);
                sb2.append(join);
            }
        } else {
            sb2.append("https://api.instagram.com/oauth/authorize/?");
            sb2.append("client_id=");
            sb2.append(this.f5336c);
            sb2.append("&redirect_uri=");
            sb2.append(getRedirectUri());
            sb2.append("&response_type=code");
            String[] strArr2 = this.f5339f;
            if (strArr2 != null && strArr2.length > 0) {
                sb2.append("&scope=");
                join = TextUtils.join(",", this.f5339f);
                sb2.append(join);
            }
        }
        ShareSDK.logApiEvent("/oauth/authorize", b());
        return sb2.toString();
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new a(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return this.f5338e;
    }
}
