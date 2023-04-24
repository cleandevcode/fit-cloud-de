package q6;

import android.os.Bundle;
import d6.m0;
import gm.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import r6.m;
import sa.p;
import ul.s;

/* loaded from: classes.dex */
public final class c implements p {
    public static final Bundle b(UUID uuid, r6.d dVar, boolean z10) {
        l.f(uuid, "callId");
        l.f(dVar, "shareContent");
        if (dVar instanceof r6.f) {
            return c((r6.f) dVar, z10);
        }
        if (dVar instanceof r6.j) {
            r6.j jVar = (r6.j) dVar;
            Collection h10 = ge.b.h(jVar, uuid);
            if (h10 == null) {
                h10 = s.f28879a;
            }
            Bundle c10 = c(jVar, z10);
            c10.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(h10));
            return c10;
        }
        boolean z11 = dVar instanceof m;
        return null;
    }

    public static Bundle c(r6.d dVar, boolean z10) {
        boolean z11;
        Bundle bundle = new Bundle();
        m0 m0Var = m0.f12709a;
        m0.J(bundle, "com.facebook.platform.extra.LINK", dVar.f25353a);
        m0.I(bundle, "com.facebook.platform.extra.PLACE", dVar.f25355c);
        m0.I(bundle, "com.facebook.platform.extra.REF", dVar.f25357e);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z10);
        List<String> list = dVar.f25354b;
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }

    @Override // sa.p
    public Object a() {
        return new TreeSet();
    }
}
