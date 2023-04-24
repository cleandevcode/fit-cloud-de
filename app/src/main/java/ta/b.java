package ta;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: a */
    public final sa.e f27852a;

    /* loaded from: classes.dex */
    public static final class a<E> extends x<Collection<E>> {

        /* renamed from: a */
        public final q f27853a;

        /* renamed from: b */
        public final sa.p<? extends Collection<E>> f27854b;

        public a(qa.h hVar, Type type, x<E> xVar, sa.p<? extends Collection<E>> pVar) {
            this.f27853a = new q(hVar, xVar, type);
            this.f27854b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qa.x
        public final Object a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            Collection collection = (Collection) ((Collection<E>) this.f27854b.a());
            aVar.a();
            while (aVar.D()) {
                collection.add(this.f27853a.a(aVar));
            }
            aVar.k();
            return collection;
        }

        @Override // qa.x
        public final void b(ya.b bVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                bVar.y();
                return;
            }
            bVar.b();
            for (E e10 : collection) {
                this.f27853a.b(bVar, e10);
            }
            bVar.k();
        }
    }

    public b(sa.e eVar) {
        this.f27852a = eVar;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        Type type;
        Type type2 = aVar.f30457b;
        Class<? super T> cls = aVar.f30456a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type g10 = sa.a.g(type2, cls, Collection.class);
        if (g10 instanceof ParameterizedType) {
            type = ((ParameterizedType) g10).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(hVar, type, hVar.c(new xa.a<>(type)), this.f27852a.b(aVar));
    }
}
