package ld;

import android.support.v4.media.d;
import nd.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public byte f19447a;

    /* renamed from: b */
    public f f19448b;

    /* renamed from: c */
    public f f19449c;

    public b(byte b10) {
        this.f19447a = b10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0044, code lost:
        if (r0 >= 40) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0046, code lost:
        r1.get((byte[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0070, code lost:
        if (r0 >= 40) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ld.b a(byte[] r16) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.b.a(byte[]):ld.b");
    }

    public final String toString() {
        f fVar;
        StringBuilder a10 = d.a("FwVersionInfo{");
        a10.append(String.format("type=0x%02X", Byte.valueOf(this.f19447a)));
        byte b10 = this.f19447a;
        if (b10 != 0 && b10 != 1 && b10 != 2 && b10 != 3 && (b10 != 4 ? !(b10 != 5 || (fVar = this.f19449c) == null) : (fVar = this.f19448b) != null)) {
            a10.append(fVar.a());
        }
        a10.append("\n}");
        return a10.toString();
    }
}
