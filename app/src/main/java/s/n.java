package s;

import android.content.Context;
import d6.e0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26083a;

    public /* synthetic */ n(int i10) {
        this.f26083a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26083a) {
            case 0:
                return;
            case 1:
                Context a10 = o5.v.a();
                v5.f fVar = v5.f.f29104a;
                v5.c.a(v5.c.f29066a, a10, v5.f.f(a10, v5.c.f29074i), false);
                Object obj = v5.c.f29074i;
                ArrayList<String> arrayList = null;
                if (!i6.a.b(v5.f.class)) {
                    try {
                        v5.f fVar2 = v5.f.f29104a;
                        arrayList = fVar2.a(fVar2.e(a10, obj, "subs"));
                    } catch (Throwable th2) {
                        i6.a.a(v5.f.class, th2);
                    }
                }
                v5.c.a(v5.c.f29066a, a10, arrayList, true);
                return;
            default:
                d6.e0 e0Var = d6.e0.f12668a;
                if (!i6.a.b(d6.e0.class)) {
                    try {
                        for (e0.e eVar : d6.e0.f12670c) {
                            eVar.a(true);
                        }
                        d6.e0.f12672e.set(false);
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(d6.e0.class, th3);
                        return;
                    }
                }
                return;
        }
    }
}
