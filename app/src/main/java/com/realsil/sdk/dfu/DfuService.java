package com.realsil.sdk.dfu;

import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.realsil.sdk.dfu.a;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import yb.y;
import ze.g;
import ze.l;

/* loaded from: classes.dex */
public class DfuService extends Service {

    /* renamed from: o */
    public static boolean f9456o = true;

    /* renamed from: a */
    public d f9457a;

    /* renamed from: f */
    public ve.a f9462f;

    /* renamed from: g */
    public BluetoothManager f9463g;

    /* renamed from: h */
    public vd.b f9464h;

    /* renamed from: k */
    public l f9467k;

    /* renamed from: b */
    public String f9458b = "";

    /* renamed from: c */
    public RemoteCallbackList<com.realsil.sdk.dfu.b> f9459c = new RemoteCallbackList<>();

    /* renamed from: d */
    public HashMap<String, com.realsil.sdk.dfu.b> f9460d = new HashMap<>();

    /* renamed from: e */
    public int f9461e = 0;

    /* renamed from: i */
    public boolean f9465i = false;

    /* renamed from: j */
    public int f9466j = 257;

    /* renamed from: l */
    public a f9468l = new a(Looper.getMainLooper());

    /* renamed from: m */
    public final b f9469m = new b();

    /* renamed from: n */
    public final c f9470n = new c();

    /* loaded from: classes.dex */
    public class a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper) {
            super(looper);
            DfuService.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x000c, code lost:
            if (r0 != 4) goto L9;
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto Lf
                r1 = 2
                if (r0 == r1) goto Lf
                r1 = 3
                if (r0 == r1) goto Lf
                r1 = 4
                if (r0 == r1) goto Lf
                goto L16
            Lf:
                com.realsil.sdk.dfu.DfuService r0 = com.realsil.sdk.dfu.DfuService.this
                java.lang.Object r2 = r4.obj
                com.realsil.sdk.dfu.DfuService.a(r0, r1, r2)
            L16:
                super.handleMessage(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.dfu.DfuService.a.handleMessage(android.os.Message):void");
        }
    }

    /* loaded from: classes.dex */
    public class b extends vd.a {
        public b() {
            DfuService.this = r1;
        }

        @Override // vd.a
        public final void b(int i10, BluetoothDevice bluetoothDevice) {
            ve.a aVar;
            DfuService dfuService = DfuService.this;
            if (dfuService.f9461e == 1 && i10 == 2 && (aVar = dfuService.f9462f) != null && (aVar instanceof we.b)) {
                ((we.b) aVar).E(i10, bluetoothDevice);
            }
        }

        @Override // vd.a
        public final void c(int i10, BluetoothDevice bluetoothDevice) {
            ve.a aVar;
            DfuService dfuService = DfuService.this;
            if (dfuService.f9461e == 0 && i10 == 2 && (aVar = dfuService.f9462f) != null && (aVar instanceof we.b)) {
                ((we.b) aVar).E(i10, bluetoothDevice);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends y {
        public c() {
            DfuService.this = r1;
        }

        @Override // yb.y
        public final void A(g gVar) {
            DfuService dfuService = DfuService.this;
            dfuService.f9467k = gVar.f32332q;
            a aVar = dfuService.f9468l;
            if (aVar != null) {
                aVar.sendMessage(aVar.obtainMessage(3, gVar));
            } else {
                ge.b.o("handle was not initialized", false);
            }
        }

        @Override // yb.y
        public final void B(int i10) {
            boolean z10;
            DfuService dfuService = DfuService.this;
            dfuService.f9466j = i10;
            dfuService.f9467k = null;
            if ((i10 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) == 512) {
                z10 = true;
            } else {
                z10 = false;
            }
            dfuService.f9465i = z10;
            a aVar = dfuService.f9468l;
            if (aVar != null) {
                aVar.sendMessage(aVar.obtainMessage(1, Integer.valueOf(i10)));
            } else {
                ge.b.o("handle was not initialized", false);
            }
        }

        @Override // yb.y
        public final void z(int i10) {
            DfuService dfuService = DfuService.this;
            dfuService.f9465i = false;
            a aVar = dfuService.f9468l;
            if (aVar != null) {
                aVar.sendMessage(aVar.obtainMessage(2, Integer.valueOf(i10)));
            } else {
                ge.b.o("handle was not initialized", false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends a.AbstractBinderC0116a {

        /* renamed from: b */
        public DfuService f9474b;

        public d(DfuService dfuService) {
            DfuService.this = r1;
            this.f9474b = dfuService;
        }

        /* JADX WARN: Removed duplicated region for block: B:144:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
        @Override // com.realsil.sdk.dfu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean H(java.lang.String r13, ze.e r14) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.dfu.DfuService.d.H(java.lang.String, ze.e):boolean");
        }

        @Override // com.realsil.sdk.dfu.a
        public final void P(String str, com.realsil.sdk.dfu.b bVar) {
            if (bVar != null) {
                ge.b.n("unregisterCallback: " + str);
                DfuService.this.f9459c.unregister(bVar);
                DfuService.this.f9460d.remove(str);
            }
        }

        @Override // com.realsil.sdk.dfu.a
        public final boolean a() {
            DfuService dfuService = this.f9474b;
            if (dfuService == null) {
                dfuService = null;
            }
            if (dfuService != null) {
                ve.a aVar = dfuService.f9462f;
                if (aVar != null) {
                    aVar.f();
                }
                return true;
            }
            return false;
        }

        @Override // com.realsil.sdk.dfu.a
        public final boolean c0(String str, com.realsil.sdk.dfu.b bVar) {
            if (bVar == null) {
                return false;
            }
            ge.b.n("registerCallback: " + str);
            DfuService.this.f9459c.register(bVar);
            DfuService.this.f9460d.put(str, bVar);
            if (DfuService.this.f9460d.get(str) == null) {
                return false;
            }
            return true;
        }

        @Override // android.os.Binder, android.os.IBinder
        public final void dump(FileDescriptor fileDescriptor, String[] strArr) {
        }

        @Override // android.os.Binder, android.os.IBinder
        public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        }

        @Override // android.os.Binder, android.os.IBinder
        public final String getInterfaceDescriptor() {
            return null;
        }

        @Override // android.os.Binder, android.os.IBinder
        public final boolean isBinderAlive() {
            return false;
        }

        @Override // android.os.Binder, android.os.IBinder
        public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i10) {
        }

        @Override // android.os.Binder, android.os.IBinder
        public final boolean pingBinder() {
            return false;
        }

        @Override // android.os.Binder, android.os.IBinder
        public final IInterface queryLocalInterface(String str) {
            return null;
        }

        @Override // android.os.Binder, android.os.IBinder
        public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i10) {
            return false;
        }
    }

    public static void a(DfuService dfuService, int i10, Object obj) {
        com.realsil.sdk.dfu.b bVar = dfuService.f9460d.get(dfuService.f9458b);
        if (bVar != null) {
            dfuService.f9459c.beginBroadcast();
            try {
            } catch (RemoteException e10) {
                ge.b.f(e10.toString());
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        bVar.A((g) obj);
                    }
                    dfuService.f9459c.finishBroadcast();
                }
                bVar.T(((Integer) obj).intValue());
            } else {
                bVar.a(((Integer) obj).intValue());
            }
            dfuService.f9459c.finishBroadcast();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (f9456o) {
            ge.b.n("onBind");
        }
        return this.f9457a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f9457a = new d(this);
        vd.b bVar = vd.b.f29198l;
        this.f9464h = bVar;
        if (bVar == null) {
            vd.b.g(this);
            this.f9464h = vd.b.f29198l;
        }
        vd.b bVar2 = this.f9464h;
        if (bVar2 != null) {
            bVar2.a(this.f9469m);
        } else {
            ge.b.d("BluetoothProfileManager not initialized");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (f9456o) {
            ge.b.n("onDestroy()+");
        }
        this.f9465i = false;
        this.f9466j = 257;
        vd.b bVar = this.f9464h;
        if (bVar != null) {
            b bVar2 = this.f9469m;
            CopyOnWriteArrayList copyOnWriteArrayList = bVar.f29202d;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(bVar2);
            }
        }
        if (f9456o) {
            ge.b.n("onDestroy()-");
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (f9456o) {
            ge.b.d("onUnbind");
        }
        return super.onUnbind(intent);
    }
}
