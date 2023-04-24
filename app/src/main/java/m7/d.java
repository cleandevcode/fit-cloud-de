package m7;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public final int f20410a;

    /* renamed from: b */
    public final int f20411b;

    /* renamed from: c */
    public final boolean f20412c;

    public d(int i10, int i11, boolean z10) {
        this.f20410a = i10;
        this.f20411b = i11;
        this.f20412c = z10;
        if (!(i10 <= i11)) {
            throw new IllegalStateException("min 不能大于 max".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f20410a == dVar.f20410a && this.f20411b == dVar.f20411b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20410a * 31) + this.f20411b;
    }
}
