package q4;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import no.nordicsemi.android.dfu.DfuBaseService;
import w1.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b */
    public ByteBuffer f24566b;

    /* renamed from: c */
    public c f24567c;

    /* renamed from: a */
    public final byte[] f24565a = new byte[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: d */
    public int f24568d = 0;

    public final boolean a() {
        return this.f24567c.f24555b != 0;
    }

    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f24566b != null) {
            if (a()) {
                return this.f24567c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f24567c.f24555b = 1;
            } else {
                this.f24567c.f24559f = f();
                this.f24567c.f24560g = f();
                int c10 = c();
                c cVar = this.f24567c;
                if ((c10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f24561h = z10;
                cVar.f24562i = (int) Math.pow(2.0d, (c10 & 7) + 1);
                this.f24567c.f24563j = c();
                c cVar2 = this.f24567c;
                c();
                cVar2.getClass();
                if (this.f24567c.f24561h && !a()) {
                    c cVar3 = this.f24567c;
                    cVar3.f24554a = e(cVar3.f24562i);
                    c cVar4 = this.f24567c;
                    cVar4.f24564k = cVar4.f24554a[cVar4.f24563j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.f24567c.f24556c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 != 33) {
                        if (c11 != 44) {
                            if (c11 != 59) {
                                this.f24567c.f24555b = 1;
                            } else {
                                z14 = true;
                            }
                        } else {
                            c cVar5 = this.f24567c;
                            if (cVar5.f24557d == null) {
                                cVar5.f24557d = new b();
                            }
                            this.f24567c.f24557d.f24543a = f();
                            this.f24567c.f24557d.f24544b = f();
                            this.f24567c.f24557d.f24545c = f();
                            this.f24567c.f24557d.f24546d = f();
                            int c12 = c();
                            if ((c12 & 128) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c12 & 7) + 1);
                            b bVar = this.f24567c.f24557d;
                            if ((c12 & 64) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar.f24547e = z12;
                            if (z11) {
                                bVar.f24553k = e(pow);
                            } else {
                                bVar.f24553k = null;
                            }
                            this.f24567c.f24557d.f24552j = this.f24566b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.f24567c;
                                cVar6.f24556c++;
                                cVar6.f24558e.add(cVar6.f24557d);
                            }
                        }
                    } else {
                        int c13 = c();
                        if (c13 != 1) {
                            if (c13 != 249) {
                                if (c13 != 254 && c13 == 255) {
                                    d();
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i11 = 0; i11 < 11; i11++) {
                                        sb3.append((char) this.f24565a[i11]);
                                    }
                                    if (sb3.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            d();
                                            byte[] bArr = this.f24565a;
                                            if (bArr[0] == 1) {
                                                byte b10 = bArr[1];
                                                byte b11 = bArr[2];
                                                this.f24567c.getClass();
                                            }
                                            if (this.f24568d > 0) {
                                            }
                                        } while (!a());
                                    }
                                }
                            } else {
                                this.f24567c.f24557d = new b();
                                c();
                                int c14 = c();
                                b bVar2 = this.f24567c.f24557d;
                                int i12 = (c14 & 28) >> 2;
                                bVar2.f24549g = i12;
                                if (i12 == 0) {
                                    bVar2.f24549g = 1;
                                }
                                if ((c14 & 1) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar2.f24548f = z13;
                                int f10 = f();
                                if (f10 < 2) {
                                    f10 = 10;
                                }
                                b bVar3 = this.f24567c.f24557d;
                                bVar3.f24551i = f10 * 10;
                                bVar3.f24550h = c();
                                c();
                            }
                        }
                        g();
                    }
                }
                c cVar7 = this.f24567c;
                if (cVar7.f24556c < 0) {
                    cVar7.f24555b = 1;
                }
            }
            return this.f24567c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f24566b.get() & 255;
        } catch (Exception unused) {
            this.f24567c.f24555b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f24568d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f24568d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f24566b.get(this.f24565a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder a10 = h.a("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                        a10.append(this.f24568d);
                        Log.d("GifHeaderParser", a10.toString(), e10);
                    }
                    this.f24567c.f24555b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f24566b.get(bArr);
            iArr = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f24567c.f24555b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f24566b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f24566b.position(Math.min(this.f24566b.position() + c10, this.f24566b.limit()));
        } while (c10 > 0);
    }
}
