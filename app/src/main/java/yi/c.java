package yi;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: d */
    public static final a f31771d = new a();

    /* renamed from: a */
    public final int f31772a;

    /* renamed from: b */
    public final int f31773b;

    /* renamed from: c */
    public final String f31774c;

    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(int i10) {
            return new c(1, i10, null, null);
        }

        public static c b(int i10, Throwable th2, int i11) {
            if ((i11 & 1) != 0) {
                i10 = Integer.MAX_VALUE;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            return new c(2, i10, null, th2);
        }

        public static c c(a aVar, int i10, Throwable th2, int i11) {
            if ((i11 & 1) != 0) {
                i10 = Integer.MAX_VALUE;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            return new c(3, i10, null, th2);
        }

        public static c d(a aVar, int i10, int i11) {
            if ((i11 & 1) != 0) {
                i10 = Integer.MAX_VALUE;
            }
            return new c(5, i10, null, null);
        }
    }

    public c(int i10, int i11, String str, Throwable th2) {
        super(th2);
        this.f31772a = i10;
        this.f31773b = i11;
        this.f31774c = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("errorType:");
        a10.append(this.f31772a);
        a10.append(" errorCode:");
        a10.append(this.f31773b);
        a10.append(" errorMessage:");
        a10.append(this.f31774c);
        return a10.toString();
    }
}
