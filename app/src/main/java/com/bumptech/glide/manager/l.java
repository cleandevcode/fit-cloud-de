package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.j0;
import com.bumptech.glide.manager.o;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final HashMap f5736a = new HashMap();

    /* renamed from: b */
    public final o.b f5737b;

    /* loaded from: classes.dex */
    public final class a implements p {
        public a(l lVar, j0 j0Var) {
        }
    }

    public l(o.b bVar) {
        this.f5737b = bVar;
    }

    public final com.bumptech.glide.o a(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.v vVar, j0 j0Var, boolean z10) {
        m5.l.a();
        m5.l.a();
        com.bumptech.glide.o oVar = (com.bumptech.glide.o) this.f5736a.get(vVar);
        if (oVar == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(vVar);
            o.b bVar2 = this.f5737b;
            a aVar = new a(this, j0Var);
            ((o.a) bVar2).getClass();
            com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(bVar, lifecycleLifecycle, aVar, context);
            this.f5736a.put(vVar, oVar2);
            lifecycleLifecycle.f(new k(this, vVar));
            if (z10) {
                oVar2.onStart();
            }
            return oVar2;
        }
        return oVar;
    }
}
