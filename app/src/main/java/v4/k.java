package v4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m5.l;
import n5.a;
import n5.d;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final m5.i<r4.f, String> f29062a = new m5.i<>(1000);

    /* renamed from: b */
    public final a.c f29063b = n5.a.a(10, new a());

    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        @Override // n5.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.d {

        /* renamed from: a */
        public final MessageDigest f29064a;

        /* renamed from: b */
        public final d.a f29065b = new d.a();

        public b(MessageDigest messageDigest) {
            this.f29064a = messageDigest;
        }

        @Override // n5.a.d
        public final d.a e() {
            return this.f29065b;
        }
    }

    public final String a(r4.f fVar) {
        String a10;
        synchronized (this.f29062a) {
            a10 = this.f29062a.a(fVar);
        }
        if (a10 == null) {
            Object acquire = this.f29063b.acquire();
            b0.c.i(acquire);
            b bVar = (b) acquire;
            try {
                fVar.a(bVar.f29064a);
                byte[] digest = bVar.f29064a.digest();
                char[] cArr = l.f20383b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        int i11 = digest[i10] & 255;
                        int i12 = i10 * 2;
                        char[] cArr2 = l.f20382a;
                        cArr[i12] = cArr2[i11 >>> 4];
                        cArr[i12 + 1] = cArr2[i11 & 15];
                    }
                    a10 = new String(cArr);
                }
            } finally {
                this.f29063b.release(bVar);
            }
        }
        synchronized (this.f29062a) {
            this.f29062a.d(fVar, a10);
        }
        return a10;
    }
}
