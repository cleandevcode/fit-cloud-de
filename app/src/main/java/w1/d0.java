package w1;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class d0 extends c<String> implements e0, RandomAccess {

    /* renamed from: b */
    public final ArrayList f29550b;

    static {
        new d0(10).f29545a = false;
    }

    public d0(int i10) {
        this(new ArrayList(i10));
    }

    public d0(ArrayList<Object> arrayList) {
        this.f29550b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        b();
        this.f29550b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof e0) {
            collection = ((e0) collection).g();
        }
        boolean addAll = this.f29550b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f29550b);
            return new d0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f29550b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // w1.e0
    public final void d(g gVar) {
        b();
        this.f29550b.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // w1.e0
    public final List<?> g() {
        return Collections.unmodifiableList(this.f29550b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0029, code lost:
        if (r0.j() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0040, code lost:
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0042, code lost:
        r5.f29550b.set(r6, r1);
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(int r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f29550b
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            goto L48
        Ld:
            boolean r1 = r0 instanceof w1.g
            if (r1 == 0) goto L2c
            w1.g r0 = (w1.g) r0
            r0.getClass()
            java.nio.charset.Charset r1 = w1.y.f29729a
            int r2 = r0.size()
            if (r2 != 0) goto L21
            java.lang.String r1 = ""
            goto L25
        L21:
            java.lang.String r1 = r0.n(r1)
        L25:
            boolean r0 = r0.j()
            if (r0 == 0) goto L47
            goto L42
        L2c:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = w1.y.f29729a
            r1.<init>(r0, r2)
            w1.o1$b r2 = w1.o1.f29660a
            int r3 = r0.length
            r4 = 0
            int r0 = r2.c(r4, r3, r0)
            if (r0 != 0) goto L40
            r4 = 1
        L40:
            if (r4 == 0) goto L47
        L42:
            java.util.ArrayList r0 = r5.f29550b
            r0.set(r6, r1)
        L47:
            r0 = r1
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.d0.get(int):java.lang.Object");
    }

    @Override // w1.e0
    public final e0 h() {
        if (this.f29545a) {
            return new m1(this);
        }
        return this;
    }

    @Override // w1.e0
    public final Object l(int i10) {
        return this.f29550b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        Object remove = this.f29550b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof g) {
            g gVar = (g) remove;
            gVar.getClass();
            Charset charset = y.f29729a;
            if (gVar.size() == 0) {
                return "";
            }
            return gVar.n(charset);
        }
        return new String((byte[]) remove, y.f29729a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        Object obj2 = this.f29550b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof g) {
            g gVar = (g) obj2;
            gVar.getClass();
            Charset charset = y.f29729a;
            if (gVar.size() == 0) {
                return "";
            }
            return gVar.n(charset);
        }
        return new String((byte[]) obj2, y.f29729a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29550b.size();
    }
}
