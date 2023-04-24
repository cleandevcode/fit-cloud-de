package x8;

import android.location.Location;
import java.lang.reflect.Field;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements g9.a, za.f {

    /* renamed from: a */
    public final /* synthetic */ int f30402a;

    /* renamed from: b */
    public final Object f30403b;

    public d() {
        this.f30402a = 2;
        this.f30403b = new eb.j();
    }

    @Override // g9.a
    public final void a(g9.t tVar) {
        Exception exc;
        g9.h hVar = (g9.h) this.f30403b;
        g8.a aVar = h.f30418k;
        if (tVar.b()) {
            Location location = (Location) tVar.a();
            g9.t tVar2 = hVar.f15034a;
            synchronized (tVar2.f15057a) {
                if (!tVar2.f15059c) {
                    tVar2.f15059c = true;
                    tVar2.f15061e = location;
                    tVar2.f15058b.b(tVar2);
                }
            }
            return;
        }
        synchronized (tVar.f15057a) {
            exc = tVar.f15062f;
        }
        exc.getClass();
        hVar.b(exc);
    }

    @Override // za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.UPC_A) {
            return ((eb.j) this.f30403b).d("0".concat(String.valueOf(str)), za.a.EAN_13, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    public final String toString() {
        switch (this.f30402a) {
            case 1:
                return ((Field) this.f30403b).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(g9.h hVar) {
        this.f30402a = 0;
        this.f30403b = hVar;
    }
}
