package p8;

import android.os.IBinder;
import androidx.appcompat.widget.u0;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i8.p;
import java.lang.reflect.Field;
import p8.b;

/* loaded from: classes.dex */
public final class c<T> extends b.a {

    /* renamed from: a */
    public final Object f23959a;

    public c(Object obj) {
        this.f23959a = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T f0(b bVar) {
        if (bVar instanceof c) {
            return (T) ((c) bVar).f23959a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            p.f(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(u0.a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
