package y;

import y.q;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a */
    public final q.b f30676a;

    /* renamed from: b */
    public final q.a f30677b;

    public d(q.b bVar, e eVar) {
        this.f30676a = bVar;
        this.f30677b = eVar;
    }

    @Override // y.q
    public final q.a a() {
        return this.f30677b;
    }

    @Override // y.q
    public final q.b b() {
        return this.f30676a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f30676a.equals(qVar.b())) {
                q.a aVar = this.f30677b;
                q.a a10 = qVar.a();
                if (aVar == null) {
                    if (a10 == null) {
                        return true;
                    }
                } else if (aVar.equals(a10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f30676a.hashCode() ^ 1000003) * 1000003;
        q.a aVar = this.f30677b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CameraState{type=");
        a10.append(this.f30676a);
        a10.append(", error=");
        a10.append(this.f30677b);
        a10.append("}");
        return a10.toString();
    }
}
