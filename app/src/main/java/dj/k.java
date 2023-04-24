package dj;

import dj.b;
import dj.f;
import fm.l;
import gm.m;
import kc.w0;

/* loaded from: classes2.dex */
public final class k extends m implements l<f.b, a> {

    /* renamed from: b */
    public final /* synthetic */ f f13125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar) {
        super(1);
        this.f13125b = fVar;
    }

    @Override // fm.l
    public final a k(f.b bVar) {
        String str;
        boolean z10;
        f.b bVar2 = bVar;
        w0 w0Var = bVar2.f13117a.f28668a;
        gm.l.e(w0Var, "it.result.bleDevice");
        String c10 = bVar2.f13117a.f28668a.c();
        gm.l.e(c10, "it.result.bleDevice.macAddress");
        if (this.f13125b.f13112f != null) {
            String str2 = bVar2.f13118b;
            if (str2 != null && str2.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                b.c cVar = this.f13125b.f13112f;
                String str3 = bVar2.f13118b;
                int i10 = bVar2.f13119c;
                ((hj.d) cVar).getClass();
                gm.l.f(str3, "name");
                if (i10 == 21576 && om.h.a0(str3, "H", true)) {
                    str3 = str3.substring(1);
                    gm.l.e(str3, "this as java.lang.String).substring(startIndex)");
                }
                str = str3;
                uc.e eVar = bVar2.f13117a;
                return new a(w0Var, c10, str, eVar.f28669b, eVar.f28672e);
            }
        }
        str = bVar2.f13118b;
        uc.e eVar2 = bVar2.f13117a;
        return new a(w0Var, c10, str, eVar2.f28669b, eVar2.f28672e);
    }
}
