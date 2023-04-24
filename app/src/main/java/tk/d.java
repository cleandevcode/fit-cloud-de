package tk;

/* loaded from: classes2.dex */
public abstract class d<T> {

    /* renamed from: a */
    public static final int f28269a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public final void a(e<? super T> eVar) {
        try {
            b(eVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            h7.a.y(th2);
            ol.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void b(xn.a<? super T> aVar);
}
