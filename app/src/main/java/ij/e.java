package ij;

import ij.c;
import java.io.File;
import kl.e;

/* loaded from: classes2.dex */
public final class e extends gm.m implements fm.l<gj.g<File>, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ c f17051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(1);
        this.f17051b = cVar;
    }

    @Override // fm.l
    public final Boolean k(gj.g<File> gVar) {
        boolean z10;
        int i10;
        gj.g<File> gVar2 = gVar;
        Object obj = this.f17051b.f17042i.f24950a.get();
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
        if (i10 == 2) {
            this.f17051b.f17042i.b(new c.a(2, gVar2.f15373a));
        }
        if (gVar2.f15373a != 100) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
