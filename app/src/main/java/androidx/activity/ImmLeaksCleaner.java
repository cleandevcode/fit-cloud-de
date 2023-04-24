package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements s {

    /* renamed from: b */
    public static int f718b;

    /* renamed from: c */
    public static Field f719c;

    /* renamed from: d */
    public static Field f720d;

    /* renamed from: e */
    public static Field f721e;

    /* renamed from: a */
    public Activity f722a;

    public ImmLeaksCleaner(Activity activity) {
        this.f722a = activity;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        if (bVar != k.b.ON_DESTROY) {
            return;
        }
        if (f718b == 0) {
            try {
                f718b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f720d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f721e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f719c = declaredField3;
                declaredField3.setAccessible(true);
                f718b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f718b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f722a.getSystemService("input_method");
            try {
                Object obj = f719c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f720d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f721e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
