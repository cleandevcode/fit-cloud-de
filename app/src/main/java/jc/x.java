package jc;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import y.i0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public androidx.fragment.app.x f17622a;

    /* renamed from: b */
    public androidx.fragment.app.r f17623b;

    /* renamed from: d */
    public Set<String> f17625d;

    /* renamed from: e */
    public Set<String> f17626e;

    /* renamed from: f */
    public boolean f17627f;

    /* renamed from: g */
    public boolean f17628g;

    /* renamed from: n */
    public si.e f17635n;

    /* renamed from: o */
    public s5.b f17636o;

    /* renamed from: p */
    public i0 f17637p;

    /* renamed from: c */
    public int f17624c = -1;

    /* renamed from: h */
    public LinkedHashSet f17629h = new LinkedHashSet();

    /* renamed from: i */
    public LinkedHashSet f17630i = new LinkedHashSet();

    /* renamed from: j */
    public LinkedHashSet f17631j = new LinkedHashSet();

    /* renamed from: k */
    public LinkedHashSet f17632k = new LinkedHashSet();

    /* renamed from: l */
    public LinkedHashSet f17633l = new LinkedHashSet();

    /* renamed from: m */
    public LinkedHashSet f17634m = new LinkedHashSet();

    public x(androidx.fragment.app.x xVar, androidx.fragment.app.r rVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        if (xVar != null) {
            this.f17622a = xVar;
        }
        if (xVar == null && rVar != null) {
            this.f17622a = rVar.T0();
        }
        this.f17623b = rVar;
        this.f17625d = linkedHashSet;
        this.f17626e = linkedHashSet2;
    }

    public final androidx.fragment.app.x a() {
        androidx.fragment.app.x xVar = this.f17622a;
        if (xVar != null) {
            return xVar;
        }
        gm.l.l(InnerShareParams.ACTIVITY);
        throw null;
    }

    public final j0 b() {
        androidx.fragment.app.r rVar = this.f17623b;
        j0 h02 = rVar != null ? rVar.h0() : null;
        if (h02 == null) {
            k0 J = a().J();
            gm.l.e(J, "activity.supportFragmentManager");
            return J;
        }
        return h02;
    }

    public final u c() {
        androidx.fragment.app.r E = b().E("InvisibleFragment");
        if (E != null) {
            return (u) E;
        }
        u uVar = new u();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(b());
        aVar.g(0, uVar, "InvisibleFragment", 1);
        if (!aVar.f2569g) {
            aVar.f2570h = false;
            aVar.f2306q.z(aVar, true);
            return uVar;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final int d() {
        return a().getApplicationInfo().targetSdkVersion;
    }

    public final void e(Set<String> set, c cVar) {
        gm.l.f(set, "permissions");
        gm.l.f(cVar, "chainTask");
        u c10 = c();
        c10.f17603m0 = this;
        c10.f17604n0 = cVar;
        androidx.fragment.app.q qVar = c10.f17605o0;
        Object[] array = set.toArray(new String[0]);
        gm.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        qVar.b(array);
    }

    public final void f(final c cVar, final boolean z10, final si.a aVar) {
        gm.l.f(cVar, "chainTask");
        this.f17628g = true;
        final ArrayList j12 = aVar.j1();
        if (j12.isEmpty()) {
            cVar.b();
            return;
        }
        j0 b10 = b();
        aVar.f2479y0 = false;
        aVar.f2480z0 = true;
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(b10);
        aVar2.f2578p = true;
        aVar2.g(0, aVar, "PermissionXRationaleDialogFragment", 1);
        aVar2.f();
        Button k12 = aVar.k1();
        Button i12 = aVar.i1();
        aVar.f1(false);
        k12.setClickable(true);
        k12.setOnClickListener(new View.OnClickListener() { // from class: jc.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ic.b bVar = aVar;
                boolean z11 = z10;
                c cVar2 = cVar;
                List<String> list = j12;
                x xVar = this;
                gm.l.f(bVar, "$dialogFragment");
                gm.l.f(cVar2, "$chainTask");
                gm.l.f(list, "$permissions");
                gm.l.f(xVar, "this$0");
                bVar.c1(false, false);
                if (z11) {
                    cVar2.a(list);
                    return;
                }
                xVar.f17634m.clear();
                xVar.f17634m.addAll(list);
                u c10 = xVar.c();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, c10.T0().getPackageName(), null));
                c10.f17613w0.b(intent);
            }
        });
        if (i12 != null) {
            i12.setClickable(true);
            i12.setOnClickListener(new w(aVar, cVar, 0));
        }
    }
}
