package hl;

import java.util.concurrent.atomic.AtomicReference;
import nl.e;

/* loaded from: classes2.dex */
public final class a<T> implements e<T> {

    /* renamed from: a */
    public final AtomicReference<C0285a<T>> f16154a;

    /* renamed from: b */
    public final AtomicReference<C0285a<T>> f16155b;

    /* renamed from: hl.a$a */
    /* loaded from: classes2.dex */
    public static final class C0285a<E> extends AtomicReference<C0285a<E>> {

        /* renamed from: a */
        public E f16156a;

        public C0285a() {
        }

        public C0285a(E e10) {
            this.f16156a = e10;
        }
    }

    public a() {
        AtomicReference<C0285a<T>> atomicReference = new AtomicReference<>();
        this.f16154a = atomicReference;
        AtomicReference<C0285a<T>> atomicReference2 = new AtomicReference<>();
        this.f16155b = atomicReference2;
        C0285a<T> c0285a = new C0285a<>();
        atomicReference2.lazySet(c0285a);
        atomicReference.getAndSet(c0285a);
    }

    @Override // nl.f
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // nl.f
    public final boolean isEmpty() {
        if (this.f16155b.get() == this.f16154a.get()) {
            return true;
        }
        return false;
    }

    @Override // nl.f
    public final boolean offer(T t10) {
        if (t10 != null) {
            C0285a<T> c0285a = new C0285a<>(t10);
            this.f16154a.getAndSet(c0285a).lazySet(c0285a);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // nl.e, nl.f
    public final T poll() {
        C0285a c0285a;
        C0285a<T> c0285a2 = this.f16155b.get();
        C0285a c0285a3 = c0285a2.get();
        if (c0285a3 != null) {
            T t10 = c0285a3.f16156a;
            c0285a3.f16156a = null;
            this.f16155b.lazySet(c0285a3);
            return t10;
        } else if (c0285a2 == this.f16154a.get()) {
            return null;
        } else {
            do {
                c0285a = c0285a2.get();
            } while (c0285a == null);
            T t11 = c0285a.f16156a;
            c0285a.f16156a = null;
            this.f16155b.lazySet(c0285a);
            return t11;
        }
    }
}
