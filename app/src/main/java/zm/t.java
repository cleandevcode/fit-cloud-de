package zm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ln.h;
import zm.s;

/* loaded from: classes2.dex */
public final class t extends z {

    /* renamed from: f */
    public static final s f32681f;

    /* renamed from: g */
    public static final s f32682g;

    /* renamed from: h */
    public static final byte[] f32683h;

    /* renamed from: i */
    public static final byte[] f32684i;

    /* renamed from: j */
    public static final byte[] f32685j;

    /* renamed from: b */
    public final s f32686b;

    /* renamed from: c */
    public long f32687c;

    /* renamed from: d */
    public final ln.h f32688d;

    /* renamed from: e */
    public final List<c> f32689e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final ln.h f32690a;

        /* renamed from: b */
        public s f32691b;

        /* renamed from: c */
        public final ArrayList f32692c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            gm.l.e(uuid, "UUID.randomUUID().toString()");
            ln.h hVar = ln.h.f20100d;
            this.f32690a = h.a.b(uuid);
            this.f32691b = t.f32681f;
            this.f32692c = new ArrayList();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static void a(StringBuilder sb2, String str) {
            String str2;
            sb2.append('\"');
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '\n') {
                    str2 = "%0A";
                } else if (charAt == '\r') {
                    str2 = "%0D";
                } else if (charAt != '\"') {
                    sb2.append(charAt);
                } else {
                    str2 = "%22";
                }
                sb2.append(str2);
            }
            sb2.append('\"');
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: c */
        public static final a f32693c = new a();

        /* renamed from: a */
        public final p f32694a;

        /* renamed from: b */
        public final z f32695b;

        /* loaded from: classes2.dex */
        public static final class a {
            public static c a(p pVar, z zVar) {
                gm.l.f(zVar, "body");
                if ((pVar != null ? pVar.e("Content-Type") : null) == null) {
                    if ((pVar != null ? pVar.e("Content-Length") : null) == null) {
                        return new c(pVar, zVar);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }
        }

        public c(p pVar, z zVar) {
            this.f32694a = pVar;
            this.f32695b = zVar;
        }
    }

    static {
        s.f32677f.getClass();
        f32681f = s.a.a("multipart/mixed");
        s.a.a("multipart/alternative");
        s.a.a("multipart/digest");
        s.a.a("multipart/parallel");
        f32682g = s.a.a("multipart/form-data");
        f32683h = new byte[]{(byte) 58, (byte) 32};
        f32684i = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f32685j = new byte[]{b10, b10};
    }

    public t(ln.h hVar, s sVar, List<c> list) {
        gm.l.f(hVar, "boundaryByteString");
        gm.l.f(sVar, "type");
        this.f32688d = hVar;
        this.f32689e = list;
        s.f32677f.getClass();
        this.f32686b = s.a.a(sVar + "; boundary=" + hVar.k());
        this.f32687c = -1L;
    }

    @Override // zm.z
    public final long a() {
        long j10 = this.f32687c;
        if (j10 == -1) {
            long d10 = d(null, true);
            this.f32687c = d10;
            return d10;
        }
        return j10;
    }

    @Override // zm.z
    public final s b() {
        return this.f32686b;
    }

    @Override // zm.z
    public final void c(ln.f fVar) {
        d(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(ln.f fVar, boolean z10) {
        ln.e eVar;
        if (z10) {
            fVar = new ln.e();
            eVar = fVar;
        } else {
            eVar = 0;
        }
        int size = this.f32689e.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f32689e.get(i10);
            p pVar = cVar.f32694a;
            z zVar = cVar.f32695b;
            gm.l.c(fVar);
            fVar.write(f32685j);
            fVar.u(this.f32688d);
            fVar.write(f32684i);
            if (pVar != null) {
                int length = pVar.f32653a.length / 2;
                for (int i11 = 0; i11 < length; i11++) {
                    fVar.S(pVar.f(i11)).write(f32683h).S(pVar.j(i11)).write(f32684i);
                }
            }
            s b10 = zVar.b();
            if (b10 != null) {
                fVar.S("Content-Type: ").S(b10.f32678a).write(f32684i);
            }
            long a10 = zVar.a();
            if (a10 != -1) {
                fVar.S("Content-Length: ").D0(a10).write(f32684i);
            } else if (z10) {
                gm.l.c(eVar);
                eVar.a();
                return -1L;
            }
            byte[] bArr = f32684i;
            fVar.write(bArr);
            if (z10) {
                j10 += a10;
            } else {
                zVar.c(fVar);
            }
            fVar.write(bArr);
        }
        gm.l.c(fVar);
        byte[] bArr2 = f32685j;
        fVar.write(bArr2);
        fVar.u(this.f32688d);
        fVar.write(bArr2);
        fVar.write(f32684i);
        if (z10) {
            gm.l.c(eVar);
            long j11 = j10 + eVar.f20098b;
            eVar.a();
            return j11;
        }
        return j10;
    }
}
