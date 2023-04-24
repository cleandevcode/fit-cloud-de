package l2;

import androidx.recyclerview.widget.q;

/* loaded from: classes.dex */
public final class z0 extends q.b {

    /* renamed from: a */
    public final /* synthetic */ y0<Object> f19379a;

    /* renamed from: b */
    public final /* synthetic */ y0<Object> f19380b;

    /* renamed from: c */
    public final /* synthetic */ q.e<Object> f19381c;

    /* renamed from: d */
    public final /* synthetic */ int f19382d;

    /* renamed from: e */
    public final /* synthetic */ int f19383e;

    public z0(y0<Object> y0Var, y0<Object> y0Var2, q.e<Object> eVar, int i10, int i11) {
        this.f19379a = y0Var;
        this.f19380b = y0Var2;
        this.f19381c = eVar;
        this.f19382d = i10;
        this.f19383e = i11;
    }

    @Override // androidx.recyclerview.widget.q.b
    public final boolean a(int i10, int i11) {
        Object f10 = this.f19379a.f(i10);
        Object f11 = this.f19380b.f(i11);
        if (f10 == f11) {
            return true;
        }
        return this.f19381c.a(f10, f11);
    }

    @Override // androidx.recyclerview.widget.q.b
    public final boolean b(int i10, int i11) {
        Object f10 = this.f19379a.f(i10);
        Object f11 = this.f19380b.f(i11);
        if (f10 == f11) {
            return true;
        }
        return this.f19381c.b(f10, f11);
    }

    @Override // androidx.recyclerview.widget.q.b
    public final Object c(int i10, int i11) {
        if (this.f19379a.f(i10) == this.f19380b.f(i11)) {
            return Boolean.TRUE;
        }
        this.f19381c.getClass();
        return null;
    }
}
