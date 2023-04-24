package pm;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a */
    public static final j0 f24347a;

    static {
        String str;
        boolean z10;
        j0 j0Var;
        int i10 = um.y.f28943a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (z10) {
            wm.c cVar = o0.f24381a;
            p1 p1Var = um.q.f28935a;
            p1Var.q0();
            if (p1Var instanceof j0) {
                j0Var = (j0) p1Var;
                f24347a = j0Var;
            }
        }
        j0Var = h0.f24343i;
        f24347a = j0Var;
    }
}
