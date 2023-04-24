package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.w;
import java.util.HashMap;
import pm.g0;

/* loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* renamed from: i */
    public static final a f5745i = new a();

    /* renamed from: a */
    public volatile com.bumptech.glide.o f5746a;

    /* renamed from: b */
    public final HashMap f5747b = new HashMap();

    /* renamed from: c */
    public final HashMap f5748c = new HashMap();

    /* renamed from: d */
    public final Handler f5749d;

    /* renamed from: e */
    public final b f5750e;

    /* renamed from: f */
    public final com.bumptech.glide.i f5751f;

    /* renamed from: g */
    public final h f5752g;

    /* renamed from: h */
    public final l f5753h;

    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public o(b bVar, com.bumptech.glide.i iVar) {
        h g0Var;
        new o0.b();
        new o0.b();
        new Bundle();
        bVar = bVar == null ? f5745i : bVar;
        this.f5750e = bVar;
        this.f5751f = iVar;
        this.f5749d = new Handler(Looper.getMainLooper(), this);
        this.f5753h = new l(bVar);
        if (a5.s.f316h && a5.s.f315g) {
            if (iVar.f5678a.containsKey(com.bumptech.glide.g.class)) {
                g0Var = new f();
            } else {
                g0Var = new g();
            }
        } else {
            g0Var = new g0();
        }
        this.f5752g = g0Var;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.o b(Context context) {
        boolean z10;
        boolean z11;
        if (context != null) {
            char[] cArr = m5.l.f20382a;
            boolean z12 = false;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.x) {
                    return c((androidx.fragment.app.x) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return b(activity.getApplicationContext());
                    }
                    if (activity instanceof androidx.fragment.app.x) {
                        return c((androidx.fragment.app.x) activity);
                    }
                    if (!activity.isDestroyed()) {
                        this.f5752g.b();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        Activity a10 = a(activity);
                        z12 = (a10 == null || !a10.isFinishing()) ? true : true;
                        n d10 = d(fragmentManager);
                        com.bumptech.glide.o oVar = d10.f5741d;
                        if (oVar == null) {
                            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(activity);
                            b bVar = this.f5750e;
                            com.bumptech.glide.manager.a aVar = d10.f5738a;
                            n.a aVar2 = d10.f5739b;
                            ((a) bVar).getClass();
                            com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(b10, aVar, aVar2, activity);
                            if (z12) {
                                oVar2.onStart();
                            }
                            d10.f5741d = oVar2;
                            return oVar2;
                        }
                        return oVar;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f5746a == null) {
                synchronized (this) {
                    if (this.f5746a == null) {
                        com.bumptech.glide.b b11 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar2 = this.f5750e;
                        a.g gVar = new a.g(3);
                        w.o oVar3 = new w.o();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar2).getClass();
                        this.f5746a = new com.bumptech.glide.o(b11, gVar, oVar3, applicationContext);
                    }
                }
            }
            return this.f5746a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.o c(androidx.fragment.app.x xVar) {
        boolean z10;
        boolean z11;
        char[] cArr = m5.l.f20382a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return b(xVar.getApplicationContext());
        }
        if (!xVar.isDestroyed()) {
            this.f5752g.b();
            k0 J = xVar.J();
            Activity a10 = a(xVar);
            if (a10 != null && a10.isFinishing()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.f5751f.f5678a.containsKey(com.bumptech.glide.f.class)) {
                Context applicationContext = xVar.getApplicationContext();
                return this.f5753h.a(applicationContext, com.bumptech.glide.b.b(applicationContext), xVar.f701d, xVar.J(), z11);
            }
            return f(xVar, J, null, z11);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final n d(FragmentManager fragmentManager) {
        n nVar = (n) this.f5747b.get(fragmentManager);
        if (nVar == null) {
            n nVar2 = (n) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (nVar2 == null) {
                nVar2 = new n();
                nVar2.f5743f = null;
                this.f5747b.put(fragmentManager, nVar2);
                fragmentManager.beginTransaction().add(nVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f5749d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return nVar2;
        }
        return nVar;
    }

    public final w e(j0 j0Var, androidx.fragment.app.r rVar) {
        w wVar = (w) this.f5748c.get(j0Var);
        if (wVar == null) {
            w wVar2 = (w) j0Var.E("com.bumptech.glide.manager");
            if (wVar2 == null) {
                wVar2 = new w();
                wVar2.f5788q0 = rVar;
                if (rVar != null && rVar.i0() != null) {
                    androidx.fragment.app.r rVar2 = rVar;
                    while (true) {
                        androidx.fragment.app.r rVar3 = rVar2.f2537v;
                        if (rVar3 == null) {
                            break;
                        }
                        rVar2 = rVar3;
                    }
                    j0 j0Var2 = rVar2.f2534s;
                    if (j0Var2 != null) {
                        wVar2.c1(rVar.i0(), j0Var2);
                    }
                }
                this.f5748c.put(j0Var, wVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var);
                aVar.g(0, wVar2, "com.bumptech.glide.manager", 1);
                aVar.e(true);
                this.f5749d.obtainMessage(2, j0Var).sendToTarget();
            }
            return wVar2;
        }
        return wVar;
    }

    public final com.bumptech.glide.o f(Context context, j0 j0Var, androidx.fragment.app.r rVar, boolean z10) {
        w e10 = e(j0Var, rVar);
        com.bumptech.glide.o oVar = e10.f5787p0;
        if (oVar == null) {
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            b bVar = this.f5750e;
            com.bumptech.glide.manager.a aVar = e10.f5783l0;
            w.a aVar2 = e10.f5784m0;
            ((a) bVar).getClass();
            com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(b10, aVar, aVar2, context);
            if (z10) {
                oVar2.onStart();
            }
            e10.f5787p0 = oVar2;
            return oVar2;
        }
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x013e  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.o.handleMessage(android.os.Message):boolean");
    }
}
