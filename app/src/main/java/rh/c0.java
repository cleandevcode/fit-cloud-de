package rh;

import android.content.Context;
import android.media.SoundPool;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment;
import com.topstep.fitcloudpro.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000do.a;
import yk.a;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a */
    public final og.t f25672a;

    /* renamed from: b */
    public final a f25673b;

    /* renamed from: c */
    public al.j f25674c;

    /* renamed from: d */
    public al.j f25675d;

    /* renamed from: e */
    public al.j f25676e;

    /* renamed from: f */
    public volatile boolean f25677f;

    /* renamed from: g */
    public volatile EcgRecord f25678g;

    /* renamed from: h */
    public final SoundPool f25679h;

    /* renamed from: i */
    public int f25680i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i10);

        void b(EcgRecord ecgRecord);

        void c(int[] iArr);

        void d();

        void e(int i10, int i11, Date date);

        void f(Throwable th2);
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<uk.c, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            c0.this = r1;
        }

        @Override // fm.l
        public final tl.l k(uk.c cVar) {
            c0.this.f25673b.d();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<int[], tl.l> {

        /* renamed from: c */
        public final /* synthetic */ boolean f25683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10) {
            super(1);
            c0.this = r1;
            this.f25683c = z10;
        }

        @Override // fm.l
        public final tl.l k(int[] iArr) {
            ArrayList arrayList;
            int i10;
            String str;
            int[] iArr2 = iArr;
            EcgRecord ecgRecord = c0.this.f25678g;
            if (ecgRecord == null) {
                boolean z10 = true;
                z10 = (iArr2.length != 1 || iArr2[0] <= 0) ? false : false;
                UUID randomUUID = UUID.randomUUID();
                gm.l.e(randomUUID, "randomUUID()");
                Date date = new Date();
                boolean z11 = this.f25683c;
                if (z10) {
                    i10 = iArr2[0];
                } else {
                    i10 = 100;
                }
                wf.a value = c0.this.f25672a.x().getValue();
                if (value != null) {
                    str = value.f29802a;
                } else {
                    str = null;
                }
                EcgRecord ecgRecord2 = new EcgRecord(randomUUID, date, z11 ? 1 : 0, i10, EcgRecord.DEFAULT_SCALE_VALUE, str, new ArrayList(1000), null);
                c0.this.f25678g = ecgRecord2;
                c0.this.f25673b.e(ecgRecord2.getType(), ecgRecord2.getSampleBase(), ecgRecord2.getTime());
                c0 c0Var = c0.this;
                c0Var.getClass();
                c0Var.f25675d = tk.i.s(31L, 1L, TimeUnit.SECONDS).w(sk.c.a()).y(new y(0, new d0(c0Var)), new z(0, e0.f25689b), new a0(0, c0Var));
                c0Var.f25676e = tk.i.s(10000L, 750L, TimeUnit.MILLISECONDS).w(sk.c.a()).y(new ph.o(2, new f0(c0Var)), new b0(0, g0.f25692b), yk.a.f31788c);
                if (!z10) {
                    List<Integer> detail = ecgRecord2.getDetail();
                    gm.l.d(detail, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
                    arrayList = (ArrayList) detail;
                }
                return tl.l.f28297a;
            }
            List<Integer> detail2 = ecgRecord.getDetail();
            gm.l.d(detail2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
            arrayList = (ArrayList) detail2;
            gm.l.e(iArr2, "array");
            arrayList.addAll(ul.i.F(iArr2));
            c0.this.f25673b.c(iArr2);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Throwable, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            c0.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            Throwable th3 = th2;
            a aVar = c0.this.f25673b;
            gm.l.e(th3, "it");
            aVar.f(th3);
            a.b bVar = p000do.a.f13275a;
            bVar.t("EcgTestHelper");
            bVar.q(th3);
            return tl.l.f28297a;
        }
    }

    public c0(Context context, og.t tVar, EcgFragment.b bVar) {
        gm.l.f(bVar, "listener");
        this.f25672a = tVar;
        this.f25673b = bVar;
        SoundPool build = new SoundPool.Builder().setMaxStreams(1).build();
        this.f25679h = build;
        this.f25680i = build.load(context, R.raw.ecg, 1);
    }

    public final void a() {
        tk.i i10;
        if (this.f25677f) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("EcgTestHelper");
            bVar.p("start again!!!", new Object[0]);
        } else {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("EcgTestHelper");
            bVar2.h("start", new Object[0]);
        }
        al.j jVar = this.f25674c;
        if (jVar != null) {
            xk.b.a(jVar);
        }
        al.j jVar2 = this.f25675d;
        if (jVar2 != null) {
            xk.b.a(jVar2);
        }
        al.j jVar3 = this.f25676e;
        if (jVar3 != null) {
            xk.b.a(jVar3);
        }
        this.f25677f = true;
        this.f25678g = null;
        boolean g10 = this.f25672a.D().c().g(272);
        jj.d0 d0Var = (jj.d0) this.f25672a.f();
        if (d0Var.f17884d) {
            i10 = tk.i.m(new yi.g());
        } else {
            i10 = ((wi.k) d0Var.f17881a).i(new wj.e());
        }
        fl.k0 w10 = i10.w(sk.c.a());
        ph.o oVar = new ph.o(1, new b());
        a.c cVar = yk.a.f31788c;
        fl.n nVar = new fl.n(w10, oVar, cVar);
        oc.n nVar2 = new oc.n(1, this);
        a.d dVar = yk.a.f31789d;
        this.f25674c = nVar.k(dVar, dVar, cVar, nVar2).y(new ph.q(1, new c(g10)), new ph.k(2, new d()), cVar);
    }

    public final void b() {
        List<Integer> detail;
        if (!this.f25677f) {
            return;
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("EcgTestHelper");
        boolean z10 = false;
        bVar.h("stop", new Object[0]);
        EcgRecord ecgRecord = this.f25678g;
        al.j jVar = this.f25674c;
        if (jVar != null) {
            xk.b.a(jVar);
        }
        al.j jVar2 = this.f25675d;
        if (jVar2 != null) {
            xk.b.a(jVar2);
        }
        al.j jVar3 = this.f25676e;
        if (jVar3 != null) {
            xk.b.a(jVar3);
        }
        this.f25677f = false;
        this.f25678g = null;
        if (ecgRecord != null && (detail = ecgRecord.getDetail()) != null && (!detail.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            this.f25673b.b(ecgRecord);
        } else {
            this.f25673b.b(null);
        }
    }
}
