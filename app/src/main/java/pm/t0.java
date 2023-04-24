package pm;

/* loaded from: classes2.dex */
public final class t0 implements b1 {

    /* renamed from: a */
    public final boolean f24394a;

    public t0(boolean z10) {
        this.f24394a = z10;
    }

    @Override // pm.b1
    public final boolean a() {
        return this.f24394a;
    }

    @Override // pm.b1
    public final q1 q() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder a10 = android.support.v4.media.d.a("Empty{");
        if (this.f24394a) {
            str = "Active";
        } else {
            str = "New";
        }
        return a0.a2.a(a10, str, '}');
    }
}
