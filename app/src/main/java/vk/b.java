package vk;

import cn.sharesdk.facebook.e;

/* loaded from: classes2.dex */
public final class b extends RuntimeException {
    public b(Throwable th2) {
        super(e.a("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th2), th2 == null ? new NullPointerException() : th2);
    }
}
