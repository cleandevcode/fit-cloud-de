package ta;

import qa.w;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class e implements y {

    /* renamed from: a */
    public final sa.e f27857a;

    public e(sa.e eVar) {
        this.f27857a = eVar;
    }

    public static x b(sa.e eVar, qa.h hVar, xa.a aVar, ra.a aVar2) {
        qa.r rVar;
        qa.k kVar;
        x pVar;
        Object a10 = eVar.b(new xa.a(aVar2.value())).a();
        boolean nullSafe = aVar2.nullSafe();
        if (a10 instanceof x) {
            pVar = (x) a10;
        } else if (a10 instanceof y) {
            pVar = ((y) a10).a(hVar, aVar);
        } else {
            boolean z10 = a10 instanceof qa.r;
            if (!z10 && !(a10 instanceof qa.k)) {
                StringBuilder a11 = android.support.v4.media.d.a("Invalid attempt to bind an instance of ");
                a11.append(a10.getClass().getName());
                a11.append(" as a @JsonAdapter for ");
                a11.append(aVar.toString());
                a11.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(a11.toString());
            }
            if (z10) {
                rVar = (qa.r) a10;
            } else {
                rVar = null;
            }
            if (a10 instanceof qa.k) {
                kVar = (qa.k) a10;
            } else {
                kVar = null;
            }
            pVar = new p(rVar, kVar, hVar, aVar, nullSafe);
            nullSafe = false;
        }
        if (pVar != null && nullSafe) {
            return new w(pVar);
        }
        return pVar;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        ra.a aVar2 = (ra.a) aVar.f30456a.getAnnotation(ra.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f27857a, hVar, aVar, aVar2);
    }
}
