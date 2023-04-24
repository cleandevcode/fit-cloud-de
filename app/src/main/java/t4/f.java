package t4;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements r4.f {

    /* renamed from: b */
    public final r4.f f27594b;

    /* renamed from: c */
    public final r4.f f27595c;

    public f(r4.f fVar, r4.f fVar2) {
        this.f27594b = fVar;
        this.f27595c = fVar2;
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        this.f27594b.a(messageDigest);
        this.f27595c.a(messageDigest);
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f27594b.equals(fVar.f27594b) && this.f27595c.equals(fVar.f27595c);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        return this.f27595c.hashCode() + (this.f27594b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DataCacheKey{sourceKey=");
        a10.append(this.f27594b);
        a10.append(", signature=");
        a10.append(this.f27595c);
        a10.append('}');
        return a10.toString();
    }
}
