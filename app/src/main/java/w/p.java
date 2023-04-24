package w;

import a0.h0;
import a0.j1;
import a0.m0;
import a0.n1;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import v.c0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public final boolean f29505a;

    public p() {
        this.f29505a = v.k.a(c0.class) != null;
    }

    public static h0 a(h0 h0Var) {
        h0.a aVar = new h0.a();
        aVar.f91c = h0Var.f84c;
        for (m0 m0Var : h0Var.a()) {
            aVar.f89a.add(m0Var);
        }
        aVar.c(h0Var.f83b);
        j1 B = j1.B();
        B.E(r.a.A(CaptureRequest.FLASH_MODE), 0);
        aVar.c(new r.a(n1.A(B)));
        return aVar.d();
    }

    public final boolean b(ArrayList arrayList, boolean z10) {
        if (this.f29505a && z10) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
