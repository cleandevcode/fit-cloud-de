package qa;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import ta.r;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final ThreadLocal<Map<xa.a<?>, a<?>>> f24651a;

    /* renamed from: b */
    public final ConcurrentHashMap f24652b;

    /* renamed from: c */
    public final sa.e f24653c;

    /* renamed from: d */
    public final ta.e f24654d;

    /* renamed from: e */
    public final List<y> f24655e;

    /* renamed from: f */
    public final Map<Type, i<?>> f24656f;

    /* renamed from: g */
    public final boolean f24657g;

    /* renamed from: h */
    public final List<y> f24658h;

    /* renamed from: i */
    public final List<y> f24659i;

    /* renamed from: j */
    public final List<t> f24660j;

    /* loaded from: classes.dex */
    public static class a<T> extends ta.o<T> {

        /* renamed from: a */
        public x<T> f24661a;

        @Override // qa.x
        public final T a(ya.a aVar) {
            x<T> xVar = this.f24661a;
            if (xVar != null) {
                return xVar.a(aVar);
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }

        @Override // qa.x
        public final void b(ya.b bVar, T t10) {
            x<T> xVar = this.f24661a;
            if (xVar != null) {
                xVar.b(bVar, t10);
                return;
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }

        @Override // ta.o
        public final x<T> c() {
            x<T> xVar = this.f24661a;
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }
    }

    public h() {
        sa.l lVar = sa.l.f26762f;
        Map<Type, i<?>> emptyMap = Collections.emptyMap();
        List<y> emptyList = Collections.emptyList();
        List<y> emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List<t> emptyList4 = Collections.emptyList();
        this.f24651a = new ThreadLocal<>();
        this.f24652b = new ConcurrentHashMap();
        this.f24656f = emptyMap;
        sa.e eVar = new sa.e(emptyMap, emptyList4);
        this.f24653c = eVar;
        this.f24657g = true;
        this.f24658h = emptyList;
        this.f24659i = emptyList2;
        this.f24660j = emptyList4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ta.r.A);
        arrayList.add(ta.l.f27878c);
        arrayList.add(lVar);
        arrayList.addAll(emptyList3);
        arrayList.add(ta.r.f27930p);
        arrayList.add(ta.r.f27921g);
        arrayList.add(ta.r.f27918d);
        arrayList.add(ta.r.f27919e);
        arrayList.add(ta.r.f27920f);
        r.b bVar = ta.r.f27925k;
        arrayList.add(new ta.t(Long.TYPE, Long.class, bVar));
        arrayList.add(new ta.t(Double.TYPE, Double.class, new d()));
        arrayList.add(new ta.t(Float.TYPE, Float.class, new e()));
        arrayList.add(ta.j.f27875b);
        arrayList.add(ta.r.f27922h);
        arrayList.add(ta.r.f27923i);
        arrayList.add(new ta.s(AtomicLong.class, new w(new f(bVar))));
        arrayList.add(new ta.s(AtomicLongArray.class, new w(new g(bVar))));
        arrayList.add(ta.r.f27924j);
        arrayList.add(ta.r.f27926l);
        arrayList.add(ta.r.f27931q);
        arrayList.add(ta.r.f27932r);
        arrayList.add(new ta.s(BigDecimal.class, ta.r.f27927m));
        arrayList.add(new ta.s(BigInteger.class, ta.r.f27928n));
        arrayList.add(new ta.s(sa.n.class, ta.r.f27929o));
        arrayList.add(ta.r.f27933s);
        arrayList.add(ta.r.f27934t);
        arrayList.add(ta.r.f27936v);
        arrayList.add(ta.r.f27937w);
        arrayList.add(ta.r.f27939y);
        arrayList.add(ta.r.f27935u);
        arrayList.add(ta.r.f27916b);
        arrayList.add(ta.c.f27855b);
        arrayList.add(ta.r.f27938x);
        if (wa.d.f29774a) {
            arrayList.add(wa.d.f29776c);
            arrayList.add(wa.d.f29775b);
            arrayList.add(wa.d.f29777d);
        }
        arrayList.add(ta.a.f27849c);
        arrayList.add(ta.r.f27915a);
        arrayList.add(new ta.b(eVar));
        arrayList.add(new ta.h(eVar));
        ta.e eVar2 = new ta.e(eVar);
        this.f24654d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(ta.r.B);
        arrayList.add(new ta.n(eVar, lVar, eVar2, emptyList4));
        this.f24655e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T b(java.lang.String r5, java.lang.Class<T> r6) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.h.b(java.lang.String, java.lang.Class):java.lang.Object");
    }

    public final <T> x<T> c(xa.a<T> aVar) {
        x<T> xVar = (x) this.f24652b.get(aVar);
        if (xVar != null) {
            return xVar;
        }
        Map<xa.a<?>, a<?>> map = this.f24651a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f24651a.set(map);
            z10 = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (y yVar : this.f24655e) {
                x<T> a10 = yVar.a(this, aVar);
                if (a10 != null) {
                    x<T> xVar2 = (x) this.f24652b.putIfAbsent(aVar, a10);
                    if (xVar2 != null) {
                        a10 = xVar2;
                    }
                    if (aVar3.f24661a == null) {
                        aVar3.f24661a = a10;
                        return a10;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f24651a.remove();
            }
        }
    }

    public final <T> x<T> d(y yVar, xa.a<T> aVar) {
        if (!this.f24655e.contains(yVar)) {
            yVar = this.f24654d;
        }
        boolean z10 = false;
        for (y yVar2 : this.f24655e) {
            if (z10) {
                x<T> a10 = yVar2.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (yVar2 == yVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final ya.b e(Writer writer) {
        ya.b bVar = new ya.b(writer);
        bVar.f31270f = this.f24657g;
        bVar.f31269e = false;
        bVar.f31272h = false;
        return bVar;
    }

    public final String f(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            g(obj, cls, e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public final void g(Object obj, Class cls, ya.b bVar) {
        x c10 = c(new xa.a(cls));
        boolean z10 = bVar.f31269e;
        bVar.f31269e = true;
        boolean z11 = bVar.f31270f;
        bVar.f31270f = this.f24657g;
        boolean z12 = bVar.f31272h;
        bVar.f31272h = false;
        try {
            try {
                try {
                    c10.b(bVar, obj);
                } catch (AssertionError e10) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e10.getMessage());
                    assertionError.initCause(e10);
                    throw assertionError;
                }
            } catch (IOException e11) {
                throw new m(e11);
            }
        } finally {
            bVar.f31269e = z10;
            bVar.f31270f = z11;
            bVar.f31272h = z12;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f24655e + ",instanceCreators:" + this.f24653c + "}";
    }
}
