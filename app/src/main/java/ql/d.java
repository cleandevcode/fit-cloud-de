package ql;

import tk.i;
import tk.n;

/* loaded from: classes2.dex */
public abstract class d<T> extends i<T> implements n<T> {
    public final d<T> G() {
        return this instanceof c ? this : new c(this);
    }
}
