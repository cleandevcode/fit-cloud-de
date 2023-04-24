package cn.sharesdk.framework;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import cn.sharesdk.framework.AgreementDialog;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ProvicyCanContinue;
import cn.sharesdk.framework.loopshare.MoblinkActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.tencent.qq.QQ;
import com.mob.MobSDK;
import com.mob.commons.ForbThrowable;
import com.mob.commons.dialog.PolicyThrowable;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private Platform f5227a;

    /* renamed from: b */
    private PlatformDb f5228b;

    /* renamed from: c */
    private d f5229c;

    /* renamed from: d */
    private int f5230d;

    /* renamed from: e */
    private int f5231e;

    /* renamed from: f */
    private boolean f5232f;

    /* renamed from: g */
    private boolean f5233g = true;

    /* renamed from: h */
    private boolean f5234h;

    public f(Platform platform) {
        this.f5227a = platform;
        String name = platform.getName();
        this.f5228b = new PlatformDb(name, platform.getVersion());
        a(name);
        this.f5229c = new d();
        c.a();
    }

    private String a(int i10) {
        StringBuilder a10 = android.support.v4.media.d.a("ShareSDK_");
        a10.append(this.f5227a.getName());
        a10.append("_");
        a10.append(b(i10));
        return a10.toString();
    }

    public void a(d dVar, int i10) {
        if (dVar != null) {
            dVar.onError(this.f5227a, i10, new ForbThrowable());
        }
    }

    private String b(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 5:
                        return "ACTION_SENDING_DIRECT_MESSAGE";
                    case 6:
                        return "ACTION_FOLLOWING_USER";
                    case 7:
                        return "ACTION_TIMELINE";
                    case 8:
                        return "ACTION_USER_INFOR";
                    case 9:
                        return "ACTION_SHARE";
                    case 10:
                        return "ACTION_GETTING_BILATERAL_LIST";
                    case 11:
                        return "ACTION_GETTING_FOLLOWER_LIST";
                    default:
                        return "ACTION_CUSTOMER";
                }
            }
            return "ACTION_GETTING_FRIEND_LIST";
        }
        return "ACTION_AUTHORIZING";
    }

    public void b(d dVar, int i10) {
        if (dVar != null) {
            dVar.onError(this.f5227a, i10, new Throwable("'appkey' is illegal"));
        }
    }

    public void b(final String[] strArr) {
        new Thread(a(1)) { // from class: cn.sharesdk.framework.f.7
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (!MobSDK.isForb() && a.a()) {
                        int isAuth = MobSDK.isAuth();
                        if (isAuth == 1 || isAuth == 2) {
                            f.this.j();
                            SSDKLog.b().a("The user is using the privacy version without a popup authorize 001");
                        }
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("authorize(final String[] permissions) ", th2), new Object[0]);
                }
            }
        }.start();
        new Thread() { // from class: cn.sharesdk.framework.f.8
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb()) {
                        f fVar = f.this;
                        fVar.a(fVar.f5229c, 1);
                    } else {
                        try {
                            int isAuth = MobSDK.isAuth();
                            if (isAuth != 1 && isAuth != 2) {
                                if (f.this.f5229c != null) {
                                    f.this.f5229c.onError(f.this.f5227a, 1, new PolicyThrowable());
                                }
                            } else if (!a.a()) {
                                f fVar2 = f.this;
                                fVar2.b(fVar2.f5229c, 1);
                            } else {
                                f.this.f5227a.doAuthorize(strArr);
                            }
                        } catch (Throwable unused) {
                            ProvicyCanContinue.a().a(new ProvicyCanContinue.OnBusinessListener() { // from class: cn.sharesdk.framework.f.8.1
                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onContinue() {
                                    if (a.a()) {
                                        f.this.f5227a.doAuthorize(strArr);
                                    } else {
                                        f fVar3 = f.this;
                                        fVar3.b(fVar3.f5229c, 1);
                                    }
                                    SSDKLog.b().a("The user is using the privacy version with a pop-up box authorize 002");
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onError(Throwable th2) {
                                    if (f.this.f5229c != null) {
                                        f.this.f5229c.onError(f.this.f5227a, 1, new PolicyThrowable());
                                    }
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onStop() {
                                    if (f.this.f5229c != null) {
                                        f.this.f5229c.onError(f.this.f5227a, 1, new PolicyThrowable());
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("new Thread Platform.ACTION_AUTHORIZING ", th2), new Object[0]);
                }
            }
        }.start();
    }

    public void c(Platform.ShareParams shareParams) {
        try {
            if (shareParams != null) {
                try {
                    if (!shareParams.getOpenCustomEven()) {
                        ShareSDK.logDemoEvent(3, this.f5227a);
                    }
                } catch (Throwable unused) {
                }
                c(9, shareParams);
                return;
            }
            d dVar = this.f5229c;
            if (dVar != null) {
                dVar.onError(this.f5227a, 9, new NullPointerException());
            }
        } catch (Throwable th2) {
            SSDKLog.b().d(th2);
        }
    }

    public boolean j() {
        if (ShareSDK.a()) {
            this.f5233g = !"false".equals(a(this.f5227a.getPlatformId(), "covert_url", (String) null));
            this.f5227a.setNetworkDevinfo();
            return true;
        }
        try {
            if (ShareSDK.b()) {
                this.f5233g = !"false".equals(a(this.f5227a.getPlatformId(), "covert_url", (String) null));
                this.f5227a.setNetworkDevinfo();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
            return false;
        }
    }

    private String k() {
        String urlEncode;
        StringBuilder sb2 = new StringBuilder();
        try {
            if ("TencentWeibo".equals(this.f5227a.getName())) {
                SSDKLog.b().c("user id %s ==>>", g().getUserName());
                urlEncode = Data.urlEncode(g().getUserName(), "utf-8");
            } else {
                urlEncode = Data.urlEncode(g().getUserId(), "utf-8");
            }
            sb2.append(urlEncode);
            sb2.append("|");
            sb2.append(Data.urlEncode(g().get("secretType"), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(g().get("gender"), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(g().get("birthday"), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(g().get("educationJSONArrayStr"), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(g().get("workJSONArrayStr"), "utf-8"));
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
        }
        return sb2.toString();
    }

    public int a() {
        return this.f5230d;
    }

    public String a(int i10, String str, String str2) {
        String a10 = ShareSDK.a(i10, str);
        if (TextUtils.isEmpty(a10) || "null".equals(a10)) {
            Platform platform = this.f5227a;
            return platform.getDevinfo(platform.getName(), str2);
        }
        return a10;
    }

    public String a(Bitmap bitmap) {
        return ShareSDK.a(bitmap);
    }

    public String a(String str, boolean z10, HashMap<String, String> hashMap) {
        SSDKLog b10;
        StringBuilder sb2;
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f5233g) {
            b10 = SSDKLog.b();
            sb2 = new StringBuilder();
        } else if (TextUtils.isEmpty(str)) {
            b10 = SSDKLog.b();
            sb2 = new StringBuilder();
        } else {
            str = cn.sharesdk.framework.a.a.a().a(str, this.f5227a.getPlatformId(), z10, k(), hashMap);
            b10 = SSDKLog.b();
            sb2 = new StringBuilder();
        }
        sb2.append("getShortLintk use time: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        b10.b(sb2.toString());
        return str;
    }

    public void a(int i10, int i11, String str) {
        c(2, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), str});
    }

    public void a(int i10, Object obj) {
        this.f5229c.a(this.f5227a, i10, obj);
    }

    public void a(final Platform.ShareParams shareParams) {
        if (shareParams != null) {
            new Thread(a(1)) { // from class: cn.sharesdk.framework.f.5
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        f.this.f5227a.subscribeAuth(shareParams);
                        SSDKLog.b().a("ShareSDK", "subscribeAuth start on PlatformImpl");
                    } catch (Throwable th2) {
                        SSDKLog.b().a("ShareSDK", cn.sharesdk.facebook.e.a(" subscribeAuth catch ", th2));
                    }
                }
            }.start();
            return;
        }
        d dVar = this.f5229c;
        if (dVar != null) {
            dVar.onError(this.f5227a, 9, new NullPointerException());
        }
    }

    public void a(PlatformActionListener platformActionListener) {
        this.f5229c.a(platformActionListener);
    }

    public void a(String str) {
        try {
            this.f5230d = ResHelper.parseInt(String.valueOf(ShareSDK.getDevinfo(str, "Id")).trim());
        } catch (Throwable unused) {
            if (!(this.f5227a instanceof CustomPlatform)) {
                SSDKLog b10 = SSDKLog.b();
                b10.a(this.f5227a.getName() + " failed to parse Id, this will cause method getId() always returens 0", new Object[0]);
            }
        }
        try {
            this.f5231e = ResHelper.parseInt(String.valueOf(ShareSDK.getDevinfo(str, "SortId")).trim());
        } catch (Throwable unused2) {
            if (!(this.f5227a instanceof CustomPlatform)) {
                SSDKLog b11 = SSDKLog.b();
                b11.a(this.f5227a.getName() + " failed to parse SortId, this won't cause any problem, don't worry", new Object[0]);
            }
        }
        String devinfo = ShareSDK.getDevinfo(str, "Enable");
        if (devinfo == null) {
            this.f5234h = true;
            if (!(this.f5227a instanceof CustomPlatform)) {
                SSDKLog b12 = SSDKLog.b();
                b12.a(this.f5227a.getName() + " failed to parse Enable, this will cause platform always be enable", new Object[0]);
            }
        } else {
            this.f5234h = "true".equals(devinfo.trim());
        }
        this.f5227a.initDevInfo(str);
    }

    public void a(String str, int i10, int i11) {
        c(7, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), str});
    }

    public void a(String str, String str2, short s10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        c(s10 | Platform.ACTION_CUSTOMER, new Object[]{str, str2, hashMap, hashMap2});
    }

    public void a(boolean z10) {
        this.f5232f = z10;
    }

    public void a(final String[] strArr) {
        try {
            if (!MobSDK.isGppVer() || cn.sharesdk.framework.a.a.e.a().h("no_use_gpp") || cn.sharesdk.framework.a.a.e.a().h("gpp_ver_sent")) {
                b(strArr);
            } else {
                AgreementDialog agreementDialog = new AgreementDialog();
                agreementDialog.setShareParam(new AgreementDialog.OnDialogDismiss() { // from class: cn.sharesdk.framework.f.6
                    @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                    public void consent() {
                        cn.sharesdk.framework.a.a.e.a().a(true);
                        f.this.b(strArr);
                    }

                    @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                    public void refuse() {
                        if (f.this.f5229c != null) {
                            f.this.f5229c.onError(f.this.f5227a, 21, null);
                        }
                    }
                });
                agreementDialog.show(MobSDK.getContext(), null);
            }
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
            b(strArr);
        }
    }

    public int b() {
        return this.f5231e;
    }

    public void b(int i10, Object obj) {
        Field[] fields;
        Throwable th2;
        d dVar;
        HashMap<String, Object> loopshareCustomParams;
        MoblinkActionListener moblinkActionListener;
        Object obj2;
        String str = null;
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 6:
                        this.f5227a.follow((String) obj);
                        return;
                    case 7:
                        Object[] objArr = (Object[]) obj;
                        this.f5227a.timeline(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (String) objArr[2]);
                        return;
                    case 8:
                        Platform platform = this.f5227a;
                        if (obj != null) {
                            str = (String) obj;
                        }
                        platform.userInfor(str);
                        return;
                    case 9:
                        final Platform.ShareParams shareParams = (Platform.ShareParams) obj;
                        HashMap<String, Object> map = shareParams.toMap();
                        for (Field field : shareParams.getClass().getFields()) {
                            if (map.get(field.getName()) == null) {
                                field.setAccessible(true);
                                try {
                                    obj2 = field.get(shareParams);
                                } catch (Throwable th3) {
                                    SSDKLog.b().b(th3);
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    map.put(field.getName(), obj2);
                                }
                            }
                        }
                        d dVar2 = this.f5229c;
                        if (dVar2 instanceof d) {
                            dVar2.a(this.f5227a, shareParams);
                        }
                        try {
                            if (shareParams.getLoopshareCustomParams().size() > 0 && shareParams.getLoopshareCustomParams() != null) {
                                if (this.f5227a.getName().equals(QQ.NAME)) {
                                    if (!TextUtils.isEmpty(shareParams.getTitleUrl())) {
                                        loopshareCustomParams = shareParams.getLoopshareCustomParams();
                                        moblinkActionListener = new MoblinkActionListener() { // from class: cn.sharesdk.framework.f.1
                                            @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                            public void onError(Throwable th4) {
                                                if (f.this.f5229c != null) {
                                                    f.this.f5229c.onError(f.this.f5227a, 9, th4);
                                                }
                                            }

                                            @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                            public void onResult(Object obj3) {
                                                Platform.ShareParams shareParams2;
                                                StringBuilder sb2;
                                                String str2;
                                                if (TextUtils.isEmpty(Uri.parse(shareParams.getTitleUrl()).getEncodedQuery())) {
                                                    shareParams2 = shareParams;
                                                    sb2 = new StringBuilder();
                                                    sb2.append(shareParams.getTitleUrl());
                                                    str2 = "?mobid=";
                                                } else {
                                                    shareParams2 = shareParams;
                                                    sb2 = new StringBuilder();
                                                    sb2.append(shareParams.getTitleUrl());
                                                    str2 = "&mobid=";
                                                }
                                                sb2.append(str2);
                                                sb2.append(obj3);
                                                shareParams2.setTitleUrl(sb2.toString());
                                                new Thread() { // from class: cn.sharesdk.framework.f.1.1
                                                    @Override // java.lang.Thread, java.lang.Runnable
                                                    public void run() {
                                                        super.run();
                                                        f.this.f5227a.doShare(shareParams);
                                                    }
                                                }.start();
                                            }
                                        };
                                        ShareSDK.mobLinkGetMobID(loopshareCustomParams, moblinkActionListener);
                                        return;
                                    } else if (this.f5229c != null) {
                                        th2 = new Throwable("TitleUrl cannot be empty if setLoopshareCustomParams is used in QQ");
                                        dVar = this.f5229c;
                                        dVar.onError(this.f5227a, 9, th2);
                                        return;
                                    } else {
                                        return;
                                    }
                                } else if (!TextUtils.isEmpty(shareParams.getUrl())) {
                                    if (this.f5229c != null) {
                                        loopshareCustomParams = shareParams.getLoopshareCustomParams();
                                        moblinkActionListener = new MoblinkActionListener() { // from class: cn.sharesdk.framework.f.2
                                            @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                            public void onError(Throwable th4) {
                                                if (f.this.f5229c != null) {
                                                    f.this.f5229c.onError(f.this.f5227a, 9, th4);
                                                }
                                            }

                                            @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                            public void onResult(Object obj3) {
                                                Platform.ShareParams shareParams2;
                                                StringBuilder sb2;
                                                String str2;
                                                if (TextUtils.isEmpty(Uri.parse(shareParams.getUrl()).getEncodedQuery())) {
                                                    shareParams2 = shareParams;
                                                    sb2 = new StringBuilder();
                                                    sb2.append(shareParams.getUrl());
                                                    str2 = "?mobid=";
                                                } else {
                                                    shareParams2 = shareParams;
                                                    sb2 = new StringBuilder();
                                                    sb2.append(shareParams.getUrl());
                                                    str2 = "&mobid=";
                                                }
                                                sb2.append(str2);
                                                sb2.append(obj3);
                                                shareParams2.setUrl(sb2.toString());
                                                new Thread() { // from class: cn.sharesdk.framework.f.2.1
                                                    @Override // java.lang.Thread, java.lang.Runnable
                                                    public void run() {
                                                        super.run();
                                                        f.this.f5227a.doShare(shareParams);
                                                    }
                                                }.start();
                                            }
                                        };
                                        ShareSDK.mobLinkGetMobID(loopshareCustomParams, moblinkActionListener);
                                        return;
                                    }
                                    return;
                                } else if (this.f5229c != null) {
                                    th2 = new Throwable("SetUrl cannot be empty if setLoopshareCustomParams is used");
                                    dVar = this.f5229c;
                                    dVar.onError(this.f5227a, 9, th2);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            this.f5227a.doShare(shareParams);
                            return;
                        } catch (Throwable th4) {
                            SSDKLog.b().a(cn.sharesdk.facebook.e.a("PlatformImpl platform.doshare() ", th4), new Object[0]);
                            return;
                        }
                    default:
                        Object[] objArr2 = (Object[]) obj;
                        this.f5227a.doCustomerProtocol(String.valueOf(objArr2[0]), String.valueOf(objArr2[1]), i10, (HashMap) objArr2[2], (HashMap) objArr2[3]);
                        return;
                }
            }
            Object[] objArr3 = (Object[]) obj;
            this.f5227a.getFriendList(((Integer) objArr3[0]).intValue(), ((Integer) objArr3[1]).intValue(), (String) objArr3[2]);
            return;
        }
        d dVar3 = this.f5229c;
        if (dVar3 != null) {
            dVar3.onComplete(this.f5227a, 1, null);
        }
    }

    public void b(final Platform.ShareParams shareParams) {
        try {
            if (!MobSDK.isGppVer() || cn.sharesdk.framework.a.a.e.a().h("no_use_gpp") || cn.sharesdk.framework.a.a.e.a().h("gpp_ver_sent")) {
                c(shareParams);
                return;
            }
            AgreementDialog agreementDialog = new AgreementDialog();
            agreementDialog.setShareParam(new AgreementDialog.OnDialogDismiss() { // from class: cn.sharesdk.framework.f.9
                @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                public void consent() {
                    cn.sharesdk.framework.a.a.e.a().a(true);
                    f.this.c(shareParams);
                }

                @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                public void refuse() {
                    if (f.this.f5229c != null) {
                        f.this.f5229c.onError(f.this.f5227a, 21, new Throwable("The user rejected the request to read the applist"));
                    }
                }
            });
            agreementDialog.show(MobSDK.getContext(), null);
        } catch (Throwable unused) {
            c(shareParams);
        }
    }

    public void b(String str) {
        c(6, str);
    }

    public PlatformActionListener c() {
        return this.f5229c.a();
    }

    public void c(final int i10, final Object obj) {
        new Thread(a(i10)) { // from class: cn.sharesdk.framework.f.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb() || !a.a()) {
                        return;
                    }
                    int isAuth = MobSDK.isAuth();
                    if (isAuth == 1 || isAuth == 2) {
                        f.this.j();
                        SSDKLog.b().a("The user is using the privacy version without a popup newThreadJob 001");
                    }
                } catch (Throwable th2) {
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("newThreadJob  " + th2);
                }
            }
        }.start();
        new Thread() { // from class: cn.sharesdk.framework.f.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb()) {
                        f fVar = f.this;
                        fVar.a(fVar.f5229c, i10);
                    } else {
                        try {
                            int isAuth = MobSDK.isAuth();
                            if (isAuth != 1 && isAuth != 2) {
                                if (f.this.f5229c != null) {
                                    f.this.f5229c.onError(f.this.f5227a, i10, new PolicyThrowable());
                                }
                            } else if (!a.a()) {
                                f fVar2 = f.this;
                                fVar2.b(fVar2.f5229c, i10);
                            } else if (f.this.f5227a.checkAuthorize(i10, obj)) {
                                f.this.b(i10, obj);
                                SSDKLog.b().a("The user is using the privacy version without a popup newThreadJob 002");
                            }
                        } catch (Throwable unused) {
                            ProvicyCanContinue.a().a(new ProvicyCanContinue.OnBusinessListener() { // from class: cn.sharesdk.framework.f.4.1
                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onContinue() {
                                    if (a.a()) {
                                        Platform platform = f.this.f5227a;
                                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                        if (platform.checkAuthorize(i10, obj)) {
                                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                            f.this.b(i10, obj);
                                        }
                                    } else {
                                        f fVar3 = f.this;
                                        fVar3.b(fVar3.f5229c, i10);
                                    }
                                    SSDKLog.b().a("The user is using the framed privacy version newThreadJob 002");
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onError(Throwable th2) {
                                    if (f.this.f5229c != null) {
                                        f.this.f5229c.onError(f.this.f5227a, i10, th2);
                                    }
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onStop() {
                                    if (f.this.f5229c != null) {
                                        f.this.f5229c.onError(f.this.f5227a, i10, new PolicyThrowable());
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("new Thread(getThreadName(action)) ", th2), new Object[0]);
                }
            }
        }.start();
    }

    public void c(String str) {
        c(8, str);
    }

    public String d(String str) {
        return ShareSDK.a(str);
    }

    public boolean d() {
        return this.f5228b.isValid();
    }

    public boolean e() {
        return this.f5232f;
    }

    public boolean f() {
        return this.f5234h;
    }

    public PlatformDb g() {
        return this.f5228b;
    }

    public void h() {
        this.f5228b.removeAccount();
    }

    public PlatformActionListener i() {
        return this.f5229c;
    }

    public void a(String str, boolean z10, ShareSDKCallback<String> shareSDKCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f5233g) {
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("getShortLintk use time: ");
            a10.append(System.currentTimeMillis() - currentTimeMillis);
            b10.b(a10.toString());
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(str);
            }
        }
        if (TextUtils.isEmpty(str)) {
            SSDKLog b11 = SSDKLog.b();
            StringBuilder a11 = android.support.v4.media.d.a("getShortLintk use time: ");
            a11.append(System.currentTimeMillis() - currentTimeMillis);
            b11.b(a11.toString());
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(str);
            }
        }
        ShareSDK.a(str, z10, this.f5227a.getPlatformId(), k(), shareSDKCallback);
        SSDKLog b12 = SSDKLog.b();
        StringBuilder a12 = android.support.v4.media.d.a("getShortLintk use time: ");
        a12.append(System.currentTimeMillis() - currentTimeMillis);
        b12.b(a12.toString());
    }
}
