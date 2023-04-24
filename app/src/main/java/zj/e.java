package zj;

import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class e extends k<oj.e> {

    /* renamed from: c */
    public final GregorianCalendar f32486c = new GregorianCalendar();

    /* renamed from: d */
    public final int f32487d = 5;

    @Override // zj.k
    public final int a() {
        return this.f32487d;
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        int i10;
        long e10 = xj.a.e(bArr, 0, this.f32486c);
        if (e10 > this.f32505a || (i10 = bArr[4] & 255) <= 0) {
            return;
        }
        this.f32506b.add(new oj.e(i10, e10));
    }
}
