package com.topstep.fitcloud.pro.ui.device.song.push;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import ci.e0;
import ci.g0;
import ci.j0;
import ci.k0;
import ci.u;
import ci.v0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentSongPushBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import d7.a;
import gm.b0;
import gm.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import s.i0;
import s.m1;
import sm.g1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class SongPushFragment extends u implements v6.a {

    /* renamed from: w0 */
    public static final /* synthetic */ mm.h<Object>[] f11348w0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11349t0;

    /* renamed from: u0 */
    public final t0 f11350u0;

    /* renamed from: v0 */
    public e0 f11351v0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.p<String, Bundle, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(2);
            SongPushFragment.this = r1;
        }

        @Override // fm.p
        public final tl.l A(String str, Bundle bundle) {
            ArrayList parcelableArrayList;
            boolean z10;
            String str2 = str;
            Bundle bundle2 = bundle;
            gm.l.f(str2, "requestKey");
            gm.l.f(bundle2, WiseOpenHianalyticsData.UNION_RESULT);
            if (gm.l.a(str2, "key_select_audios")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayList = bundle2.getParcelableArrayList("audios", ci.a.class);
                } else {
                    parcelableArrayList = bundle2.getParcelableArrayList("audios");
                }
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    SongPushFragment.this.k1().l(parcelableArrayList);
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$11", f = "SongPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<u6.a<? extends tl.l>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11354e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            SongPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends tl.l> aVar, xl.d<? super tl.l> dVar) {
            return ((c) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11354e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SongPushFragment songPushFragment = SongPushFragment.this;
            mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
            qi.p.a((u6.a) this.f11354e, songPushFragment.e1());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$13", f = "SongPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            SongPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((e) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SongPushFragment songPushFragment = SongPushFragment.this;
            mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
            d7.e.d(songPushFragment.f1(), R.string.ds_song_delete_fail, null, 0, 30);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends androidx.activity.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(true);
            SongPushFragment.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            SongPushFragment songPushFragment = SongPushFragment.this;
            mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
            songPushFragment.i1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements mh.b<xc.a> {
        public g() {
            SongPushFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            gm.l.f((xc.a) obj, "item");
        }

        @Override // mh.b
        public final void b(int i10, xc.a aVar) {
            gm.l.f(aVar, "item");
            SongPushFragment songPushFragment = SongPushFragment.this;
            mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
            if (songPushFragment.k1().m()) {
                d7.e.f(SongPushFragment.this.f1(), R.string.ds_song_transfer_title);
                return;
            }
            ci.j jVar = new ci.j();
            Bundle bundle = new Bundle();
            bundle.putInt("position", i10);
            jVar.Z0(bundle);
            jVar.h1(SongPushFragment.this.h0(), null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.l<FloatingActionButton, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(1);
            SongPushFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(FloatingActionButton floatingActionButton) {
            gm.l.f(floatingActionButton, "it");
            SongPushFragment songPushFragment = SongPushFragment.this;
            mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
            if (songPushFragment.k1().m()) {
                d7.e.f(SongPushFragment.this.f1(), R.string.ds_song_transfer_title);
            } else {
                si.f fVar = si.f.f27071a;
                SongPushFragment songPushFragment2 = SongPushFragment.this;
                jc.f fVar2 = new jc.f(8, songPushFragment2);
                gm.l.f(songPushFragment2, "fragment");
                if (Build.VERSION.SDK_INT < 23) {
                    fVar2.b(true);
                } else {
                    Context V0 = songPushFragment2.V0();
                    ArrayList f10 = h7.a.f("android.permission.READ_EXTERNAL_STORAGE");
                    String string = V0.getString(R.string.permission_storage_for_read_audio);
                    gm.l.e(string, "context.getString(R.stri…n_storage_for_read_audio)");
                    si.f.h(fVar, songPushFragment2, f10, h7.a.f(new si.c("android.permission-group.STORAGE", string, null)), fVar2);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i() {
            super(1);
            SongPushFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            new ci.g().h1(SongPushFragment.this.h0(), null);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$7", f = "SongPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11362e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$7$1", f = "SongPushFragment.kt", l = {132}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11364e;

            /* renamed from: f */
            public final /* synthetic */ SongPushFragment f11365f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$j$a$a */
            /* loaded from: classes2.dex */
            public static final class C0192a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SongPushFragment f11366a;

                public C0192a(SongPushFragment songPushFragment) {
                    this.f11366a = songPushFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int intValue = ((Number) obj).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue == 2) {
                                SongPushFragment songPushFragment = this.f11366a;
                                mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                                songPushFragment.j1().layoutInfo.setVisibility(8);
                                this.f11366a.j1().layoutTransfer.setVisibility(8);
                                this.f11366a.j1().layoutEmpty.setVisibility(8);
                                this.f11366a.j1().loadingView.c();
                            }
                            return tl.l.f28297a;
                        }
                        SongPushFragment songPushFragment2 = this.f11366a;
                        mm.h<Object>[] hVarArr2 = SongPushFragment.f11348w0;
                        songPushFragment2.j1().layoutInfo.setVisibility(8);
                        this.f11366a.j1().layoutTransfer.setVisibility(8);
                        this.f11366a.j1().layoutEmpty.setVisibility(8);
                        this.f11366a.j1().loadingView.a(R.string.tip_load_error);
                    } else {
                        SongPushFragment songPushFragment3 = this.f11366a;
                        mm.h<Object>[] hVarArr3 = SongPushFragment.f11348w0;
                        songPushFragment3.j1().layoutInfo.setVisibility(8);
                        this.f11366a.j1().layoutTransfer.setVisibility(8);
                        this.f11366a.j1().layoutEmpty.setVisibility(8);
                        this.f11366a.j1().loadingView.b(R.string.ds_song_no_device);
                    }
                    this.f11366a.j1().fabAdd.h();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SongPushFragment songPushFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11365f = songPushFragment;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11365f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11364e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    SongPushFragment songPushFragment = this.f11365f;
                    mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                    g1 g1Var = songPushFragment.k1().f11391s;
                    C0192a c0192a = new C0192a(this.f11365f);
                    this.f11364e = 1;
                    if (g1Var.a(c0192a, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$7$2", f = "SongPushFragment.kt", l = {162}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11367e;

            /* renamed from: f */
            public final /* synthetic */ SongPushFragment f11368f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SongPushFragment f11369a;

                public a(SongPushFragment songPushFragment) {
                    this.f11369a = songPushFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    g0 g0Var = (g0) obj;
                    if (g0Var instanceof g0.a) {
                        SongPushFragment songPushFragment = this.f11369a;
                        mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                        d7.e.e(songPushFragment.f1(), (String) ((g0.a) g0Var).f4767a.f15868c);
                    } else if (g0Var instanceof g0.b) {
                        g0.b bVar = (g0.b) g0Var;
                        String p02 = this.f11369a.p0(R.string.ds_song_transfer_result, new Integer(bVar.f4768a), new Integer(bVar.f4769b));
                        gm.l.e(p02, "getString(R.string.ds_so…ult, it.success, it.fail)");
                        d7.e f12 = this.f11369a.f1();
                        a.b bVar2 = d7.a.f12825a;
                        f12.getClass();
                        gm.l.f(bVar2, "autoCancel");
                        d7.d b10 = f12.b();
                        b10.i1(1, p02, false, false, bVar2, 0);
                        b10.h1(f12.f12860b, f12.f12861c);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SongPushFragment songPushFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f11368f = songPushFragment;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f11368f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11367e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    SongPushFragment songPushFragment = this.f11368f;
                    mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                    sm.c cVar = songPushFragment.k1().f11389q;
                    a aVar2 = new a(this.f11368f);
                    this.f11367e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$7$3", f = "SongPushFragment.kt", l = {176}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11370e;

            /* renamed from: f */
            public final /* synthetic */ SongPushFragment f11371f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SongPushFragment f11372a;

                public a(SongPushFragment songPushFragment) {
                    this.f11372a = songPushFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    v0 v0Var = (v0) obj;
                    List<ci.a> list = v0Var.f4849a;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        SongPushFragment songPushFragment = this.f11372a;
                        mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                        songPushFragment.j1().layoutTransfer.setVisibility(8);
                    } else {
                        SongPushFragment songPushFragment2 = this.f11372a;
                        mm.h<Object>[] hVarArr2 = SongPushFragment.f11348w0;
                        songPushFragment2.j1().layoutTransfer.setVisibility(0);
                        this.f11372a.j1().tvTransferName.setText(v0Var.f4849a.get(v0Var.f4850b).f4707c);
                        TextView textView = this.f11372a.j1().tvTransferIndex;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(v0Var.f4850b + 1);
                        sb2.append('/');
                        sb2.append(v0Var.f4849a.size());
                        textView.setText(sb2.toString());
                        this.f11372a.j1().transferProgress.setProgress(v0Var.f4851c);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SongPushFragment songPushFragment, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f11371f = songPushFragment;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f11371f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11370e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    SongPushFragment songPushFragment = this.f11371f;
                    mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                    sm.t0 t0Var = songPushFragment.k1().f11393u;
                    a aVar2 = new a(this.f11371f);
                    this.f11370e = 1;
                    if (t0Var.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(xl.d<? super j> dVar) {
            super(2, dVar);
            SongPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((j) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            j jVar = new j(dVar);
            jVar.f11362e = obj;
            return jVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            pm.e0 e0Var = (pm.e0) this.f11362e;
            z0.g(e0Var, null, 0, new a(SongPushFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(SongPushFragment.this, null), 3);
            z0.g(e0Var, null, 0, new c(SongPushFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$9", f = "SongPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends zl.i implements fm.p<u6.a<? extends j0>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11374e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(xl.d<? super l> dVar) {
            super(2, dVar);
            SongPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends j0> aVar, xl.d<? super tl.l> dVar) {
            return ((l) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            l lVar = new l(dVar);
            lVar.f11374e = obj;
            return lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment.l.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(r rVar) {
            super(0);
            this.f11376b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11376b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11377b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f11377b = mVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11377b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11378b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(tl.d dVar) {
            super(0);
            this.f11378b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11378b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(tl.d dVar) {
            super(0);
            this.f11379b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11379b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11380b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11381c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(r rVar, tl.d dVar) {
            super(0);
            this.f11380b = rVar;
            this.f11381c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11381c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11380b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(SongPushFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSongPushBinding;", 0);
        b0.f15488a.getClass();
        f11348w0 = new mm.h[]{tVar};
    }

    public SongPushFragment() {
        super(R.layout.fragment_song_push);
        this.f11349t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSongPushBinding.class, this);
        tl.d a10 = fb.e.a(new n(new m(this)));
        this.f11350u0 = ab.b.f(this, b0.a(SongPushViewModel.class), new o(a10), new p(a10), new q(this, a10));
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f11351v0 = new e0();
        m0().a0(this, new m1(3, new a()));
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        e0 e0Var = this.f11351v0;
        if (e0Var != null) {
            e0Var.f4754e = null;
        } else {
            gm.l.l("adapter");
            throw null;
        }
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        j1().toolbar.setNavigationOnClickListener(new th.l(4, this));
        T0().f705h.a(q0(), new f());
        RecyclerView recyclerView = j1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        j1().recyclerView.g(new oi.a(V0()));
        RecyclerView recyclerView2 = j1().recyclerView;
        e0 e0Var = this.f11351v0;
        if (e0Var != null) {
            recyclerView2.setAdapter(e0Var);
            e0 e0Var2 = this.f11351v0;
            if (e0Var2 != null) {
                e0Var2.f4754e = new g();
                j1().loadingView.setListener(new i0(11, this));
                p.b.g(j1().fabAdd, new h());
                p.b.g(j1().btnCancel, new i());
                v vVar = this.Z;
                gm.l.e(vVar, "lifecycle");
                qi.h.k(vVar, new j(null));
                e(k1(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment.k
                    @Override // gm.t, mm.f
                    public final Object get(Object obj) {
                        return ((k0) obj).f4783a;
                    }
                }, z.f28636a, new l(null));
                e(k1(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment.b
                    @Override // gm.t, mm.f
                    public final Object get(Object obj) {
                        return ((k0) obj).f4784b;
                    }
                }, z.f28636a, new c(null));
                n(k1(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment.d
                    @Override // gm.t, mm.f
                    public final Object get(Object obj) {
                        return ((k0) obj).f4784b;
                    }
                }, v6.b.i(k1()), new e(null), null);
                return;
            }
            gm.l.l("adapter");
            throw null;
        }
        gm.l.l("adapter");
        throw null;
    }

    @Override // v6.a
    public final androidx.lifecycle.u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final void i1() {
        if (k1().m()) {
            new ci.g().h1(h0(), null);
        } else {
            tb.a.f(this).p();
        }
    }

    public final FragmentSongPushBinding j1() {
        return (FragmentSongPushBinding) this.f11349t0.a(this, f11348w0[0]);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    public final SongPushViewModel k1() {
        return (SongPushViewModel) this.f11350u0.getValue();
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
