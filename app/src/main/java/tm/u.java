package tm;

import rm.z;

/* loaded from: classes2.dex */
public final class u<T> implements sm.g<T> {

    /* renamed from: a */
    public final z<T> f28371a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(z<? super T> zVar) {
        this.f28371a = zVar;
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        Object d10 = this.f28371a.d(t10, dVar);
        return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : tl.l.f28297a;
    }
}
