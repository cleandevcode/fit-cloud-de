package tc;

import android.annotation.TargetApi;

@TargetApi(31)
/* loaded from: classes.dex */
public final class i0 implements d0 {

    /* renamed from: a */
    public final m f27982a;

    /* renamed from: b */
    public final p f27983b;

    /* renamed from: c */
    public final boolean f27984c;

    /* renamed from: d */
    public final boolean f27985d;

    public i0(m mVar, p pVar, boolean z10, boolean z11) {
        this.f27982a = mVar;
        this.f27983b = pVar;
        this.f27984c = z10;
        this.f27985d = z11;
    }

    @Override // tc.d0
    public final boolean a() {
        boolean z10;
        if (this.f27984c) {
            z10 = false;
        } else {
            z10 = !this.f27985d;
        }
        if (z10 && !this.f27982a.a()) {
            return false;
        }
        return true;
    }

    @Override // tc.d0
    public final boolean b() {
        p pVar = this.f27983b;
        boolean z10 = true;
        for (String[] strArr : pVar.f28011b) {
            z10 &= pVar.f28010a.a(strArr);
        }
        return z10;
    }
}
