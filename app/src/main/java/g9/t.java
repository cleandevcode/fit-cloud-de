package g9;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class t<TResult> {

    /* renamed from: a */
    public final Object f15057a = new Object();

    /* renamed from: b */
    public final r f15058b = new r();

    /* renamed from: c */
    public boolean f15059c;

    /* renamed from: d */
    public volatile boolean f15060d;

    /* renamed from: e */
    public Object f15061e;

    /* renamed from: f */
    public Exception f15062f;

    public final TResult a() {
        TResult tresult;
        synchronized (this.f15057a) {
            i8.p.h("Task is not yet complete", this.f15059c);
            if (!this.f15060d) {
                Exception exc = this.f15062f;
                if (exc == null) {
                    tresult = (TResult) this.f15061e;
                } else {
                    throw new g(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f15057a) {
            z10 = false;
            if (this.f15059c && !this.f15060d && this.f15062f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.f15057a) {
            d();
            this.f15059c = true;
            this.f15062f = exc;
        }
        this.f15058b.b(this);
    }

    public final void d() {
        boolean z10;
        Exception exc;
        String str;
        if (this.f15059c) {
            int i10 = b.f15033a;
            synchronized (this.f15057a) {
                z10 = this.f15059c;
            }
            if (z10) {
                synchronized (this.f15057a) {
                    exc = this.f15062f;
                }
                if (exc == null) {
                    if (!b()) {
                        if (this.f15060d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(a()));
                    }
                } else {
                    str = "failure";
                }
                throw new b("Complete with: ".concat(str), exc);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void e() {
        synchronized (this.f15057a) {
            if (this.f15059c) {
                this.f15058b.b(this);
            }
        }
    }
}
