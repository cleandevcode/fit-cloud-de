package qi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.u0;
import androidx.fragment.app.a1;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.v;
import bi.z0;
import com.airbnb.mvrx.lifecycleAwareLazy;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.topstep.fitcloudpro.R;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import pm.e0;
import sm.e1;
import sm.s0;
import sm.w0;
import um.x;
import x0.i0;
import y3.g1;

/* loaded from: classes2.dex */
public final class h implements g1 {

    /* renamed from: a */
    public static final x f24862a = new x("NO_VALUE");

    public static final w0 c(int i10, int i11, rm.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if ((i10 > 0 || i11 > 0 || fVar == rm.f.SUSPEND) ? true : true) {
                    int i12 = i11 + i10;
                    if (i12 < 0) {
                        i12 = Integer.MAX_VALUE;
                    }
                    return new w0(i10, i12, fVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + fVar).toString());
            }
            throw new IllegalArgumentException(u0.a("extraBufferCapacity cannot be negative, but was ", i11).toString());
        }
        throw new IllegalArgumentException(u0.a("replay cannot be negative, but was ", i10).toString());
    }

    public static final sm.b d(tk.i iVar) {
        return bi.r.l(new vm.d(iVar, null));
    }

    public static final sm.b e(Context context) {
        return bi.r.l(new f(context, null));
    }

    public static final String f(Context context, int i10, String str) {
        String string = context.getString(R.string.colon_params, context.getString(i10), str);
        gm.l.e(string, "getString(\n        R.str…st),\n        second\n    )");
        return string;
    }

    public static final String g(androidx.fragment.app.r rVar, String str) {
        gm.l.f(rVar, "<this>");
        String p02 = rVar.p0(R.string.colon_params, rVar.o0(R.string.user_info_id), str);
        gm.l.e(p02, "getString(\n        R.str…st),\n        second\n    )");
        return p02;
    }

    public static final String h(EditText editText) {
        gm.l.f(editText, "<this>");
        return om.l.x0(editText.getText().toString()).toString();
    }

    public static final v i(androidx.fragment.app.r rVar) {
        gm.l.f(rVar, "<this>");
        a1 q02 = rVar.q0();
        q02.d();
        v vVar = q02.f2313d;
        gm.l.e(vVar, "viewLifecycleOwner.lifecycle");
        return vVar;
    }

    public static final LifecycleCoroutineScopeImpl j(androidx.fragment.app.r rVar) {
        gm.l.f(rVar, "<this>");
        return rm.l.g(rVar.q0());
    }

    public static final void k(v vVar, fm.p pVar) {
        z0.g(tb.a.g(vVar), null, 0, new g(vVar, pVar, null), 3);
    }

    public static final void l(Activity activity) {
        gm.l.f(activity, "<this>");
        Intent a10 = x0.p.a(activity);
        if (a10 != null) {
            a10.addFlags(67108864);
            i0 i0Var = new i0(activity);
            i0Var.b(a10);
            i0Var.f();
            return;
        }
        activity.finish();
    }

    public static final void m(ViewGroup viewGroup, boolean z10) {
        if (viewGroup.isEnabled() != z10) {
            viewGroup.setEnabled(z10);
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Object tag = childAt.getTag();
            if (!(tag instanceof String) || !om.l.c0((CharSequence) tag, "ignoreParentState", false)) {
                if (childAt.isEnabled() != z10) {
                    childAt.setEnabled(z10);
                }
                if ((childAt instanceof ViewGroup) && !(childAt instanceof PreferenceItem)) {
                    m((ViewGroup) childAt, z10);
                }
            }
        }
    }

    public static final s0 n(sm.f fVar, e0 e0Var) {
        gm.l.f(fVar, "<this>");
        return bi.r.K(fVar, e0Var, new e1(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, 0L));
    }

    @Override // y3.g1
    public tl.d b(androidx.fragment.app.r rVar, mm.h hVar, mm.b bVar, fm.a aVar, gm.e eVar, boolean z10, fm.l lVar) {
        gm.l.f(rVar, "fragment");
        gm.l.f(hVar, "viewModelProperty");
        gm.l.f(bVar, "viewModelClass");
        gm.l.f(lVar, "viewModelProvider");
        return new lifecycleAwareLazy(rVar, new y3.h(lVar, rVar));
    }
}
