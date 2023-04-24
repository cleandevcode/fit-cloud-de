package cn.sharesdk.framework.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.a.e;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.f;
import com.mob.MobSDK;
import com.mob.commons.SHARESDK;
import com.mob.commons.authorize.DeviceAuthorizer;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.FileLocker;
import java.io.File;
import java.util.Calendar;

/* loaded from: classes.dex */
public class d extends f {

    /* renamed from: b */
    private static d f5171b;

    /* renamed from: d */
    private Handler f5173d;

    /* renamed from: e */
    private boolean f5174e;

    /* renamed from: f */
    private long f5175f;

    /* renamed from: g */
    private File f5176g;

    /* renamed from: c */
    private a f5172c = a.a();

    /* renamed from: h */
    private FileLocker f5177h = new FileLocker();

    private d() {
        File file = new File(MobSDK.getContext().getFilesDir(), ".statistics");
        this.f5176g = file;
        if (file.exists()) {
            return;
        }
        try {
            this.f5176g.createNewFile();
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f5171b == null) {
                f5171b = new d();
            }
            dVar = f5171b;
        }
        return dVar;
    }

    private void a(final cn.sharesdk.framework.a.b.c cVar, final ShareSDKCallback<cn.sharesdk.framework.a.b.c> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getDeviceData().getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.d.5
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    cVar.f5126f = DeviceAuthorizer.authorize(new SHARESDK());
                    cVar.f5127g = DH.SyncMtd.getPackageName();
                    cVar.f5128h = DH.SyncMtd.getAppVersion();
                    cVar.f5129i = String.valueOf(ShareSDK.SDK_VERSION_CODE);
                    cVar.f5130j = DH.SyncMtd.getPlatformCode();
                    cVar.f5131k = dHResponse.getDetailNetworkTypeForStatic();
                    if (TextUtils.isEmpty(MobSDK.getAppkey())) {
                        SSDKLog.b().b("ShareSDKCore", "Your appKey of ShareSDK is null , this will cause its data won't be count!");
                    } else if (!"cn.sharesdk.demo".equals(cVar.f5127g) && ("api20".equals(MobSDK.getAppkey()) || "androidv1101".equals(MobSDK.getAppkey()))) {
                        SSDKLog.b().b("ShareSDKCore", "Your app is using the appkey of ShareSDK Demo, this will cause its data won't be count!");
                    }
                    cVar.f5132l = dHResponse.getDeviceData();
                    shareSDKCallback.onCallback(cVar);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        });
    }

    private void c(cn.sharesdk.framework.a.b.c cVar) {
        try {
            this.f5172c.a(cVar);
            cVar.h();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            SSDKLog.b().a(cVar.toString(), new Object[0]);
        }
    }

    public void a(Handler handler) {
        this.f5173d = handler;
    }

    @Override // cn.sharesdk.framework.utils.f
    public void a(Message message) {
        if (this.f5174e) {
            return;
        }
        this.f5174e = true;
        try {
            this.f5177h.setLockFile(this.f5176g.getAbsolutePath());
            if (this.f5177h.lock(false)) {
                new Thread(new Runnable() { // from class: cn.sharesdk.framework.a.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            d.this.f5172c.a(DeviceAuthorizer.authorize(new SHARESDK()));
                        } catch (Exception e10) {
                            SSDKLog.b().a(e10);
                        }
                    }
                }).start();
                this.f5172c.a(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.a.d.2
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(Boolean bool) {
                        if (bool == null || !bool.booleanValue()) {
                            return;
                        }
                        d.this.f5172c.a(d.this.f5306a);
                    }
                });
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public void a(final cn.sharesdk.framework.a.b.c cVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread() { // from class: cn.sharesdk.framework.a.d.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    d.this.b(cVar);
                }
            }.start();
        } else {
            b(cVar);
        }
    }

    @Override // cn.sharesdk.framework.utils.f
    public void b(Message message) {
        int i10 = message.what;
        if (i10 == 2) {
            try {
                DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.d.6
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        String networkType = dHResponse.getNetworkType();
                        if ("none".equals(networkType) || TextUtils.isEmpty(networkType)) {
                            return;
                        }
                        d.this.f5172c.b();
                    }
                });
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
        } else if (i10 == 3) {
            Object obj = message.obj;
            if (obj != null) {
                c((cn.sharesdk.framework.a.b.c) obj);
                this.f5306a.removeMessages(2);
                this.f5306a.sendEmptyMessageDelayed(2, 2000L);
            }
        } else if (i10 != 4) {
        } else {
            long longValue = e.a().h().longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(longValue);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            int i13 = calendar.get(5);
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i14 = calendar.get(1);
            int i15 = calendar.get(2);
            int i16 = calendar.get(5);
            if (i11 == i14 && i12 == i15 && i13 == i16) {
                return;
            }
            this.f5172c.a(this.f5306a);
        }
    }

    public void b(cn.sharesdk.framework.a.b.c cVar) {
        try {
            if (MobSDK.isMob() && this.f5174e) {
                a(cVar, new ShareSDKCallback<cn.sharesdk.framework.a.b.c>() { // from class: cn.sharesdk.framework.a.d.4
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(cn.sharesdk.framework.a.b.c cVar2) {
                        if (cVar2.g()) {
                            Message message = new Message();
                            message.what = 3;
                            message.obj = cVar2;
                            try {
                                d.this.f5306a.sendMessage(message);
                                return;
                            } catch (Throwable th2) {
                                SSDKLog.b().a(th2);
                                return;
                            }
                        }
                        SSDKLog b10 = SSDKLog.b();
                        StringBuilder a10 = android.support.v4.media.d.a("Drop event: ");
                        a10.append(cVar2.toString());
                        b10.a(a10.toString(), new Object[0]);
                    }
                });
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("logStart ", th2), new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.utils.f
    public void c(Message message) {
        if (this.f5174e) {
            cn.sharesdk.framework.a.b.e eVar = new cn.sharesdk.framework.a.b.e();
            eVar.f5140a = System.currentTimeMillis() - this.f5175f;
            a(eVar);
            this.f5174e = false;
            try {
                this.f5173d.sendEmptyMessage(1);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
            f5171b = null;
            this.f5306a.getLooper().quit();
        }
    }
}
