package com.huawei.hms.feature.dynamic;

import a0.q;
import android.os.IBinder;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* renamed from: a */
    private final T f6988a;

    private ObjectWrapper(T t10) {
        this.f6988a = t10;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).f6988a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int i10 = 0;
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                i10++;
            }
        }
        if (i10 == 1) {
            if (!declaredFields[0].isAccessible()) {
                declaredFields[0].setAccessible(true);
                try {
                    return (T) declaredFields[0].get(asBinder);
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Get binder failed: null or not permitted.");
                }
            }
            throw new IllegalArgumentException("The field is accessible.");
        }
        throw new IllegalArgumentException(q.b(new StringBuilder("Got "), declaredFields.length, " fields, The number of field number should be 1."));
    }

    public static <T> IObjectWrapper wrap(T t10) {
        return new ObjectWrapper(t10);
    }
}
