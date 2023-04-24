package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import bi.g0;
import bi.m0;
import bi.z0;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding;
import com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment;
import com.topstep.fitcloudpro.R;
import fl.k;
import fm.p;
import gm.b0;
import gm.m;
import ih.v;
import jj.l;
import jj.z;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.l;
import og.t;
import og.x0;
import pm.e0;
import sm.f;
import sm.g;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class SedentaryFragment extends g0 implements CompoundButton.OnCheckedChangeListener, TimePickerDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11295v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11296r0;

    /* renamed from: s0 */
    public t f11297s0;

    /* renamed from: t0 */
    public l f11298t0;

    /* renamed from: u0 */
    public final a f11299u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            SedentaryFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            SedentaryFragment sedentaryFragment = SedentaryFragment.this;
            h<Object>[] hVarArr = SedentaryFragment.f11295v0;
            if (gm.l.a(view2, sedentaryFragment.f1().itemStartTime)) {
                SedentaryFragment sedentaryFragment2 = SedentaryFragment.this;
                l lVar = sedentaryFragment2.f11298t0;
                if (lVar != null) {
                    m0.F(lVar.g(), sedentaryFragment2);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, SedentaryFragment.this.f1().itemEndTime)) {
                SedentaryFragment sedentaryFragment3 = SedentaryFragment.this;
                l lVar2 = sedentaryFragment3.f11298t0;
                if (lVar2 != null) {
                    m0.D(lVar2.f(), sedentaryFragment3);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment$onViewCreated$1", f = "SedentaryFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11301e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment$onViewCreated$1$1", f = "SedentaryFragment.kt", l = {45}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11303e;

            /* renamed from: f */
            public final /* synthetic */ SedentaryFragment f11304f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0188a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ SedentaryFragment f11305a;

                public C0188a(SedentaryFragment sedentaryFragment) {
                    this.f11305a = sedentaryFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SedentaryFragment sedentaryFragment = this.f11305a;
                    h<Object>[] hVarArr = SedentaryFragment.f11295v0;
                    LinearLayout linearLayout = sedentaryFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11305a.h1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SedentaryFragment sedentaryFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11304f = sedentaryFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11304f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11303e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11304f.f11297s0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0188a c0188a = new C0188a(this.f11304f);
                        this.f11303e = 1;
                        if (a10.a(c0188a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("deviceManager");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment$onViewCreated$1$2", f = "SedentaryFragment.kt", l = {53}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0189b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11306e;

            /* renamed from: f */
            public final /* synthetic */ SedentaryFragment f11307f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ SedentaryFragment f11308a;

                public a(SedentaryFragment sedentaryFragment) {
                    this.f11308a = sedentaryFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    l lVar = (l) obj;
                    l lVar2 = this.f11308a.f11298t0;
                    if (lVar2 != null) {
                        if (!gm.l.a(lVar2, lVar)) {
                            SedentaryFragment sedentaryFragment = this.f11308a;
                            sedentaryFragment.f11298t0 = lVar;
                            sedentaryFragment.h1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0189b(SedentaryFragment sedentaryFragment, d<? super C0189b> dVar) {
                super(2, dVar);
                this.f11307f = sedentaryFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0189b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0189b(this.f11307f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11306e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11307f.f11297s0;
                    if (tVar != null) {
                        jj.l lVar = (jj.l) tVar.D().f23334a;
                        ql.b<Byte> bVar = lVar.f17932f;
                        l.d dVar = new l.d(new jj.t((byte) 39));
                        bVar.getClass();
                        sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new z(lVar)))));
                        a aVar2 = new a(this.f11307f);
                        this.f11306e = 1;
                        if (d10.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("deviceManager");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<? super b> dVar) {
            super(2, dVar);
            SedentaryFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11301e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11301e;
            z0.g(e0Var, null, 0, new a(SedentaryFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0189b(SedentaryFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(SedentaryFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSedentaryBinding;", 0);
        b0.f15488a.getClass();
        f11295v0 = new h[]{tVar};
    }

    public SedentaryFragment() {
        super(R.layout.fragment_sedentary);
        this.f11296r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSedentaryBinding.class, this);
        this.f11299u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11297s0;
        if (tVar != null) {
            this.f11298t0 = new nj.l(((jj.l) tVar.D().f23334a).f17931e.get((byte) 39));
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment.b
    public final void H(int i10, String str) {
        if (gm.l.a("start_time", str) || gm.l.a("end_time", str)) {
            nj.l lVar = this.f11298t0;
            if (lVar != null) {
                l.a z10 = v.z(lVar);
                if (gm.l.a("start_time", str)) {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr = z10.f21880b;
                    bArr[1] = (byte) ((i10 >> 8) & 255);
                    bArr[2] = (byte) (i10 & 255);
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr2 = z10.f21880b;
                    bArr2[3] = (byte) ((i10 >> 8) & 255);
                    bArr2[4] = (byte) (i10 & 255);
                }
                g1(z10.b());
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(null));
        f1().itemDetailEnabled.getSwitchView().setOnCheckedChangeListener(this);
        f1().itemDnd.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(f1().itemStartTime, this.f11299u0);
        p.b.g(f1().itemEndTime, this.f11299u0);
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = f1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    public final FragmentSedentaryBinding f1() {
        return (FragmentSedentaryBinding) this.f11296r0.a(this, f11295v0[0]);
    }

    public final void g1(nj.l lVar) {
        t tVar = this.f11297s0;
        if (tVar != null) {
            og.f D = tVar.D();
            D.getClass();
            a0.j(D.f23335b, new og.k(D, lVar, null));
            this.f11298t0 = lVar;
            h1();
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c5, code lost:
        if (r0.g() <= 840) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h1() {
        /*
            r8 = this;
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r0 = r8.f1()
            android.widget.LinearLayout r0 = r0.layoutContent
            boolean r0 = r0.isEnabled()
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r1 = r8.f1()
            com.github.kilnn.tool.widget.item.PreferenceItem r1 = r1.itemDetailEnabled
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.getSwitchView()
            nj.l r2 = r8.f11298t0
            r3 = 0
            java.lang.String r4 = "config"
            if (r2 == 0) goto Le2
            byte[] r2 = r2.f21878b
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L23
            r2 = 0
            goto L2b
        L23:
            r2 = r2[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            boolean r2 = bi.m0.w(r2, r5)
        L2b:
            r1.setChecked(r2)
            if (r0 == 0) goto L55
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r1 = r8.f1()
            android.widget.LinearLayout r1 = r1.layoutDetail
            java.lang.String r2 = "viewBind.layoutDetail"
            gm.l.e(r1, r2)
            nj.l r2 = r8.f11298t0
            if (r2 == 0) goto L51
            byte[] r2 = r2.f21878b
            if (r2 != 0) goto L45
            r2 = 0
            goto L4d
        L45:
            r2 = r2[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            boolean r2 = bi.m0.w(r2, r5)
        L4d:
            qi.h.m(r1, r2)
            goto L55
        L51:
            gm.l.l(r4)
            throw r3
        L55:
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r1 = r8.f1()
            com.github.kilnn.tool.widget.item.PreferenceItem r1 = r1.itemStartTime
            android.widget.TextView r1 = r1.getTextView()
            nj.l r2 = r8.f11298t0
            if (r2 == 0) goto Lde
            int r2 = r2.g()
            java.lang.String r2 = bi.m0.y(r2)
            r1.setText(r2)
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r1 = r8.f1()
            com.github.kilnn.tool.widget.item.PreferenceItem r1 = r1.itemEndTime
            android.widget.TextView r1 = r1.getTextView()
            nj.l r2 = r8.f11298t0
            if (r2 == 0) goto Lda
            int r2 = r2.f()
            java.lang.String r2 = bi.m0.y(r2)
            r1.setText(r2)
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r1 = r8.f1()
            com.github.kilnn.tool.widget.item.PreferenceItem r1 = r1.itemDnd
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r1.getSwitchView()
            nj.l r2 = r8.f11298t0
            if (r2 == 0) goto Ld6
            byte[] r2 = r2.f21878b
            if (r2 != 0) goto L9b
            r2 = 0
            goto La4
        L9b:
            r2 = r2[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r7 = 2
            boolean r2 = bi.m0.w(r2, r7)
        La4:
            r1.setChecked(r2)
            if (r0 == 0) goto Ld5
            r0 = 720(0x2d0, float:1.009E-42)
            r1 = 840(0x348, float:1.177E-42)
            com.topstep.fitcloud.pro.databinding.FragmentSedentaryBinding r2 = r8.f1()
            com.github.kilnn.tool.widget.item.PreferenceItem r2 = r2.itemDnd
            nj.l r7 = r8.f11298t0
            if (r7 == 0) goto Ld1
            int r7 = r7.f()
            if (r7 < r0) goto Lcc
            nj.l r0 = r8.f11298t0
            if (r0 == 0) goto Lc8
            int r0 = r0.g()
            if (r0 > r1) goto Lcc
            goto Lcd
        Lc8:
            gm.l.l(r4)
            throw r3
        Lcc:
            r5 = 0
        Lcd:
            r2.setEnabled(r5)
            goto Ld5
        Ld1:
            gm.l.l(r4)
            throw r3
        Ld5:
            return
        Ld6:
            gm.l.l(r4)
            throw r3
        Lda:
            gm.l.l(r4)
            throw r3
        Lde:
            gm.l.l(r4)
            throw r3
        Le2:
            gm.l.l(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.SedentaryFragment.h1():void");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        l.a z11;
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            if (gm.l.a(compoundButton, f1().itemDetailEnabled.getSwitchView())) {
                nj.l lVar = this.f11298t0;
                if (lVar != null) {
                    z11 = v.z(lVar);
                    byte[] bArr = z11.f21880b;
                    int i10 = bArr[0] & 255;
                    if (z10) {
                        bArr[0] = (byte) ((i10 & (-2)) | 1);
                    } else {
                        bArr[0] = (byte) ((i10 & (-2)) | 0);
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                nj.l lVar2 = this.f11298t0;
                if (lVar2 != null) {
                    z11 = v.z(lVar2);
                    byte[] bArr2 = z11.f21880b;
                    int i11 = bArr2[0] & 255;
                    if (z10) {
                        bArr2[0] = (byte) ((i11 & (-3)) | 2);
                    } else {
                        bArr2[0] = (byte) ((i11 & (-3)) | 0);
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            g1(z11.b());
        }
    }
}
