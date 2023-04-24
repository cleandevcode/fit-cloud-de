package o5;

import d6.s;
import java.util.Random;
import s.m1;

/* loaded from: classes.dex */
public class p extends RuntimeException {

    /* renamed from: a */
    public static final /* synthetic */ int f22804a = 0;

    public p() {
    }

    public p(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !v.h() || random.nextInt(100) <= 50) {
            return;
        }
        d6.s sVar = d6.s.f12755a;
        d6.s.a(new m1(4, str), s.b.ErrorReport);
    }

    public p(String str, Exception exc) {
        super(str, exc);
    }

    public p(Throwable th2) {
        super(th2);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
