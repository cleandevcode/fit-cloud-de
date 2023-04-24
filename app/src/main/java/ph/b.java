package ph;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topstep.fitcloud.pro.databinding.FragmentAbsHealthDetailBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import ph.c;
import ph.f0;
import pm.z1;
import r7.a;
import sm.g1;
import v6.a;
import vf.i;

@Metadata
/* loaded from: classes2.dex */
public abstract class b<T extends vf.i, U extends r7.a<?>> extends y implements v6.a, f0.a {

    /* renamed from: s0 */
    public static final /* synthetic */ mm.h<Object>[] f24086s0;

    /* renamed from: p0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f24087p0;

    /* renamed from: q0 */
    public U f24088q0;

    /* renamed from: r0 */
    public final a f24089r0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ b<T, U> f24090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T, U> bVar) {
            super(1);
            this.f24090b = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Date[], java.io.Serializable] */
        @Override // fm.l
        public final tl.l k(View view) {
            Serializable serializable;
            T t10;
            c.b bVar;
            c.b bVar2;
            View view2 = view;
            gm.l.f(view2, "view");
            b<T, U> bVar3 = this.f24090b;
            mm.h<Object>[] hVarArr = b.f24086s0;
            boolean z10 = true;
            if (gm.l.a(view2, bVar3.l1().imgArrowLeft)) {
                ph.c<T> m12 = this.f24090b.m1();
                z1 z1Var = m12.f24121p;
                if (!((z1Var == null || !z1Var.a()) ? false : false) && (bVar2 = (c.b) m12.f24118m.getValue()) != null) {
                    m12.f24121p = bi.z0.g(rm.l.h(m12), null, 0, new ph.e(m12, bVar2, null), 3);
                }
            } else if (gm.l.a(view2, this.f24090b.l1().imgArrowRight)) {
                ph.c<T> m13 = this.f24090b.m1();
                z1 z1Var2 = m13.f24121p;
                if (!((z1Var2 == null || !z1Var2.a()) ? false : false) && (bVar = (c.b) m13.f24118m.getValue()) != null) {
                    m13.f24121p = bi.z0.g(rm.l.h(m13), null, 0, new ph.j(m13, bVar, null), 3);
                }
            } else if (gm.l.a(view2, this.f24090b.l1().tvDate)) {
                List<vf.i> list = (List) bi.z0.n(new ph.a(this.f24090b, null));
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                }
                if (!z10) {
                    ArrayList arrayList = new ArrayList(ul.l.B(list, 10));
                    for (vf.i iVar : list) {
                        arrayList.add(iVar.a());
                    }
                    Object[] array = arrayList.toArray(new Date[0]);
                    gm.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    ?? r72 = (Date[]) array;
                    c.b bVar4 = (c.b) this.f24090b.m1().f24119n.getValue();
                    if (bVar4 != null && (t10 = bVar4.f24127b) != null) {
                        serializable = t10.a();
                    } else {
                        serializable = null;
                    }
                    int i10 = f0.C0;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("select_date", serializable);
                    bundle.putSerializable("mark_date", r72);
                    f0 f0Var = new f0();
                    f0Var.Z0(bundle);
                    f0Var.h1(this.f24090b.h0(), null);
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$onViewCreated$11", f = "AbsHealthDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ph.b$b */
    /* loaded from: classes2.dex */
    public static final class C0435b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f24091e;

        /* renamed from: f */
        public final /* synthetic */ b<T, U> f24092f;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$onViewCreated$11$1", f = "AbsHealthDetailFragment.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: ph.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f24093e;

            /* renamed from: f */
            public final /* synthetic */ b<T, U> f24094f;

            /* renamed from: ph.b$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0436a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ b<T, U> f24095a;

                public C0436a(b<T, U> bVar) {
                    this.f24095a = bVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    float f10;
                    c.b bVar = (c.b) obj;
                    if (bVar == null) {
                        b<T, U> bVar2 = this.f24095a;
                        mm.h<Object>[] hVarArr = b.f24086s0;
                        bVar2.l1().tvDate.setText((CharSequence) null);
                        this.f24095a.l1().imgArrowLeft.setEnabled(false);
                        this.f24095a.l1().imgArrowRight.setEnabled(false);
                    } else {
                        b<T, U> bVar3 = this.f24095a;
                        mm.h<Object>[] hVarArr2 = b.f24086s0;
                        TextView textView = bVar3.l1().tvDate;
                        Date a10 = bVar.f24127b.a();
                        gm.l.f(a10, "date");
                        textView.setText(dg.a.a(a10));
                        this.f24095a.l1().imgArrowLeft.setEnabled(bVar.f24128c);
                        this.f24095a.l1().imgArrowRight.setEnabled(bVar.f24129d);
                    }
                    ImageView imageView = this.f24095a.l1().imgArrowLeft;
                    float f11 = 1.0f;
                    if (this.f24095a.l1().imgArrowLeft.isEnabled()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    imageView.setAlpha(f10);
                    ImageView imageView2 = this.f24095a.l1().imgArrowRight;
                    if (!this.f24095a.l1().imgArrowRight.isEnabled()) {
                        f11 = 0.5f;
                    }
                    imageView2.setAlpha(f11);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<T, U> bVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f24094f = bVar;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f24094f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f24093e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    g1 g1Var = this.f24094f.m1().f24119n;
                    C0436a c0436a = new C0436a(this.f24094f);
                    this.f24093e = 1;
                    if (g1Var.a(c0436a, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0435b(b<T, U> bVar, xl.d<? super C0435b> dVar) {
            super(2, dVar);
            this.f24092f = bVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((C0435b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            C0435b c0435b = new C0435b(this.f24092f, dVar);
            c0435b.f24091e = obj;
            return c0435b;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            bi.z0.g((pm.e0) this.f24091e, null, 0, new a(this.f24092f, null), 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$onViewCreated$2", f = "AbsHealthDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f24097e;

        /* renamed from: f */
        public final /* synthetic */ b<T, U> f24098f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<T, U> bVar, xl.d<? super d> dVar) {
            super(2, dVar);
            this.f24098f = bVar;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(this.f24098f, dVar);
            dVar2.f24097e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            b<T, U> bVar = this.f24098f;
            mm.h<Object>[] hVarArr = b.f24086s0;
            qi.p.f(bVar.f1(), (Throwable) this.f24097e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$onViewCreated$4", f = "AbsHealthDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<u6.a<? extends List<? extends T>>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f24100e;

        /* renamed from: f */
        public final /* synthetic */ b<T, U> f24101f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b<T, U> bVar, xl.d<? super f> dVar) {
            super(2, dVar);
            this.f24101f = bVar;
        }

        @Override // fm.p
        public final Object A(Object obj, xl.d<? super tl.l> dVar) {
            return ((f) p((u6.a) obj, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(this.f24101f, dVar);
            fVar.f24100e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            u6.a aVar = (u6.a) this.f24100e;
            if (aVar instanceof u6.l) {
                b<T, U> bVar = this.f24101f;
                mm.h<Object>[] hVarArr = b.f24086s0;
                bVar.l1().listLoadingView.c();
            } else if (aVar instanceof u6.a0) {
                b<T, U> bVar2 = this.f24101f;
                mm.h<Object>[] hVarArr2 = b.f24086s0;
                bVar2.l1().listLoadingView.setVisibility(8);
            } else if (aVar instanceof u6.g) {
                b<T, U> bVar3 = this.f24101f;
                mm.h<Object>[] hVarArr3 = b.f24086s0;
                bVar3.l1().listLoadingView.a(R.string.tip_load_error);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$onViewCreated$7", f = "AbsHealthDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f24103e;

        /* renamed from: f */
        public final /* synthetic */ b<T, U> f24104f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b<T, U> bVar, xl.d<? super h> dVar) {
            super(2, dVar);
            this.f24104f = bVar;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((h) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            h hVar = new h(this.f24104f, dVar);
            hVar.f24103e = obj;
            return hVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            b<T, U> bVar = this.f24104f;
            mm.h<Object>[] hVarArr = b.f24086s0;
            qi.p.f(bVar.f1(), (Throwable) this.f24103e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$onViewCreated$9", f = "AbsHealthDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends zl.i implements fm.p<u6.a<? extends T>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f24106e;

        /* renamed from: f */
        public final /* synthetic */ b<T, U> f24107f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b<T, U> bVar, xl.d<? super j> dVar) {
            super(2, dVar);
            this.f24107f = bVar;
        }

        @Override // fm.p
        public final Object A(Object obj, xl.d<? super tl.l> dVar) {
            return ((j) p((u6.a) obj, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            j jVar = new j(this.f24107f, dVar);
            jVar.f24106e = obj;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            u6.a aVar = (u6.a) this.f24106e;
            if (aVar instanceof u6.l) {
                b<T, U> bVar = this.f24107f;
                mm.h<Object>[] hVarArr = b.f24086s0;
                bVar.l1().detailLoadingView.c();
                this.f24107f.h1().setVisibility(8);
            } else if (aVar instanceof u6.a0) {
                b<T, U> bVar2 = this.f24107f;
                mm.h<Object>[] hVarArr2 = b.f24086s0;
                bVar2.l1().detailLoadingView.setVisibility(8);
                this.f24107f.h1().setVisibility(0);
                this.f24107f.n1((vf.i) ((u6.a0) aVar).f28523c);
            } else if (aVar instanceof u6.g) {
                b<T, U> bVar3 = this.f24107f;
                mm.h<Object>[] hVarArr3 = b.f24086s0;
                bVar3.l1().listLoadingView.a(R.string.tip_load_error);
            }
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(b.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAbsHealthDetailBinding;", 0);
        gm.b0.f15488a.getClass();
        f24086s0 = new mm.h[]{tVar};
    }

    public b() {
        super(R.layout.fragment_abs_health_detail);
        this.f24087p0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAbsHealthDetailBinding.class, this);
        this.f24089r0 = new a(this);
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        if (j1() != 0) {
            l1().infoContainer.addView(LayoutInflater.from(V0()).inflate(j1(), (ViewGroup) l1().infoContainer, false), 1, new LinearLayout.LayoutParams(-1, -2));
        }
        r7.c i12 = i1();
        gm.l.f(i12, "<set-?>");
        this.f24088q0 = i12;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginEnd(g7.a.a(V0(), 4.0f));
        layoutParams.setMarginStart(g7.a.a(V0(), 4.0f));
        l1().chartContainer.addView(h1(), layoutParams);
        if (k1() != 0) {
            l1().tipsContainer.addView(k0().inflate(k1(), (ViewGroup) l1().tipsContainer, false));
        }
        n(m1(), new gm.t() { // from class: ph.b.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((c.C0438c) obj).f24130a;
            }
        }, v6.b.i(m1()), new d(this, null), null);
        e(m1(), new gm.t() { // from class: ph.b.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((c.C0438c) obj).f24130a;
            }
        }, u6.z.f28636a, new f(this, null));
        l1().listLoadingView.setListener(new s.q0(10, this));
        n(m1(), new gm.t() { // from class: ph.b.g
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((c.C0438c) obj).f24131b;
            }
        }, v6.b.i(m1()), new h(this, null), null);
        e(m1(), new gm.t() { // from class: ph.b.i
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((c.C0438c) obj).f24131b;
            }
        }, u6.z.f28636a, new j(this, null));
        l1().detailLoadingView.setListener(new s.r0(11, this));
        qi.h.k(qi.h.i(this), new C0435b(this, null));
        p.b.g(l1().imgArrowLeft, this.f24089r0);
        p.b.g(l1().imgArrowRight, this.f24089r0);
        p.b.g(l1().tvDate, this.f24089r0);
    }

    @Override // v6.a
    public final androidx.lifecycle.u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, gm.t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final U h1() {
        U u10 = this.f24088q0;
        if (u10 != null) {
            return u10;
        }
        gm.l.l("chart");
        throw null;
    }

    public abstract r7.c i1();

    public abstract int j1();

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    public abstract int k1();

    public final FragmentAbsHealthDetailBinding l1() {
        return (FragmentAbsHealthDetailBinding) this.f24087p0.a(this, f24086s0[0]);
    }

    public abstract ph.c<T> m1();

    @Override // v6.a
    public final z1 n(v6.b bVar, gm.t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }

    public abstract void n1(T t10);

    @Override // ph.f0.a
    public final void w(Date date) {
        ph.c<T> m12 = m1();
        m12.getClass();
        z1 z1Var = m12.f24121p;
        boolean z10 = true;
        if ((z1Var == null || !z1Var.a()) ? false : false) {
            return;
        }
        m12.f24121p = bi.z0.g(rm.l.h(m12), null, 0, new ph.d(m12, date, null), 3);
    }
}
