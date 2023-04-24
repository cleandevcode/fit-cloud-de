package dj;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import dj.b;
import fl.r0;
import fl.t;
import fl.y0;
import gm.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kc.o0;
import lc.n;
import og.u;
import p000do.a;
import ph.p;
import ph.q;
import rh.z;
import uc.f;
import yk.a;

/* loaded from: classes2.dex */
public final class f implements dj.b {

    /* renamed from: a */
    public final o0 f13107a;

    /* renamed from: b */
    public final vi.d f13108b;

    /* renamed from: c */
    public final vi.b f13109c;

    /* renamed from: d */
    public final vi.c f13110d;

    /* renamed from: e */
    public final b.a f13111e;

    /* renamed from: f */
    public final b.c f13112f;

    /* renamed from: g */
    public int f13113g;

    /* loaded from: classes2.dex */
    public static final class a implements wk.e<tk.i<? extends Throwable>, tk.i<?>> {

        /* renamed from: a */
        public final long f13114a;

        /* renamed from: b */
        public final TimeUnit f13115b;

        /* renamed from: c */
        public boolean f13116c;

        public a(TimeUnit timeUnit) {
            l.f(timeUnit, "unit");
            this.f13114a = 120L;
            this.f13115b = timeUnit;
        }

        @Override // wk.e
        public final tk.i<?> apply(tk.i<? extends Throwable> iVar) {
            tk.i<? extends Throwable> iVar2 = iVar;
            l.f(iVar2, "attempts");
            tk.i o10 = iVar2.o(new u(5, new e(this)));
            l.e(o10, "override fun apply(attem…}\n            }\n        }");
            return o10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final uc.e f13117a;

        /* renamed from: b */
        public final String f13118b;

        /* renamed from: c */
        public final int f13119c;

        public b(uc.e eVar, String str, int i10) {
            l.f(eVar, WiseOpenHianalyticsData.UNION_RESULT);
            this.f13117a = eVar;
            this.f13118b = str;
            this.f13119c = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return l.a(this.f13117a, bVar.f13117a) && l.a(this.f13118b, bVar.f13118b) && this.f13119c == bVar.f13119c;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f13117a.hashCode() * 31;
            String str = this.f13118b;
            return this.f13119c + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("TempScanResult(result=");
            a10.append(this.f13117a);
            a10.append(", name=");
            a10.append(this.f13118b);
            a10.append(", companyId=");
            return a1.b.a(a10, this.f13119c, ')');
        }
    }

    public f(b.C0226b c0226b) {
        this.f13107a = c0226b.f13094a;
        this.f13108b = c0226b.f13095b;
        this.f13109c = c0226b.f13096c;
        this.f13110d = c0226b.f13097d;
        this.f13111e = c0226b.f13098e;
        this.f13112f = c0226b.f13099f;
    }

    @Override // dj.b
    public final tk.i a(final TimeUnit timeUnit) {
        int i10;
        l.f(timeUnit, "unit");
        boolean d10 = this.f13108b.d();
        boolean e10 = this.f13109c.e();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#Scanner");
        bVar.h("Try scan foreground:%b, isLocationEnabled:%b, check:%b, time:%d, unit:%s", Boolean.valueOf(d10), Boolean.valueOf(e10), Boolean.FALSE, 120L, timeUnit.toString());
        f.b bVar2 = new f.b();
        if (d10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        bVar2.b(i10);
        bVar2.a(1);
        bVar2.f28683c = false;
        tk.i<uc.e> c10 = this.f13107a.c(new uc.f(bVar2.f28681a, bVar2.f28682b, 0L, 1, 3, true, false), new uc.c[0]);
        c10.getClass();
        tk.i y0Var = new y0(c10, tk.i.D(120L, timeUnit));
        if (d10 && !e10) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            q qVar = new q(3, new g(atomicInteger));
            a.d dVar = yk.a.f31789d;
            a.c cVar = yk.a.f31788c;
            y0Var = y0Var.k(qVar, dVar, cVar, cVar).k(dVar, dVar, new wk.a() { // from class: dj.d

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ long f13105d = 120;

                @Override // wk.a
                public final void run() {
                    f fVar = f.this;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    TimeUnit timeUnit2 = timeUnit;
                    long j10 = this.f13105d;
                    l.f(fVar, "this$0");
                    l.f(atomicInteger2, "$count");
                    l.f(timeUnit2, "$unit");
                    if (fVar.f13109c.e()) {
                        return;
                    }
                    if (atomicInteger2.get() > 0) {
                        fVar.f13110d.c(true);
                        return;
                    }
                    long seconds = timeUnit2.toSeconds(j10);
                    if (seconds >= 5) {
                        fVar.f13113g += (int) seconds;
                        if (!fVar.f13110d.a()) {
                            if (fVar.f13113g < 45) {
                                return;
                            }
                            fVar.f13113g = 0;
                            throw new n(4);
                        } else if (fVar.f13113g < 90) {
                        } else {
                            fVar.f13113g = 0;
                            fVar.f13110d.c(false);
                            throw new n(4);
                        }
                    }
                }
            }, cVar);
        }
        z zVar = new z(3, h.f13121b);
        a.d dVar2 = yk.a.f31789d;
        a.c cVar2 = yk.a.f31788c;
        return new t(new r0(y0Var.k(dVar2, zVar, cVar2, cVar2), new a(timeUnit)).u(new wi.h(2, i.f13122b)), new c(0, new j(this))).u(new p(3, new k(this)));
    }
}
