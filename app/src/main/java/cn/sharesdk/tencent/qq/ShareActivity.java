package cn.sharesdk.tencent.qq;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.LinearLayout;
import cn.sharesdk.facebook.e;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class ShareActivity extends FakeActivity {
    private static final List<String> OPEN_MINI_APP_TYPES = Arrays.asList("develop", "trial", "release");
    private static final String QQ_PACKAGE_NAME = "com.tencent.mobileqq";
    private static final int START_ACTIVITY_CODE = 256;
    private String appId;
    private PlatformActionListener listener;
    private Platform platform;
    private String uriScheme;

    public void advancedShare(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String str9, String str10, String str11, int i11) {
        String shareScheme = getShareScheme(str, str2, str3, str4, str5, str6, str7, str8, i10, str9, str10, str11, i11);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(shareScheme));
        SSDKLog.b().a("ShareSDK", a.b.b(" QQ ShareActivity advancedShare scheme: ", shareScheme));
        try {
            int[] qQClientVersion = getQQClientVersion();
            ReceiveActivity.setUriScheme(this.uriScheme);
            ReceiveActivity.setPlatformActionListener(this.listener);
            if (qQClientVersion.length <= 1 || (qQClientVersion[0] < 4 && qQClientVersion[1] < 6)) {
                intent.putExtra("key_request_code", 0);
            }
            intent.putExtra("pkg_name", this.activity.getPackageName());
            this.activity.startActivityForResult(intent, 256);
            if (Build.VERSION.SDK_INT >= 28) {
                SSDKLog.b().a("ShareSDK", " QQ ShareActivity Build.VERSION.SDK_INT >= 28 activity.finish ");
                this.activity.finish();
            }
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this.platform, 9, th2);
            }
            SSDKLog.b().a("ShareSDK", e.a(" QQ ShareActivity catch ", th2));
            this.activity.finish();
        }
    }

    public static int compareVersion(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null || str2 != null) {
            if (str != null || str2 == null) {
                String[] split = str.split("\\.");
                String[] split2 = str2.split("\\.");
                int i10 = 0;
                while (i10 < split.length && i10 < split2.length) {
                    try {
                        int parseInt = Integer.parseInt(split[i10]);
                        int parseInt2 = Integer.parseInt(split2[i10]);
                        if (parseInt < parseInt2) {
                            return -1;
                        }
                        if (parseInt > parseInt2) {
                            return 1;
                        }
                        i10++;
                    } catch (NumberFormatException unused) {
                        return str.compareTo(str2);
                    }
                }
                if (split.length > i10) {
                    return 1;
                }
                return split2.length > i10 ? -1 : 0;
            }
            return -1;
        }
        return 1;
    }

    public static String encodeToString(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes("UTF-8"), 2);
            } catch (Throwable th2) {
                SSDKLog.b().a(e.a("QQ convert2Base64String exception: ", th2), new Object[0]);
            }
        }
        return "";
    }

    public static String getPackageName(String str) {
        try {
            return MobSDK.getContext().getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private int[] getQQClientVersion() {
        String str;
        try {
            str = MobSDK.getContext().getPackageManager().getPackageInfo(QQ_PACKAGE_NAME, 0).versionName;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            str = "0";
        }
        String[] split = str.split("\\.");
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
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getShareScheme(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.tencent.qq.ShareActivity.getShareScheme(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):java.lang.String");
    }

    public void openMiniProgram(final String str, final String str2, final String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            DH.requester(MobSDK.getContext()).getAInfoForPkg(DH.SyncMtd.getPackageName(), 128).request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qq.ShareActivity.2
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    try {
                        ApplicationInfo aInfoForPkg = dHResponse.getAInfoForPkg(new int[0]);
                        if (aInfoForPkg == null) {
                            SSDKLog.b().a("ainfo null", new Object[0]);
                            return;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(String.format("mqqapi://connect_miniapp/launch?app_type=%1$s&mini_app_id=%2$s&version=1&src_type=app&app_name=%3$s&app_id=%4$s&src_id=%5$s&mini_app_path=%6$s&mini_app_type=%7$s&open_id=%8$s", "mini_program_or_game", str, ShareActivity.encodeToString(aInfoForPkg.sourceDir), ShareActivity.encodeToString(ShareActivity.this.appId), "21", ShareActivity.encodeToString(str2), ShareActivity.encodeToString(str3), ShareActivity.encodeToString(""))));
                        intent.putExtra("pkg_name", DH.SyncMtd.getPackageName());
                        ShareActivity.this.activity.startActivity(intent);
                        if (Build.VERSION.SDK_INT >= 28) {
                            SSDKLog.b().a("ShareSDK", " QQ ShareActivity Build.VERSION.SDK_INT >= 28 activity.finish ");
                            ShareActivity.this.activity.finish();
                        }
                    } catch (Throwable th2) {
                        if (ShareActivity.this.listener != null) {
                            ShareActivity.this.listener.onError(ShareActivity.this.platform, 9, th2);
                        }
                        SSDKLog.b().a("ShareSDK", e.a(" QQ openMiniProgram catch ", th2));
                        ShareActivity.this.activity.finish();
                    }
                }
            });
            return;
        }
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onError(this.platform, 9, new Throwable("miniAppId or miniPath or miniType is null"));
        }
    }

    public static int resultCompareVersion(String str) {
        return compareVersion(getPackageName(QQ_PACKAGE_NAME), str);
    }

    public void shareMiniProgram(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String str9, String str10, String str11, int i11) {
        advancedShare(str, str2, str3, str4, str5, str6, str7, str8, i10, str9, str10, str11, i11);
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 256 && i11 == 0 && Build.VERSION.SDK_INT < 28) {
            this.listener.onCancel(this.platform, 9);
        }
        this.activity.finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        SSDKLog.b().a("ShareSDK", " QQ ShareActivity onCreate");
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
        }
        Bundle extras = this.activity.getIntent().getExtras();
        final String string = extras.getString(InnerShareParams.TITLE);
        final String string2 = extras.getString(InnerShareParams.TITLE_URL);
        final String string3 = extras.getString("summary");
        final String string4 = extras.getString(InnerShareParams.IMAGE_URL);
        final String string5 = extras.getString(InnerShareParams.MUSIC_URL);
        final String string6 = extras.getString("appId");
        final int i10 = extras.getInt(InnerShareParams.HIDDEN);
        final String string7 = extras.getString(InnerShareParams.IMAGE_PATH);
        final String string8 = extras.getString(InnerShareParams.QQ_MINI_PROGRAM_APPID);
        final String string9 = extras.getString(InnerShareParams.QQ_MINI_PROGRAM_PATH);
        final String string10 = extras.getString(InnerShareParams.QQ_MINI_PROGRAM_TYPE);
        final int i11 = extras.getInt("share_type");
        DH.requester(MobSDK.getContext()).getAppName().request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qq.ShareActivity.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                int i12;
                HashMap<String, Object> hashMap;
                PlatformActionListener platformActionListener;
                Platform platform;
                try {
                    final String appName = dHResponse.getAppName();
                    int i13 = i11;
                    if (i13 != 15) {
                        i12 = 9;
                        if (i13 != 22) {
                            if (TextUtils.isEmpty(string8) && TextUtils.isEmpty(string9) && TextUtils.isEmpty(string10) && TextUtils.isEmpty(string) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string2) && ((TextUtils.isEmpty(string7) || !new File(string7).exists()) && !TextUtils.isEmpty(string4))) {
                                new Thread() { // from class: cn.sharesdk.tencent.qq.ShareActivity.1.1
                                    @Override // java.lang.Thread, java.lang.Runnable
                                    public void run() {
                                        try {
                                            String downloadBitmap = BitmapHelper.downloadBitmap(ShareActivity.this.activity, string4);
                                            SSDKLog b10 = SSDKLog.b();
                                            b10.a("ShareSDK", " QQ ShareActivity path: " + downloadBitmap);
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            ShareActivity.this.advancedShare(string, string2, string3, string4, downloadBitmap, string5, appName, string6, i10, string8, string9, string10, i11);
                                        }
                                    }
                                }.start();
                                return;
                            } else {
                                ShareActivity.this.advancedShare(string, string2, string3, string4, string7, string5, appName, string6, i10, string8, string9, string10, i11);
                                return;
                            }
                        } else if (TextUtils.isEmpty(string8)) {
                            if (ShareActivity.this.listener != null) {
                                ShareActivity.this.listener.onError(ShareActivity.this.platform, 9, new Throwable("Result is MINIAPP_ID_EMPTY : -1"));
                                return;
                            }
                            return;
                        } else if (!ShareActivity.OPEN_MINI_APP_TYPES.contains(string10)) {
                            if (ShareActivity.this.listener != null) {
                                ShareActivity.this.listener.onError(ShareActivity.this.platform, 9, new Throwable("Result is MINIAPP_VERSION_WRONG : -7"));
                                return;
                            }
                            return;
                        } else if (ShareActivity.resultCompareVersion("8.1.8") < 0) {
                            if (ShareActivity.this.listener != null) {
                                ShareActivity.this.listener.onError(ShareActivity.this.platform, 9, new Throwable("Result is MINIAPP_SHOULD_DOWNLOAD : -2"));
                                return;
                            }
                            return;
                        } else {
                            ShareActivity.this.openMiniProgram(string8, string9, string10);
                            if (ShareActivity.this.listener == null) {
                                return;
                            }
                            hashMap = new HashMap<>();
                            platformActionListener = ShareActivity.this.listener;
                            platform = ShareActivity.this.platform;
                        }
                    } else if (ShareActivity.resultCompareVersion("8.0.8") < 0) {
                        if (ShareActivity.this.listener != null) {
                            ShareActivity.this.listener.onError(ShareActivity.this.platform, 9, new Throwable("808以下不支持分享小程序"));
                            return;
                        }
                        return;
                    } else {
                        ShareActivity.this.shareMiniProgram(string, string2, string3, string4, string7, string5, appName, string6, i10, string8, string9, string10, i11);
                        if (ShareActivity.this.listener == null) {
                            return;
                        }
                        hashMap = new HashMap<>();
                        platformActionListener = ShareActivity.this.listener;
                        platform = ShareActivity.this.platform;
                        i12 = 9;
                    }
                    platformActionListener.onComplete(platform, i12, hashMap);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        });
    }

    public void setAppId(String str) {
        this.uriScheme = a.b.b("tencent", str);
        this.appId = str;
    }

    public void setPlatformActionListener(Platform platform, PlatformActionListener platformActionListener) {
        this.platform = platform;
        this.listener = platformActionListener;
    }
}
