package s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final List<a0.w1> f26239a;

    public x0(n1 n1Var, ArrayList arrayList) {
        boolean z10;
        if (n1Var.f26096l == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder a10 = android.support.v4.media.d.a("CaptureSession state must be OPENED. Current state:");
        a10.append(p1.b(n1Var.f26096l));
        h1.e(a10.toString(), z10);
        this.f26239a = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
