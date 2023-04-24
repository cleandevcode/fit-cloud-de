package com.topstep.fitcloud.pro.ui.device.bind;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.databinding.FragmentDeviceSpecifyBinding;
import com.topstep.fitcloud.pro.databinding.ItemDeviceSpecifyBinding;
import com.topstep.fitcloud.pro.model.device.DeviceShellSpecify;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import d7.d;
import fm.p;
import gm.b0;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import og.t;
import pm.e0;
import pm.z1;
import s.i0;
import s.q0;
import s.r0;
import sm.f1;
import u6.z;
import uh.i;
import uh.w;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceSpecifyFragment extends w implements v6.a, d.a, i.a {
    public static final /* synthetic */ mm.h<Object>[] A0;

    /* renamed from: t0 */
    public final int f10822t0;

    /* renamed from: u0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10823u0;

    /* renamed from: v0 */
    public final t0 f10824v0;

    /* renamed from: w0 */
    public final i2.g f10825w0;

    /* renamed from: x0 */
    public final a f10826x0;

    /* renamed from: y0 */
    public t f10827y0;

    /* renamed from: z0 */
    public final q f10828z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<b> {

        /* renamed from: d */
        public List<DeviceShellSpecify> f10829d;

        /* renamed from: e */
        public InterfaceC0158a f10830e;

        /* renamed from: com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC0158a {
            void a(DeviceShellSpecify deviceShellSpecify);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e() {
            List<DeviceShellSpecify> list = this.f10829d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(b bVar, int i10) {
            b bVar2 = bVar;
            List<DeviceShellSpecify> list = this.f10829d;
            if (list != null) {
                DeviceShellSpecify deviceShellSpecify = list.get(i10);
                ImageView imageView = bVar2.f10831u.imgDevice;
                gm.l.e(imageView, "holder.viewBind.imgDevice");
                n<Drawable> x10 = com.bumptech.glide.b.e(imageView.getContext()).k(deviceShellSpecify.f9659b).x(i5.g.w(R.drawable.ic_device_default));
                gm.l.e(x10, "with(imageView.context)\n…aceholderOf(placeholder))");
                j5.e eVar = new j5.e(imageView);
                eVar.f17500b.f17504c = true;
                x10.B(eVar, x10);
                bVar2.f10831u.tvName.setText(deviceShellSpecify.f9658a);
                p.b.g(bVar2.f2927a, new com.topstep.fitcloud.pro.ui.device.bind.b(bVar2, this, list));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
            gm.l.f(recyclerView, "parent");
            ItemDeviceSpecifyBinding inflate = ItemDeviceSpecifyBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            gm.l.e(inflate, "inflate(\n               …, false\n                )");
            return new b(inflate);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDeviceSpecifyBinding f10831u;

        public b(ItemDeviceSpecifyBinding itemDeviceSpecifyBinding) {
            super(itemDeviceSpecifyBinding.getRoot());
            this.f10831u = itemDeviceSpecifyBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements a.InterfaceC0158a {
        public c() {
            DeviceSpecifyFragment.this = r1;
        }

        @Override // com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment.a.InterfaceC0158a
        public final void a(DeviceShellSpecify deviceShellSpecify) {
            gm.l.f(deviceShellSpecify, "item");
            i2.m f10 = tb.a.f(DeviceSpecifyFragment.this);
            DeviceSpecifyFragment deviceSpecifyFragment = DeviceSpecifyFragment.this;
            mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
            boolean z10 = ((uh.q) deviceSpecifyFragment.f10825w0.getValue()).f28794a;
            String str = deviceShellSpecify.f9658a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isAfterFillUser", z10);
            bundle.putString("nameSpecify", str);
            f10.l(R.id.toDeviceBind, bundle, null);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment$onViewCreated$6", f = "DeviceSpecifyFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10834e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            DeviceSpecifyFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((e) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10834e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            Throwable th2 = (Throwable) this.f10834e;
            DeviceSpecifyFragment deviceSpecifyFragment = DeviceSpecifyFragment.this;
            mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
            if (deviceSpecifyFragment.h1().loadingView.getVisibility() == 8) {
                qi.p.f(DeviceSpecifyFragment.this.f1(), th2);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment$onViewCreated$7", f = "DeviceSpecifyFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<ei.a<List<? extends DeviceShellSpecify>>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10836e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            DeviceSpecifyFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<List<? extends DeviceShellSpecify>> aVar, xl.d<? super tl.l> dVar) {
            return ((f) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f10836e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            a0.k(obj);
            ei.a aVar = (ei.a) this.f10836e;
            List<DeviceShellSpecify> list = (List) aVar.f13683a.a();
            if (list != null && !list.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                DeviceSpecifyFragment deviceSpecifyFragment = DeviceSpecifyFragment.this;
                mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
                deviceSpecifyFragment.h1().refreshLayout.setRefreshing(false);
                if (aVar.f13683a instanceof u6.l) {
                    DeviceSpecifyFragment.this.h1().loadingView.c();
                } else {
                    DeviceSpecifyFragment.this.h1().loadingView.a(R.string.tip_load_error);
                }
            } else {
                DeviceSpecifyFragment deviceSpecifyFragment2 = DeviceSpecifyFragment.this;
                mm.h<Object>[] hVarArr2 = DeviceSpecifyFragment.A0;
                deviceSpecifyFragment2.h1().refreshLayout.setRefreshing(aVar.f13683a instanceof u6.l);
                DeviceSpecifyFragment.this.h1().loadingView.setVisibility(8);
                a aVar2 = DeviceSpecifyFragment.this.f10826x0;
                aVar2.f10829d = list;
                aVar2.h();
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment$onViewCreated$8", f = "DeviceSpecifyFragment.kt", l = {144}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f10838e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ DeviceSpecifyFragment f10840a;

            public a(DeviceSpecifyFragment deviceSpecifyFragment) {
                this.f10840a = deviceSpecifyFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                if (((wf.b) obj) == wf.b.CONNECTED) {
                    DeviceSpecifyFragment deviceSpecifyFragment = this.f10840a;
                    mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
                    d7.e.h(deviceSpecifyFragment.f1(), R.string.device_bind_success, true, this.f10840a.f10822t0, 12);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            DeviceSpecifyFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            ((g) p(e0Var, dVar)).t(tl.l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new g(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10838e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                t tVar = DeviceSpecifyFragment.this.f10827y0;
                if (tVar != null) {
                    f1<wf.b> J = tVar.J();
                    a aVar2 = new a(DeviceSpecifyFragment.this);
                    this.f10838e = 1;
                    if (J.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("deviceManager");
                    throw null;
                }
            }
            throw new u2.b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f10841b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar) {
            super(0);
            this.f10841b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10841b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f10841b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f10842b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10842b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f10843b = iVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10843b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.d dVar) {
            super(0);
            this.f10844b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10844b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(tl.d dVar) {
            super(0);
            this.f10845b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10845b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10846b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(r rVar, tl.d dVar) {
            super(0);
            this.f10846b = rVar;
            this.f10847c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10847c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10846b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        gm.t tVar = new gm.t(DeviceSpecifyFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDeviceSpecifyBinding;", 0);
        b0.f15488a.getClass();
        A0 = new mm.h[]{tVar};
    }

    public DeviceSpecifyFragment() {
        super(R.layout.fragment_device_specify);
        this.f10822t0 = 1;
        this.f10823u0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDeviceSpecifyBinding.class, this);
        tl.d a10 = fb.e.a(new j(new i(this)));
        this.f10824v0 = ab.b.f(this, b0.a(DeviceSpecifyViewModel.class), new k(a10), new l(a10), new m(this, a10));
        this.f10825w0 = new i2.g(b0.a(uh.q.class), new h(this));
        this.f10826x0 = new a();
        this.f10828z0 = R0(new i0(6, this), new e.d());
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        this.f10826x0.f10830e = null;
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // uh.i.a
    public final void L() {
        tb.a.f(this).n(new i2.a(R.id.toConnectHelp));
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        if (((uh.q) this.f10825w0.getValue()).f28794a) {
            h1().toolbar.setNavigationIcon((Drawable) null);
        } else {
            h1().toolbar.getMenu().findItem(R.id.menu_skip).setVisible(false);
        }
        h1().toolbar.setOnMenuItemClickListener(new jc.f(6, this));
        this.f10826x0.f10830e = new c();
        RecyclerView recyclerView = h1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        h1().recyclerView.setAdapter(this.f10826x0);
        h1().loadingView.setListener(new q0(11, this));
        h1().refreshLayout.setOnRefreshListener(new r0(13, this));
        n(i1(), new gm.t() { // from class: com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, v6.b.i(i1()), new e(null), null);
        G(i1(), z.f28636a, new f(null));
        qi.h.k(qi.h.i(this), new g(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // uh.i.a
    public final void d() {
        tb.a.f(this).n(new i2.a(R.id.toBgRunSettings));
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, gm.t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f10822t0) {
            if (((uh.q) this.f10825w0.getValue()).f28794a) {
                int i11 = MainActivity.E;
                MainActivity.a.a(V0());
                T0().finish();
                return;
            }
            tb.a.f(this).p();
        }
    }

    public final FragmentDeviceSpecifyBinding h1() {
        return (FragmentDeviceSpecifyBinding) this.f10823u0.a(this, A0[0]);
    }

    public final DeviceSpecifyViewModel i1() {
        return (DeviceSpecifyViewModel) this.f10824v0.getValue();
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, gm.t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
