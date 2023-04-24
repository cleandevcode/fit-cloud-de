package pm;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a */
    public final Object f24389a;

    /* renamed from: b */
    public final g f24390b;

    /* renamed from: c */
    public final fm.l<Throwable, tl.l> f24391c;

    /* renamed from: d */
    public final Object f24392d;

    /* renamed from: e */
    public final Throwable f24393e;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Object obj, g gVar, fm.l<? super Throwable, tl.l> lVar, Object obj2, Throwable th2) {
        this.f24389a = obj;
        this.f24390b = gVar;
        this.f24391c = lVar;
        this.f24392d = obj2;
        this.f24393e = th2;
    }

    public /* synthetic */ t(Object obj, g gVar, fm.l lVar, Object obj2, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static t a(t tVar, g gVar, CancellationException cancellationException, int i10) {
        Object obj = (i10 & 1) != 0 ? tVar.f24389a : null;
        if ((i10 & 2) != 0) {
            gVar = tVar.f24390b;
        }
        g gVar2 = gVar;
        fm.l<Throwable, tl.l> lVar = (i10 & 4) != 0 ? tVar.f24391c : null;
        Object obj2 = (i10 & 8) != 0 ? tVar.f24392d : null;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = tVar.f24393e;
        }
        tVar.getClass();
        return new t(obj, gVar2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return gm.l.a(this.f24389a, tVar.f24389a) && gm.l.a(this.f24390b, tVar.f24390b) && gm.l.a(this.f24391c, tVar.f24391c) && gm.l.a(this.f24392d, tVar.f24392d) && gm.l.a(this.f24393e, tVar.f24393e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24389a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        g gVar = this.f24390b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        fm.l<Throwable, tl.l> lVar = this.f24391c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f24392d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f24393e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CompletedContinuation(result=");
        a10.append(this.f24389a);
        a10.append(", cancelHandler=");
        a10.append(this.f24390b);
        a10.append(", onCancellation=");
        a10.append(this.f24391c);
        a10.append(", idempotentResume=");
        a10.append(this.f24392d);
        a10.append(", cancelCause=");
        a10.append(this.f24393e);
        a10.append(')');
        return a10.toString();
    }
}
