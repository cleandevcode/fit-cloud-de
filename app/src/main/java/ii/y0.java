package ii;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class y0 extends f0 {
    public static final /* synthetic */ int I0 = 0;
    public final androidx.lifecycle.t0 G0;
    public ArrayAdapter<a> H0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final cg.a f17006a;

        /* renamed from: b */
        public final String f17007b;

        public a(cg.a aVar, String str) {
            this.f17006a = aVar;
            this.f17007b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f17006a == aVar.f17006a && gm.l.a(this.f17007b, aVar.f17007b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17007b.hashCode() + (this.f17006a.hashCode() * 31);
        }

        public final String toString() {
            return this.f17007b;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.ThemeSettingDialogFragment$onCreate$1", f = "ThemeSettingDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f17008e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.ThemeSettingDialogFragment$onCreate$1$1", f = "ThemeSettingDialogFragment.kt", l = {51}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f17010e;

            /* renamed from: f */
            public final /* synthetic */ y0 f17011f;

            /* renamed from: ii.y0$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0297a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ y0 f17012a;

                public C0297a(y0 y0Var) {
                    this.f17012a = y0Var;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    cg.a aVar;
                    boolean z10;
                    cg.a aVar2 = (cg.a) obj;
                    y0 y0Var = this.f17012a;
                    ArrayAdapter<a> arrayAdapter = y0Var.H0;
                    if (arrayAdapter != null) {
                        lm.i it = h7.a.A(0, arrayAdapter.getCount()).iterator();
                        int i10 = 0;
                        while (true) {
                            if (it.f20076c) {
                                int nextInt = it.nextInt();
                                if (i10 >= 0) {
                                    ArrayAdapter<a> arrayAdapter2 = y0Var.H0;
                                    if (arrayAdapter2 != null) {
                                        a item = arrayAdapter2.getItem(nextInt);
                                        if (item != null) {
                                            aVar = item.f17006a;
                                        } else {
                                            aVar = null;
                                        }
                                        if (aVar == aVar2) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        gm.l.l("listAdapter");
                                        throw null;
                                    }
                                } else {
                                    h7.a.z();
                                    throw null;
                                }
                            } else {
                                i10 = -1;
                                break;
                            }
                        }
                        Dialog dialog = y0Var.f2477w0;
                        gm.l.d(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
                        ((androidx.appcompat.app.d) dialog).f837e.f782g.setItemChecked(i10, true);
                        return tl.l.f28297a;
                    }
                    gm.l.l("listAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y0 y0Var, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f17011f = y0Var;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f17011f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f17010e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    y0 y0Var = this.f17011f;
                    int i11 = y0.I0;
                    sm.t0 t0Var = ((SettingsViewModel) y0Var.G0.getValue()).f11921r;
                    C0297a c0297a = new C0297a(this.f17011f);
                    this.f17010e = 1;
                    if (t0Var.a(c0297a, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            y0.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f17008e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            bi.z0.g((pm.e0) this.f17008e, null, 0, new a(y0.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f17013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f17013b = gVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f17013b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f17014b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f17014b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f17014b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f17015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.d dVar) {
            super(0);
            this.f17015b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f17015b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f17016b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f17017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f17016b = rVar;
            this.f17017c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f17017c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f17016b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<androidx.lifecycle.y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(0);
            y0.this = r1;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return y0.this.W0();
        }
    }

    public y0() {
        tl.d a10 = fb.e.a(new c(new g()));
        this.G0 = ab.b.f(this, gm.b0.a(SettingsViewModel.class), new d(a10), new e(a10), new f(this, a10));
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        androidx.lifecycle.v vVar = this.Z;
        gm.l.e(vVar, "lifecycle");
        qi.h.k(vVar, new b(null));
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        List<cg.a> q10;
        int i10;
        cg.a aVar = cg.a.DARK;
        cg.a aVar2 = cg.a.LIGHT;
        this.H0 = new ArrayAdapter<>(V0(), 17367055);
        if (Build.VERSION.SDK_INT >= 29) {
            q10 = h7.a.q(aVar2, aVar, cg.a.FLOW_SYSTEM);
        } else {
            q10 = h7.a.q(aVar2, aVar, cg.a.BATTERY_SAVER);
        }
        ArrayAdapter<a> arrayAdapter = this.H0;
        if (arrayAdapter != null) {
            ArrayList arrayList = new ArrayList(ul.l.B(q10, 10));
            for (cg.a aVar3 : q10) {
                int ordinal = aVar3.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                i10 = R.string.settings_theme_battery_saver;
                            } else {
                                throw new qa.p();
                            }
                        } else {
                            i10 = R.string.settings_theme_flow_system;
                        }
                    } else {
                        i10 = R.string.settings_theme_dark;
                    }
                } else {
                    i10 = R.string.settings_theme_light;
                }
                String o02 = o0(i10);
                gm.l.e(o02, "when (theme) {\n        T…heme_battery_saver)\n    }");
                arrayList.add(new a(aVar3, o02));
            }
            arrayAdapter.addAll(arrayList);
            v9.b bVar = new v9.b(V0(), 0);
            bVar.k(R.string.settings_theme_title);
            ArrayAdapter<a> arrayAdapter2 = this.H0;
            if (arrayAdapter2 != null) {
                bVar.i(arrayAdapter2, new vh.l(this, 6));
                return bVar.a();
            }
            gm.l.l("listAdapter");
            throw null;
        }
        gm.l.l("listAdapter");
        throw null;
    }
}
