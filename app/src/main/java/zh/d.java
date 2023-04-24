package zh;

import android.graphics.Bitmap;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel;
import fm.p;
import java.io.File;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel$createDial$1", f = "DialCustomDfuDialogFragment.kt", l = {262, 264, 291, 292, 294}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public DialCustomDfuViewModel f32417e;

    /* renamed from: f */
    public Throwable f32418f;

    /* renamed from: g */
    public int f32419g;

    /* renamed from: h */
    public /* synthetic */ Object f32420h;

    /* renamed from: i */
    public final /* synthetic */ DialCustomDfuViewModel f32421i;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel$createDial$1$1$1", f = "DialCustomDfuDialogFragment.kt", l = {270, 272, 273}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super File>, Object> {

        /* renamed from: e */
        public File f32422e;

        /* renamed from: f */
        public Bitmap f32423f;

        /* renamed from: g */
        public int f32424g;

        /* renamed from: h */
        public final /* synthetic */ DialCustomDfuViewModel f32425h;

        /* renamed from: zh.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C0620a implements sm.f<gj.g<File>> {

            /* renamed from: a */
            public final /* synthetic */ sm.f f32426a;

            /* renamed from: b */
            public final /* synthetic */ DialCustomDfuViewModel f32427b;

            /* renamed from: zh.d$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0621a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ sm.g f32428a;

                /* renamed from: b */
                public final /* synthetic */ DialCustomDfuViewModel f32429b;

                @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel$createDial$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "DialCustomDfuDialogFragment.kt", l = {224, 223}, m = "emit")
                /* renamed from: zh.d$a$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C0622a extends zl.c {

                    /* renamed from: d */
                    public /* synthetic */ Object f32430d;

                    /* renamed from: e */
                    public int f32431e;

                    /* renamed from: f */
                    public Object f32432f;

                    /* renamed from: g */
                    public sm.g f32433g;

                    /* renamed from: i */
                    public gj.g f32435i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0622a(xl.d dVar) {
                        super(dVar);
                        C0621a.this = r1;
                    }

                    @Override // zl.a
                    public final Object t(Object obj) {
                        this.f32430d = obj;
                        this.f32431e |= Integer.MIN_VALUE;
                        return C0621a.this.n(null, this);
                    }
                }

                public C0621a(sm.g gVar, DialCustomDfuViewModel dialCustomDfuViewModel) {
                    this.f32428a = gVar;
                    this.f32429b = dialCustomDfuViewModel;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x006e  */
                @Override // sm.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object n(java.lang.Object r10, xl.d r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof zh.d.a.C0620a.C0621a.C0622a
                        if (r0 == 0) goto L13
                        r0 = r11
                        zh.d$a$a$a$a r0 = (zh.d.a.C0620a.C0621a.C0622a) r0
                        int r1 = r0.f32431e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32431e = r1
                        goto L18
                    L13:
                        zh.d$a$a$a$a r0 = new zh.d$a$a$a$a
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.f32430d
                        yl.a r1 = yl.a.COROUTINE_SUSPENDED
                        int r2 = r0.f32431e
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L3d
                        if (r2 == r4) goto L33
                        if (r2 != r3) goto L2b
                        mf.a0.k(r11)
                        goto L7d
                    L2b:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L33:
                        gj.g r10 = r0.f32435i
                        sm.g r2 = r0.f32433g
                        java.lang.Object r6 = r0.f32432f
                        mf.a0.k(r11)
                        goto L64
                    L3d:
                        mf.a0.k(r11)
                        sm.g r2 = r9.f32428a
                        r11 = r10
                        gj.g r11 = (gj.g) r11
                        com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel r6 = r9.f32429b
                        java.lang.Object r7 = r6.e()
                        com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel$b r7 = (com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel.b) r7
                        int r8 = r11.f15373a
                        com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel$b r7 = com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel.b.a(r7, r5, r8, r4)
                        r0.f32432f = r10
                        r0.f32433g = r2
                        r0.f32435i = r11
                        r0.f32431e = r4
                        tl.l r6 = r6.g(r7)
                        if (r6 != r1) goto L62
                        return r1
                    L62:
                        r6 = r10
                        r10 = r11
                    L64:
                        int r10 = r10.f15373a
                        r11 = 100
                        if (r10 != r11) goto L6b
                        goto L6c
                    L6b:
                        r4 = 0
                    L6c:
                        if (r4 == 0) goto L7d
                        r0.f32432f = r5
                        r0.f32433g = r5
                        r0.f32435i = r5
                        r0.f32431e = r3
                        java.lang.Object r10 = r2.n(r6, r0)
                        if (r10 != r1) goto L7d
                        return r1
                    L7d:
                        tl.l r10 = tl.l.f28297a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: zh.d.a.C0620a.C0621a.n(java.lang.Object, xl.d):java.lang.Object");
                }
            }

            public C0620a(sm.b bVar, DialCustomDfuViewModel dialCustomDfuViewModel) {
                this.f32426a = bVar;
                this.f32427b = dialCustomDfuViewModel;
            }

            @Override // sm.f
            public final Object a(sm.g<? super gj.g<File>> gVar, xl.d dVar) {
                Object a10 = this.f32426a.a(new C0621a(gVar, this.f32427b), dVar);
                return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DialCustomDfuViewModel dialCustomDfuViewModel, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f32425h = dialCustomDfuViewModel;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super File> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f32425h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x0109 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x026b A[Catch: all -> 0x0289, TRY_ENTER, TryCatch #4 {all -> 0x0289, blocks: (B:147:0x026b, B:148:0x0277), top: B:180:0x0269 }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0277 A[Catch: all -> 0x0289, TRY_LEAVE, TryCatch #4 {all -> 0x0289, blocks: (B:147:0x026b, B:148:0x0277), top: B:180:0x0269 }] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 756
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.d.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DialCustomDfuViewModel dialCustomDfuViewModel, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f32421i = dialCustomDfuViewModel;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        d dVar2 = new d(this.f32421i, dVar);
        dVar2.f32420h = obj;
        return dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.d.t(java.lang.Object):java.lang.Object");
    }
}
