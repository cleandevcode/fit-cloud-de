package j4;

import java.lang.reflect.Type;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements t0, i4.t {

    /* renamed from: a */
    public static final o f17454a = new o();

    /* loaded from: classes.dex */
    public static class a {
    }

    @Override // i4.t
    public final int b() {
        return 14;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.nio.ByteBuffer] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        ((a) aVar.P(null, a.class)).getClass();
        ?? r12 = (T) ByteBuffer.wrap(null);
        r12.limit(0);
        r12.position(0);
        return r12;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byte[] array = byteBuffer.array();
        d1 d1Var = i0Var.f17406j;
        d1Var.write(123);
        d1Var.y("array");
        d1Var.s(array);
        d1Var.C(',', byteBuffer.limit(), "limit");
        d1Var.C(',', byteBuffer.position(), "position");
        d1Var.write(125);
    }
}
