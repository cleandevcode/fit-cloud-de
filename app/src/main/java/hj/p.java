package hj;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.os.Build;
import android.os.Environment;
import android.service.notification.NotificationListenerService;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import bi.m0;
import java.io.File;
import jj.d0;
import jj.k1;
import jj.o0;
import jj.q0;
import jj.t0;
import kc.w0;
import p000do.a;
import wi.a;
import wj.w;

/* loaded from: classes2.dex */
public final class p implements hj.a {

    /* renamed from: a */
    public final xi.a f16137a;

    /* renamed from: b */
    public final wi.k f16138b;

    /* renamed from: c */
    public final jj.l f16139c;

    /* renamed from: d */
    public final k1 f16140d;

    /* renamed from: e */
    public final tl.d f16141e;

    /* renamed from: f */
    public final tl.d f16142f;

    /* renamed from: g */
    public final tl.d f16143g;

    /* renamed from: h */
    public final wj.b f16144h;

    /* renamed from: i */
    public final w f16145i;

    /* renamed from: j */
    public kj.c f16146j;

    /* renamed from: k */
    public kj.e f16147k;

    /* renamed from: l */
    public kj.g f16148l;

    /* renamed from: m */
    public al.f f16149m;

    /* loaded from: classes2.dex */
    public static final class a implements wk.d {

        /* renamed from: a */
        public final /* synthetic */ fm.l f16150a;

        public a(fm.l lVar) {
            this.f16150a = lVar;
        }

        @Override // wk.d
        public final /* synthetic */ void accept(Object obj) {
            this.f16150a.k(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements wk.e {

        /* renamed from: a */
        public final /* synthetic */ fm.l f16151a;

        public b(g gVar) {
            this.f16151a = gVar;
        }

        @Override // wk.e
        public final /* synthetic */ Object apply(Object obj) {
            return this.f16151a.k(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements wk.f {

        /* renamed from: a */
        public final /* synthetic */ fm.l f16152a = e.f16127b;

        @Override // wk.f
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f16152a.k(obj)).booleanValue();
        }
    }

    public p(xi.a aVar, jj.a aVar2, boolean z10) {
        int i10;
        gm.l.f(aVar, "fcCore");
        this.f16137a = aVar;
        a.C0545a c0545a = new a.C0545a(aVar);
        c0545a.f29857e = 188;
        c0545a.f29858f = z10;
        c0545a.f29859g = null;
        c0545a.f29860h = new q0();
        wi.k kVar = new wi.k(c0545a);
        this.f16138b = kVar;
        vi.c cVar = (vi.c) aVar.f30590f.getValue();
        if (aVar2 != null) {
            i10 = aVar2.f17874e;
        } else {
            i10 = 0;
        }
        jj.l lVar = new jj.l(kVar, cVar, i10);
        this.f16139c = lVar;
        k1 k1Var = new k1(kVar, lVar, aVar.f30585a, aVar.a().j());
        this.f16140d = k1Var;
        tl.d a10 = fb.e.a(new m(this));
        this.f16141e = a10;
        this.f16142f = fb.e.a(new l(this));
        fb.e.a(new q(this));
        this.f16143g = fb.e.a(new n(this));
        wj.b bVar = new wj.b();
        this.f16144h = bVar;
        w wVar = new w();
        this.f16145i = wVar;
        if (aVar2 != null) {
            if (aVar2.f17870a) {
                this.f16146j = new kj.c(aVar.f30585a, kVar, k1Var);
            }
            if (aVar2.f17871b || aVar2.f17873d) {
                this.f16147k = new kj.e(aVar.f30585a, kVar, (o0) a10.getValue(), aVar2.f17871b, aVar2.f17873d);
            }
            if (aVar2.f17872c) {
                this.f16148l = new kj.g(aVar.f30585a, this);
            }
        }
        en.f fVar = new en.f();
        kVar.j(bVar, fVar);
        byte[] bArr = new byte[4];
        m0.B(bArr, 3, 0, true);
        kVar.j(new ti.e(new bj.b((byte) 2, (byte) 80, bArr)), fVar);
        kVar.j(wVar, fVar);
        kVar.j(lVar, fVar);
        kVar.j(new wj.q(), null);
    }

    @Override // hj.a
    public final wi.e b() {
        return this.f16138b.f29916x;
    }

    @Override // hj.a
    public final void c() {
        this.f16138b.g(wi.e.DISCONNECT_TEMPORARY);
    }

    @Override // hj.a
    public final void close() {
        this.f16138b.e();
        al.f fVar = this.f16149m;
        if (fVar != null) {
            xk.b.a(fVar);
        }
    }

    @Override // hj.a
    public final BluetoothDevice d() {
        return this.f16138b.h();
    }

    @Override // hj.a
    public final void e() {
        wi.k kVar = this.f16138b;
        synchronized (kVar) {
            w0 w0Var = kVar.f29917y;
            if (w0Var != null) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#BaseConnectorImpl");
                bVar.h("reconnect rxBleDevice{%s}", w0Var.c());
                kVar.C = false;
                kVar.f(w0Var);
            }
        }
    }

    @Override // hj.a
    public final wi.d f() {
        wi.d dVar;
        wi.k kVar = this.f16138b;
        synchronized (kVar) {
            dVar = kVar.f29915w;
        }
        return dVar;
    }

    public final void finalize() {
        TelephonyManager createForSubscriptionId;
        k1 k1Var = this.f16140d;
        al.j jVar = k1Var.f17922f;
        jVar.getClass();
        xk.b.a(jVar);
        al.j jVar2 = k1Var.f17923g;
        jVar2.getClass();
        xk.b.a(jVar2);
        kj.c cVar = this.f16146j;
        if (cVar != null) {
            cVar.f18606a.unregisterComponentCallbacks(cVar.f18610e);
            al.j jVar3 = cVar.f18611f;
            jVar3.getClass();
            xk.b.a(jVar3);
        }
        kj.e eVar = this.f16147k;
        if (eVar != null) {
            al.j jVar4 = eVar.f18615c;
            jVar4.getClass();
            xk.b.a(jVar4);
            lj.e eVar2 = eVar.f18614b;
            if (eVar2 != null) {
                eVar2.f20048d.removeOnActiveSessionsChangedListener(eVar2.f20052h);
                eVar2.d();
            }
        }
        kj.g gVar = this.f16148l;
        if (gVar != null) {
            al.j jVar5 = gVar.f4436g;
            jVar5.getClass();
            xk.b.a(jVar5);
            if (Build.VERSION.SDK_INT >= 24) {
                SparseArray<T> sparseArray = gVar.f4434e;
                if (sparseArray != 0) {
                    int size = sparseArray.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        createForSubscriptionId = gVar.f4433d.createForSubscriptionId(sparseArray.keyAt(i10));
                        createForSubscriptionId.listen((PhoneStateListener) sparseArray.valueAt(i10), 0);
                    }
                }
                gVar.f4434e = null;
            }
            PhoneStateListener phoneStateListener = gVar.f4435f;
            if (phoneStateListener != null) {
                gVar.f4433d.listen(phoneStateListener, 0);
            }
            gVar.f4435f = null;
        }
        jj.l lVar = this.f16139c;
        al.j jVar6 = lVar.f17933g;
        jVar6.getClass();
        xk.b.a(jVar6);
        uk.c cVar2 = lVar.f17934h;
        if (cVar2 != null) {
            cVar2.c();
        }
    }

    @Override // hj.a
    public final t0 g() {
        return (t0) this.f16143g.getValue();
    }

    @Override // hj.a
    public final ql.d h() {
        ql.d<wi.d> dVar = this.f16138b.f29908p;
        gm.l.e(dVar, "stateSubject");
        return dVar;
    }

    @Override // hj.a
    public final boolean i() {
        boolean z10;
        wj.b bVar = this.f16144h;
        synchronized (bVar) {
            z10 = bVar.f29966c;
        }
        return z10;
    }

    @Override // hj.a
    public final d0 j() {
        return (d0) this.f16142f.getValue();
    }

    @Override // hj.a
    public final o0 k() {
        return (o0) this.f16141e.getValue();
    }

    @Override // hj.a
    public final k1 l() {
        return this.f16140d;
    }

    @Override // hj.a
    public final void m(NotificationListenerService notificationListenerService) {
        lj.e eVar;
        kj.e eVar2 = this.f16147k;
        if (eVar2 != null && (eVar = eVar2.f18614b) != null) {
            try {
                if (notificationListenerService != null) {
                    ComponentName componentName = new ComponentName(eVar.f20045a, notificationListenerService.getClass());
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("Fc#Music");
                    bVar.h("bind service thread:%s componentName:%s", Thread.currentThread().getName(), componentName);
                    eVar.f20048d.addOnActiveSessionsChangedListener(eVar.f20052h, componentName);
                    eVar.f20052h.onActiveSessionsChanged(eVar.f20048d.getActiveSessions(componentName));
                } else {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("Fc#Music");
                    bVar2.h("unbind service thread:%s", Thread.currentThread().getName());
                    eVar.f20048d.removeOnActiveSessionsChangedListener(eVar.f20052h);
                    eVar.d();
                }
            } catch (Exception e10) {
                a.b bVar3 = p000do.a.f13275a;
                bVar3.t("Fc#Music");
                bVar3.q(e10);
            }
        }
    }

    @Override // hj.a
    public final long n() {
        return this.f16138b.f29914v.get();
    }

    @Override // hj.a
    public final jj.l o() {
        return this.f16139c;
    }

    @Override // hj.a
    public final ij.c p(File file, boolean z10) {
        xi.a aVar = this.f16137a;
        if (file == null) {
            file = aVar.f30585a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        }
        return new ij.c(aVar, this, z10, file);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x008c A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #2 {, blocks: (B:112:0x0055, B:114:0x0079, B:116:0x007d, B:125:0x008c), top: B:211:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // hj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, int r20, float r21, float r22) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.p.q(java.lang.String, java.lang.String, boolean, boolean, int, float, float):void");
    }
}
