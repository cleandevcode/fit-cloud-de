package com.realsil.sdk.bbpro.internal;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Keep;
import cn.sharesdk.framework.InnerShareParams;
import h4.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import w.o;

/* loaded from: classes.dex */
public class BaseBeeProManager {

    /* renamed from: x */
    public static boolean f9419x = true;

    /* renamed from: y */
    public static boolean f9420y = false;

    /* renamed from: z */
    public static yc.b f9421z;

    /* renamed from: d */
    public ed.c f9425d;

    /* renamed from: e */
    public volatile boolean f9426e;

    /* renamed from: h */
    public boolean f9429h;

    /* renamed from: j */
    public ThreadPoolExecutor f9431j;

    /* renamed from: k */
    public final a f9432k;

    /* renamed from: l */
    public Object f9433l;
    @Keep
    public Context mContext;

    /* renamed from: o */
    public pd.b f9436o;

    /* renamed from: q */
    public d f9438q;

    /* renamed from: r */
    public h f9439r;

    /* renamed from: s */
    public boolean f9440s;

    /* renamed from: t */
    public final Object f9441t;

    /* renamed from: u */
    public final Object f9442u;

    /* renamed from: v */
    public final Object f9443v;

    /* renamed from: w */
    public final Object f9444w;

    /* renamed from: a */
    public boolean f9422a = false;

    /* renamed from: b */
    public BluetoothDevice f9423b = null;

    /* renamed from: c */
    public BluetoothDevice f9424c = null;

    /* renamed from: f */
    public int f9427f = 0;

    /* renamed from: g */
    public int f9428g = 0;

    /* renamed from: i */
    public int f9430i = 257;

    /* renamed from: m */
    public boolean f9434m = false;

    /* renamed from: n */
    public CopyOnWriteArrayList f9435n = new CopyOnWriteArrayList();

    /* renamed from: p */
    public boolean f9437p = true;

    /* loaded from: classes.dex */
    public class a extends ed.f {

        /* renamed from: a */
        public final /* synthetic */ BaseBeeProManager f9445a;

        public a(yc.a aVar) {
            this.f9445a = aVar;
        }

        @Override // ed.f
        public final void a(ed.a aVar) {
            BaseBeeProManager baseBeeProManager = this.f9445a;
            baseBeeProManager.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = baseBeeProManager.f9435n;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                ge.b.o("no callback registered", BaseBeeProManager.f9420y);
                return;
            }
            Iterator it = baseBeeProManager.f9435n.iterator();
            while (it.hasNext()) {
                ((yc.c) it.next()).getClass();
            }
        }

        @Override // ed.f
        public final void b(BluetoothDevice bluetoothDevice, int i10) {
            BaseBeeProManager baseBeeProManager;
            UUID uuid;
            if (this.f9445a.m(bluetoothDevice)) {
                ge.b.d("device changed, just ignore here");
                return;
            }
            if (i10 == 2) {
                if (TextUtils.isEmpty(this.f9445a.k().f22236e)) {
                    this.f9445a.k().f22236e = bluetoothDevice.getName();
                }
                this.f9445a.a(i10);
                this.f9445a.f(bluetoothDevice);
                ge.b.n(this.f9445a.k().toString());
                this.f9445a.f9426e = true;
                baseBeeProManager = this.f9445a;
                baseBeeProManager.f9429h = false;
            } else if (i10 == 0) {
                BaseBeeProManager baseBeeProManager2 = this.f9445a;
                pd.b bVar = baseBeeProManager2.f9436o;
                if (bVar != null) {
                    bVar.f24013j = new nd.b();
                }
                baseBeeProManager2.a(0);
                this.f9445a.f(null);
                BaseBeeProManager baseBeeProManager3 = this.f9445a;
                ed.c cVar = baseBeeProManager3.f9425d;
                if (cVar != null) {
                    cVar.g(baseBeeProManager3.f9432k);
                    this.f9445a.f9425d.j();
                    this.f9445a.f9425d = null;
                }
                BaseBeeProManager baseBeeProManager4 = this.f9445a;
                if (baseBeeProManager4.f9429h) {
                    baseBeeProManager4.f9429h = false;
                    UUID uuid2 = yc.d.f31440f;
                    UUID uuid3 = BaseBeeProManager.j().f31438d;
                    if (uuid3 != null) {
                        uuid = uuid3;
                    } else {
                        uuid = uuid2;
                    }
                    baseBeeProManager4.p(new yc.d(bluetoothDevice, null, uuid, false, BaseBeeProManager.j().f31439e));
                    return;
                }
                baseBeeProManager4.b(baseBeeProManager4.f9427f, baseBeeProManager4.f9423b);
                if (!this.f9445a.f9426e) {
                    BaseBeeProManager.j().getClass();
                    return;
                }
                return;
            } else {
                this.f9445a.a(i10);
                baseBeeProManager = this.f9445a;
            }
            baseBeeProManager.b(baseBeeProManager.f9427f, baseBeeProManager.f9423b);
        }

        @Override // ed.f
        public final void c(ed.g gVar) {
            byte b10;
            byte b11;
            int i10;
            bd.a aVar;
            BaseBeeProManager baseBeeProManager = this.f9445a;
            baseBeeProManager.getClass();
            short s10 = gVar.f13581d;
            byte[] bArr = gVar.f13582e;
            if (s10 != 25) {
                CopyOnWriteArrayList copyOnWriteArrayList = baseBeeProManager.f9435n;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator it = baseBeeProManager.f9435n.iterator();
                    while (it.hasNext()) {
                        ((yc.c) it.next()).getClass();
                    }
                    return;
                } else if (BaseBeeProManager.f9420y) {
                    ge.b.n("no callback registered");
                    return;
                } else {
                    return;
                }
            }
            if (BaseBeeProManager.f9420y) {
                ge.b.n(">> EVENT_REPORT_STATUS");
            }
            if (bArr != null && bArr.length > 0) {
                boolean z10 = false;
                byte b12 = bArr[0];
                pd.b bVar = baseBeeProManager.f9436o;
                if (bVar != null) {
                    if (bArr.length > 2) {
                        b10 = bArr[1];
                        b11 = bArr[2];
                    } else {
                        if (bArr.length > 1) {
                            b10 = bArr[1];
                        } else {
                            b10 = 0;
                        }
                        b11 = 0;
                    }
                    if (b12 != -95) {
                        if (b12 != 20) {
                            if (b12 != 0) {
                                if (b12 != 1) {
                                    if (b12 != 2) {
                                        if (b12 != 3) {
                                            switch (b12) {
                                                case 5:
                                                    bVar.l().a().f22278a = (byte) (b10 & 15);
                                                    bVar.i(kd.c.f18446i);
                                                    i10 = 9;
                                                    break;
                                                case 6:
                                                    nd.b l10 = bVar.l();
                                                    if (b10 == 1) {
                                                        z10 = true;
                                                    }
                                                    l10.W = z10;
                                                    i10 = 32;
                                                    break;
                                                case 7:
                                                    if (bArr.length < 3) {
                                                        aVar = null;
                                                    } else {
                                                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                                                        int i11 = wrap.get(1) & 255;
                                                        int i12 = wrap.get(2) & 255;
                                                        aVar = new bd.a(i12, i12, i11, i11, i11, i11, false, false);
                                                    }
                                                    if (aVar != null) {
                                                        if (kd.c.f18444g) {
                                                            ge.b.n(aVar.toString());
                                                        }
                                                        bVar.l().V = aVar;
                                                        bVar.j(33);
                                                        return;
                                                    }
                                                    return;
                                                case 8:
                                                    bVar.l().U = b10;
                                                    i10 = 38;
                                                    break;
                                                case 9:
                                                    bVar.l().f22265v = b10;
                                                    bVar.l().f22266w = b11;
                                                    i10 = 23;
                                                    break;
                                                case 10:
                                                    bVar.l().Y = b10;
                                                    bVar.j(17);
                                                    if (b10 == 1) {
                                                        bVar.m();
                                                        return;
                                                    }
                                                    return;
                                                case 11:
                                                    bVar.l().f22239f0 = b10;
                                                    bVar.j(25);
                                                    if (b10 == 1) {
                                                        bVar.f(new hd.a((byte) 1));
                                                        return;
                                                    }
                                                    return;
                                                case 12:
                                                    bVar.l().a().f22281d = (byte) ((b10 & 240) >> 4);
                                                    bVar.l().a().f22285h = (byte) (b10 & 15);
                                                    bVar.i(kd.c.f18446i);
                                                    i10 = 7;
                                                    break;
                                                case 13:
                                                    bVar.l().a().f22279b = (byte) (b10 & 15);
                                                    bVar.i(kd.c.f18446i);
                                                    i10 = 10;
                                                    break;
                                                case 14:
                                                    nd.b l11 = bVar.l();
                                                    if (b10 == 1) {
                                                        z10 = true;
                                                    }
                                                    bd.a aVar2 = l11.V;
                                                    if (aVar2 != null) {
                                                        aVar2.f4145h = z10;
                                                    }
                                                    bVar.j(33);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        } else {
                                            bVar.l().f22237e0 = b10;
                                            bVar.i(kd.c.f18445h);
                                            bVar.j(25);
                                            return;
                                        }
                                    } else {
                                        bVar.l().a().f22283f = b10 & 255;
                                        bVar.l().a().f22286i = b11 & 255;
                                        bVar.i(kd.c.f18446i);
                                        i10 = 8;
                                    }
                                } else {
                                    bVar.l().a().f22282e = (byte) ((b10 & 240) >> 4);
                                    bVar.l().a().f22284g = (byte) (b10 & 15);
                                    i10 = 6;
                                }
                            } else {
                                nd.e eVar = bVar.l().f22258p;
                                if (eVar != null && eVar.A == 1) {
                                    z10 = true;
                                }
                                if (!z10) {
                                    bVar.l().a().f22280c = b10;
                                    bVar.i(kd.c.f18446i);
                                    i10 = 5;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            bVar.l().f22259p0 = b10;
                            i10 = 64;
                        }
                    } else {
                        bVar.l().f22267x = b10 & 255;
                        bVar.l().f22268y = b11 & 255;
                        i10 = 54;
                    }
                    bVar.j(i10);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends vd.e {

        /* renamed from: a */
        public final /* synthetic */ BaseBeeProManager f9446a;

        public b(yc.a aVar) {
            this.f9446a = aVar;
        }

        @Override // vd.e
        public final void b(int i10, BluetoothDevice bluetoothDevice) {
            BluetoothDevice bluetoothDevice2 = this.f9446a.f9423b;
            if (bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                int e10 = vd.b.f29198l.e(2, this.f9446a.f9423b);
                int bondState = bluetoothDevice.getBondState();
                ge.b.n(String.format(Locale.US, "a2dpState=0x%02X, bondState=%d", Integer.valueOf(e10), Integer.valueOf(bondState)));
                if (bondState == 12) {
                    synchronized (this.f9446a.f9441t) {
                        this.f9446a.f9441t.notifyAll();
                    }
                    if (this.f9446a.f9437p && e10 != 2) {
                        ge.b.d("auto connect a2dp when paired");
                        BaseBeeProManager baseBeeProManager = this.f9446a;
                        baseBeeProManager.d(baseBeeProManager.f9423b);
                    }
                } else if (bondState == 10) {
                    synchronized (this.f9446a.f9441t) {
                        BaseBeeProManager baseBeeProManager2 = this.f9446a;
                        if (baseBeeProManager2.f9427f == 1) {
                            baseBeeProManager2.f9441t.notifyAll();
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends vd.a {

        /* renamed from: a */
        public final /* synthetic */ BaseBeeProManager f9447a;

        public c(yc.a aVar) {
            this.f9447a = aVar;
        }

        @Override // vd.a
        public final void a(int i10, BluetoothDevice bluetoothDevice) {
            if (!this.f9447a.m(bluetoothDevice)) {
                if (i10 == 2) {
                    synchronized (this.f9447a.f9442u) {
                        this.f9447a.f9442u.notifyAll();
                    }
                } else if (i10 == 0) {
                    synchronized (this.f9447a.f9442u) {
                        this.f9447a.f9442u.notifyAll();
                    }
                }
            }
        }

        @Override // vd.a
        public final void b(int i10, BluetoothDevice bluetoothDevice) {
            boolean z10;
            boolean z11;
            UUID uuid;
            String str;
            if (this.f9447a.m(bluetoothDevice)) {
                if (BaseBeeProManager.f9420y) {
                    ge.b.n("ignore inactive device's hfp conn state update");
                }
            } else if (i10 == 2) {
                synchronized (this.f9447a.f9443v) {
                    this.f9447a.f9443v.notifyAll();
                }
                if (BaseBeeProManager.j().f31435a) {
                    if (this.f9447a.g().k() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ge.b.e("auto connect spp when hfp connected", BaseBeeProManager.f9419x);
                        if (BaseBeeProManager.f9420y) {
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[2];
                            objArr[0] = Integer.valueOf(Process.myPid());
                            Context context = this.f9447a.mContext;
                            int myPid = Process.myPid();
                            ActivityManager activityManager = (ActivityManager) context.getSystemService(InnerShareParams.ACTIVITY);
                            List<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
                            if (activityManager != null) {
                                arrayList = activityManager.getRunningAppProcesses();
                            }
                            if (arrayList != null) {
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
                                    if (runningAppProcessInfo.pid == myPid) {
                                        str = runningAppProcessInfo.processName;
                                        break;
                                    }
                                }
                            }
                            str = "";
                            objArr[1] = str;
                            ge.b.n(String.format(locale, "processInfo: %d,%s", objArr));
                        }
                        BaseBeeProManager baseBeeProManager = this.f9447a;
                        if (baseBeeProManager.g().k() == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            ge.b.d("already connected");
                            baseBeeProManager.b(2, bluetoothDevice);
                            new l(0, 1);
                            return;
                        }
                        boolean z12 = BaseBeeProManager.f9419x;
                        StringBuilder a10 = android.support.v4.media.d.a("connectionstate = ");
                        a10.append(baseBeeProManager.g().k());
                        ge.b.o(a10.toString(), z12);
                        UUID uuid2 = yc.d.f31440f;
                        UUID uuid3 = BaseBeeProManager.j().f31438d;
                        if (uuid3 != null) {
                            uuid = uuid3;
                        } else {
                            uuid = uuid2;
                        }
                        new l(baseBeeProManager.p(new yc.d(bluetoothDevice, null, uuid, false, BaseBeeProManager.j().f31439e)), 1);
                    } else if (BaseBeeProManager.f9420y) {
                        ge.b.n(String.format("ignore when spp is not in disconnected state: 0x%04X", Integer.valueOf(this.f9447a.g().k())));
                    }
                }
            } else if (i10 == 0) {
                synchronized (this.f9447a.f9443v) {
                    this.f9447a.f9443v.notifyAll();
                }
                BaseBeeProManager.j().getClass();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends pd.a {

        /* renamed from: a */
        public final /* synthetic */ BaseBeeProManager f9448a;

        public d(yc.a aVar) {
            this.f9448a = aVar;
        }

        @Override // kd.d
        public final void a(byte b10, int i10) {
            if (i10 != 23) {
                if (i10 != 34) {
                    switch (i10) {
                        case 29:
                            if (b10 == 0) {
                                return;
                            }
                            break;
                        case 30:
                            if (b10 == 0) {
                                return;
                            }
                            break;
                        case 31:
                            if (b10 == 0) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                } else if (b10 == 0) {
                    return;
                }
            } else if (b10 == 0) {
                return;
            }
            this.f9448a.h();
        }

        @Override // pd.a
        public final void b(int i10, nd.b bVar) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            if (i10 != 2 && i10 != 58) {
                switch (i10) {
                }
                BaseBeeProManager baseBeeProManager = this.f9448a;
                copyOnWriteArrayList = baseBeeProManager.f9435n;
                if (copyOnWriteArrayList == null && copyOnWriteArrayList.size() > 0) {
                    if (BaseBeeProManager.f9420y) {
                        ge.b.n(String.format(Locale.US, "indicator=%d, %s", Integer.valueOf(i10), bVar.toString()));
                    }
                    Iterator it = baseBeeProManager.f9435n.iterator();
                    while (it.hasNext()) {
                        ((yc.c) it.next()).b(i10, bVar);
                    }
                    return;
                }
                ge.b.o("no callback registered", BaseBeeProManager.f9420y);
            }
            this.f9448a.h();
            BaseBeeProManager baseBeeProManager2 = this.f9448a;
            copyOnWriteArrayList = baseBeeProManager2.f9435n;
            if (copyOnWriteArrayList == null) {
            }
            ge.b.o("no callback registered", BaseBeeProManager.f9420y);
        }
    }

    /* loaded from: classes.dex */
    public class e extends o {
        public e(yc.a aVar) {
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BluetoothDevice f9449a;

        public f(BluetoothDevice bluetoothDevice) {
            this.f9449a = bluetoothDevice;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BluetoothDevice bluetoothDevice;
            ge.b.o("connect a2dp", BaseBeeProManager.f9420y);
            vd.b bVar = vd.b.f29198l;
            String address = this.f9449a.getAddress();
            BluetoothAdapter bluetoothAdapter = bVar.f29203e;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                bluetoothDevice = bVar.f29203e.getRemoteDevice(address);
            } else {
                ge.b.p("BT not enabled");
                bluetoothDevice = null;
            }
            boolean b10 = bVar.b(bluetoothDevice);
            boolean z10 = BaseBeeProManager.f9419x;
            ge.b.e("connectA2dpSource:" + b10, z10);
        }
    }

    /* loaded from: classes.dex */
    public class g extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ BaseBeeProManager f9450a;

        public g(yc.a aVar) {
            this.f9450a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.device.action.UUID".equals(intent.getAction())) {
                if (!this.f9450a.m((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"))) {
                    ge.b.o("uuid update.", BaseBeeProManager.f9419x);
                    synchronized (this.f9450a.f9444w) {
                        this.f9450a.f9444w.notifyAll();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class h extends Thread {
        public h() {
            BaseBeeProManager.this = r1;
        }

        public final boolean a() {
            boolean z10;
            if (BaseBeeProManager.this.g().k() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            BaseBeeProManager.this.c(260, false);
            ge.b.n("sync interrupted, because of connection disconnected");
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0120 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x017c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x017d  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.bbpro.internal.BaseBeeProManager.h.run():void");
        }
    }

    public BaseBeeProManager(Context context) {
        this.f9426e = false;
        yc.a aVar = (yc.a) this;
        this.f9432k = new a(aVar);
        this.f9433l = new Object();
        b bVar = new b(aVar);
        c cVar = new c(aVar);
        this.f9438q = new d(aVar);
        this.f9440s = false;
        new e(aVar);
        this.f9441t = new Object();
        this.f9442u = new Object();
        this.f9443v = new Object();
        this.f9444w = new Object();
        ge.b.o("create BaseBeeProManager", f9419x);
        this.mContext = context;
        BluetoothAdapter.getDefaultAdapter();
        this.f9433l = new Object();
        f9419x = rd.b.f25539b;
        f9420y = rd.b.f25540c;
        if (vd.d.f29213g == null) {
            vd.d.b(context);
        }
        vd.d dVar = vd.d.f29213g;
        if (dVar != null) {
            if (!this.f9422a) {
                dVar.a(bVar);
            } else {
                ge.b.o("already been initialized", f9420y);
            }
        }
        if (vd.b.f29198l == null) {
            vd.b.g(context);
        }
        vd.b bVar2 = vd.b.f29198l;
        if (bVar2 != null) {
            if (!this.f9422a) {
                bVar2.a(cVar);
            } else {
                ge.b.o("already been initialized", f9420y);
            }
        }
        this.f9426e = false;
        if (!this.f9426e) {
            j().getClass();
        }
        this.f9431j = new ThreadPoolExecutor(10, 10, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.AbortPolicy());
    }

    public static yc.b j() {
        if (f9421z == null) {
            f9421z = new yc.b();
        }
        return f9421z;
    }

    public final void a(int i10) {
        int i11 = this.f9427f;
        if (i10 != i11) {
            ge.b.o(String.format(Locale.US, "connect state 0x%04X -> 0x%04X", Integer.valueOf(i11), Integer.valueOf(i10)), f9419x);
        }
        this.f9428g = this.f9427f;
        this.f9427f = i10;
    }

    public final void b(int i10, BluetoothDevice bluetoothDevice) {
        int i11;
        boolean z10;
        h hVar;
        if (i10 == 2) {
            if (this.f9423b != null && j().f31436b) {
                int e10 = vd.b.f29198l.e(2, this.f9423b);
                int bondState = bluetoothDevice.getBondState();
                ge.b.o(String.format(Locale.US, "a2dpState=0x%02X, bondState=%d", Integer.valueOf(e10), Integer.valueOf(bondState)), f9419x);
                if (e10 == 0) {
                    if (bondState == 12) {
                        ge.b.o("wait to connect a2dp", f9419x);
                        d(this.f9423b);
                    } else {
                        ge.b.e("wait paired and then to connect a2dp", f9419x);
                        this.f9437p = true;
                    }
                }
            }
            c(263, true);
            int i12 = this.f9427f;
            int i13 = this.f9428g;
            if (i12 != i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ge.b.n(String.format("connection state change from 0x%04X to 0x%04X", Integer.valueOf(i13), Integer.valueOf(this.f9427f)));
                if (j().f31437c) {
                    synchronized (this) {
                        if (this.f9430i != 513 && !this.f9440s) {
                            try {
                                if (this.f9439r == null) {
                                    hVar = new h();
                                    this.f9439r = hVar;
                                } else {
                                    boolean z11 = f9420y;
                                    ge.b.o("sync thread isAlive:" + this.f9439r.isAlive(), z11);
                                    if (!this.f9439r.isAlive()) {
                                        ge.b.o("restart sync thread when it's dead", f9420y);
                                        hVar = this.f9439r;
                                    } else {
                                        ge.b.o("sync thread is already started", f9419x);
                                    }
                                }
                                hVar.start();
                            } catch (Exception e11) {
                                ge.b.p(e11.toString());
                                h hVar2 = new h();
                                this.f9439r = hVar2;
                                hVar2.start();
                            }
                        } else {
                            ge.b.n("already in syncing data");
                        }
                    }
                } else {
                    if (f9420y) {
                        ge.b.n(k().toString());
                    }
                    c(264, true);
                }
            } else {
                ge.b.n("connection state no changed");
                if (f9420y) {
                    ge.b.n(k().toString());
                }
                c(264, false);
            }
        } else if (i10 == 0) {
            c(260, true);
            this.f9437p = false;
            h hVar3 = this.f9439r;
            if (hVar3 != null) {
                hVar3.interrupt();
                this.f9439r = null;
            }
            this.f9440s = false;
        } else {
            if (i10 == 3) {
                i11 = 262;
            } else {
                i11 = 261;
            }
            c(i11, true);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9435n;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator it = this.f9435n.iterator();
            while (it.hasNext()) {
                ((yc.c) it.next()).a();
            }
            return;
        }
        ge.b.o("no callback registered", f9420y);
    }

    public final void c(int i10, boolean z10) {
        int i11 = this.f9430i;
        if (i10 != i11) {
            ge.b.d(String.format("state 0x%04X > 0x%04X", Integer.valueOf(i11), Integer.valueOf(i10)));
            this.f9430i = i10;
        }
        if (z10) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9435n;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                ge.b.o("no callback registered", f9420y);
                return;
            }
            Iterator it = this.f9435n.iterator();
            while (it.hasNext()) {
                ((yc.c) it.next()).c(this.f9430i);
            }
        }
    }

    public final void d(BluetoothDevice bluetoothDevice) {
        this.f9437p = false;
        if (bluetoothDevice == null) {
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new f(bluetoothDevice), 1000L);
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
    }

    public final void e(yc.c cVar) {
        if (this.f9435n == null) {
            this.f9435n = new CopyOnWriteArrayList();
        }
        if (!this.f9435n.contains(cVar)) {
            this.f9435n.add(cVar);
        }
        boolean z10 = f9420y;
        StringBuilder a10 = android.support.v4.media.d.a("mManagerCallback.size=");
        a10.append(this.f9435n.size());
        ge.b.o(a10.toString(), z10);
    }

    public final void f(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            ge.b.o("clear device info", f9419x);
        } else {
            if (f9420y) {
                StringBuilder a10 = android.support.v4.media.d.a("update device:");
                a10.append(p.b.m(bluetoothDevice.getAddress()));
                ge.b.d(a10.toString());
            }
            BluetoothDevice bluetoothDevice2 = this.f9423b;
            if (bluetoothDevice2 == null) {
                this.f9424c = bluetoothDevice;
            } else {
                this.f9424c = bluetoothDevice2;
            }
        }
        this.f9423b = bluetoothDevice;
    }

    public final synchronized ed.c g() {
        if (this.f9425d == null) {
            ge.b.e("create SppTransportLayer", f9419x);
            ed.c l10 = ed.c.l();
            this.f9425d = l10;
            l10.b(this.f9432k);
        }
        return this.f9425d;
    }

    public final void h() {
        synchronized (this.f9433l) {
            this.f9434m = false;
            this.f9433l.notifyAll();
        }
    }

    public final void i() {
        if (this.f9427f != 0) {
            ed.c cVar = this.f9425d;
            if (cVar == null) {
                ge.b.d("SppTransportLayer has already been released");
            } else if (cVar.k() == 2 || this.f9425d.k() == 1) {
                a(3);
                this.f9425d.j();
                new l(0, 1);
            } else if (this.f9425d.k() == 3) {
                a(3);
            }
            b(0, this.f9423b);
            new l(0, 1);
        }
        ge.b.d("connection has already disconnected");
        b(this.f9427f, this.f9423b);
        new l(0, 1);
    }

    public final nd.b k() {
        pd.b bVar = this.f9436o;
        return bVar != null ? bVar.l() : new nd.b();
    }

    public final void l() {
        synchronized (this.f9433l) {
            if (this.f9434m) {
                try {
                    this.f9433l.wait(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                } catch (InterruptedException e10) {
                    ge.b.p(e10.toString());
                }
            }
        }
    }

    public final boolean m(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        BluetoothDevice bluetoothDevice2 = this.f9423b;
        if (bluetoothDevice2 == null && (bluetoothDevice2 = this.f9424c) == null) {
            return true;
        }
        return !bluetoothDevice2.equals(bluetoothDevice);
    }

    public final l n(ed.b bVar) {
        ed.c cVar = this.f9425d;
        return cVar == null ? new l(32, 1) : cVar.e(bVar) ? new l(0, 1) : new l("send Cmd failed");
    }

    public final l o(byte[] bArr) {
        return n(new ed.b(2, (short) 0, (short) 0, bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01fd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(yc.d r14) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.bbpro.internal.BaseBeeProManager.p(yc.d):int");
    }
}
