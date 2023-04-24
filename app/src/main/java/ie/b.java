package ie;

import android.app.Application;
import bi.z0;
import eb.h;
import eb.j;
import eb.k;
import eb.p;
import gm.l;
import java.util.EnumMap;
import java.util.Locale;
import pm.e0;
import pm.g0;
import pm.z1;
import rm.g;
import sm.a1;
import sm.b1;
import sm.h0;
import sm.q0;
import vd.c;
import xl.d;
import za.f;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: a */
    public static boolean f16771a = true;

    /* renamed from: b */
    public static boolean f16772b = false;

    /* renamed from: c */
    public static final d[] f16773c = new d[0];

    public static final a1 a(sm.f fVar) {
        tm.f fVar2;
        sm.f h10;
        rm.f fVar3 = rm.f.SUSPEND;
        g.N.getClass();
        int i10 = g.a.f25847b;
        if (1 >= i10) {
            i10 = 1;
        }
        int i11 = i10 - 1;
        if ((fVar instanceof tm.f) && (h10 = (fVar2 = (tm.f) fVar).h()) != null) {
            int i12 = fVar2.f28313b;
            if (i12 != -3 && i12 != -2 && i12 != 0) {
                i11 = i12;
            } else if (fVar2.f28314c != fVar3 || i12 == 0) {
                i11 = 0;
            }
            return new a1(i11, fVar2.f28312a, fVar2.f28314c, h10);
        }
        return new a1(i11, xl.g.f30632a, fVar3, fVar);
    }

    public static void c(Application application, boolean z10) {
        f16771a = z10;
        f16772b = rd.b.f25540c;
        ge.b.e(String.format(Locale.US, "{\nLIBRARY_PACKAGE_NAME=%s\n%s:%s:%s\nDEBUG=%b\nBUILD_TYPE=%s\nDEBUG_ENABLE=%b\n}", "com.realsil.sdk.dfu", "com.realsil.sdk", "rtk-dfu", "3.6.4", Boolean.FALSE, "release", Boolean.valueOf(f16771a)), true);
        if (c.f29212m == null) {
            c.i(application);
        }
        vd.b.g(application);
        vd.d.b(application);
        te.a.Q = 1;
    }

    public static final z1 e(e0 e0Var, xl.f fVar, sm.f fVar2, q0 q0Var, b1 b1Var, Object obj) {
        return z0.f(e0Var, fVar, l.a(b1Var, b1.a.f27123a) ? 1 : 4, new h0(b1Var, fVar2, q0Var, obj, null));
    }

    public void b() {
        throw null;
    }

    @Override // za.f
    public bb.b d(String str, za.a aVar, EnumMap enumMap) {
        f gVar;
        switch (aVar.ordinal()) {
            case 0:
                gVar = new a.g(6);
                break;
            case 1:
                gVar = new eb.b();
                break;
            case 2:
                gVar = new eb.f();
                break;
            case 3:
                gVar = new h();
                break;
            case 4:
                gVar = new eb.d();
                break;
            case 5:
                gVar = new h7.a((Object) null);
                break;
            case 6:
                gVar = new k();
                break;
            case 7:
                gVar = new j();
                break;
            case 8:
                gVar = new eb.l();
                break;
            case 9:
            case 12:
            case 13:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
            case 10:
                gVar = new g0();
                break;
            case 11:
                gVar = new com.bumptech.glide.manager.g();
                break;
            case 14:
                gVar = new x8.d();
                break;
            case 15:
                gVar = new p();
                break;
        }
        return gVar.d(str, aVar, enumMap);
    }

    public void f(boolean z10) {
    }

    public void g(boolean z10) {
    }

    public void h() {
        throw null;
    }
}
