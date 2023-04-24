package gd;

import java.util.Locale;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b */
    public byte f15245b;

    /* renamed from: c */
    public int f15246c;

    /* renamed from: d */
    public int f15247d;

    /* renamed from: g */
    public int f15250g;

    /* renamed from: h */
    public int f15251h;

    /* renamed from: i */
    public int f15252i;

    /* renamed from: l */
    public int f15255l;

    /* renamed from: m */
    public int f15256m;

    /* renamed from: n */
    public int f15257n;

    /* renamed from: o */
    public int f15258o;

    /* renamed from: p */
    public int f15259p;

    /* renamed from: q */
    public int f15260q;

    /* renamed from: r */
    public int f15261r;

    /* renamed from: t */
    public int f15263t;

    /* renamed from: u */
    public int f15264u;

    /* renamed from: v */
    public int f15265v;

    /* renamed from: a */
    public boolean f15244a = true;

    /* renamed from: e */
    public int f15248e = 0;

    /* renamed from: f */
    public boolean f15249f = true;

    /* renamed from: j */
    public boolean f15253j = true;

    /* renamed from: k */
    public boolean f15254k = true;

    /* renamed from: s */
    public int f15262s = 0;

    public final void a(int i10, int i11, int i12) {
        if (i10 != 0) {
            this.f15265v = i12;
        } else if (i11 == 0) {
            this.f15252i = i12;
        } else if (i11 == 1) {
            this.f15257n = i12;
        } else if (i11 == 2) {
            this.f15260q = i12;
        }
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EqInfo{");
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\nenabled=%b, supportedSampleRate=%d, activeSampleRate=%d", Boolean.valueOf(this.f15244a), Integer.valueOf(this.f15246c), Byte.valueOf(this.f15245b)));
        a10.append("\n\tSpk:");
        a10.append(String.format(locale, "\n\t\teqSaveNum=%d, activeMode=%d", Integer.valueOf(this.f15247d), Integer.valueOf(this.f15248e)));
        a10.append(String.format(locale, "\n\t\tnormal: eq=%b, entryNumber=%d, spkNormalIndexMap=%d, activeIndex=%d", Boolean.valueOf(this.f15249f), Integer.valueOf(this.f15250g), Integer.valueOf(this.f15251h), Integer.valueOf(this.f15252i)));
        a10.append(String.format(locale, "\n\t\tgaming: state=%b, eq=%b, entryNumber=%d, spkGamingIndexMap=%d, activeIndex=%d", Boolean.valueOf(this.f15253j), Boolean.valueOf(this.f15254k), Integer.valueOf(this.f15255l), Integer.valueOf(this.f15256m), Integer.valueOf(this.f15257n)));
        a10.append(String.format(locale, "\n\t\tanc: entryNumber=%d, spkAncIndexMap=%d, activeIndex=%d", Integer.valueOf(this.f15258o), Integer.valueOf(this.f15259p), Integer.valueOf(this.f15260q)));
        a10.append("\n\tMic:");
        a10.append(String.format(locale, "\n\t\teqSaveNum=%d, activeMode=%d", Integer.valueOf(this.f15261r), Integer.valueOf(this.f15262s)));
        return f3.a.a(locale, "\n\t\tapt:entryNumber=%d, micAptIndexMap=%d, activeIndex=%d", new Object[]{Integer.valueOf(this.f15263t), Integer.valueOf(this.f15264u), Integer.valueOf(this.f15265v)}, a10, "\n}");
    }
}
