package d8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.DynamiteModule;
import e8.m;
import g8.c;
import g8.k;
import g9.h;
import g9.t;
import h8.g0;
import i8.f0;
import i8.p;
import w.o;

/* loaded from: classes.dex */
public final class a extends g8.c<GoogleSignInOptions> {

    /* renamed from: k */
    public static int f12865k = 1;

    public a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, c8.a.f4582a, googleSignInOptions, new c.a(new o(), Looper.getMainLooper()));
    }

    public final t d() {
        boolean z10;
        BasePendingResult basePendingResult;
        g0 g0Var = this.f15024h;
        Context context = this.f15017a;
        boolean z11 = false;
        if (e() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.f13499a.a("Revoking access", new Object[0]);
        String e10 = e8.b.a(context).e("refreshToken");
        m.b(context);
        if (z10) {
            if (e10 == null) {
                l8.a aVar = e8.e.f13492c;
                Status status = new Status(4, null);
                if (status.f6057b <= 0) {
                    z11 = true;
                }
                p.a("Status code must not be SUCCESS", !z11);
                BasePendingResult kVar = new k(status);
                kVar.e(status);
                basePendingResult = kVar;
            } else {
                e8.e eVar = new e8.e(e10);
                new Thread(eVar).start();
                basePendingResult = eVar.f13494b;
            }
        } else {
            e8.k kVar2 = new e8.k(g0Var);
            g0Var.a(kVar2);
            basePendingResult = kVar2;
        }
        i8.g0 g0Var2 = new i8.g0();
        h hVar = new h();
        basePendingResult.a(new f0(basePendingResult, hVar, g0Var2));
        return hVar.f15034a;
    }

    public final synchronized int e() {
        int i10;
        i10 = f12865k;
        if (i10 == 1) {
            Context context = this.f15017a;
            f8.d dVar = f8.d.f14180d;
            int b10 = dVar.b(context, 12451000);
            if (b10 == 0) {
                f12865k = 4;
                i10 = 4;
            } else if (dVar.a(context, b10, null) == null && DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                f12865k = 3;
                i10 = 3;
            } else {
                f12865k = 2;
                i10 = 2;
            }
        }
        return i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(androidx.fragment.app.x r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8) {
        /*
            r6 = this;
            g8.a<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r3 = c8.a.f4582a
            w.o r0 = new w.o
            r0.<init>()
            android.os.Looper r1 = r7.getMainLooper()
            java.lang.String r2 = "Looper must not be null."
            i8.p.g(r1, r2)
            g8.c$a r5 = new g8.c$a
            r5.<init>(r0, r1)
            r0 = r6
            r1 = r7
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.<init>(androidx.fragment.app.x, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }
}
