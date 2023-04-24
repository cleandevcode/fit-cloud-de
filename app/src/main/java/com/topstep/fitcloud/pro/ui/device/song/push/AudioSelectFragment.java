package com.topstep.fitcloud.pro.ui.device.song.push;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import ci.b;
import ci.o;
import ci.r;
import com.google.android.material.tabs.TabLayout;
import com.topstep.fitcloud.pro.databinding.FragmentAudioSelectBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import d6.q0;
import fm.p;
import gm.b0;
import gm.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.z1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class AudioSelectFragment extends r implements v6.a {
    public static final /* synthetic */ mm.h<Object>[] C0;
    public ColorStateList A0;
    public int B0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11323t0;

    /* renamed from: u0 */
    public final t0 f11324u0;

    /* renamed from: v0 */
    public final i2.g f11325v0;

    /* renamed from: w0 */
    public int f11326w0;

    /* renamed from: x0 */
    public int f11327x0;

    /* renamed from: y0 */
    public ci.b f11328y0;

    /* renamed from: z0 */
    public ci.o f11329z0;

    /* loaded from: classes2.dex */
    public static final class a extends androidx.activity.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(true);
            AudioSelectFragment.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            AudioSelectFragment audioSelectFragment = AudioSelectFragment.this;
            mm.h<Object>[] hVarArr = AudioSelectFragment.C0;
            if (audioSelectFragment.f11326w0 == 1 && audioSelectFragment.f11327x0 != -1) {
                audioSelectFragment.f11327x0 = -1;
                audioSelectFragment.j1();
                return;
            }
            tb.a.f(audioSelectFragment).p();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements TabLayout.d {
        public b() {
            AudioSelectFragment.this = r1;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            gm.l.f(gVar, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.g gVar) {
            gm.l.f(gVar, "tab");
            AudioSelectFragment audioSelectFragment = AudioSelectFragment.this;
            audioSelectFragment.f11326w0 = gVar.f6736d;
            audioSelectFragment.j1();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(TabLayout.g gVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements b.InterfaceC0075b {
        public c() {
            AudioSelectFragment.this = r1;
        }

        @Override // ci.b.InterfaceC0075b
        public final void a() {
            AudioSelectFragment.h1(AudioSelectFragment.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements o.b {
        public d() {
            AudioSelectFragment.this = r1;
        }

        @Override // ci.o.b
        public final void a(int i10) {
            AudioSelectFragment audioSelectFragment = AudioSelectFragment.this;
            audioSelectFragment.f11327x0 = i10;
            audioSelectFragment.j1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.l<LinearLayout, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            AudioSelectFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(LinearLayout linearLayout) {
            long j10;
            gm.l.f(linearLayout, "it");
            ci.b bVar = AudioSelectFragment.this.f11328y0;
            if (bVar != null) {
                List<ci.a> list = bVar.f4717d;
                if (list != null) {
                    for (ci.a aVar : list) {
                        if (bVar.f4721h) {
                            if (bVar.f4718e.remove(aVar)) {
                                j10 = bVar.f4719f - aVar.f4710f;
                                bVar.f4719f = j10;
                            }
                        } else if (bVar.f4718e.add(aVar)) {
                            j10 = bVar.f4719f + aVar.f4710f;
                            bVar.f4719f = j10;
                        }
                    }
                    bVar.y(list);
                }
                AudioSelectFragment.this.j1();
                return tl.l.f28297a;
            }
            gm.l.l("audioInfoAdapter");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(1);
            AudioSelectFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            ci.b bVar = AudioSelectFragment.this.f11328y0;
            if (bVar != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bVar.f4718e);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("audios", arrayList);
                tb.a.q(bundle, AudioSelectFragment.this, "key_select_audios");
                tb.a.f(AudioSelectFragment.this).p();
                return tl.l.f28297a;
            }
            gm.l.l("audioInfoAdapter");
            throw null;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.AudioSelectFragment$onViewCreated$9", f = "AudioSelectFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements p<u6.a<? extends ci.f>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11337e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(2, dVar);
            AudioSelectFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends ci.f> aVar, xl.d<? super tl.l> dVar) {
            return ((h) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f11337e = obj;
            return hVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            u6.a aVar = (u6.a) this.f11337e;
            if (aVar instanceof u6.l) {
                AudioSelectFragment audioSelectFragment = AudioSelectFragment.this;
                mm.h<Object>[] hVarArr = AudioSelectFragment.C0;
                audioSelectFragment.i1().toolbar.setTitle((CharSequence) null);
                AudioSelectFragment.this.i1().tabLayout.setVisibility(8);
                AudioSelectFragment.this.i1().loadingView.c();
            } else if (aVar instanceof u6.g) {
                AudioSelectFragment audioSelectFragment2 = AudioSelectFragment.this;
                mm.h<Object>[] hVarArr2 = AudioSelectFragment.C0;
                audioSelectFragment2.i1().loadingView.a(R.string.tip_load_error);
            } else if (aVar instanceof u6.a0) {
                AudioSelectFragment audioSelectFragment3 = AudioSelectFragment.this;
                mm.h<Object>[] hVarArr3 = AudioSelectFragment.C0;
                audioSelectFragment3.j1();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.r rVar) {
            super(0);
            this.f11339b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11339b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f11339b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<androidx.fragment.app.r> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(androidx.fragment.app.r rVar) {
            super(0);
            this.f11340b = rVar;
        }

        @Override // fm.a
        public final androidx.fragment.app.r m() {
            return this.f11340b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f11341b = jVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11341b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(tl.d dVar) {
            super(0);
            this.f11342b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11342b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(tl.d dVar) {
            super(0);
            this.f11343b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11343b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11344b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f11344b = rVar;
            this.f11345c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11345c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11344b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.AudioSelectFragment$updateUI$1", f = "AudioSelectFragment.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f11346e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(xl.d<? super o> dVar) {
            super(2, dVar);
            AudioSelectFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((o) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new o(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            ci.b bVar;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11346e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                AudioSelectFragment audioSelectFragment = AudioSelectFragment.this;
                mm.h<Object>[] hVarArr = AudioSelectFragment.C0;
                this.f11346e = 1;
                obj = ((SongSelectViewModel) audioSelectFragment.f11324u0.getValue()).e(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            Object obj2 = ((ei.a) obj).f13683a;
            if (!(obj2 instanceof u6.a0)) {
                return tl.l.f28297a;
            }
            ci.f fVar = (ci.f) ((u6.a0) obj2).f28523c;
            if (fVar.f4756a.isEmpty()) {
                AudioSelectFragment audioSelectFragment2 = AudioSelectFragment.this;
                mm.h<Object>[] hVarArr2 = AudioSelectFragment.C0;
                audioSelectFragment2.i1().loadingView.b(R.string.tip_current_no_data);
                AudioSelectFragment.this.i1().toolbar.setTitle(R.string.ds_song_audio);
            } else {
                AudioSelectFragment audioSelectFragment3 = AudioSelectFragment.this;
                mm.h<Object>[] hVarArr3 = AudioSelectFragment.C0;
                audioSelectFragment3.i1().loadingView.setVisibility(8);
                AudioSelectFragment audioSelectFragment4 = AudioSelectFragment.this;
                if (audioSelectFragment4.f11326w0 == 0) {
                    audioSelectFragment4.i1().tabLayout.setVisibility(0);
                    AudioSelectFragment.this.i1().toolbar.setTitle((CharSequence) null);
                    ci.b bVar2 = AudioSelectFragment.this.f11328y0;
                    if (bVar2 != null) {
                        List<ci.a> list = fVar.f4756a;
                        bVar2.f4717d = list;
                        bVar2.y(list);
                        RecyclerView recyclerView = AudioSelectFragment.this.i1().recyclerView;
                        ci.b bVar3 = AudioSelectFragment.this.f11328y0;
                        if (bVar3 != null) {
                            recyclerView.setAdapter(bVar3);
                            bVar = AudioSelectFragment.this.f11328y0;
                            if (bVar == null) {
                                gm.l.l("audioInfoAdapter");
                                throw null;
                            }
                        } else {
                            gm.l.l("audioInfoAdapter");
                            throw null;
                        }
                    } else {
                        gm.l.l("audioInfoAdapter");
                        throw null;
                    }
                } else if (audioSelectFragment4.f11327x0 == -1) {
                    audioSelectFragment4.i1().tabLayout.setVisibility(0);
                    AudioSelectFragment.this.i1().toolbar.setTitle((CharSequence) null);
                    AudioSelectFragment audioSelectFragment5 = AudioSelectFragment.this;
                    ci.o oVar = audioSelectFragment5.f11329z0;
                    if (oVar != null) {
                        oVar.f4810d = fVar.f4757b;
                        RecyclerView recyclerView2 = audioSelectFragment5.i1().recyclerView;
                        ci.o oVar2 = AudioSelectFragment.this.f11329z0;
                        if (oVar2 != null) {
                            recyclerView2.setAdapter(oVar2);
                            ci.o oVar3 = AudioSelectFragment.this.f11329z0;
                            if (oVar3 != null) {
                                oVar3.h();
                                AudioSelectFragment.this.i1().layoutSelectAll.setEnabled(false);
                                AudioSelectFragment.h1(AudioSelectFragment.this);
                            } else {
                                gm.l.l("directoryInfoAdapter");
                                throw null;
                            }
                        } else {
                            gm.l.l("directoryInfoAdapter");
                            throw null;
                        }
                    } else {
                        gm.l.l("directoryInfoAdapter");
                        throw null;
                    }
                } else {
                    audioSelectFragment4.i1().tabLayout.setVisibility(8);
                    AudioSelectFragment.this.i1().toolbar.setTitle(fVar.f4757b.get(AudioSelectFragment.this.f11327x0).f4807a);
                    AudioSelectFragment audioSelectFragment6 = AudioSelectFragment.this;
                    ci.b bVar4 = audioSelectFragment6.f11328y0;
                    if (bVar4 != null) {
                        List<ci.a> list2 = fVar.f4757b.get(audioSelectFragment6.f11327x0).f4808b;
                        bVar4.f4717d = list2;
                        bVar4.y(list2);
                        RecyclerView recyclerView3 = AudioSelectFragment.this.i1().recyclerView;
                        ci.b bVar5 = AudioSelectFragment.this.f11328y0;
                        if (bVar5 != null) {
                            recyclerView3.setAdapter(bVar5);
                            bVar = AudioSelectFragment.this.f11328y0;
                            if (bVar == null) {
                                gm.l.l("audioInfoAdapter");
                                throw null;
                            }
                        } else {
                            gm.l.l("audioInfoAdapter");
                            throw null;
                        }
                    } else {
                        gm.l.l("audioInfoAdapter");
                        throw null;
                    }
                }
                bVar.h();
                AudioSelectFragment.this.i1().layoutSelectAll.setEnabled(true);
                AudioSelectFragment.h1(AudioSelectFragment.this);
            }
            return tl.l.f28297a;
        }
    }

    static {
        t tVar = new t(AudioSelectFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAudioSelectBinding;", 0);
        b0.f15488a.getClass();
        C0 = new mm.h[]{tVar};
    }

    public AudioSelectFragment() {
        super(R.layout.fragment_audio_select);
        this.f11323t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAudioSelectBinding.class, this);
        tl.d a10 = fb.e.a(new k(new j(this)));
        this.f11324u0 = ab.b.f(this, b0.a(SongSelectViewModel.class), new l(a10), new m(a10), new n(this, a10));
        this.f11325v0 = new i2.g(b0.a(ci.d.class), new i(this));
        this.f11327x0 = -1;
    }

    public static final void h1(AudioSelectFragment audioSelectFragment) {
        ImageView imageView;
        int i10;
        TextView textView = audioSelectFragment.i1().tvSelectCount;
        Object[] objArr = new Object[2];
        ci.b bVar = audioSelectFragment.f11328y0;
        if (bVar != null) {
            objArr[0] = Integer.valueOf(bVar.f4718e.size());
            ci.b bVar2 = audioSelectFragment.f11328y0;
            if (bVar2 != null) {
                objArr[1] = n6.a0.f(bVar2.f4719f, true);
                textView.setText(audioSelectFragment.p0(R.string.ds_song_select_count, objArr));
                if (audioSelectFragment.i1().layoutSelectAll.isEnabled()) {
                    ci.b bVar3 = audioSelectFragment.f11328y0;
                    if (bVar3 != null) {
                        if (bVar3.f4721h) {
                            imageView = audioSelectFragment.i1().imgSelectAll;
                            i10 = R.drawable.ic_baseline_check_circle_24;
                        } else {
                            imageView = audioSelectFragment.i1().imgSelectAll;
                            i10 = R.drawable.ic_baseline_radio_button_unchecked_24;
                        }
                        imageView.setImageResource(i10);
                    } else {
                        gm.l.l("audioInfoAdapter");
                        throw null;
                    }
                }
                ci.b bVar4 = audioSelectFragment.f11328y0;
                if (bVar4 != null) {
                    int i11 = (bVar4.f4719f > (((ci.d) audioSelectFragment.f11325v0.getValue()).f4749b * 1024) ? 1 : (bVar4.f4719f == (((ci.d) audioSelectFragment.f11325v0.getValue()).f4749b * 1024) ? 0 : -1));
                    Button button = audioSelectFragment.i1().btnSure;
                    if (i11 > 0) {
                        button.setEnabled(false);
                        audioSelectFragment.i1().tvSelectCount.setTextColor(audioSelectFragment.B0);
                        return;
                    }
                    button.setEnabled(true);
                    TextView textView2 = audioSelectFragment.i1().tvSelectCount;
                    ColorStateList colorStateList = audioSelectFragment.A0;
                    if (colorStateList != null) {
                        textView2.setTextColor(colorStateList);
                        return;
                    } else {
                        gm.l.l("selectCountEnabledColor");
                        throw null;
                    }
                }
                gm.l.l("audioInfoAdapter");
                throw null;
            }
            gm.l.l("audioInfoAdapter");
            throw null;
        }
        gm.l.l("audioInfoAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f11328y0 = new ci.b();
        this.f11329z0 = new ci.o();
        TypedArray obtainStyledAttributes = V0().getTheme().obtainStyledAttributes(new int[]{16842808});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
            gm.l.e(colorStateList, "valueOf(Color.BLACK)");
        }
        this.A0 = colorStateList;
        TypedArray obtainStyledAttributes2 = V0().getTheme().obtainStyledAttributes(new int[]{R.attr.colorError});
        gm.l.e(obtainStyledAttributes2, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        this.B0 = color;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        ci.b bVar = this.f11328y0;
        if (bVar != null) {
            bVar.f4720g = null;
            ci.o oVar = this.f11329z0;
            if (oVar != null) {
                oVar.f4811e = null;
                return;
            } else {
                gm.l.l("directoryInfoAdapter");
                throw null;
            }
        }
        gm.l.l("audioInfoAdapter");
        throw null;
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        i1().toolbar.setNavigationOnClickListener(new q0(4, this));
        T0().f705h.a(q0(), new a());
        i1().tabLayout.a(new b());
        i1().tabLayout.l(i1().tabLayout.h(0), true);
        RecyclerView recyclerView = i1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        i1().recyclerView.g(new oi.a(V0()));
        ci.b bVar = this.f11328y0;
        if (bVar != null) {
            bVar.f4720g = new c();
            ci.o oVar = this.f11329z0;
            if (oVar != null) {
                oVar.f4811e = new d();
                p.b.g(i1().layoutSelectAll, new e());
                p.b.g(i1().btnSure, new f());
                e((SongSelectViewModel) this.f11324u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.song.push.AudioSelectFragment.g
                    @Override // gm.t, mm.f
                    public final Object get(Object obj) {
                        return ((ei.a) obj).f13683a;
                    }
                }, z.f28636a, new h(null));
                return;
            }
            gm.l.l("directoryInfoAdapter");
            throw null;
        }
        gm.l.l("audioInfoAdapter");
        throw null;
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentAudioSelectBinding i1() {
        return (FragmentAudioSelectBinding) this.f11323t0.a(this, C0[0]);
    }

    public final void j1() {
        z0.g(rm.l.g(this), null, 0, new o(null), 3);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
