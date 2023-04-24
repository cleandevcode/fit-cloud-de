package mf;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import mf.a;
import mf.t;

/* loaded from: classes.dex */
public final class e extends a.b {

    /* renamed from: h */
    public t<Object> f20523h;

    /* renamed from: i */
    public final /* synthetic */ Type[] f20524i;

    /* renamed from: j */
    public final /* synthetic */ Type f20525j;

    /* renamed from: k */
    public final /* synthetic */ Set f20526k;

    /* renamed from: l */
    public final /* synthetic */ Set f20527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Type type, Set set, Object obj, Method method, int i10, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i10, 1, z10);
        this.f20524i = typeArr;
        this.f20525j = type2;
        this.f20526k = set2;
        this.f20527l = set3;
    }

    @Override // mf.a.b
    public final void a(h0 h0Var, t.a aVar) {
        t<Object> c10;
        super.a(h0Var, aVar);
        if (l0.b(this.f20524i[0], this.f20525j) && this.f20526k.equals(this.f20527l)) {
            c10 = h0Var.d(aVar, this.f20524i[0], this.f20526k);
        } else {
            c10 = h0Var.c(this.f20524i[0], this.f20526k, null);
        }
        this.f20523h = c10;
    }

    @Override // mf.a.b
    public final Object b(y yVar) {
        return c(this.f20523h.b(yVar));
    }
}
