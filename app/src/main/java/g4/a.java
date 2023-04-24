package g4;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final byte[] f14935a;

    /* renamed from: b */
    public final int[] f14936b;

    /* renamed from: c */
    public final String[] f14937c;

    /* renamed from: d */
    public final int f14938d;

    /* renamed from: e */
    public final int f14939e;

    /* renamed from: f */
    public boolean f14940f;

    public a(InputStream inputStream, boolean z10) {
        int i10;
        this.f14940f = z10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        while (true) {
            int read = inputStream.read(bArr);
            i10 = 0;
            if (read == -1) {
                break;
            } else if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        inputStream.close();
        this.f14935a = byteArrayOutputStream.toByteArray();
        int d10 = d(8);
        this.f14936b = new int[d10];
        this.f14937c = new String[d10];
        int i11 = 10;
        int i12 = 1;
        while (i12 < d10) {
            int i13 = i11 + 1;
            this.f14936b[i12] = i13;
            byte b10 = this.f14935a[i11];
            int i14 = 5;
            if (b10 == 1) {
                i14 = d(i13) + 3;
                if (i14 > i10) {
                    i10 = i14;
                }
            } else if (b10 == 15) {
                i14 = 4;
            } else if (b10 != 18 && b10 != 3 && b10 != 4) {
                if (b10 == 5 || b10 == 6) {
                    i14 = 9;
                    i12++;
                } else {
                    switch (b10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            i14 = 3;
                            continue;
                    }
                }
            }
            i11 += i14;
            i12++;
        }
        this.f14938d = i10;
        this.f14939e = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:315:0x0249 A[LOOP:22: B:314:0x0247->B:315:0x0249, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x02f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(g4.j r15) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.a.a(g4.j):void");
    }

    public final int b(int i10) {
        byte[] bArr = this.f14935a;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final String c(char[] cArr, int i10) {
        int i11;
        int d10 = d(i10);
        String[] strArr = this.f14937c;
        String str = strArr[d10];
        if (str != null) {
            return str;
        }
        int i12 = this.f14936b[d10];
        int i13 = i12 + 2;
        int d11 = d(i12) + i13;
        byte[] bArr = this.f14935a;
        int i14 = 0;
        char c10 = 0;
        char c11 = 0;
        while (i13 < d11) {
            int i15 = i13 + 1;
            byte b10 = bArr[i13];
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 == 2) {
                        i11 = (b10 & 63) | (c11 << 6);
                        c11 = (char) i11;
                        c10 = 1;
                    }
                } else {
                    cArr[i14] = (char) ((b10 & 63) | (c11 << 6));
                    i14++;
                    c10 = 0;
                }
                i13 = i15;
            } else {
                int i16 = b10 & 255;
                if (i16 < 128) {
                    cArr[i14] = (char) i16;
                    i14++;
                } else if (i16 < 224 && i16 > 191) {
                    i11 = i16 & 31;
                    c11 = (char) i11;
                    c10 = 1;
                } else {
                    c11 = (char) (i16 & 15);
                    c10 = 2;
                }
                i13 = i15;
            }
        }
        String str2 = new String(cArr, 0, i14);
        strArr[d10] = str2;
        return str2;
    }

    public final int d(int i10) {
        byte[] bArr = this.f14935a;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }
}
