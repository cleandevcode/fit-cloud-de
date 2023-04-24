package ij;

import a0.q0;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import fl.t0;
import java.io.File;
import java.util.Objects;
import p000do.a;
import s.x2;
import yi.c;
import yk.a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final xi.a f17034a;

    /* renamed from: b */
    public final hj.p f17035b;

    /* renamed from: c */
    public final boolean f17036c;

    /* renamed from: d */
    public final File f17037d;

    /* renamed from: e */
    public gj.c f17038e;

    /* renamed from: f */
    public final c0 f17039f;

    /* renamed from: g */
    public final t f17040g;

    /* renamed from: h */
    public final Application f17041h;

    /* renamed from: i */
    public final ql.a<a> f17042i;

    /* renamed from: j */
    public b0 f17043j;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final int f17044a;

        /* renamed from: b */
        public final int f17045b;

        public /* synthetic */ a() {
            throw null;
        }

        public a(int i10, int i11) {
            gm.k.b(i10, "state");
            this.f17044a = i10;
            this.f17045b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f17044a == aVar.f17044a && this.f17045b == aVar.f17045b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f17045b + (s.c0.b(this.f17044a) * 31);
        }

        public final String toString() {
            StringBuilder c10 = jh.v.c("StateProgress(state=");
            c10.append(ij.b.b(this.f17044a));
            c10.append(", progress=");
            return jh.v.b(c10, this.f17045b, ')');
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17046a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f17047b;

        static {
            int[] iArr = new int[s.c0.c(3).length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17046a = iArr;
            int[] iArr2 = new int[s.c0.c(2).length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f17047b = iArr2;
        }
    }

    /* renamed from: ij.c$c */
    /* loaded from: classes2.dex */
    public static final class C0298c {

        /* renamed from: a */
        public final File f17048a;

        /* renamed from: b */
        public final BluetoothDevice f17049b;

        public C0298c(File file, BluetoothDevice bluetoothDevice) {
            gm.l.f(bluetoothDevice, "device");
            this.f17048a = file;
            this.f17049b = bluetoothDevice;
        }
    }

    public c(xi.a aVar, hj.p pVar, boolean z10, File file) {
        gm.l.f(aVar, "fcCore");
        gm.l.f(pVar, "connector");
        this.f17034a = aVar;
        this.f17035b = pVar;
        this.f17036c = z10;
        this.f17037d = file;
        this.f17038e = null;
        this.f17039f = null;
        this.f17040g = null;
        this.f17041h = aVar.f30585a;
        this.f17042i = new ql.a<>(new a(1, -1));
    }

    public static tk.a b(c cVar, int i10, Uri uri, byte b10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        tk.t pVar;
        gj.c jVar;
        boolean z12;
        cVar.getClass();
        gm.k.b(i10, "dfuType");
        gm.l.f(uri, "uri");
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#DfuManager");
        bVar.h("start dfuType:" + q0.c(i10) + " uri:" + uri + " binFlag:" + ((int) b10) + " downloadEveryTime:true", new Object[0]);
        if (!cVar.f17034a.a().f()) {
            c.a aVar = yi.c.f31771d;
            return new bl.c(c.a.a(1));
        } else if (!cVar.f17034a.a().i()) {
            c.a aVar2 = yi.c.f31771d;
            return new bl.c(c.a.a(2));
        } else {
            nj.c cVar2 = cVar.f17035b.f16139c.f17930d;
            if (cVar2.g(15)) {
                i11 = 3;
            } else if (cVar2.g(8)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            int i13 = b.f17046a[s.c0.b(i11)];
            if (i13 != 1) {
                if (i13 != 2) {
                    return new bl.c(c.a.c(yi.c.f31771d, 4, null, 6));
                }
                try {
                    Class.forName("no.nordicsemi.android.dfu.DfuBaseService");
                    z12 = true;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    z12 = false;
                }
                if (z12 && i10 != 5 && i10 != 4) {
                    z11 = false;
                    i12 = 2;
                } else {
                    return new bl.c(c.a.c(yi.c.f31771d, 4, null, 6));
                }
            } else {
                Application application = cVar.f17041h;
                boolean z13 = cVar.f17036c;
                gm.l.f(application, "context");
                try {
                    rd.a aVar3 = new rd.a();
                    aVar3.f25534a = z13;
                    aVar3.f25535b = z13;
                    aVar3.f25536c = "OTA";
                    rd.b.a(application, aVar3);
                    ie.b.c(application, z13);
                    ge.b.f15317d = new x2(6);
                    z10 = true;
                } catch (Exception e11) {
                    p000do.a.f13275a.q(e11);
                    z10 = false;
                }
                if (!z10) {
                    return new bl.c(c.a.c(yi.c.f31771d, 4, null, 6));
                }
                if (i10 == 1) {
                    z11 = cVar2.g(16);
                } else {
                    z11 = true;
                }
                i12 = 1;
            }
            cVar.a(i12);
            if (!gm.l.a(uri.getScheme(), "http") && !gm.l.a(uri.getScheme(), "https")) {
                pVar = tk.p.e(uri);
            } else {
                cVar.f17042i.b(new a(2, -1));
                gj.c cVar3 = cVar.f17038e;
                if (cVar3 == null) {
                    File file = cVar.f17037d;
                    try {
                        Class.forName("zm.u");
                        jVar = new gj.f(file);
                    } catch (Exception unused) {
                        jVar = new gj.j(file);
                    }
                    cVar3 = jVar;
                    cVar.f17038e = cVar3;
                }
                String uri2 = uri.toString();
                gm.l.e(uri2, "uri.toString()");
                pVar = new gl.p(new t0(new fl.t(new fj.b(new fl.g(new gj.b(uri2, cVar3, true)), new wi.h(3, d.f17050b)), new dj.c(1, new e(cVar)))), new ph.p(5, f.f17052b));
            }
            gl.l lVar = new gl.l(new gl.l(pVar, new wi.j(1, new g(cVar, i12, i10, b10))), new wi.f(4, new i(cVar, i12, i10)));
            il.f fVar = pl.a.f24281c;
            Objects.requireNonNull(fVar, "scheduler is null");
            gl.m mVar = new gl.m(new gl.q(new gl.s(lVar, fVar), sk.c.a()), new og.u(6, new m(cVar, i12, z11)));
            ij.a aVar4 = new ij.a(cVar, 0);
            a.d dVar = yk.a.f31789d;
            a.c cVar4 = yk.a.f31788c;
            return mVar.e(dVar, dVar, cVar4, aVar4).e(dVar, new ph.n(4, new n(cVar)), cVar4, cVar4).d(new mc.k(1, cVar));
        }
    }

    public final b0 a(int i10) {
        b0 a0Var;
        b0 b0Var = this.f17043j;
        int[] iArr = b.f17047b;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new qa.p();
                }
                if (b0Var instanceof w) {
                    return (w) b0Var;
                }
                if (b0Var != null) {
                    b0Var.release();
                }
                a0Var = new w(this.f17041h, this.f17036c);
            } else if (b0Var instanceof a0) {
                return (a0) b0Var;
            } else {
                if (b0Var != null) {
                    b0Var.release();
                }
                a0Var = new a0(this.f17041h);
            }
            this.f17043j = a0Var;
            return a0Var;
        }
        throw null;
    }

    public final void finalize() {
        if (this.f17035b.f() == wi.d.DISCONNECTED && this.f17035b.b() == wi.e.DISCONNECT_DFU) {
            this.f17035b.e();
        }
    }
}
