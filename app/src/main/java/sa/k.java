package sa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import va.a;

/* loaded from: classes.dex */
public final class k implements p<Object> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f26761a;

    public k(Constructor constructor) {
        this.f26761a = constructor;
    }

    @Override // sa.p
    public final Object a() {
        try {
            return this.f26761a.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            a.AbstractC0528a abstractC0528a = va.a.f29185a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            StringBuilder a10 = android.support.v4.media.d.a("Failed to invoke constructor '");
            a10.append(va.a.b(this.f26761a));
            a10.append("' with no args");
            throw new RuntimeException(a10.toString(), e11);
        } catch (InvocationTargetException e12) {
            StringBuilder a11 = android.support.v4.media.d.a("Failed to invoke constructor '");
            a11.append(va.a.b(this.f26761a));
            a11.append("' with no args");
            throw new RuntimeException(a11.toString(), e12.getCause());
        }
    }
}
