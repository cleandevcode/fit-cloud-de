package ph;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a */
    public final boolean f24247a;

    /* renamed from: b */
    public final vf.n f24248b;

    public x(boolean z10, vf.n nVar) {
        gm.l.f(nVar, "sleepRecord");
        this.f24247a = z10;
        this.f24248b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f24247a == xVar.f24247a && gm.l.a(this.f24248b, xVar.f24248b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z10 = this.f24247a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.f24248b.hashCode() + (r02 * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CombineIsConnectedSleepRecord(isConnected=");
        a10.append(this.f24247a);
        a10.append(", sleepRecord=");
        a10.append(this.f24248b);
        a10.append(')');
        return a10.toString();
    }
}
