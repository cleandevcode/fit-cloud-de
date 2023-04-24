package com.topstep.fitcloud.pro.ui.sport;

import a5.k;
import a5.m;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.k0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.databinding.ActivitySportDetailBinding;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.l;
import gm.o;
import gm.t;
import java.util.ArrayList;
import java.util.List;
import k1.l2;
import kotlin.Metadata;
import mf.a0;
import mi.n;
import pm.e0;
import pm.z1;
import qi.p;
import s.n2;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class SportDetailActivity extends mi.g implements v6.a {
    public static final a B;
    public static final /* synthetic */ mm.h<Object>[] C;

    /* renamed from: y */
    public ActivitySportDetailBinding f12116y;

    /* renamed from: x */
    public final im.a f12115x = new im.a();

    /* renamed from: z */
    public final t0 f12117z = new t0(b0.a(SportDetailViewModel.class), new h(this), new g(this), new i(this));
    public final tl.d A = p.e(this);

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context, String str, boolean z10) {
            l.f(context, "context");
            Intent intent = new Intent(context, SportDetailActivity.class);
            intent.putExtra("sport_type", str);
            intent.putExtra("from_main", z10);
            context.startActivity(intent);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportDetailActivity$onCreate$2$1", f = "SportDetailActivity.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12118e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            SportDetailActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x00a2, code lost:
            if (r2 == false) goto L51;
         */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.sport.SportDetailActivity.b.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportDetailActivity$onCreate$4", f = "SportDetailActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f12121e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            SportDetailActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f12121e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            p.f((d7.e) SportDetailActivity.this.A.getValue(), (Throwable) this.f12121e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportDetailActivity$onCreate$5", f = "SportDetailActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<ei.a<SportRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f12123e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            SportDetailActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<SportRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((e) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f12123e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Integer valueOf;
            a0.k(obj);
            u6.a<T> aVar = ((ei.a) this.f12123e).f13683a;
            if (aVar instanceof u6.l) {
                ActivitySportDetailBinding activitySportDetailBinding = SportDetailActivity.this.f12116y;
                if (activitySportDetailBinding != null) {
                    activitySportDetailBinding.layoutContent.setVisibility(8);
                    ActivitySportDetailBinding activitySportDetailBinding2 = SportDetailActivity.this.f12116y;
                    if (activitySportDetailBinding2 != null) {
                        activitySportDetailBinding2.loadingView.c();
                    } else {
                        l.l("viewBind");
                        throw null;
                    }
                } else {
                    l.l("viewBind");
                    throw null;
                }
            } else if (aVar instanceof u6.a0) {
                SportRecord sportRecord = (SportRecord) aVar.a();
                if (sportRecord == null) {
                    ActivitySportDetailBinding activitySportDetailBinding3 = SportDetailActivity.this.f12116y;
                    if (activitySportDetailBinding3 != null) {
                        activitySportDetailBinding3.layoutContent.setVisibility(8);
                        ActivitySportDetailBinding activitySportDetailBinding4 = SportDetailActivity.this.f12116y;
                        if (activitySportDetailBinding4 != null) {
                            activitySportDetailBinding4.loadingView.b(R.string.tip_current_no_data);
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    } else {
                        l.l("viewBind");
                        throw null;
                    }
                } else {
                    ActivitySportDetailBinding activitySportDetailBinding5 = SportDetailActivity.this.f12116y;
                    if (activitySportDetailBinding5 != null) {
                        boolean z10 = false;
                        activitySportDetailBinding5.layoutContent.setVisibility(0);
                        ActivitySportDetailBinding activitySportDetailBinding6 = SportDetailActivity.this.f12116y;
                        if (activitySportDetailBinding6 != null) {
                            activitySportDetailBinding6.loadingView.setVisibility(8);
                            SportDetailActivity sportDetailActivity = SportDetailActivity.this;
                            sportDetailActivity.getClass();
                            ArrayList arrayList = new ArrayList(4);
                            int i10 = sportRecord.f9635i;
                            if (i10 != 7 && i10 != 15) {
                                valueOf = Integer.valueOf((int) R.string.sport_detail);
                            } else {
                                arrayList.add(Integer.valueOf((int) R.string.sport_track));
                                arrayList.add(Integer.valueOf((int) R.string.sport_detail));
                                valueOf = Integer.valueOf((int) R.string.sport_pace);
                            }
                            arrayList.add(valueOf);
                            List<SportHeartRate> list = sportRecord.f9637k;
                            if (!((list == null || list.isEmpty()) ? true : true)) {
                                arrayList.add(Integer.valueOf((int) R.string.sport_chart));
                            }
                            ActivitySportDetailBinding activitySportDetailBinding7 = sportDetailActivity.f12116y;
                            if (activitySportDetailBinding7 != null) {
                                ViewPager2 viewPager2 = activitySportDetailBinding7.viewPager;
                                k0 J = sportDetailActivity.J();
                                l.e(J, "supportFragmentManager");
                                v vVar = sportDetailActivity.f701d;
                                l.e(vVar, "lifecycle");
                                viewPager2.setAdapter(new ni.g(J, vVar, arrayList));
                                ActivitySportDetailBinding activitySportDetailBinding8 = sportDetailActivity.f12116y;
                                if (activitySportDetailBinding8 != null) {
                                    new com.google.android.material.tabs.e(activitySportDetailBinding8.tabLayout, activitySportDetailBinding8.viewPager, new n(sportDetailActivity, arrayList)).a();
                                    if (arrayList.size() == 1) {
                                        ActivitySportDetailBinding activitySportDetailBinding9 = sportDetailActivity.f12116y;
                                        if (activitySportDetailBinding9 != null) {
                                            activitySportDetailBinding9.tabLayout.setVisibility(8);
                                        } else {
                                            l.l("viewBind");
                                            throw null;
                                        }
                                    }
                                } else {
                                    l.l("viewBind");
                                    throw null;
                                }
                            } else {
                                l.l("viewBind");
                                throw null;
                            }
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    } else {
                        l.l("viewBind");
                        throw null;
                    }
                }
            } else if (aVar instanceof u6.g) {
                ActivitySportDetailBinding activitySportDetailBinding10 = SportDetailActivity.this.f12116y;
                if (activitySportDetailBinding10 != null) {
                    activitySportDetailBinding10.layoutContent.setVisibility(8);
                    ActivitySportDetailBinding activitySportDetailBinding11 = SportDetailActivity.this.f12116y;
                    if (activitySportDetailBinding11 != null) {
                        activitySportDetailBinding11.loadingView.a(R.string.tip_load_error);
                    } else {
                        l.l("viewBind");
                        throw null;
                    }
                } else {
                    l.l("viewBind");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportDetailActivity$onCreate$7", f = "SportDetailActivity.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12125e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ SportDetailActivity f12127a;

            public a(SportDetailActivity sportDetailActivity) {
                this.f12127a = sportDetailActivity;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                uf.d dVar2 = (uf.d) obj;
                ActivitySportDetailBinding activitySportDetailBinding = this.f12127a.f12116y;
                if (activitySportDetailBinding != null) {
                    activitySportDetailBinding.tvNickName.setText(dVar2.f28715a);
                    SportDetailActivity sportDetailActivity = this.f12127a;
                    String str = dVar2.f28717c;
                    ActivitySportDetailBinding activitySportDetailBinding2 = sportDetailActivity.f12116y;
                    if (activitySportDetailBinding2 != null) {
                        ImageView imageView = activitySportDetailBinding2.imgAvatar;
                        l.e(imageView, "viewBind.imgAvatar");
                        com.bumptech.glide.n<Drawable> x10 = com.bumptech.glide.b.c(sportDetailActivity).b(sportDetailActivity).k(str).x(i5.g.w(R.drawable.ic_user_avatar));
                        x10.getClass();
                        ((com.bumptech.glide.n) x10.r(m.f293b, new k())).A(imageView);
                        return tl.l.f28297a;
                    }
                    l.l("viewBind");
                    throw null;
                }
                l.l("viewBind");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            SportDetailActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12125e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                SportDetailActivity sportDetailActivity = SportDetailActivity.this;
                a aVar2 = SportDetailActivity.B;
                sm.f<uf.d> fVar = sportDetailActivity.N().f12133l;
                a aVar3 = new a(SportDetailActivity.this);
                this.f12125e = 1;
                if (fVar.a(aVar3, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f12128b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f12128b = componentActivity;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f12128b.r();
            l.e(r10, "defaultViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f12129b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f12129b = componentActivity;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f12129b.z();
            l.e(z10, "viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f12130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f12130b = componentActivity;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f12130b.s();
        }
    }

    static {
        o oVar = new o(SportDetailActivity.class, "fromMain", "getFromMain()Z");
        b0.f15488a.getClass();
        C = new mm.h[]{oVar};
        B = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    public final void M() {
        if (((Boolean) this.f12115x.a(this, C[0])).booleanValue()) {
            finish();
        } else {
            qi.h.l(this);
        }
    }

    public final SportDetailViewModel N() {
        return (SportDetailViewModel) this.f12117z.getValue();
    }

    public final void O(Bitmap bitmap) {
        ActivitySportDetailBinding activitySportDetailBinding = this.f12116y;
        if (activitySportDetailBinding != null) {
            int width = activitySportDetailBinding.viewPager.getWidth();
            ActivitySportDetailBinding activitySportDetailBinding2 = this.f12116y;
            if (activitySportDetailBinding2 != null) {
                int height = activitySportDetailBinding2.viewPager.getHeight();
                ActivitySportDetailBinding activitySportDetailBinding3 = this.f12116y;
                if (activitySportDetailBinding3 != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(width, activitySportDetailBinding3.layoutUser.getHeight() + height, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    ActivitySportDetailBinding activitySportDetailBinding4 = this.f12116y;
                    if (activitySportDetailBinding4 != null) {
                        activitySportDetailBinding4.layoutUser.draw(canvas);
                        ActivitySportDetailBinding activitySportDetailBinding5 = this.f12116y;
                        if (activitySportDetailBinding5 != null) {
                            canvas.translate(0.0f, activitySportDetailBinding5.layoutUser.getHeight());
                            ActivitySportDetailBinding activitySportDetailBinding6 = this.f12116y;
                            if (activitySportDetailBinding6 != null) {
                                activitySportDetailBinding6.viewPager.setDrawingCacheEnabled(true);
                                ActivitySportDetailBinding activitySportDetailBinding7 = this.f12116y;
                                if (activitySportDetailBinding7 != null) {
                                    activitySportDetailBinding7.viewPager.buildDrawingCache();
                                    ActivitySportDetailBinding activitySportDetailBinding8 = this.f12116y;
                                    if (activitySportDetailBinding8 != null) {
                                        Bitmap drawingCache = activitySportDetailBinding8.viewPager.getDrawingCache();
                                        l.e(drawingCache, "viewBind.viewPager.drawingCache");
                                        Bitmap createBitmap2 = Bitmap.createBitmap(drawingCache, 0, 0, drawingCache.getWidth(), drawingCache.getHeight());
                                        ActivitySportDetailBinding activitySportDetailBinding9 = this.f12116y;
                                        if (activitySportDetailBinding9 != null) {
                                            activitySportDetailBinding9.viewPager.destroyDrawingCache();
                                            l.e(createBitmap2, "bm");
                                            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
                                            createBitmap2.recycle();
                                            if (bitmap != null) {
                                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                                bitmap.recycle();
                                            }
                                            l.e(createBitmap, "bitmap");
                                            pm.k.c(this, createBitmap);
                                            return;
                                        }
                                        l.l("viewBind");
                                        throw null;
                                    }
                                    l.l("viewBind");
                                    throw null;
                                }
                                l.l("viewBind");
                                throw null;
                            }
                            l.l("viewBind");
                            throw null;
                        }
                        l.l("viewBind");
                        throw null;
                    }
                    l.l("viewBind");
                    throw null;
                }
                l.l("viewBind");
                throw null;
            }
            l.l("viewBind");
            throw null;
        }
        l.l("viewBind");
        throw null;
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        M();
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.a(getWindow(), false);
        ActivitySportDetailBinding inflate = ActivitySportDetailBinding.inflate(getLayoutInflater());
        l.e(inflate, "inflate(layoutInflater)");
        this.f12116y = inflate;
        setContentView(inflate.getRoot());
        this.f12115x.b(C[0], Boolean.valueOf(getIntent().getBooleanExtra("from_main", false)));
        ActivitySportDetailBinding activitySportDetailBinding = this.f12116y;
        if (activitySportDetailBinding != null) {
            LinearLayout root = activitySportDetailBinding.getRoot();
            l.e(root, "viewBind.root");
            lh.b.a(root);
            ActivitySportDetailBinding activitySportDetailBinding2 = this.f12116y;
            if (activitySportDetailBinding2 != null) {
                MaterialToolbar materialToolbar = activitySportDetailBinding2.toolbar;
                l.e(materialToolbar, "viewBind.toolbar");
                lh.b.b(materialToolbar);
                ActivitySportDetailBinding activitySportDetailBinding3 = this.f12116y;
                if (activitySportDetailBinding3 != null) {
                    activitySportDetailBinding3.toolbar.setNavigationOnClickListener(new n6.e(6, this));
                    ActivitySportDetailBinding activitySportDetailBinding4 = this.f12116y;
                    if (activitySportDetailBinding4 != null) {
                        activitySportDetailBinding4.toolbar.setOnMenuItemClickListener(new s.i(14, this));
                        n(N(), new t() { // from class: com.topstep.fitcloud.pro.ui.sport.SportDetailActivity.c
                            @Override // gm.t, mm.f
                            public final Object get(Object obj) {
                                return ((ei.a) obj).f13683a;
                            }
                        }, v6.b.i(N()), new d(null), null);
                        G(N(), z.f28636a, new e(null));
                        ActivitySportDetailBinding activitySportDetailBinding5 = this.f12116y;
                        if (activitySportDetailBinding5 != null) {
                            activitySportDetailBinding5.loadingView.setListener(new n2(14, this));
                            v vVar = this.f701d;
                            l.e(vVar, "lifecycle");
                            qi.h.k(vVar, new f(null));
                            return;
                        }
                        l.l("viewBind");
                        throw null;
                    }
                    l.l("viewBind");
                    throw null;
                }
                l.l("viewBind");
                throw null;
            }
            l.l("viewBind");
            throw null;
        }
        l.l("viewBind");
        throw null;
    }
}
