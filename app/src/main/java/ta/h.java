package ta;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import qa.x;
import qa.y;

/* loaded from: classes.dex */
public final class h implements y {

    /* renamed from: a */
    public final sa.e f27868a;

    /* renamed from: b */
    public final boolean f27869b = false;

    /* loaded from: classes.dex */
    public final class a<K, V> extends x<Map<K, V>> {

        /* renamed from: a */
        public final q f27870a;

        /* renamed from: b */
        public final q f27871b;

        /* renamed from: c */
        public final sa.p<? extends Map<K, V>> f27872c;

        public a(qa.h hVar, Type type, x<K> xVar, Type type2, x<V> xVar2, sa.p<? extends Map<K, V>> pVar) {
            h.this = r1;
            this.f27870a = new q(hVar, xVar, type);
            this.f27871b = new q(hVar, xVar2, type2);
            this.f27872c = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qa.x
        public final Object a(ya.a aVar) {
            int h02 = aVar.h0();
            if (h02 == 9) {
                aVar.X();
                return null;
            }
            Map map = (Map) ((Map<K, V>) this.f27872c.a());
            if (h02 == 1) {
                aVar.a();
                while (aVar.D()) {
                    aVar.a();
                    Object a10 = this.f27870a.a(aVar);
                    if (map.put(a10, this.f27871b.a(aVar)) == null) {
                        aVar.k();
                    } else {
                        throw new qa.s(g4.g.a("duplicate key: ", a10));
                    }
                }
                aVar.k();
            } else {
                aVar.b();
                while (aVar.D()) {
                    yb.y.f31419b.C(aVar);
                    Object a11 = this.f27870a.a(aVar);
                    if (map.put(a11, this.f27871b.a(aVar)) != null) {
                        throw new qa.s(g4.g.a("duplicate key: ", a11));
                    }
                }
                aVar.q();
            }
            return map;
        }

        @Override // qa.x
        public final void b(ya.b bVar, Object obj) {
            String str;
            boolean z10;
            Map map = (Map) obj;
            if (map == null) {
                bVar.y();
                return;
            }
            if (!h.this.f27869b) {
                bVar.h();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.s(String.valueOf(entry.getKey()));
                    this.f27871b.b(bVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z11 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    q qVar = this.f27870a;
                    K key = entry2.getKey();
                    qVar.getClass();
                    try {
                        g gVar = new g();
                        qVar.b(gVar, key);
                        if (gVar.f27865l.isEmpty()) {
                            qa.l lVar = gVar.f27867n;
                            arrayList.add(lVar);
                            arrayList2.add(entry2.getValue());
                            lVar.getClass();
                            if (!(lVar instanceof qa.j) && !(lVar instanceof qa.o)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            z11 |= z10;
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + gVar.f27865l);
                        }
                    } catch (IOException e10) {
                        throw new qa.m(e10);
                    }
                }
                if (z11) {
                    bVar.b();
                    int size = arrayList.size();
                    while (i10 < size) {
                        bVar.b();
                        r.f27940z.b(bVar, (qa.l) arrayList.get(i10));
                        this.f27871b.b(bVar, arrayList2.get(i10));
                        bVar.k();
                        i10++;
                    }
                    bVar.k();
                    return;
                }
                bVar.h();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    qa.l lVar2 = (qa.l) arrayList.get(i10);
                    lVar2.getClass();
                    if (lVar2 instanceof qa.q) {
                        qa.q b10 = lVar2.b();
                        Serializable serializable = b10.f24665a;
                        if (serializable instanceof Number) {
                            str = String.valueOf(b10.f());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(b10.e());
                        } else if (serializable instanceof String) {
                            str = b10.i();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (lVar2 instanceof qa.n) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    bVar.s(str);
                    this.f27871b.b(bVar, arrayList2.get(i10));
                    i10++;
                }
            }
            bVar.q();
        }
    }

    public h(sa.e eVar) {
        this.f27868a = eVar;
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        Type[] actualTypeArguments;
        x<T> xVar;
        Type type = aVar.f30457b;
        Class<? super T> cls = aVar.f30456a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type g10 = sa.a.g(type, cls, Map.class);
            actualTypeArguments = g10 instanceof ParameterizedType ? ((ParameterizedType) g10).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            xVar = hVar.c(new xa.a<>(type2));
        } else {
            xVar = r.f27917c;
        }
        return new a(hVar, actualTypeArguments[0], xVar, actualTypeArguments[1], hVar.c(new xa.a<>(actualTypeArguments[1])), this.f27868a.b(aVar));
    }
}
