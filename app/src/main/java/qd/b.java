package qd;

import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f24794a;

    /* renamed from: b */
    public int f24795b;

    /* renamed from: c */
    public byte f24796c;

    /* renamed from: d */
    public int f24797d;

    /* renamed from: e */
    public int f24798e;

    /* renamed from: f */
    public byte f24799f;

    /* renamed from: g */
    public boolean f24800g;

    /* renamed from: h */
    public boolean f24801h;

    public b(int i10, int i11, byte b10, int i12, int i13, byte b11, boolean z10, boolean z11) {
        this.f24794a = i10;
        this.f24795b = i11;
        this.f24796c = b10;
        this.f24797d = i12;
        this.f24798e = i13;
        this.f24799f = b11;
        this.f24800g = z10;
        this.f24801h = z11;
    }

    public final c a() {
        return new c(this.f24794a, this.f24795b, this.f24796c, this.f24797d, this.f24798e, this.f24799f, this.f24800g, this.f24801h);
    }

    public final String toString() {
        String format;
        StringBuilder a10 = d.a("VpToneVolumeStatusRsp {");
        if (this.f24800g) {
            format = String.format("\n\trwsSyncEnabled=%b", Boolean.valueOf(this.f24801h));
        } else {
            format = String.format("\n\trwsSyncSupported=%b", Boolean.FALSE);
        }
        a10.append(format);
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\n\tL=%d/(%d~%d)", Byte.valueOf(this.f24796c), Integer.valueOf(this.f24794a), Integer.valueOf(this.f24795b)));
        return f3.a.a(locale, "\n\tR=%d/(%d~%d)", new Object[]{Byte.valueOf(this.f24799f), Integer.valueOf(this.f24797d), Integer.valueOf(this.f24798e)}, a10, "\n}");
    }
}
