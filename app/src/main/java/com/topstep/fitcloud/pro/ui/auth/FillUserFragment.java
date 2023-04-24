package com.topstep.fitcloud.pro.ui.auth;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.u;
import bi.m0;
import com.google.android.material.textfield.TextInputEditText;
import com.topstep.fitcloud.pro.databinding.FragmentFillUserBinding;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.m;
import gm.t;
import i2.b0;
import ih.v;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import jh.j;
import jh.k;
import kh.c;
import kh.f;
import kh.h;
import kotlin.Metadata;
import mf.a0;
import oc.g1;
import pm.z1;
import s.h1;
import y3.c0;
import y3.e1;
import y3.g0;
import y3.k0;
import yb.y;

@Metadata
/* loaded from: classes2.dex */
public final class FillUserFragment extends lh.h implements ChoiceIntDialogFragment.b, f.b, h.b, c.b, g0 {
    public static final /* synthetic */ mm.h<Object>[] F0;
    public int A0;
    public float B0;
    public float C0;
    public Uri D0;
    public final a E0;

    /* renamed from: v0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10304v0;

    /* renamed from: w0 */
    public final tl.d f10305w0;

    /* renamed from: x0 */
    public final SimpleDateFormat f10306x0;

    /* renamed from: y0 */
    public final i2.g f10307y0;

    /* renamed from: z0 */
    public Date f10308z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            FillUserFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            String avatar;
            o a10;
            View view2 = view;
            gm.l.f(view2, "view");
            FillUserFragment fillUserFragment = FillUserFragment.this;
            mm.h<Object>[] hVarArr = FillUserFragment.F0;
            if (gm.l.a(view2, fillUserFragment.s1().imgAvatar)) {
                FillUserFragment.this.m1(1);
            } else {
                if (gm.l.a(view2, FillUserFragment.this.s1().itemBirthday)) {
                    int i10 = kh.c.D0;
                    a10 = c.a.a(FillUserFragment.this.f10308z0);
                } else if (gm.l.a(view2, FillUserFragment.this.s1().itemSex)) {
                    FillUserFragment fillUserFragment2 = FillUserFragment.this;
                    m0.E(fillUserFragment2.A0, fillUserFragment2);
                } else if (gm.l.a(view2, FillUserFragment.this.s1().itemHeight)) {
                    int i11 = kh.f.D0;
                    a10 = f.a.a(FillUserFragment.this.B0, true);
                } else if (gm.l.a(view2, FillUserFragment.this.s1().itemWeight)) {
                    int i12 = kh.h.C0;
                    a10 = h.a.a(FillUserFragment.this.C0, true);
                } else if (gm.l.a(view2, FillUserFragment.this.s1().btnCommit)) {
                    jh.i iVar = (jh.i) FillUserFragment.this.f10305w0.getValue();
                    String processId = FillUserFragment.this.r1().f17786a.getProcessId();
                    TextInputEditText textInputEditText = FillUserFragment.this.s1().editNickName;
                    gm.l.e(textInputEditText, "viewBind.editNickName");
                    String h10 = qi.h.h(textInputEditText);
                    FillUserFragment fillUserFragment3 = FillUserFragment.this;
                    int i13 = fillUserFragment3.A0;
                    Date date = fillUserFragment3.f10308z0;
                    gm.l.c(date);
                    FillUserFragment fillUserFragment4 = FillUserFragment.this;
                    float f10 = fillUserFragment4.B0;
                    float f11 = fillUserFragment4.C0;
                    Uri uri = fillUserFragment4.D0;
                    if (uri == null || (avatar = uri.toString()) == null) {
                        avatar = FillUserFragment.this.r1().f17786a.getAvatar();
                    }
                    iVar.getClass();
                    gm.l.f(processId, "processId");
                    gm.l.f(h10, "nickname");
                    k0.a(iVar, new j(processId, h10, i13, date, f10, f11, avatar, iVar, null), k.f17808b);
                }
                a10.h1(FillUserFragment.this.h0(), null);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends androidx.activity.k {
        public b() {
            super(true);
        }

        @Override // androidx.activity.k
        public final void a() {
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.FillUserFragment$onCreate$3", f = "FillUserFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10311e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FillUserFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10311e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FillUserFragment fillUserFragment = FillUserFragment.this;
            mm.h<Object>[] hVarArr = FillUserFragment.F0;
            qi.p.f(fillUserFragment.f1(), (Throwable) this.f10311e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.FillUserFragment$onCreate$4", f = "FillUserFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<Boolean, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ boolean f10313e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            FillUserFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Boolean bool, xl.d<? super tl.l> dVar) {
            return ((e) p(Boolean.valueOf(bool.booleanValue()), dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10313e = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            if (this.f10313e) {
                i2.m f10 = tb.a.f(FillUserFragment.this);
                b0 a10 = v.d().a();
                try {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isAfterFillUser", true);
                    f10.l(R.id.toExerciseGoal, bundle, a10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                tb.a.f(FillUserFragment.this).p();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        public f() {
            FillUserFragment.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            FillUserFragment fillUserFragment = FillUserFragment.this;
            mm.h<Object>[] hVarArr = FillUserFragment.F0;
            fillUserFragment.u1();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements l<c0<jh.i, jh.h>, jh.i> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10316b;

        /* renamed from: c */
        public final /* synthetic */ r f10317c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10318d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f10316b = eVar;
            this.f10317c = rVar;
            this.f10318d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [y3.k0, jh.i] */
        @Override // fm.l
        public final jh.i k(c0<jh.i, jh.h> c0Var) {
            c0<jh.i, jh.h> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f10316b), jh.h.class, new y3.o(this.f10317c.T0(), h1.c(this.f10317c), this.f10317c), m0.p(this.f10318d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10319c;

        /* renamed from: d */
        public final /* synthetic */ l f10320d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10321e;

        public h(gm.e eVar, g gVar, gm.e eVar2) {
            this.f10319c = eVar;
            this.f10320d = gVar;
            this.f10321e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f10319c, new com.topstep.fitcloud.pro.ui.auth.a(this.f10321e), gm.b0.a(jh.h.class), false, this.f10320d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f10322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f10322b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10322b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f10322b, " has null arguments"));
        }
    }

    static {
        t tVar = new t(FillUserFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFillUserBinding;", 0);
        gm.c0 c0Var = gm.b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(FillUserFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/auth/FillUserViewModel;", 0);
        c0Var.getClass();
        F0 = new mm.h[]{tVar, tVar2};
    }

    public FillUserFragment() {
        super(R.layout.fragment_fill_user);
        this.f10304v0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFillUserBinding.class, this);
        gm.e a10 = gm.b0.a(jh.i.class);
        this.f10305w0 = new h(a10, new g(this, a10, a10), a10).C(this, F0[1]);
        this.f10306x0 = m0.m();
        this.f10307y0 = new i2.g(gm.b0.a(jh.g.class), new i(this));
        this.A0 = -1;
        this.E0 = new a();
    }

    @Override // kh.c.b
    public final void B(Date date) {
        boolean z10 = this.f10308z0 == null;
        this.f10308z0 = date;
        s1().itemBirthday.getTextView().setText(this.f10306x0.format(date));
        if (z10) {
            u1();
        }
    }

    @Override // lh.h, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        T0().f705h.a(this, new b());
        g0.a.c(this, (jh.i) this.f10305w0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.auth.FillUserFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((jh.h) obj).f17788a;
            }
        }, t1(null), new d(null), new e(null));
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        x T0 = T0();
        Object systemService = T0.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = T0.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Context V0 = V0();
        Object obj = this.D0;
        if (obj == null) {
            obj = r1().f17786a.getAvatar();
        }
        ImageView imageView = s1().imgAvatar;
        gm.l.e(imageView, "viewBind.imgAvatar");
        com.bumptech.glide.n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(obj).x(i5.g.w(R.drawable.ic_user_avatar));
        x10.getClass();
        ((com.bumptech.glide.n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
        s1().editNickName.setText(r1().f17786a.getNickName());
        TextInputEditText textInputEditText = s1().editNickName;
        gm.l.e(textInputEditText, "viewBind.editNickName");
        textInputEditText.addTextChangedListener(new f());
        p.b.g(s1().imgAvatar, this.E0);
        p.b.g(s1().itemBirthday, this.E0);
        p.b.g(s1().itemSex, this.E0);
        p.b.g(s1().itemHeight, this.E0);
        p.b.g(s1().itemWeight, this.E0);
        p.b.g(s1().btnCommit, this.E0);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.b
    public final void T(int i10, String str) {
        boolean z10;
        String string;
        String str2;
        if (gm.l.a(str, "sex")) {
            if (this.A0 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.A0 = i10;
            TextView textView = s1().itemSex.getTextView();
            Context V0 = V0();
            if (i10 == 0) {
                string = V0.getString(R.string.user_info_sex_male);
                str2 = "{\n            context.ge…_info_sex_male)\n        }";
            } else {
                string = V0.getString(R.string.user_info_sex_female);
                str2 = "{\n            context.ge…nfo_sex_female)\n        }";
            }
            gm.l.e(string, str2);
            textView.setText(string);
            if (z10) {
                u1();
            }
        }
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, t tVar, y3.i iVar, p pVar, p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, t tVar, y3.i iVar2, p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final u a() {
        return g0.a.b(this);
    }

    @Override // kh.f.b
    public final void c(float f10) {
        boolean z10 = this.B0 == 0.0f;
        this.B0 = f10;
        s1().itemHeight.getTextView().setText(n6.a0.r(V0(), f10, true));
        if (z10) {
            u1();
        }
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    @Override // y3.g0
    public final void invalidate() {
        jh.i iVar = (jh.i) this.f10305w0.getValue();
        gm.l.f(iVar, "repository1");
        jh.h hVar = (jh.h) iVar.f30971c.f31078c.d();
        gm.l.f(hVar, "it");
        qi.p.b(hVar.f17788a, e1());
        tl.l lVar = tl.l.f28297a;
    }

    @Override // lh.h
    public final File k1() {
        return en.f.b(V0());
    }

    @Override // lh.h
    public final lh.d l1() {
        return new lh.d(1, 1, 300, 300);
    }

    @Override // lh.h
    public final File n1() {
        return en.f.b(V0());
    }

    @Override // lh.h
    public final void p1(Uri uri) {
        gm.l.f(uri, "uri");
        this.D0 = uri;
        Context V0 = V0();
        Object obj = this.D0;
        if (obj == null) {
            obj = r1().f17786a.getAvatar();
        }
        ImageView imageView = s1().imgAvatar;
        gm.l.e(imageView, "viewBind.imgAvatar");
        com.bumptech.glide.n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(obj).x(i5.g.w(R.drawable.ic_user_avatar));
        x10.getClass();
        ((com.bumptech.glide.n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
    }

    public final jh.g r1() {
        return (jh.g) this.f10307y0.getValue();
    }

    public final FragmentFillUserBinding s1() {
        return (FragmentFillUserBinding) this.f10304v0.a(this, F0[0]);
    }

    public final e1 t1(String str) {
        return g0.a.h(this, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0040, code lost:
        if ((r5.C0 == 0.0f) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u1() {
        /*
            r5 = this;
            com.topstep.fitcloud.pro.databinding.FragmentFillUserBinding r0 = r5.s1()
            com.google.android.material.textfield.TextInputEditText r0 = r0.editNickName
            java.lang.String r1 = "viewBind.editNickName"
            gm.l.e(r0, r1)
            java.lang.String r0 = qi.h.h(r0)
            com.topstep.fitcloud.pro.databinding.FragmentFillUserBinding r1 = r5.s1()
            android.widget.Button r1 = r1.btnCommit
            int r0 = r0.length()
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L43
            java.util.Date r0 = r5.f10308z0
            if (r0 == 0) goto L43
            int r0 = r5.A0
            r4 = -1
            if (r0 == r4) goto L43
            float r0 = r5.B0
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L43
            float r0 = r5.C0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 != 0) goto L43
            goto L44
        L43:
            r2 = 0
        L44:
            r1.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.auth.FillUserFragment.u1():void");
    }

    @Override // kh.h.b
    public final void x(float f10) {
        boolean z10;
        if (this.C0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C0 = f10;
        TextView textView = s1().itemWeight.getTextView();
        Context V0 = V0();
        int i10 = hh.b.f16094a;
        String string = V0.getString(R.string.unit_kg_param, Float.valueOf(rm.l.t(f10)));
        gm.l.e(string, "{\n            context.ge…isplayMetric())\n        }");
        textView.setText(string);
        if (z10) {
            u1();
        }
    }
}
