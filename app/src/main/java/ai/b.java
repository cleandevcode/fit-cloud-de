package ai;

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
import com.topstep.fitcloud.pro.databinding.DialogGameDfuBinding;
import com.topstep.fitcloud.pro.model.game.push.GameSkin;
import com.topstep.fitcloud.pro.model.game.push.GameSpaceSkin;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloudpro.R;
import f.q;
import fm.p;
import gm.b0;
import ij.c;
import java.util.ArrayList;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import s.c0;
import s.q0;

@Metadata
/* loaded from: classes2.dex */
public final class b extends q {
    public static final /* synthetic */ int H0 = 0;
    public String B0;
    public GameSkin C0;
    public m D0;
    public DialogGameDfuBinding E0;
    public final t0 F0;
    public final tl.d G0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<PushStateView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            b.this = r1;
        }

        @Override // fm.l
        public final tl.l k(PushStateView pushStateView) {
            gm.l.f(pushStateView, "it");
            if (!((DfuViewModel) b.this.F0.getValue()).f()) {
                si.f fVar = si.f.f27071a;
                b bVar = b.this;
                fVar.f(bVar, new q0(13, bVar));
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDfuDialogFragment$onCreateDialog$2", f = "GameDfuDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ai.b$b */
    /* loaded from: classes2.dex */
    public static final class C0007b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f522e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDfuDialogFragment$onCreateDialog$2$1", f = "GameDfuDialogFragment.kt", l = {105}, m = "invokeSuspend")
        /* renamed from: ai.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f524e;

            /* renamed from: f */
            public final /* synthetic */ b f525f;

            /* renamed from: ai.b$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0008a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ b f526a;

                public C0008a(b bVar) {
                    this.f526a = bVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    b bVar;
                    PushStateView pushStateView;
                    int i10;
                    c.a aVar = (c.a) obj;
                    boolean z10 = false;
                    switch (c0.b(aVar.f17044a)) {
                        case 0:
                        case 5:
                        case 6:
                            b bVar2 = this.f526a;
                            int i11 = b.H0;
                            bVar2.i1();
                            bVar = this.f526a;
                            z10 = true;
                            bVar.f1(z10);
                            DialogGameDfuBinding dialogGameDfuBinding = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding);
                            dialogGameDfuBinding.stateView.setProgress(aVar.f17045b);
                            return tl.l.f28297a;
                        case 1:
                            DialogGameDfuBinding dialogGameDfuBinding2 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding2);
                            pushStateView = dialogGameDfuBinding2.stateView;
                            i10 = R.string.ds_dfu_downloading;
                            pushStateView.setText(i10);
                            bVar = this.f526a;
                            bVar.f1(z10);
                            DialogGameDfuBinding dialogGameDfuBinding3 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding3);
                            dialogGameDfuBinding3.stateView.setProgress(aVar.f17045b);
                            return tl.l.f28297a;
                        case 2:
                        case 3:
                            DialogGameDfuBinding dialogGameDfuBinding4 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding4);
                            pushStateView = dialogGameDfuBinding4.stateView;
                            i10 = R.string.ds_dfu_preparing;
                            pushStateView.setText(i10);
                            bVar = this.f526a;
                            bVar.f1(z10);
                            DialogGameDfuBinding dialogGameDfuBinding32 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding32);
                            dialogGameDfuBinding32.stateView.setProgress(aVar.f17045b);
                            return tl.l.f28297a;
                        case 4:
                            DialogGameDfuBinding dialogGameDfuBinding5 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding5);
                            pushStateView = dialogGameDfuBinding5.stateView;
                            i10 = R.string.ds_dfu_pushing;
                            pushStateView.setText(i10);
                            bVar = this.f526a;
                            bVar.f1(z10);
                            DialogGameDfuBinding dialogGameDfuBinding322 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding322);
                            dialogGameDfuBinding322.stateView.setProgress(aVar.f17045b);
                            return tl.l.f28297a;
                        default:
                            DialogGameDfuBinding dialogGameDfuBinding3222 = this.f526a.E0;
                            gm.l.c(dialogGameDfuBinding3222);
                            dialogGameDfuBinding3222.stateView.setProgress(aVar.f17045b);
                            return tl.l.f28297a;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f525f = bVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f525f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f524e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.b e10 = ((DfuViewModel) this.f525f.F0.getValue()).e();
                    C0008a c0008a = new C0008a(this.f525f);
                    this.f524e = 1;
                    if (e10.a(c0008a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDfuDialogFragment$onCreateDialog$2$2", f = "GameDfuDialogFragment.kt", l = {128}, m = "invokeSuspend")
        /* renamed from: ai.b$b$b */
        /* loaded from: classes2.dex */
        public static final class C0009b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f527e;

            /* renamed from: f */
            public final /* synthetic */ b f528f;

            /* renamed from: ai.b$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ b f529a;

                public a(b bVar) {
                    this.f529a = bVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.b) {
                        d7.e.h((d7.e) this.f529a.G0.getValue(), R.string.ds_push_success, true, 0, 28);
                        rm.l.g(this.f529a).e(new ai.c(this.f529a, null));
                    } else if (cVar instanceof c.a) {
                        h7.a.v((d7.e) this.f529a.G0.getValue(), this.f529a.V0(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0009b(b bVar, xl.d<? super C0009b> dVar) {
                super(2, dVar);
                this.f528f = bVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0009b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0009b(this.f528f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f527e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.c cVar = ((DfuViewModel) this.f528f.F0.getValue()).f10912g;
                    a aVar2 = new a(this.f528f);
                    this.f527e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0007b(xl.d<? super C0007b> dVar) {
            super(2, dVar);
            b.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((C0007b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            C0007b c0007b = new C0007b(dVar);
            c0007b.f522e = obj;
            return c0007b;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f522e;
            z0.g(e0Var, null, 0, new a(b.this, null), 3);
            z0.g(e0Var, null, 0, new C0009b(b.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(0);
            this.f530b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f530b).f(R.id.game_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.i iVar) {
            super(0);
            this.f531b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f531b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f532b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f533c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, tl.i iVar) {
            super(0);
            this.f532b = rVar;
            this.f533c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f532b.T0();
            i2.j jVar = (i2.j) this.f533c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    public b() {
        tl.i iVar = new tl.i(new c(this));
        this.F0 = ab.b.e(this, b0.a(DfuViewModel.class), new d(iVar), new e(this, iVar));
        this.G0 = qi.p.d(this);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        Bundle U0 = U0();
        String string = U0.getString("name");
        gm.l.c(string);
        this.B0 = string;
        int i10 = Build.VERSION.SDK_INT;
        Parcelable parcelable = i10 >= 33 ? (Parcelable) U0.getParcelable("skin", GameSkin.class) : U0.getParcelable("skin");
        gm.l.c(parcelable);
        this.C0 = (GameSkin) parcelable;
        ArrayList parcelableArrayList = i10 >= 33 ? U0.getParcelableArrayList("spaces", GameSpaceSkin.class) : U0.getParcelableArrayList("spaces");
        gm.l.c(parcelableArrayList);
        if (!parcelableArrayList.isEmpty()) {
            GameSkin gameSkin = this.C0;
            if (gameSkin != null) {
                this.D0 = new m(parcelableArrayList, gameSkin.getBinSize());
            } else {
                gm.l.l("skin");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.E0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        DialogGameDfuBinding inflate = DialogGameDfuBinding.inflate(LayoutInflater.from(i0()));
        this.E0 = inflate;
        gm.l.c(inflate);
        TextView textView = inflate.tvName;
        String str = this.B0;
        if (str != null) {
            textView.setText(str);
            DialogGameDfuBinding dialogGameDfuBinding = this.E0;
            gm.l.c(dialogGameDfuBinding);
            ImageView imageView = dialogGameDfuBinding.imgView;
            gm.l.e(imageView, "viewBind.imgView");
            GameSkin gameSkin = this.C0;
            if (gameSkin != null) {
                a.f.g(imageView, gameSkin.getImgUrl(), 8);
                if (this.D0 == null) {
                    DialogGameDfuBinding dialogGameDfuBinding2 = this.E0;
                    gm.l.c(dialogGameDfuBinding2);
                    dialogGameDfuBinding2.layoutSelect.setVisibility(8);
                } else {
                    DialogGameDfuBinding dialogGameDfuBinding3 = this.E0;
                    gm.l.c(dialogGameDfuBinding3);
                    dialogGameDfuBinding3.layoutSelect.setVisibility(0);
                    DialogGameDfuBinding dialogGameDfuBinding4 = this.E0;
                    gm.l.c(dialogGameDfuBinding4);
                    RecyclerView recyclerView = dialogGameDfuBinding4.recyclerView;
                    i0();
                    recyclerView.setLayoutManager(new LinearLayoutManager(0));
                    DialogGameDfuBinding dialogGameDfuBinding5 = this.E0;
                    gm.l.c(dialogGameDfuBinding5);
                    dialogGameDfuBinding5.recyclerView.setHasFixedSize(true);
                    DialogGameDfuBinding dialogGameDfuBinding6 = this.E0;
                    gm.l.c(dialogGameDfuBinding6);
                    dialogGameDfuBinding6.recyclerView.setNestedScrollingEnabled(false);
                    DialogGameDfuBinding dialogGameDfuBinding7 = this.E0;
                    gm.l.c(dialogGameDfuBinding7);
                    dialogGameDfuBinding7.recyclerView.setAdapter(this.D0);
                }
                i1();
                DialogGameDfuBinding dialogGameDfuBinding8 = this.E0;
                gm.l.c(dialogGameDfuBinding8);
                p.b.g(dialogGameDfuBinding8.stateView, new a());
                v vVar = this.Z;
                gm.l.e(vVar, "lifecycle");
                qi.h.k(vVar, new C0007b(null));
                v9.b bVar = new v9.b(V0(), 0);
                DialogGameDfuBinding dialogGameDfuBinding9 = this.E0;
                gm.l.c(dialogGameDfuBinding9);
                bVar.m(dialogGameDfuBinding9.getRoot());
                bVar.f838a.f817m = true;
                return bVar.a();
            }
            gm.l.l("skin");
            throw null;
        }
        gm.l.l("name");
        throw null;
    }

    public final void i1() {
        boolean z10;
        DialogGameDfuBinding dialogGameDfuBinding = this.E0;
        gm.l.c(dialogGameDfuBinding);
        PushStateView pushStateView = dialogGameDfuBinding.stateView;
        m mVar = this.D0;
        if (mVar != null && mVar.f576f != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        pushStateView.setEnabled(z10);
        DialogGameDfuBinding dialogGameDfuBinding2 = this.E0;
        gm.l.c(dialogGameDfuBinding2);
        PushStateView pushStateView2 = dialogGameDfuBinding2.stateView;
        Object[] objArr = new Object[1];
        GameSkin gameSkin = this.C0;
        if (gameSkin != null) {
            objArr[0] = n6.a0.f(gameSkin.getBinSize(), false);
            pushStateView2.setText(p0(R.string.ds_push_start, objArr));
            return;
        }
        gm.l.l("skin");
        throw null;
    }
}
