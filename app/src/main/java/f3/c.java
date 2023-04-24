package f3;

import android.os.Build;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i */
    public static final c f14065i = new c(new a());

    /* renamed from: a */
    public n f14066a;

    /* renamed from: b */
    public boolean f14067b;

    /* renamed from: c */
    public boolean f14068c;

    /* renamed from: d */
    public boolean f14069d;

    /* renamed from: e */
    public boolean f14070e;

    /* renamed from: f */
    public long f14071f;

    /* renamed from: g */
    public long f14072g;

    /* renamed from: h */
    public d f14073h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public n f14074a = n.NOT_REQUIRED;

        /* renamed from: b */
        public d f14075b = new d();
    }

    public c() {
        this.f14066a = n.NOT_REQUIRED;
        this.f14071f = -1L;
        this.f14072g = -1L;
        this.f14073h = new d();
    }

    public c(a aVar) {
        this.f14066a = n.NOT_REQUIRED;
        this.f14071f = -1L;
        this.f14072g = -1L;
        this.f14073h = new d();
        this.f14067b = false;
        int i10 = Build.VERSION.SDK_INT;
        this.f14068c = false;
        this.f14066a = aVar.f14074a;
        this.f14069d = false;
        this.f14070e = false;
        if (i10 >= 24) {
            this.f14073h = aVar.f14075b;
            this.f14071f = -1L;
            this.f14072g = -1L;
        }
    }

    public c(c cVar) {
        this.f14066a = n.NOT_REQUIRED;
        this.f14071f = -1L;
        this.f14072g = -1L;
        this.f14073h = new d();
        this.f14067b = cVar.f14067b;
        this.f14068c = cVar.f14068c;
        this.f14066a = cVar.f14066a;
        this.f14069d = cVar.f14069d;
        this.f14070e = cVar.f14070e;
        this.f14073h = cVar.f14073h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f14067b == cVar.f14067b && this.f14068c == cVar.f14068c && this.f14069d == cVar.f14069d && this.f14070e == cVar.f14070e && this.f14071f == cVar.f14071f && this.f14072g == cVar.f14072g && this.f14066a == cVar.f14066a) {
            return this.f14073h.equals(cVar.f14073h);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14071f;
        long j11 = this.f14072g;
        return this.f14073h.hashCode() + (((((((((((((this.f14066a.hashCode() * 31) + (this.f14067b ? 1 : 0)) * 31) + (this.f14068c ? 1 : 0)) * 31) + (this.f14069d ? 1 : 0)) * 31) + (this.f14070e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
