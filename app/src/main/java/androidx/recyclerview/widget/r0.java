package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.appcompat.widget.e2;
import androidx.appcompat.widget.u0;

/* loaded from: classes.dex */
public interface r0 {

    /* loaded from: classes.dex */
    public static class a implements r0 {

        /* renamed from: a */
        public SparseArray<z> f3246a = new SparseArray<>();

        /* renamed from: b */
        public int f3247b = 0;

        /* renamed from: androidx.recyclerview.widget.r0$a$a */
        /* loaded from: classes.dex */
        public class C0033a implements b {

            /* renamed from: a */
            public SparseIntArray f3248a = new SparseIntArray(1);

            /* renamed from: b */
            public SparseIntArray f3249b = new SparseIntArray(1);

            /* renamed from: c */
            public final z f3250c;

            public C0033a(z zVar) {
                a.this = r2;
                this.f3250c = zVar;
            }

            @Override // androidx.recyclerview.widget.r0.b
            public final int a(int i10) {
                int indexOfKey = this.f3249b.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return this.f3249b.valueAt(indexOfKey);
                }
                StringBuilder a10 = e2.a("requested global type ", i10, " does not belong to the adapter:");
                a10.append(this.f3250c.f3338c);
                throw new IllegalStateException(a10.toString());
            }

            @Override // androidx.recyclerview.widget.r0.b
            public final int b(int i10) {
                int indexOfKey = this.f3248a.indexOfKey(i10);
                if (indexOfKey > -1) {
                    return this.f3248a.valueAt(indexOfKey);
                }
                a aVar = a.this;
                z zVar = this.f3250c;
                int i11 = aVar.f3247b;
                aVar.f3247b = i11 + 1;
                aVar.f3246a.put(i11, zVar);
                this.f3248a.put(i10, i11);
                this.f3249b.put(i11, i10);
                return i11;
            }
        }

        @Override // androidx.recyclerview.widget.r0
        public final z a(int i10) {
            z zVar = this.f3246a.get(i10);
            if (zVar != null) {
                return zVar;
            }
            throw new IllegalArgumentException(u0.a("Cannot find the wrapper for global view type ", i10));
        }

        @Override // androidx.recyclerview.widget.r0
        public final b b(z zVar) {
            return new C0033a(zVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(int i10);

        int b(int i10);
    }

    z a(int i10);

    b b(z zVar);
}
