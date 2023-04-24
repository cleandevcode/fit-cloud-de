package zj;

import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class h extends k<oj.g> {

    /* renamed from: c */
    public final GregorianCalendar f32493c = new GregorianCalendar();

    /* renamed from: d */
    public final int f32494d = 5;

    @Override // zj.k
    public final int a() {
        return this.f32494d;
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        int i10;
        long e10 = xj.a.e(bArr, 0, this.f32493c);
        if (e10 <= this.f32505a && (i10 = bArr[4] & 255) > 0 && i10 < 256) {
            this.f32506b.add(new oj.g(i10, e10));
        }
    }
}
