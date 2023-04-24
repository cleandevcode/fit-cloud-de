package tl;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g<T> implements Serializable {

    /* renamed from: a */
    public final Object f28288a;

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: a */
        public final Throwable f28289a;

        public a(Throwable th2) {
            gm.l.f(th2, "exception");
            this.f28289a = th2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && gm.l.a(this.f28289a, ((a) obj).f28289a);
        }

        public final int hashCode() {
            return this.f28289a.hashCode();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Failure(");
            a10.append(this.f28289a);
            a10.append(')');
            return a10.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f28289a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f28288a;
        if (!(obj instanceof g) || !gm.l.a(obj2, ((g) obj).f28288a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f28288a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f28288a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
