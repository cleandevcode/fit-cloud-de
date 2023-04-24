package h8;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import i8.j;
import java.util.Set;

/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16023a;

    /* renamed from: b */
    public final /* synthetic */ Object f16024b;

    /* renamed from: c */
    public final /* synthetic */ Object f16025c;

    public /* synthetic */ t0(Object obj, Object obj2, int i10) {
        this.f16023a = i10;
        this.f16025c = obj;
        this.f16024b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        boolean z10;
        i8.j i1Var;
        i8.j jVar;
        switch (this.f16023a) {
            case 0:
                v0 v0Var = (v0) this.f16025c;
                f9.k kVar = (f9.k) this.f16024b;
                f8.a aVar = kVar.f14205b;
                boolean z11 = true;
                if (aVar.f14170b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8.j0 j0Var = kVar.f14206c;
                    i8.p.f(j0Var);
                    aVar = j0Var.f16679c;
                    if (aVar.f14170b != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        String valueOf = String.valueOf(aVar);
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    } else {
                        u0 u0Var = v0Var.f16033h;
                        IBinder iBinder = j0Var.f16678b;
                        if (iBinder == null) {
                            jVar = null;
                        } else {
                            int i10 = j.a.f16676a;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof i8.j) {
                                i1Var = (i8.j) queryLocalInterface;
                            } else {
                                i1Var = new i8.i1(iBinder);
                            }
                            jVar = i1Var;
                        }
                        Set<Scope> set = v0Var.f16030e;
                        f0 f0Var = (f0) u0Var;
                        f0Var.getClass();
                        if (jVar != null && set != null) {
                            f0Var.f15947c = jVar;
                            f0Var.f15948d = set;
                            if (f0Var.f15949e) {
                                f0Var.f15945a.g(jVar, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            f0Var.b(new f8.a(4));
                        }
                        ((i8.b) v0Var.f16032g).o();
                        return;
                    }
                }
                ((f0) v0Var.f16033h).b(aVar);
                ((i8.b) v0Var.f16032g).o();
                return;
            default:
                synchronized (((g9.n) this.f16025c).f15046b) {
                    g9.d dVar = ((g9.n) this.f16025c).f15047c;
                    if (dVar != null) {
                        g9.t tVar = (g9.t) this.f16024b;
                        synchronized (tVar.f15057a) {
                            exc = tVar.f15062f;
                        }
                        i8.p.f(exc);
                        dVar.a(exc);
                    }
                }
                return;
        }
    }
}
