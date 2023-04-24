package ui;

import fm.l;
import java.util.concurrent.atomic.AtomicInteger;
import wi.k;
import wk.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: a */
    public final /* synthetic */ int f28822a;

    /* renamed from: b */
    public final /* synthetic */ l f28823b;

    public /* synthetic */ a(int i10, l lVar) {
        this.f28822a = i10;
        this.f28823b = lVar;
    }

    @Override // wk.f
    public final boolean test(Object obj) {
        switch (this.f28822a) {
            case 0:
                l lVar = this.f28823b;
                gm.l.f(lVar, "$tmp0");
                return ((Boolean) lVar.k(obj)).booleanValue();
            case 1:
                l lVar2 = this.f28823b;
                AtomicInteger atomicInteger = k.E;
                gm.l.f(lVar2, "$tmp0");
                return ((Boolean) lVar2.k(obj)).booleanValue();
            default:
                l lVar3 = this.f28823b;
                gm.l.f(lVar3, "$tmp0");
                return ((Boolean) lVar3.k(obj)).booleanValue();
        }
    }
}
