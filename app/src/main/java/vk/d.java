package vk;

import cn.sharesdk.facebook.e;

/* loaded from: classes2.dex */
public final class d extends IllegalStateException {
    public d(Throwable th2) {
        super(e.a("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th2), th2);
    }
}
