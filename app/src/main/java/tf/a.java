package tf;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;
import android.os.WorkSource;
import com.topstep.fitcloud.pro.model.location.LocationInfo;
import f.s;
import fm.l;
import fm.p;
import g9.k;
import g9.n;
import g9.t;
import gm.m;
import h8.o;
import h8.r;
import jh.v;
import mf.a0;
import p000do.a;
import pm.e0;
import pm.j;
import s.h1;
import x8.h;
import xl.d;
import zl.e;
import zl.i;

/* loaded from: classes2.dex */
public final class a implements ug.a {

    /* renamed from: a */
    public final h f28070a;

    /* renamed from: b */
    public final Geocoder f28071b;

    @e(c = "com.topstep.fitcloud.pro.function.location.GmsLocationEngine$requestLocation$2", f = "GmsLocationEngine.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: tf.a$a */
    /* loaded from: classes2.dex */
    public static final class C0498a extends i implements p<e0, d<? super LocationInfo>, Object> {

        /* renamed from: e */
        public int f28072e;

        /* renamed from: tf.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C0499a extends m implements l<Location, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ pm.i<LocationInfo> f28074b;

            /* renamed from: c */
            public final /* synthetic */ a f28075c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0499a(j jVar, a aVar) {
                super(1);
                this.f28074b = jVar;
                this.f28075c = aVar;
            }

            @Override // fm.l
            public final tl.l k(Location location) {
                Location location2 = location;
                a.b bVar = p000do.a.f13275a;
                bVar.t("GmsLocation");
                bVar.h("continuation success:%s", location2);
                if (location2 == null) {
                    this.f28074b.l(null);
                } else {
                    this.f28074b.l(h1.q(this.f28075c.f28071b, "GmsLocation", location2));
                }
                return tl.l.f28297a;
            }
        }

        /* renamed from: tf.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements g9.d {

            /* renamed from: a */
            public final /* synthetic */ pm.i<LocationInfo> f28076a;

            public b(j jVar) {
                this.f28076a = jVar;
            }

            @Override // g9.d
            public final void a(Exception exc) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("GmsLocation");
                bVar.i(exc, new Object[0]);
                this.f28076a.l(a0.f(exc));
            }
        }

        /* renamed from: tf.a$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends m implements l<Throwable, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ s f28077b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(s sVar) {
                super(1);
                this.f28077b = sVar;
            }

            @Override // fm.l
            public final tl.l k(Throwable th2) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("GmsLocation");
                bVar.h("continuation cancel", new Object[0]);
                t tVar = (t) ((w.e) this.f28077b.f13974a).f29490a;
                synchronized (tVar.f15057a) {
                    if (!tVar.f15059c) {
                        tVar.f15059c = true;
                        tVar.f15061e = null;
                        tVar.f15058b.b(tVar);
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0498a(d<? super C0498a> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super LocationInfo> dVar) {
            return ((C0498a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            return new C0498a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28072e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
            a aVar2 = a.this;
            this.f28072e = 1;
            j jVar = new j(1, a0.i(this));
            jVar.u();
            a.b bVar = p000do.a.f13275a;
            bVar.t("GmsLocation");
            bVar.h("continuation start", new Object[0]);
            s sVar = new s(3);
            h hVar = aVar2.f28070a;
            w.e eVar = (w.e) sVar.f13974a;
            hVar.getClass();
            o8.b.H(100);
            a9.a aVar3 = new a9.a(60000L, 0, 100, Long.MAX_VALUE, false, 0, null, new WorkSource(null), null);
            if (eVar != null) {
                t tVar = (t) eVar.f29490a;
                synchronized (tVar.f15057a) {
                    z10 = tVar.f15059c;
                }
                i8.p.a("cancellationToken may not be already canceled", !z10);
            }
            o.a aVar4 = new o.a();
            aVar4.f16003a = new r(aVar3, eVar, 1);
            aVar4.f16006d = 2415;
            t c10 = hVar.c(0, aVar4.a());
            if (eVar != null) {
                g9.h hVar2 = new g9.h(eVar);
                x8.d dVar = new x8.d(hVar2);
                c10.getClass();
                c10.f15058b.a(new k(g9.i.f15035a, dVar, new t()));
                c10.e();
                c10 = hVar2.f15034a;
            }
            b bVar2 = new b(new C0499a(jVar, aVar2));
            c10.getClass();
            g9.s sVar2 = g9.i.f15035a;
            c10.f15058b.a(new g9.p(sVar2, bVar2));
            c10.e();
            c10.f15058b.a(new n(sVar2, new b(jVar)));
            c10.e();
            jVar.z(new c(sVar));
            Object t10 = jVar.t();
            if (t10 == aVar) {
                return aVar;
            }
            return t10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements g9.e {

        /* renamed from: a */
        public final /* synthetic */ l f28078a;

        public b(C0498a.C0499a c0499a) {
            this.f28078a = c0499a;
        }

        @Override // g9.e
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f28078a.k(obj);
        }
    }

    public a(Context context) {
        int i10 = a9.d.f425a;
        this.f28070a = new h(context);
        this.f28071b = new Geocoder(context);
        a.b bVar = p000do.a.f13275a;
        bVar.t("GmsLocation");
        bVar.h("init", new Object[0]);
    }

    @Override // ug.a
    public final Object a(d<? super LocationInfo> dVar) {
        return v.g(180000L, new C0498a(null), dVar);
    }
}
