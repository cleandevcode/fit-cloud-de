package um;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class d<T> extends s {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28895a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = c.f28892a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // um.s
    public final d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // um.s
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.f28892a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t10, Object obj);

    public final Object e(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        x xVar = c.f28892a;
        if (obj2 != xVar) {
            return obj2;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28895a;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, obj)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        return z10 ? obj : this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != c.f28892a;
    }

    public abstract Object i(T t10);
}
