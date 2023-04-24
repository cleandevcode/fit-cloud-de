package mg;

/* loaded from: classes2.dex */
public final class t8 implements sm.f<vf.a> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f21478a;

    /* renamed from: b */
    public final /* synthetic */ d9 f21479b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f21480a;

        /* renamed from: b */
        public final /* synthetic */ d9 f21481b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao$flowAllRealtime$$inlined$map$1$2", f = "StringTypedDao.kt", l = {223}, m = "emit")
        /* renamed from: mg.t8$a$a */
        /* loaded from: classes2.dex */
        public static final class C0378a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f21482d;

            /* renamed from: e */
            public int f21483e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0378a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f21482d = obj;
                this.f21483e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, d9 d9Var) {
            this.f21480a = gVar;
            this.f21481b = d9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:159:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x007c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:181:0x006c, B:190:0x007c), top: B:277:0x006c }] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x00b1 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #2 {all -> 0x00aa, blocks: (B:199:0x00a1, B:208:0x00b1), top: B:279:0x00a1 }] */
        /* JADX WARN: Removed duplicated region for block: B:213:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x00e6 A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #4 {all -> 0x00df, blocks: (B:217:0x00d6, B:226:0x00e6), top: B:283:0x00d6 }] */
        /* JADX WARN: Removed duplicated region for block: B:231:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:244:0x011c A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #0 {all -> 0x0115, blocks: (B:235:0x010c, B:244:0x011c), top: B:275:0x010c }] */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0152 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #3 {all -> 0x014b, blocks: (B:253:0x0142, B:262:0x0152), top: B:281:0x0142 }] */
        /* JADX WARN: Removed duplicated region for block: B:267:0x016a  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r13, xl.d r14) {
            /*
                Method dump skipped, instructions count: 402
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.t8.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public t8(sm.f fVar, d9 d9Var) {
        this.f21478a = fVar;
        this.f21479b = d9Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super vf.a> gVar, xl.d dVar) {
        Object a10 = this.f21478a.a(new a(gVar, this.f21479b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
