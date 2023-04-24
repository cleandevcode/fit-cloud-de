package of;

import a0.k0;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bi.z0;
import com.topstep.fitcloud.pro.MyApplication;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.function.MySmsBroadcastReceiver;
import com.topstep.fitcloud.pro.model.utils.moshi.DateAdapter;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeAdapter;
import com.topstep.fitcloud.pro.model.utils.moshi.UUIDAdapter;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker;
import com.topstep.fitcloud.pro.shared.data.work.WeatherWorker;
import java.util.Collections;
import java.util.Set;
import lg.r0;
import m2.t;
import mf.h0;
import og.d0;
import og.e1;
import og.k1;
import og.o1;
import og.s1;
import pm.e0;
import pm.o0;
import xl.f;

/* loaded from: classes2.dex */
public final class k extends y {

    /* renamed from: a */
    public final com.bumptech.glide.manager.g f23143a;

    /* renamed from: b */
    public final w.o f23144b;

    /* renamed from: c */
    public final jk.a f23145c;

    /* renamed from: d */
    public final k f23146d = this;

    /* renamed from: e */
    public sl.a<e0> f23147e = k0.d(this, 0);

    /* renamed from: f */
    public sl.a<e0> f23148f = k0.d(this, 4);

    /* renamed from: g */
    public sl.a<h0> f23149g = k0.d(this, 5);

    /* renamed from: h */
    public sl.a<yg.b> f23150h = k0.d(this, 3);

    /* renamed from: i */
    public sl.a<AppDatabase> f23151i = k0.d(this, 6);

    /* renamed from: j */
    public sl.a<hg.b> f23152j = k0.d(this, 9);

    /* renamed from: k */
    public sl.a<hg.a> f23153k = k0.d(this, 8);

    /* renamed from: l */
    public sl.a<vg.b> f23154l = k0.d(this, 7);

    /* renamed from: m */
    public sl.a<yg.b0> f23155m = k0.d(this, 10);

    /* renamed from: n */
    public sl.a<kg.m> f23156n = k0.d(this, 12);

    /* renamed from: o */
    public a f23157o = new a(this, 11);

    /* renamed from: p */
    public sl.a<kg.h> f23158p = k0.d(this, 13);

    /* renamed from: q */
    public sl.a<kg.b> f23159q = k0.d(this, 14);

    /* renamed from: r */
    public a f23160r = new a(this, 17);

    /* renamed from: s */
    public sl.a<o1> f23161s = k0.d(this, 16);

    /* renamed from: t */
    public a f23162t = new a(this, 15);

    /* renamed from: u */
    public sl.a<lg.d> f23163u = k0.d(this, 18);

    /* renamed from: v */
    public sl.a<r0> f23164v = k0.d(this, 19);

    /* renamed from: w */
    public sl.a<ah.e> f23165w = k0.d(this, 20);

    /* renamed from: x */
    public sl.a<d0> f23166x = k0.d(this, 2);

    /* renamed from: y */
    public a f23167y = new a(this, 1);

    /* renamed from: z */
    public a f23168z = new a(this, 22);
    public sl.a<k1> A = k0.d(this, 24);
    public a B = new a(this, 23);
    public sl.a<ug.a> C = k0.d(this, 26);
    public sl.a<ug.c> D = k0.d(this, 25);
    public sl.a<sf.i> E = k0.d(this, 21);
    public sl.a<ch.f> F = k0.d(this, 28);
    public a G = new a(this, 27);
    public sl.a<ch.b> H = k0.d(this, 31);
    public sl.a<Object> I = mk.b.a(new a(this, 30));
    public sl.a<Object> J = mk.b.a(new a(this, 32));
    public a K = new a(this, 29);
    public sl.a<jg.b> L = k0.d(this, 33);
    public sl.a<zg.c> M = k0.d(this, 35);
    public sl.a<tg.i> N = k0.d(this, 36);
    public sl.a<xg.c> O = k0.d(this, 34);
    public a P = new a(this, 37);
    public sl.a<DateMonitor> Q = k0.d(this, 38);
    public sl.a<tg.b> R = k0.d(this, 40);
    public a S = new a(this, 39);
    public a T = new a(this, 41);

    /* loaded from: classes2.dex */
    public static final class a<T> implements sl.a<T> {

        /* renamed from: a */
        public final k f23169a;

        /* renamed from: b */
        public final int f23170b;

        /* renamed from: of.k$a$a */
        /* loaded from: classes2.dex */
        public class C0415a implements b2.b {
            public C0415a() {
                a.this = r1;
            }

            @Override // b2.b
            public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
                k kVar = a.this.f23169a;
                com.bumptech.glide.manager.g gVar = kVar.f23143a;
                ch.b bVar = kVar.H.get();
                gVar.getClass();
                gm.l.f(bVar, "repository");
                return new CloudSyncWorker(context, workerParameters, bVar);
            }
        }

        /* loaded from: classes2.dex */
        public class b implements b2.b {
            public b() {
                a.this = r1;
            }

            @Override // b2.b
            public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
                ug.c n10 = k.n(a.this.f23169a);
                k kVar = a.this.f23169a;
                com.bumptech.glide.manager.g gVar = kVar.f23143a;
                ch.d dVar = new ch.d(kVar.s(), kVar.f23151i.get());
                gVar.getClass();
                return new WeatherWorker(context, workerParameters, n10, dVar, (og.t) a.this.f23169a.f23167y.get());
            }
        }

        public a(k kVar, int i10) {
            this.f23169a = kVar;
            this.f23170b = i10;
        }

        /* JADX WARN: Type inference failed for: r0v24, types: [T, com.topstep.fitcloud.pro.shared.data.db.AppDatabase] */
        @Override // sl.a, dk.a
        public final T get() {
            switch (this.f23170b) {
                case 0:
                    wm.c cVar = o0.f24381a;
                    mf.a0.c(cVar);
                    return (T) bi.r.b(f.a.a(z0.a(), cVar));
                case 1:
                    k kVar = this.f23169a;
                    com.bumptech.glide.manager.g gVar = kVar.f23143a;
                    T t10 = (T) kVar.f23166x.get();
                    gVar.getClass();
                    gm.l.f(t10, "deviceManager");
                    return t10;
                case 2:
                    k kVar2 = this.f23169a;
                    w.o oVar = kVar2.f23144b;
                    Context context = kVar2.f23145c.f17992a;
                    mf.a0.c(context);
                    oVar.getClass();
                    hj.b a10 = o.a(context);
                    Context context2 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context2);
                    return (T) new d0(a10, context2, this.f23169a.f23147e.get(), k.r(this.f23169a), this.f23169a.f23151i.get(), this.f23169a.s(), k.i(this.f23169a), (kg.k) this.f23169a.f23157o.get(), k.l(this.f23169a), k.k(this.f23169a), mk.a.a(this.f23169a.f23162t), this.f23169a.f23163u.get(), mk.a.a(this.f23169a.f23164v), k.m(this.f23169a));
                case 3:
                    Context context3 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context3);
                    return (T) new yg.b(context3, this.f23169a.f23147e.get(), this.f23169a.f23148f.get(), this.f23169a.f23149g.get());
                case 4:
                    e0 e0Var = this.f23169a.f23147e.get();
                    wm.c cVar2 = o0.f24381a;
                    mf.a0.c(cVar2);
                    gm.l.f(e0Var, "applicationScope");
                    return (T) bi.r.I(e0Var, cVar2);
                case 5:
                    this.f23169a.f23143a.getClass();
                    h0.a aVar = new h0.a();
                    aVar.b(wg.k.f29827a);
                    aVar.b(wg.a.f29812a);
                    aVar.b(wg.i.f29826a);
                    aVar.b(wg.g.f29821a);
                    aVar.b(wg.e.f29819a);
                    aVar.b(wg.c.f29814a);
                    aVar.a(new DateAdapter());
                    aVar.a(new TimeAdapter());
                    aVar.a(new UUIDAdapter());
                    return (T) new h0(aVar);
                case 6:
                    k kVar3 = this.f23169a;
                    com.bumptech.glide.manager.g gVar2 = kVar3.f23143a;
                    Context context4 = kVar3.f23145c.f17992a;
                    mf.a0.c(context4);
                    wm.b bVar = o0.f24382b;
                    mf.a0.c(bVar);
                    h0 h0Var = this.f23169a.f23149g.get();
                    gVar2.getClass();
                    gm.l.f(h0Var, "moshi");
                    Context applicationContext = context4.getApplicationContext();
                    gm.l.e(applicationContext, "context.applicationContext");
                    if (!om.h.W("appDatabase")) {
                        t.a aVar2 = new t.a(applicationContext, AppDatabase.class, "appDatabase");
                        aVar2.f20284l = false;
                        aVar2.f20285m = true;
                        aVar2.a(new mg.a());
                        aVar2.a(new mg.b());
                        aVar2.a(new mg.c());
                        aVar2.a(new mg.d(h0Var, context4));
                        aVar2.f20279g = bVar;
                        ?? r02 = (T) ((AppDatabase) aVar2.b());
                        r02.f10052m = h0Var;
                        return r02;
                    }
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
                case 7:
                    Context context5 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context5);
                    e0 e0Var2 = this.f23169a.f23147e.get();
                    yg.b r10 = k.r(this.f23169a);
                    h0 h0Var2 = this.f23169a.f23149g.get();
                    hg.a aVar3 = this.f23169a.f23153k.get();
                    this.f23169a.f23144b.getClass();
                    return (T) new vg.b(context5, e0Var2, r10, h0Var2, aVar3, new mf.a0());
                case 8:
                    k kVar4 = this.f23169a;
                    w.o oVar2 = kVar4.f23144b;
                    T t11 = (T) kVar4.f23152j.get();
                    oVar2.getClass();
                    gm.l.f(t11, "impl");
                    return t11;
                case 9:
                    return (T) new hg.b(this.f23169a.f23147e.get());
                case 10:
                    Context context6 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context6);
                    wm.b bVar2 = o0.f24382b;
                    mf.a0.c(bVar2);
                    return (T) new yg.b0(context6, this.f23169a.f23147e.get(), bVar2, k.r(this.f23169a));
                case 11:
                    k kVar5 = this.f23169a;
                    com.bumptech.glide.manager.g gVar3 = kVar5.f23143a;
                    T t12 = (T) kVar5.f23156n.get();
                    gVar3.getClass();
                    gm.l.f(t12, "repository");
                    return t12;
                case 12:
                    e0 e0Var3 = this.f23169a.f23147e.get();
                    yg.b r11 = k.r(this.f23169a);
                    vg.d s10 = this.f23169a.s();
                    AppDatabase appDatabase = this.f23169a.f23151i.get();
                    Context context7 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context7);
                    return (T) new kg.m(e0Var3, r11, s10, appDatabase, context7);
                case 13:
                    return (T) new kg.h(this.f23169a.f23147e.get(), k.r(this.f23169a), this.f23169a.f23151i.get(), this.f23169a.s());
                case 14:
                    return (T) new kg.b(this.f23169a.f23147e.get(), k.r(this.f23169a), this.f23169a.f23151i.get(), this.f23169a.s());
                case 15:
                    k kVar6 = this.f23169a;
                    com.bumptech.glide.manager.g gVar4 = kVar6.f23143a;
                    T t13 = (T) kVar6.f23161s.get();
                    gVar4.getClass();
                    gm.l.f(t13, "repository");
                    return t13;
                case 16:
                    return (T) new o1(this.f23169a.f23151i.get(), this.f23169a.s(), (yg.m) this.f23169a.f23160r.get());
                case 17:
                    k kVar7 = this.f23169a;
                    com.bumptech.glide.manager.g gVar5 = kVar7.f23143a;
                    T t14 = (T) kVar7.f23150h.get();
                    gVar5.getClass();
                    gm.l.f(t14, "storage");
                    return t14;
                case 18:
                    Context context8 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context8);
                    return (T) new lg.d(context8, k.r(this.f23169a), this.f23169a.f23151i.get(), this.f23169a.f23147e.get(), k.i(this.f23169a), this.f23169a.s(), this.f23169a.f23149g.get());
                case 19:
                    Context context9 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context9);
                    return (T) new r0(context9, k.r(this.f23169a), this.f23169a.f23151i.get(), this.f23169a.f23147e.get(), k.i(this.f23169a), this.f23169a.s(), this.f23169a.f23149g.get());
                case 20:
                    return (T) new ah.e(this.f23169a.f23147e.get(), k.r(this.f23169a), this.f23169a.f23151i.get(), k.i(this.f23169a), (kg.k) this.f23169a.f23157o.get());
                case 21:
                    Context context10 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context10);
                    return (T) new sf.i(context10, this.f23169a.f23147e.get(), (og.t) this.f23169a.f23167y.get(), mk.a.a(this.f23169a.f23168z), mk.a.a(this.f23169a.B), k.n(this.f23169a), k.m(this.f23169a));
                case 22:
                    Context context11 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context11);
                    return (T) new sf.n(context11, this.f23169a.f23147e.get(), (og.t) this.f23169a.f23167y.get());
                case 23:
                    k kVar8 = this.f23169a;
                    com.bumptech.glide.manager.g gVar6 = kVar8.f23143a;
                    T t15 = (T) kVar8.A.get();
                    gVar6.getClass();
                    gm.l.f(t15, "repository");
                    return t15;
                case 24:
                    return (T) new k1(k.r(this.f23169a), k.i(this.f23169a), this.f23169a.f23151i.get());
                case 25:
                    Context context12 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context12);
                    return (T) new ug.c(context12, this.f23169a.f23151i.get(), this.f23169a.f23147e.get(), mk.a.a(this.f23169a.C));
                case 26:
                    k kVar9 = this.f23169a;
                    w.o oVar3 = kVar9.f23144b;
                    Context context13 = kVar9.f23145c.f17992a;
                    mf.a0.c(context13);
                    oVar3.getClass();
                    return f8.d.f14180d.c(context13) == 0 ? (T) new tf.a(context13) : (T) new tf.b(context13);
                case 27:
                    k kVar10 = this.f23169a;
                    com.bumptech.glide.manager.g gVar7 = kVar10.f23143a;
                    T t16 = (T) kVar10.F.get();
                    gVar7.getClass();
                    gm.l.f(t16, "repository");
                    return t16;
                case 28:
                    Context context14 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context14);
                    return (T) new ch.f(context14, this.f23169a.f23147e.get(), k.r(this.f23169a));
                case 29:
                    k kVar11 = this.f23169a;
                    kVar11.getClass();
                    x2.i iVar = new x2.i(2);
                    iVar.f("com.topstep.fitcloud.pro.shared.data.work.CloudSyncWorker", kVar11.I);
                    iVar.f("com.topstep.fitcloud.pro.shared.data.work.WeatherWorker", kVar11.J);
                    return (T) new b2.a(iVar.d());
                case 30:
                    return (T) new C0415a();
                case 31:
                    return (T) new ch.b(k.i(this.f23169a), (kg.k) this.f23169a.f23157o.get(), k.l(this.f23169a), k.k(this.f23169a), (og.t) this.f23169a.f23167y.get(), this.f23169a.f23163u.get(), this.f23169a.f23164v.get());
                case 32:
                    return (T) new b();
                case 33:
                    Context context15 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context15);
                    return (T) new jg.b(context15, k.r(this.f23169a), this.f23169a.s(), this.f23169a.f23151i.get(), k.i(this.f23169a), (og.t) this.f23169a.f23167y.get());
                case 34:
                    return (T) new xg.c(k.p(this.f23169a), k.q(this.f23169a), this.f23169a.f23147e.get());
                case 35:
                    Context context16 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context16);
                    return (T) new zg.c(context16, (yg.m) this.f23169a.f23160r.get(), (og.t) this.f23169a.f23167y.get(), this.f23169a.s());
                case 36:
                    yg.b r12 = k.r(this.f23169a);
                    Context context17 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context17);
                    vg.d s11 = this.f23169a.s();
                    e0 e0Var4 = this.f23169a.f23147e.get();
                    yg.b0 i10 = k.i(this.f23169a);
                    this.f23169a.f23144b.getClass();
                    return (T) new tg.i(r12, context17, s11, e0Var4, i10, new mf.a0());
                case 37:
                    k kVar12 = this.f23169a;
                    com.bumptech.glide.manager.g gVar8 = kVar12.f23143a;
                    T t17 = (T) kVar12.f23163u.get();
                    gVar8.getClass();
                    gm.l.f(t17, "repository");
                    return t17;
                case 38:
                    Context context18 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context18);
                    return (T) new DateMonitor(context18);
                case 39:
                    k kVar13 = this.f23169a;
                    com.bumptech.glide.manager.g gVar9 = kVar13.f23143a;
                    T t18 = (T) kVar13.R.get();
                    gVar9.getClass();
                    gm.l.f(t18, "repository");
                    return t18;
                case 40:
                    Context context19 = this.f23169a.f23145c.f17992a;
                    mf.a0.c(context19);
                    return (T) new tg.b(context19, k.r(this.f23169a), this.f23169a.s());
                case 41:
                    k kVar14 = this.f23169a;
                    com.bumptech.glide.manager.g gVar10 = kVar14.f23143a;
                    T t19 = (T) new s1(kVar14.f23151i.get(), kVar14.s(), mk.a.a(kVar14.f23164v));
                    gVar10.getClass();
                    return t19;
                default:
                    throw new AssertionError(this.f23170b);
            }
        }
    }

    public k(jk.a aVar, w.o oVar, com.bumptech.glide.manager.g gVar) {
        this.f23143a = gVar;
        this.f23144b = oVar;
        this.f23145c = aVar;
    }

    public static long g(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        jg.b bVar = kVar.L.get();
        gVar.getClass();
        gm.l.f(bVar, "manager");
        Long a10 = bVar.a();
        gm.l.c(a10);
        return a10.longValue();
    }

    public static e1 h(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        Context context = kVar.f23145c.f17992a;
        mf.a0.c(context);
        e1 e1Var = new e1(context, kVar.f23149g.get(), (og.t) kVar.f23167y.get(), kVar.s(), kVar.f23151i.get());
        gVar.getClass();
        return e1Var;
    }

    public static yg.b0 i(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        yg.b0 b0Var = kVar.f23155m.get();
        gVar.getClass();
        gm.l.f(b0Var, "manager");
        return b0Var;
    }

    public static xg.c j(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        xg.c cVar = kVar.O.get();
        gVar.getClass();
        gm.l.f(cVar, "repository");
        return cVar;
    }

    public static kg.b k(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        kg.b bVar = kVar.f23159q.get();
        gVar.getClass();
        gm.l.f(bVar, "repository");
        return bVar;
    }

    public static kg.h l(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        kg.h hVar = kVar.f23158p.get();
        gVar.getClass();
        gm.l.f(hVar, "repository");
        return hVar;
    }

    public static ah.e m(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        ah.e eVar = kVar.f23165w.get();
        gVar.getClass();
        gm.l.f(eVar, "repository");
        return eVar;
    }

    public static ug.c n(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        ug.c cVar = kVar.D.get();
        gVar.getClass();
        gm.l.f(cVar, "repository");
        return cVar;
    }

    public static r0 o(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        r0 r0Var = kVar.f23164v.get();
        gVar.getClass();
        gm.l.f(r0Var, "repository");
        return r0Var;
    }

    public static zg.c p(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        zg.c cVar = kVar.M.get();
        gVar.getClass();
        gm.l.f(cVar, "repository");
        return cVar;
    }

    public static tg.i q(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        tg.i iVar = kVar.N.get();
        gVar.getClass();
        gm.l.f(iVar, "repository");
        return iVar;
    }

    public static yg.b r(k kVar) {
        com.bumptech.glide.manager.g gVar = kVar.f23143a;
        yg.b bVar = kVar.f23150h.get();
        gVar.getClass();
        gm.l.f(bVar, "storage");
        return bVar;
    }

    @Override // dagger.hilt.android.internal.managers.g.a
    public final i a() {
        return new i(this.f23146d);
    }

    @Override // sf.u
    public final void b(MySmsBroadcastReceiver mySmsBroadcastReceiver) {
        mySmsBroadcastReceiver.f9567d = mk.a.a(this.B);
    }

    @Override // of.s
    public final void c(MyApplication myApplication) {
        myApplication.f9536c = mk.a.a(this.f23147e);
        myApplication.f9537d = mk.a.a(this.f23167y);
        myApplication.f9538e = mk.a.a(this.E);
        myApplication.f9539f = mk.a.a(this.G);
        myApplication.f9540g = mk.a.a(this.K);
        myApplication.f9541h = mk.a.a(this.f23160r);
    }

    @Override // qf.b
    public final g d() {
        return new g(this.f23146d);
    }

    @Override // gk.a.InterfaceC0273a
    public final Set<Boolean> e() {
        return Collections.emptySet();
    }

    @Override // dagger.hilt.android.internal.managers.c.a
    public final c f() {
        return new c(this.f23146d);
    }

    public final vg.d s() {
        com.bumptech.glide.manager.g gVar = this.f23143a;
        vg.b bVar = this.f23154l.get();
        gVar.getClass();
        gm.l.f(bVar, "apiClient");
        vg.d dVar = bVar.f29338i;
        mf.a0.c(dVar);
        return dVar;
    }

    public final jg.b t() {
        com.bumptech.glide.manager.g gVar = this.f23143a;
        jg.b bVar = this.L.get();
        gVar.getClass();
        gm.l.f(bVar, "manager");
        return bVar;
    }
}
