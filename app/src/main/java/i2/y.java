package i2;

import android.os.Bundle;
import i2.h0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@h0.b("navigation")
@Metadata
/* loaded from: classes.dex */
public class y extends h0<x> {

    /* renamed from: c */
    public final j0 f16426c;

    public y(j0 j0Var) {
        gm.l.f(j0Var, "navigatorProvider");
        this.f16426c = j0Var;
    }

    @Override // i2.h0
    public final x a() {
        return new x(this);
    }

    @Override // i2.h0
    public final void d(List list, b0 b0Var) {
        boolean z10;
        String str;
        v q10;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            x xVar = (x) jVar.f16294b;
            Bundle bundle = jVar.f16295c;
            int i10 = xVar.f16419l;
            String str2 = xVar.f16421n;
            if (i10 == 0 && str2 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                StringBuilder a10 = android.support.v4.media.d.a("no start destination defined via app:startDestination for ");
                int i11 = xVar.f16410h;
                if (i11 != 0) {
                    str = xVar.f16405c;
                    if (str == null) {
                        str = String.valueOf(i11);
                    }
                } else {
                    str = "the root navigation";
                }
                a10.append(str);
                throw new IllegalStateException(a10.toString().toString());
            }
            if (str2 != null) {
                q10 = xVar.r(str2, false);
            } else {
                q10 = xVar.q(i10, false);
            }
            if (q10 == null) {
                if (xVar.f16420m == null) {
                    String str3 = xVar.f16421n;
                    if (str3 == null) {
                        str3 = String.valueOf(xVar.f16419l);
                    }
                    xVar.f16420m = str3;
                }
                String str4 = xVar.f16420m;
                gm.l.c(str4);
                throw new IllegalArgumentException(android.support.v4.media.a.a("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            this.f16426c.b(q10.f16403a).d(h7.a.p(b().a(q10, q10.f(bundle))), b0Var);
        }
    }
}
