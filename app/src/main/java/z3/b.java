package z3;

import fm.p;
import gm.m;
import i2.j;
import pm.k;
import y3.c0;
import y3.k0;
import y3.y0;

/* loaded from: classes.dex */
public final class b extends m implements fm.a<Object> {

    /* renamed from: b */
    public final /* synthetic */ Object f31945b;

    /* renamed from: c */
    public final /* synthetic */ int f31946c;

    /* renamed from: d */
    public final /* synthetic */ p<c0<Object, Object>, j, Object> f31947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Object obj, int i10, p<? super c0<Object, Object>, ? super j, Object> pVar) {
        super(0);
        this.f31945b = obj;
        this.f31946c = i10;
        this.f31947d = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.fragment.app.r, java.lang.Object] */
    @Override // fm.a
    public final Object m() {
        Object A = this.f31947d.A(new y0(), tb.a.f(this.f31945b).f(this.f31946c));
        ?? r12 = this.f31945b;
        k0 k0Var = (k0) A;
        k.a(k0Var, r12, new a(r12, null));
        return k0Var;
    }
}
