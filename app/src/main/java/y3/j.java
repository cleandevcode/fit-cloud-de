package y3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j<T> extends b<T> {

    /* renamed from: b */
    public final Throwable f30961b;

    /* renamed from: c */
    public final T f30962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Object obj, Throwable th2) {
        super(obj);
        gm.l.f(th2, "error");
        this.f30961b = th2;
        this.f30962c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            Throwable th2 = ((j) obj).f30961b;
            if (gm.l.a(gm.b0.a(this.f30961b.getClass()), gm.b0.a(th2.getClass())) && gm.l.a(this.f30961b.getMessage(), th2.getMessage())) {
                StackTraceElement[] stackTrace = this.f30961b.getStackTrace();
                gm.l.e(stackTrace, "error.stackTrace");
                Object B = ul.i.B(stackTrace);
                StackTraceElement[] stackTrace2 = th2.getStackTrace();
                gm.l.e(stackTrace2, "otherError.stackTrace");
                return gm.l.a(B, ul.i.B(stackTrace2));
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        StackTraceElement[] stackTrace = this.f30961b.getStackTrace();
        gm.l.e(stackTrace, "error.stackTrace");
        return Arrays.hashCode(new Object[]{gm.b0.a(this.f30961b.getClass()), this.f30961b.getMessage(), ul.i.B(stackTrace)});
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Fail(error=");
        a10.append(this.f30961b);
        a10.append(", value=");
        a10.append(this.f30962c);
        a10.append(')');
        return a10.toString();
    }
}
