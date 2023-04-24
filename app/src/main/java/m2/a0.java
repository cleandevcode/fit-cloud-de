package m2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a */
    public final t f20155a;

    /* renamed from: b */
    public final AtomicBoolean f20156b;

    /* renamed from: c */
    public final tl.i f20157c;

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.a<r2.f> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(0);
            a0.this = r1;
        }

        @Override // fm.a
        public final r2.f m() {
            a0 a0Var = a0.this;
            return a0Var.f20155a.d(a0Var.b());
        }
    }

    public a0(t tVar) {
        gm.l.f(tVar, "database");
        this.f20155a = tVar;
        this.f20156b = new AtomicBoolean(false);
        this.f20157c = new tl.i(new a());
    }

    public final r2.f a() {
        this.f20155a.a();
        if (this.f20156b.compareAndSet(false, true)) {
            return (r2.f) this.f20157c.getValue();
        }
        return this.f20155a.d(b());
    }

    public abstract String b();

    public final void c(r2.f fVar) {
        gm.l.f(fVar, "statement");
        if (fVar == ((r2.f) this.f20157c.getValue())) {
            this.f20156b.set(false);
        }
    }
}
