package gn;

import gm.a0;
import gn.f;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class j extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f.d f15604e;

    /* renamed from: f */
    public final /* synthetic */ boolean f15605f = false;

    /* renamed from: g */
    public final /* synthetic */ w f15606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, f.d dVar, w wVar) {
        super(str, true);
        this.f15604e = dVar;
        this.f15606g = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [gn.w, T] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // cn.a
    public final long a() {
        int i10;
        ?? r22;
        boolean z10;
        long a10;
        T t10;
        f.d dVar = this.f15604e;
        boolean z11 = this.f15605f;
        w wVar = this.f15606g;
        dVar.getClass();
        gm.l.f(wVar, "settings");
        a0 a0Var = new a0();
        a0 a0Var2 = new a0();
        synchronized (f.this.f15574y) {
            synchronized (f.this) {
                w wVar2 = f.this.f15568s;
                if (z11) {
                    r22 = wVar;
                } else {
                    w wVar3 = new w();
                    gm.l.f(wVar2, "other");
                    int i11 = 0;
                    while (true) {
                        boolean z12 = true;
                        if (i11 >= 10) {
                            break;
                        }
                        if (((1 << i11) & wVar2.f15678a) == 0) {
                            z12 = false;
                        }
                        if (z12) {
                            wVar3.b(i11, wVar2.f15679b[i11]);
                        }
                        i11++;
                    }
                    for (int i12 = 0; i12 < 10; i12++) {
                        if (((1 << i12) & wVar.f15678a) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            wVar3.b(i12, wVar.f15679b[i12]);
                        }
                    }
                    tl.l lVar = tl.l.f28297a;
                    r22 = wVar3;
                }
                a0Var2.f15485a = r22;
                a10 = r22.a() - wVar2.a();
                if (a10 != 0 && !f.this.f15552c.isEmpty()) {
                    Object[] array = f.this.f15552c.values().toArray(new r[0]);
                    if (array != null) {
                        t10 = (r[]) array;
                        a0Var.f15485a = t10;
                        f fVar = f.this;
                        w wVar4 = (w) a0Var2.f15485a;
                        fVar.getClass();
                        gm.l.f(wVar4, "<set-?>");
                        fVar.f15568s = wVar4;
                        f.this.f15560k.c(new g(f.this.f15553d + " onSettings", dVar, a0Var2), 0L);
                        tl.l lVar2 = tl.l.f28297a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                t10 = 0;
                a0Var.f15485a = t10;
                f fVar2 = f.this;
                w wVar42 = (w) a0Var2.f15485a;
                fVar2.getClass();
                gm.l.f(wVar42, "<set-?>");
                fVar2.f15568s = wVar42;
                f.this.f15560k.c(new g(f.this.f15553d + " onSettings", dVar, a0Var2), 0L);
                tl.l lVar22 = tl.l.f28297a;
            }
            try {
                f.this.f15574y.a((w) a0Var2.f15485a);
            } catch (IOException e10) {
                f.this.b(e10);
            }
            tl.l lVar3 = tl.l.f28297a;
        }
        r[] rVarArr = (r[]) a0Var.f15485a;
        if (rVarArr != null) {
            for (r rVar : rVarArr) {
                synchronized (rVar) {
                    rVar.f15643d += a10;
                    if (a10 > 0) {
                        rVar.notifyAll();
                    }
                    tl.l lVar4 = tl.l.f28297a;
                }
            }
            return -1L;
        }
        return -1L;
    }
}
