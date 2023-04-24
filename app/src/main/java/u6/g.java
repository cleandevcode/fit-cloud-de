package u6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* renamed from: c */
    public final Throwable f28543c;

    /* renamed from: d */
    public final T f28544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, Throwable th2) {
        super(true, obj);
        gm.l.f(th2, "error");
        this.f28543c = th2;
        this.f28544d = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            Throwable th2 = ((g) obj).f28543c;
            if (gm.l.a(gm.b0.a(this.f28543c.getClass()), gm.b0.a(th2.getClass())) && gm.l.a(this.f28543c.getMessage(), th2.getMessage())) {
                StackTraceElement[] stackTrace = this.f28543c.getStackTrace();
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
        StackTraceElement[] stackTrace = this.f28543c.getStackTrace();
        gm.l.e(stackTrace, "error.stackTrace");
        return Arrays.hashCode(new Object[]{gm.b0.a(this.f28543c.getClass()), this.f28543c.getMessage(), ul.i.B(stackTrace)});
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Fail(error=");
        a10.append(this.f28543c);
        a10.append(", value=");
        a10.append(this.f28544d);
        a10.append(')');
        return a10.toString();
    }
}
