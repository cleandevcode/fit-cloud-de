package gn;

import androidx.appcompat.widget.u0;
import gn.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ln.y;
import ln.z;
import s.p1;

/* loaded from: classes2.dex */
public final class q implements Closeable {

    /* renamed from: e */
    public static final Logger f15629e;

    /* renamed from: a */
    public final b f15630a;

    /* renamed from: b */
    public final d.a f15631b;

    /* renamed from: c */
    public final ln.g f15632c;

    /* renamed from: d */
    public final boolean f15633d;

    /* loaded from: classes2.dex */
    public static final class a {
        public static int a(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(p1.a("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements y {

        /* renamed from: a */
        public int f15634a;

        /* renamed from: b */
        public int f15635b;

        /* renamed from: c */
        public int f15636c;

        /* renamed from: d */
        public int f15637d;

        /* renamed from: e */
        public int f15638e;

        /* renamed from: f */
        public final ln.g f15639f;

        public b(ln.g gVar) {
            this.f15639f = gVar;
        }

        @Override // ln.y
        public final long V(ln.e eVar, long j10) {
            int i10;
            int readInt;
            gm.l.f(eVar, "sink");
            do {
                int i11 = this.f15637d;
                if (i11 == 0) {
                    this.f15639f.skip(this.f15638e);
                    this.f15638e = 0;
                    if ((this.f15635b & 4) != 0) {
                        return -1L;
                    }
                    i10 = this.f15636c;
                    int p10 = an.c.p(this.f15639f);
                    this.f15637d = p10;
                    this.f15634a = p10;
                    int readByte = this.f15639f.readByte() & 255;
                    this.f15635b = this.f15639f.readByte() & 255;
                    Logger logger = q.f15629e;
                    if (logger.isLoggable(Level.FINE)) {
                        e eVar2 = e.f15549e;
                        int i12 = this.f15636c;
                        int i13 = this.f15634a;
                        int i14 = this.f15635b;
                        eVar2.getClass();
                        logger.fine(e.a(i12, i13, readByte, i14, true));
                    }
                    readInt = this.f15639f.readInt() & Integer.MAX_VALUE;
                    this.f15636c = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long V = this.f15639f.V(eVar, Math.min(j10, i11));
                    if (V == -1) {
                        return -1L;
                    }
                    this.f15637d -= (int) V;
                    return V;
                }
            } while (readInt == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // ln.y
        public final z e() {
            return this.f15639f.e();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(int i10, List list);

        void c();

        void d(int i10, gn.b bVar, ln.h hVar);

        void e(int i10, gn.b bVar);

        void f(int i10, long j10);

        void g(int i10, int i11, boolean z10);

        void i(w wVar);

        void l(int i10, int i11, ln.g gVar, boolean z10);

        void n();

        void o(List list, int i10, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        gm.l.e(logger, "Logger.getLogger(Http2::class.java.name)");
        f15629e = logger;
    }

    public q(ln.g gVar, boolean z10) {
        this.f15632c = gVar;
        this.f15633d = z10;
        b bVar = new b(gVar);
        this.f15630a = bVar;
        this.f15631b = new d.a(bVar);
    }

    public final boolean a(boolean z10, c cVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int readInt;
        boolean z15;
        String g10;
        gm.l.f(cVar, "handler");
        int i10 = 0;
        boolean z16 = false;
        int i11 = 0;
        int i12 = 0;
        try {
            this.f15632c.B0(9L);
            int p10 = an.c.p(this.f15632c);
            if (p10 <= 16384) {
                int readByte = this.f15632c.readByte() & 255;
                int readByte2 = this.f15632c.readByte() & 255;
                int readInt2 = this.f15632c.readInt() & Integer.MAX_VALUE;
                Logger logger = f15629e;
                if (logger.isLoggable(Level.FINE)) {
                    e.f15549e.getClass();
                    logger.fine(e.a(readInt2, p10, readByte, readByte2, true));
                }
                if (z10 && readByte != 4) {
                    StringBuilder a10 = android.support.v4.media.d.a("Expected a SETTINGS frame but was ");
                    e.f15549e.getClass();
                    String[] strArr = e.f15546b;
                    if (readByte < strArr.length) {
                        g10 = strArr[readByte];
                    } else {
                        g10 = an.c.g("0x%02x", Integer.valueOf(readByte));
                    }
                    a10.append(g10);
                    throw new IOException(a10.toString());
                }
                gn.b bVar = null;
                switch (readByte) {
                    case 0:
                        if (readInt2 != 0) {
                            if ((readByte2 & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((readByte2 & 32) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                if ((readByte2 & 8) != 0) {
                                    i10 = this.f15632c.readByte() & 255;
                                }
                                cVar.l(readInt2, a.a(p10, readByte2, i10), this.f15632c, z11);
                                this.f15632c.skip(i10);
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                    case 1:
                        if (readInt2 != 0) {
                            if ((readByte2 & 1) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((readByte2 & 8) != 0) {
                                i12 = this.f15632c.readByte() & 255;
                            }
                            if ((readByte2 & 32) != 0) {
                                j(cVar, readInt2);
                                p10 -= 5;
                            }
                            cVar.o(h(a.a(p10, readByte2, i12), i12, readByte2, readInt2), readInt2, z13);
                            break;
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        }
                    case 2:
                        if (p10 == 5) {
                            if (readInt2 != 0) {
                                j(cVar, readInt2);
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        } else {
                            throw new IOException(androidx.activity.i.a("TYPE_PRIORITY length: ", p10, " != 5"));
                        }
                    case 3:
                        if (p10 == 4) {
                            if (readInt2 != 0) {
                                int readInt3 = this.f15632c.readInt();
                                gn.b[] values = gn.b.values();
                                int length = values.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length) {
                                        gn.b bVar2 = values[i13];
                                        if (bVar2.f15516a == readInt3) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            bVar = bVar2;
                                        } else {
                                            i13++;
                                        }
                                    }
                                }
                                if (bVar != null) {
                                    cVar.e(readInt2, bVar);
                                    break;
                                } else {
                                    throw new IOException(u0.a("TYPE_RST_STREAM unexpected error code: ", readInt3));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        } else {
                            throw new IOException(androidx.activity.i.a("TYPE_RST_STREAM length: ", p10, " != 4"));
                        }
                    case 4:
                        if (readInt2 == 0) {
                            if ((readByte2 & 1) != 0) {
                                if (p10 == 0) {
                                    cVar.c();
                                    break;
                                } else {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (p10 % 6 == 0) {
                                w wVar = new w();
                                lm.h x10 = h7.a.x(h7.a.A(0, p10), 6);
                                int i14 = x10.f20071a;
                                int i15 = x10.f20072b;
                                int i16 = x10.f20073c;
                                if (i16 < 0 ? i14 >= i15 : i14 <= i15) {
                                    while (true) {
                                        short readShort = this.f15632c.readShort();
                                        byte[] bArr = an.c.f635a;
                                        int i17 = readShort & 65535;
                                        readInt = this.f15632c.readInt();
                                        if (i17 != 2) {
                                            if (i17 != 3) {
                                                if (i17 != 4) {
                                                    if (i17 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                    }
                                                } else {
                                                    i17 = 7;
                                                    if (readInt < 0) {
                                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                    }
                                                }
                                            } else {
                                                i17 = 4;
                                            }
                                        } else if (readInt != 0 && readInt != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        wVar.b(i17, readInt);
                                        if (i14 != i15) {
                                            i14 += i16;
                                        }
                                    }
                                    throw new IOException(u0.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                                }
                                cVar.i(wVar);
                                break;
                            } else {
                                throw new IOException(u0.a("TYPE_SETTINGS length % 6 != 0: ", p10));
                            }
                        } else {
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        }
                    case 5:
                        if (readInt2 != 0) {
                            if ((readByte2 & 8) != 0) {
                                i11 = this.f15632c.readByte() & 255;
                            }
                            cVar.a(this.f15632c.readInt() & Integer.MAX_VALUE, h(a.a(p10 - 4, readByte2, i11), i11, readByte2, readInt2));
                            break;
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        }
                    case 6:
                        if (p10 == 8) {
                            if (readInt2 == 0) {
                                int readInt4 = this.f15632c.readInt();
                                int readInt5 = this.f15632c.readInt();
                                if ((readByte2 & 1) != 0) {
                                    z16 = true;
                                }
                                cVar.g(readInt4, readInt5, z16);
                                break;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        } else {
                            throw new IOException(u0.a("TYPE_PING length != 8: ", p10));
                        }
                    case 7:
                        if (p10 >= 8) {
                            if (readInt2 == 0) {
                                int readInt6 = this.f15632c.readInt();
                                int readInt7 = this.f15632c.readInt();
                                int i18 = p10 - 8;
                                gn.b[] values2 = gn.b.values();
                                int length2 = values2.length;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < length2) {
                                        gn.b bVar3 = values2[i19];
                                        if (bVar3.f15516a == readInt7) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            bVar = bVar3;
                                        } else {
                                            i19++;
                                        }
                                    }
                                }
                                if (bVar != null) {
                                    ln.h hVar = ln.h.f20100d;
                                    if (i18 > 0) {
                                        hVar = this.f15632c.n(i18);
                                    }
                                    cVar.d(readInt6, bVar, hVar);
                                    break;
                                } else {
                                    throw new IOException(u0.a("TYPE_GOAWAY unexpected error code: ", readInt7));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        } else {
                            throw new IOException(u0.a("TYPE_GOAWAY length < 8: ", p10));
                        }
                    case 8:
                        if (p10 == 4) {
                            long readInt8 = 2147483647L & this.f15632c.readInt();
                            if (readInt8 != 0) {
                                cVar.f(readInt2, readInt8);
                                break;
                            } else {
                                throw new IOException("windowSizeIncrement was 0");
                            }
                        } else {
                            throw new IOException(u0.a("TYPE_WINDOW_UPDATE length !=4: ", p10));
                        }
                    default:
                        this.f15632c.skip(p10);
                        break;
                }
                return true;
            }
            throw new IOException(u0.a("FRAME_SIZE_ERROR: ", p10));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(c cVar) {
        gm.l.f(cVar, "handler");
        if (this.f15633d) {
            if (!a(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ln.g gVar = this.f15632c;
        ln.h hVar = e.f15545a;
        ln.h n10 = gVar.n(hVar.f20103c.length);
        Logger logger = f15629e;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder a10 = android.support.v4.media.d.a("<< CONNECTION ");
            a10.append(n10.e());
            logger.fine(an.c.g(a10.toString(), new Object[0]));
        }
        if (!(!gm.l.a(hVar, n10))) {
            return;
        }
        StringBuilder a11 = android.support.v4.media.d.a("Expected a connection header but was ");
        a11.append(n10.k());
        throw new IOException(a11.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15632c.close();
    }

    public final List<gn.c> h(int i10, int i11, int i12, int i13) {
        b bVar = this.f15630a;
        bVar.f15637d = i10;
        bVar.f15634a = i10;
        bVar.f15638e = i11;
        bVar.f15635b = i12;
        bVar.f15636c = i13;
        d.a aVar = this.f15631b;
        while (!aVar.f15529b.A()) {
            byte readByte = aVar.f15529b.readByte();
            byte[] bArr = an.c.f635a;
            int i14 = readByte & 255;
            if (i14 != 128) {
                boolean z10 = false;
                if ((i14 & 128) == 128) {
                    int e10 = aVar.e(i14, 127) - 1;
                    if (e10 >= 0 && e10 <= d.f15526a.length - 1) {
                        z10 = true;
                    }
                    if (z10) {
                        aVar.f15528a.add(d.f15526a[e10]);
                    } else {
                        int length = aVar.f15531d + 1 + (e10 - d.f15526a.length);
                        if (length >= 0) {
                            gn.c[] cVarArr = aVar.f15530c;
                            if (length < cVarArr.length) {
                                ArrayList arrayList = aVar.f15528a;
                                gn.c cVar = cVarArr[length];
                                gm.l.c(cVar);
                                arrayList.add(cVar);
                            }
                        }
                        StringBuilder a10 = android.support.v4.media.d.a("Header index too large ");
                        a10.append(e10 + 1);
                        throw new IOException(a10.toString());
                    }
                } else if (i14 == 64) {
                    gn.c[] cVarArr2 = d.f15526a;
                    ln.h d10 = aVar.d();
                    d.a(d10);
                    aVar.c(new gn.c(d10, aVar.d()));
                } else if ((i14 & 64) == 64) {
                    aVar.c(new gn.c(aVar.b(aVar.e(i14, 63) - 1), aVar.d()));
                } else if ((i14 & 32) == 32) {
                    int e11 = aVar.e(i14, 31);
                    aVar.f15535h = e11;
                    if (e11 >= 0 && e11 <= aVar.f15534g) {
                        int i15 = aVar.f15533f;
                        if (e11 < i15) {
                            if (e11 == 0) {
                                ul.i.z(aVar.f15530c, null);
                                aVar.f15531d = aVar.f15530c.length - 1;
                                aVar.f15532e = 0;
                                aVar.f15533f = 0;
                            } else {
                                aVar.a(i15 - e11);
                            }
                        }
                    } else {
                        StringBuilder a11 = android.support.v4.media.d.a("Invalid dynamic table size update ");
                        a11.append(aVar.f15535h);
                        throw new IOException(a11.toString());
                    }
                } else if (i14 != 16 && i14 != 0) {
                    aVar.f15528a.add(new gn.c(aVar.b(aVar.e(i14, 15) - 1), aVar.d()));
                } else {
                    gn.c[] cVarArr3 = d.f15526a;
                    ln.h d11 = aVar.d();
                    d.a(d11);
                    aVar.f15528a.add(new gn.c(d11, aVar.d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        d.a aVar2 = this.f15631b;
        List<gn.c> Y = ul.q.Y(aVar2.f15528a);
        aVar2.f15528a.clear();
        return Y;
    }

    public final void j(c cVar, int i10) {
        this.f15632c.readInt();
        this.f15632c.readByte();
        byte[] bArr = an.c.f635a;
        cVar.n();
    }
}
