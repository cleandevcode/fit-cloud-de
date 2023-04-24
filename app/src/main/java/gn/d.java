package gn;

import gn.q;
import gn.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public static final c[] f15526a;

    /* renamed from: b */
    public static final Map<ln.h, Integer> f15527b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b */
        public final ln.s f15529b;

        /* renamed from: e */
        public int f15532e;

        /* renamed from: f */
        public int f15533f;

        /* renamed from: g */
        public final int f15534g = 4096;

        /* renamed from: h */
        public int f15535h = 4096;

        /* renamed from: a */
        public final ArrayList f15528a = new ArrayList();

        /* renamed from: c */
        public c[] f15530c = new c[8];

        /* renamed from: d */
        public int f15531d = 7;

        public a(q.b bVar) {
            this.f15529b = new ln.s(bVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f15530c.length;
                while (true) {
                    length--;
                    i11 = this.f15531d;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f15530c[length];
                    gm.l.c(cVar);
                    int i13 = cVar.f15523a;
                    i10 -= i13;
                    this.f15533f -= i13;
                    this.f15532e--;
                    i12++;
                }
                c[] cVarArr = this.f15530c;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f15532e);
                this.f15531d += i12;
            }
            return i12;
        }

        public final ln.h b(int i10) {
            boolean z10;
            c cVar;
            if (i10 >= 0 && i10 <= d.f15526a.length - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar = d.f15526a[i10];
            } else {
                int length = this.f15531d + 1 + (i10 - d.f15526a.length);
                if (length >= 0) {
                    c[] cVarArr = this.f15530c;
                    if (length < cVarArr.length) {
                        cVar = cVarArr[length];
                        gm.l.c(cVar);
                    }
                }
                StringBuilder a10 = android.support.v4.media.d.a("Header index too large ");
                a10.append(i10 + 1);
                throw new IOException(a10.toString());
            }
            return cVar.f15524b;
        }

        public final void c(c cVar) {
            this.f15528a.add(cVar);
            int i10 = cVar.f15523a;
            int i11 = this.f15535h;
            if (i10 > i11) {
                ul.i.z(this.f15530c, null);
                this.f15531d = this.f15530c.length - 1;
                this.f15532e = 0;
                this.f15533f = 0;
                return;
            }
            a((this.f15533f + i10) - i11);
            int i12 = this.f15532e + 1;
            c[] cVarArr = this.f15530c;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15531d = this.f15530c.length - 1;
                this.f15530c = cVarArr2;
            }
            int i13 = this.f15531d;
            this.f15531d = i13 - 1;
            this.f15530c[i13] = cVar;
            this.f15532e++;
            this.f15533f += i10;
        }

        public final ln.h d() {
            boolean z10;
            byte readByte = this.f15529b.readByte();
            byte[] bArr = an.c.f635a;
            int i10 = readByte & 255;
            int i11 = 0;
            if ((i10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long e10 = e(i10, 127);
            if (z10) {
                ln.e eVar = new ln.e();
                int[] iArr = t.f15672a;
                ln.s sVar = this.f15529b;
                gm.l.f(sVar, "source");
                t.a aVar = t.f15674c;
                int i12 = 0;
                for (long j10 = 0; j10 < e10; j10++) {
                    byte readByte2 = sVar.readByte();
                    byte[] bArr2 = an.c.f635a;
                    i11 = (i11 << 8) | (readByte2 & 255);
                    i12 += 8;
                    while (i12 >= 8) {
                        int i13 = i12 - 8;
                        t.a[] aVarArr = aVar.f15675a;
                        gm.l.c(aVarArr);
                        aVar = aVarArr[(i11 >>> i13) & 255];
                        gm.l.c(aVar);
                        if (aVar.f15675a == null) {
                            eVar.b0(aVar.f15676b);
                            i12 -= aVar.f15677c;
                            aVar = t.f15674c;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                while (i12 > 0) {
                    t.a[] aVarArr2 = aVar.f15675a;
                    gm.l.c(aVarArr2);
                    t.a aVar2 = aVarArr2[(i11 << (8 - i12)) & 255];
                    gm.l.c(aVar2);
                    if (aVar2.f15675a != null || aVar2.f15677c > i12) {
                        break;
                    }
                    eVar.b0(aVar2.f15676b);
                    i12 -= aVar2.f15677c;
                    aVar = t.f15674c;
                }
                return eVar.I();
            }
            return this.f15529b.n(e10);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f15529b.readByte();
                byte[] bArr = an.c.f635a;
                int i14 = readByte & 255;
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: b */
        public boolean f15537b;

        /* renamed from: f */
        public int f15541f;

        /* renamed from: g */
        public int f15542g;

        /* renamed from: i */
        public final ln.e f15544i;

        /* renamed from: h */
        public final boolean f15543h = true;

        /* renamed from: a */
        public int f15536a = Integer.MAX_VALUE;

        /* renamed from: c */
        public int f15538c = 4096;

        /* renamed from: d */
        public c[] f15539d = new c[8];

        /* renamed from: e */
        public int f15540e = 7;

        public b(ln.e eVar) {
            this.f15544i = eVar;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f15539d.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f15540e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f15539d[length];
                    gm.l.c(cVar);
                    i10 -= cVar.f15523a;
                    int i13 = this.f15542g;
                    c cVar2 = this.f15539d[length];
                    gm.l.c(cVar2);
                    this.f15542g = i13 - cVar2.f15523a;
                    this.f15541f--;
                    i12++;
                    length--;
                }
                c[] cVarArr = this.f15539d;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f15541f);
                c[] cVarArr2 = this.f15539d;
                int i15 = this.f15540e + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f15540e += i12;
            }
        }

        public final void b(c cVar) {
            int i10 = cVar.f15523a;
            int i11 = this.f15538c;
            if (i10 > i11) {
                ul.i.z(this.f15539d, null);
                this.f15540e = this.f15539d.length - 1;
                this.f15541f = 0;
                this.f15542g = 0;
                return;
            }
            a((this.f15542g + i10) - i11);
            int i12 = this.f15541f + 1;
            c[] cVarArr = this.f15539d;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15540e = this.f15539d.length - 1;
                this.f15539d = cVarArr2;
            }
            int i13 = this.f15540e;
            this.f15540e = i13 - 1;
            this.f15539d[i13] = cVar;
            this.f15541f++;
            this.f15542g += i10;
        }

        public final void c(ln.h hVar) {
            int d10;
            gm.l.f(hVar, "data");
            int i10 = 0;
            if (this.f15543h) {
                int[] iArr = t.f15672a;
                int d11 = hVar.d();
                long j10 = 0;
                for (int i11 = 0; i11 < d11; i11++) {
                    byte g10 = hVar.g(i11);
                    byte[] bArr = an.c.f635a;
                    j10 += t.f15673b[g10 & 255];
                }
                if (((int) ((j10 + 7) >> 3)) < hVar.d()) {
                    ln.e eVar = new ln.e();
                    int[] iArr2 = t.f15672a;
                    int d12 = hVar.d();
                    long j11 = 0;
                    byte b10 = 0;
                    while (i10 < d12) {
                        byte g11 = hVar.g(i10);
                        byte[] bArr2 = an.c.f635a;
                        int i12 = g11 & 255;
                        int i13 = t.f15672a[i12];
                        byte b11 = t.f15673b[i12];
                        j11 = (j11 << b11) | i13;
                        int i14 = b10 + b11;
                        while (i14 >= 8) {
                            i14 = (i14 == 1 ? 1 : 0) - 8;
                            eVar.b0((int) (j11 >> i14));
                        }
                        i10++;
                        b10 = i14;
                    }
                    if (b10 > 0) {
                        eVar.b0((int) ((255 >>> b10) | (j11 << (8 - b10))));
                    }
                    hVar = eVar.I();
                    d10 = hVar.d();
                    i10 = 128;
                    e(d10, 127, i10);
                    this.f15544i.Z(hVar);
                }
            }
            d10 = hVar.d();
            e(d10, 127, i10);
            this.f15544i.Z(hVar);
        }

        public final void d(ArrayList arrayList) {
            int i10;
            int i11;
            if (this.f15537b) {
                int i12 = this.f15536a;
                if (i12 < this.f15538c) {
                    e(i12, 31, 32);
                }
                this.f15537b = false;
                this.f15536a = Integer.MAX_VALUE;
                e(this.f15538c, 31, 32);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) arrayList.get(i13);
                ln.h j10 = cVar.f15524b.j();
                ln.h hVar = cVar.f15525c;
                Integer num = d.f15527b.get(j10);
                if (num != null) {
                    i10 = num.intValue() + 1;
                    if (2 <= i10 && 7 >= i10) {
                        c[] cVarArr = d.f15526a;
                        if (gm.l.a(cVarArr[i10 - 1].f15525c, hVar)) {
                            i11 = i10;
                        } else if (gm.l.a(cVarArr[i10].f15525c, hVar)) {
                            i11 = i10;
                            i10++;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f15540e + 1;
                    int length = this.f15539d.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        c cVar2 = this.f15539d[i14];
                        gm.l.c(cVar2);
                        if (gm.l.a(cVar2.f15524b, j10)) {
                            c cVar3 = this.f15539d[i14];
                            gm.l.c(cVar3);
                            if (gm.l.a(cVar3.f15525c, hVar)) {
                                i10 = d.f15526a.length + (i14 - this.f15540e);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - this.f15540e) + d.f15526a.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i10 != -1) {
                    e(i10, 127, 128);
                } else {
                    if (i11 == -1) {
                        this.f15544i.b0(64);
                        c(j10);
                    } else {
                        ln.h hVar2 = c.f15517d;
                        j10.getClass();
                        gm.l.f(hVar2, "prefix");
                        if (j10.i(hVar2, hVar2.d()) && (!gm.l.a(c.f15522i, j10))) {
                            e(i11, 15, 0);
                            c(hVar);
                        } else {
                            e(i11, 63, 64);
                        }
                    }
                    c(hVar);
                    b(cVar);
                }
            }
        }

        public final void e(int i10, int i11, int i12) {
            int i13;
            ln.e eVar;
            if (i10 < i11) {
                eVar = this.f15544i;
                i13 = i10 | i12;
            } else {
                this.f15544i.b0(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f15544i.b0(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                eVar = this.f15544i;
            }
            eVar.b0(i13);
        }
    }

    static {
        c cVar = new c(c.f15522i, "");
        ln.h hVar = c.f15519f;
        ln.h hVar2 = c.f15520g;
        ln.h hVar3 = c.f15521h;
        ln.h hVar4 = c.f15518e;
        f15526a = new c[]{cVar, new c(hVar, "GET"), new c(hVar, "POST"), new c(hVar2, "/"), new c(hVar2, "/index.html"), new c(hVar3, "http"), new c(hVar3, "https"), new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            c[] cVarArr = f15526a;
            if (!linkedHashMap.containsKey(cVarArr[i10].f15524b)) {
                linkedHashMap.put(cVarArr[i10].f15524b, Integer.valueOf(i10));
            }
        }
        Map<ln.h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        gm.l.e(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f15527b = unmodifiableMap;
    }

    public static void a(ln.h hVar) {
        gm.l.f(hVar, "name");
        int d10 = hVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte g10 = hVar.g(i10);
            if (b10 <= g10 && b11 >= g10) {
                StringBuilder a10 = android.support.v4.media.d.a("PROTOCOL_ERROR response malformed: mixed case name: ");
                a10.append(hVar.k());
                throw new IOException(a10.toString());
            }
        }
    }
}
