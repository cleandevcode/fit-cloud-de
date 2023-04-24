package ln;

import androidx.appcompat.widget.u0;
import bi.m0;
import bi.z0;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class h implements Serializable, Comparable<h> {

    /* renamed from: d */
    public static final h f20100d;

    /* renamed from: a */
    public transient int f20101a;

    /* renamed from: b */
    public transient String f20102b;

    /* renamed from: c */
    public final byte[] f20103c;

    /* loaded from: classes2.dex */
    public static final class a {
        public static h a(String str) {
            boolean z10;
            if (str.length() % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) (p001if.d.a(str.charAt(i11 + 1)) + (p001if.d.a(str.charAt(i11)) << 4));
                }
                return new h(bArr);
            }
            throw new IllegalArgumentException(a.b.b("Unexpected hex string: ", str).toString());
        }

        public static h b(String str) {
            gm.l.f(str, "$this$encodeUtf8");
            byte[] bytes = str.getBytes(om.a.f23623a);
            gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            h hVar = new h(bytes);
            hVar.f20102b = str;
            return hVar;
        }

        public static h c(byte[] bArr) {
            h hVar = h.f20100d;
            int length = bArr.length;
            m0.g(bArr.length, 0, length);
            int i10 = length + 0;
            z0.d(i10, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            gm.l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return new h(copyOfRange);
        }
    }

    static {
        new a();
        f20100d = new h(new byte[0]);
    }

    public h(byte[] bArr) {
        gm.l.f(bArr, "data");
        this.f20103c = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        boolean z10;
        int readInt = objectInputStream.readInt();
        int i10 = 0;
        if (readInt >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            byte[] bArr = new byte[readInt];
            while (i10 < readInt) {
                int read = objectInputStream.read(bArr, i10, readInt - i10);
                if (read != -1) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            h hVar = new h(bArr);
            Field declaredField = h.class.getDeclaredField("c");
            gm.l.e(declaredField, "field");
            declaredField.setAccessible(true);
            declaredField.set(this, hVar.f20103c);
            return;
        }
        throw new IllegalArgumentException(u0.a("byteCount < 0: ", readInt).toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f20103c.length);
        objectOutputStream.write(this.f20103c);
    }

    public String a() {
        byte[] bArr = this.f20103c;
        byte[] bArr2 = ln.a.f20086a;
        gm.l.f(bArr, "$this$encodeBase64");
        gm.l.f(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i18 = i10 + 1;
                byte b13 = bArr[i10];
                byte b14 = bArr[i18];
                int i19 = i11 + 1;
                bArr3[i11] = bArr2[(b13 & 255) >> 2];
                int i20 = i19 + 1;
                bArr3[i19] = bArr2[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr3[i20] = bArr2[(b14 & 15) << 2];
                bArr3[i20 + 1] = (byte) 61;
            }
        } else {
            byte b15 = bArr[i10];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[(b15 & 3) << 4];
            byte b16 = (byte) 61;
            bArr3[i22] = b16;
            bArr3[i22 + 1] = b16;
        }
        return new String(bArr3, om.a.f23623a);
    }

    public h c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f20103c, 0, d());
        byte[] digest = messageDigest.digest();
        gm.l.e(digest, "digestBytes");
        return new h(digest);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(ln.h r8) {
        /*
            r7 = this;
            ln.h r8 = (ln.h) r8
            java.lang.String r0 = "other"
            gm.l.f(r8, r0)
            int r0 = r7.d()
            int r1 = r8.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.g(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.g(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.h.compareTo(java.lang.Object):int");
    }

    public int d() {
        return this.f20103c.length;
    }

    public String e() {
        byte[] bArr = this.f20103c;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = p001if.d.f16806a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int d10 = hVar.d();
            byte[] bArr = this.f20103c;
            if (d10 == bArr.length && hVar.h(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f20103c;
    }

    public byte g(int i10) {
        return this.f20103c[i10];
    }

    public boolean h(int i10, int i11, int i12, byte[] bArr) {
        gm.l.f(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f20103c;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && m0.d(i10, i11, i12, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f20101a;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f20103c);
            this.f20101a = hashCode;
            return hashCode;
        }
        return i10;
    }

    public boolean i(h hVar, int i10) {
        gm.l.f(hVar, "other");
        return hVar.h(0, 0, i10, this.f20103c);
    }

    public h j() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f20103c;
            if (i10 < bArr.length) {
                byte b11 = bArr[i10];
                byte b12 = (byte) 65;
                if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    gm.l.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                    copyOf[i10] = (byte) (b11 + 32);
                    for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                        byte b13 = copyOf[i11];
                        if (b13 >= b12 && b13 <= b10) {
                            copyOf[i11] = (byte) (b13 + 32);
                        }
                    }
                    return new h(copyOf);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public final String k() {
        String str = this.f20102b;
        if (str == null) {
            byte[] f10 = f();
            gm.l.f(f10, "$this$toUtf8String");
            String str2 = new String(f10, om.a.f23623a);
            this.f20102b = str2;
            return str2;
        }
        return str;
    }

    public void l(e eVar, int i10) {
        gm.l.f(eVar, "buffer");
        eVar.m14write(this.f20103c, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x0086, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0095, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00a0, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x00e0, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x00f1, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0100, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0112, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x011b, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x015b, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x016c, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x017d, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x018c, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x01a2, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x01aa, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x01b1, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x01e8, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x01eb, code lost:
        r5 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.h.toString():java.lang.String");
    }
}
