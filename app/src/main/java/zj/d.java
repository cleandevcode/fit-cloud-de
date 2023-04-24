package zj;

/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: c */
    public final /* synthetic */ int f32484c;

    /* renamed from: d */
    public final int f32485d;

    public d(int i10) {
        this.f32484c = i10;
        if (i10 != 1) {
            this.f32485d = 1;
        } else {
            this.f32485d = 2;
        }
    }

    @Override // zj.k
    public final int a() {
        switch (this.f32484c) {
            case 0:
                return this.f32485d;
            default:
                return this.f32485d;
        }
    }

    @Override // zj.k
    public final void b(long j10, byte[] bArr) {
        int i10;
        switch (this.f32484c) {
            case 0:
                if (j10 <= this.f32505a && (i10 = bArr[0] & 255) > 0) {
                    this.f32506b.add(new oj.e(i10, j10));
                    return;
                }
                return;
            default:
                this.f32506b.add(new qj.b((bArr[1] & 255) | ((bArr[0] & 255) << 8), j10));
                return;
        }
    }
}
