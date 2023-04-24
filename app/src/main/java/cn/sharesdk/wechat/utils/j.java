package cn.sharesdk.wechat.utils;

import a0.q;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.i;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private String f5579a;

    private static PendingIntent a(Context context, int i10, Intent intent, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            i11 |= 67108864;
        }
        return PendingIntent.getActivity(context, i10, intent, i11);
    }

    private String a(Context context) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, new String[]{this.f5579a, "621086720"}, null);
            if (query == null || !query.moveToFirst()) {
                return null;
            }
            String string = query.getString(0);
            SSDKLog b10 = SSDKLog.b();
            b10.a("ShareSDK", "MicroMsg.SDK.WXApiImplV10(WechatCore) getTokenFromWX token is " + string);
            query.close();
            return string;
        } catch (Throwable th2) {
            SSDKLog.b().d("ShareSDK", cn.sharesdk.facebook.e.a("WechatCore catch ", th2));
            return null;
        }
    }

    private boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            SSDKLog.b().a("checkSumConsistent fail, invalid arguments, \"_mmessage_checksum\" is empty", new Object[0]);
            return false;
        } else if (bArr2 == null || bArr2.length == 0) {
            SSDKLog.b().a("checkSumConsistent fail, invalid arguments, checksum is empty", new Object[0]);
            return false;
        } else if (bArr.length != bArr2.length) {
            SSDKLog.b().a("checkSumConsistent fail, length is different", new Object[0]);
            return false;
        } else {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    SSDKLog.b().a("checkSumConsistent fail, not match", new Object[0]);
                    return false;
                }
            }
            return true;
        }
    }

    private byte[] a(String str, String str2, int i10) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i10);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i11 = 0;
            for (byte b10 : digest) {
                cArr2[i11] = cArr[(b10 >>> 4) & 15];
                int i12 = i11 + 1;
                cArr2[i12] = cArr[b10 & 15];
                i11 = i12 + 1;
            }
            str3 = new String(cArr2);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            str3 = null;
        }
        if (str3 != null) {
            return str3.getBytes();
        }
        return null;
    }

    @SuppressLint({"Range"})
    private String b(String str) {
        try {
            Cursor query = MobSDK.getContext().getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref"), new String[]{"_id", "key", "type", "value"}, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            String string = query.moveToFirst() ? query.getString(query.getColumnIndex("value")) : null;
            query.close();
            return string;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    private static void b(Context context, Intent intent) {
        try {
            SSDKLog.b().a("launchWXUsingPendingIntent", new Object[0]);
            a(context, 1, intent, 134217728).send(context, 2, null, new PendingIntent.OnFinished() { // from class: cn.sharesdk.wechat.utils.j.2
                @Override // android.app.PendingIntent.OnFinished
                public void onSendFinished(PendingIntent pendingIntent, Intent intent2, int i10, String str, Bundle bundle) {
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("launchWXUsingPendingIntent onSendFinished resultCode: " + i10 + ", resultData: " + str, new Object[0]);
                }
            }, null);
        } catch (Exception e10) {
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("launchWXUsingPendingIntent pendingIntent send failed: ");
            a10.append(e10.getMessage());
            b10.a(a10.toString(), new Object[0]);
            context.startActivity(intent);
        }
    }

    private void b(final ShareSDKCallback<Boolean> shareSDKCallback) {
        SSDKLog.b().a("checking signature of wechat client...", new Object[0]);
        DH.requester(MobSDK.getContext()).getPInfoForce(true, "com.tencent.mm", 64).request(new DH.DHResponder() { // from class: cn.sharesdk.wechat.utils.j.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    PackageInfo pInfoForce = dHResponse.getPInfoForce(new int[0]);
                    if (pInfoForce == null) {
                        ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                        if (shareSDKCallback2 != null) {
                            shareSDKCallback2.onCallback(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    int length = pInfoForce.signatures.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        String lowerCase = pInfoForce.signatures[i10].toCharsString().toLowerCase();
                        if (shareSDKCallback != null) {
                            SSDKLog b10 = SSDKLog.b();
                            b10.a("check" + "308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499".equals(lowerCase), new Object[0]);
                            shareSDKCallback.onCallback(Boolean.valueOf("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499".equals(lowerCase)));
                        }
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

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
        b(shareSDKCallback);
    }

    public void a(m mVar) {
        g gVar = (g) mVar;
        Cursor query = MobSDK.getContext().getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.f5579a, "1", String.valueOf(gVar.f5561a), gVar.f5562b, gVar.f5563c}, null);
        if (query != null) {
            query.close();
        }
        Intent intent = new Intent();
        intent.setClassName("com.tencent.mm", "com.tencent.mm.plugin.base.stub.WXEntryActivity");
        intent.addFlags(268435456);
        intent.addFlags(134217728);
        MobSDK.getContext().startActivity(intent);
    }

    public boolean a() {
        String str;
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
        for (int i10 = 0; i10 < length; i10++) {
            try {
                iArr[i10] = ResHelper.parseInt(split[i10]);
            } catch (Throwable th3) {
                SSDKLog.b().a(th3);
                iArr[i10] = 0;
            }
        }
        return length >= 4 && iArr[0] == 6 && iArr[1] == 0 && iArr[2] == 2 && iArr[3] <= 56;
    }

    public boolean a(WechatHandlerActivity wechatHandlerActivity, k kVar) {
        WechatResp cVar;
        Intent intent = wechatHandlerActivity.getIntent();
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("wx_token_key");
        if (stringExtra == null || !stringExtra.equals("com.tencent.mm.openapi.token")) {
            SSDKLog.b().a("invalid argument, \"wx_token_key\" is empty or does not equals \"com.tencent.mm.openapi.token\"", new Object[0]);
            return false;
        }
        String stringExtra2 = intent.getStringExtra("_mmessage_appPackage");
        if (TextUtils.isEmpty(stringExtra2)) {
            SSDKLog.b().a("invalid argument, \"_mmessage_appPackage\" is empty", new Object[0]);
            return false;
        }
        if (!a(intent.getByteArrayExtra("_mmessage_checksum"), a(intent.getStringExtra("_mmessage_content"), stringExtra2, intent.getIntExtra("_mmessage_sdkVersion", 0)))) {
            SSDKLog.b().a("checksum fail", new Object[0]);
            return false;
        }
        Bundle extras = intent.getExtras();
        int i10 = extras.getInt("_wxapi_command_type", 0);
        if (i10 == 1) {
            SSDKLog.b().a("Wechat Auth CallBack", new Object[0]);
            cVar = new c(extras);
        } else if (i10 != 2) {
            if (i10 == 3) {
                wechatHandlerActivity.onGetMessageFromWXReq(new d(extras).f5557a);
            } else if (i10 == 4) {
                wechatHandlerActivity.onShowMessageFromWXReq(new f(extras).f5558a);
            } else if (i10 != 19) {
                return false;
            } else {
                SSDKLog.b().a("Wechat MiniProgram CallBack", new Object[0]);
                i.b bVar = new i.b(extras);
                d dVar = new d(extras);
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                wXMediaMessage.wxminiprogram_ext_msg = bVar.f5578a;
                wXMediaMessage.openId = dVar.f5544j;
                wechatHandlerActivity.onGetMessageFromWXReq(wXMediaMessage);
            }
            return true;
        } else {
            SSDKLog.b().a("Wechat Share CallBack", new Object[0]);
            cVar = new e(extras);
        }
        kVar.a(cVar);
        return true;
    }

    public boolean b() {
        int i10;
        try {
            i10 = ResHelper.parseInt(b("_build_info_sdk_int_"));
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            i10 = -1;
        }
        return i10 >= 553779201;
    }

    public void b(m mVar) {
        Intent launchIntentForPackage = MobSDK.getContext().getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
        if (Build.VERSION.SDK_INT < 29) {
            MobSDK.getContext().startActivity(launchIntentForPackage);
        } else {
            b(MobSDK.getContext(), launchIntentForPackage);
        }
        i.a aVar = (i.a) mVar;
        Cursor query = MobSDK.getContext().getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"), null, null, new String[]{this.f5579a, aVar.f5574a, aVar.f5575b, q.b(new StringBuilder(), aVar.f5576c, ""), aVar.f5577d}, null);
        if (query != null) {
            query.close();
        }
    }

    private static void a(Context context, Intent intent) {
        try {
            SSDKLog.b().a("sendUsingPendingIntent", new Object[0]);
            a(context, 3, intent, 134217728).send(context, 4, null, new PendingIntent.OnFinished() { // from class: cn.sharesdk.wechat.utils.j.1
                @Override // android.app.PendingIntent.OnFinished
                public void onSendFinished(PendingIntent pendingIntent, Intent intent2, int i10, String str, Bundle bundle) {
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("sendUsingPendingIntent onSendFinished resultCode: " + i10 + ", resultData: " + str, new Object[0]);
                }
            }, null);
        } catch (Exception e10) {
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("sendUsingPendingIntent fail, ex = ");
            a10.append(e10.getMessage());
            b10.a(a10.toString(), new Object[0]);
            context.startActivity(intent);
        }
    }

    public void a(m mVar, boolean z10) {
        if (!mVar.b()) {
            throw new Throwable("sendReq checkArgs fail");
        }
        String packageName = MobSDK.getContext().getPackageName();
        StringBuilder a10 = android.support.v4.media.d.a("weixin://sendreq?appid=");
        a10.append(this.f5579a);
        String sb2 = a10.toString();
        Intent intent = new Intent();
        intent.setClassName("com.tencent.mm", "com.tencent.mm.plugin.base.stub.WXEntryActivity");
        Bundle bundle = new Bundle();
        mVar.b(bundle);
        intent.putExtras(bundle);
        intent.putExtra("_mmessage_sdkVersion", 638058496);
        intent.putExtra("_mmessage_appPackage", packageName);
        intent.putExtra("_mmessage_content", sb2);
        intent.putExtra("_mmessage_checksum", a(sb2, packageName, 638058496));
        if (mVar.a() == 2) {
            try {
                String a11 = a(MobSDK.getContext());
                if (!TextUtils.isEmpty(a11)) {
                    intent.putExtra("_message_token", a11);
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("ShareSDK", " _message_token " + a11);
                }
            } catch (Exception e10) {
                SSDKLog b11 = SSDKLog.b();
                b11.d("ShareSDK", " WechatCore that put token catch " + e10);
            }
        }
        intent.addFlags(268435456);
        intent.addFlags(134217728);
        if (Build.VERSION.SDK_INT < 29) {
            MobSDK.getContext().startActivity(intent);
        } else {
            Context context = MobSDK.getContext();
            if (z10) {
                b(context, intent);
            } else {
                a(context, intent);
            }
        }
        SSDKLog.b().a("starting activity, packageName=com.tencent.mm, className=com.tencent.mm.plugin.base.stub.WXEntryActivity", new Object[0]);
    }

    public boolean a(String str) {
        try {
            this.f5579a = str;
            String str2 = "weixin://registerapp?appid=" + str;
            String packageName = MobSDK.getContext().getPackageName();
            Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER");
            intent.putExtra("_mmessage_sdkVersion", 638058496);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", str2);
            intent.putExtra("_mmessage_support_content_type", 0L);
            intent.putExtra("_mmessage_checksum", a(str2, packageName, 638058496));
            MobSDK.getContext().sendBroadcast(intent, "com.tencent.mm.permission.MM_MESSAGE");
            SSDKLog.b().a("sending broadcast, intent=com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER, perm=com.tencent.mm.permission.MM_MESSAGE", new Object[0]);
            return true;
        } catch (Throwable th2) {
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("WeChat registerApp catch ");
            a10.append(th2.getMessage());
            b10.d(a10.toString(), new Object[0]);
            return false;
        }
    }
}
