package sn;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public byte f27365a;

    /* renamed from: b */
    public boolean f27366b;

    /* renamed from: c */
    public byte[] f27367c;

    /* renamed from: d */
    public boolean f27368d;

    public c(byte b10, byte[] bArr) {
        this.f27368d = false;
        this.f27365a = b10;
        this.f27366b = true;
        this.f27367c = bArr;
    }

    public c(InputStream inputStream) {
        byte[] bArr;
        int i10 = 0;
        this.f27368d = false;
        byte read = (byte) inputStream.read();
        this.f27366b = (read & 128) != 0;
        byte b10 = (byte) (read & 15);
        this.f27365a = b10;
        int i11 = 2;
        if (b10 != 2) {
            if (b10 == 8) {
                this.f27368d = true;
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("Invalid Frame: Opcode: ");
            stringBuffer.append((int) this.f27365a);
            throw new IOException(stringBuffer.toString());
        }
        byte read2 = (byte) inputStream.read();
        boolean z10 = (read2 & 128) != 0;
        int i12 = (byte) (read2 & Byte.MAX_VALUE);
        if (i12 == 127) {
            i11 = 8;
        } else if (i12 != 126) {
            i11 = 0;
        }
        i12 = i11 > 0 ? 0 : i12;
        while (true) {
            i11--;
            if (i11 < 0) {
                break;
            }
            i12 |= (((byte) inputStream.read()) & 255) << (i11 * 8);
        }
        if (z10) {
            bArr = new byte[4];
            inputStream.read(bArr, 0, 4);
        } else {
            bArr = null;
        }
        this.f27367c = new byte[i12];
        int i13 = i12;
        int i14 = 0;
        while (i14 != i12) {
            int read3 = inputStream.read(this.f27367c, i14, i13);
            i14 += read3;
            i13 -= read3;
        }
        if (!z10) {
            return;
        }
        while (true) {
            byte[] bArr2 = this.f27367c;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i10 % 4]);
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4 A[LOOP:0: B:50:0x0097->B:54:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a() {
        /*
            r10 = this;
            byte[] r0 = r10.f27367c
            int r1 = r0.length
            int r1 = r1 + 6
            int r2 = r0.length
            r3 = 126(0x7e, float:1.77E-43)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 <= r4) goto L10
            int r1 = r1 + 8
            goto L15
        L10:
            int r0 = r0.length
            if (r0 < r3) goto L15
            int r1 = r1 + 2
        L15:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            byte r1 = r10.f27365a
            boolean r2 = r10.f27366b
            r5 = 0
            if (r2 == 0) goto L24
            r2 = 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            goto L25
        L24:
            r2 = 0
        L25:
            r1 = r1 & 15
            r1 = r1 | r2
            byte r1 = (byte) r1
            r0.put(r1)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 255(0xff, float:3.57E-43)
            int r6 = r1.nextInt(r2)
            int r7 = r1.nextInt(r2)
            int r8 = r1.nextInt(r2)
            int r1 = r1.nextInt(r2)
            r9 = 4
            byte[] r9 = new byte[r9]
            byte r6 = (byte) r6
            r9[r5] = r6
            byte r6 = (byte) r7
            r7 = 1
            r9[r7] = r6
            byte r6 = (byte) r8
            r7 = 2
            r9[r7] = r6
            byte r1 = (byte) r1
            r6 = 3
            r9[r6] = r1
            byte[] r1 = r10.f27367c
            int r1 = r1.length
            if (r1 < 0) goto Lb4
            if (r1 <= r4) goto L7f
            r3 = -1
            byte r3 = (byte) r3
            r0.put(r3)
            r0.put(r5)
            r0.put(r5)
            r0.put(r5)
            r0.put(r5)
            int r3 = r1 >> 24
            r3 = r3 & r2
            byte r3 = (byte) r3
            r0.put(r3)
            int r3 = r1 >> 16
            r3 = r3 & r2
            byte r3 = (byte) r3
            r0.put(r3)
            int r3 = r1 >> 8
            r3 = r3 & r2
            goto L88
        L7f:
            if (r1 < r3) goto L8e
            r3 = -2
            byte r3 = (byte) r3
            r0.put(r3)
            int r3 = r1 >> 8
        L88:
            byte r3 = (byte) r3
            r0.put(r3)
            r1 = r1 & r2
            goto L90
        L8e:
            r1 = r1 | (-128(0xffffffffffffff80, float:NaN))
        L90:
            byte r1 = (byte) r1
            r0.put(r1)
            r0.put(r9)
        L97:
            byte[] r1 = r10.f27367c
            int r2 = r1.length
            if (r5 < r2) goto La4
            r0.flip()
            byte[] r0 = r0.array()
            return r0
        La4:
            r2 = r1[r5]
            int r3 = r5 % 4
            r3 = r9[r3]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r1[r5] = r2
            r0.put(r2)
            int r5 = r5 + 1
            goto L97
        Lb4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Length cannot be negative"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.c.a():byte[]");
    }
}
