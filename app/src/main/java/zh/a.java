package zh;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.DialogDialCustomDfuBinding;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloud.sdk.v2.utils.dial.b;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.q;
import gm.b0;
import ij.c;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import s.c0;
import sm.o0;
import xf.a;
import y.i0;
import y3.c1;
import y3.d1;
import y3.p;

@Metadata
/* loaded from: classes2.dex */
public final class a extends l {
    public static final /* synthetic */ int N0 = 0;
    public zh.g G0;
    public DialPushParams H0;
    public wh.e I0;
    public DialogDialCustomDfuBinding J0;
    public final t0 K0;
    public final t0 L0;
    public final tl.d M0;

    /* renamed from: zh.a$a */
    /* loaded from: classes2.dex */
    public static final class C0614a {

        /* renamed from: a */
        public final DialCustomDfuViewModel.b f32389a;

        /* renamed from: b */
        public final c.a f32390b;

        public C0614a(DialCustomDfuViewModel.b bVar, c.a aVar) {
            gm.l.f(bVar, "createState");
            gm.l.f(aVar, "dfuState");
            this.f32389a = bVar;
            this.f32390b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0614a) {
                C0614a c0614a = (C0614a) obj;
                return gm.l.a(this.f32389a, c0614a.f32389a) && gm.l.a(this.f32390b, c0614a.f32390b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f32390b.hashCode() + (this.f32389a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("CombineState(createState=");
            a10.append(this.f32389a);
            a10.append(", dfuState=");
            a10.append(this.f32390b);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<PushStateView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            a.this = r1;
        }

        @Override // fm.l
        public final tl.l k(PushStateView pushStateView) {
            boolean z10;
            gm.l.f(pushStateView, "it");
            a aVar = a.this;
            int i10 = a.N0;
            y3.b<File> bVar = aVar.j1().e().f11009a;
            if (bVar instanceof d1) {
                z10 = true;
            } else {
                z10 = bVar instanceof y3.j;
            }
            if (z10) {
                DialCustomDfuViewModel j12 = a.this.j1();
                j12.getClass();
                z0.g(rm.l.h(j12), null, 0, new zh.d(j12, null), 3);
            } else if (!(bVar instanceof p) && (bVar instanceof c1) && !((DfuViewModel) a.this.K0.getValue()).f()) {
                si.f fVar = si.f.f27071a;
                a aVar2 = a.this;
                fVar.f(aVar2, new i0(aVar2, bVar, 4));
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuDialogFragment$onCreateDialog$2", f = "DialCustomDfuDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f32392e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuDialogFragment$onCreateDialog$2$1", f = "DialCustomDfuDialogFragment.kt", l = {132}, m = "invokeSuspend")
        /* renamed from: zh.a$c$a */
        /* loaded from: classes2.dex */
        public static final class C0615a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f32394e;

            /* renamed from: f */
            public final /* synthetic */ a f32395f;

            @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuDialogFragment$onCreateDialog$2$1$1", f = "DialCustomDfuDialogFragment.kt", l = {}, m = "invokeSuspend")
            /* renamed from: zh.a$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C0616a extends zl.i implements q<DialCustomDfuViewModel.b, c.a, xl.d<? super C0614a>, Object> {

                /* renamed from: e */
                public /* synthetic */ DialCustomDfuViewModel.b f32396e;

                /* renamed from: f */
                public /* synthetic */ c.a f32397f;

                public C0616a(xl.d<? super C0616a> dVar) {
                    super(3, dVar);
                }

                @Override // fm.q
                public final Object j(DialCustomDfuViewModel.b bVar, c.a aVar, xl.d<? super C0614a> dVar) {
                    C0616a c0616a = new C0616a(dVar);
                    c0616a.f32396e = bVar;
                    c0616a.f32397f = aVar;
                    return c0616a.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    a0.k(obj);
                    return new C0614a(this.f32396e, this.f32397f);
                }
            }

            /* renamed from: zh.a$c$a$b */
            /* loaded from: classes2.dex */
            public static final class b<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ a f32398a;

                public b(a aVar) {
                    this.f32398a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    a aVar;
                    PushStateView pushStateView;
                    int i10;
                    C0614a c0614a = (C0614a) obj;
                    DialCustomDfuViewModel.b bVar = c0614a.f32389a;
                    y3.b<File> bVar2 = bVar.f11009a;
                    if (bVar2 instanceof p) {
                        int i11 = bVar.f11010b;
                        DialogDialCustomDfuBinding dialogDialCustomDfuBinding = this.f32398a.J0;
                        gm.l.c(dialogDialCustomDfuBinding);
                        dialogDialCustomDfuBinding.stateView.setProgress(i11);
                        if (i11 < 100) {
                            DialogDialCustomDfuBinding dialogDialCustomDfuBinding2 = this.f32398a.J0;
                            gm.l.c(dialogDialCustomDfuBinding2);
                            dialogDialCustomDfuBinding2.stateView.setText(R.string.ds_dfu_downloading);
                        } else {
                            DialogDialCustomDfuBinding dialogDialCustomDfuBinding3 = this.f32398a.J0;
                            gm.l.c(dialogDialCustomDfuBinding3);
                            dialogDialCustomDfuBinding3.stateView.setText(R.string.ds_dial_creating);
                        }
                    } else if (bVar2 instanceof y3.j) {
                        a aVar2 = this.f32398a;
                        int i12 = a.N0;
                        aVar2.k1();
                    } else if (bVar2 instanceof c1) {
                        boolean z10 = false;
                        switch (c0.b(c0614a.f32390b.f17044a)) {
                            case 0:
                            case 5:
                            case 6:
                                a aVar3 = this.f32398a;
                                int i13 = a.N0;
                                aVar3.k1();
                                aVar = this.f32398a;
                                z10 = true;
                                aVar.f1(z10);
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding4 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding4);
                                dialogDialCustomDfuBinding4.stateView.setProgress(c0614a.f32390b.f17045b);
                                break;
                            case 1:
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding5 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding5);
                                dialogDialCustomDfuBinding5.stateView.setText(R.string.ds_dfu_downloading);
                                aVar = this.f32398a;
                                aVar.f1(z10);
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding42 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding42);
                                dialogDialCustomDfuBinding42.stateView.setProgress(c0614a.f32390b.f17045b);
                                break;
                            case 2:
                            case 3:
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding6 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding6);
                                pushStateView = dialogDialCustomDfuBinding6.stateView;
                                i10 = R.string.ds_dfu_preparing;
                                pushStateView.setText(i10);
                                aVar = this.f32398a;
                                aVar.f1(z10);
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding422 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding422);
                                dialogDialCustomDfuBinding422.stateView.setProgress(c0614a.f32390b.f17045b);
                                break;
                            case 4:
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding7 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding7);
                                pushStateView = dialogDialCustomDfuBinding7.stateView;
                                i10 = R.string.ds_dfu_pushing;
                                pushStateView.setText(i10);
                                aVar = this.f32398a;
                                aVar.f1(z10);
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding4222 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding4222);
                                dialogDialCustomDfuBinding4222.stateView.setProgress(c0614a.f32390b.f17045b);
                                break;
                            default:
                                DialogDialCustomDfuBinding dialogDialCustomDfuBinding42222 = this.f32398a.J0;
                                gm.l.c(dialogDialCustomDfuBinding42222);
                                dialogDialCustomDfuBinding42222.stateView.setProgress(c0614a.f32390b.f17045b);
                                break;
                        }
                    } else {
                        gm.l.a(bVar2, d1.f30940b);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0615a(a aVar, xl.d<? super C0615a> dVar) {
                super(2, dVar);
                this.f32395f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0615a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0615a(this.f32395f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                Object obj2 = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f32394e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    a aVar = this.f32395f;
                    int i11 = a.N0;
                    sm.t0 t0Var = aVar.j1().f22394e;
                    sm.b e10 = ((DfuViewModel) this.f32395f.K0.getValue()).e();
                    C0616a c0616a = new C0616a(null);
                    b bVar = new b(this.f32395f);
                    this.f32394e = 1;
                    Object c10 = p001if.d.c(this, new o0(c0616a, null), bVar, new sm.f[]{t0Var, e10});
                    if (c10 != obj2) {
                        c10 = tl.l.f28297a;
                    }
                    if (c10 == obj2) {
                        return obj2;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuDialogFragment$onCreateDialog$2$2", f = "DialCustomDfuDialogFragment.kt", l = {172}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f32399e;

            /* renamed from: f */
            public final /* synthetic */ a f32400f;

            /* renamed from: zh.a$c$b$a */
            /* loaded from: classes2.dex */
            public static final class C0617a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ a f32401a;

                public C0617a(a aVar) {
                    this.f32401a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.b) {
                        a aVar = this.f32401a;
                        int i10 = a.N0;
                        d7.e.h((d7.e) aVar.M0.getValue(), R.string.ds_push_success, true, 0, 28);
                        rm.l.g(this.f32401a).e(new zh.b(this.f32401a, null));
                    } else if (cVar instanceof c.a) {
                        a aVar2 = this.f32401a;
                        int i11 = a.N0;
                        h7.a.v((d7.e) aVar2.M0.getValue(), this.f32401a.V0(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f32400f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f32400f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f32399e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.c cVar = ((DfuViewModel) this.f32400f.K0.getValue()).f10912g;
                    C0617a c0617a = new C0617a(this.f32400f);
                    this.f32399e = 1;
                    if (cVar.a(c0617a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuDialogFragment$onCreateDialog$2$3", f = "DialCustomDfuDialogFragment.kt", l = {188}, m = "invokeSuspend")
        /* renamed from: zh.a$c$c */
        /* loaded from: classes2.dex */
        public static final class C0618c extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f32402e;

            /* renamed from: f */
            public final /* synthetic */ a f32403f;

            /* renamed from: zh.a$c$c$a */
            /* loaded from: classes2.dex */
            public static final class C0619a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ a f32404a;

                public C0619a(a aVar) {
                    this.f32404a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    DialCustomDfuViewModel.a aVar = (DialCustomDfuViewModel.a) obj;
                    if (aVar instanceof DialCustomDfuViewModel.a.C0165a) {
                        a aVar2 = this.f32404a;
                        Throwable th2 = ((DialCustomDfuViewModel.a.C0165a) aVar).f11008a;
                        int i11 = a.N0;
                        aVar2.getClass();
                        p000do.a.f13275a.q(th2);
                        if (th2 instanceof gj.a) {
                            if (((gj.a) th2).f15359a == 1) {
                                i10 = R.string.ds_dfu_error_insufficient_storage;
                            } else {
                                i10 = R.string.tip_download_failed;
                            }
                        } else if (th2 instanceof b.a) {
                            i10 = R.string.ds_dial_create_fail;
                        } else {
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            d7.e.d((d7.e) aVar2.M0.getValue(), i10, null, 0, 30);
                        } else {
                            qi.p.f((d7.e) aVar2.M0.getValue(), th2);
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0618c(a aVar, xl.d<? super C0618c> dVar) {
                super(2, dVar);
                this.f32403f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0618c) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0618c(this.f32403f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f32402e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    a aVar2 = this.f32403f;
                    int i11 = a.N0;
                    sm.c cVar = aVar2.j1().f22396g;
                    C0619a c0619a = new C0619a(this.f32403f);
                    this.f32402e = 1;
                    if (cVar.a(c0619a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f32392e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f32392e;
            z0.g(e0Var, null, 0, new C0615a(a.this, null), 3);
            z0.g(e0Var, null, 0, new b(a.this, null), 3);
            z0.g(e0Var, null, 0, new C0618c(a.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f32405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(0);
            this.f32405b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f32405b).f(R.id.dial_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f32406b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.i iVar) {
            super(0);
            this.f32406b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f32406b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f32407b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f32408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, tl.i iVar) {
            super(0);
            this.f32407b = rVar;
            this.f32408c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f32407b.T0();
            i2.j jVar = (i2.j) this.f32408c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f32409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(0);
            this.f32409b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f32409b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f32410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f32410b = gVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f32410b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f32411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f32411b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f32411b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f32412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tl.d dVar) {
            super(0);
            this.f32412b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f32412b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f32413b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f32414c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r rVar, tl.d dVar) {
            super(0);
            this.f32413b = rVar;
            this.f32414c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f32414c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f32413b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    public a() {
        tl.i iVar = new tl.i(new d(this));
        this.K0 = ab.b.e(this, b0.a(DfuViewModel.class), new e(iVar), new f(this, iVar));
        tl.d a10 = fb.e.a(new h(new g(this)));
        this.L0 = ab.b.f(this, b0.a(DialCustomDfuViewModel.class), new i(a10), new j(a10), new k(this, a10));
        this.M0 = qi.p.d(this);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.G0 = j1().f11005i;
        DialPushParams dialPushParams = j1().f11006j;
        this.H0 = dialPushParams;
        if (dialPushParams != null) {
            List<DialSpacePacket> filterPushableSpacePackets = dialPushParams.filterPushableSpacePackets();
            if (!filterPushableSpacePackets.isEmpty()) {
                zh.g gVar = this.G0;
                if (gVar != null) {
                    long j10 = gVar.f32451b.f30541d;
                    DialPushParams dialPushParams2 = this.H0;
                    if (dialPushParams2 != null) {
                        this.I0 = new wh.e(filterPushableSpacePackets, j10, dialPushParams2.getShape());
                        return;
                    } else {
                        gm.l.l("pushParams");
                        throw null;
                    }
                }
                gm.l.l("customItem");
                throw null;
            }
            return;
        }
        gm.l.l("pushParams");
        throw null;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.J0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        DialogDialCustomDfuBinding inflate = DialogDialCustomDfuBinding.inflate(LayoutInflater.from(i0()));
        this.J0 = inflate;
        gm.l.c(inflate);
        inflate.tvName.setText(R.string.ds_dial_custom);
        DialogDialCustomDfuBinding dialogDialCustomDfuBinding = this.J0;
        gm.l.c(dialogDialCustomDfuBinding);
        DialView dialView = dialogDialCustomDfuBinding.dialView;
        DialPushParams dialPushParams = this.H0;
        if (dialPushParams != null) {
            dialView.setShape(dialPushParams.getShape());
            Context V0 = V0();
            DialogDialCustomDfuBinding dialogDialCustomDfuBinding2 = this.J0;
            gm.l.c(dialogDialCustomDfuBinding2);
            DialView dialView2 = dialogDialCustomDfuBinding2.dialView;
            gm.l.e(dialView2, "viewBind.dialView");
            zh.g gVar = this.G0;
            if (gVar != null) {
                a.f.e(V0, dialView2, gVar.f32450a);
                Context V02 = V0();
                DialogDialCustomDfuBinding dialogDialCustomDfuBinding3 = this.J0;
                gm.l.c(dialogDialCustomDfuBinding3);
                DialView dialView3 = dialogDialCustomDfuBinding3.dialView;
                gm.l.e(dialView3, "viewBind.dialView");
                zh.g gVar2 = this.G0;
                if (gVar2 != null) {
                    a.C0558a c0558a = gVar2.f32451b;
                    a.f.f(V02, dialView3, c0558a.f30538a, c0558a.f30539b);
                    DialogDialCustomDfuBinding dialogDialCustomDfuBinding4 = this.J0;
                    gm.l.c(dialogDialCustomDfuBinding4);
                    DialView dialView4 = dialogDialCustomDfuBinding4.dialView;
                    zh.g gVar3 = this.G0;
                    if (gVar3 != null) {
                        dialView4.setStylePosition(gVar3.f32452c);
                        if (this.I0 == null) {
                            DialogDialCustomDfuBinding dialogDialCustomDfuBinding5 = this.J0;
                            gm.l.c(dialogDialCustomDfuBinding5);
                            dialogDialCustomDfuBinding5.layoutSelect.setVisibility(8);
                        } else {
                            DialogDialCustomDfuBinding dialogDialCustomDfuBinding6 = this.J0;
                            gm.l.c(dialogDialCustomDfuBinding6);
                            dialogDialCustomDfuBinding6.layoutSelect.setVisibility(0);
                            DialogDialCustomDfuBinding dialogDialCustomDfuBinding7 = this.J0;
                            gm.l.c(dialogDialCustomDfuBinding7);
                            RecyclerView recyclerView = dialogDialCustomDfuBinding7.recyclerView;
                            i0();
                            recyclerView.setLayoutManager(new LinearLayoutManager(0));
                            DialogDialCustomDfuBinding dialogDialCustomDfuBinding8 = this.J0;
                            gm.l.c(dialogDialCustomDfuBinding8);
                            dialogDialCustomDfuBinding8.recyclerView.setAdapter(this.I0);
                        }
                        k1();
                        DialogDialCustomDfuBinding dialogDialCustomDfuBinding9 = this.J0;
                        gm.l.c(dialogDialCustomDfuBinding9);
                        p.b.g(dialogDialCustomDfuBinding9.stateView, new b());
                        v vVar = this.Z;
                        gm.l.e(vVar, "lifecycle");
                        qi.h.k(vVar, new c(null));
                        v9.b bVar = new v9.b(V0(), 0);
                        DialogDialCustomDfuBinding dialogDialCustomDfuBinding10 = this.J0;
                        gm.l.c(dialogDialCustomDfuBinding10);
                        bVar.m(dialogDialCustomDfuBinding10.getRoot());
                        bVar.f838a.f817m = true;
                        return bVar.a();
                    }
                    gm.l.l("customItem");
                    throw null;
                }
                gm.l.l("customItem");
                throw null;
            }
            gm.l.l("customItem");
            throw null;
        }
        gm.l.l("pushParams");
        throw null;
    }

    public final DialCustomDfuViewModel j1() {
        return (DialCustomDfuViewModel) this.L0.getValue();
    }

    public final void k1() {
        boolean z10;
        PushStateView pushStateView;
        String p02;
        DialogDialCustomDfuBinding dialogDialCustomDfuBinding = this.J0;
        gm.l.c(dialogDialCustomDfuBinding);
        PushStateView pushStateView2 = dialogDialCustomDfuBinding.stateView;
        wh.e eVar = this.I0;
        if (eVar != null && eVar.f29845g == -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        pushStateView2.setEnabled(z10);
        if (j1().e().f11009a.a() != null) {
            DialogDialCustomDfuBinding dialogDialCustomDfuBinding2 = this.J0;
            gm.l.c(dialogDialCustomDfuBinding2);
            pushStateView = dialogDialCustomDfuBinding2.stateView;
            Object[] objArr = new Object[1];
            zh.g gVar = this.G0;
            if (gVar != null) {
                objArr[0] = n6.a0.f(gVar.f32451b.f30541d, false);
                p02 = p0(R.string.ds_push_start, objArr);
            } else {
                gm.l.l("customItem");
                throw null;
            }
        } else {
            DialogDialCustomDfuBinding dialogDialCustomDfuBinding3 = this.J0;
            gm.l.c(dialogDialCustomDfuBinding3);
            pushStateView = dialogDialCustomDfuBinding3.stateView;
            Object[] objArr2 = new Object[1];
            zh.g gVar2 = this.G0;
            if (gVar2 != null) {
                objArr2[0] = n6.a0.f(gVar2.f32451b.f30541d, false);
                p02 = p0(R.string.ds_dial_create, objArr2);
            } else {
                gm.l.l("customItem");
                throw null;
            }
        }
        pushStateView.setText(p02);
    }
}
