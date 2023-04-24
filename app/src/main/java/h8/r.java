package h8;

import android.os.Build;
import com.google.android.gms.location.LocationRequest;
import g8.a;
import h8.h;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class r implements g9.c, m {

    /* renamed from: a */
    public final /* synthetic */ int f16014a;

    /* renamed from: b */
    public Object f16015b;

    /* renamed from: c */
    public Object f16016c;

    public r() {
        this.f16014a = 2;
        this.f16016c = new ConcurrentHashMap(16);
    }

    @Override // h8.m
    public final void a(a.e eVar, Object obj) {
        boolean z10;
        boolean z11;
        g9.f cVar;
        a9.a aVar = (a9.a) this.f16015b;
        w.e eVar2 = (w.e) this.f16016c;
        x8.u uVar = (x8.u) eVar;
        g9.h hVar = (g9.h) obj;
        g8.a aVar2 = x8.h.f30418k;
        uVar.getClass();
        if (uVar.D(a9.h.f430a)) {
            i8.k N = ((x8.q0) uVar.u()).N(aVar, new x8.l(hVar));
            if (eVar2 != null) {
                cVar = new x2.i(3, N);
            } else {
                return;
            }
        } else {
            h hVar2 = new h(new x8.j(uVar, hVar));
            h.a aVar3 = hVar2.f15958c;
            aVar3.getClass();
            m2.l lVar = new m2.l(hVar2, hVar);
            g9.h hVar3 = new g9.h();
            LocationRequest.a aVar4 = new LocationRequest.a(aVar.f413c, 0L);
            aVar4.f6115c = 0L;
            long j10 = aVar.f414d;
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i8.p.a("durationMillis must be greater than 0", z10);
            aVar4.f6117e = j10;
            aVar4.b(aVar.f412b);
            long j11 = aVar.f411a;
            if (j11 != -1 && j11 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            i8.p.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z11);
            aVar4.f6121i = j11;
            aVar4.f6125m = aVar.f415e;
            aVar4.c(aVar.f416f);
            aVar4.f6120h = true;
            String str = aVar.f417g;
            if (Build.VERSION.SDK_INT < 30) {
                aVar4.f6124l = str;
            }
            aVar4.f6126n = aVar.f418h;
            uVar.E(lVar, aVar4.a(), hVar3);
            g9.t tVar = hVar3.f15034a;
            p5.e eVar3 = new p5.e(hVar);
            tVar.getClass();
            tVar.f15058b.a(new g9.m(g9.i.f15035a, eVar3));
            tVar.e();
            if (eVar2 != null) {
                cVar = new w.c(uVar, aVar3);
            } else {
                return;
            }
        }
        eVar2.d(cVar);
    }

    public final String b() {
        switch (this.f16014a) {
            case 2:
                return (String) this.f16015b;
            default:
                return (String) this.f16016c;
        }
    }

    @Override // g9.c
    public final void d(g9.t tVar) {
        ((s) this.f16016c).f16019b.remove((g9.h) this.f16015b);
    }

    public r(s sVar, g9.h hVar) {
        this.f16014a = 0;
        this.f16016c = sVar;
        this.f16015b = hVar;
    }

    public /* synthetic */ r(Object obj, Object obj2, int i10) {
        this.f16014a = i10;
        this.f16015b = obj;
        this.f16016c = obj2;
    }
}
