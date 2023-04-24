package b0;

import a0.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d */
    public static final Charset f3942d = StandardCharsets.US_ASCII;

    /* renamed from: e */
    public static final String[] f3943e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f */
    public static final int[] f3944f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a */
    public final int f3945a;

    /* renamed from: b */
    public final int f3946b;

    /* renamed from: c */
    public final byte[] f3947c;

    public i(byte[] bArr, int i10, int i11) {
        this.f3945a = i10;
        this.f3946b = i11;
        this.f3947c = bArr;
    }

    public static i a(long j10, ByteOrder byteOrder) {
        return b(new long[]{j10}, byteOrder);
    }

    public static i b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f3944f[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new i(wrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("(");
        a10.append(f3943e[this.f3945a]);
        a10.append(", data length:");
        return q.b(a10, this.f3947c.length, ")");
    }
}
