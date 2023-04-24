package qd;

import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public int f24785a;

    /* renamed from: b */
    public int f24786b;

    /* renamed from: c */
    public int f24787c;

    /* renamed from: d */
    public byte f24788d;

    /* renamed from: e */
    public int f24789e;

    /* renamed from: f */
    public int f24790f;

    /* renamed from: g */
    public byte f24791g;

    /* renamed from: h */
    public boolean f24792h;

    /* renamed from: i */
    public boolean f24793i;

    public a(int i10, int i11, int i12, byte b10, int i13, int i14, byte b11, boolean z10, boolean z11) {
        this.f24785a = i10;
        this.f24786b = i11;
        this.f24787c = i12;
        this.f24788d = b10;
        this.f24789e = i13;
        this.f24790f = i14;
        this.f24791g = b11;
        this.f24792h = z10;
        this.f24793i = z11;
    }

    public final c a() {
        return new c(this.f24786b, this.f24787c, this.f24788d, this.f24789e, this.f24790f, this.f24791g, this.f24792h, this.f24793i);
    }

    public final String toString() {
        String format;
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "VpToneVolumeLevelSetRsp { status=0x%02X", Integer.valueOf(this.f24785a)));
        if (this.f24792h) {
            format = String.format("\n\trwsSyncEnabled=%b", Boolean.valueOf(this.f24793i));
        } else {
            format = String.format("\n\trwsSyncSupported=%b", Boolean.FALSE);
        }
        sb2.append(format);
        sb2.append(String.format(locale, "\n\tL=%d/(%d~%d)", Byte.valueOf(this.f24788d), Integer.valueOf(this.f24786b), Integer.valueOf(this.f24787c)));
        return f3.a.a(locale, "\n\tR=%d/(%d~%d)", new Object[]{Byte.valueOf(this.f24791g), Integer.valueOf(this.f24789e), Integer.valueOf(this.f24790f)}, sb2, "\n}");
    }
}
