package di;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.DialogSportDfuBinding;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import ij.c;
import kotlin.Metadata;
import n6.a0;
import nh.c;
import pm.e0;
import s.c0;
import s.i0;

@Metadata
/* loaded from: classes2.dex */
public final class c extends di.a {
    public static final /* synthetic */ int M0 = 0;
    public String G0;
    public SportPacket H0;
    public byte I0;
    public DialogSportDfuBinding J0;
    public final t0 K0;
    public final tl.d L0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final y0 m() {
            return c.this.W0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<PushStateView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            c.this = r1;
        }

        @Override // fm.l
        public final tl.l k(PushStateView pushStateView) {
            gm.l.f(pushStateView, "it");
            if (!((DfuViewModel) c.this.K0.getValue()).f()) {
                si.f fVar = si.f.f27071a;
                c cVar = c.this;
                fVar.f(cVar, new i0(12, cVar));
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportDfuDialogFragment$onCreateDialog$2", f = "SportDfuDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: di.c$c */
    /* loaded from: classes2.dex */
    public static final class C0223c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f13047e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportDfuDialogFragment$onCreateDialog$2$1", f = "SportDfuDialogFragment.kt", l = {88}, m = "invokeSuspend")
        /* renamed from: di.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f13049e;

            /* renamed from: f */
            public final /* synthetic */ c f13050f;

            /* renamed from: di.c$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C0224a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ c f13051a;

                public C0224a(c cVar) {
                    this.f13051a = cVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    PushStateView pushStateView;
                    int i10;
                    c.a aVar = (c.a) obj;
                    switch (c0.b(aVar.f17044a)) {
                        case 0:
                        case 5:
                        case 6:
                            DialogSportDfuBinding dialogSportDfuBinding = this.f13051a.J0;
                            gm.l.c(dialogSportDfuBinding);
                            PushStateView pushStateView2 = dialogSportDfuBinding.stateView;
                            c cVar = this.f13051a;
                            Object[] objArr = new Object[1];
                            SportPacket sportPacket = cVar.H0;
                            if (sportPacket != null) {
                                objArr[0] = a0.f(sportPacket.getBinSize(), false);
                                pushStateView2.setText(cVar.p0(R.string.ds_push_start, objArr));
                                this.f13051a.f1(true);
                                break;
                            } else {
                                gm.l.l("packet");
                                throw null;
                            }
                        case 1:
                            DialogSportDfuBinding dialogSportDfuBinding2 = this.f13051a.J0;
                            gm.l.c(dialogSportDfuBinding2);
                            pushStateView = dialogSportDfuBinding2.stateView;
                            i10 = R.string.ds_dfu_downloading;
                            pushStateView.setText(i10);
                            this.f13051a.f1(false);
                            break;
                        case 2:
                        case 3:
                            DialogSportDfuBinding dialogSportDfuBinding3 = this.f13051a.J0;
                            gm.l.c(dialogSportDfuBinding3);
                            pushStateView = dialogSportDfuBinding3.stateView;
                            i10 = R.string.ds_dfu_preparing;
                            pushStateView.setText(i10);
                            this.f13051a.f1(false);
                            break;
                        case 4:
                            DialogSportDfuBinding dialogSportDfuBinding4 = this.f13051a.J0;
                            gm.l.c(dialogSportDfuBinding4);
                            pushStateView = dialogSportDfuBinding4.stateView;
                            i10 = R.string.ds_dfu_pushing;
                            pushStateView.setText(i10);
                            this.f13051a.f1(false);
                            break;
                    }
                    DialogSportDfuBinding dialogSportDfuBinding5 = this.f13051a.J0;
                    gm.l.c(dialogSportDfuBinding5);
                    dialogSportDfuBinding5.stateView.setProgress(aVar.f17045b);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f13050f = cVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f13050f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f13049e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    sm.b e10 = ((DfuViewModel) this.f13050f.K0.getValue()).e();
                    C0224a c0224a = new C0224a(this.f13050f);
                    this.f13049e = 1;
                    if (e10.a(c0224a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportDfuDialogFragment$onCreateDialog$2$2", f = "SportDfuDialogFragment.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: di.c$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f13052e;

            /* renamed from: f */
            public final /* synthetic */ c f13053f;

            /* renamed from: di.c$c$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ c f13054a;

                public a(c cVar) {
                    this.f13054a = cVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.b) {
                        d7.e.h((d7.e) this.f13054a.L0.getValue(), R.string.ds_push_success, true, 0, 28);
                        rm.l.g(this.f13054a).e(new di.d(this.f13054a, null));
                    } else if (cVar instanceof c.a) {
                        h7.a.v((d7.e) this.f13054a.L0.getValue(), this.f13054a.V0(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f13053f = cVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f13053f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f13052e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    sm.c cVar = ((DfuViewModel) this.f13053f.K0.getValue()).f10912g;
                    a aVar2 = new a(this.f13053f);
                    this.f13052e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0223c(xl.d<? super C0223c> dVar) {
            super(2, dVar);
            c.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((C0223c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            C0223c c0223c = new C0223c(dVar);
            c0223c.f13047e = obj;
            return c0223c;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            e0 e0Var = (e0) this.f13047e;
            z0.g(e0Var, null, 0, new a(c.this, null), 3);
            z0.g(e0Var, null, 0, new b(c.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f13055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(0);
            this.f13055b = aVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f13055b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f13056b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.d dVar) {
            super(0);
            this.f13056b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f13056b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f13057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.d dVar) {
            super(0);
            this.f13057b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f13057b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f13058b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f13059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, tl.d dVar) {
            super(0);
            this.f13058b = rVar;
            this.f13059c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f13059c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f13058b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    public c() {
        tl.d a10 = fb.e.a(new d(new a()));
        this.K0 = ab.b.f(this, b0.a(DfuViewModel.class), new e(a10), new f(a10), new g(this, a10));
        this.L0 = qi.p.d(this);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        Bundle U0 = U0();
        String string = U0.getString("name");
        gm.l.c(string);
        this.G0 = string;
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) U0.getParcelable("packet", SportPacket.class) : U0.getParcelable("packet");
        gm.l.c(parcelable);
        this.H0 = (SportPacket) parcelable;
        this.I0 = U0.getByte("bin_flag");
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.J0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        DialogSportDfuBinding inflate = DialogSportDfuBinding.inflate(LayoutInflater.from(i0()));
        this.J0 = inflate;
        gm.l.c(inflate);
        TextView textView = inflate.tvName;
        String str = this.G0;
        if (str != null) {
            textView.setText(str);
            DialogSportDfuBinding dialogSportDfuBinding = this.J0;
            gm.l.c(dialogSportDfuBinding);
            ImageView imageView = dialogSportDfuBinding.imgView;
            gm.l.e(imageView, "viewBind.imgView");
            SportPacket sportPacket = this.H0;
            if (sportPacket != null) {
                a.f.g(imageView, sportPacket.getIconUrl(), 8);
                DialogSportDfuBinding dialogSportDfuBinding2 = this.J0;
                gm.l.c(dialogSportDfuBinding2);
                PushStateView pushStateView = dialogSportDfuBinding2.stateView;
                Object[] objArr = new Object[1];
                SportPacket sportPacket2 = this.H0;
                if (sportPacket2 != null) {
                    objArr[0] = a0.f(sportPacket2.getBinSize(), false);
                    pushStateView.setText(p0(R.string.ds_push_start, objArr));
                    DialogSportDfuBinding dialogSportDfuBinding3 = this.J0;
                    gm.l.c(dialogSportDfuBinding3);
                    p.b.g(dialogSportDfuBinding3.stateView, new b());
                    v vVar = this.Z;
                    gm.l.e(vVar, "lifecycle");
                    qi.h.k(vVar, new C0223c(null));
                    v9.b bVar = new v9.b(V0(), 0);
                    DialogSportDfuBinding dialogSportDfuBinding4 = this.J0;
                    gm.l.c(dialogSportDfuBinding4);
                    bVar.m(dialogSportDfuBinding4.getRoot());
                    bVar.f838a.f817m = true;
                    return bVar.a();
                }
                gm.l.l("packet");
                throw null;
            }
            gm.l.l("packet");
            throw null;
        }
        gm.l.l("name");
        throw null;
    }
}
