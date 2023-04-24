package kl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public static final a f18620a = new a();

    /* loaded from: classes2.dex */
    public static final class a extends Throwable {
        public a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static NullPointerException a(String str) {
        return new NullPointerException(a.b.b(str, " Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw a(str);
        }
    }

    public static String c(long j10, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j10 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException d(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }
}
