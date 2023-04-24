package en;

import ln.s;
import zm.c0;
import zm.s;

/* loaded from: classes2.dex */
public final class h extends c0 {

    /* renamed from: b */
    public final String f13860b;

    /* renamed from: c */
    public final long f13861c;

    /* renamed from: d */
    public final ln.g f13862d;

    public h(String str, long j10, s sVar) {
        this.f13860b = str;
        this.f13861c = j10;
        this.f13862d = sVar;
    }

    @Override // zm.c0
    public final long a() {
        return this.f13861c;
    }

    @Override // zm.c0
    public final zm.s b() {
        String str = this.f13860b;
        if (str != null) {
            zm.s.f32677f.getClass();
            try {
                return s.a.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // zm.c0
    public final ln.g h() {
        return this.f13862d;
    }
}
