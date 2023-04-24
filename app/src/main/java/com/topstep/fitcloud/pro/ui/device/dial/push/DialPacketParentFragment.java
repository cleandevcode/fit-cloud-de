package com.topstep.fitcloud.pro.ui.device.dial.push;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import bi.z0;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentDialPacketParentBinding;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.t;
import kotlin.Metadata;
import lh.c;
import mf.a0;
import mm.h;
import pm.e0;
import s.q0;
import sm.g;
import tl.l;
import xl.d;
import yh.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DialPacketParentFragment extends c {

    /* renamed from: n0 */
    public static final /* synthetic */ h<Object>[] f10988n0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10989m0;

    /* loaded from: classes2.dex */
    public static final class a extends FragmentStateAdapter {
        public a(DialPacketParentFragment dialPacketParentFragment) {
            super(dialPacketParentFragment);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public final r A(int i10) {
            e.a aVar = e.A0;
            boolean z10 = i10 != 0;
            aVar.getClass();
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_local", z10);
            eVar.Z0(bundle);
            return eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e() {
            return 2;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketParentFragment$onViewCreated$4", f = "DialPacketParentFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10990e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketParentFragment$onViewCreated$4$1", f = "DialPacketParentFragment.kt", l = {49}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super l>, Object> {

            /* renamed from: e */
            public int f10992e;

            /* renamed from: f */
            public final /* synthetic */ DialPacketParentFragment f10993f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketParentFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0163a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ DialPacketParentFragment f10994a;

                public C0163a(DialPacketParentFragment dialPacketParentFragment) {
                    this.f10994a = dialPacketParentFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    DialPacketParentFragment dialPacketParentFragment = this.f10994a;
                    h<Object>[] hVarArr = DialPacketParentFragment.f10988n0;
                    PreferenceRelativeLayout preferenceRelativeLayout = dialPacketParentFragment.e1().layoutLocationService;
                    gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                    if (!booleanValue) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    preferenceRelativeLayout.setVisibility(i10);
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DialPacketParentFragment dialPacketParentFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f10993f = dialPacketParentFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super l> dVar) {
                return ((a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final d<l> p(Object obj, d<?> dVar) {
                return new a(this.f10993f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10992e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.b e10 = qi.h.e(this.f10993f.V0());
                    C0163a c0163a = new C0163a(this.f10993f);
                    this.f10992e = 1;
                    if (e10.a(c0163a, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0.k(obj);
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<? super b> dVar) {
            super(2, dVar);
            DialPacketParentFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10990e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            z0.g((e0) this.f10990e, null, 0, new a(DialPacketParentFragment.this, null), 3);
            return l.f28297a;
        }
    }

    static {
        t tVar = new t(DialPacketParentFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDialPacketParentBinding;", 0);
        b0.f15488a.getClass();
        f10988n0 = new h[]{tVar};
    }

    public DialPacketParentFragment() {
        super(R.layout.fragment_dial_packet_parent);
        this.f10989m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDialPacketParentBinding.class, this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        e1().toolbar.setNavigationOnClickListener(new uh.e(2, this));
        e1().viewPager.setAdapter(new a(this));
        new com.google.android.material.tabs.e(e1().tabLayout, e1().viewPager, new q0(12, this)).a();
        if (Build.VERSION.SDK_INT < 31) {
            qi.h.k(qi.h.i(this), new b(null));
            return;
        }
        PreferenceRelativeLayout preferenceRelativeLayout = e1().layoutLocationService;
        gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
        preferenceRelativeLayout.setVisibility(8);
    }

    public final FragmentDialPacketParentBinding e1() {
        return (FragmentDialPacketParentBinding) this.f10989m0.a(this, f10988n0[0]);
    }
}
