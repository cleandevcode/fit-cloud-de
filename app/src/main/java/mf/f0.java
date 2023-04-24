package mf;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class f0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i */
    public static final a f20539i = new a();

    /* renamed from: g */
    public f0<K, V>.c f20546g;

    /* renamed from: h */
    public f0<K, V>.d f20547h;

    /* renamed from: d */
    public int f20543d = 0;

    /* renamed from: e */
    public int f20544e = 0;

    /* renamed from: a */
    public final Comparator<? super K> f20540a = f20539i;

    /* renamed from: c */
    public final f<K, V> f20542c = new f<>();

    /* renamed from: b */
    public f<K, V>[] f20541b = new f[16];

    /* renamed from: f */
    public int f20545f = 12;

    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a */
        public f<K, V> f20548a;

        /* renamed from: b */
        public int f20549b;

        /* renamed from: c */
        public int f20550c;

        /* renamed from: d */
        public int f20551d;

        public final void a(f<K, V> fVar) {
            fVar.f20560c = null;
            fVar.f20558a = null;
            fVar.f20559b = null;
            fVar.f20566i = 1;
            int i10 = this.f20549b;
            if (i10 > 0) {
                int i11 = this.f20551d;
                if ((i11 & 1) == 0) {
                    this.f20551d = i11 + 1;
                    this.f20549b = i10 - 1;
                    this.f20550c++;
                }
            }
            fVar.f20558a = this.f20548a;
            this.f20548a = fVar;
            int i12 = this.f20551d + 1;
            this.f20551d = i12;
            int i13 = this.f20549b;
            if (i13 > 0 && (i12 & 1) == 0) {
                this.f20551d = i12 + 1;
                this.f20549b = i13 - 1;
                this.f20550c++;
            }
            int i14 = 4;
            while (true) {
                int i15 = i14 - 1;
                if ((this.f20551d & i15) != i15) {
                    return;
                }
                int i16 = this.f20550c;
                if (i16 == 0) {
                    f<K, V> fVar2 = this.f20548a;
                    f<K, V> fVar3 = fVar2.f20558a;
                    f<K, V> fVar4 = fVar3.f20558a;
                    fVar3.f20558a = fVar4.f20558a;
                    this.f20548a = fVar3;
                    fVar3.f20559b = fVar4;
                    fVar3.f20560c = fVar2;
                    fVar3.f20566i = fVar2.f20566i + 1;
                    fVar4.f20558a = fVar3;
                    fVar2.f20558a = fVar3;
                } else {
                    if (i16 == 1) {
                        f<K, V> fVar5 = this.f20548a;
                        f<K, V> fVar6 = fVar5.f20558a;
                        this.f20548a = fVar6;
                        fVar6.f20560c = fVar5;
                        fVar6.f20566i = fVar5.f20566i + 1;
                        fVar5.f20558a = fVar6;
                    } else if (i16 != 2) {
                    }
                    this.f20550c = 0;
                }
                i14 *= 2;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        public class a extends f0<K, V>.e<Map.Entry<K, V>> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public c() {
            f0.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && f0.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            f<K, V> c10;
            if ((obj instanceof Map.Entry) && (c10 = f0.this.c((Map.Entry) obj)) != null) {
                f0.this.e(c10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f0.this.f20543d;
        }
    }

    /* loaded from: classes.dex */
    public final class d extends AbstractSet<K> {

        /* loaded from: classes.dex */
        public class a extends f0<K, V>.e<K> {
            public a(d dVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().f20563f;
            }
        }

        public d() {
            f0.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return f0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            f0 f0Var = f0.this;
            f0Var.getClass();
            f<K, V> fVar = null;
            if (obj != null) {
                try {
                    fVar = f0Var.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (fVar != null) {
                f0Var.e(fVar, true);
            }
            if (fVar == null) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f0.this.f20543d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: a */
        public f<K, V> f20554a;

        /* renamed from: b */
        public f<K, V> f20555b = null;

        /* renamed from: c */
        public int f20556c;

        public e() {
            f0.this = r2;
            this.f20554a = r2.f20542c.f20561d;
            this.f20556c = r2.f20544e;
        }

        public final f<K, V> a() {
            f<K, V> fVar = this.f20554a;
            f0 f0Var = f0.this;
            if (fVar != f0Var.f20542c) {
                if (f0Var.f20544e == this.f20556c) {
                    this.f20554a = fVar.f20561d;
                    this.f20555b = fVar;
                    return fVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20554a != f0.this.f20542c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            f<K, V> fVar = this.f20555b;
            if (fVar == null) {
                throw new IllegalStateException();
            }
            f0.this.e(fVar, true);
            this.f20555b = null;
            this.f20556c = f0.this.f20544e;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public f<K, V> f20558a;

        /* renamed from: b */
        public f<K, V> f20559b;

        /* renamed from: c */
        public f<K, V> f20560c;

        /* renamed from: d */
        public f<K, V> f20561d;

        /* renamed from: e */
        public f<K, V> f20562e;

        /* renamed from: f */
        public final K f20563f;

        /* renamed from: g */
        public final int f20564g;

        /* renamed from: h */
        public V f20565h;

        /* renamed from: i */
        public int f20566i;

        public f() {
            this.f20563f = null;
            this.f20564g = -1;
            this.f20562e = this;
            this.f20561d = this;
        }

        public f(f<K, V> fVar, K k10, int i10, f<K, V> fVar2, f<K, V> fVar3) {
            this.f20558a = fVar;
            this.f20563f = k10;
            this.f20564g = i10;
            this.f20566i = 1;
            this.f20561d = fVar2;
            this.f20562e = fVar3;
            fVar3.f20561d = this;
            fVar2.f20562e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f20563f;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.f20565h;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v10.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f20563f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f20565h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f20563f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f20565h;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f20565h;
            this.f20565h = v10;
            return v11;
        }

        public final String toString() {
            return this.f20563f + ContainerUtils.KEY_VALUE_DELIMITER + this.f20565h;
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final f<K, V> a(K k10, boolean z10) {
        f<K, V> fVar;
        int i10;
        f<K, V> fVar2;
        f<K, V> fVar3;
        f<K, V> fVar4;
        f<K, V> fVar5;
        f<K, V> fVar6;
        Comparable comparable;
        int compare;
        f<K, V> fVar7;
        Comparator<? super K> comparator = this.f20540a;
        f<K, V>[] fVarArr = this.f20541b;
        int hashCode = k10.hashCode();
        int i11 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i12 = ((i11 >>> 7) ^ i11) ^ (i11 >>> 4);
        int length = i12 & (fVarArr.length - 1);
        f<K, V> fVar8 = fVarArr[length];
        f<K, V> fVar9 = null;
        if (fVar8 != null) {
            if (comparator == f20539i) {
                comparable = (Comparable) k10;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj = (K) fVar8.f20563f;
                if (comparable != null) {
                    compare = comparable.compareTo(obj);
                } else {
                    compare = comparator.compare(k10, obj);
                }
                if (compare == 0) {
                    return fVar8;
                }
                if (compare < 0) {
                    fVar7 = fVar8.f20559b;
                } else {
                    fVar7 = fVar8.f20560c;
                }
                if (fVar7 == null) {
                    fVar = fVar8;
                    i10 = compare;
                    break;
                }
                fVar8 = fVar7;
            }
        } else {
            fVar = fVar8;
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        f<K, V> fVar10 = this.f20542c;
        if (fVar == null) {
            if (comparator == f20539i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            fVar2 = new f<>(fVar, k10, i12, fVar10, fVar10.f20562e);
            fVarArr[length] = fVar2;
        } else {
            f<K, V> fVar11 = new f<>(fVar, k10, i12, fVar10, fVar10.f20562e);
            if (i10 < 0) {
                fVar.f20559b = fVar11;
            } else {
                fVar.f20560c = fVar11;
            }
            d(fVar, true);
            fVar2 = fVar11;
        }
        int i13 = this.f20543d;
        this.f20543d = i13 + 1;
        if (i13 > this.f20545f) {
            f<K, V>[] fVarArr2 = this.f20541b;
            int length2 = fVarArr2.length;
            int i14 = length2 * 2;
            f<K, V>[] fVarArr3 = new f[i14];
            b bVar = new b();
            b bVar2 = new b();
            for (int i15 = 0; i15 < length2; i15++) {
                f<K, V> fVar12 = fVarArr2[i15];
                if (fVar12 != null) {
                    f<K, V> fVar13 = fVar9;
                    for (f<K, V> fVar14 = fVar12; fVar14 != null; fVar14 = fVar14.f20559b) {
                        fVar14.f20558a = fVar13;
                        fVar13 = fVar14;
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        if (fVar13 == null) {
                            fVar3 = fVar13;
                            fVar13 = fVar9;
                        } else {
                            fVar3 = fVar13.f20558a;
                            fVar13.f20558a = fVar9;
                            f<K, V> fVar15 = fVar13.f20560c;
                            while (fVar15 != null) {
                                fVar15.f20558a = fVar3;
                                f<K, V> fVar16 = fVar15;
                                fVar15 = fVar15.f20559b;
                                fVar3 = fVar16;
                            }
                        }
                        if (fVar13 == null) {
                            break;
                        }
                        if ((fVar13.f20564g & length2) == 0) {
                            i16++;
                        } else {
                            i17++;
                        }
                        fVar13 = fVar3;
                        fVar9 = null;
                    }
                    bVar.f20549b = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    bVar.f20551d = 0;
                    bVar.f20550c = 0;
                    bVar.f20548a = null;
                    bVar2.f20549b = ((Integer.highestOneBit(i17) * 2) - 1) - i17;
                    bVar2.f20551d = 0;
                    bVar2.f20550c = 0;
                    bVar2.f20548a = null;
                    f<K, V> fVar17 = null;
                    while (fVar12 != null) {
                        fVar12.f20558a = fVar17;
                        f<K, V> fVar18 = fVar12;
                        fVar12 = fVar12.f20559b;
                        fVar17 = fVar18;
                    }
                    while (true) {
                        if (fVar17 == null) {
                            fVar4 = fVar17;
                            fVar17 = null;
                            fVar9 = null;
                        } else {
                            f<K, V> fVar19 = fVar17.f20558a;
                            fVar9 = null;
                            fVar17.f20558a = null;
                            f<K, V> fVar20 = fVar17.f20560c;
                            while (true) {
                                f<K, V> fVar21 = fVar20;
                                fVar4 = fVar19;
                                fVar19 = fVar21;
                                if (fVar19 == null) {
                                    break;
                                }
                                fVar19.f20558a = fVar4;
                                fVar20 = fVar19.f20559b;
                            }
                        }
                        if (fVar17 == null) {
                            break;
                        }
                        if ((fVar17.f20564g & length2) == 0) {
                            bVar.a(fVar17);
                        } else {
                            bVar2.a(fVar17);
                        }
                        fVar17 = fVar4;
                    }
                    if (i16 > 0) {
                        fVar5 = bVar.f20548a;
                        if (fVar5.f20558a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar5 = fVar9;
                    }
                    fVarArr3[i15] = fVar5;
                    int i18 = i15 + length2;
                    if (i17 > 0) {
                        fVar6 = bVar2.f20548a;
                        if (fVar6.f20558a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar6 = fVar9;
                    }
                    fVarArr3[i18] = fVar6;
                }
            }
            this.f20541b = fVarArr3;
            this.f20545f = (i14 / 4) + (i14 / 2);
        }
        this.f20544e++;
        return fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mf.f0.f<K, V> c(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            mf.f0$f r0 = r5.a(r0, r2)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            r3 = 1
            if (r0 == 0) goto L28
            V r4 = r0.f20565h
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L24
            if (r4 == 0) goto L22
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = 0
            goto L25
        L24:
            r6 = 1
        L25:
            if (r6 == 0) goto L28
            r2 = 1
        L28:
            if (r2 == 0) goto L2b
            r1 = r0
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.f0.c(java.util.Map$Entry):mf.f0$f");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f20541b, (Object) null);
        this.f20543d = 0;
        this.f20544e++;
        f<K, V> fVar = this.f20542c;
        f<K, V> fVar2 = fVar.f20561d;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.f20561d;
            fVar2.f20562e = null;
            fVar2.f20561d = null;
            fVar2 = fVar3;
        }
        fVar.f20562e = fVar;
        fVar.f20561d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        f<K, V> fVar = null;
        if (obj != 0) {
            try {
                fVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return fVar != null;
    }

    public final void d(f<K, V> fVar, boolean z10) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.f20559b;
            f<K, V> fVar3 = fVar.f20560c;
            int i10 = fVar2 != null ? fVar2.f20566i : 0;
            int i11 = fVar3 != null ? fVar3.f20566i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                f<K, V> fVar4 = fVar3.f20559b;
                f<K, V> fVar5 = fVar3.f20560c;
                int i13 = (fVar4 != null ? fVar4.f20566i : 0) - (fVar5 != null ? fVar5.f20566i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    h(fVar3);
                }
                g(fVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                f<K, V> fVar6 = fVar2.f20559b;
                f<K, V> fVar7 = fVar2.f20560c;
                int i14 = (fVar6 != null ? fVar6.f20566i : 0) - (fVar7 != null ? fVar7.f20566i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    g(fVar2);
                }
                h(fVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                fVar.f20566i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                fVar.f20566i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            fVar = fVar.f20558a;
        }
    }

    public final void e(f<K, V> fVar, boolean z10) {
        f<K, V> fVar2;
        f<K, V> fVar3;
        int i10;
        if (z10) {
            f<K, V> fVar4 = fVar.f20562e;
            fVar4.f20561d = fVar.f20561d;
            fVar.f20561d.f20562e = fVar4;
            fVar.f20562e = null;
            fVar.f20561d = null;
        }
        f<K, V> fVar5 = fVar.f20559b;
        f<K, V> fVar6 = fVar.f20560c;
        f<K, V> fVar7 = fVar.f20558a;
        int i11 = 0;
        if (fVar5 != null && fVar6 != null) {
            if (fVar5.f20566i > fVar6.f20566i) {
                do {
                    fVar3 = fVar5;
                    fVar5 = fVar5.f20560c;
                } while (fVar5 != null);
            } else {
                do {
                    fVar2 = fVar6;
                    fVar6 = fVar6.f20559b;
                } while (fVar6 != null);
                fVar3 = fVar2;
            }
            e(fVar3, false);
            f<K, V> fVar8 = fVar.f20559b;
            if (fVar8 != null) {
                i10 = fVar8.f20566i;
                fVar3.f20559b = fVar8;
                fVar8.f20558a = fVar3;
                fVar.f20559b = null;
            } else {
                i10 = 0;
            }
            f<K, V> fVar9 = fVar.f20560c;
            if (fVar9 != null) {
                i11 = fVar9.f20566i;
                fVar3.f20560c = fVar9;
                fVar9.f20558a = fVar3;
                fVar.f20560c = null;
            }
            fVar3.f20566i = Math.max(i10, i11) + 1;
            f(fVar, fVar3);
            return;
        }
        if (fVar5 != null) {
            f(fVar, fVar5);
            fVar.f20559b = null;
        } else if (fVar6 != null) {
            f(fVar, fVar6);
            fVar.f20560c = null;
        } else {
            f(fVar, null);
        }
        d(fVar7, false);
        this.f20543d--;
        this.f20544e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        f0<K, V>.c cVar = this.f20546g;
        if (cVar != null) {
            return cVar;
        }
        f0<K, V>.c cVar2 = new c();
        this.f20546g = cVar2;
        return cVar2;
    }

    public final void f(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.f20558a;
        fVar.f20558a = null;
        if (fVar2 != null) {
            fVar2.f20558a = fVar3;
        }
        if (fVar3 == null) {
            int i10 = fVar.f20564g;
            f<K, V>[] fVarArr = this.f20541b;
            fVarArr[i10 & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f20559b == fVar) {
            fVar3.f20559b = fVar2;
        } else {
            fVar3.f20560c = fVar2;
        }
    }

    public final void g(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f20559b;
        f<K, V> fVar3 = fVar.f20560c;
        f<K, V> fVar4 = fVar3.f20559b;
        f<K, V> fVar5 = fVar3.f20560c;
        fVar.f20560c = fVar4;
        if (fVar4 != null) {
            fVar4.f20558a = fVar;
        }
        f(fVar, fVar3);
        fVar3.f20559b = fVar;
        fVar.f20558a = fVar3;
        int max = Math.max(fVar2 != null ? fVar2.f20566i : 0, fVar4 != null ? fVar4.f20566i : 0) + 1;
        fVar.f20566i = max;
        fVar3.f20566i = Math.max(max, fVar5 != null ? fVar5.f20566i : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            mf.f0$f r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f20565h
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.f0.get(java.lang.Object):java.lang.Object");
    }

    public final void h(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f20559b;
        f<K, V> fVar3 = fVar.f20560c;
        f<K, V> fVar4 = fVar2.f20559b;
        f<K, V> fVar5 = fVar2.f20560c;
        fVar.f20559b = fVar5;
        if (fVar5 != null) {
            fVar5.f20558a = fVar;
        }
        f(fVar, fVar2);
        fVar2.f20560c = fVar;
        fVar.f20558a = fVar2;
        int max = Math.max(fVar3 != null ? fVar3.f20566i : 0, fVar5 != null ? fVar5.f20566i : 0) + 1;
        fVar.f20566i = max;
        fVar2.f20566i = Math.max(max, fVar4 != null ? fVar4.f20566i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        f0<K, V>.d dVar = this.f20547h;
        if (dVar != null) {
            return dVar;
        }
        f0<K, V>.d dVar2 = new d();
        this.f20547h = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 != null) {
            f<K, V> a10 = a(k10, true);
            V v11 = a10.f20565h;
            a10.f20565h = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            mf.f0$f r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L11
            r1 = 1
            r2.e(r3, r1)
        L11:
            if (r3 == 0) goto L15
            V r0 = r3.f20565h
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.f0.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20543d;
    }
}
