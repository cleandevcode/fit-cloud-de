package xl;

import fm.p;
import gm.l;
import gm.m;
import xl.e;

/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: xl.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C0563a extends m implements p<f, b, f> {

            /* renamed from: b */
            public static final C0563a f30631b = new C0563a();

            public C0563a() {
                super(2);
            }

            @Override // fm.p
            public final f A(f fVar, b bVar) {
                xl.c cVar;
                f fVar2 = fVar;
                b bVar2 = bVar;
                l.f(fVar2, "acc");
                l.f(bVar2, "element");
                f y10 = fVar2.y(bVar2.getKey());
                g gVar = g.f30632a;
                if (y10 == gVar) {
                    return bVar2;
                }
                int i10 = e.f30629b0;
                e.a aVar = e.a.f30630a;
                e eVar = (e) y10.b(aVar);
                if (eVar == null) {
                    cVar = new xl.c(bVar2, y10);
                } else {
                    f y11 = y10.y(aVar);
                    if (y11 == gVar) {
                        return new xl.c(eVar, bVar2);
                    }
                    cVar = new xl.c(eVar, new xl.c(bVar2, y11));
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            l.f(fVar2, "context");
            return fVar2 == g.f30632a ? fVar : (f) fVar2.Z(fVar, C0563a.f30631b);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends f {

        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                l.f(cVar, "key");
                if (l.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                l.f(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? g.f30632a : bVar;
            }
        }

        @Override // xl.f
        <E extends b> E b(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    <R> R Z(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E b(c<E> cVar);

    f s(f fVar);

    f y(c<?> cVar);
}
