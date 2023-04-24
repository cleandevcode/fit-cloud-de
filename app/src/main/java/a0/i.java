package a0;

import android.util.Size;

/* loaded from: classes.dex */
public final class i extends c2 {

    /* renamed from: a */
    public final Size f105a;

    /* renamed from: b */
    public final Size f106b;

    /* renamed from: c */
    public final Size f107c;

    public i(Size size, Size size2, Size size3) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f105a = size;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f106b = size2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f107c = size3;
    }

    @Override // a0.c2
    public final Size a() {
        return this.f105a;
    }

    @Override // a0.c2
    public final Size b() {
        return this.f106b;
    }

    @Override // a0.c2
    public final Size c() {
        return this.f107c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            return this.f105a.equals(c2Var.a()) && this.f106b.equals(c2Var.b()) && this.f107c.equals(c2Var.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f105a.hashCode() ^ 1000003) * 1000003) ^ this.f106b.hashCode()) * 1000003) ^ this.f107c.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SurfaceSizeDefinition{analysisSize=");
        a10.append(this.f105a);
        a10.append(", previewSize=");
        a10.append(this.f106b);
        a10.append(", recordSize=");
        a10.append(this.f107c);
        a10.append("}");
        return a10.toString();
    }
}
