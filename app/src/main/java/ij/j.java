package ij;

import ij.c;
import kl.e;

/* loaded from: classes2.dex */
public final class j extends gm.m implements fm.l<gj.g<Boolean>, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ c f17061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super(1);
        this.f17061b = cVar;
    }

    @Override // fm.l
    public final Boolean k(gj.g<Boolean> gVar) {
        boolean z10;
        int i10;
        gj.g<Boolean> gVar2 = gVar;
        Object obj = this.f17061b.f17042i.f24950a.get();
        boolean z11 = true;
        if (obj == kl.e.f18621a) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.a aVar = (c.a) ((z10 || (obj instanceof e.b)) ? null : null);
        if (aVar != null) {
            i10 = aVar.f17044a;
        } else {
            i10 = 0;
        }
        if (i10 == 5) {
            this.f17061b.f17042i.b(new c.a(5, gVar2.f15373a));
        }
        return Boolean.valueOf((gVar2.f15373a == 100 && gm.l.a(gVar2.f15374b, Boolean.TRUE)) ? false : false);
    }
}
