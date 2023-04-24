package l2;

/* loaded from: classes.dex */
public abstract class j3 {

    /* renamed from: a */
    public final int f19031a;

    /* renamed from: b */
    public final int f19032b;

    /* renamed from: c */
    public final int f19033c;

    /* renamed from: d */
    public final int f19034d;

    /* loaded from: classes.dex */
    public static final class a extends j3 {

        /* renamed from: e */
        public final int f19035e;

        /* renamed from: f */
        public final int f19036f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15);
            this.f19035e = i10;
            this.f19036f = i11;
        }

        @Override // l2.j3
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f19035e == aVar.f19035e && this.f19036f == aVar.f19036f && this.f19031a == aVar.f19031a && this.f19032b == aVar.f19032b && this.f19033c == aVar.f19033c && this.f19034d == aVar.f19034d) {
                return true;
            }
            return false;
        }

        @Override // l2.j3
        public final int hashCode() {
            return super.hashCode() + this.f19035e + this.f19036f;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ViewportHint.Access(\n            |    pageOffset=");
            a10.append(this.f19035e);
            a10.append(",\n            |    indexInPage=");
            a10.append(this.f19036f);
            a10.append(",\n            |    presentedItemsBefore=");
            a10.append(this.f19031a);
            a10.append(",\n            |    presentedItemsAfter=");
            a10.append(this.f19032b);
            a10.append(",\n            |    originalPageOffsetFirst=");
            a10.append(this.f19033c);
            a10.append(",\n            |    originalPageOffsetLast=");
            a10.append(this.f19034d);
            a10.append(",\n            |)");
            return om.d.R(a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j3 {
        public b(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ViewportHint.Initial(\n            |    presentedItemsBefore=");
            a10.append(this.f19031a);
            a10.append(",\n            |    presentedItemsAfter=");
            a10.append(this.f19032b);
            a10.append(",\n            |    originalPageOffsetFirst=");
            a10.append(this.f19033c);
            a10.append(",\n            |    originalPageOffsetLast=");
            a10.append(this.f19034d);
            a10.append(",\n            |)");
            return om.d.R(a10.toString());
        }
    }

    public j3(int i10, int i11, int i12, int i13) {
        this.f19031a = i10;
        this.f19032b = i11;
        this.f19033c = i12;
        this.f19034d = i13;
    }

    public final int a(r0 r0Var) {
        gm.l.f(r0Var, "loadType");
        int ordinal = r0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return this.f19032b;
                }
                throw new qa.p();
            }
            return this.f19031a;
        }
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            return this.f19031a == j3Var.f19031a && this.f19032b == j3Var.f19032b && this.f19033c == j3Var.f19033c && this.f19034d == j3Var.f19034d;
        }
        return false;
    }

    public int hashCode() {
        return this.f19031a + this.f19032b + this.f19033c + this.f19034d;
    }
}
