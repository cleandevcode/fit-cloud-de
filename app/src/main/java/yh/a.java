package yh;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.DialogDialPacketDfuBinding;
import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import ij.c;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import s.c0;
import s.n2;

@Metadata
/* loaded from: classes2.dex */
public final class a extends l {
    public static final /* synthetic */ int N0 = 0;
    public DialPacket G0;
    public DialPushParams H0;
    public wh.e I0;
    public DialogDialPacketDfuBinding J0;
    public final t0 K0;
    public final t0 L0;
    public final tl.d M0;

    /* renamed from: yh.a$a */
    /* loaded from: classes2.dex */
    public static final class C0591a extends gm.m implements fm.l<PushStateView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0591a() {
            super(1);
            a.this = r1;
        }

        @Override // fm.l
        public final tl.l k(PushStateView pushStateView) {
            gm.l.f(pushStateView, "it");
            if (!((DfuViewModel) a.this.K0.getValue()).f()) {
                si.f fVar = si.f.f27071a;
                a aVar = a.this;
                fVar.f(aVar, new n2(7, aVar));
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketDfuDialogFragment$onCreateDialog$2", f = "DialPacketDfuDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31684e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketDfuDialogFragment$onCreateDialog$2$1", f = "DialPacketDfuDialogFragment.kt", l = {104}, m = "invokeSuspend")
        /* renamed from: yh.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C0592a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31686e;

            /* renamed from: f */
            public final /* synthetic */ a f31687f;

            /* renamed from: yh.a$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0593a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ a f31688a;

                public C0593a(a aVar) {
                    this.f31688a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    a aVar;
                    PushStateView pushStateView;
                    int i10;
                    c.a aVar2 = (c.a) obj;
                    boolean z10 = false;
                    switch (c0.b(aVar2.f17044a)) {
                        case 0:
                        case 5:
                        case 6:
                            a aVar3 = this.f31688a;
                            int i11 = a.N0;
                            aVar3.j1();
                            aVar = this.f31688a;
                            z10 = true;
                            aVar.f1(z10);
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding);
                            dialogDialPacketDfuBinding.stateView.setProgress(aVar2.f17045b);
                            return tl.l.f28297a;
                        case 1:
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding2 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding2);
                            pushStateView = dialogDialPacketDfuBinding2.stateView;
                            i10 = R.string.ds_dfu_downloading;
                            pushStateView.setText(i10);
                            aVar = this.f31688a;
                            aVar.f1(z10);
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding3 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding3);
                            dialogDialPacketDfuBinding3.stateView.setProgress(aVar2.f17045b);
                            return tl.l.f28297a;
                        case 2:
                        case 3:
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding4 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding4);
                            pushStateView = dialogDialPacketDfuBinding4.stateView;
                            i10 = R.string.ds_dfu_preparing;
                            pushStateView.setText(i10);
                            aVar = this.f31688a;
                            aVar.f1(z10);
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding32 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding32);
                            dialogDialPacketDfuBinding32.stateView.setProgress(aVar2.f17045b);
                            return tl.l.f28297a;
                        case 4:
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding5 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding5);
                            pushStateView = dialogDialPacketDfuBinding5.stateView;
                            i10 = R.string.ds_dfu_pushing;
                            pushStateView.setText(i10);
                            aVar = this.f31688a;
                            aVar.f1(z10);
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding322 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding322);
                            dialogDialPacketDfuBinding322.stateView.setProgress(aVar2.f17045b);
                            return tl.l.f28297a;
                        default:
                            DialogDialPacketDfuBinding dialogDialPacketDfuBinding3222 = this.f31688a.J0;
                            gm.l.c(dialogDialPacketDfuBinding3222);
                            dialogDialPacketDfuBinding3222.stateView.setProgress(aVar2.f17045b);
                            return tl.l.f28297a;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0592a(a aVar, xl.d<? super C0592a> dVar) {
                super(2, dVar);
                this.f31687f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0592a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0592a(this.f31687f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31686e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.b e10 = ((DfuViewModel) this.f31687f.K0.getValue()).e();
                    C0593a c0593a = new C0593a(this.f31687f);
                    this.f31686e = 1;
                    if (e10.a(c0593a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketDfuDialogFragment$onCreateDialog$2$2", f = "DialPacketDfuDialogFragment.kt", l = {127}, m = "invokeSuspend")
        /* renamed from: yh.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C0594b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31689e;

            /* renamed from: f */
            public final /* synthetic */ a f31690f;

            /* renamed from: yh.a$b$b$a */
            /* loaded from: classes2.dex */
            public static final class C0595a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ a f31691a;

                public C0595a(a aVar) {
                    this.f31691a = aVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.b) {
                        d7.e.h((d7.e) this.f31691a.M0.getValue(), R.string.ds_push_success, true, 0, 28);
                        DialPushViewModel dialPushViewModel = (DialPushViewModel) this.f31691a.L0.getValue();
                        DialPushParams dialPushParams = this.f31691a.H0;
                        if (dialPushParams != null) {
                            String projectNum = dialPushParams.getProjectNum();
                            DialPacket dialPacket = this.f31691a.G0;
                            if (dialPacket != null) {
                                dialPushViewModel.getClass();
                                gm.l.f(projectNum, "projectNum");
                                z0.g(rm.l.h(dialPushViewModel), null, 0, new wh.c(dialPushViewModel, projectNum, dialPacket, null), 3);
                                rm.l.g(this.f31691a).e(new yh.b(this.f31691a, null));
                            } else {
                                gm.l.l("dialPacket");
                                throw null;
                            }
                        } else {
                            gm.l.l("pushParams");
                            throw null;
                        }
                    } else if (cVar instanceof c.a) {
                        h7.a.v((d7.e) this.f31691a.M0.getValue(), this.f31691a.V0(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0594b(a aVar, xl.d<? super C0594b> dVar) {
                super(2, dVar);
                this.f31690f = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0594b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0594b(this.f31690f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31689e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.c cVar = ((DfuViewModel) this.f31690f.K0.getValue()).f10912g;
                    C0595a c0595a = new C0595a(this.f31690f);
                    this.f31689e = 1;
                    if (cVar.a(c0595a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f31684e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f31684e;
            z0.g(e0Var, null, 0, new C0592a(a.this, null), 3);
            z0.g(e0Var, null, 0, new C0594b(a.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f31692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(0);
            this.f31692b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f31692b).f(R.id.dial_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f31693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.i iVar) {
            super(0);
            this.f31693b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f31693b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f31694b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f31695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, tl.i iVar) {
            super(0);
            this.f31694b = rVar;
            this.f31695c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f31694b.T0();
            i2.j jVar = (i2.j) this.f31695c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f31696b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f31696b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f31696b).f(R.id.dial_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f31697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.i iVar) {
            super(0);
            this.f31697b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f31697b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f31698b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f31699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, tl.i iVar) {
            super(0);
            this.f31698b = rVar;
            this.f31699c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f31698b.T0();
            i2.j jVar = (i2.j) this.f31699c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    public a() {
        tl.i iVar = new tl.i(new c(this));
        this.K0 = ab.b.e(this, b0.a(DfuViewModel.class), new d(iVar), new e(this, iVar));
        tl.i iVar2 = new tl.i(new f(this));
        this.L0 = ab.b.e(this, b0.a(DialPushViewModel.class), new g(iVar2), new h(this, iVar2));
        this.M0 = qi.p.d(this);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        Bundle U0 = U0();
        int i10 = Build.VERSION.SDK_INT;
        Parcelable parcelable = i10 >= 33 ? (Parcelable) U0.getParcelable("dial_packet", DialPacket.class) : U0.getParcelable("dial_packet");
        gm.l.c(parcelable);
        this.G0 = (DialPacket) parcelable;
        Parcelable parcelable2 = i10 >= 33 ? (Parcelable) U0.getParcelable("push_params", DialPushParams.class) : U0.getParcelable("push_params");
        gm.l.c(parcelable2);
        DialPushParams dialPushParams = (DialPushParams) parcelable2;
        this.H0 = dialPushParams;
        List<DialSpacePacket> filterPushableSpacePackets = dialPushParams.filterPushableSpacePackets();
        if (!filterPushableSpacePackets.isEmpty()) {
            DialPacket dialPacket = this.G0;
            if (dialPacket == null) {
                gm.l.l("dialPacket");
                throw null;
            }
            long binSize = dialPacket.getBinSize();
            DialPushParams dialPushParams2 = this.H0;
            if (dialPushParams2 != null) {
                this.I0 = new wh.e(filterPushableSpacePackets, binSize, dialPushParams2.getShape());
            } else {
                gm.l.l("pushParams");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.J0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        DialogDialPacketDfuBinding inflate = DialogDialPacketDfuBinding.inflate(LayoutInflater.from(i0()));
        this.J0 = inflate;
        gm.l.c(inflate);
        TextView textView = inflate.tvName;
        DialPacket dialPacket = this.G0;
        if (dialPacket != null) {
            textView.setText(dialPacket.getName());
            DialogDialPacketDfuBinding dialogDialPacketDfuBinding = this.J0;
            gm.l.c(dialogDialPacketDfuBinding);
            ImageView imageView = dialogDialPacketDfuBinding.imgView;
            gm.l.e(imageView, "viewBind.imgView");
            DialPacket dialPacket2 = this.G0;
            if (dialPacket2 != null) {
                a.f.g(imageView, dialPacket2.getDeviceImgUrl(), 8);
                if (this.I0 == null) {
                    DialogDialPacketDfuBinding dialogDialPacketDfuBinding2 = this.J0;
                    gm.l.c(dialogDialPacketDfuBinding2);
                    dialogDialPacketDfuBinding2.layoutSelect.setVisibility(8);
                } else {
                    DialogDialPacketDfuBinding dialogDialPacketDfuBinding3 = this.J0;
                    gm.l.c(dialogDialPacketDfuBinding3);
                    dialogDialPacketDfuBinding3.layoutSelect.setVisibility(0);
                    DialogDialPacketDfuBinding dialogDialPacketDfuBinding4 = this.J0;
                    gm.l.c(dialogDialPacketDfuBinding4);
                    RecyclerView recyclerView = dialogDialPacketDfuBinding4.recyclerView;
                    i0();
                    recyclerView.setLayoutManager(new LinearLayoutManager(0));
                    DialogDialPacketDfuBinding dialogDialPacketDfuBinding5 = this.J0;
                    gm.l.c(dialogDialPacketDfuBinding5);
                    dialogDialPacketDfuBinding5.recyclerView.setAdapter(this.I0);
                }
                j1();
                DialogDialPacketDfuBinding dialogDialPacketDfuBinding6 = this.J0;
                gm.l.c(dialogDialPacketDfuBinding6);
                p.b.g(dialogDialPacketDfuBinding6.stateView, new C0591a());
                v vVar = this.Z;
                gm.l.e(vVar, "lifecycle");
                qi.h.k(vVar, new b(null));
                v9.b bVar = new v9.b(V0(), 0);
                DialogDialPacketDfuBinding dialogDialPacketDfuBinding7 = this.J0;
                gm.l.c(dialogDialPacketDfuBinding7);
                bVar.m(dialogDialPacketDfuBinding7.getRoot());
                bVar.f838a.f817m = true;
                return bVar.a();
            }
            gm.l.l("dialPacket");
            throw null;
        }
        gm.l.l("dialPacket");
        throw null;
    }

    public final void j1() {
        boolean z10;
        DialogDialPacketDfuBinding dialogDialPacketDfuBinding = this.J0;
        gm.l.c(dialogDialPacketDfuBinding);
        PushStateView pushStateView = dialogDialPacketDfuBinding.stateView;
        wh.e eVar = this.I0;
        if (eVar != null && eVar.f29845g == -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        pushStateView.setEnabled(z10);
        DialogDialPacketDfuBinding dialogDialPacketDfuBinding2 = this.J0;
        gm.l.c(dialogDialPacketDfuBinding2);
        PushStateView pushStateView2 = dialogDialPacketDfuBinding2.stateView;
        Object[] objArr = new Object[1];
        DialPacket dialPacket = this.G0;
        if (dialPacket != null) {
            objArr[0] = n6.a0.f(dialPacket.getBinSize(), false);
            pushStateView2.setText(p0(R.string.ds_push_start, objArr));
            return;
        }
        gm.l.l("dialPacket");
        throw null;
    }
}
