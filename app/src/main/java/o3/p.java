package o3;

import s.c0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s */
    public static final String f22624s = f3.m.e("WorkSpec");

    /* renamed from: a */
    public String f22625a;

    /* renamed from: b */
    public f3.s f22626b;

    /* renamed from: c */
    public String f22627c;

    /* renamed from: d */
    public String f22628d;

    /* renamed from: e */
    public androidx.work.b f22629e;

    /* renamed from: f */
    public androidx.work.b f22630f;

    /* renamed from: g */
    public long f22631g;

    /* renamed from: h */
    public long f22632h;

    /* renamed from: i */
    public long f22633i;

    /* renamed from: j */
    public f3.c f22634j;

    /* renamed from: k */
    public int f22635k;

    /* renamed from: l */
    public int f22636l;

    /* renamed from: m */
    public long f22637m;

    /* renamed from: n */
    public long f22638n;

    /* renamed from: o */
    public long f22639o;

    /* renamed from: p */
    public long f22640p;

    /* renamed from: q */
    public boolean f22641q;

    /* renamed from: r */
    public int f22642r;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f22643a;

        /* renamed from: b */
        public f3.s f22644b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f22644b != aVar.f22644b) {
                    return false;
                }
                return this.f22643a.equals(aVar.f22643a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f22644b.hashCode() + (this.f22643a.hashCode() * 31);
        }
    }

    public p(String str, String str2) {
        this.f22626b = f3.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f3647c;
        this.f22629e = bVar;
        this.f22630f = bVar;
        this.f22634j = f3.c.f14065i;
        this.f22636l = 1;
        this.f22637m = 30000L;
        this.f22640p = -1L;
        this.f22642r = 1;
        this.f22625a = str;
        this.f22627c = str2;
    }

    public p(p pVar) {
        this.f22626b = f3.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f3647c;
        this.f22629e = bVar;
        this.f22630f = bVar;
        this.f22634j = f3.c.f14065i;
        this.f22636l = 1;
        this.f22637m = 30000L;
        this.f22640p = -1L;
        this.f22642r = 1;
        this.f22625a = pVar.f22625a;
        this.f22627c = pVar.f22627c;
        this.f22626b = pVar.f22626b;
        this.f22628d = pVar.f22628d;
        this.f22629e = new androidx.work.b(pVar.f22629e);
        this.f22630f = new androidx.work.b(pVar.f22630f);
        this.f22631g = pVar.f22631g;
        this.f22632h = pVar.f22632h;
        this.f22633i = pVar.f22633i;
        this.f22634j = new f3.c(pVar.f22634j);
        this.f22635k = pVar.f22635k;
        this.f22636l = pVar.f22636l;
        this.f22637m = pVar.f22637m;
        this.f22638n = pVar.f22638n;
        this.f22639o = pVar.f22639o;
        this.f22640p = pVar.f22640p;
        this.f22641q = pVar.f22641q;
        this.f22642r = pVar.f22642r;
    }

    public final long a() {
        boolean z10;
        long j10;
        long j11;
        long scalb;
        boolean z11 = false;
        if (this.f22626b == f3.s.ENQUEUED && this.f22635k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f22636l == 2) {
                z11 = true;
            }
            long j12 = this.f22637m;
            if (z11) {
                scalb = j12 * this.f22635k;
            } else {
                scalb = Math.scalb((float) j12, this.f22635k - 1);
            }
            j11 = this.f22638n;
            j10 = Math.min(18000000L, scalb);
        } else {
            long j13 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j14 = this.f22638n;
                int i10 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
                if (i10 == 0) {
                    j14 = this.f22631g + currentTimeMillis;
                }
                long j15 = this.f22633i;
                long j16 = this.f22632h;
                if (j15 != j16) {
                    z11 = true;
                }
                if (z11) {
                    if (i10 == 0) {
                        j13 = j15 * (-1);
                    }
                    return j14 + j16 + j13;
                }
                if (i10 != 0) {
                    j13 = j16;
                }
                return j14 + j13;
            }
            j10 = this.f22638n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            j11 = this.f22631g;
        }
        return j10 + j11;
    }

    public final boolean b() {
        return !f3.c.f14065i.equals(this.f22634j);
    }

    public final boolean c() {
        return this.f22632h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f22631g == pVar.f22631g && this.f22632h == pVar.f22632h && this.f22633i == pVar.f22633i && this.f22635k == pVar.f22635k && this.f22637m == pVar.f22637m && this.f22638n == pVar.f22638n && this.f22639o == pVar.f22639o && this.f22640p == pVar.f22640p && this.f22641q == pVar.f22641q && this.f22625a.equals(pVar.f22625a) && this.f22626b == pVar.f22626b && this.f22627c.equals(pVar.f22627c)) {
            String str = this.f22628d;
            if (str == null ? pVar.f22628d == null : str.equals(pVar.f22628d)) {
                return this.f22629e.equals(pVar.f22629e) && this.f22630f.equals(pVar.f22630f) && this.f22634j.equals(pVar.f22634j) && this.f22636l == pVar.f22636l && this.f22642r == pVar.f22642r;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f22626b.hashCode();
        int a10 = i2.t.a(this.f22627c, (hashCode + (this.f22625a.hashCode() * 31)) * 31, 31);
        String str = this.f22628d;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f22629e.hashCode();
        int hashCode3 = this.f22630f.hashCode();
        long j10 = this.f22631g;
        long j11 = this.f22632h;
        long j12 = this.f22633i;
        int hashCode4 = this.f22634j.hashCode();
        int b10 = c0.b(this.f22636l);
        long j13 = this.f22637m;
        long j14 = this.f22638n;
        long j15 = this.f22639o;
        long j16 = this.f22640p;
        return c0.b(this.f22642r) + ((((((((((((b10 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((a10 + i10) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f22635k) * 31)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f22641q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return androidx.activity.e.b(android.support.v4.media.d.a("{WorkSpec: "), this.f22625a, "}");
    }
}
