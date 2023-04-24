package s1;

@zl.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* loaded from: classes.dex */
public final class x extends zl.c {

    /* renamed from: d */
    public Object f26508d;

    /* renamed from: e */
    public q f26509e;

    /* renamed from: f */
    public pm.q f26510f;

    /* renamed from: g */
    public /* synthetic */ Object f26511g;

    /* renamed from: h */
    public final /* synthetic */ q<Object> f26512h;

    /* renamed from: i */
    public int f26513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q<Object> qVar, xl.d<? super x> dVar) {
        super(dVar);
        this.f26512h = qVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f26511g = obj;
        this.f26513i |= Integer.MIN_VALUE;
        return q.b(this.f26512h, null, this);
    }
}
