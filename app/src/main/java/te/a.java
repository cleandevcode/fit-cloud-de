package te;

import android.support.v4.media.d;
import ie.b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public abstract class a extends BufferedInputStream {
    public static int Q = 1;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public byte[] H;
    public String L;
    public int M;

    /* renamed from: a */
    public boolean f28044a;

    /* renamed from: b */
    public boolean f28045b;

    /* renamed from: c */
    public final byte[] f28046c;

    /* renamed from: d */
    public ArrayList f28047d;

    /* renamed from: e */
    public int f28048e;

    /* renamed from: f */
    public int f28049f;

    /* renamed from: g */
    public final byte[] f28050g;

    /* renamed from: h */
    public int f28051h;

    /* renamed from: i */
    public byte f28052i;

    /* renamed from: j */
    public int f28053j;

    /* renamed from: k */
    public boolean f28054k;

    /* renamed from: l */
    public int f28055l;

    /* renamed from: m */
    public int f28056m;

    /* renamed from: n */
    public int f28057n;

    /* renamed from: o */
    public int f28058o;

    /* renamed from: p */
    public int f28059p;

    /* renamed from: q */
    public String f28060q;

    /* renamed from: r */
    public int f28061r;

    /* renamed from: s */
    public int f28062s;

    /* renamed from: t */
    public byte f28063t;

    /* renamed from: u */
    public short f28064u;

    /* renamed from: v */
    public int f28065v;

    /* renamed from: w */
    public byte[] f28066w;

    /* renamed from: x */
    public byte[] f28067x;

    /* renamed from: y */
    public final int f28068y;

    /* renamed from: z */
    public int f28069z;

    public a(InputStream inputStream, int i10) {
        super(new BufferedInputStream(inputStream));
        boolean z10;
        boolean z11;
        boolean z12;
        this.f28045b = b.f16772b;
        this.f28051h = 0;
        this.f28057n = 0;
        this.f28060q = "";
        this.A = 1;
        this.B = 1;
        this.C = 254;
        this.D = 1;
        this.E = 0;
        this.F = 0;
        this.L = "";
        this.f28044a = b.f16771a;
        this.f28065v = i10;
        this.f28068y = 20;
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE];
        this.f28046c = bArr;
        byte[] bArr2 = new byte[12];
        this.f28050g = bArr2;
        this.f28066w = new byte[12];
        this.f28069z = 0;
        if (Q == 1 && markSupported()) {
            if (this.f28045b) {
                ge.b.n("markSupported");
            }
            mark(0);
            read(bArr, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
            h();
            ArrayList arrayList = this.f28047d;
            if (arrayList != null && arrayList.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                ge.b.o("reset to begin", this.f28045b);
                reset();
            }
            boolean z13 = this.f28045b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            if (this.f28065v > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            objArr[0] = Boolean.valueOf(z12);
            objArr[1] = Integer.valueOf(available());
            ge.b.o(String.format(locale, "isNeedReadDfuHeader()=%b, available()=%d", objArr), z13);
            if ((this.f28065v > 0) && available() >= this.f28065v + 12) {
                mark(0);
                try {
                    skip(this.f28065v);
                } catch (IOException unused) {
                    ge.b.p("skip error");
                }
                read(this.f28066w, 0, 12);
                b();
                reset();
                read(this.f28050g, 0, 12);
                return;
            }
            read(bArr2, 0, 12);
            System.arraycopy(bArr2, 0, this.f28066w, 0, 12);
            j();
            return;
        }
        read(bArr2, 0, 12);
        if (bArr2[0] == 1 && bArr2[1] == 0 && bArr2[2] == 2) {
            System.arraycopy(bArr2, 0, bArr, 0, 12);
            read(bArr, 12, 500);
            h();
            read(bArr2, 0, 12);
        }
        boolean z14 = this.f28045b;
        Locale locale2 = Locale.US;
        Object[] objArr2 = new Object[2];
        if (this.f28065v > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        objArr2[0] = Boolean.valueOf(z10);
        objArr2[1] = Integer.valueOf(available());
        ge.b.o(String.format(locale2, "isNeedReadDfuHeader()=%b, available()=%d", objArr2), z14);
        if (this.f28065v > 0) {
            int available = available();
            int i11 = this.f28065v;
            if (available >= i11 + 12) {
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr2, 0, bArr3, 0, 12);
                read(bArr3, 12, this.f28065v - 12);
                read(this.f28066w, 0, 12);
                b();
                return;
            }
        }
        System.arraycopy(bArr2, 0, this.f28066w, 0, 12);
        j();
    }

    public void a(ByteBuffer byteBuffer) {
    }

    public final void b() {
        if (this.f28045b) {
            StringBuilder a10 = d.a("dfuHeader=");
            a10.append(he.a.a(this.f28066w));
            ge.b.n(a10.toString());
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.f28066w, 0, 12);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        a(wrap);
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.a.h():void");
    }

    public final void j() {
        if (this.f28045b) {
            StringBuilder a10 = d.a("headBuf=");
            a10.append(he.a.a(this.f28050g));
            ge.b.n(a10.toString());
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.f28050g, 0, 12);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        a(wrap);
    }

    public final void k() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.E == 1) {
                i10 = this.F;
            } else if (this.f28052i == 11) {
                i10 = 272;
            } else {
                i10 = 372;
            }
            int i13 = i10 - 12;
            int i14 = i13 + 32;
            if (this.f28053j == 10148) {
                i11 = 1014;
                i12 = 1016;
            } else {
                i11 = 0;
                i12 = 0;
            }
            int max = Math.max(i14, i12);
            ge.b.o(String.format("buf1=%d, vpIdBuf=%d, bufferSize=%d", Integer.valueOf(i14), Integer.valueOf(i12), Integer.valueOf(max)), this.f28044a);
            byte[] bArr = new byte[max];
            if (i14 <= i12) {
                int read = read(bArr, 0, i14);
                ge.b.o(String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read), he.a.a(bArr)), this.f28044a);
                if (read > 0) {
                    byte[] bArr2 = new byte[32];
                    this.f28067x = bArr2;
                    System.arraycopy(bArr, i13, bArr2, 0, 32);
                    ge.b.o("sha256=" + he.a.a(this.f28067x), this.f28045b);
                }
                int read2 = read(bArr, i14, max - i14);
                ge.b.o(String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read2), he.a.a(bArr)), this.f28044a);
                if (read2 > 0) {
                    byte[] bArr3 = new byte[2];
                    System.arraycopy(bArr, i11, bArr3, 0, 2);
                    int i15 = (bArr3[0] & 255) | ((bArr3[1] << 8) & 65280);
                    this.M = i15;
                    ge.b.o(String.format("customizeId=%04X", Integer.valueOf(i15)), this.f28045b);
                    return;
                }
                return;
            }
            if (i12 > 0) {
                int read3 = read(bArr, 0, i12);
                ge.b.n(String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read3), he.a.a(bArr)));
                if (read3 > 0) {
                    byte[] bArr4 = new byte[2];
                    System.arraycopy(bArr, i11, bArr4, 0, 2);
                    int i16 = (bArr4[0] & 255) | ((bArr4[1] << 8) & 65280);
                    this.M = i16;
                    ge.b.o(String.format("customizeId=%04X", Integer.valueOf(i16)), this.f28045b);
                }
            }
            int read4 = read(bArr, i12, max - i12);
            ge.b.n(String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read4), he.a.a(bArr)));
            if (read4 > 0) {
                byte[] bArr5 = new byte[32];
                this.f28067x = bArr5;
                System.arraycopy(bArr, i13, bArr5, 0, 32);
                ge.b.o("sha256=" + he.a.a(this.f28067x), this.f28045b);
            }
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
    }

    public final int q(int i10, byte[] bArr) {
        int read = read(bArr, 0, i10);
        if (read > 0) {
            this.f28069z += read;
        }
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException("Use readPacket() method instead");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return q(bArr.length, bArr);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f28069z = 0;
    }

    public int s() {
        return this.f28056m - this.f28069z;
    }

    public final String toString() {
        boolean z10;
        StringBuilder a10 = d.a("BinInputStream{");
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\n\totaVersion=0x%02X, icType=0x%02X, imageId=0x%04X,binId=0x%04X, imageVersion=0x%08X, imageSize=0x%08X(%d)", Integer.valueOf(this.f28051h), Byte.valueOf(this.f28052i), Integer.valueOf(this.f28053j), Integer.valueOf(this.f28058o), Integer.valueOf(this.f28055l), Integer.valueOf(this.f28056m), Integer.valueOf(this.f28056m)));
        a10.append(String.format(locale, "\n\tactiveCompareVersionFlag=%d, inactiveVersionCompFlag=%d,otaTempBufferCheckOrder=%d", Integer.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.D)));
        a10.append(String.format("\n\tpubKeyHash=%s", he.a.a(this.H)));
        a10.append(String.format("\n\tsha256, src=%d, offset=%d, value=%s", Integer.valueOf(this.E), Integer.valueOf(this.F), he.a.a(this.f28067x)));
        String str = this.L;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a10.append(String.format("\n\timageFeature=%s", this.L));
        }
        a10.append("\n}");
        return a10.toString();
    }
}
