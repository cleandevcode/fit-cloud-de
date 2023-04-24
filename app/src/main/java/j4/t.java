package j4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class t implements t0, i4.t {

    /* renamed from: a */
    public static final t f17467a = new t();

    @Override // i4.t
    public final int b() {
        return 14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.util.Collection, e4.b] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        T t10;
        Class<?> cls;
        Class<Object> cls2 = Object.class;
        if (aVar.f15774f.h0() == 8) {
            aVar.f15774f.J(16);
            return null;
        } else if (type == e4.b.class) {
            ?? r72 = (T) new e4.b();
            aVar.I(r72, null);
            return r72;
        } else {
            if (aVar.f15774f.h0() == 21) {
                aVar.f15774f.nextToken();
                Class<?> P = n4.n.P(type);
                if (P != AbstractCollection.class && P != Collection.class) {
                    if (P.isAssignableFrom(HashSet.class)) {
                        t10 = (T) new HashSet();
                    } else if (P.isAssignableFrom(LinkedHashSet.class)) {
                        t10 = (T) new LinkedHashSet();
                    } else if (P.isAssignableFrom(TreeSet.class)) {
                        t10 = (T) new TreeSet();
                    } else if (P.isAssignableFrom(EnumSet.class)) {
                        Class<Object> cls3 = cls2;
                        if (type instanceof ParameterizedType) {
                            cls3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                        }
                        t10 = (T) EnumSet.noneOf(cls3);
                    } else {
                        try {
                            t10 = (T) ((Set) P.newInstance());
                        } catch (Exception unused) {
                            throw new e4.d(k.f.a(P, android.support.v4.media.d.a("create instance error, class ")));
                        }
                    }
                } else {
                    t10 = (T) new HashSet();
                }
            } else {
                Class<?> P2 = n4.n.P(type);
                if (P2 != AbstractCollection.class && P2 != Collection.class) {
                    if (P2.isAssignableFrom(HashSet.class)) {
                        t10 = (T) new HashSet();
                    } else if (P2.isAssignableFrom(LinkedHashSet.class)) {
                        t10 = (T) new LinkedHashSet();
                    } else if (P2.isAssignableFrom(TreeSet.class)) {
                        t10 = (T) new TreeSet();
                    } else if (P2.isAssignableFrom(ArrayList.class)) {
                        t10 = (T) new ArrayList();
                    } else if (P2.isAssignableFrom(EnumSet.class)) {
                        Class<Object> cls4 = cls2;
                        if (type instanceof ParameterizedType) {
                            cls4 = ((ParameterizedType) type).getActualTypeArguments()[0];
                        }
                        t10 = (T) EnumSet.noneOf(cls4);
                    } else if (!P2.isAssignableFrom(Queue.class) && ((cls = n4.n.L) == null || !P2.isAssignableFrom(cls))) {
                        try {
                            t10 = (T) ((Collection) P2.newInstance());
                        } catch (Exception unused2) {
                            throw new e4.d(k.f.a(P2, android.support.v4.media.d.a("create instance error, class ")));
                        }
                    } else {
                        t10 = (T) new LinkedList();
                    }
                } else {
                    t10 = (T) new ArrayList();
                }
            }
            aVar.F(n4.n.F(type), (Collection) t10, obj);
            return t10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0021, code lost:
        if (r3 != false) goto L61;
     */
    @Override // j4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(j4.i0 r15, java.lang.Object r16, java.lang.Object r17, java.lang.reflect.Type r18, int r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.t.e(j4.i0, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int):void");
    }
}
