package mf;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import mf.a;
import mf.t;

/* loaded from: classes.dex */
public final class c extends a.b {

    /* renamed from: h */
    public t<Object> f20512h;

    /* renamed from: i */
    public final /* synthetic */ Type[] f20513i;

    /* renamed from: j */
    public final /* synthetic */ Type f20514j;

    /* renamed from: k */
    public final /* synthetic */ Set f20515k;

    /* renamed from: l */
    public final /* synthetic */ Set f20516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Type type, Set set, Object obj, Method method, int i10, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i10, 1, z10);
        this.f20513i = typeArr;
        this.f20514j = type2;
        this.f20515k = set2;
        this.f20516l = set3;
    }

    @Override // mf.a.b
    public final void a(h0 h0Var, t.a aVar) {
        t<Object> c10;
        super.a(h0Var, aVar);
        if (l0.b(this.f20513i[0], this.f20514j) && this.f20515k.equals(this.f20516l)) {
            c10 = h0Var.d(aVar, this.f20514j, this.f20516l);
        } else {
            c10 = h0Var.c(this.f20514j, this.f20516l, null);
        }
        this.f20512h = c10;
    }

    @Override // mf.a.b
    public final void d(e0 e0Var, Object obj) {
        this.f20512h.f(e0Var, c(obj));
    }
}
