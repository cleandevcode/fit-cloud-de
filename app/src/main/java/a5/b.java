package a5;

import android.app.AlertDialog;
import android.graphics.drawable.BitmapDrawable;
import h8.g1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements r4.k {

    /* renamed from: a */
    public final Object f263a;

    /* renamed from: b */
    public final Object f264b;

    public b(g1 g1Var, AlertDialog alertDialog) {
        this.f264b = g1Var;
        this.f263a = alertDialog;
    }

    public static void a(r2.f fVar, pg.d dVar) {
        fVar.H(1, dVar.f24027d);
        String str = dVar.f24028e;
        if (str == null) {
            fVar.m0(2);
        } else {
            fVar.p(2, str);
        }
        String str2 = dVar.f24029f;
        if (str2 == null) {
            fVar.m0(3);
        } else {
            fVar.p(3, str2);
        }
        String str3 = dVar.f24030g;
        if (str3 == null) {
            fVar.m0(4);
        } else {
            fVar.p(4, str3);
        }
        fVar.H(5, dVar.f24031h);
        fVar.H(6, dVar.f24032i);
        fVar.H(7, dVar.f24053b);
        fVar.H(8, dVar.f24054c);
    }

    @Override // r4.k
    public final r4.c b(r4.h hVar) {
        return ((r4.k) this.f264b).b(hVar);
    }

    public final void c(List list) {
        r2.f t10 = ((r2.b) this.f264b).t("INSERT OR REPLACE INTO `StringTypedEntity` (`userId`,`type`,`data`) VALUES (?,?,?)");
        try {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                pg.i iVar = (pg.i) it.next();
                p000do.a.f13275a.b("StringTypedEntity Migrate:%s", iVar.toString());
                t10.H(1, iVar.f24049a);
                t10.H(2, iVar.f24050b);
                String str = iVar.f24051c;
                if (str == null) {
                    t10.m0(3);
                } else {
                    t10.p(3, str);
                }
                t10.F0();
            }
        } catch (Exception e10) {
            p000do.a.a(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(mf.h0 r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.b.d(mf.h0):void");
    }

    @Override // r4.d
    public final boolean e(Object obj, File file, r4.h hVar) {
        return ((r4.k) this.f264b).e(new e(((BitmapDrawable) ((t4.x) obj).get()).getBitmap(), (u4.d) this.f263a), file, hVar);
    }

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f263a = obj;
        this.f264b = obj2;
    }
}
