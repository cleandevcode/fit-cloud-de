package com.mob.commons;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.u0;
import com.mob.MobSDK;
import com.mob.OperationCallback;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    private static volatile boolean f8490a = true;

    /* renamed from: b */
    private static volatile int f8491b = -1;

    /* renamed from: c */
    private static AtomicBoolean f8492c = new AtomicBoolean(false);

    /* renamed from: d */
    private static AtomicBoolean f8493d = new AtomicBoolean(false);

    public static void a(final boolean z10) {
        u.f8516c.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.s.1
            @Override // com.mob.tools.utils.e
            public void a() {
                String str;
                com.mob.tools.b.a.f9105b.set(Boolean.TRUE);
                if (!TextUtils.isEmpty("M-")) {
                    Thread currentThread = Thread.currentThread();
                    StringBuilder a10 = android.support.v4.media.d.a("M-");
                    a10.append(com.mob.commons.a.d.a("004(hijjijhm"));
                    currentThread.setName(a10.toString());
                }
                boolean a11 = w.a().a(w.f8539h, n.f8475e);
                int b10 = w.a().b(w.f8540i, -1);
                if (b10 != -1) {
                    int unused = s.f8491b = b10;
                }
                Boolean isGpAvailable = MobSDK.isGpAvailable();
                if ((!a11 || s.f8491b == 1) && isGpAvailable != null && isGpAvailable.booleanValue()) {
                    s.b(true, z10);
                } else {
                    s.b(false, z10);
                }
                NLog mobLog = MobLog.getInstance();
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    str = com.mob.commons.a.d.a("002.ei*j");
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append("init cfg over. py ");
                sb2.append(s.f8491b);
                mobLog.d(sb2.toString(), new Object[0]);
                com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
            }
        });
    }

    public static void a(final boolean z10, final OperationCallback<Void> operationCallback) {
        f8491b = z10 ? 1 : 0;
        NLog mobLog = MobLog.getInstance();
        mobLog.d("submit py: " + z10, new Object[0]);
        new com.mob.tools.utils.f(com.mob.commons.a.d.a("004*hijjijhl")) { // from class: com.mob.commons.s.4
            @Override // com.mob.tools.utils.f
            public void a() {
                w.a().a(w.f8540i, z10 ? 1 : 0);
                if (!z10) {
                    if (operationCallback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.s.4.4
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                operationCallback.onComplete(null);
                                return false;
                            }
                        });
                        return;
                    }
                    return;
                }
                CountDownLatch f10 = s.f();
                Boolean isGpAvailable = MobSDK.isGpAvailable();
                if (isGpAvailable == null || !isGpAvailable.booleanValue()) {
                    MobLog.getInstance().w("Service unavailable due to Google Play Services is unavailable!");
                    if (operationCallback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.s.4.1
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                operationCallback.onFailure(ForbThrowable.obtainGpThrowable());
                                return false;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (operationCallback != null) {
                    UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.s.4.2
                        @Override // android.os.Handler.Callback
                        public boolean handleMessage(Message message) {
                            operationCallback.onComplete(null);
                            return false;
                        }
                    });
                }
                MobLog.getInstance().d(DH.SyncMtd.isInMainProcess() ? "main" : "sub", new Object[0]);
                s.b(f10);
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: com.mob.commons.s.4.3
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                            s.b(z10, dHResponse.getDetailNetworkTypeForStatic());
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                            try {
                                s.b(z10, dHResponse.getDetailNetworkTypeForStatic());
                            } catch (Throwable th3) {
                                MobLog.getInstance().d(th3);
                            }
                        }
                    }
                });
            }
        }.start();
    }

    public static boolean a() {
        return f8490a;
    }

    public static void b(final CountDownLatch countDownLatch) {
        if (f8492c.compareAndSet(false, true)) {
            n.a(MobSDK.getContext());
            i();
            v.a();
            j();
            h();
            new com.mob.tools.utils.f("PY-C") { // from class: com.mob.commons.s.2
                @Override // com.mob.tools.utils.f
                public void a() {
                    com.mob.tools.b.a.f9105b.set(Boolean.TRUE);
                    NLog mobLog = MobLog.getInstance();
                    StringBuilder a10 = android.support.v4.media.d.a("g lk st: ");
                    a10.append(Process.myPid());
                    mobLog.d(a10.toString(), new Object[0]);
                    boolean a11 = l.a(l.a(l.f8439g), new k() { // from class: com.mob.commons.s.2.1
                        @Override // com.mob.commons.k
                        public boolean a(FileLocker fileLocker) {
                            NLog mobLog2 = MobLog.getInstance();
                            StringBuilder a12 = android.support.v4.media.d.a("g lk pd: ");
                            a12.append(Process.myPid());
                            a12.append(", proc st");
                            mobLog2.d(a12.toString(), new Object[0]);
                            long currentTimeMillis = System.currentTimeMillis();
                            w.f();
                            b.a(countDownLatch);
                            NLog mobLog3 = MobLog.getInstance();
                            StringBuilder a13 = android.support.v4.media.d.a("g lk pd: ");
                            a13.append(Process.myPid());
                            a13.append(", proc ed, dur: ");
                            a13.append(System.currentTimeMillis() - currentTimeMillis);
                            a13.append(", release: y");
                            mobLog3.d(a13.toString(), new Object[0]);
                            return false;
                        }
                    });
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("g lk res: " + a11 + Process.myPid(), new Object[0]);
                    com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
                }
            }.start();
        }
    }

    public static void b(boolean z10, String str) {
        HashMap<String, Object> a10 = q.a(str);
        a10.put(com.mob.commons.a.d.a("009QefghfkggeiFjjUhiNf"), String.valueOf(z10));
        String httpGet = new NetworkHelper().httpGet(c.a(c.f8283c) + com.mob.commons.a.d.a("036hfUeief4k.egehej9hfXfdfeefehej0hBeged3edCfdeiefhdegDe=effdelNhVgh4e2eg9e6edgh"), a10, NetCommunicator.getCommonDefaultHeaders());
        MobLog.getInstance().d(a.b.b("RS sp: ", httpGet), new Object[0]);
        HashMap fromJson = HashonHelper.fromJson(httpGet);
        if (fromJson != null) {
            if ("200".equals(String.valueOf(fromJson.get(com.mob.commons.a.d.a("004OehfdBij"))))) {
                return;
            }
            throw new Throwable(a.b.b("RS code is not 200: ", httpGet));
        }
        throw new Throwable(a.b.b("RS is illegal: ", httpGet));
    }

    public static void b(boolean z10, boolean z11) {
        if (z10) {
            CountDownLatch f10 = f();
            MobLog.getInstance().d(DH.SyncMtd.isInMainProcess() ? "main" : "sub", new Object[0]);
            if (z11) {
                b.f();
            } else {
                b(f10);
            }
        }
    }

    public static boolean b() {
        return !w.a().a(w.f8539h, n.f8475e) || f8491b == 1;
    }

    public static int c() {
        NLog mobLog = MobLog.getInstance();
        StringBuilder a10 = android.support.v4.media.d.a("get py grtd status: ");
        a10.append(f8491b);
        mobLog.d(a10.toString(), new Object[0]);
        return f8491b;
    }

    public static int d() {
        NLog mobLog = MobLog.getInstance();
        StringBuilder a10 = android.support.v4.media.d.a("get py grtd status mem: ");
        a10.append(f8491b);
        mobLog.d(a10.toString(), new Object[0]);
        if (f8491b != -1) {
            return f8491b;
        }
        int b10 = w.a().b(w.f8540i, -1);
        MobLog.getInstance().d(u0.a("get py grtd status cache: ", b10), new Object[0]);
        return b10;
    }

    public static String e() {
        return "jvr<1fgxsowakcet{mpzqnWPKUVCN0dy2iuhFDHQ|GTXERO:43YJ7lZ;/MI>\"@8A?9[)_]5=.(S'6~盺朼L\\-";
    }

    public static CountDownLatch f() {
        if (f8493d.getAndSet(true)) {
            return new CountDownLatch(0);
        }
        com.mob.tools.a.k.a(MobSDK.getContext()).a(com.mob.tools.a.k.a(MobSDK.getContext()).b());
        return com.mob.tools.a.c.a(MobSDK.getContext()).a(com.mob.tools.a.c.a(MobSDK.getContext()).d());
    }

    private static void h() {
        try {
            ReflectHelper.invokeStaticMethod(ReflectHelper.importClass("com.mob.mgs.impl.GuardImpl"), com.mob.commons.a.d.a("004!efelef=e"), new Object[0]);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private static void i() {
        try {
            ServerSocketChannel open = ServerSocketChannel.open();
            open.configureBlocking(false);
            open.socket().bind(new InetSocketAddress(37926));
            m.f8445a = false;
            open.close();
        } catch (Throwable unused) {
        }
    }

    private static void j() {
        i.a().a(new h() { // from class: com.mob.commons.s.3
            @Override // com.mob.commons.h
            public void a(boolean z10, boolean z11, long j10) {
                if (z10) {
                    MobLog.getInstance().d("fg.", new Object[0]);
                    boolean unused = s.f8490a = true;
                    return;
                }
                MobLog.getInstance().d("bg.", new Object[0]);
                boolean unused2 = s.f8490a = false;
            }
        });
    }
}
