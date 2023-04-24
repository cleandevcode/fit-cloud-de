package com.topstep.fitcloud.pro.ui.device.dial.push;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.m;
import i2.j;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import qi.h;
import qi.p;
import sm.g;
import tl.l;
import yh.n;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DialPushFragment extends n {

    /* renamed from: w0 */
    public final tl.d f10995w0 = p.d(this);

    /* renamed from: x0 */
    public final t0 f10996x0;

    @e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPushFragment$onViewCreated$1", f = "DialPushFragment.kt", l = {33}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements fm.p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f10997e;

        /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.DialPushFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0164a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ DialPushFragment f10999a;

            public C0164a(DialPushFragment dialPushFragment) {
                this.f10999a = dialPushFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                nh.c cVar = (nh.c) obj;
                if (cVar instanceof c.a) {
                    p.f((d7.e) this.f10999a.f10995w0.getValue(), ((c.a) cVar).f22380a);
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            DialPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10997e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                sm.c cVar = ((DialPushViewModel) DialPushFragment.this.f10996x0.getValue()).f22396g;
                C0164a c0164a = new C0164a(DialPushFragment.this);
                this.f10997e = 1;
                if (cVar.a(c0164a, this) == aVar) {
                    return aVar;
                }
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<j> {

        /* renamed from: b */
        public final /* synthetic */ r f11000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar) {
            super(0);
            this.f11000b = rVar;
        }

        @Override // fm.a
        public final j m() {
            return tb.a.f(this.f11000b).f(R.id.dial_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.i iVar) {
            super(0);
            this.f11001b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            j jVar = (j) this.f11001b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11002b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar, tl.i iVar) {
            super(0);
            this.f11002b = rVar;
            this.f11003c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11002b.T0();
            j jVar = (j) this.f11003c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    public DialPushFragment() {
        tl.i iVar = new tl.i(new b(this));
        this.f10996x0 = ab.b.e(this, b0.a(DialPushViewModel.class), new c(iVar), new d(this, iVar));
    }

    @Override // androidx.navigation.fragment.NavHostFragment, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        c1().w(R.navigation.dial_push_nav_graph);
    }

    @Override // androidx.navigation.fragment.NavHostFragment, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        h.k(h.i(this), new a(null));
    }
}
