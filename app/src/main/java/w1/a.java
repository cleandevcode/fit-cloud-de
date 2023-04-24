package w1;

import java.io.IOException;
import java.util.logging.Logger;
import w1.a;
import w1.a.AbstractC0538a;
import w1.g;
import w1.k;
import w1.p0;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0538a<MessageType, BuilderType>> implements p0 {
    public int memoizedHashCode = 0;

    /* renamed from: w1.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0538a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0538a<MessageType, BuilderType>> implements p0.a {
    }

    @Override // w1.p0
    public final g.e c() {
        try {
            w wVar = (w) this;
            int e10 = wVar.e();
            g.e eVar = g.f29563b;
            byte[] bArr = new byte[e10];
            Logger logger = k.f29621b;
            k.b bVar = new k.b(bArr, e10);
            wVar.d(bVar);
            if (bVar.f29628e - bVar.f29629f == 0) {
                return new g.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            StringBuilder a10 = android.support.v4.media.d.a("Serializing ");
            a10.append(getClass().getName());
            a10.append(" to a ");
            a10.append("ByteString");
            a10.append(" threw an IOException (should never happen).");
            throw new RuntimeException(a10.toString(), e11);
        }
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public final int i(d1 d1Var) {
        int h10 = h();
        if (h10 == -1) {
            int h11 = d1Var.h(this);
            j(h11);
            return h11;
        }
        return h10;
    }

    public void j(int i10) {
        throw new UnsupportedOperationException();
    }
}
