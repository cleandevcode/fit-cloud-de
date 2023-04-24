package g1;

import g1.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements j1.a<k.a> {

    /* renamed from: a */
    public final /* synthetic */ String f14823a;

    public j(String str) {
        this.f14823a = str;
    }

    @Override // j1.a
    public final void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.f14826c) {
            o0.h<String, ArrayList<j1.a<k.a>>> hVar = k.f14827d;
            ArrayList<j1.a<k.a>> orDefault = hVar.getOrDefault(this.f14823a, null);
            if (orDefault != null) {
                hVar.remove(this.f14823a);
                for (int i10 = 0; i10 < orDefault.size(); i10++) {
                    orDefault.get(i10).accept(aVar2);
                }
            }
        }
    }
}
