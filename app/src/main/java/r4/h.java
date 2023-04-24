package r4;

import java.security.MessageDigest;
import r4.g;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b */
    public final m5.b f25218b = new m5.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            m5.b bVar = this.f25218b;
            if (i10 < bVar.f22552c) {
                g gVar = (g) bVar.i(i10);
                V m10 = this.f25218b.m(i10);
                g.b<T> bVar2 = gVar.f25215b;
                if (gVar.f25217d == null) {
                    gVar.f25217d = gVar.f25216c.getBytes(f.f25212a);
                }
                bVar2.a(gVar.f25217d, m10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        if (this.f25218b.containsKey(gVar)) {
            return (T) this.f25218b.getOrDefault(gVar, null);
        }
        return gVar.f25214a;
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f25218b.equals(((h) obj).f25218b);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        return this.f25218b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Options{values=");
        a10.append(this.f25218b);
        a10.append('}');
        return a10.toString();
    }
}
