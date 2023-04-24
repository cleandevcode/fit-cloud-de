package i4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class n implements t {
    @Override // i4.t
    public final int b() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, e4.f] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        int i10;
        h4.e eVar = (h4.e) aVar.f15774f;
        String n02 = eVar.n0(aVar.f15770b);
        eVar.nextToken();
        int i11 = eVar.f15815a;
        if (i11 == 25) {
            String n03 = eVar.n0(aVar.f15770b);
            n02 = a.b.b(n02, ".") + n03;
            eVar.nextToken();
            i11 = eVar.f15815a;
        }
        ?? r12 = (T) new e4.f(n02);
        if (i11 == 10) {
            do {
                eVar.nextToken();
                r12.f13354b.add(aVar.E(null));
                i10 = eVar.f15815a;
            } while (i10 == 16);
            if (i10 == 11) {
                eVar.nextToken();
                if (eVar.f15815a == 24) {
                    eVar.nextToken();
                }
                return r12;
            }
            StringBuilder a10 = android.support.v4.media.d.a("illegal jsonp : ");
            a10.append(eVar.h());
            throw new e4.d(a10.toString());
        }
        StringBuilder a11 = android.support.v4.media.d.a("illegal jsonp : ");
        a11.append(eVar.h());
        throw new e4.d(a11.toString());
    }
}
