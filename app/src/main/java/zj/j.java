package zj;

import oj.n;

/* loaded from: classes2.dex */
public final class j extends k<n> {

    /* renamed from: c */
    public final boolean f32503c;

    /* renamed from: d */
    public final int f32504d;

    public j(boolean z10) {
        this.f32503c = z10;
        this.f32504d = z10 ? 6 : 2;
    }

    @Override // zj.k
    public final int a() {
        return this.f32504d;
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        int i10;
        if (j10 > this.f32505a) {
            return;
        }
        int i11 = 0;
        int i12 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        if (i12 > 0 && i12 <= 3000) {
            if (this.f32503c) {
                i11 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                i10 = (bArr[5] & 255) | ((bArr[4] & 255) << 8);
            } else {
                i10 = 0;
            }
            this.f32506b.add(new n(j10, i12, i11 / 100000.0f, i10 / 1000.0f));
        }
    }
}
