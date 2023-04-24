package ln;

import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class m implements y {

    /* renamed from: a */
    public int f20112a;

    /* renamed from: b */
    public boolean f20113b;

    /* renamed from: c */
    public final g f20114c;

    /* renamed from: d */
    public final Inflater f20115d;

    public m(s sVar, Inflater inflater) {
        this.f20114c = sVar;
        this.f20115d = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0097  */
    @Override // ln.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long V(ln.e r9, long r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.m.V(ln.e, long):long");
    }

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20113b) {
            return;
        }
        this.f20115d.end();
        this.f20113b = true;
        this.f20114c.close();
    }

    @Override // ln.y
    public final z e() {
        return this.f20114c.e();
    }
}
