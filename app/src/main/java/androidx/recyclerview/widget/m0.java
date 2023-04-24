package androidx.recyclerview.widget;

import androidx.appcompat.widget.e2;
import java.lang.reflect.Array;
import java.util.Comparator;
import uh.a0;

/* loaded from: classes.dex */
public final class m0<T> {

    /* renamed from: b */
    public a f3144b;

    /* renamed from: a */
    public T[] f3143a = (T[]) ((Object[]) Array.newInstance(uh.z.class, 10));

    /* renamed from: c */
    public int f3145c = 0;

    /* loaded from: classes.dex */
    public static abstract class a<T2> implements Comparator<T2>, y {
        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        @Override // androidx.recyclerview.widget.y
        public abstract void d(int i10, int i11, Object obj);

        public abstract boolean e(T2 t22, T2 t23);

        public abstract boolean f(T2 t22, T2 t23);
    }

    public m0(a0.c cVar) {
        this.f3144b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0060, code lost:
        if (r3 == (-1)) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m0.a(java.lang.Object, boolean):int");
    }

    public final T b(int i10) {
        if (i10 < this.f3145c && i10 >= 0) {
            return this.f3143a[i10];
        }
        StringBuilder a10 = e2.a("Asked to get item at ", i10, " but size is ");
        a10.append(this.f3145c);
        throw new IndexOutOfBoundsException(a10.toString());
    }
}
