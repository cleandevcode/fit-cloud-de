package l2;

import l2.b1;

/* loaded from: classes.dex */
public final class b2<T> {

    /* renamed from: a */
    public final sm.f<b1<T>> f18755a;

    /* renamed from: b */
    public final h3 f18756b;

    /* loaded from: classes.dex */
    public static final class a implements h3 {
        @Override // l2.h3
        public final void a() {
        }

        @Override // l2.h3
        public final void b(j3 j3Var) {
        }

        @Override // l2.h3
        public final void c() {
        }
    }

    static {
        new b2(new sm.i(b1.b.f18732g), new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b2(sm.f<? extends b1<T>> fVar, h3 h3Var) {
        gm.l.f(fVar, "flow");
        gm.l.f(h3Var, "receiver");
        this.f18755a = fVar;
        this.f18756b = h3Var;
    }
}
