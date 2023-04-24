package x5;

import android.util.Log;
import gm.a0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Object f30311a;

    /* renamed from: b */
    public final /* synthetic */ a0<String> f30312b;

    /* renamed from: c */
    public final /* synthetic */ ReentrantLock f30313c;

    /* renamed from: d */
    public final /* synthetic */ Condition f30314d;

    public i(Object obj, a0<String> a0Var, ReentrantLock reentrantLock, Condition condition) {
        this.f30311a = obj;
        this.f30312b = a0Var;
        this.f30313c = reentrantLock;
        this.f30314d = condition;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [T, java.lang.String] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        gm.l.f(method, "method");
        gm.l.f(objArr, "objects");
        try {
            if (gm.l.a(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                            gm.l.e(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                            gm.l.e(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, new Object[0]) == null && gm.l.a(method3.invoke(obj3, new Object[0]), this.f30311a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                gm.l.e(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(obj3, new Object[0]);
                                if (invoke != null) {
                                    this.f30312b.f15485a = new BigInteger(1, (byte[]) invoke).toString(16);
                                    this.f30313c.lock();
                                    this.f30314d.signalAll();
                                    this.f30313c.unlock();
                                    return null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Log.d(j.f30316b, "Can't fetch checksum.", th2);
        }
        return null;
    }
}
