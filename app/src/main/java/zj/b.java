package zj;

import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class b extends k<oj.b> {

    /* renamed from: c */
    public final boolean f32477c;

    /* renamed from: d */
    public final GregorianCalendar f32478d = new GregorianCalendar();

    /* renamed from: e */
    public final int f32479e;

    public b(boolean z10) {
        this.f32477c = z10;
        this.f32479e = z10 ? 7 : 6;
    }

    @Override // zj.k
    public final int a() {
        return this.f32479e;
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        long e10 = xj.a.e(bArr, 0, this.f32478d);
        if (e10 > this.f32505a) {
            return;
        }
        int i10 = bArr[4] & 255;
        int i11 = bArr[5] & 255;
        if (i10 > 0 && i11 > 0) {
            if (this.f32477c) {
                byte b10 = bArr[6];
            }
            this.f32506b.add(new oj.b(i10, i11, e10));
        }
    }
}
