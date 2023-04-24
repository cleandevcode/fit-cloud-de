package tc;

/* loaded from: classes.dex */
public final class g0 implements d0 {

    /* renamed from: a */
    public final m f27970a;

    /* renamed from: b */
    public final p f27971b;

    /* renamed from: c */
    public final boolean f27972c;

    /* renamed from: d */
    public final int f27973d;

    /* renamed from: e */
    public final int f27974e;

    public g0(m mVar, p pVar, int i10, int i11, boolean z10) {
        this.f27970a = mVar;
        this.f27971b = pVar;
        this.f27973d = i10;
        this.f27974e = i11;
        this.f27972c = z10;
    }

    @Override // tc.d0
    public final boolean a() {
        boolean z10;
        if (!this.f27972c && (this.f27974e >= 29 || this.f27973d >= 23)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f27970a.a()) {
            return true;
        }
        return false;
    }

    @Override // tc.d0
    public final boolean b() {
        p pVar = this.f27971b;
        boolean z10 = true;
        for (String[] strArr : pVar.f28011b) {
            z10 &= pVar.f28010a.a(strArr);
        }
        return z10;
    }
}
