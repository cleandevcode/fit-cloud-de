package oc;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n0 implements l, m0, wk.d<Integer> {

    /* renamed from: a */
    public Integer f23016a;

    /* renamed from: b */
    public final fl.q0 f23017b;

    /* renamed from: c */
    public final uk.g f23018c = new uk.g();

    /* loaded from: classes.dex */
    public class a implements wk.f<Throwable> {
        @Override // wk.f
        public final boolean test(Throwable th2) {
            Throwable th3 = th2;
            if ((th3 instanceof lc.l) && ((lc.l) th3).f19425a == lc.m.f19434j) {
                return true;
            }
            return false;
        }
    }

    public n0(c1 c1Var, int i10) {
        this.f23017b = new fl.q0(c1Var.b(c1Var.f22954m).h(0L, TimeUnit.SECONDS, c1Var.f22942a), new a());
        this.f23016a = Integer.valueOf(i10);
    }

    @Override // oc.m0
    public final int a() {
        return this.f23016a.intValue();
    }

    @Override // wk.d
    public final void accept(Integer num) {
        this.f23016a = num;
    }

    @Override // oc.l
    public final void b() {
        this.f23018c.c();
    }

    @Override // oc.l
    public final void c() {
        uk.g gVar = this.f23018c;
        xk.b.g(gVar.f28842a, this.f23017b.y(this, yk.a.f31789d, yk.a.f31788c));
    }
}
