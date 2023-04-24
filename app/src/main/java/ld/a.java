package ld;

import android.support.v4.media.d;
import java.util.Locale;
import nd.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public byte f19439a;

    /* renamed from: b */
    public byte f19440b;

    /* renamed from: c */
    public byte f19441c;

    /* renamed from: d */
    public byte f19442d;

    /* renamed from: e */
    public int f19443e;

    /* renamed from: f */
    public int f19444f;

    /* renamed from: g */
    public boolean f19445g;

    /* renamed from: h */
    public int f19446h;

    public a(byte b10, byte b11, byte b12, byte b13, int i10, int i11, int i12, boolean z10) {
        this.f19439a = b10;
        this.f19440b = b11;
        this.f19441c = b12;
        this.f19442d = b13;
        this.f19443e = i10;
        this.f19444f = i11;
        this.f19445g = z10;
        this.f19446h = i12;
    }

    public final c a() {
        byte b10 = this.f19439a;
        byte b11 = this.f19440b;
        byte b12 = this.f19441c;
        int i10 = this.f19443e;
        return new c(b10, b11, b12, this.f19442d, i10, this.f19444f, this.f19446h, this.f19445g);
    }

    public final String toString() {
        StringBuilder a10 = d.a("BudInfoReportEvent{");
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\n\tbudType=%02X, activeBud=%02X", Byte.valueOf(this.f19439a), Byte.valueOf(this.f19440b)));
        a10.append(String.format(locale, "\n\tLCH: channel=%02X, battery=%d(0x%02X) }", Byte.valueOf(this.f19441c), Integer.valueOf(this.f19443e), Integer.valueOf(this.f19443e)));
        a10.append(String.format(locale, "\n\tRCH: channel=%02X, battery=%d(0x%02X) }", Byte.valueOf(this.f19442d), Integer.valueOf(this.f19444f), Integer.valueOf(this.f19444f)));
        if (this.f19445g) {
            a10.append(String.format(locale, "\n\tCASE: battery=%d(0x%02X) }", Integer.valueOf(this.f19446h), Integer.valueOf(this.f19446h)));
        }
        a10.append("\n}");
        return a10.toString();
    }
}
