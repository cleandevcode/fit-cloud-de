package t4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class z implements r4.f {

    /* renamed from: j */
    public static final m5.i<Class<?>, byte[]> f27759j = new m5.i<>(50);

    /* renamed from: b */
    public final u4.b f27760b;

    /* renamed from: c */
    public final r4.f f27761c;

    /* renamed from: d */
    public final r4.f f27762d;

    /* renamed from: e */
    public final int f27763e;

    /* renamed from: f */
    public final int f27764f;

    /* renamed from: g */
    public final Class<?> f27765g;

    /* renamed from: h */
    public final r4.h f27766h;

    /* renamed from: i */
    public final r4.l<?> f27767i;

    public z(u4.b bVar, r4.f fVar, r4.f fVar2, int i10, int i11, r4.l<?> lVar, Class<?> cls, r4.h hVar) {
        this.f27760b = bVar;
        this.f27761c = fVar;
        this.f27762d = fVar2;
        this.f27763e = i10;
        this.f27764f = i11;
        this.f27767i = lVar;
        this.f27765g = cls;
        this.f27766h = hVar;
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f27760b.d();
        ByteBuffer.wrap(bArr).putInt(this.f27763e).putInt(this.f27764f).array();
        this.f27762d.a(messageDigest);
        this.f27761c.a(messageDigest);
        messageDigest.update(bArr);
        r4.l<?> lVar = this.f27767i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f27766h.a(messageDigest);
        m5.i<Class<?>, byte[]> iVar = f27759j;
        byte[] a10 = iVar.a(this.f27765g);
        if (a10 == null) {
            a10 = this.f27765g.getName().getBytes(r4.f.f25212a);
            iVar.d(this.f27765g, a10);
        }
        messageDigest.update(a10);
        this.f27760b.put(bArr);
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f27764f == zVar.f27764f && this.f27763e == zVar.f27763e && m5.l.b(this.f27767i, zVar.f27767i) && this.f27765g.equals(zVar.f27765g) && this.f27761c.equals(zVar.f27761c) && this.f27762d.equals(zVar.f27762d) && this.f27766h.equals(zVar.f27766h);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        int hashCode = ((((this.f27762d.hashCode() + (this.f27761c.hashCode() * 31)) * 31) + this.f27763e) * 31) + this.f27764f;
        r4.l<?> lVar = this.f27767i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.f27765g.hashCode();
        return this.f27766h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ResourceCacheKey{sourceKey=");
        a10.append(this.f27761c);
        a10.append(", signature=");
        a10.append(this.f27762d);
        a10.append(", width=");
        a10.append(this.f27763e);
        a10.append(", height=");
        a10.append(this.f27764f);
        a10.append(", decodedResourceClass=");
        a10.append(this.f27765g);
        a10.append(", transformation='");
        a10.append(this.f27767i);
        a10.append('\'');
        a10.append(", options=");
        a10.append(this.f27766h);
        a10.append('}');
        return a10.toString();
    }
}
