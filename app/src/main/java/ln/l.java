package ln;

import a0.q0;
import androidx.fragment.app.i1;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class l implements y {

    /* renamed from: a */
    public byte f20107a;

    /* renamed from: b */
    public final s f20108b;

    /* renamed from: c */
    public final Inflater f20109c;

    /* renamed from: d */
    public final m f20110d;

    /* renamed from: e */
    public final CRC32 f20111e;

    public l(y yVar) {
        gm.l.f(yVar, "source");
        s sVar = new s(yVar);
        this.f20108b = sVar;
        Inflater inflater = new Inflater(true);
        this.f20109c = inflater;
        this.f20110d = new m(sVar, inflater);
        this.f20111e = new CRC32();
    }

    public static void a(int i10, int i11, String str) {
        if (i11 == i10) {
            return;
        }
        throw new IOException(i1.d(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3, "%s: actual 0x%08x != expected 0x%08x", "java.lang.String.format(this, *args)"));
    }

    @Override // ln.y
    public final long V(e eVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j11;
        gm.l.f(eVar, "sink");
        boolean z14 = false;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                return 0L;
            }
            if (this.f20107a == 0) {
                this.f20108b.B0(10L);
                byte y10 = this.f20108b.f20127a.y(3L);
                if (((y10 >> 1) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    b(this.f20108b.f20127a, 0L, 10L);
                }
                a(8075, this.f20108b.readShort(), "ID1ID2");
                this.f20108b.skip(8L);
                if (((y10 >> 2) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f20108b.B0(2L);
                    if (z11) {
                        b(this.f20108b.f20127a, 0L, 2L);
                    }
                    int readShort = this.f20108b.f20127a.readShort() & 65535;
                    long j12 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                    this.f20108b.B0(j12);
                    if (z11) {
                        j11 = j12;
                        b(this.f20108b.f20127a, 0L, j12);
                    } else {
                        j11 = j12;
                    }
                    this.f20108b.skip(j11);
                }
                if (((y10 >> 3) & 1) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    long a10 = this.f20108b.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z11) {
                            b(this.f20108b.f20127a, 0L, a10 + 1);
                        }
                        this.f20108b.skip(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((y10 >> 4) & 1) == 1) {
                    z14 = true;
                }
                if (z14) {
                    long a11 = this.f20108b.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a11 != -1) {
                        if (z11) {
                            b(this.f20108b.f20127a, 0L, a11 + 1);
                        }
                        this.f20108b.skip(a11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z11) {
                    s sVar = this.f20108b;
                    sVar.B0(2L);
                    int readShort2 = sVar.f20127a.readShort() & 65535;
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) this.f20111e.getValue(), "FHCRC");
                    this.f20111e.reset();
                }
                this.f20107a = (byte) 1;
            }
            if (this.f20107a == 1) {
                long j13 = eVar.f20098b;
                long V = this.f20110d.V(eVar, j10);
                if (V != -1) {
                    b(eVar, j13, V);
                    return V;
                }
                this.f20107a = (byte) 2;
            }
            if (this.f20107a == 2) {
                a(this.f20108b.b(), (int) this.f20111e.getValue(), "CRC");
                a(this.f20108b.b(), (int) this.f20109c.getBytesWritten(), "ISIZE");
                this.f20107a = (byte) 3;
                if (!this.f20108b.A()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
    }

    public final void b(e eVar, long j10, long j11) {
        int i10;
        t tVar = eVar.f20097a;
        while (true) {
            gm.l.c(tVar);
            int i11 = tVar.f20133c;
            int i12 = tVar.f20132b;
            if (j10 < i11 - i12) {
                break;
            }
            j10 -= i11 - i12;
            tVar = tVar.f20136f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(tVar.f20133c - i10, j11);
            this.f20111e.update(tVar.f20131a, (int) (tVar.f20132b + j10), min);
            j11 -= min;
            tVar = tVar.f20136f;
            gm.l.c(tVar);
            j10 = 0;
        }
    }

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20110d.close();
    }

    @Override // ln.y
    public final z e() {
        return this.f20108b.e();
    }
}
