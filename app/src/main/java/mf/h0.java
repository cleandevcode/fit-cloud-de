package mf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import mf.t;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d */
    public static final ArrayList f20575d;

    /* renamed from: a */
    public final List<t.a> f20576a;

    /* renamed from: b */
    public final ThreadLocal<c> f20577b = new ThreadLocal<>();

    /* renamed from: c */
    public final LinkedHashMap f20578c = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final ArrayList f20579a = new ArrayList();

        /* renamed from: b */
        public int f20580b = 0;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:137:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x01a6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:190:0x00d5 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r6v18, types: [mf.b] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 547
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mf.h0.a.a(java.lang.Object):void");
        }

        public final void b(t.a aVar) {
            ArrayList arrayList = this.f20579a;
            int i10 = this.f20580b;
            this.f20580b = i10 + 1;
            arrayList.add(i10, aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends t<T> {

        /* renamed from: a */
        public final Type f20581a;

        /* renamed from: b */
        public final String f20582b;

        /* renamed from: c */
        public final Object f20583c;

        /* renamed from: d */
        public t<T> f20584d;

        public b(Type type, String str, Object obj) {
            this.f20581a = type;
            this.f20582b = str;
            this.f20583c = obj;
        }

        @Override // mf.t
        public final T b(y yVar) {
            t<T> tVar = this.f20584d;
            if (tVar != null) {
                return tVar.b(yVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // mf.t
        public final void f(e0 e0Var, T t10) {
            t<T> tVar = this.f20584d;
            if (tVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            tVar.f(e0Var, t10);
        }

        public final String toString() {
            t<T> tVar = this.f20584d;
            return tVar != null ? tVar.toString() : super.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        public final ArrayList f20585a = new ArrayList();

        /* renamed from: b */
        public final ArrayDeque f20586b = new ArrayDeque();

        /* renamed from: c */
        public boolean f20587c;

        public c() {
            h0.this = r1;
        }

        public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
            if (this.f20587c) {
                return illegalArgumentException;
            }
            this.f20587c = true;
            if (this.f20586b.size() == 1 && ((b) this.f20586b.getFirst()).f20582b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator descendingIterator = this.f20586b.descendingIterator();
            while (descendingIterator.hasNext()) {
                b bVar = (b) descendingIterator.next();
                sb2.append("\nfor ");
                sb2.append(bVar.f20581a);
                if (bVar.f20582b != null) {
                    sb2.append(' ');
                    sb2.append(bVar.f20582b);
                }
            }
            return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
        }

        public final void b(boolean z10) {
            this.f20586b.removeLast();
            if (!this.f20586b.isEmpty()) {
                return;
            }
            h0.this.f20577b.remove();
            if (z10) {
                synchronized (h0.this.f20578c) {
                    int size = this.f20585a.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        b bVar = (b) this.f20585a.get(i10);
                        t<T> tVar = (t) h0.this.f20578c.put(bVar.f20583c, bVar.f20584d);
                        if (tVar != 0) {
                            bVar.f20584d = tVar;
                            h0.this.f20578c.put(bVar.f20583c, tVar);
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f20575d = arrayList;
        arrayList.add(j0.f20595a);
        arrayList.add(l.f20622b);
        arrayList.add(g0.f20569c);
        arrayList.add(f.f20536c);
        arrayList.add(i0.f20592a);
        arrayList.add(k.f20615d);
    }

    public h0(a aVar) {
        int size = aVar.f20579a.size();
        ArrayList arrayList = f20575d;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(aVar.f20579a);
        arrayList2.addAll(arrayList);
        this.f20576a = Collections.unmodifiableList(arrayList2);
    }

    public final <T> t<T> a(Class<T> cls) {
        return c(cls, nf.b.f22339a, null);
    }

    public final <T> t<T> b(Type type) {
        return c(type, nf.b.f22339a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [mf.t<T>] */
    public final <T> t<T> c(Type type, Set<? extends Annotation> set, String str) {
        Object asList;
        b bVar;
        if (type != null) {
            if (set != null) {
                Type h10 = nf.b.h(nf.b.a(type));
                if (set.isEmpty()) {
                    asList = h10;
                } else {
                    asList = Arrays.asList(h10, set);
                }
                synchronized (this.f20578c) {
                    t<T> tVar = (t) this.f20578c.get(asList);
                    if (tVar != null) {
                        return tVar;
                    }
                    c cVar = this.f20577b.get();
                    if (cVar == null) {
                        cVar = new c();
                        this.f20577b.set(cVar);
                    }
                    int size = cVar.f20585a.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            bVar = (b) cVar.f20585a.get(i10);
                            if (bVar.f20583c.equals(asList)) {
                                cVar.f20586b.add(bVar);
                                t<T> tVar2 = bVar.f20584d;
                                if (tVar2 != 0) {
                                    bVar = tVar2;
                                }
                            } else {
                                i10++;
                            }
                        } else {
                            b bVar2 = new b(h10, str, asList);
                            cVar.f20585a.add(bVar2);
                            cVar.f20586b.add(bVar2);
                            bVar = null;
                            break;
                        }
                    }
                    try {
                        if (bVar != null) {
                            return bVar;
                        }
                        try {
                            int size2 = this.f20576a.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                t<T> tVar3 = (t<T>) this.f20576a.get(i11).a(h10, set, this);
                                if (tVar3 != null) {
                                    ((b) cVar.f20586b.getLast()).f20584d = tVar3;
                                    cVar.b(true);
                                    return tVar3;
                                }
                            }
                            throw new IllegalArgumentException("No JsonAdapter for " + nf.b.k(h10, set));
                        } catch (IllegalArgumentException e10) {
                            throw cVar.a(e10);
                        }
                    } finally {
                        cVar.b(false);
                    }
                }
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }

    public final <T> t<T> d(t.a aVar, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type h10 = nf.b.h(nf.b.a(type));
            int indexOf = this.f20576a.indexOf(aVar);
            if (indexOf != -1) {
                int size = this.f20576a.size();
                for (int i10 = indexOf + 1; i10 < size; i10++) {
                    t<T> tVar = (t<T>) this.f20576a.get(i10).a(h10, set, this);
                    if (tVar != null) {
                        return tVar;
                    }
                }
                StringBuilder a10 = android.support.v4.media.d.a("No next JsonAdapter for ");
                a10.append(nf.b.k(h10, set));
                throw new IllegalArgumentException(a10.toString());
            }
            throw new IllegalArgumentException("Unable to skip past unknown factory " + aVar);
        }
        throw new NullPointerException("annotations == null");
    }
}
