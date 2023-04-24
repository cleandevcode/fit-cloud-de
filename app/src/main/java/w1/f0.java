package w1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w1.y;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a */
    public static final a f29560a = new a();

    /* renamed from: b */
    public static final b f29561b = new b();

    /* loaded from: classes.dex */
    public static final class a extends f0 {

        /* renamed from: c */
        public static final Class<?> f29562c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(Object obj, int i10, long j10) {
            y.c c10;
            d0 d0Var;
            List list = (List) n1.n(j10, obj);
            if (list.isEmpty()) {
                if (list instanceof e0) {
                    list = new d0(i10);
                } else if ((list instanceof y0) && (list instanceof y.c)) {
                    c10 = ((y.c) list).c(i10);
                    list = c10;
                } else {
                    list = new ArrayList(i10);
                }
                n1.u(j10, obj, list);
            } else {
                if (f29562c.isAssignableFrom(list.getClass())) {
                    ArrayList arrayList = new ArrayList(list.size() + i10);
                    arrayList.addAll(list);
                    d0Var = arrayList;
                } else if (list instanceof m1) {
                    d0 d0Var2 = new d0(list.size() + i10);
                    d0Var2.addAll((m1) list);
                    d0Var = d0Var2;
                } else if ((list instanceof y0) && (list instanceof y.c)) {
                    y.c cVar = (y.c) list;
                    if (!cVar.m()) {
                        c10 = cVar.c(list.size() + i10);
                        list = c10;
                        n1.u(j10, obj, list);
                    }
                }
                list = d0Var;
                n1.u(j10, obj, list);
            }
            return list;
        }

        @Override // w1.f0
        public final void a(long j10, Object obj) {
            Object unmodifiableList;
            List list = (List) n1.n(j10, obj);
            if (list instanceof e0) {
                unmodifiableList = ((e0) list).h();
            } else if (f29562c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof y0) && (list instanceof y.c)) {
                    y.c cVar = (y.c) list;
                    if (cVar.m()) {
                        cVar.a();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            n1.u(j10, obj, unmodifiableList);
        }

        @Override // w1.f0
        public final void b(long j10, Object obj, Object obj2) {
            List list = (List) n1.n(j10, obj2);
            List d10 = d(obj, list.size(), j10);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            n1.u(j10, obj, list);
        }

        @Override // w1.f0
        public final List c(long j10, Object obj) {
            return d(obj, 10, j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f0 {
        @Override // w1.f0
        public final void a(long j10, Object obj) {
            ((y.c) n1.n(j10, obj)).a();
        }

        @Override // w1.f0
        public final void b(long j10, Object obj, Object obj2) {
            y.c cVar = (y.c) n1.n(j10, obj);
            y.c cVar2 = (y.c) n1.n(j10, obj2);
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.m()) {
                    cVar = cVar.c(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            if (size > 0) {
                cVar2 = cVar;
            }
            n1.u(j10, obj, cVar2);
        }

        @Override // w1.f0
        public final List c(long j10, Object obj) {
            int i10;
            y.c cVar = (y.c) n1.n(j10, obj);
            if (!cVar.m()) {
                int size = cVar.size();
                if (size == 0) {
                    i10 = 10;
                } else {
                    i10 = size * 2;
                }
                y.c c10 = cVar.c(i10);
                n1.u(j10, obj, c10);
                return c10;
            }
            return cVar;
        }
    }

    public abstract void a(long j10, Object obj);

    public abstract void b(long j10, Object obj, Object obj2);

    public abstract List c(long j10, Object obj);
}
