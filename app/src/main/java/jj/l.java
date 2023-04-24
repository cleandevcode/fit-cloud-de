package jj;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class l extends ti.c<tl.l> implements jj.b {

    /* renamed from: j */
    public static final Map<Byte, Integer> f17926j;

    /* renamed from: a */
    public final wi.a f17927a;

    /* renamed from: b */
    public final int f17928b;

    /* renamed from: c */
    public final SharedPreferences f17929c;

    /* renamed from: d */
    public nj.c f17930d;

    /* renamed from: e */
    public final HashMap<Byte, byte[]> f17931e;

    /* renamed from: f */
    public final ql.b<Byte> f17932f;

    /* renamed from: g */
    public final al.j f17933g;

    /* renamed from: h */
    public uk.c f17934h;

    /* renamed from: i */
    public j f17935i;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final String a(byte b10) {
            Map<Byte, Integer> map = l.f17926j;
            return androidx.appcompat.widget.u0.a("config2_", b10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Byte, nj.k> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            l.this = r1;
        }

        @Override // fm.l
        public final nj.k k(Byte b10) {
            return new nj.k(l.this.f17931e.get((byte) 122));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements wk.e {

        /* renamed from: a */
        public final /* synthetic */ fm.l f17937a;

        public c(fm.l lVar) {
            this.f17937a = lVar;
        }

        @Override // wk.e
        public final /* synthetic */ Object apply(Object obj) {
            return this.f17937a.k(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements wk.f {

        /* renamed from: a */
        public final /* synthetic */ fm.l f17938a;

        public d(t tVar) {
            this.f17938a = tVar;
        }

        @Override // wk.f
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f17938a.k(obj)).booleanValue();
        }
    }

    static {
        new a();
        f17926j = ul.z.D(new tl.f((byte) 20, 1), new tl.f((byte) 23, 2), new tl.f((byte) 26, 4), new tl.f((byte) 36, 8), new tl.f((byte) 39, 16), new tl.f((byte) 42, 32), new tl.f((byte) 48, 64), new tl.f((byte) 45, 128), new tl.f((byte) 72, Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_TYPE_LEGACY)), new tl.f((byte) 75, Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_TYPE_SECURE)), new tl.f((byte) 78, Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)), new tl.f((byte) 89, 2048), new tl.f((byte) 92, 4096), new tl.f((byte) 100, Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_MASK)), new tl.f((byte) 122, Integer.valueOf((int) DfuBaseService.ERROR_CONNECTION_MASK)));
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [jj.j] */
    public l(wi.k kVar, vi.c cVar, int i10) {
        gm.l.f(cVar, "internalStorage");
        this.f17927a = kVar;
        this.f17928b = i10;
        SharedPreferences b10 = cVar.b();
        this.f17929c = b10;
        this.f17930d = new nj.c(a0.m.a(b10, a.a((byte) 17)));
        this.f17931e = new HashMap<>();
        if (i10 != 0) {
            for (Map.Entry<Byte, Integer> entry : f17926j.entrySet()) {
                if (bi.m0.w(this.f17928b, entry.getValue().intValue())) {
                    this.f17931e.put(entry.getKey(), a0.m.a(this.f17929c, a.a(entry.getKey().byteValue())));
                }
            }
        }
        this.f17932f = new ql.b<>();
        this.f17933g = new fl.t(h7.a.t(this.f17927a), new i(0, m.f17941b)).y(new ph.n(5, new q(this)), yk.a.f31790e, yk.a.f31788c);
        this.f17935i = new tk.m() { // from class: jj.j
            @Override // tk.m
            public final tk.i a(tk.i iVar) {
                l lVar = l.this;
                gm.l.f(lVar, "this$0");
                return iVar.u(new wi.j(2, new b0(lVar)));
            }
        };
    }

    @Override // ti.c
    public final bj.b d() {
        return new bj.b((byte) 2, (byte) 33, null);
    }

    @Override // ti.c
    public final tk.m<bj.b, tl.l> e() {
        return this.f17935i;
    }

    @Override // ti.c
    public final bj.b f() {
        return new bj.b((byte) 2, (byte) 32, null);
    }

    public final bl.h g(final byte b10, final mj.a aVar) {
        return h7.a.s(this.f17927a, new bj.b((byte) 2, (byte) (b10 == 122 ? b10 + 1 : b10 - 2), aVar.c(this.f17930d))).d(new wk.a() { // from class: jj.k
            @Override // wk.a
            public final void run() {
                l lVar = l.this;
                byte b11 = b10;
                mj.a aVar2 = aVar;
                gm.l.f(lVar, "this$0");
                gm.l.f(aVar2, "$config");
                lVar.h(b11, aVar2.f21878b, null);
            }
        });
    }

    public final boolean h(byte b10, byte[] bArr, SharedPreferences.Editor editor) {
        if (!Arrays.equals(this.f17931e.get(Byte.valueOf(b10)), bArr)) {
            this.f17931e.put(Byte.valueOf(b10), bArr);
            this.f17932f.b(Byte.valueOf(b10));
            int i10 = this.f17928b;
            Integer num = f17926j.get(Byte.valueOf(b10));
            gm.l.c(num);
            if (bi.m0.w(i10, num.intValue())) {
                if (editor == null) {
                    editor = this.f17929c.edit();
                }
                gm.l.e(editor, "editor ?: sharedPreferences.edit()");
                String a10 = a.a(b10);
                gm.l.f(a10, "key");
                if (bArr == null) {
                    editor.remove(a10);
                } else {
                    editor.putString(a10, bi.r.C(bArr));
                }
                editor.apply();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0039, code lost:
        if (r6.length != 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(yb.b r6, byte r7, android.content.SharedPreferences.Editor r8) {
        /*
            r5 = this;
            jj.h r6 = r6.a()
            r0 = 0
            if (r6 == 0) goto Lb
            byte r1 = r6.f17899a
            if (r1 == r7) goto Lc
        Lb:
            r6 = r0
        Lc:
            if (r6 == 0) goto L49
            r1 = 26
            if (r7 != r1) goto L40
            byte r7 = r6.f17899a
            byte[] r6 = r6.f17900b
            nj.c r1 = r5.f17930d
            r2 = 279(0x117, float:3.91E-43)
            boolean r1 = r1.g(r2)
            if (r1 == 0) goto L22
        L20:
            r0 = r6
            goto L3b
        L22:
            r1 = 2
            if (r6 == 0) goto L28
            int r2 = r6.length
            if (r2 == r1) goto L2a
        L28:
            byte[] r6 = new byte[r1]
        L2a:
            android.content.SharedPreferences r2 = r5.f17929c
            r3 = 0
            java.lang.String r4 = "weather_switch2"
            boolean r2 = r2.getBoolean(r4, r3)
            r3 = 5
            r4 = 1
            bi.m0.B(r6, r4, r3, r2)
            int r2 = r6.length
            if (r2 == r1) goto L20
        L3b:
            boolean r6 = r5.h(r7, r0, r8)
            goto L48
        L40:
            byte r7 = r6.f17899a
            byte[] r6 = r6.f17900b
            boolean r6 = r5.h(r7, r6, r8)
        L48:
            return r6
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.l.i(yb.b, byte, android.content.SharedPreferences$Editor):boolean");
    }

    public final tk.i<nj.k> j() {
        ql.b<Byte> bVar = this.f17932f;
        d dVar = new d(new t((byte) 122));
        bVar.getClass();
        return new fl.k(new fl.t(bVar, dVar).u(new c(new b())));
    }

    public final bl.h k(nj.e eVar) {
        gm.l.f(eVar, "config");
        if (!this.f17930d.g(279) && eVar.d(5) != this.f17929c.getBoolean("weather_switch2", false)) {
            this.f17929c.edit().putBoolean("weather_switch2", eVar.d(5)).apply();
        }
        return g((byte) 26, eVar);
    }
}
