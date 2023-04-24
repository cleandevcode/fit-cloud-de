package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import f3.g;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a */
    public Context f3618a;

    /* renamed from: b */
    public WorkerParameters f3619b;

    /* renamed from: c */
    public volatile boolean f3620c;

    /* renamed from: d */
    public boolean f3621d;

    /* renamed from: e */
    public boolean f3622e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: classes.dex */
        public static final class C0036a extends a {

            /* renamed from: a */
            public final androidx.work.b f3623a = androidx.work.b.f3647c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0036a.class != obj.getClass()) {
                    return false;
                }
                return this.f3623a.equals(((C0036a) obj).f3623a);
            }

            public final int hashCode() {
                return this.f3623a.hashCode() + (C0036a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder a10 = d.a("Failure {mOutputData=");
                a10.append(this.f3623a);
                a10.append('}');
                return a10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a */
            public final androidx.work.b f3624a;

            public c() {
                this(androidx.work.b.f3647c);
            }

            public c(androidx.work.b bVar) {
                this.f3624a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3624a.equals(((c) obj).f3624a);
            }

            public final int hashCode() {
                return this.f3624a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder a10 = d.a("Success {mOutputData=");
                a10.append(this.f3624a);
                a10.append('}');
                return a10.toString();
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f3618a = context;
        this.f3619b = workerParameters;
    }

    public na.a<g> a() {
        q3.c cVar = new q3.c();
        cVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public boolean b() {
        return this.f3622e;
    }

    public void c() {
    }

    public abstract q3.c d();

    public final void g() {
        this.f3620c = true;
        c();
    }
}
