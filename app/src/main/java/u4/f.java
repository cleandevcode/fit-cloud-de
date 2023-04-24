package u4;

/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // u4.a
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // u4.a
    public final int b() {
        return 1;
    }

    @Override // u4.a
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // u4.a
    public final byte[] newArray(int i10) {
        return new byte[i10];
    }
}
