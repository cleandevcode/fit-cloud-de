package b5;

import b0.c;
import t4.x;

/* loaded from: classes.dex */
public final class b implements x<byte[]> {

    /* renamed from: a */
    public final byte[] f3998a;

    public b(byte[] bArr) {
        c.i(bArr);
        this.f3998a = bArr;
    }

    @Override // t4.x
    public final int b() {
        return this.f3998a.length;
    }

    @Override // t4.x
    public final void c() {
    }

    @Override // t4.x
    public final Class<byte[]> d() {
        return byte[].class;
    }

    @Override // t4.x
    public final byte[] get() {
        return this.f3998a;
    }
}
