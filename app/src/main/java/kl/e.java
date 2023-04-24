package kl;

import java.io.Serializable;
import java.util.Objects;
import tk.n;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public static final e f18621a;

    /* renamed from: b */
    public static final /* synthetic */ e[] f18622b;

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: a */
        public final uk.c f18623a;

        public a(uk.c cVar) {
            this.f18623a = cVar;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("NotificationLite.Disposable[");
            a10.append(this.f18623a);
            a10.append("]");
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Serializable {

        /* renamed from: a */
        public final Throwable f18624a;

        public b(Throwable th2) {
            this.f18624a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f18624a, ((b) obj).f18624a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f18624a.hashCode();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("NotificationLite.Error[");
            a10.append(this.f18624a);
            a10.append("]");
            return a10.toString();
        }
    }

    static {
        e eVar = new e();
        f18621a = eVar;
        f18622b = new e[]{eVar};
    }

    public static boolean a(n nVar, Object obj) {
        if (obj == f18621a) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            nVar.onError(((b) obj).f18624a);
            return true;
        } else {
            nVar.b(obj);
            return false;
        }
    }

    public static boolean c(n nVar, Object obj) {
        if (obj == f18621a) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            nVar.onError(((b) obj).f18624a);
            return true;
        } else if (obj instanceof a) {
            nVar.a(((a) obj).f18623a);
            return false;
        } else {
            nVar.b(obj);
            return false;
        }
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f18622b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
