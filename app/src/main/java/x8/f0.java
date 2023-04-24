package x8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class f0 extends c0 implements List, RandomAccess {

    /* renamed from: b */
    public static final d0 f30411b = new d0(g0.f30415e, 0);

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // x8.c0
    public void b(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x003d  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != r5) goto L4
            goto L59
        L4:
            boolean r1 = r6 instanceof java.util.List
            if (r1 != 0) goto L9
            goto L5a
        L9:
            java.util.List r6 = (java.util.List) r6
            int r1 = r5.size()
            int r2 = r6.size()
            if (r1 == r2) goto L16
            goto L5a
        L16:
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L2f
            r2 = 0
        L1b:
            if (r2 >= r1) goto L59
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = s.h1.t(r3, r4)
            if (r3 != 0) goto L2c
            goto L5a
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            x8.d0 r1 = r5.listIterator(r0)
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L44
            goto L5a
        L44:
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.next()
            boolean r2 = s.h1.t(r2, r3)
            if (r2 != 0) goto L37
            goto L5a
        L53:
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L5a
        L59:
            r0 = 1
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.f0.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // x8.c0
    @Deprecated
    public final f0 i() {
        return this;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // x8.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // x8.c0
    public final d0 j() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: o */
    public f0 subList(int i10, int i11) {
        p.b.C(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? g0.f30415e : new e0(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: p */
    public final d0 listIterator(int i10) {
        p.b.B(i10, size());
        return isEmpty() ? f30411b : new d0(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
