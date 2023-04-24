package g4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public int f14962a;

    /* renamed from: b */
    public int f14963b;

    /* renamed from: c */
    public int f14964c;

    /* renamed from: d */
    public long f14965d;

    /* renamed from: e */
    public String f14966e;

    /* renamed from: f */
    public String f14967f;

    /* renamed from: g */
    public String f14968g;

    /* renamed from: h */
    public int f14969h;

    /* renamed from: i */
    public d f14970i;

    public d() {
    }

    public d(int i10, d dVar) {
        this.f14962a = i10;
        this.f14963b = dVar.f14963b;
        this.f14964c = dVar.f14964c;
        this.f14965d = dVar.f14965d;
        this.f14966e = dVar.f14966e;
        this.f14967f = dVar.f14967f;
        this.f14968g = dVar.f14968g;
        this.f14969h = dVar.f14969h;
    }

    public final void a(String str, int i10, String str2, String str3) {
        int hashCode;
        int i11;
        this.f14963b = i10;
        this.f14966e = str;
        this.f14967f = str2;
        this.f14968g = str3;
        if (i10 != 1 && i10 != 7 && i10 != 8) {
            if (i10 == 12) {
                i11 = ((str2.hashCode() * str.hashCode()) + i10) & Integer.MAX_VALUE;
                this.f14969h = i11;
            } else if (i10 != 13) {
                hashCode = str3.hashCode() * str2.hashCode() * str.hashCode();
                i11 = (hashCode + i10) & Integer.MAX_VALUE;
                this.f14969h = i11;
            }
        }
        hashCode = str.hashCode();
        i11 = (hashCode + i10) & Integer.MAX_VALUE;
        this.f14969h = i11;
    }
}
