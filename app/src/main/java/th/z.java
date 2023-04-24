package th;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.z0;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import gm.b0;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import y3.c1;

@Metadata
/* loaded from: classes2.dex */
public final class z extends f.q {
    public static final /* synthetic */ int C0 = 0;
    public final t0 B0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.SetAlarmsDialogFragment$onCreateDialog$1", f = "SetAlarmsDialogFragment.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f28242e;

        /* renamed from: g */
        public final /* synthetic */ androidx.appcompat.app.d f28244g;

        /* renamed from: th.z$a$a */
        /* loaded from: classes2.dex */
        public static final class C0504a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ androidx.appcompat.app.d f28245a;

            /* renamed from: b */
            public final /* synthetic */ z f28246b;

            public C0504a(androidx.appcompat.app.d dVar, z zVar) {
                this.f28245a = dVar;
                this.f28246b = zVar;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                y3.b bVar = (y3.b) obj;
                if (bVar instanceof y3.p) {
                    this.f28245a.m(this.f28246b.o0(R.string.tip_setting_loading));
                    Button j10 = this.f28245a.j(-1);
                    gm.l.e(j10, "positiveButton");
                    j10.setVisibility(8);
                } else if (bVar instanceof y3.j) {
                    this.f28245a.m(this.f28246b.o0(R.string.tip_setting_fail));
                    Button j11 = this.f28245a.j(-1);
                    gm.l.e(j11, "positiveButton");
                    j11.setVisibility(0);
                    j11.setOnClickListener(new jh.w(1, this.f28246b));
                } else if (bVar instanceof c1) {
                    this.f28245a.m(this.f28246b.o0(R.string.tip_setting_success));
                    AlarmViewModel i12 = this.f28246b.i1();
                    i12.getClass();
                    z0.g(rm.l.h(i12), null, 0, new v(i12, null), 3);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.appcompat.app.d dVar, xl.d<? super a> dVar2) {
            super(2, dVar2);
            z.this = r1;
            this.f28244g = dVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f28244g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28242e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                z zVar = z.this;
                int i11 = z.C0;
                sm.t0 t0Var = zVar.i1().f10787j.f24878c;
                C0504a c0504a = new C0504a(this.f28244g, z.this);
                this.f28242e = 1;
                if (t0Var.a(c0504a, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f28247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.f28247b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f28247b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f28248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f28248b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f28248b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f28249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f28249b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f28249b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f28250b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f28251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f28250b = rVar;
            this.f28251c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f28251c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f28250b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(0);
            z.this = r1;
        }

        @Override // fm.a
        public final y0 m() {
            return z.this.W0().W0();
        }
    }

    public z() {
        tl.d a10 = fb.e.a(new b(new f()));
        this.B0 = ab.b.f(this, b0.a(AlarmViewModel.class), new c(a10), new d(a10), new e(this, a10));
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        f1(false);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_alarm);
        bVar.d(R.string.tip_setting_loading);
        bVar.f(new y(this, 0));
        bVar.h(R.string.action_retry, null);
        androidx.appcompat.app.d a10 = bVar.a();
        androidx.lifecycle.v vVar = this.Z;
        gm.l.e(vVar, "lifecycle");
        qi.h.k(vVar, new a(a10, null));
        return a10;
    }

    public final AlarmViewModel i1() {
        return (AlarmViewModel) this.B0.getValue();
    }
}
