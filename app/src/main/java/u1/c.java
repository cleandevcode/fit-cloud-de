package u1;

import android.content.Context;
import fm.l;
import java.util.List;
import mm.h;
import pm.e0;
import s1.q;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final String f28471a;

    /* renamed from: b */
    public final l<Context, List<s1.d<v1.d>>> f28472b;

    /* renamed from: c */
    public final e0 f28473c;

    /* renamed from: d */
    public final Object f28474d;

    /* renamed from: e */
    public volatile v1.b f28475e;

    public c(String str, l lVar, e0 e0Var) {
        gm.l.f(str, "name");
        this.f28471a = str;
        this.f28472b = lVar;
        this.f28473c = e0Var;
        this.f28474d = new Object();
    }

    public final Object a(Object obj, h hVar) {
        v1.b bVar;
        Context context = (Context) obj;
        gm.l.f(context, "thisRef");
        gm.l.f(hVar, "property");
        v1.b bVar2 = this.f28475e;
        if (bVar2 == null) {
            synchronized (this.f28474d) {
                if (this.f28475e == null) {
                    Context applicationContext = context.getApplicationContext();
                    l<Context, List<s1.d<v1.d>>> lVar = this.f28472b;
                    gm.l.e(applicationContext, "applicationContext");
                    List<s1.d<v1.d>> k10 = lVar.k(applicationContext);
                    e0 e0Var = this.f28473c;
                    b bVar3 = new b(applicationContext, this);
                    gm.l.f(k10, "migrations");
                    gm.l.f(e0Var, "scope");
                    this.f28475e = new v1.b(new q(new v1.c(bVar3), h7.a.p(new s1.e(k10, null)), new hh.c(), e0Var));
                }
                bVar = this.f28475e;
                gm.l.c(bVar);
            }
            return bVar;
        }
        return bVar2;
    }
}
