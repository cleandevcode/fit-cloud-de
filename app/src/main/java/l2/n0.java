package l2;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a */
    public final boolean f19105a;

    /* loaded from: classes.dex */
    public static final class a extends n0 {

        /* renamed from: b */
        public final Throwable f19106b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super(false);
            gm.l.f(th2, "error");
            this.f19106b = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f19105a == aVar.f19105a && gm.l.a(this.f19106b, aVar.f19106b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            if (this.f19105a) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return this.f19106b.hashCode() + i10;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Error(endOfPaginationReached=");
            a10.append(this.f19105a);
            a10.append(", error=");
            a10.append(this.f19106b);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 {

        /* renamed from: b */
        public static final b f19107b = new b();

        public b() {
            super(false);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof b) && this.f19105a == ((b) obj).f19105a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f19105a ? 1231 : 1237;
        }

        public final String toString() {
            return o0.a(android.support.v4.media.d.a("Loading(endOfPaginationReached="), this.f19105a, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 {

        /* renamed from: b */
        public static final c f19108b = new c(true);

        /* renamed from: c */
        public static final c f19109c = new c(false);

        public c(boolean z10) {
            super(z10);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c) && this.f19105a == ((c) obj).f19105a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f19105a ? 1231 : 1237;
        }

        public final String toString() {
            return o0.a(android.support.v4.media.d.a("NotLoading(endOfPaginationReached="), this.f19105a, ')');
        }
    }

    public n0(boolean z10) {
        this.f19105a = z10;
    }
}
