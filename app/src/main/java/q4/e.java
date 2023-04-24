package q4;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.hms.scankit.C0637e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;
import q4.a;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a */
    public int[] f24569a;

    /* renamed from: c */
    public final a.InterfaceC0445a f24571c;

    /* renamed from: d */
    public ByteBuffer f24572d;

    /* renamed from: e */
    public byte[] f24573e;

    /* renamed from: f */
    public short[] f24574f;

    /* renamed from: g */
    public byte[] f24575g;

    /* renamed from: h */
    public byte[] f24576h;

    /* renamed from: i */
    public byte[] f24577i;

    /* renamed from: j */
    public int[] f24578j;

    /* renamed from: k */
    public int f24579k;

    /* renamed from: l */
    public c f24580l;

    /* renamed from: m */
    public Bitmap f24581m;

    /* renamed from: n */
    public boolean f24582n;

    /* renamed from: o */
    public int f24583o;

    /* renamed from: p */
    public int f24584p;

    /* renamed from: q */
    public int f24585q;

    /* renamed from: r */
    public int f24586r;

    /* renamed from: s */
    public Boolean f24587s;

    /* renamed from: b */
    public final int[] f24570b = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: t */
    public Bitmap.Config f24588t = Bitmap.Config.ARGB_8888;

    public e(e5.b bVar, c cVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.f24571c = bVar;
        this.f24580l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f24583o = 0;
                this.f24580l = cVar;
                this.f24579k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f24572d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f24572d.order(ByteOrder.LITTLE_ENDIAN);
                this.f24582n = false;
                Iterator it = cVar.f24558e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f24549g == 3) {
                        this.f24582n = true;
                        break;
                    }
                }
                this.f24584p = highestOneBit;
                int i11 = cVar.f24559f;
                this.f24586r = i11 / highestOneBit;
                int i12 = cVar.f24560g;
                this.f24585q = i12 / highestOneBit;
                int i13 = i11 * i12;
                u4.b bVar2 = ((e5.b) this.f24571c).f13442b;
                if (bVar2 == null) {
                    bArr = new byte[i13];
                } else {
                    bArr = (byte[]) bVar2.c(i13, byte[].class);
                }
                this.f24577i = bArr;
                a.InterfaceC0445a interfaceC0445a = this.f24571c;
                int i14 = this.f24586r * this.f24585q;
                u4.b bVar3 = ((e5.b) interfaceC0445a).f13442b;
                if (bVar3 == null) {
                    iArr = new int[i14];
                } else {
                    iArr = (int[]) bVar3.c(i14, int[].class);
                }
                this.f24578j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    @Override // q4.a
    public final synchronized Bitmap a() {
        b bVar;
        byte[] bArr;
        if (this.f24580l.f24556c <= 0 || this.f24579k < 0) {
            if (Log.isLoggable(C0637e.f7371a, 3)) {
                Log.d(C0637e.f7371a, "Unable to decode frame, frameCount=" + this.f24580l.f24556c + ", framePointer=" + this.f24579k);
            }
            this.f24583o = 1;
        }
        int i10 = this.f24583o;
        if (i10 != 1 && i10 != 2) {
            this.f24583o = 0;
            if (this.f24573e == null) {
                u4.b bVar2 = ((e5.b) this.f24571c).f13442b;
                if (bVar2 == null) {
                    bArr = new byte[255];
                } else {
                    bArr = (byte[]) bVar2.c(255, byte[].class);
                }
                this.f24573e = bArr;
            }
            b bVar3 = (b) this.f24580l.f24558e.get(this.f24579k);
            int i11 = this.f24579k - 1;
            if (i11 >= 0) {
                bVar = (b) this.f24580l.f24558e.get(i11);
            } else {
                bVar = null;
            }
            int[] iArr = bVar3.f24553k;
            if (iArr == null) {
                iArr = this.f24580l.f24554a;
            }
            this.f24569a = iArr;
            if (iArr == null) {
                if (Log.isLoggable(C0637e.f7371a, 3)) {
                    Log.d(C0637e.f7371a, "No valid color table found for frame #" + this.f24579k);
                }
                this.f24583o = 1;
                return null;
            }
            if (bVar3.f24548f) {
                System.arraycopy(iArr, 0, this.f24570b, 0, iArr.length);
                int[] iArr2 = this.f24570b;
                this.f24569a = iArr2;
                iArr2[bVar3.f24550h] = 0;
                if (bVar3.f24549g == 2 && this.f24579k == 0) {
                    this.f24587s = Boolean.TRUE;
                }
            }
            return i(bVar3, bVar);
        }
        if (Log.isLoggable(C0637e.f7371a, 3)) {
            Log.d(C0637e.f7371a, "Unable to decode frame, status=" + this.f24583o);
        }
        return null;
    }

    @Override // q4.a
    public final void b() {
        this.f24579k = (this.f24579k + 1) % this.f24580l.f24556c;
    }

    @Override // q4.a
    public final int c() {
        return this.f24580l.f24556c;
    }

    @Override // q4.a
    public final void clear() {
        u4.b bVar;
        u4.b bVar2;
        u4.b bVar3;
        this.f24580l = null;
        byte[] bArr = this.f24577i;
        if (bArr != null && (bVar3 = ((e5.b) this.f24571c).f13442b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f24578j;
        if (iArr != null && (bVar2 = ((e5.b) this.f24571c).f13442b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f24581m;
        if (bitmap != null) {
            ((e5.b) this.f24571c).f13441a.d(bitmap);
        }
        this.f24581m = null;
        this.f24572d = null;
        this.f24587s = null;
        byte[] bArr2 = this.f24573e;
        if (bArr2 != null && (bVar = ((e5.b) this.f24571c).f13442b) != null) {
            bVar.put(bArr2);
        }
    }

    @Override // q4.a
    public final int d() {
        int i10;
        c cVar = this.f24580l;
        int i11 = cVar.f24556c;
        if (i11 <= 0 || (i10 = this.f24579k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return ((b) cVar.f24558e.get(i10)).f24551i;
    }

    @Override // q4.a
    public final int e() {
        return this.f24579k;
    }

    @Override // q4.a
    public final int f() {
        return (this.f24578j.length * 4) + this.f24572d.limit() + this.f24577i.length;
    }

    public final Bitmap g() {
        Bitmap.Config config;
        Boolean bool = this.f24587s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f24588t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        a.InterfaceC0445a interfaceC0445a = this.f24571c;
        Bitmap c10 = ((e5.b) interfaceC0445a).f13441a.c(this.f24586r, this.f24585q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    @Override // q4.a
    public final ByteBuffer getData() {
        return this.f24572d;
    }

    public final void h(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f24588t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x0045, code lost:
        if (r3.f24563j == r34.f24550h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x040b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap i(q4.b r34, q4.b r35) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.e.i(q4.b, q4.b):android.graphics.Bitmap");
    }
}
