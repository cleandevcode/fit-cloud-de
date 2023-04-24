package f8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r extends q {

    /* renamed from: b */
    public final byte[] f14190b;

    public r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f14190b = bArr;
    }

    @Override // f8.q
    public final byte[] f0() {
        return this.f14190b;
    }
}
