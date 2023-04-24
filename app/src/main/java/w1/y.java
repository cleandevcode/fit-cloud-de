package w1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import w1.i;
import w1.w;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    public static final Charset f29729a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f29730b;

    /* loaded from: classes.dex */
    public interface a {
        int o();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface c<E> extends List<E>, RandomAccess {
        void a();

        c<E> c(int i10);

        boolean m();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f29730b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new i.a(bArr, 0, 0, false).e(0);
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static w c(Object obj, Object obj2) {
        w.a a10 = ((p0) obj).a();
        p0 p0Var = (p0) obj2;
        a10.getClass();
        if (a10.f29715a.getClass().isInstance(p0Var)) {
            a10.l();
            w.a.m(a10.f29716b, (w) ((w1.a) p0Var));
            return a10.i();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
