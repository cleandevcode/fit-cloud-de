package y3;

import y3.b0;

/* loaded from: classes.dex */
public final class w0<S extends b0> {

    /* renamed from: a */
    public final S f31087a;

    /* renamed from: b */
    public a<S> f31088b;

    /* loaded from: classes.dex */
    public static final class a<S extends b0> {

        /* renamed from: a */
        public final S f31089a;

        /* renamed from: b */
        public final int f31090b;

        public a(S s10) {
            gm.l.f(s10, "state");
            this.f31089a = s10;
            this.f31090b = hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && gm.l.a(this.f31089a, ((a) obj).f31089a);
        }

        public final int hashCode() {
            return this.f31089a.hashCode();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("StateWrapper(state=");
            a10.append(this.f31089a);
            a10.append(')');
            return a10.toString();
        }
    }

    public w0(S s10) {
        gm.l.f(s10, "initialState");
        this.f31087a = s10;
        this.f31088b = new a<>(s10);
    }
}
