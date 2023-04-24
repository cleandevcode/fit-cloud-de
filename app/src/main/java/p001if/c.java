package p001if;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.d;
import fl.g;
import ij.a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000do.a;
import yi.c;

/* renamed from: if.c */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d */
    public Context f16796d;

    /* renamed from: f */
    public p001if.b f16798f;

    /* renamed from: h */
    public b f16800h;

    /* renamed from: a */
    public boolean f16793a = true;

    /* renamed from: b */
    public boolean f16794b = ie.b.f16771a;

    /* renamed from: c */
    public boolean f16795c = ie.b.f16772b;

    /* renamed from: e */
    public lf.a f16797e = null;

    /* renamed from: g */
    public int f16799g = 2;

    /* renamed from: i */
    public Object f16801i = new Object();

    /* renamed from: j */
    public int f16802j = 0;

    /* renamed from: k */
    public Handler f16803k = new Handler(Looper.myLooper());

    /* renamed from: l */
    public a f16804l = new a();

    /* renamed from: if.c$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean j10;
            e eVar = (e) c.this;
            if (eVar.f16797e == null) {
                ge.b.e("dfu has not been initialized", eVar.f16793a);
                eVar.h(eVar.f16800h);
            }
            if (eVar.f16798f == null) {
                ge.b.d("mConnectParams == null");
                eVar.e(DfuBaseService.ERROR_FILE_ERROR);
                z10 = false;
            } else {
                zd.b.a(d.a("retry to reconnect device, reconnectTimes ="), eVar.f16799g);
                z10 = true;
            }
            if (z10) {
                if (!eVar.f16798f.f16786c || !(j10 = eVar.l(eVar.f16779r))) {
                    j10 = eVar.j(eVar.f16779r);
                }
                if (j10) {
                    return;
                }
            }
            eVar.e(DfuBaseService.ERROR_FILE_ERROR);
        }
    }

    /* renamed from: if.c$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a(int i10);
    }

    public abstract void a();

    public final boolean b() {
        int i10 = this.f16802j;
        return (i10 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) == 512 && i10 != 527;
    }

    public final void c(int i10, int i11) {
        ge.b.n(String.format("onError: 0x%04X", Integer.valueOf(i11)));
        b bVar = this.f16800h;
        if (bVar != null) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("Fc#DfuProcess8762C");
            bVar2.p("onError type:" + i10 + " code:" + i11, new Object[0]);
            ((g.a) ((a0.a) bVar).f17032e).f(c.a.d(yi.c.f31771d, i11, 6));
            return;
        }
        ge.b.o("no callback registered", this.f16795c);
    }

    public final void d() {
        try {
            synchronized (this.f16801i) {
                if (this.f16795c) {
                    ge.b.n("notifyLock");
                }
                this.f16801i.notifyAll();
            }
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
    }

    public final void e(int i10) {
        int i11 = this.f16802j;
        if (i10 != i11) {
            ge.b.n(String.format("DFU 0x%04X >> 0x%04X", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
        this.f16802j = i10;
        b bVar = this.f16800h;
        if (bVar != null) {
            bVar.a(i10);
        } else {
            ge.b.o("no callback registered", this.f16795c);
        }
    }
}
