package i2;

import i2.v;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public final boolean f16231a;

    /* renamed from: b */
    public final boolean f16232b;

    /* renamed from: c */
    public final int f16233c;

    /* renamed from: d */
    public final boolean f16234d;

    /* renamed from: e */
    public final boolean f16235e;

    /* renamed from: f */
    public final int f16236f;

    /* renamed from: g */
    public final int f16237g;

    /* renamed from: h */
    public final int f16238h;

    /* renamed from: i */
    public final int f16239i;

    /* renamed from: j */
    public String f16240j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f16241a;

        /* renamed from: b */
        public boolean f16242b;

        /* renamed from: d */
        public String f16244d;

        /* renamed from: e */
        public boolean f16245e;

        /* renamed from: f */
        public boolean f16246f;

        /* renamed from: c */
        public int f16243c = -1;

        /* renamed from: g */
        public int f16247g = -1;

        /* renamed from: h */
        public int f16248h = -1;

        /* renamed from: i */
        public int f16249i = -1;

        /* renamed from: j */
        public int f16250j = -1;

        public final b0 a() {
            b0 b0Var;
            String str = this.f16244d;
            if (str != null) {
                boolean z10 = this.f16241a;
                boolean z11 = this.f16242b;
                boolean z12 = this.f16245e;
                boolean z13 = this.f16246f;
                int i10 = this.f16247g;
                int i11 = this.f16248h;
                int i12 = this.f16249i;
                int i13 = this.f16250j;
                int i14 = v.f16402j;
                b0Var = new b0(z10, z11, v.a.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
                b0Var.f16240j = str;
            } else {
                b0Var = new b0(this.f16241a, this.f16242b, this.f16243c, this.f16245e, this.f16246f, this.f16247g, this.f16248h, this.f16249i, this.f16250j);
            }
            return b0Var;
        }

        public final void b(int i10, boolean z10) {
            this.f16243c = i10;
            this.f16244d = null;
            this.f16245e = false;
            this.f16246f = z10;
        }
    }

    public b0(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f16231a = z10;
        this.f16232b = z11;
        this.f16233c = i10;
        this.f16234d = z12;
        this.f16235e = z13;
        this.f16236f = i11;
        this.f16237g = i12;
        this.f16238h = i13;
        this.f16239i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !gm.l.a(b0.class, obj.getClass())) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f16231a == b0Var.f16231a && this.f16232b == b0Var.f16232b && this.f16233c == b0Var.f16233c && gm.l.a(this.f16240j, b0Var.f16240j) && this.f16234d == b0Var.f16234d && this.f16235e == b0Var.f16235e && this.f16236f == b0Var.f16236f && this.f16237g == b0Var.f16237g && this.f16238h == b0Var.f16238h && this.f16239i == b0Var.f16239i;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((this.f16231a ? 1 : 0) * 31) + (this.f16232b ? 1 : 0)) * 31) + this.f16233c) * 31;
        String str = this.f16240j;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((((((i11 + i10) * 31) + (this.f16234d ? 1 : 0)) * 31) + (this.f16235e ? 1 : 0)) * 31) + this.f16236f) * 31) + this.f16237g) * 31) + this.f16238h) * 31) + this.f16239i;
    }
}
