package i0;

import android.support.v4.media.d;
import android.util.Rational;
import androidx.camera.core.a;
import androidx.camera.core.j;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i0.a$a */
    /* loaded from: classes.dex */
    public static final class C0286a extends Exception {

        /* renamed from: a */
        public int f16189a;

        public C0286a(String str, int i10) {
            super(str);
            this.f16189a = i10;
        }
    }

    public static Rational a(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static byte[] b(j jVar) {
        if (jVar.getFormat() == 256) {
            ByteBuffer a10 = ((a.C0021a) jVar.l()[0]).a();
            byte[] bArr = new byte[a10.capacity()];
            a10.rewind();
            a10.get(bArr);
            return bArr;
        }
        StringBuilder a11 = d.a("Incorrect image format of the input image proxy: ");
        a11.append(jVar.getFormat());
        throw new IllegalArgumentException(a11.toString());
    }

    public static byte[] c(j jVar) {
        j.a aVar = jVar.l()[0];
        j.a aVar2 = jVar.l()[1];
        j.a aVar3 = jVar.l()[2];
        a.C0021a c0021a = (a.C0021a) aVar;
        ByteBuffer a10 = c0021a.a();
        a.C0021a c0021a2 = (a.C0021a) aVar2;
        ByteBuffer a11 = c0021a2.a();
        a.C0021a c0021a3 = (a.C0021a) aVar3;
        ByteBuffer a12 = c0021a3.a();
        a10.rewind();
        a11.rewind();
        a12.rewind();
        int remaining = a10.remaining();
        byte[] bArr = new byte[((jVar.c() * jVar.f()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < jVar.c(); i11++) {
            a10.get(bArr, i10, jVar.f());
            i10 += jVar.f();
            a10.position(Math.min(remaining, c0021a.c() + (a10.position() - jVar.f())));
        }
        int c10 = jVar.c() / 2;
        int f10 = jVar.f() / 2;
        int c11 = c0021a3.c();
        int c12 = c0021a2.c();
        int b10 = c0021a3.b();
        int b11 = c0021a2.b();
        byte[] bArr2 = new byte[c11];
        byte[] bArr3 = new byte[c12];
        for (int i12 = 0; i12 < c10; i12++) {
            a12.get(bArr2, 0, Math.min(c11, a12.remaining()));
            a11.get(bArr3, 0, Math.min(c12, a11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < f10; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 = i16 + 1;
                bArr[i16] = bArr3[i14];
                i13 += b10;
                i14 += b11;
            }
        }
        return bArr;
    }
}
