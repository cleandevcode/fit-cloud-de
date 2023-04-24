package u6;

import u6.o;

/* loaded from: classes.dex */
public final class y<S extends o> {

    /* renamed from: a */
    public final S f28632a;

    /* renamed from: b */
    public a<S> f28633b;

    /* loaded from: classes.dex */
    public static final class a<S extends o> {

        /* renamed from: a */
        public final S f28634a;

        /* renamed from: b */
        public final int f28635b;

        public a(S s10) {
            gm.l.f(s10, "state");
            this.f28634a = s10;
            this.f28635b = hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && gm.l.a(this.f28634a, ((a) obj).f28634a);
        }

        public final int hashCode() {
            return this.f28634a.hashCode();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("StateWrapper(state=");
            a10.append(this.f28634a);
            a10.append(')');
            return a10.toString();
        }
    }

    public y(S s10) {
        gm.l.f(s10, "initialState");
        this.f28632a = s10;
        this.f28633b = new a<>(s10);
    }
}
