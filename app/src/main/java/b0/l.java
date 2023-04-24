package b0;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l extends FilterOutputStream {

    /* renamed from: g */
    public static final byte[] f3962g = "Exif\u0000\u0000".getBytes(i.f3942d);

    /* renamed from: a */
    public final j f3963a;

    /* renamed from: b */
    public final byte[] f3964b;

    /* renamed from: c */
    public final ByteBuffer f3965c;

    /* renamed from: d */
    public int f3966d;

    /* renamed from: e */
    public int f3967e;

    /* renamed from: f */
    public int f3968f;

    public l(e0.b bVar, j jVar) {
        super(new BufferedOutputStream(bVar, 65536));
        this.f3964b = new byte[1];
        this.f3965c = ByteBuffer.allocate(4);
        this.f3966d = 0;
        this.f3963a = jVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.f3964b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
        if (r15 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x03ac, code lost:
        ((java.io.FilterOutputStream) r12).out.write(r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x03b1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l.write(byte[], int, int):void");
    }
}
