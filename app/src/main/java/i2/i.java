package i2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final d0<Object> f16286a;

    /* renamed from: b */
    public final boolean f16287b;

    /* renamed from: c */
    public final boolean f16288c;

    /* renamed from: d */
    public final Object f16289d;

    public i(d0<Object> d0Var, boolean z10, Object obj, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (!d0Var.f16268a && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            if (!z10 && z11 && obj == null) {
                z13 = false;
            }
            if (z13) {
                this.f16286a = d0Var;
                this.f16287b = z10;
                this.f16289d = obj;
                this.f16288c = z11;
                return;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Argument with type ");
            a10.append(d0Var.b());
            a10.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(a10.toString().toString());
        }
        throw new IllegalArgumentException((d0Var.b() + " does not allow nullable values").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !gm.l.a(i.class, obj.getClass())) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f16287b == iVar.f16287b && this.f16288c == iVar.f16288c && gm.l.a(this.f16286a, iVar.f16286a)) {
            Object obj2 = this.f16289d;
            Object obj3 = iVar.f16289d;
            return obj2 != null ? gm.l.a(obj2, obj3) : obj3 == null;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f16286a.hashCode() * 31) + (this.f16287b ? 1 : 0)) * 31) + (this.f16288c ? 1 : 0)) * 31;
        Object obj = this.f16289d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append(" Type: " + this.f16286a);
        sb2.append(" Nullable: " + this.f16287b);
        if (this.f16288c) {
            StringBuilder a10 = android.support.v4.media.d.a(" DefaultValue: ");
            a10.append(this.f16289d);
            sb2.append(a10.toString());
        }
        String sb3 = sb2.toString();
        gm.l.e(sb3, "sb.toString()");
        return sb3;
    }
}
