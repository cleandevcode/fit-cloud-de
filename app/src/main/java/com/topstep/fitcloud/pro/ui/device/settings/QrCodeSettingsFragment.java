package com.topstep.fitcloud.pro.ui.device.settings;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import bi.e0;
import bi.u0;
import bi.v0;
import bi.y0;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.m;
import java.io.File;
import kotlin.Metadata;
import mf.a0;
import p000do.a;

@Metadata
/* loaded from: classes2.dex */
public final class QrCodeSettingsFragment extends e0<tl.l> {
    public static final /* synthetic */ int I0 = 0;
    public final tl.i B0;
    public String C0;
    public ImageView D0;
    public ImageView E0;
    public Button F0;
    public final tl.i G0;
    public final t0 H0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$onGetPhoto$1", f = "QrCodeSettingsFragment.kt", l = {154, 171, 176}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public Object f11254e;

        /* renamed from: f */
        public int f11255f;

        /* renamed from: h */
        public final /* synthetic */ Uri f11257h;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$onGetPhoto$1$content$1", f = "QrCodeSettingsFragment.kt", l = {156}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0185a extends zl.i implements p<pm.e0, xl.d<? super String>, Object> {

            /* renamed from: e */
            public int f11258e;

            /* renamed from: f */
            public final /* synthetic */ QrCodeSettingsFragment f11259f;

            /* renamed from: g */
            public final /* synthetic */ Uri f11260g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185a(QrCodeSettingsFragment qrCodeSettingsFragment, Uri uri, xl.d<? super C0185a> dVar) {
                super(2, dVar);
                this.f11259f = qrCodeSettingsFragment;
                this.f11260g = uri;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super String> dVar) {
                return ((C0185a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0185a(this.f11259f, this.f11260g, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                boolean z10;
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11258e;
                boolean z11 = true;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        Context V0 = this.f11259f.V0();
                        Uri uri = this.f11260g;
                        this.f11258e = 1;
                        pm.j jVar = new pm.j(1, a0.i(this));
                        jVar.u();
                        o b10 = com.bumptech.glide.b.c(V0).b(V0);
                        gm.l.e(b10, "with(context)");
                        n<Bitmap> C = b10.i().C(uri);
                        qi.b bVar = new qi.b(jVar);
                        C.B(bVar, C);
                        jVar.z(new qi.a(b10, bVar));
                        obj = jVar.t();
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    HmsScan[] decodeWithBitmap = ScanUtil.decodeWithBitmap(this.f11259f.V0(), (Bitmap) obj, (HmsScanAnalyzerOptions) this.f11259f.G0.getValue());
                    if (decodeWithBitmap != null) {
                        if (decodeWithBitmap.length == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        return decodeWithBitmap[0].originalValue;
                    }
                } catch (Exception e10) {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("QrCode");
                    bVar2.q(e10);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, xl.d<? super a> dVar) {
            super(2, dVar);
            QrCodeSettingsFragment.this = r1;
            this.f11257h = uri;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f11257h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00d8  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.a.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$onViewCreated$1", f = "QrCodeSettingsFragment.kt", l = {69, 71}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public QrCodeSettingsFragment f11261e;

        /* renamed from: f */
        public int f11262f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            QrCodeSettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r7) {
            /*
                r6 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r6.f11262f
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r0 = r6.f11261e
                mf.a0.k(r7)
                goto L5d
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r1 = r6.f11261e
                mf.a0.k(r7)
                goto L3f
            L21:
                mf.a0.k(r7)
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r1 = com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.this
                androidx.lifecycle.t0 r7 = r1.H0
                java.lang.Object r7 = r7.getValue()
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel r7 = (com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel) r7
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r5 = com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.this
                int r5 = r5.u1()
                r6.f11261e = r1
                r6.f11262f = r4
                java.io.Serializable r7 = r7.i(r5, r6)
                if (r7 != r0) goto L3f
                return r0
            L3f:
                java.lang.String r7 = (java.lang.String) r7
                r1.C0 = r7
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r7 = com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.this
                java.lang.String r1 = r7.C0
                if (r1 == 0) goto L89
                r6.f11261e = r7
                r6.f11262f = r3
                wm.b r3 = pm.o0.f24382b
                bi.t0 r5 = new bi.t0
                r5.<init>(r7, r1, r2)
                java.lang.Object r1 = bi.z0.s(r6, r3, r5)
                if (r1 != r0) goto L5b
                return r0
            L5b:
                r0 = r7
                r7 = r1
            L5d:
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                if (r7 == 0) goto L89
                android.widget.Button r1 = r0.F0
                if (r1 == 0) goto L83
                r1.setEnabled(r4)
                android.widget.ImageView r1 = r0.E0
                if (r1 == 0) goto L7d
                r1.setImageBitmap(r7)
                android.widget.ImageView r7 = r0.D0
                if (r7 == 0) goto L77
                r7.setImageDrawable(r2)
                goto L89
            L77:
                java.lang.String r7 = "imageAdd"
                gm.l.l(r7)
                throw r2
            L7d:
                java.lang.String r7 = "imageQrCode"
                gm.l.l(r7)
                throw r2
            L83:
                java.lang.String r7 = "btnBind"
                gm.l.l(r7)
                throw r2
            L89:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.b.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.l<ImageView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            QrCodeSettingsFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            gm.l.f(imageView, "it");
            QrCodeSettingsFragment.this.I(0);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            QrCodeSettingsFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            QrCodeSettingsFragment qrCodeSettingsFragment = QrCodeSettingsFragment.this;
            String str = qrCodeSettingsFragment.C0;
            if (str != null) {
                QrCodeSettingsViewModel qrCodeSettingsViewModel = (QrCodeSettingsViewModel) qrCodeSettingsFragment.H0.getValue();
                int u12 = qrCodeSettingsFragment.u1();
                qrCodeSettingsViewModel.getClass();
                qrCodeSettingsViewModel.h(new y0(qrCodeSettingsViewModel, u12, str, null), 0L);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            QrCodeSettingsFragment.this = r1;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(2:43|(1:45)(1:46))|4|(1:42)(1:8)|9|(7:11|(1:13)(1:40)|17|18|19|20|21)|41|17|18|19|20|21) */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00b5, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00b6, code lost:
            r8.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0066  */
        @Override // fm.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tl.l k(android.widget.Button r8) {
            /*
                r7 = this;
                android.widget.Button r8 = (android.widget.Button) r8
                com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment r8 = com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.this
                int r0 = com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.I0
                int r0 = r8.u1()
                r1 = 128(0x80, float:1.8E-43)
                r2 = 33
                if (r0 >= r2) goto L13
                java.lang.String r0 = "wallet"
                goto L1e
            L13:
                int r0 = r8.u1()
                if (r0 >= r1) goto L1c
                java.lang.String r0 = "profile"
                goto L1e
            L1c:
                java.lang.String r0 = "nucleicacid"
            L1e:
                int r3 = r8.u1()
                if (r3 == r1) goto L32
                android.content.Context r1 = r8.V0()
                boolean r1 = h7.a.n(r1)
                if (r1 == 0) goto L2f
                goto L32
            L2f:
                java.lang.String r1 = "en"
                goto L34
            L32:
                java.lang.String r1 = "cn"
            L34:
                int r3 = r8.u1()
                if (r3 == r2) goto L78
                r2 = 41
                if (r3 == r2) goto L75
                switch(r3) {
                    case 1: goto L78;
                    case 2: goto L57;
                    case 3: goto L54;
                    case 4: goto L66;
                    case 5: goto L51;
                    case 6: goto L4e;
                    case 7: goto L4b;
                    case 8: goto L48;
                    default: goto L41;
                }
            L41:
                switch(r3) {
                    case 35: goto L66;
                    case 36: goto L63;
                    case 37: goto L60;
                    case 38: goto L5d;
                    case 39: goto L5a;
                    default: goto L44;
                }
            L44:
                switch(r3) {
                    case 43: goto L72;
                    case 44: goto L6f;
                    case 45: goto L6c;
                    case 46: goto L69;
                    default: goto L47;
                }
            L47:
                goto L78
            L48:
                java.lang.String r2 = "bhim"
                goto L7a
            L4b:
                java.lang.String r2 = "gpay"
                goto L7a
            L4e:
                java.lang.String r2 = "phonepe"
                goto L7a
            L51:
                java.lang.String r2 = "paytm"
                goto L7a
            L54:
                java.lang.String r2 = "paypal"
                goto L7a
            L57:
                java.lang.String r2 = "alipay"
                goto L7a
            L5a:
                java.lang.String r2 = "instagram"
                goto L7a
            L5d:
                java.lang.String r2 = "twitter"
                goto L7a
            L60:
                java.lang.String r2 = "whatsapp"
                goto L7a
            L63:
                java.lang.String r2 = "facebook"
                goto L7a
            L66:
                java.lang.String r2 = "qq"
                goto L7a
            L69:
                java.lang.String r2 = "linkedin"
                goto L7a
            L6c:
                java.lang.String r2 = "phone"
                goto L7a
            L6f:
                java.lang.String r2 = "email"
                goto L7a
            L72:
                java.lang.String r2 = "skype"
                goto L7a
            L75:
                java.lang.String r2 = "line"
                goto L7a
            L78:
                java.lang.String r2 = "wechat"
            L7a:
                java.util.Locale r3 = java.util.Locale.US
                r4 = 3
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r6 = 0
                r5[r6] = r0
                r0 = 1
                r5[r0] = r1
                r0 = 2
                r5[r0] = r2
                java.lang.String r0 = "http://fitcloud.hetangsmart.com/help/?type=%s&lang=%s&app=%s"
                java.lang.String r1 = "format(locale, format, *args)"
                java.lang.String r0 = o5.a0.a(r5, r4, r3, r0, r1)
                i2.m r8 = tb.a.f(r8)
                r1 = 2131952458(0x7f13034a, float:1.954136E38)
                r2 = 2131362960(0x7f0a0490, float:1.8345715E38)
                i2.b0$a r3 = ih.v.d()
                i2.b0 r3 = r3.a()
                android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Exception -> Lb5
                r4.<init>()     // Catch: java.lang.Exception -> Lb5
                java.lang.String r5 = "title"
                r4.putInt(r5, r1)     // Catch: java.lang.Exception -> Lb5
                java.lang.String r1 = "url"
                r4.putString(r1, r0)     // Catch: java.lang.Exception -> Lb5
                r8.l(r2, r4, r3)     // Catch: java.lang.Exception -> Lb5
                goto Lb9
            Lb5:
                r8 = move-exception
                r8.printStackTrace()
            Lb9:
                tl.l r8 = tl.l.f28297a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.e.k(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<HmsScanAnalyzerOptions> {

        /* renamed from: b */
        public static final f f11267b = new f();

        public f() {
            super(0);
        }

        @Override // fm.a
        public final HmsScanAnalyzerOptions m() {
            return new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScanBase.QRCODE_SCAN_TYPE, HmsScanBase.DATAMATRIX_SCAN_TYPE).setPhotoMode(true).create();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(0);
            QrCodeSettingsFragment.this = r1;
        }

        @Override // fm.a
        public final Integer m() {
            return Integer.valueOf(((v0) new i2.g(b0.a(v0.class), new u0(QrCodeSettingsFragment.this)).getValue()).f4369a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar) {
            super(0);
            this.f11269b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11269b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11270b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f11270b = hVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f11270b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tl.d dVar) {
            super(0);
            this.f11271b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11271b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.d dVar) {
            super(0);
            this.f11272b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f11272b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11273b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(r rVar, tl.d dVar) {
            super(0);
            this.f11273b = rVar;
            this.f11274c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f11274c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11273b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    public QrCodeSettingsFragment() {
        super(R.layout.fragment_qr_code_settings);
        this.B0 = new tl.i(new g());
        this.G0 = new tl.i(f.f11267b);
        tl.d a10 = fb.e.a(new i(new h(this)));
        this.H0 = ab.b.f(this, b0.a(QrCodeSettingsViewModel.class), new j(a10), new k(a10), new l(this, a10));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    @Override // nh.b, lh.c, androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            gm.l.f(r3, r0)
            super.O0(r3, r4)
            r4 = 2131362969(0x7f0a0499, float:1.8345734E38)
            android.view.View r4 = r3.findViewById(r4)
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            int r0 = r2.u1()
            r1 = 33
            if (r0 == r1) goto L70
            r1 = 41
            if (r0 == r1) goto L6c
            r1 = 128(0x80, float:1.8E-43)
            if (r0 == r1) goto L68
            switch(r0) {
                case 1: goto L70;
                case 2: goto L40;
                case 3: goto L3c;
                case 4: goto L54;
                case 5: goto L38;
                case 6: goto L34;
                case 7: goto L30;
                case 8: goto L2c;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case 35: goto L54;
                case 36: goto L50;
                case 37: goto L4c;
                case 38: goto L48;
                case 39: goto L44;
                default: goto L27;
            }
        L27:
            switch(r0) {
                case 43: goto L64;
                case 44: goto L60;
                case 45: goto L5c;
                case 46: goto L58;
                default: goto L2a;
            }
        L2a:
            r0 = 0
            goto L73
        L2c:
            r0 = 2131951959(0x7f130157, float:1.9540347E38)
            goto L73
        L30:
            r0 = 2131952023(0x7f130197, float:1.9540477E38)
            goto L73
        L34:
            r0 = 2131952079(0x7f1301cf, float:1.954059E38)
            goto L73
        L38:
            r0 = 2131952077(0x7f1301cd, float:1.9540587E38)
            goto L73
        L3c:
            r0 = 2131952076(0x7f1301cc, float:1.9540585E38)
            goto L73
        L40:
            r0 = 2131951958(0x7f130156, float:1.9540345E38)
            goto L73
        L44:
            r0 = 2131952040(0x7f1301a8, float:1.9540512E38)
            goto L73
        L48:
            r0 = 2131952129(0x7f130201, float:1.9540692E38)
            goto L73
        L4c:
            r0 = 2131952137(0x7f130209, float:1.9540708E38)
            goto L73
        L50:
            r0 = 2131952009(0x7f130189, float:1.9540449E38)
            goto L73
        L54:
            r0 = 2131952085(0x7f1301d5, float:1.9540603E38)
            goto L73
        L58:
            r0 = 2131952044(0x7f1301ac, float:1.954052E38)
            goto L73
        L5c:
            r0 = 2131952078(0x7f1301ce, float:1.9540589E38)
            goto L73
        L60:
            r0 = 2131952050(0x7f1301b2, float:1.9540532E38)
            goto L73
        L64:
            r0 = 2131952103(0x7f1301e7, float:1.954064E38)
            goto L73
        L68:
            r0 = 2131952063(0x7f1301bf, float:1.9540558E38)
            goto L73
        L6c:
            r0 = 2131952043(0x7f1301ab, float:1.9540518E38)
            goto L73
        L70:
            r0 = 2131952136(0x7f130208, float:1.9540706E38)
        L73:
            r4.setTitle(r0)
            r4 = 2131362227(0x7f0a01b3, float:1.8344229E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "view.findViewById(R.id.image_add)"
            gm.l.e(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.D0 = r4
            r4 = 2131362228(0x7f0a01b4, float:1.834423E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "view.findViewById(R.id.image_qr_code)"
            gm.l.e(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.E0 = r4
            r4 = 2131361931(0x7f0a008b, float:1.8343628E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "view.findViewById(R.id.btn_bind)"
            gm.l.e(r4, r0)
            android.widget.Button r4 = (android.widget.Button) r4
            r2.F0 = r4
            androidx.lifecycle.LifecycleCoroutineScopeImpl r4 = qi.h.j(r2)
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$b r0 = new com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$b
            r1 = 0
            r0.<init>(r1)
            r4.e(r0)
            android.widget.ImageView r4 = r2.E0
            if (r4 == 0) goto Le1
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$c r0 = new com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$c
            r0.<init>()
            p.b.g(r4, r0)
            android.widget.Button r4 = r2.F0
            if (r4 == 0) goto Ldb
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$d r0 = new com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$d
            r0.<init>()
            p.b.g(r4, r0)
            r4 = 2131361945(0x7f0a0099, float:1.8343657E38)
            android.view.View r3 = r3.findViewById(r4)
            com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$e r4 = new com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment$e
            r4.<init>()
            p.b.g(r3, r4)
            return
        Ldb:
            java.lang.String r3 = "btnBind"
            gm.l.l(r3)
            throw r1
        Le1:
            java.lang.String r3 = "imageQrCode"
            gm.l.l(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment.O0(android.view.View, android.os.Bundle):void");
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
        return null;
    }

    @Override // lh.h
    public final void p1(Uri uri) {
        gm.l.f(uri, "uri");
        qi.h.j(this).e(new a(uri, null));
    }

    @Override // nh.b
    public final nh.e r1() {
        return (QrCodeSettingsViewModel) this.H0.getValue();
    }

    public final int u1() {
        return ((Number) this.B0.getValue()).intValue();
    }
}
