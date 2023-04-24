package gd;

import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public int f15236a;

    /* renamed from: b */
    public int f15237b;

    /* renamed from: c */
    public int f15238c;

    /* renamed from: d */
    public String f15239d;

    /* renamed from: e */
    public byte f15240e;

    /* renamed from: f */
    public byte[] f15241f;

    /* renamed from: g */
    public byte[] f15242g;

    /* renamed from: h */
    public a f15243h;

    public c(int i10, int i11, int i12, String str, byte b10, byte[] bArr, a aVar) {
        this(i10, i11, i12, str, b10, bArr, aVar, 0);
    }

    public c(int i10, int i11, int i12, String str, byte b10, byte[] bArr, a aVar, int i13) {
        this.f15236a = i10;
        this.f15237b = i11;
        this.f15238c = i12;
        this.f15239d = str;
        this.f15240e = b10;
        this.f15241f = null;
        this.f15242g = bArr;
        this.f15243h = aVar;
    }

    public c(int i10, int i11, String str, byte b10, byte[] bArr) {
        this.f15236a = 0;
        this.f15237b = i10;
        this.f15238c = i11;
        this.f15239d = str;
        this.f15240e = b10;
        this.f15241f = bArr;
    }

    public c(int i10, String str, byte b10, byte[] bArr) {
        this.f15236a = 0;
        this.f15238c = i10;
        this.f15239d = str;
        this.f15240e = b10;
        this.f15241f = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f15236a == cVar.f15236a && this.f15237b == cVar.f15237b && this.f15238c == cVar.f15238c;
        }
        return false;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EqIndex {");
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\neqType=%d, eqMode=%d, index=%d, nickname=%s, sampleRate=0x%02X", Integer.valueOf(this.f15236a), Integer.valueOf(this.f15237b), Integer.valueOf(this.f15238c), this.f15239d, Byte.valueOf(this.f15240e)));
        byte[] bArr = this.f15241f;
        if (bArr != null) {
            a10.append(String.format(locale, "\neqData=(%d)%s", Integer.valueOf(bArr.length), he.a.a(this.f15241f)));
        }
        byte[] bArr2 = this.f15242g;
        if (bArr2 != null) {
            a10.append(String.format(locale, "\neqInfo=(%d)%s", Integer.valueOf(bArr2.length), he.a.a(this.f15242g)));
        }
        if (this.f15243h != null) {
            StringBuilder a11 = android.support.v4.media.d.a("\n\t");
            a11.append(this.f15243h.toString());
            a10.append(a11.toString());
        }
        a10.append("\n}");
        return a10.toString();
    }
}
