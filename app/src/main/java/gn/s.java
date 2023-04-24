package gn;

import androidx.appcompat.widget.u0;
import gn.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class s implements Closeable {

    /* renamed from: g */
    public static final Logger f15665g = Logger.getLogger(e.class.getName());

    /* renamed from: a */
    public final ln.e f15666a;

    /* renamed from: b */
    public int f15667b;

    /* renamed from: c */
    public boolean f15668c;

    /* renamed from: d */
    public final d.b f15669d;

    /* renamed from: e */
    public final ln.f f15670e;

    /* renamed from: f */
    public final boolean f15671f;

    public s(ln.f fVar, boolean z10) {
        this.f15670e = fVar;
        this.f15671f = z10;
        ln.e eVar = new ln.e();
        this.f15666a = eVar;
        this.f15667b = DfuBaseService.ERROR_CONNECTION_MASK;
        this.f15669d = new d.b(eVar);
    }

    public final synchronized void a(w wVar) {
        int i10;
        int i11;
        gm.l.f(wVar, "peerSettings");
        if (!this.f15668c) {
            int i12 = this.f15667b;
            int i13 = wVar.f15678a;
            if ((i13 & 32) != 0) {
                i12 = wVar.f15679b[5];
            }
            this.f15667b = i12;
            if ((i13 & 2) != 0) {
                i10 = wVar.f15679b[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                d.b bVar = this.f15669d;
                if ((i13 & 2) != 0) {
                    i11 = wVar.f15679b[1];
                } else {
                    i11 = -1;
                }
                bVar.getClass();
                int min = Math.min(i11, (int) DfuBaseService.ERROR_CONNECTION_MASK);
                int i14 = bVar.f15538c;
                if (i14 != min) {
                    if (min < i14) {
                        bVar.f15536a = Math.min(bVar.f15536a, min);
                    }
                    bVar.f15537b = true;
                    bVar.f15538c = min;
                    int i15 = bVar.f15542g;
                    if (min < i15) {
                        if (min == 0) {
                            ul.i.z(bVar.f15539d, null);
                            bVar.f15540e = bVar.f15539d.length - 1;
                            bVar.f15541f = 0;
                            bVar.f15542g = 0;
                        } else {
                            bVar.a(i15 - min);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.f15670e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(boolean z10, int i10, ln.e eVar, int i11) {
        if (!this.f15668c) {
            h(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                ln.f fVar = this.f15670e;
                gm.l.c(eVar);
                fVar.c0(eVar, i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15668c = true;
        this.f15670e.close();
    }

    public final void h(int i10, int i11, int i12, int i13) {
        boolean z10;
        Logger logger = f15665g;
        boolean z11 = false;
        if (logger.isLoggable(Level.FINE)) {
            e.f15549e.getClass();
            logger.fine(e.a(i10, i11, i12, i13, false));
        }
        if (i11 <= this.f15667b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((((int) 2147483648L) & i10) == 0) {
                z11 = true;
            }
            if (z11) {
                ln.f fVar = this.f15670e;
                byte[] bArr = an.c.f635a;
                gm.l.f(fVar, "$this$writeMedium");
                fVar.writeByte((i11 >>> 16) & 255);
                fVar.writeByte((i11 >>> 8) & 255);
                fVar.writeByte(i11 & 255);
                this.f15670e.writeByte(i12 & 255);
                this.f15670e.writeByte(i13 & 255);
                this.f15670e.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(u0.a("reserved bit set: ", i10).toString());
        }
        StringBuilder a10 = android.support.v4.media.d.a("FRAME_SIZE_ERROR length > ");
        a10.append(this.f15667b);
        a10.append(": ");
        a10.append(i11);
        throw new IllegalArgumentException(a10.toString().toString());
    }

    public final synchronized void j(int i10, b bVar, byte[] bArr) {
        boolean z10;
        if (!this.f15668c) {
            boolean z11 = false;
            if (bVar.f15516a != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h(0, bArr.length + 8, 7, 0);
                this.f15670e.writeInt(i10);
                this.f15670e.writeInt(bVar.f15516a);
                if (bArr.length == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f15670e.write(bArr);
                }
                this.f15670e.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i10, int i11, boolean z10) {
        if (this.f15668c) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z10 ? 1 : 0);
        this.f15670e.writeInt(i10);
        this.f15670e.writeInt(i11);
        this.f15670e.flush();
    }

    public final synchronized void q(int i10, b bVar) {
        boolean z10;
        gm.l.f(bVar, "errorCode");
        if (!this.f15668c) {
            if (bVar.f15516a != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h(i10, 4, 3, 0);
                this.f15670e.writeInt(bVar.f15516a);
                this.f15670e.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void s(int i10, long j10) {
        if (this.f15668c) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        h(i10, 4, 8, 0);
        this.f15670e.writeInt((int) j10);
        this.f15670e.flush();
    }

    public final void v(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f15667b, j10);
            j10 -= min;
            h(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f15670e.c0(this.f15666a, min);
        }
    }
}
