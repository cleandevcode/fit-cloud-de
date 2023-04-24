package nd;

import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public boolean f22328a;

    /* renamed from: d */
    public int f22331d;

    /* renamed from: e */
    public boolean f22332e;

    /* renamed from: g */
    public int f22334g;

    /* renamed from: h */
    public boolean f22335h;

    /* renamed from: j */
    public int f22337j;

    /* renamed from: b */
    public int f22329b = 0;

    /* renamed from: c */
    public byte f22330c = 0;

    /* renamed from: f */
    public byte f22333f = 0;

    /* renamed from: i */
    public boolean f22336i = false;

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("RwsInfo{");
        boolean z10 = this.f22328a;
        if (z10) {
            Locale locale = Locale.US;
            a10.append(String.format(locale, "isRws=%b, activeBud=%d", Boolean.valueOf(z10), Integer.valueOf(this.f22329b)));
            a10.append(String.format(locale, "\n\tL: connected=%b, channel=%d, battery=%d\n\tR: connected=%b, channel=%d, battery=%d", Boolean.valueOf(this.f22332e), Byte.valueOf(this.f22330c), Integer.valueOf(this.f22331d), Boolean.valueOf(this.f22335h), Byte.valueOf(this.f22333f), Integer.valueOf(this.f22334g)));
        }
        if (this.f22336i) {
            a10.append(String.format(Locale.US, "\n\tcaseBatteryValue=%d", Integer.valueOf(this.f22337j)));
        }
        a10.append("\n}");
        return a10.toString();
    }
}
