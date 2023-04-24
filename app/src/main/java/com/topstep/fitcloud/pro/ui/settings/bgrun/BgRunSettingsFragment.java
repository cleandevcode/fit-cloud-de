package com.topstep.fitcloud.pro.ui.settings.bgrun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.q;
import com.topstep.fitcloud.pro.databinding.FragmentBgRunSettingsBinding;
import com.topstep.fitcloudpro.R;
import d7.e;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import kotlin.Metadata;
import lh.i;
import mf.a0;
import mm.h;
import p000do.a;
import pm.e0;
import s.n2;
import xl.d;

@Metadata
/* loaded from: classes2.dex */
public final class BgRunSettingsFragment extends i {

    /* renamed from: s0 */
    public static final /* synthetic */ h<Object>[] f12006s0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12007o0;

    /* renamed from: p0 */
    public ki.a f12008p0;

    /* renamed from: q0 */
    public final q f12009q0;

    /* renamed from: r0 */
    public final a f12010r0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            BgRunSettingsFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            BgRunSettingsFragment bgRunSettingsFragment;
            Intent a10;
            View view2 = view;
            gm.l.f(view2, "view");
            BgRunSettingsFragment bgRunSettingsFragment2 = BgRunSettingsFragment.this;
            h<Object>[] hVarArr = BgRunSettingsFragment.f12006s0;
            if (gm.l.a(view2, bgRunSettingsFragment2.g1().btnPowerSave)) {
                bgRunSettingsFragment = BgRunSettingsFragment.this;
                ki.a aVar = bgRunSettingsFragment.f12008p0;
                if (aVar != null) {
                    a10 = aVar.d();
                } else {
                    gm.l.l("helper");
                    throw null;
                }
            } else {
                if (gm.l.a(view2, BgRunSettingsFragment.this.g1().btnBatteryOptimization)) {
                    ki.a aVar2 = BgRunSettingsFragment.this.f12008p0;
                    if (aVar2 != null) {
                        if (aVar2.b() != null) {
                            BgRunSettingsFragment.this.f12009q0.b(tl.l.f28297a);
                        }
                    } else {
                        gm.l.l("helper");
                        throw null;
                    }
                } else if (gm.l.a(view2, BgRunSettingsFragment.this.g1().btnVivoCustom)) {
                    bgRunSettingsFragment = BgRunSettingsFragment.this;
                    ki.a aVar3 = bgRunSettingsFragment.f12008p0;
                    if (aVar3 != null) {
                        a10 = (Intent) aVar3.f18596f.getValue();
                    } else {
                        gm.l.l("helper");
                        throw null;
                    }
                } else if (gm.l.a(view2, BgRunSettingsFragment.this.g1().btnMiuiCustom)) {
                    bgRunSettingsFragment = BgRunSettingsFragment.this;
                    ki.a aVar4 = bgRunSettingsFragment.f12008p0;
                    if (aVar4 != null) {
                        a10 = (Intent) aVar4.f18595e.getValue();
                    } else {
                        gm.l.l("helper");
                        throw null;
                    }
                } else if (gm.l.a(view2, BgRunSettingsFragment.this.g1().btnAutostartPermission)) {
                    bgRunSettingsFragment = BgRunSettingsFragment.this;
                    ki.a aVar5 = bgRunSettingsFragment.f12008p0;
                    if (aVar5 != null) {
                        a10 = aVar5.a();
                    } else {
                        gm.l.l("helper");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
            if (a10 != null) {
                try {
                    bgRunSettingsFragment.b1(a10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    e.d(bgRunSettingsFragment.f1(), R.string.bg_run_not_supported, null, 0, 30);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e.a<tl.l, tl.l> {
        public b() {
            BgRunSettingsFragment.this = r1;
        }

        @Override // e.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            gm.l.f(componentActivity, "context");
            gm.l.f((tl.l) obj, "input");
            ki.a aVar = BgRunSettingsFragment.this.f12008p0;
            if (aVar != null) {
                Intent b10 = aVar.b();
                gm.l.c(b10);
                return b10;
            }
            gm.l.l("helper");
            throw null;
        }

        @Override // e.a
        public final /* bridge */ /* synthetic */ Object c(Intent intent, int i10) {
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.bgrun.BgRunSettingsFragment$onResume$1", f = "BgRunSettingsFragment.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12013e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d<? super c> dVar) {
            super(2, dVar);
            BgRunSettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12013e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                this.f12013e = 1;
                if (a0.g(1500L, this) == aVar) {
                    return aVar;
                }
            }
            BgRunSettingsFragment bgRunSettingsFragment = BgRunSettingsFragment.this;
            h<Object>[] hVarArr = BgRunSettingsFragment.f12006s0;
            bgRunSettingsFragment.h1();
            return tl.l.f28297a;
        }
    }

    static {
        t tVar = new t(BgRunSettingsFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBgRunSettingsBinding;", 0);
        b0.f15488a.getClass();
        f12006s0 = new h[]{tVar};
    }

    public BgRunSettingsFragment() {
        super(R.layout.fragment_bg_run_settings);
        this.f12007o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBgRunSettingsBinding.class, this);
        this.f12009q0 = R0(new n2(13, this), new b());
        this.f12010r0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f12008p0 = new ki.a(V0());
        a.b bVar = p000do.a.f13275a;
        bVar.t("BgRunSettings");
        ki.a aVar = this.f12008p0;
        if (aVar != null) {
            bVar.h(aVar.toString(), new Object[0]);
        } else {
            gm.l.l("helper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        qi.h.j(this).b(new c(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0202  */
    @Override // lh.c, androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.bgrun.BgRunSettingsFragment.O0(android.view.View, android.os.Bundle):void");
    }

    public final FragmentBgRunSettingsBinding g1() {
        return (FragmentBgRunSettingsBinding) this.f12007o0.a(this, f12006s0[0]);
    }

    public final void h1() {
        LinearLayout linearLayout = g1().layoutBatteryOptimization;
        gm.l.e(linearLayout, "viewBind.layoutBatteryOptimization");
        ki.a aVar = this.f12008p0;
        if (aVar != null) {
            linearLayout.setVisibility(aVar.e() ^ true ? 0 : 8);
        } else {
            gm.l.l("helper");
            throw null;
        }
    }
}
