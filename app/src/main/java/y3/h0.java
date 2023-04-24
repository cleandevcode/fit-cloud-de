package y3;

import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h0 extends androidx.lifecycle.s0 {

    /* renamed from: d */
    public final String f30958d;

    public h0(androidx.lifecycle.l0 l0Var) {
        gm.l.f(l0Var, "state");
        new ConcurrentHashMap();
        new LinkedHashSet();
        String str = (String) l0Var.c("mavericks:persisted_view_id");
        if (str == null) {
            StringBuilder a10 = android.support.v4.media.d.a("MavericksView_");
            a10.append(UUID.randomUUID());
            str = a10.toString();
            l0Var.d("mavericks:persisted_view_id", str);
        }
        this.f30958d = str;
    }
}
