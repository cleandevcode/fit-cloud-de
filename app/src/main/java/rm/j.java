package rm;

/* loaded from: classes2.dex */
public final class j<T> {

    /* renamed from: b */
    public static final b f25849b = new b();

    /* renamed from: a */
    public final Object f25850a;

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a */
        public final Throwable f25851a;

        public a(Throwable th2) {
            this.f25851a = th2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && gm.l.a(this.f25851a, ((a) obj).f25851a);
        }

        public final int hashCode() {
            Throwable th2 = this.f25851a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // rm.j.b
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Closed(");
            a10.append(this.f25851a);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ j(Object obj) {
        this.f25850a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T a(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public static final void b(Object obj) {
        Throwable th2;
        if (obj instanceof b) {
            if ((obj instanceof a) && (th2 = ((a) obj).f25851a) != null) {
                throw th2;
            }
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f25850a;
        if (!(obj instanceof j) || !gm.l.a(obj2, ((j) obj).f25850a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f25850a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f25850a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
