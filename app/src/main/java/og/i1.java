package og;

import a0.a2;
import android.content.Context;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import java.util.List;

/* loaded from: classes2.dex */
public final class i1 implements h1 {

    /* renamed from: a */
    public final Context f23363a;

    /* renamed from: b */
    public final t f23364b;

    /* renamed from: c */
    public final vg.d f23365c;

    /* renamed from: d */
    public a f23366d;

    /* renamed from: e */
    public List<GamePacket> f23367e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f23368a;

        /* renamed from: b */
        public final String f23369b;

        public a(String str, String str2) {
            gm.l.f(str, "hardwareInfo");
            this.f23368a = str;
            this.f23369b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f23368a, aVar.f23368a) && gm.l.a(this.f23369b, aVar.f23369b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f23369b.hashCode() + (this.f23368a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("RemoteCacheKey(hardwareInfo=");
            a10.append(this.f23368a);
            a10.append(", lang=");
            return a2.a(a10, this.f23369b, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.GameRepositoryImpl", f = "GameRepository.kt", l = {32, 34}, m = "getGamePushParams")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public i1 f23370d;

        /* renamed from: e */
        public List f23371e;

        /* renamed from: f */
        public /* synthetic */ Object f23372f;

        /* renamed from: h */
        public int f23374h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            i1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23372f = obj;
            this.f23374h |= Integer.MIN_VALUE;
            return i1.this.a(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.GameRepositoryImpl", f = "GameRepository.kt", l = {148}, m = "requestGamePackets")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public i1 f23375d;

        /* renamed from: e */
        public a f23376e;

        /* renamed from: f */
        public /* synthetic */ Object f23377f;

        /* renamed from: h */
        public int f23379h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            i1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23377f = obj;
            this.f23379h |= Integer.MIN_VALUE;
            return i1.this.b(null, this);
        }
    }

    public i1(Context context, t tVar, vg.d dVar) {
        gm.l.f(tVar, "deviceManager");
        this.f23363a = context;
        this.f23364b = tVar;
        this.f23365c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b0  */
    @Override // og.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super zf.a> r20) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.i1.a(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.game.push.GamePacket>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof og.i1.c
            if (r0 == 0) goto L13
            r0 = r8
            og.i1$c r0 = (og.i1.c) r0
            int r1 = r0.f23379h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23379h = r1
            goto L18
        L13:
            og.i1$c r0 = new og.i1$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23377f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23379h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            og.i1$a r7 = r0.f23376e
            og.i1 r0 = r0.f23375d
            mf.a0.k(r8)
            goto L66
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            mf.a0.k(r8)
            android.content.Context r8 = r6.f23363a
            boolean r8 = h7.a.n(r8)
            if (r8 == 0) goto L41
            java.lang.String r8 = "cn"
            goto L43
        L41:
            java.lang.String r8 = "en"
        L43:
            og.i1$a r2 = new og.i1$a
            r2.<init>(r7, r8)
            java.util.List<com.topstep.fitcloud.pro.model.game.push.GamePacket> r4 = r6.f23367e
            if (r4 == 0) goto L55
            og.i1$a r5 = r6.f23366d
            boolean r5 = gm.l.a(r2, r5)
            if (r5 == 0) goto L55
            goto L75
        L55:
            vg.d r4 = r6.f23365c
            r0.f23375d = r6
            r0.f23376e = r2
            r0.f23379h = r3
            java.lang.Object r8 = r4.u(r7, r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r0 = r6
            r7 = r2
        L66:
            vg.i r8 = (vg.i) r8
            java.util.List r8 = r8.a()
            if (r8 != 0) goto L70
            ul.s r8 = ul.s.f28879a
        L70:
            r4 = r8
            r0.f23366d = r7
            r0.f23367e = r4
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: og.i1.b(java.lang.String, xl.d):java.lang.Object");
    }
}
