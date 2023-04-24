package com.topstep.fitcloud.pro.ui.device.bind;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentConnectHelpBinding;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.t;
import kotlin.Metadata;
import lh.c;
import mf.a0;
import mm.h;
import pm.e0;
import si.f;
import sm.g;
import tl.l;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class ConnectHelpFragment extends c {

    /* renamed from: n0 */
    public static final /* synthetic */ h<Object>[] f10792n0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10793m0;

    @e(c = "com.topstep.fitcloud.pro.ui.device.bind.ConnectHelpFragment$onViewCreated$2", f = "ConnectHelpFragment.kt", l = {33}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public int f10794e;

        /* renamed from: com.topstep.fitcloud.pro.ui.device.bind.ConnectHelpFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0156a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ ConnectHelpFragment f10796a;

            public C0156a(ConnectHelpFragment connectHelpFragment) {
                this.f10796a = connectHelpFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, d dVar) {
                int i10;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ConnectHelpFragment connectHelpFragment = this.f10796a;
                h<Object>[] hVarArr = ConnectHelpFragment.f10792n0;
                RelativeLayout relativeLayout = connectHelpFragment.e1().layoutLocationService;
                gm.l.e(relativeLayout, "viewBind.layoutLocationService");
                if (!booleanValue) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                relativeLayout.setVisibility(i10);
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(2, dVar);
            ConnectHelpFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10794e;
            if (i10 == 0) {
                a0.k(obj);
                sm.b e10 = qi.h.e(ConnectHelpFragment.this.V0());
                C0156a c0156a = new C0156a(ConnectHelpFragment.this);
                this.f10794e = 1;
                if (e10.a(c0156a, this) == aVar) {
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

    static {
        t tVar = new t(ConnectHelpFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentConnectHelpBinding;", 0);
        b0.f15488a.getClass();
        f10792n0 = new h[]{tVar};
    }

    public ConnectHelpFragment() {
        super(R.layout.fragment_connect_help);
        this.f10793m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentConnectHelpBinding.class, this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        RelativeLayout relativeLayout = e1().layoutPermission;
        gm.l.e(relativeLayout, "viewBind.layoutPermission");
        relativeLayout.setVisibility(f.f27071a.b(V0()) ^ true ? 0 : 8);
        e1().btnGrantPermission.setOnClickListener(new th.l(1, this));
        qi.h.k(qi.h.i(this), new a(null));
        e1().btnEnableLocationService.setOnClickListener(new uh.a(0, this));
    }

    public final FragmentConnectHelpBinding e1() {
        return (FragmentConnectHelpBinding) this.f10793m0.a(this, f10792n0[0]);
    }
}
