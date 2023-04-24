package ij;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import fl.g;
import ij.a0;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import p000do.a;
import p001if.a;
import p001if.c;
import yi.c;

/* loaded from: classes2.dex */
public final class a0 implements b0 {

    /* renamed from: a */
    public final p001if.e f17026a;

    /* renamed from: b */
    public final tl.i f17027b;

    /* loaded from: classes2.dex */
    public static final class a extends c.b {

        /* renamed from: b */
        public final /* synthetic */ File f17029b;

        /* renamed from: c */
        public final /* synthetic */ BluetoothDevice f17030c;

        /* renamed from: d */
        public final /* synthetic */ boolean f17031d;

        /* renamed from: e */
        public final /* synthetic */ tk.j<gj.g<Boolean>> f17032e;

        /* renamed from: f */
        public final /* synthetic */ gm.z f17033f;

        public a(File file, BluetoothDevice bluetoothDevice, boolean z10, g.a aVar, gm.z zVar) {
            a0.this = r1;
            this.f17029b = file;
            this.f17030c = bluetoothDevice;
            this.f17031d = z10;
            this.f17032e = aVar;
            this.f17033f = zVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:205:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x02b0  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x0324  */
        /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
        @Override // p001if.c.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r18) {
            /*
                Method dump skipped, instructions count: 831
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ij.a0.a.a(int):void");
        }
    }

    public a0(Application application) {
        gm.l.f(application, "context");
        if (p001if.e.H == null) {
            synchronized (p001if.e.class) {
                if (p001if.e.H == null) {
                    p001if.e.H = new p001if.e(application.getApplicationContext());
                }
            }
        }
        p001if.e eVar = p001if.e.H;
        this.f17026a = eVar;
        this.f17027b = new tl.i(z.f17095b);
        eVar.h(eVar.f16800h);
    }

    @Override // ij.b0
    public final tk.i<gj.g<Boolean>> a(final File file, final BluetoothDevice bluetoothDevice, final boolean z10) {
        gm.l.f(file, "file");
        gm.l.f(bluetoothDevice, "device");
        return new fl.g(new tk.k() { // from class: ij.x
            @Override // tk.k
            public final void a(g.a aVar) {
                final a0 a0Var = a0.this;
                File file2 = file;
                BluetoothDevice bluetoothDevice2 = bluetoothDevice;
                boolean z11 = z10;
                gm.l.f(a0Var, "this$0");
                gm.l.f(file2, "$file");
                gm.l.f(bluetoothDevice2, "$device");
                final a0.a aVar2 = new a0.a(file2, bluetoothDevice2, z11, aVar, new gm.z());
                aVar.e(new wk.c() { // from class: ij.y
                    @Override // wk.c
                    public final void cancel() {
                        a0 a0Var2 = a0.this;
                        a0.a aVar3 = aVar2;
                        gm.l.f(a0Var2, "this$0");
                        gm.l.f(aVar3, "$callback");
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#DfuProcess8762C");
                        bVar.p("dfuAdapter cancel", new Object[0]);
                        if (gm.l.a(a0Var2.f17026a.f16800h, aVar3)) {
                            p001if.e eVar = a0Var2.f17026a;
                            eVar.f16800h = null;
                            eVar.a();
                            p001if.e eVar2 = a0Var2.f17026a;
                            lf.a aVar4 = eVar2.f16797e;
                            if (aVar4 != null) {
                                aVar4.a();
                                return;
                            }
                            ge.b.p("dfu has not been initialized");
                            eVar2.m();
                        }
                    }
                });
                if (a0Var.f17026a.h(aVar2)) {
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("Fc#DfuProcess8762C");
                    bVar.p("dfuAdapter initialize success", new Object[0]);
                    return;
                }
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Fc#DfuProcess8762C");
                bVar2.p("dfuAdapter initialize fail", new Object[0]);
                aVar.f(c.a.d(yi.c.f31771d, 2147483646, 6));
            }
        });
    }

    public final ze.e b() {
        return (ze.e) this.f17027b.getValue();
    }

    @Override // ij.b0
    public final void release() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        p001if.e eVar = this.f17026a;
        eVar.f16800h = null;
        eVar.a();
        ge.b.o("destroy", eVar.f16793a);
        eVar.f16802j = 0;
        eVar.f16798f = null;
        eVar.f16799g = 0;
        Handler handler = eVar.f16803k;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
        eVar.f16800h = null;
        lf.a aVar = eVar.f16797e;
        if (aVar != null) {
            aVar.f19461b = null;
            aVar.a();
            aVar.c();
        }
        eVar.f16797e = null;
        eVar.f16777p = null;
        eVar.f16779r = null;
        vd.d dVar = eVar.f16776o;
        if (dVar != null) {
            a.C0295a c0295a = eVar.f16780s;
            CopyOnWriteArrayList copyOnWriteArrayList2 = dVar.f29215b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.remove(c0295a);
            }
        }
        vd.b bVar = eVar.f16775n;
        if (bVar != null && (copyOnWriteArrayList = bVar.f29202d) != null) {
            copyOnWriteArrayList.remove((Object) null);
        }
        vd.c cVar = eVar.f16807u;
        if (cVar != null) {
            cVar.g(eVar.f16779r, eVar.F);
        }
        xe.a aVar2 = eVar.f16812z;
        if (aVar2 != null) {
            aVar2.a();
        }
        p001if.e.H = null;
    }
}
