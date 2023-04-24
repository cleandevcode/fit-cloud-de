package nm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import mf.a0;
import ul.b0;

/* loaded from: classes2.dex */
public final class h<T> extends i<T> implements Iterator<T>, xl.d<tl.l>, hm.a {

    /* renamed from: a */
    public int f22488a;

    /* renamed from: b */
    public T f22489b;

    /* renamed from: c */
    public xl.d<? super tl.l> f22490c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nm.i
    public final void c(Object obj, b0 b0Var) {
        this.f22489b = obj;
        this.f22488a = 3;
        this.f22490c = b0Var;
    }

    public final RuntimeException d() {
        int i10 = this.f22488a;
        if (i10 != 4) {
            if (i10 != 5) {
                StringBuilder a10 = android.support.v4.media.d.a("Unexpected state of the iterator: ");
                a10.append(this.f22488a);
                return new IllegalStateException(a10.toString());
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // xl.d
    public final xl.f e() {
        return xl.g.f30632a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f22488a;
            if (i10 != 0) {
                break;
            }
            this.f22488a = 5;
            xl.d<? super tl.l> dVar = this.f22490c;
            gm.l.c(dVar);
            this.f22490c = null;
            dVar.l(tl.l.f28297a);
        }
        if (i10 == 1) {
            gm.l.c(null);
            throw null;
        } else if (i10 == 2 || i10 == 3) {
            return true;
        } else {
            if (i10 == 4) {
                return false;
            }
            throw d();
        }
    }

    @Override // xl.d
    public final void l(Object obj) {
        a0.k(obj);
        this.f22488a = 4;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f22488a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i10 == 2) {
            this.f22488a = 1;
            gm.l.c(null);
            throw null;
        } else if (i10 == 3) {
            this.f22488a = 0;
            T t10 = this.f22489b;
            this.f22489b = null;
            return t10;
        } else {
            throw d();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
