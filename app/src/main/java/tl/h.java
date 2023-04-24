package tl;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class h<T> implements d<T>, Serializable {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater<h<?>, Object> f28290c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b");

    /* renamed from: a */
    public volatile fm.a<? extends T> f28291a;

    /* renamed from: b */
    public volatile Object f28292b = j.f28296a;

    public h(fm.a<? extends T> aVar) {
        this.f28291a = aVar;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // tl.d
    public final T getValue() {
        boolean z10;
        T t10 = (T) this.f28292b;
        j jVar = j.f28296a;
        if (t10 != jVar) {
            return t10;
        }
        fm.a<? extends T> aVar = this.f28291a;
        if (aVar != null) {
            T m10 = aVar.m();
            AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f28290c;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, m10)) {
                    if (atomicReferenceFieldUpdater.get(this) != jVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.f28291a = null;
                return m10;
            }
        }
        return (T) this.f28292b;
    }

    public final String toString() {
        boolean z10;
        if (this.f28292b != j.f28296a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
