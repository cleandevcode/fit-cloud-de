package zj;

/* loaded from: classes2.dex */
public final class a extends k {

    /* renamed from: c */
    public final /* synthetic */ int f32475c;

    /* renamed from: d */
    public final int f32476d;

    public a(int i10) {
        this.f32475c = i10;
        if (i10 != 1) {
            this.f32476d = 2;
        } else {
            this.f32476d = 1;
        }
    }

    @Override // zj.k
    public final int a() {
        switch (this.f32475c) {
            case 0:
                return this.f32476d;
            default:
                return this.f32476d;
        }
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        int i10;
        switch (this.f32475c) {
            case 0:
                if (j10 <= this.f32505a) {
                    int i11 = bArr[0] & 255;
                    int i12 = bArr[1] & 255;
                    if (i11 > 0 && i12 > 0) {
                        this.f32506b.add(new oj.a(j10, i11, i12));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (j10 <= this.f32505a && (i10 = bArr[0] & 255) > 0 && i10 < 256) {
                    this.f32506b.add(new oj.g(i10, j10));
                    return;
                }
                return;
        }
    }
}
