package jm;

import gm.l;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a */
    public static final a f17996a = new a();

    /* renamed from: b */
    public static final c f17997b = am.b.f631a.b();

    /* loaded from: classes2.dex */
    public static final class a extends c implements Serializable {

        /* renamed from: jm.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C0311a implements Serializable {

            /* renamed from: a */
            public static final C0311a f17998a = new C0311a();

            private final Object readResolve() {
                return c.f17996a;
            }
        }

        private final Object writeReplace() {
            return C0311a.f17998a;
        }

        @Override // jm.c
        public final int a(int i10) {
            return c.f17997b.a(i10);
        }

        @Override // jm.c
        public final int b() {
            return c.f17997b.b();
        }

        @Override // jm.c
        public final int c(int i10) {
            return c.f17997b.c(i10);
        }

        @Override // jm.c
        public final int d(int i10, int i11) {
            return c.f17997b.d(i10, i11);
        }
    }

    public abstract int a(int i10);

    public abstract int b();

    public abstract int c(int i10);

    public int d(int i10, int i11) {
        boolean z10;
        int b10;
        int i12;
        int i13;
        int b11;
        boolean z11;
        if (i11 > i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i14 = i11 - i10;
            if (i14 <= 0 && i14 != Integer.MIN_VALUE) {
                do {
                    b11 = b();
                    if (i10 <= b11 && b11 < i11) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                } while (!z11);
                return b11;
            }
            if (((-i14) & i14) == i14) {
                i13 = a(31 - Integer.numberOfLeadingZeros(i14));
            } else {
                do {
                    b10 = b() >>> 1;
                    i12 = b10 % i14;
                } while ((i14 - 1) + (b10 - i12) < 0);
                i13 = i12;
            }
            return i10 + i13;
        }
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        l.f(valueOf, "from");
        l.f(valueOf2, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
    }
}
