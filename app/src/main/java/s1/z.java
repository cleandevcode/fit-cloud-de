package s1;

import java.util.LinkedHashSet;

@zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* loaded from: classes.dex */
public final class z extends zl.c {

    /* renamed from: d */
    public q f26522d;

    /* renamed from: e */
    public Object f26523e;

    /* renamed from: f */
    public Object f26524f;

    /* renamed from: g */
    public /* synthetic */ Object f26525g;

    /* renamed from: h */
    public final /* synthetic */ q<Object> f26526h;

    /* renamed from: i */
    public int f26527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q<Object> qVar, xl.d<? super z> dVar) {
        super(dVar);
        this.f26526h = qVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f26525g = obj;
        this.f26527i |= Integer.MIN_VALUE;
        q<Object> qVar = this.f26526h;
        LinkedHashSet linkedHashSet = q.f26437k;
        return qVar.i(this, null, null);
    }
}
