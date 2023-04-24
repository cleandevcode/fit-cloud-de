package z;

import z.d;

/* loaded from: classes.dex */
public final class a extends d.a {

    /* renamed from: a */
    public final e f31824a;

    /* renamed from: b */
    public final androidx.camera.core.j f31825b;

    public a(e eVar, androidx.camera.core.j jVar) {
        if (eVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f31824a = eVar;
        if (jVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f31825b = jVar;
    }

    @Override // z.d.a
    public final androidx.camera.core.j a() {
        return this.f31825b;
    }

    @Override // z.d.a
    public final e b() {
        return this.f31824a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            return this.f31824a.equals(aVar.b()) && this.f31825b.equals(aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f31824a.hashCode() ^ 1000003) * 1000003) ^ this.f31825b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("InputPacket{processingRequest=");
        a10.append(this.f31824a);
        a10.append(", imageProxy=");
        a10.append(this.f31825b);
        a10.append("}");
        return a10.toString();
    }
}
