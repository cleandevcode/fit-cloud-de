package ph;

import com.topstep.fitcloudpro.R;
import java.util.concurrent.TimeUnit;
import yk.a;

/* loaded from: classes2.dex */
public abstract class u extends y {

    /* renamed from: p0 */
    public og.t f24234p0;

    /* renamed from: q0 */
    public lg.c f24235q0;

    /* renamed from: r0 */
    public al.j f24236r0;

    /* renamed from: s0 */
    public uk.c f24237s0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<uk.c, tl.l> {

        /* renamed from: c */
        public final /* synthetic */ boolean f24239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(1);
            u.this = r1;
            this.f24239c = z10;
        }

        @Override // fm.l
        public final tl.l k(uk.c cVar) {
            u.this.j1();
            if (this.f24239c) {
                u.this.f24237s0 = tk.i.r(0L, 1L, TimeUnit.SECONDS, pl.a.f24280b).u(new p(0, r.f24216b)).w(sk.c.a()).y(new q(0, new s(u.this)), new k(1, t.f24228b), yk.a.f31788c);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<oj.d, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            u.this = r1;
        }

        @Override // fm.l
        public final tl.l k(oj.d dVar) {
            oj.d dVar2 = dVar;
            u uVar = u.this;
            gm.l.e(dVar2, "it");
            uVar.m1(dVar2);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            u.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            d7.e f12;
            int i10;
            Throwable th3 = th2;
            p000do.a.f13275a.q(th3);
            if (th3 instanceof yi.j) {
                int i11 = ((yi.j) th3).f31777a;
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f12 = u.this.f1();
                            i10 = R.string.temperature_test_error3;
                        }
                    } else {
                        f12 = u.this.f1();
                        i10 = R.string.temperature_test_error2;
                    }
                } else {
                    f12 = u.this.f1();
                    i10 = R.string.temperature_test_error1;
                }
                d7.e.d(f12, i10, null, 0, 30);
            } else {
                d7.e f13 = u.this.f1();
                gm.l.e(th3, "it");
                qi.p.f(f13, th3);
            }
            return tl.l.f28297a;
        }
    }

    public u(int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        al.j jVar = this.f24236r0;
        if (jVar != null) {
            xk.b.a(jVar);
        }
    }

    public final lg.c h1() {
        lg.c cVar = this.f24235q0;
        if (cVar != null) {
            return cVar;
        }
        gm.l.l("dataRepository");
        throw null;
    }

    public final og.t i1() {
        og.t tVar = this.f24234p0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public abstract void j1();

    public abstract void k1();

    public final void l1(int i10, boolean z10) {
        tk.i i11;
        d7.e f12;
        int i12;
        al.j jVar = this.f24236r0;
        if (jVar != null && !jVar.d()) {
            xk.b.a(jVar);
            return;
        }
        if (!og.x0.b(i1())) {
            f12 = f1();
            i12 = R.string.device_state_disconnected;
        } else if (((jj.d0) i1().f()).f17884d) {
            f12 = f1();
            i12 = R.string.sync_data_ongoing;
        } else {
            jj.d0 d0Var = (jj.d0) i1().f();
            if (d0Var.f17884d) {
                i11 = tk.i.m(new yi.g());
            } else {
                nj.c cVar = ((jj.l) d0Var.f17882b).f17930d;
                i11 = ((wi.k) d0Var.f17881a).i(new wj.j(i10, 1, cVar));
            }
            fl.k0 w10 = i11.w(sk.c.a());
            k kVar = new k(0, new a(z10));
            a.c cVar2 = yk.a.f31788c;
            this.f24236r0 = new fl.n(w10, kVar, cVar2).l(new wk.a() { // from class: ph.l
                @Override // wk.a
                public final void run() {
                    u uVar = u.this;
                    gm.l.f(uVar, "this$0");
                    uk.c cVar3 = uVar.f24237s0;
                    if (cVar3 != null) {
                        cVar3.c();
                    }
                    uVar.k1();
                }
            }).j(new m(0, this)).y(new n(0, new b()), new o(0, new c()), cVar2);
            return;
        }
        d7.e.f(f12, i12);
    }

    public abstract void m1(oj.d dVar);

    public abstract void n1(int i10);
}
