package yj;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import oj.o;
import p000do.a;
import zj.k;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f31780a;

        /* renamed from: b */
        public long f31781b;

        /* renamed from: c */
        public long f31782c;

        /* renamed from: d */
        public int f31783d;
    }

    /* renamed from: yj.b$b */
    /* loaded from: classes2.dex */
    public static class C0600b {

        /* renamed from: a */
        public long f31784a;

        /* renamed from: b */
        public int f31785b;

        public C0600b(int i10, long j10) {
            this.f31784a = j10;
            this.f31785b = i10;
        }
    }

    public static <T> List<T> a(o oVar, k<T> kVar) {
        Iterator<byte[]> it;
        int i10;
        byte[] bArr;
        List<byte[]> list = oVar.f23606b;
        a aVar = null;
        if (list.size() <= 0) {
            return null;
        }
        int a10 = kVar.a();
        byte[] bArr2 = new byte[Math.max(8, a10)];
        Iterator<byte[]> it2 = list.iterator();
        char c10 = 0;
        int i11 = 1;
        int i12 = 8;
        int i13 = 0;
        boolean z10 = true;
        while (it2.hasNext()) {
            byte[] next = it2.next();
            if (next != null && next.length != 0) {
                int length = next.length;
                int i14 = 0;
                while (i14 < length) {
                    bArr2[i13] = next[i14];
                    i13++;
                    if (i13 == i12) {
                        if (z10) {
                            aVar = b(bArr2, oVar.f23605a);
                            if (aVar.f31780a != 0) {
                                kVar.c(aVar);
                                it = it2;
                                i12 = a10;
                                i10 = i12;
                                bArr = bArr2;
                                z10 = false;
                            } else {
                                a.b bVar = p000do.a.f13275a;
                                bVar.t("Fc#SyncDataParser");
                                Object[] objArr = new Object[i11];
                                objArr[c10] = Integer.valueOf(oVar.f23605a);
                                bVar.p("Data invalid(empty):type=%d", objArr);
                                it = it2;
                                i10 = a10;
                                bArr = bArr2;
                            }
                        } else {
                            it = it2;
                            i10 = a10;
                            bArr = bArr2;
                            kVar.b((aVar.f31783d * aVar.f31782c) + aVar.f31781b, bArr);
                            int i15 = aVar.f31783d + 1;
                            aVar.f31783d = i15;
                            if (i15 == aVar.f31780a) {
                                kVar.d(aVar);
                                i12 = 8;
                                z10 = true;
                            }
                        }
                        i13 = 0;
                    } else {
                        it = it2;
                        i10 = a10;
                        bArr = bArr2;
                    }
                    i14++;
                    bArr2 = bArr;
                    a10 = i10;
                    it2 = it;
                    c10 = 0;
                    i11 = 1;
                }
            } else {
                bArr2 = bArr2;
                a10 = a10;
                it2 = it2;
                c10 = 0;
                i11 = 1;
            }
        }
        return kVar.e();
    }

    public static a b(byte[] bArr, int i10) {
        long j10;
        a aVar = new a();
        aVar.f31780a = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        aVar.f31781b = xj.a.d(bArr, 2, new GregorianCalendar());
        int i11 = (bArr[7] & 255) | ((bArr[6] & 255) << 8);
        if (i10 == 7) {
            j10 = i11;
        } else {
            j10 = i11 * 60 * 1000;
        }
        aVar.f31782c = j10;
        aVar.f31783d = 0;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#SyncDataParser");
        bVar.h("parserHeader: type=%d, timestamp=%d, interval=%d", Integer.valueOf(i10), Long.valueOf(aVar.f31781b), Long.valueOf(aVar.f31782c));
        return aVar;
    }
}
