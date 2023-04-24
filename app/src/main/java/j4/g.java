package j4;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class g implements t0, i4.t {

    /* renamed from: a */
    public static final g f17401a = new g();

    @Override // i4.t
    public final int b() {
        return 14;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.concurrent.atomic.AtomicLongArray] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.concurrent.atomic.AtomicIntegerArray] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        if (aVar.f15774f.h0() == 8) {
            aVar.f15774f.J(16);
            return null;
        }
        e4.b bVar = new e4.b();
        aVar.I(bVar, null);
        int i10 = 0;
        if (type == AtomicIntegerArray.class) {
            ?? r42 = (T) new AtomicIntegerArray(bVar.size());
            while (i10 < bVar.size()) {
                r42.set(i10, n4.n.m(bVar.get(i10)).intValue());
                i10++;
            }
            return r42;
        }
        ?? r43 = (T) new AtomicLongArray(bVar.size());
        while (i10 < bVar.size()) {
            r43.set(i10, n4.n.o(bVar.get(i10)).longValue());
            i10++;
        }
        return r43;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj instanceof AtomicInteger) {
            d1Var.L(((AtomicInteger) obj).get());
        } else if (obj instanceof AtomicLong) {
            d1Var.P(((AtomicLong) obj).get());
        } else if (obj instanceof AtomicBoolean) {
            d1Var.b(((AtomicBoolean) obj).get() ? "true" : "false");
        } else if (obj == null) {
            d1Var.X(e1.WriteNullListAsEmpty);
        } else {
            int i11 = 0;
            if (obj instanceof AtomicIntegerArray) {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                int length = atomicIntegerArray.length();
                d1Var.write(91);
                while (i11 < length) {
                    int i12 = atomicIntegerArray.get(i11);
                    if (i11 != 0) {
                        d1Var.write(44);
                    }
                    d1Var.L(i12);
                    i11++;
                }
                d1Var.write(93);
                return;
            }
            AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
            int length2 = atomicLongArray.length();
            d1Var.write(91);
            while (i11 < length2) {
                long j10 = atomicLongArray.get(i11);
                if (i11 != 0) {
                    d1Var.write(44);
                }
                d1Var.P(j10);
                i11++;
            }
            d1Var.write(93);
        }
    }
}
