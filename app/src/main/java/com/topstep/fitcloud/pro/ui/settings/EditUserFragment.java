package com.topstep.fitcloud.pro.ui.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.o;
import bi.z0;
import com.bumptech.glide.n;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentEditUserBinding;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.m;
import ih.v;
import ii.b0;
import ii.m0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import jj.l;
import jj.s;
import kg.k;
import kh.c;
import kh.f;
import kh.h;
import kotlin.Metadata;
import n6.a0;
import nj.b;
import og.t;
import og.x0;
import pm.e0;

@Metadata
/* loaded from: classes2.dex */
public final class EditUserFragment extends b0 implements ChoiceIntDialogFragment.b, f.b, h.b, c.b, CompoundButton.OnCheckedChangeListener, SelectIntDialogFragment.b, m0.a {
    public static final /* synthetic */ mm.h<Object>[] P0;
    public final com.topstep.fitcloud.pro.utils.viewbinding.a A0;
    public final SimpleDateFormat B0;
    public Date C0;
    public Integer D0;
    public Float E0;
    public Float F0;
    public Uri G0;
    public String H0;
    public long I0;
    public k J0;
    public kg.g K0;
    public t L0;
    public nj.b M0;
    public UserInfo N0;
    public final a O0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            EditUserFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            Float f10;
            o a10;
            Float f11;
            int i10;
            String birthday;
            View view2 = view;
            gm.l.f(view2, "view");
            EditUserFragment editUserFragment = EditUserFragment.this;
            mm.h<Object>[] hVarArr = EditUserFragment.P0;
            if (gm.l.a(view2, editUserFragment.v1().itemAvatar)) {
                EditUserFragment.this.m1(1);
            } else {
                Integer num = null;
                if (gm.l.a(view2, EditUserFragment.this.v1().itemNickname)) {
                    a10 = new m0();
                } else if (gm.l.a(view2, EditUserFragment.this.v1().itemIdentityId)) {
                    try {
                        tb.a.f(EditUserFragment.this).l(R.id.toEditIdentityId, new Bundle(), v.d().a());
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (gm.l.a(view2, EditUserFragment.this.v1().itemBirthday)) {
                    int i11 = kh.c.D0;
                    EditUserFragment editUserFragment2 = EditUserFragment.this;
                    Date date = editUserFragment2.C0;
                    if (date == null) {
                        UserInfo userInfo = editUserFragment2.N0;
                        if (userInfo != null && (birthday = userInfo.getBirthday()) != null) {
                            date = hh.b.c(birthday);
                        } else {
                            date = null;
                        }
                    }
                    a10 = c.a.a(date);
                } else if (gm.l.a(view2, EditUserFragment.this.v1().itemSex)) {
                    EditUserFragment editUserFragment3 = EditUserFragment.this;
                    Integer num2 = editUserFragment3.D0;
                    if (num2 != null) {
                        i10 = num2.intValue();
                    } else {
                        UserInfo userInfo2 = editUserFragment3.N0;
                        if (userInfo2 != null) {
                            num = Integer.valueOf(userInfo2.getSex());
                        }
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = 0;
                        }
                    }
                    bi.m0.E(i10, editUserFragment3);
                } else {
                    float f12 = 0.0f;
                    if (gm.l.a(view2, EditUserFragment.this.v1().itemHeight)) {
                        int i12 = kh.f.D0;
                        EditUserFragment editUserFragment4 = EditUserFragment.this;
                        Float f13 = editUserFragment4.E0;
                        if (f13 != null) {
                            f12 = f13.floatValue();
                        } else {
                            UserInfo userInfo3 = editUserFragment4.N0;
                            if (userInfo3 != null) {
                                f11 = Float.valueOf(userInfo3.getHeight());
                            } else {
                                f11 = null;
                            }
                            if (f11 != null) {
                                f12 = f11.floatValue();
                            }
                        }
                        a10 = f.a.a(f12, EditUserFragment.this.w1());
                    } else if (gm.l.a(view2, EditUserFragment.this.v1().itemWeight)) {
                        int i13 = kh.h.C0;
                        EditUserFragment editUserFragment5 = EditUserFragment.this;
                        Float f14 = editUserFragment5.F0;
                        if (f14 != null) {
                            f12 = f14.floatValue();
                        } else {
                            UserInfo userInfo4 = editUserFragment5.N0;
                            if (userInfo4 != null) {
                                f10 = Float.valueOf(userInfo4.getWeight());
                            } else {
                                f10 = null;
                            }
                            if (f10 != null) {
                                f12 = f10.floatValue();
                            }
                        }
                        a10 = h.a.a(f12, EditUserFragment.this.x1());
                    } else if (gm.l.a(view2, EditUserFragment.this.v1().itemSbp)) {
                        EditUserFragment editUserFragment6 = EditUserFragment.this;
                        nj.b bVar = editUserFragment6.M0;
                        if (bVar != null) {
                            int g10 = bVar.g();
                            int i14 = SelectIntDialogFragment.C0;
                            SelectIntDialogFragment.a.a(50, 200, 1, g10, editUserFragment6.o0(R.string.user_info_sbp), editUserFragment6.o0(R.string.unit_mmhg)).h1(editUserFragment6.h0(), "sbp");
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else if (gm.l.a(view2, EditUserFragment.this.v1().itemDbp)) {
                        EditUserFragment editUserFragment7 = EditUserFragment.this;
                        nj.b bVar2 = editUserFragment7.M0;
                        if (bVar2 != null) {
                            int f15 = bVar2.f();
                            int i15 = SelectIntDialogFragment.C0;
                            SelectIntDialogFragment.a.a(20, 120, 1, f15, editUserFragment7.o0(R.string.user_info_dbp), editUserFragment7.o0(R.string.unit_mmhg)).h1(editUserFragment7.h0(), "dbp");
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    }
                }
                a10.h1(EditUserFragment.this.h0(), null);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.EditUserFragment$onViewCreated$1", f = "EditUserFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11823e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.EditUserFragment$onViewCreated$1$1", f = "EditUserFragment.kt", l = {90}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11825e;

            /* renamed from: f */
            public final /* synthetic */ EditUserFragment f11826f;

            /* renamed from: com.topstep.fitcloud.pro.ui.settings.EditUserFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0199a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ EditUserFragment f11827a;

                public C0199a(EditUserFragment editUserFragment) {
                    this.f11827a = editUserFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int sex;
                    float height;
                    float weight;
                    UserInfo userInfo = (UserInfo) obj;
                    Context V0 = this.f11827a.V0();
                    Object obj2 = this.f11827a.G0;
                    if (obj2 == null) {
                        obj2 = userInfo.getAvatar();
                    }
                    ImageView imageView = this.f11827a.v1().imgAvatar;
                    gm.l.e(imageView, "viewBind.imgAvatar");
                    n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(obj2).x(i5.g.w(R.drawable.ic_user_avatar));
                    x10.getClass();
                    ((n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
                    TextView textView = this.f11827a.v1().itemNickname.getTextView();
                    String str = this.f11827a.H0;
                    if (str == null) {
                        str = userInfo.getNickName();
                    }
                    textView.setText(str);
                    this.f11827a.v1().itemIdentityId.getTextView().setText(userInfo.getIdentityId());
                    if (userInfo.getHasIdentity()) {
                        this.f11827a.v1().itemIdentityId.setShowPreferenceIndicator(false);
                        this.f11827a.v1().itemIdentityId.setOnClickListener(null);
                    } else {
                        this.f11827a.v1().itemIdentityId.setShowPreferenceIndicator(true);
                        p.b.g(this.f11827a.v1().itemIdentityId, this.f11827a.O0);
                    }
                    TextView textView2 = this.f11827a.v1().itemBirthday.getTextView();
                    EditUserFragment editUserFragment = this.f11827a;
                    SimpleDateFormat simpleDateFormat = editUserFragment.B0;
                    Date date = editUserFragment.C0;
                    if (date == null) {
                        date = hh.b.c(userInfo.getBirthday());
                    }
                    textView2.setText(simpleDateFormat.format(date));
                    TextView textView3 = this.f11827a.v1().itemSex.getTextView();
                    Context V02 = this.f11827a.V0();
                    Integer num = this.f11827a.D0;
                    if (num != null) {
                        sex = num.intValue();
                    } else {
                        sex = userInfo.getSex();
                    }
                    textView3.setText(a0.s(V02, sex));
                    TextView textView4 = this.f11827a.v1().itemHeight.getTextView();
                    Context V03 = this.f11827a.V0();
                    Float f10 = this.f11827a.E0;
                    if (f10 != null) {
                        height = f10.floatValue();
                    } else {
                        height = userInfo.getHeight();
                    }
                    textView4.setText(a0.r(V03, height, this.f11827a.w1()));
                    TextView textView5 = this.f11827a.v1().itemWeight.getTextView();
                    Context V04 = this.f11827a.V0();
                    Float f11 = this.f11827a.F0;
                    if (f11 != null) {
                        weight = f11.floatValue();
                    } else {
                        weight = userInfo.getWeight();
                    }
                    textView5.setText(a0.t(V04, weight, this.f11827a.x1()));
                    this.f11827a.N0 = userInfo;
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditUserFragment editUserFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11826f = editUserFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11826f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11825e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    EditUserFragment editUserFragment = this.f11826f;
                    k kVar = editUserFragment.J0;
                    if (kVar != null) {
                        kg.l m10 = kVar.m(editUserFragment.I0);
                        C0199a c0199a = new C0199a(this.f11826f);
                        this.f11825e = 1;
                        if (m10.a(c0199a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("userInfoRepository");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.EditUserFragment$onViewCreated$1$2", f = "EditUserFragment.kt", l = {112}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.settings.EditUserFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0200b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11828e;

            /* renamed from: f */
            public final /* synthetic */ EditUserFragment f11829f;

            /* renamed from: com.topstep.fitcloud.pro.ui.settings.EditUserFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ EditUserFragment f11830a;

                public a(EditUserFragment editUserFragment) {
                    this.f11830a = editUserFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    nj.c c10 = this.f11830a.u1().D().c();
                    int i10 = 0;
                    if (c10.g(2) && !c10.g(21)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    LinearLayout linearLayout = this.f11830a.v1().layoutBp;
                    gm.l.e(linearLayout, "viewBind.layoutBp");
                    if (!z10) {
                        i10 = 8;
                    }
                    linearLayout.setVisibility(i10);
                    LinearLayout linearLayout2 = this.f11830a.v1().layoutBp;
                    gm.l.e(linearLayout2, "viewBind.layoutBp");
                    qi.h.m(linearLayout2, booleanValue);
                    this.f11830a.z1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0200b(EditUserFragment editUserFragment, xl.d<? super C0200b> dVar) {
                super(2, dVar);
                this.f11829f = editUserFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0200b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0200b(this.f11829f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11828e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    sm.f<Boolean> a10 = x0.a(this.f11829f.u1());
                    a aVar2 = new a(this.f11829f);
                    this.f11828e = 1;
                    if (a10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.EditUserFragment$onViewCreated$1$3", f = "EditUserFragment.kt", l = {123}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11831e;

            /* renamed from: f */
            public final /* synthetic */ EditUserFragment f11832f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ EditUserFragment f11833a;

                public a(EditUserFragment editUserFragment) {
                    this.f11833a = editUserFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nj.b bVar = (nj.b) obj;
                    nj.b bVar2 = this.f11833a.M0;
                    if (bVar2 != null) {
                        if (!gm.l.a(bVar2, bVar)) {
                            EditUserFragment editUserFragment = this.f11833a;
                            editUserFragment.M0 = bVar;
                            editUserFragment.z1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(EditUserFragment editUserFragment, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f11832f = editUserFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f11832f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11831e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    jj.l lVar = (jj.l) this.f11832f.u1().D().f23334a;
                    ql.b<Byte> bVar = lVar.f17932f;
                    l.d dVar = new l.d(new jj.t((byte) 48));
                    bVar.getClass();
                    sm.b d10 = qi.h.d(new fl.k(new fl.t(bVar, dVar).u(new l.c(new s(lVar)))));
                    a aVar2 = new a(this.f11832f);
                    this.f11831e = 1;
                    if (d10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            EditUserFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11823e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            e0 e0Var = (e0) this.f11823e;
            z0.g(e0Var, null, 0, new a(EditUserFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0200b(EditUserFragment.this, null), 3);
            z0.g(e0Var, null, 0, new c(EditUserFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(EditUserFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentEditUserBinding;", 0);
        gm.b0.f15488a.getClass();
        P0 = new mm.h[]{tVar};
    }

    public EditUserFragment() {
        super(R.layout.fragment_edit_user);
        this.A0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentEditUserBinding.class, this);
        this.B0 = bi.m0.m();
        this.O0 = new a();
    }

    @Override // kh.c.b
    public final void B(Date date) {
        this.C0 = date;
        v1().itemBirthday.getTextView().setText(this.B0.format(date));
    }

    @Override // lh.h, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.M0 = new nj.b(((jj.l) u1().D().f23334a).f17931e.get((byte) 48));
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        Date date = this.C0;
        if (date != null || this.D0 != null || this.E0 != null || this.F0 != null || this.G0 != null || this.H0 != null) {
            k kVar = this.J0;
            if (kVar != null) {
                kVar.I(this.I0, date, this.D0, this.E0, this.F0, this.G0, this.H0);
                this.C0 = null;
                this.D0 = null;
                this.E0 = null;
                this.F0 = null;
                this.G0 = null;
                this.H0 = null;
                return;
            }
            gm.l.l("userInfoRepository");
            throw null;
        }
    }

    @Override // ii.m0.a
    public final String K() {
        String str = this.H0;
        if (str == null) {
            UserInfo userInfo = this.N0;
            if (userInfo != null) {
                return userInfo.getNickName();
            }
            return null;
        }
        return str;
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        if (gm.l.a("sbp", str)) {
            nj.b bVar = this.M0;
            if (bVar != null) {
                byte[] bArr = v.s(bVar).f21880b;
                bArr[1] = (byte) i10;
                y1(new nj.b(bArr));
                t1();
                return;
            }
            gm.l.l("config");
            throw null;
        } else if (gm.l.a("dbp", str)) {
            nj.b bVar2 = this.M0;
            if (bVar2 != null) {
                byte[] bArr2 = v.s(bVar2).f21880b;
                bArr2[0] = (byte) i10;
                y1(new nj.b(bArr2));
                s1();
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(null));
        PreferenceItem preferenceItem = v1().itemIdentityId;
        gm.l.e(preferenceItem, "viewBind.itemIdentityId");
        preferenceItem.setVisibility(hh.b.f(this.I0) ^ true ? 0 : 8);
        v1().itemBpPrivate.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(v1().itemAvatar, this.O0);
        p.b.g(v1().itemNickname, this.O0);
        p.b.g(v1().itemBirthday, this.O0);
        p.b.g(v1().itemSex, this.O0);
        p.b.g(v1().itemHeight, this.O0);
        p.b.g(v1().itemWeight, this.O0);
        p.b.g(v1().itemSbp, this.O0);
        p.b.g(v1().itemDbp, this.O0);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.b
    public final void T(int i10, String str) {
        String string;
        String str2;
        if (gm.l.a(str, "sex")) {
            this.D0 = Integer.valueOf(i10);
            TextView textView = v1().itemSex.getTextView();
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
        }
    }

    @Override // kh.f.b
    public final void c(float f10) {
        this.E0 = Float.valueOf(f10);
        v1().itemHeight.getTextView().setText(a0.r(V0(), f10, w1()));
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

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            nj.b bVar = this.M0;
            if (bVar != null) {
                b.a s10 = v.s(bVar);
                s10.f21880b[2] = z10 ? (byte) 1 : (byte) 0;
                if (z10) {
                    nj.b bVar2 = this.M0;
                    if (bVar2 != null) {
                        if (bVar2.g() == 0) {
                            s10.f21880b[1] = (byte) 125;
                        }
                        nj.b bVar3 = this.M0;
                        if (bVar3 != null) {
                            if (bVar3.f() == 0) {
                                s10.f21880b[0] = (byte) 80;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                }
                y1(new nj.b(s10.f21880b));
                if (z10 && !t1()) {
                    s1();
                    return;
                }
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // lh.h
    public final void p1(Uri uri) {
        gm.l.f(uri, "uri");
        this.G0 = uri;
        Context V0 = V0();
        Uri uri2 = this.G0;
        ImageView imageView = v1().imgAvatar;
        gm.l.e(imageView, "viewBind.imgAvatar");
        n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(uri2).x(i5.g.w(R.drawable.ic_user_avatar));
        x10.getClass();
        ((n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final String q(int i10, String str) {
        return SelectIntDialogFragment.b.a.a(i10);
    }

    public final void s1() {
        boolean z10;
        int i10;
        nj.b bVar;
        nj.b bVar2;
        byte[] bArr = ((jj.l) u1().D().f23334a).f17931e.get((byte) 75);
        if (bArr == null || bArr.length != 5) {
            bArr = null;
        }
        int i11 = 0;
        if (bArr != null && bArr[0] > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (bArr == null) {
            i10 = 0;
        } else {
            i10 = bArr[3] & 255;
        }
        float f10 = i10;
        if (this.M0 != null) {
            if (f10 > bVar.f() * 1.1f) {
                if (bArr != null) {
                    i11 = bArr[4] & 255;
                }
                float f11 = i11;
                if (this.M0 != null) {
                    if (f11 < bVar2.f() * 0.9f) {
                        return;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            new bi.b().h1(h0(), null);
            return;
        }
        gm.l.l("config");
        throw null;
    }

    public final boolean t1() {
        boolean z10;
        int i10;
        nj.b bVar;
        int i11;
        nj.b bVar2;
        byte[] bArr = ((jj.l) u1().D().f23334a).f17931e.get((byte) 75);
        if (bArr == null || bArr.length != 5) {
            bArr = null;
        }
        if (bArr != null && bArr[0] > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (bArr == null) {
            i10 = 0;
        } else {
            i10 = bArr[1] & 255;
        }
        float f10 = i10;
        if (this.M0 != null) {
            if (f10 > bVar.g() * 1.1f) {
                if (bArr == null) {
                    i11 = 0;
                } else {
                    i11 = bArr[2] & 255;
                }
                float f11 = i11;
                if (this.M0 != null) {
                    if (f11 < bVar2.g() * 0.9f) {
                        return false;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            new bi.b().h1(h0(), null);
            return true;
        }
        gm.l.l("config");
        throw null;
    }

    public final t u1() {
        t tVar = this.L0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final FragmentEditUserBinding v1() {
        return (FragmentEditUserBinding) this.A0.a(this, P0[0]);
    }

    public final boolean w1() {
        kg.g gVar = this.K0;
        if (gVar != null) {
            return ((uf.b) gVar.a().getValue()).a();
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // kh.h.b
    public final void x(float f10) {
        String string;
        String str;
        this.F0 = Float.valueOf(f10);
        TextView textView = v1().itemWeight.getTextView();
        Context V0 = V0();
        if (x1()) {
            int i10 = hh.b.f16094a;
            string = V0.getString(R.string.unit_kg_param, Float.valueOf(rm.l.t(f10)));
            str = "{\n            context.ge…isplayMetric())\n        }";
        } else {
            int i11 = hh.b.f16094a;
            string = V0.getString(R.string.unit_lbs_param, Float.valueOf(rm.l.t(f10 * 2.2046225f)));
            str = "{\n            context.ge…playImperial())\n        }";
        }
        gm.l.e(string, str);
        textView.setText(string);
    }

    public final boolean x1() {
        kg.g gVar = this.K0;
        if (gVar != null) {
            return ((uf.b) gVar.a().getValue()).c();
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // ii.m0.a
    public final void y(String str) {
        gm.l.f(str, "nickname");
        this.H0 = str;
        v1().itemNickname.getTextView().setText(str);
    }

    public final void y1(nj.b bVar) {
        og.f D = u1().D();
        D.getClass();
        mf.a0.j(D.f23335b, new og.d(D, bVar, null));
        this.M0 = bVar;
        z1();
    }

    public final void z1() {
        boolean isEnabled = v1().layoutBp.isEnabled();
        SwitchMaterial switchView = v1().itemBpPrivate.getSwitchView();
        nj.b bVar = this.M0;
        if (bVar == null) {
            gm.l.l("config");
            throw null;
        }
        switchView.setChecked(bVar.h());
        if (isEnabled) {
            PreferenceItem preferenceItem = v1().itemSbp;
            nj.b bVar2 = this.M0;
            if (bVar2 == null) {
                gm.l.l("config");
                throw null;
            }
            preferenceItem.setEnabled(bVar2.h());
            PreferenceItem preferenceItem2 = v1().itemDbp;
            nj.b bVar3 = this.M0;
            if (bVar3 == null) {
                gm.l.l("config");
                throw null;
            }
            preferenceItem2.setEnabled(bVar3.h());
        }
        TextView textView = v1().itemSbp.getTextView();
        Context V0 = V0();
        nj.b bVar4 = this.M0;
        if (bVar4 == null) {
            gm.l.l("config");
            throw null;
        }
        textView.setText(a0.b(V0, bVar4.g()));
        TextView textView2 = v1().itemDbp.getTextView();
        Context V02 = V0();
        nj.b bVar5 = this.M0;
        if (bVar5 != null) {
            textView2.setText(a0.b(V02, bVar5.f()));
        } else {
            gm.l.l("config");
            throw null;
        }
    }
}
