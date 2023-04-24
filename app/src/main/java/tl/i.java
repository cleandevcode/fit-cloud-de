package tl;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i<T> implements d<T>, Serializable {

    /* renamed from: a */
    public fm.a<? extends T> f28293a;

    /* renamed from: b */
    public volatile Object f28294b = j.f28296a;

    /* renamed from: c */
    public final Object f28295c = this;

    public i(fm.a aVar) {
        this.f28293a = aVar;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // tl.d
    public final T getValue() {
        T t10;
        T t11 = (T) this.f28294b;
        j jVar = j.f28296a;
        if (t11 != jVar) {
            return t11;
        }
        synchronized (this.f28295c) {
            t10 = (T) this.f28294b;
            if (t10 == jVar) {
                fm.a<? extends T> aVar = this.f28293a;
                gm.l.c(aVar);
                t10 = aVar.m();
                this.f28294b = t10;
                this.f28293a = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z10;
        if (this.f28294b != j.f28296a) {
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
