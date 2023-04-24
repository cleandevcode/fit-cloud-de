package o5;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d0 extends AbstractList<y> {

    /* renamed from: e */
    public static final AtomicInteger f22689e = new AtomicInteger();

    /* renamed from: a */
    public Handler f22690a;

    /* renamed from: c */
    public ArrayList f22692c;

    /* renamed from: b */
    public final String f22691b = String.valueOf(f22689e.incrementAndGet());

    /* renamed from: d */
    public ArrayList f22693d = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(d0 d0Var);
    }

    /* loaded from: classes.dex */
    public interface b extends a {
        void b();
    }

    public d0(List list) {
        this.f22692c = new ArrayList(list);
    }

    public d0(y... yVarArr) {
        this.f22692c = new ArrayList(ul.i.t(yVarArr));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        y yVar = (y) obj;
        gm.l.f(yVar, "element");
        this.f22692c.add(i10, yVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f22692c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.contains((y) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (y) this.f22692c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.indexOf((y) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.lastIndexOf((y) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (y) this.f22692c.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        y yVar = (y) obj;
        gm.l.f(yVar, "element");
        return (y) this.f22692c.set(i10, yVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22692c.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        y yVar = (y) obj;
        gm.l.f(yVar, "element");
        return this.f22692c.add(yVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.remove((y) obj);
        }
        return false;
    }
}
