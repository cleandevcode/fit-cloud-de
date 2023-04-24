package com.topstep.fitcloud.pro.ui.settings;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentFeedbackBinding;
import com.topstep.fitcloudpro.R;
import d2.a;
import d7.d;
import gm.b0;
import gm.m;
import gm.t;
import ii.d0;
import ii.y;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public final class FeedbackFragment extends d0<l> implements d.a {
    public static final /* synthetic */ mm.h<Object>[] H0;
    public final int B0;
    public final com.topstep.fitcloud.pro.utils.viewbinding.a C0;
    public final t0 D0;
    public final tl.i E0;
    public final tl.i F0;
    public final a G0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.l<View, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            FeedbackFragment.this = r1;
        }

        @Override // fm.l
        public final l k(View view) {
            FeedbackFragment feedbackFragment;
            int i10;
            View view2 = view;
            gm.l.f(view2, "view");
            FeedbackFragment feedbackFragment2 = FeedbackFragment.this;
            mm.h<Object>[] hVarArr = FeedbackFragment.H0;
            if (gm.l.a(view2, feedbackFragment2.v1().img00)) {
                feedbackFragment = FeedbackFragment.this;
                i10 = 0;
            } else if (gm.l.a(view2, FeedbackFragment.this.v1().img01)) {
                feedbackFragment = FeedbackFragment.this;
                i10 = 1;
            } else if (gm.l.a(view2, FeedbackFragment.this.v1().img02)) {
                feedbackFragment = FeedbackFragment.this;
                i10 = 2;
            } else if (gm.l.a(view2, FeedbackFragment.this.v1().img03)) {
                feedbackFragment = FeedbackFragment.this;
                i10 = 3;
            } else {
                if (gm.l.a(view2, FeedbackFragment.this.v1().btnCommit)) {
                    FeedbackViewModel feedbackViewModel = (FeedbackViewModel) FeedbackFragment.this.D0.getValue();
                    EditText editText = FeedbackFragment.this.v1().editContact;
                    gm.l.e(editText, "viewBind.editContact");
                    String h10 = qi.h.h(editText);
                    EditText editText2 = FeedbackFragment.this.v1().editContent;
                    gm.l.e(editText2, "viewBind.editContent");
                    String h11 = qi.h.h(editText2);
                    feedbackViewModel.getClass();
                    gm.l.f(h10, "contact");
                    feedbackViewModel.h(new y(feedbackViewModel, h10, h11, null), 0L);
                }
                return l.f28297a;
            }
            if (feedbackFragment.u1().size() > i10) {
                feedbackFragment.u1().remove(i10);
                feedbackFragment.w1();
            } else {
                feedbackFragment.m1(0);
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<ArrayList<Uri>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            FeedbackFragment.this = r1;
        }

        @Override // fm.a
        public final ArrayList<Uri> m() {
            return ((FeedbackViewModel) FeedbackFragment.this.D0.getValue()).f11857i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            FeedbackFragment.this = r1;
        }

        @Override // fm.a
        public final Boolean m() {
            return Boolean.valueOf(h7.a.n(FeedbackFragment.this.V0()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        public d() {
            FeedbackFragment.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            FeedbackFragment feedbackFragment = FeedbackFragment.this;
            mm.h<Object>[] hVarArr = FeedbackFragment.H0;
            feedbackFragment.y1();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        public e() {
            FeedbackFragment.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            FeedbackFragment feedbackFragment = FeedbackFragment.this;
            mm.h<Object>[] hVarArr = FeedbackFragment.H0;
            TextView textView = feedbackFragment.v1().tvContentLimitTips;
            FeedbackFragment feedbackFragment2 = FeedbackFragment.this;
            textView.setText(feedbackFragment2.p0(R.string.feedback_content_limit_tips, Integer.valueOf(feedbackFragment2.v1().editContent.length()), 500));
            FeedbackFragment.this.y1();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f11850b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11850b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f11851b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11851b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f11852b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11852b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11853b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f11853b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11853b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11854b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, tl.d dVar) {
            super(0);
            this.f11854b = rVar;
            this.f11855c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11855c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11854b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FeedbackFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFeedbackBinding;", 0);
        b0.f15488a.getClass();
        H0 = new mm.h[]{tVar};
    }

    public FeedbackFragment() {
        super(R.layout.fragment_feedback);
        this.B0 = 1;
        this.C0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFeedbackBinding.class, this);
        tl.d a10 = fb.e.a(new g(new f(this)));
        this.D0 = ab.b.f(this, b0.a(FeedbackViewModel.class), new h(a10), new i(a10), new j(this, a10));
        this.E0 = new tl.i(new c());
        this.F0 = new tl.i(new b());
        this.G0 = new a();
    }

    @Override // nh.b, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        EditText editText;
        int i10;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        if (((Boolean) this.E0.getValue()).booleanValue()) {
            editText = v1().editContact;
            i10 = R.string.feedback_contact_hint;
        } else {
            editText = v1().editContact;
            i10 = R.string.account_email;
        }
        editText.setHint(i10);
        v1().editContact.addTextChangedListener(new d());
        v1().editContent.addTextChangedListener(new e());
        w1();
        p.b.g(v1().img00, this.G0);
        p.b.g(v1().img01, this.G0);
        p.b.g(v1().img02, this.G0);
        p.b.g(v1().img03, this.G0);
        p.b.g(v1().btnCommit, this.G0);
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.B0) {
            tb.a.f(this).p();
        }
    }

    @Override // lh.h
    public final File k1() {
        return null;
    }

    @Override // lh.h
    public final lh.d l1() {
        return null;
    }

    @Override // lh.h
    public final File n1() {
        return en.f.b(V0());
    }

    @Override // lh.h
    public final void p1(Uri uri) {
        gm.l.f(uri, "uri");
        u1().add(uri);
        w1();
    }

    @Override // nh.b
    public final nh.e r1() {
        return (FeedbackViewModel) this.D0.getValue();
    }

    @Override // nh.b
    public final void s1(Object obj) {
        gm.l.f((l) obj, WiseOpenHianalyticsData.UNION_RESULT);
        d7.e.h(f1(), R.string.tip_commit_success, true, this.B0, 12);
    }

    public final ArrayList<Uri> u1() {
        return (ArrayList) this.F0.getValue();
    }

    public final FragmentFeedbackBinding v1() {
        return (FragmentFeedbackBinding) this.C0.a(this, H0[0]);
    }

    public final void w1() {
        ImageView imageView = v1().img00;
        gm.l.e(imageView, "viewBind.img00");
        x1(imageView, 0, u1().isEmpty() ^ true ? u1().get(0) : null);
        ImageView imageView2 = v1().img01;
        gm.l.e(imageView2, "viewBind.img01");
        x1(imageView2, u1().isEmpty() ^ true ? 0 : 8, u1().size() > 1 ? u1().get(1) : null);
        ImageView imageView3 = v1().img02;
        gm.l.e(imageView3, "viewBind.img02");
        x1(imageView3, u1().size() > 1 ? 0 : 8, u1().size() > 2 ? u1().get(2) : null);
        ImageView imageView4 = v1().img03;
        gm.l.e(imageView4, "viewBind.img03");
        x1(imageView4, u1().size() <= 2 ? 8 : 0, u1().size() > 3 ? u1().get(3) : null);
        TextView textView = v1().tvImgLimitTips;
        textView.setText(u1().size() + "/4");
        y1();
    }

    public final void x1(ImageView imageView, int i10, Uri uri) {
        imageView.setVisibility(i10);
        if (i10 == 0) {
            if (uri == null) {
                o f10 = com.bumptech.glide.b.f(this);
                f10.getClass();
                f10.j(new o.b(imageView));
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setImageResource(R.drawable.ic_baseline_add_48);
                return;
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            o f11 = com.bumptech.glide.b.f(this);
            f11.getClass();
            new n(f11.f5794a, f11, Drawable.class, f11.f5795b).C(uri).A(imageView);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0094, code lost:
        if (r0 == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.FeedbackFragment.y1():void");
    }
}
