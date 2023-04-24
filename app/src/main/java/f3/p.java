package f3;

import android.annotation.SuppressLint;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;

/* loaded from: classes.dex */
public interface p {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final a.c f14102a = new a.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final a.b f14103b = new a.b();

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: f3.p$a$a */
        /* loaded from: classes.dex */
        public static final class C0249a extends a {

            /* renamed from: a */
            public final Throwable f14104a;

            public C0249a(Throwable th2) {
                this.f14104a = th2;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.f14104a.getMessage());
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return MonitorResult.SUCCESS;
            }
        }
    }
}
