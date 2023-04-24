package ao;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: c */
    public static final y f3903c;

    /* renamed from: a */
    public final boolean f3904a;

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f3905b;

    /* loaded from: classes2.dex */
    public static final class a extends y {

        /* renamed from: ao.y$a$a */
        /* loaded from: classes2.dex */
        public static final class ExecutorC0044a implements Executor {

            /* renamed from: a */
            public final Handler f3906a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f3906a.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // ao.y
        public final Executor a() {
            return new ExecutorC0044a();
        }

        @Override // ao.y
        public final Object b(Class cls, Object obj, Method method, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(cls, obj, method, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        y yVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            yVar = new a();
        } else {
            yVar = new y(true);
        }
        f3903c = yVar;
    }

    public y(boolean z10) {
        this.f3904a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f3905b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Class cls, Object obj, Method method, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f3905b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
