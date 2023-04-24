package wj;

/* loaded from: classes2.dex */
public final class w extends ti.c<tl.l> {

    /* renamed from: a */
    public volatile boolean f30018a = true;

    /* renamed from: b */
    public volatile int f30019b;

    /* renamed from: c */
    public volatile float f30020c;

    /* renamed from: d */
    public volatile float f30021d;

    @Override // ti.c
    public final bj.b d() {
        return null;
    }

    @Override // ti.c
    public final bj.b f() {
        boolean z10 = this.f30018a;
        int i10 = this.f30019b;
        byte[] bArr = new byte[4];
        int i11 = ((int) (this.f30020c * 10.0f)) / 5;
        int i12 = ((int) (this.f30021d * 10.0f)) / 5;
        bArr[0] = (byte) ((z10 ? 128 : 0) | i10);
        bArr[1] = (byte) (i11 >> 1);
        bArr[2] = (byte) ((i11 << 7) | (i12 >> 3));
        bArr[3] = (byte) (i12 << 5);
        return new bj.b((byte) 2, (byte) 5, bArr);
    }
}
