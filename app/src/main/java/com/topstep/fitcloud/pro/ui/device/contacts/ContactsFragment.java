package com.topstep.fitcloud.pro.ui.device.contacts;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentContactsBinding;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloud.pro.ui.widget.SwipeItemLayout;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.l;
import gm.m;
import gm.t;
import java.util.ArrayList;
import jh.w;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import qi.s;
import s.i0;
import s.m1;
import s.n2;
import vh.b;
import vh.c;
import vh.k;
import y3.c1;

@Metadata
/* loaded from: classes2.dex */
public final class ContactsFragment extends k {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f10879y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10880t0;

    /* renamed from: u0 */
    public final t0 f10881u0;

    /* renamed from: v0 */
    public vh.b f10882v0;

    /* renamed from: w0 */
    public final q f10883w0;

    /* renamed from: x0 */
    public final a f10884x0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            ContactsFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            vh.b bVar = ContactsFragment.this.f10882v0;
            if (bVar != null) {
                if (bVar.e() <= 0) {
                    ContactsFragment.this.h1().loadingView.a(R.string.tip_current_no_data);
                    return;
                }
                return;
            }
            l.l("adapter");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends androidx.activity.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(true);
            ContactsFragment.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            ContactsFragment contactsFragment = ContactsFragment.this;
            mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
            contactsFragment.j1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements b.InterfaceC0532b {
        public c() {
            ContactsFragment.this = r1;
        }

        @Override // vh.b.InterfaceC0532b
        public final void a(int i10) {
            ContactsFragment contactsFragment = ContactsFragment.this;
            mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
            ContactsViewModel i12 = contactsFragment.i1();
            i12.getClass();
            z0.g(rm.l.h(i12), null, 0, new vh.g(i12, i10, null), 3);
        }

        @Override // vh.b.InterfaceC0532b
        public final void b(int i10, int i11) {
            ContactsFragment contactsFragment = ContactsFragment.this;
            mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
            ContactsViewModel i12 = contactsFragment.i1();
            i12.getClass();
            z0.g(rm.l.h(i12), null, 0, new vh.j(i12, i10, i11, null), 3);
            s.b(i12.f10904i);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment$onViewCreated$6$1", f = "ContactsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            ContactsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            int i10;
            a0.k(obj);
            vh.b bVar = ContactsFragment.this.f10882v0;
            if (bVar != null) {
                ArrayList<rj.c> arrayList = bVar.f29384d;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                if (i10 >= 10) {
                    d7.e.f(ContactsFragment.this.f1(), R.string.ds_contacts_tips1);
                } else {
                    si.f fVar = si.f.f27071a;
                    ContactsFragment contactsFragment = ContactsFragment.this;
                    i0 i0Var = new i0(7, contactsFragment);
                    l.f(contactsFragment, "fragment");
                    if (Build.VERSION.SDK_INT < 23) {
                        i0Var.b(true);
                    } else {
                        Context V0 = contactsFragment.V0();
                        ArrayList arrayList2 = new ArrayList(1);
                        String string = V0.getString(R.string.permission_contacts_for_contacts);
                        l.e(string, "context.getString(R.stri…on_contacts_for_contacts)");
                        arrayList2.add(new si.c("android.permission-group.CONTACTS", string, null));
                        si.f.h(fVar, contactsFragment, h7.a.f("android.permission.READ_CONTACTS"), arrayList2, i0Var);
                    }
                }
                return tl.l.f28297a;
            }
            l.l("adapter");
            throw null;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment$onViewCreated$7", f = "ContactsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10889e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment$onViewCreated$7$1", f = "ContactsFragment.kt", l = {125}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10891e;

            /* renamed from: f */
            public final /* synthetic */ ContactsFragment f10892f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0160a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ ContactsFragment f10893a;

                public C0160a(ContactsFragment contactsFragment) {
                    this.f10893a = contactsFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    y3.b<ArrayList<rj.c>> bVar = ((vh.e) obj).f29395a;
                    if (bVar instanceof y3.p) {
                        ContactsFragment contactsFragment = this.f10893a;
                        mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
                        contactsFragment.h1().loadingView.c();
                    } else if (bVar instanceof y3.j) {
                        ContactsFragment contactsFragment2 = this.f10893a;
                        mm.h<Object>[] hVarArr2 = ContactsFragment.f10879y0;
                        contactsFragment2.h1().loadingView.a(R.string.tip_load_error);
                    } else {
                        if (bVar instanceof c1) {
                            ArrayList<rj.c> a10 = bVar.a();
                            if (a10 != null && !a10.isEmpty()) {
                                ContactsFragment contactsFragment3 = this.f10893a;
                                mm.h<Object>[] hVarArr3 = ContactsFragment.f10879y0;
                                contactsFragment3.h1().loadingView.setVisibility(8);
                            } else {
                                ContactsFragment contactsFragment4 = this.f10893a;
                                mm.h<Object>[] hVarArr4 = ContactsFragment.f10879y0;
                                contactsFragment4.h1().loadingView.a(R.string.tip_current_no_data);
                            }
                            vh.b bVar2 = this.f10893a.f10882v0;
                            if (bVar2 != null) {
                                bVar2.f29384d = a10;
                                bVar2.h();
                                this.f10893a.h1().fabAdd.o(null, true);
                            } else {
                                l.l("adapter");
                                throw null;
                            }
                        }
                        return tl.l.f28297a;
                    }
                    this.f10893a.h1().fabAdd.h();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ContactsFragment contactsFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10892f = contactsFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10892f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10891e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    ContactsFragment contactsFragment = this.f10892f;
                    mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
                    sm.t0 t0Var = contactsFragment.i1().f22394e;
                    C0160a c0160a = new C0160a(this.f10892f);
                    this.f10891e = 1;
                    if (t0Var.a(c0160a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment$onViewCreated$7$2", f = "ContactsFragment.kt", l = {152}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10894e;

            /* renamed from: f */
            public final /* synthetic */ ContactsFragment f10895f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ ContactsFragment f10896a;

                public a(ContactsFragment contactsFragment) {
                    this.f10896a = contactsFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    vh.c cVar = (vh.c) obj;
                    if (cVar instanceof c.e) {
                        ContactsFragment contactsFragment = this.f10896a;
                        mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
                        qi.p.f(contactsFragment.f1(), ((c.e) cVar).f29394a);
                    } else if (cVar instanceof c.a) {
                        vh.b bVar = this.f10896a.f10882v0;
                        if (bVar != null) {
                            bVar.f2947a.e(((c.a) cVar).f29389a, 1);
                        } else {
                            l.l("adapter");
                            throw null;
                        }
                    } else if (cVar instanceof c.d) {
                        vh.b bVar2 = this.f10896a.f10882v0;
                        if (bVar2 != null) {
                            bVar2.f2947a.f(((c.d) cVar).f29393a, 1);
                        } else {
                            l.l("adapter");
                            throw null;
                        }
                    } else if (cVar instanceof c.b) {
                        vh.b bVar3 = this.f10896a.f10882v0;
                        if (bVar3 != null) {
                            c.b bVar4 = (c.b) cVar;
                            bVar3.i(bVar4.f29390a, bVar4.f29391b);
                        } else {
                            l.l("adapter");
                            throw null;
                        }
                    } else if (cVar instanceof c.C0533c) {
                        tb.a.f(this.f10896a).o();
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ContactsFragment contactsFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10895f = contactsFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10895f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10894e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    ContactsFragment contactsFragment = this.f10895f;
                    mm.h<Object>[] hVarArr = ContactsFragment.f10879y0;
                    sm.c cVar = contactsFragment.i1().f22396g;
                    a aVar2 = new a(this.f10895f);
                    this.f10894e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            ContactsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10889e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10889e;
            z0.g(e0Var, null, 0, new a(ContactsFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(ContactsFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f10897b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10897b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f10898b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10898b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f10899b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10899b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f10900b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10900b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10901b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, tl.d dVar) {
            super(0);
            this.f10901b = rVar;
            this.f10902c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10902c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10901b.r();
            }
            l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(ContactsFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentContactsBinding;", 0);
        b0.f15488a.getClass();
        f10879y0 = new mm.h[]{tVar};
    }

    public ContactsFragment() {
        super(R.layout.fragment_contacts);
        this.f10880t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentContactsBinding.class, this);
        tl.d a10 = fb.e.a(new g(new f(this)));
        this.f10881u0 = ab.b.f(this, b0.a(ContactsViewModel.class), new h(a10), new i(a10), new j(this, a10));
        this.f10883w0 = R0(new n2(6, this), new e.d());
        this.f10884x0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f10882v0 = new vh.b();
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        vh.b bVar = this.f10882v0;
        if (bVar != null) {
            bVar.x(this.f10884x0);
        } else {
            l.l("adapter");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        h1().toolbar.setNavigationOnClickListener(new rh.k(2, this));
        T0().f705h.a(q0(), new b());
        RecyclerView recyclerView = h1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = h1().recyclerView;
        oi.a aVar = new oi.a(V0());
        aVar.f23560d = true;
        recyclerView2.g(aVar);
        h1().recyclerView.f2897q.add(new SwipeItemLayout.b(V0()));
        vh.b bVar = this.f10882v0;
        if (bVar != null) {
            bVar.f29385e = new c();
            bVar.u(this.f10884x0);
            RecyclerView recyclerView3 = h1().recyclerView;
            vh.b bVar2 = this.f10882v0;
            if (bVar2 != null) {
                recyclerView3.setAdapter(bVar2);
                vh.b bVar3 = this.f10882v0;
                if (bVar3 != null) {
                    androidx.recyclerview.widget.t tVar = bVar3.f29386f;
                    RecyclerView recyclerView4 = h1().recyclerView;
                    RecyclerView recyclerView5 = tVar.f3284r;
                    if (recyclerView5 != recyclerView4) {
                        if (recyclerView5 != null) {
                            recyclerView5.Y(tVar);
                            RecyclerView recyclerView6 = tVar.f3284r;
                            t.b bVar4 = tVar.f3292z;
                            recyclerView6.f2897q.remove(bVar4);
                            if (recyclerView6.f2899r == bVar4) {
                                recyclerView6.f2899r = null;
                            }
                            ArrayList arrayList = tVar.f3284r.C;
                            if (arrayList != null) {
                                arrayList.remove(tVar);
                            }
                            int size = tVar.f3282p.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                                t.f fVar = (t.f) tVar.f3282p.get(0);
                                fVar.f3309g.cancel();
                                t.d dVar = tVar.f3279m;
                                RecyclerView.b0 b0Var = fVar.f3307e;
                                dVar.getClass();
                                t.d.a(b0Var);
                            }
                            tVar.f3282p.clear();
                            tVar.f3289w = null;
                            VelocityTracker velocityTracker = tVar.f3286t;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                tVar.f3286t = null;
                            }
                            t.e eVar = tVar.f3291y;
                            if (eVar != null) {
                                eVar.f3301a = false;
                                tVar.f3291y = null;
                            }
                            if (tVar.f3290x != null) {
                                tVar.f3290x = null;
                            }
                        }
                        tVar.f3284r = recyclerView4;
                        if (recyclerView4 != null) {
                            Resources resources = recyclerView4.getResources();
                            tVar.f3272f = resources.getDimension(androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity);
                            tVar.f3273g = resources.getDimension(androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity);
                            tVar.f3283q = ViewConfiguration.get(tVar.f3284r.getContext()).getScaledTouchSlop();
                            tVar.f3284r.g(tVar);
                            tVar.f3284r.f2897q.add(tVar.f3292z);
                            RecyclerView recyclerView7 = tVar.f3284r;
                            if (recyclerView7.C == null) {
                                recyclerView7.C = new ArrayList();
                            }
                            recyclerView7.C.add(tVar);
                            tVar.f3291y = new t.e();
                            tVar.f3290x = new k1.e(tVar.f3284r.getContext(), tVar.f3291y);
                        }
                    }
                    h1().loadingView.setListener(new m1(11, this));
                    LoadingView loadingView = h1().loadingView;
                    RecyclerView recyclerView8 = h1().recyclerView;
                    l.e(recyclerView8, "viewBind.recyclerView");
                    loadingView.setAssociateViews(new View[]{recyclerView8});
                    h1().fabAdd.setOnClickListener(new w(5, this));
                    qi.h.k(qi.h.i(this), new e(null));
                    return;
                }
                l.l("adapter");
                throw null;
            }
            l.l("adapter");
            throw null;
        }
        l.l("adapter");
        throw null;
    }

    public final FragmentContactsBinding h1() {
        return (FragmentContactsBinding) this.f10880t0.a(this, f10879y0[0]);
    }

    public final ContactsViewModel i1() {
        return (ContactsViewModel) this.f10881u0.getValue();
    }

    public final void j1() {
        if (i1().f10904i.c()) {
            tb.a.f(this).o();
        } else {
            new vh.m().h1(h0(), null);
        }
    }
}
