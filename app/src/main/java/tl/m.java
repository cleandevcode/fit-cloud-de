package tl;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m<T> implements d<T>, Serializable {

    /* renamed from: a */
    public fm.a<? extends T> f28298a;

    /* renamed from: b */
    public Object f28299b = j.f28296a;

    public m(fm.a<? extends T> aVar) {
        this.f28298a = aVar;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // tl.d
    public final T getValue() {
        if (this.f28299b == j.f28296a) {
            fm.a<? extends T> aVar = this.f28298a;
            gm.l.c(aVar);
            this.f28299b = aVar.m();
            this.f28298a = null;
        }
        return (T) this.f28299b;
    }

    public final String toString() {
        boolean z10;
        if (this.f28299b != j.f28296a) {
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
