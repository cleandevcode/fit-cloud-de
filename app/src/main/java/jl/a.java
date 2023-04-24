package jl;

import java.util.concurrent.atomic.AtomicLong;
import nl.c;

/* loaded from: classes2.dex */
public abstract class a<T> extends AtomicLong implements c, xn.b {
    @Override // nl.f
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
