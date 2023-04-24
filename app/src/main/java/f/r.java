package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.l0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b */
    public static final Class<?>[] f13962b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f13963c = {16843375};

    /* renamed from: d */
    public static final int[] f13964d = {16844160};

    /* renamed from: e */
    public static final int[] f13965e = {16844156};

    /* renamed from: f */
    public static final int[] f13966f = {16844148};

    /* renamed from: g */
    public static final String[] f13967g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final o0.h<String, Constructor<? extends View>> f13968h = new o0.h<>();

    /* renamed from: a */
    public final Object[] f13969a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a */
        public final View f13970a;

        /* renamed from: b */
        public final String f13971b;

        /* renamed from: c */
        public Method f13972c;

        /* renamed from: d */
        public Context f13973d;

        public a(View view, String str) {
            this.f13970a = view;
            this.f13971b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String sb2;
            Method method;
            if (this.f13972c == null) {
                Context context = this.f13970a.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f13971b, View.class)) != null) {
                            this.f13972c = method;
                            this.f13973d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                }
                int id2 = this.f13970a.getId();
                if (id2 == -1) {
                    sb2 = "";
                } else {
                    StringBuilder a10 = android.support.v4.media.d.a(" with id '");
                    a10.append(this.f13970a.getContext().getResources().getResourceEntryName(id2));
                    a10.append("'");
                    sb2 = a10.toString();
                }
                StringBuilder a11 = android.support.v4.media.d.a("Could not find method ");
                a11.append(this.f13971b);
                a11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a11.append(this.f13970a.getClass());
                a11.append(sb2);
                throw new IllegalStateException(a11.toString());
            }
            try {
                this.f13972c.invoke(this.f13973d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public androidx.appcompat.widget.d a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    public androidx.appcompat.widget.f b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public androidx.appcompat.widget.g c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    public l0 d(Context context, AttributeSet attributeSet) {
        return new l0(context, attributeSet, R.attr.radioButtonStyle);
    }

    public d1 e(Context context, AttributeSet attributeSet) {
        return new d1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        o0.h<String, Constructor<? extends View>> hVar = f13968h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f13962b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f13969a);
    }
}
