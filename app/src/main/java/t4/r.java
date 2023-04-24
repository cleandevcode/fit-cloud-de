package t4;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements r4.f {

    /* renamed from: b */
    public final Object f27717b;

    /* renamed from: c */
    public final int f27718c;

    /* renamed from: d */
    public final int f27719d;

    /* renamed from: e */
    public final Class<?> f27720e;

    /* renamed from: f */
    public final Class<?> f27721f;

    /* renamed from: g */
    public final r4.f f27722g;

    /* renamed from: h */
    public final Map<Class<?>, r4.l<?>> f27723h;

    /* renamed from: i */
    public final r4.h f27724i;

    /* renamed from: j */
    public int f27725j;

    public r(Object obj, r4.f fVar, int i10, int i11, m5.b bVar, Class cls, Class cls2, r4.h hVar) {
        b0.c.i(obj);
        this.f27717b = obj;
        if (fVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f27722g = fVar;
        this.f27718c = i10;
        this.f27719d = i11;
        b0.c.i(bVar);
        this.f27723h = bVar;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.f27720e = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f27721f = cls2;
        b0.c.i(hVar);
        this.f27724i = hVar;
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f27717b.equals(rVar.f27717b) && this.f27722g.equals(rVar.f27722g) && this.f27719d == rVar.f27719d && this.f27718c == rVar.f27718c && this.f27723h.equals(rVar.f27723h) && this.f27720e.equals(rVar.f27720e) && this.f27721f.equals(rVar.f27721f) && this.f27724i.equals(rVar.f27724i);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        if (this.f27725j == 0) {
            int hashCode = this.f27717b.hashCode();
            this.f27725j = hashCode;
            int hashCode2 = ((((this.f27722g.hashCode() + (hashCode * 31)) * 31) + this.f27718c) * 31) + this.f27719d;
            this.f27725j = hashCode2;
            int hashCode3 = this.f27723h.hashCode() + (hashCode2 * 31);
            this.f27725j = hashCode3;
            int hashCode4 = this.f27720e.hashCode() + (hashCode3 * 31);
            this.f27725j = hashCode4;
            int hashCode5 = this.f27721f.hashCode() + (hashCode4 * 31);
            this.f27725j = hashCode5;
            this.f27725j = this.f27724i.hashCode() + (hashCode5 * 31);
        }
        return this.f27725j;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EngineKey{model=");
        a10.append(this.f27717b);
        a10.append(", width=");
        a10.append(this.f27718c);
        a10.append(", height=");
        a10.append(this.f27719d);
        a10.append(", resourceClass=");
        a10.append(this.f27720e);
        a10.append(", transcodeClass=");
        a10.append(this.f27721f);
        a10.append(", signature=");
        a10.append(this.f27722g);
        a10.append(", hashCode=");
        a10.append(this.f27725j);
        a10.append(", transformations=");
        a10.append(this.f27723h);
        a10.append(", options=");
        a10.append(this.f27724i);
        a10.append('}');
        return a10.toString();
    }
}
