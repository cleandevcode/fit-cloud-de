package gk;

import android.content.Context;
import gm.l;
import ih.v;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: gk.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0273a {
        Set<Boolean> e();
    }

    public static boolean a(Context context) {
        boolean z10;
        l.f(context, "context");
        Set<Boolean> e10 = ((InterfaceC0273a) v.f(h7.a.j(context.getApplicationContext()), InterfaceC0273a.class)).e();
        if (e10.size() <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h7.a.h(z10, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (e10.isEmpty()) {
            return true;
        }
        return e10.iterator().next().booleanValue();
    }
}
