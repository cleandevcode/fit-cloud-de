package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.y2;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.k;
import androidx.navigation.fragment.NavHostFragment;
import bi.z0;
import com.github.kilnn.wheellayout.OneWheelLayout;
import f1.b;
import f1.c;
import gm.l;
import i2.m;
import i2.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import om.h;
import p5.e;
import pm.a2;
import pm.o0;
import sa.p;
import tl.f;
import ub.d;
import um.q;
import y3.b0;
import y3.x0;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a */
    public static d f27957a;

    public static final OneWheelLayout b(LinearLayout linearLayout) {
        l.f(linearLayout, "<this>");
        Context context = linearLayout.getContext();
        l.e(context, "context");
        OneWheelLayout oneWheelLayout = new OneWheelLayout(context, null, 6);
        linearLayout.addView(oneWheelLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        return oneWheelLayout;
    }

    public static final void c(Object obj) {
        if (!(obj instanceof Serializable) && !(obj instanceof Parcelable)) {
            StringBuilder a10 = android.support.v4.media.d.a("Cannot parcel ");
            a10.append(obj.getClass().getSimpleName());
            throw new IllegalStateException(a10.toString().toString());
        }
    }

    public static void d(Object obj, StringBuilder sb2) {
        String hexString;
        int lastIndexOf;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb2.append(simpleName);
            sb2.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }

    public static final Bundle e(f... fVarArr) {
        Bundle bundle = new Bundle(fVarArr.length);
        for (f fVar : fVarArr) {
            String str = (String) fVar.f28286a;
            B b10 = fVar.f28287b;
            if (b10 == 0) {
                bundle.putString(str, null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(str, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(str, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(str, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(str, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(str, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(str, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(str, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                l.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b10);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b10);
                }
            } else {
                if (!(b10 instanceof Serializable)) {
                    if (b10 instanceof IBinder) {
                        b.a(bundle, str, (IBinder) b10);
                    } else if (b10 instanceof Size) {
                        c.a(bundle, str, (Size) b10);
                    } else if (b10 instanceof SizeF) {
                        c.b(bundle, str, (SizeF) b10);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                bundle.putSerializable(str, (Serializable) b10);
            }
        }
        return bundle;
    }

    public static final m f(r rVar) {
        o oVar;
        Dialog dialog;
        Window window;
        l.f(rVar, "<this>");
        int i10 = NavHostFragment.f2822q0;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f2537v) {
            if (rVar2 instanceof NavHostFragment) {
                z zVar = ((NavHostFragment) rVar2).f2823l0;
                if (zVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                return zVar;
            }
            r rVar3 = rVar2.m0().f2416x;
            if (rVar3 instanceof NavHostFragment) {
                z zVar2 = ((NavHostFragment) rVar3).f2823l0;
                if (zVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                return zVar2;
            }
        }
        View view = rVar.H;
        if (view != null) {
            return m6.c.a(view);
        }
        View view2 = null;
        if (rVar instanceof o) {
            oVar = (o) rVar;
        } else {
            oVar = null;
        }
        if (oVar != null && (dialog = oVar.f2477w0) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return m6.c.a(view2);
        }
        throw new IllegalStateException(androidx.fragment.app.p.a("Fragment ", rVar, " does not have a NavController set"));
    }

    public static final LifecycleCoroutineScopeImpl g(k kVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z10;
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) kVar.f2726a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            z10 = true;
            a2 a10 = z0.a();
            wm.c cVar = o0.f24381a;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(kVar, a10.s(q.f28935a.q0()));
            AtomicReference<Object> atomicReference = kVar.f2726a;
            while (true) {
                if (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    if (atomicReference.get() != null) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z10);
        wm.c cVar2 = o0.f24381a;
        z0.g(lifecycleCoroutineScopeImpl, q.f28935a.q0(), 0, new androidx.lifecycle.q(lifecycleCoroutineScopeImpl, null), 2);
        return lifecycleCoroutineScopeImpl;
    }

    public static void h(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void i(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static void j(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof y2) {
                editorInfo.hintText = ((y2) parent).a();
                return;
            }
        }
    }

    public static final Bundle k(b0 b0Var, boolean z10) {
        boolean z11;
        int i10;
        Method method;
        l.f(b0Var, "state");
        Class<?> cls = b0Var.getClass();
        Constructor m10 = m(cls);
        if (m10 == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        Annotation[][] parameterAnnotations = m10.getParameterAnnotations();
        l.e(parameterAnnotations, "constructor.parameterAnnotations");
        int length = parameterAnnotations.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = i13 + 1;
            Annotation[] annotationArr = parameterAnnotations[i12];
            l.e(annotationArr, "p");
            int length2 = annotationArr.length;
            int i15 = 0;
            while (true) {
                if (i15 < length2) {
                    if (annotationArr[i15] instanceof x0) {
                        z11 = false;
                        break;
                    }
                    i15++;
                } else {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                String a10 = u0.a("component", i14);
                try {
                    method = cls.getDeclaredMethod(a10, new Class[i11]);
                } catch (NoSuchMethodException unused) {
                    Method[] declaredMethods = cls.getDeclaredMethods();
                    l.e(declaredMethods, "declaredMethods");
                    for (Method method2 : declaredMethods) {
                        String name = method2.getName();
                        l.e(name, "it.name");
                        if (h.a0(name, a10 + '$', false)) {
                            method = method2;
                        }
                    }
                    i10 = 0;
                    method = null;
                }
                i10 = 0;
                if (method != null) {
                    method.setAccessible(true);
                    Object invoke = method.invoke(b0Var, new Object[i10]);
                    if (z10) {
                        if (invoke instanceof Collection) {
                            Iterator it = ul.q.G((Iterable) invoke).iterator();
                            while (it.hasNext()) {
                                c(it.next());
                            }
                        } else if (invoke instanceof Map) {
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry : ((Map) invoke).entrySet()) {
                                Object value = entry.getValue();
                                if (value != null) {
                                    arrayList.add(value);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                c(it2.next());
                            }
                        }
                    }
                    String valueOf = String.valueOf(i13);
                    if (invoke instanceof Parcelable) {
                        bundle.putParcelable(valueOf, (Parcelable) invoke);
                    } else if (invoke instanceof Serializable) {
                        bundle.putSerializable(valueOf, (Serializable) invoke);
                    } else if (invoke == null) {
                        bundle.putString(valueOf, null);
                    } else {
                        throw new IllegalStateException(("Cannot persist " + valueOf + ". It must be null, Serializable, or Parcelable.").toString());
                    }
                } else {
                    StringBuilder a11 = androidx.activity.result.d.a("Unable to find function ", a10, " in ");
                    a11.append(gm.b0.a(cls.getClass()).a());
                    throw new IllegalStateException(a11.toString().toString());
                }
            }
            i12++;
            i11 = 0;
            i13 = i14;
        }
        return bundle;
    }

    public static void l(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final Constructor m(Class cls) {
        boolean z10;
        boolean z11;
        Constructor<?>[] constructors = cls.getConstructors();
        l.e(constructors, "constructors");
        for (Constructor<?> constructor : constructors) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            l.e(parameterAnnotations, "constructor.parameterAnnotations");
            int length = parameterAnnotations.length;
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                Annotation[] annotationArr = parameterAnnotations[i10];
                l.e(annotationArr, "paramAnnotations");
                int length2 = annotationArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        z11 = false;
                        break;
                    } else if (annotationArr[i11] instanceof x0) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    break;
                }
                i10++;
            }
            if (z10) {
                return constructor;
            }
        }
        return null;
    }

    public static final b0 n(Bundle bundle, b0 b0Var, boolean z10) {
        boolean z11;
        l.f(bundle, "bundle");
        l.f(b0Var, "initialState");
        Class<?> cls = b0Var.getClass();
        Constructor m10 = m(cls);
        if (m10 == null) {
            return b0Var;
        }
        bundle.setClassLoader(cls.getClassLoader());
        Method[] declaredMethods = cls.getDeclaredMethods();
        l.e(declaredMethods, "jvmClass.declaredMethods");
        for (Method method : declaredMethods) {
            if (l.a(method.getName(), "copy$default")) {
                int length = m10.getParameterTypes().length;
                int i10 = (length / 32) + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = 0;
                }
                Object[] objArr = new Object[length];
                objArr[0] = b0Var;
                int i12 = 0;
                while (true) {
                    Object obj = null;
                    if (i12 < length) {
                        String valueOf = String.valueOf(i12);
                        if (bundle.containsKey(valueOf)) {
                            objArr[i12] = bundle.get(valueOf);
                        } else {
                            if (z10) {
                                Annotation[] annotationArr = m10.getParameterAnnotations()[i12];
                                l.e(annotationArr, "constructor.parameterAnnotations[i]");
                                int length2 = annotationArr.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length2) {
                                        if (annotationArr[i13] instanceof x0) {
                                            z11 = true;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        z11 = false;
                                        break;
                                    }
                                }
                                if (z11) {
                                    throw new IllegalStateException(("savedInstanceState bundle should have a key for state property at position " + i12 + " but it was missing.").toString());
                                }
                            }
                            int i14 = i12 / 32;
                            iArr[i14] = iArr[i14] | (1 << (i12 % 32));
                            Class<?> cls2 = method.getParameterTypes()[i12 + 1];
                            l.e(cls2, "copyFunction.parameterTypes[i + 1]");
                            if (l.a(cls2, Integer.TYPE)) {
                                obj = 0;
                            } else if (l.a(cls2, Boolean.TYPE)) {
                                obj = Boolean.FALSE;
                            } else if (l.a(cls2, Float.TYPE)) {
                                obj = Float.valueOf(0.0f);
                            } else if (l.a(cls2, Character.TYPE)) {
                                obj = 'A';
                            } else if (l.a(cls2, Byte.TYPE)) {
                                obj = Byte.MIN_VALUE;
                            } else if (l.a(cls2, Short.TYPE)) {
                                obj = Short.MIN_VALUE;
                            } else if (l.a(cls2, Long.TYPE)) {
                                obj = 0L;
                            } else if (l.a(cls2, Double.TYPE)) {
                                obj = Double.valueOf(0.0d);
                            }
                            objArr[i12] = obj;
                        }
                        i12++;
                    } else {
                        e eVar = new e(0);
                        ((ArrayList) eVar.f23905a).add(b0Var);
                        eVar.j(objArr);
                        Integer[] numArr = new Integer[i10];
                        for (int i15 = 0; i15 < i10; i15++) {
                            numArr[i15] = Integer.valueOf(iArr[i15]);
                        }
                        eVar.j(numArr);
                        ((ArrayList) eVar.f23905a).add(null);
                        Object invoke = method.invoke(null, ((ArrayList) eVar.f23905a).toArray(new Object[((ArrayList) eVar.f23905a).size()]));
                        l.d(invoke, "null cannot be cast to non-null type T of com.airbnb.mvrx.PersistStateKt.restorePersistedMavericksState");
                        return (b0) invoke;
                    }
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float o(float f10) {
        BigDecimal scale = new BigDecimal(f10).setScale(1, 4);
        l.e(scale, "bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP)");
        return scale.floatValue();
    }

    public static final void p(m7.b bVar, float f10) {
        float o10 = o(f10);
        bVar.f((int) o10, ((int) (o10 * 10)) % 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q(android.os.Bundle r3, androidx.fragment.app.r r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "<this>"
            gm.l.f(r4, r0)
            androidx.fragment.app.j0 r4 = r4.m0()
            java.util.Map<java.lang.String, androidx.fragment.app.j0$m> r0 = r4.f2404l
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.j0$m r0 = (androidx.fragment.app.j0.m) r0
            if (r0 == 0) goto L25
            androidx.lifecycle.k$c r1 = androidx.lifecycle.k.c.STARTED
            androidx.lifecycle.k r2 = r0.f2429a
            androidx.lifecycle.k$c r2 = r2.b()
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L25
            r0.e(r3, r5)
            goto L2a
        L25:
            java.util.Map<java.lang.String, android.os.Bundle> r4 = r4.f2403k
            r4.put(r5, r3)
        L2a:
            r4 = 2
            boolean r4 = androidx.fragment.app.j0.J(r4)
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Setting fragment result with key "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " and result "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a.q(android.os.Bundle, androidx.fragment.app.r, java.lang.String):void");
    }

    public static final Date r(int[] iArr, GregorianCalendar gregorianCalendar) {
        l.f(iArr, "<this>");
        if (gregorianCalendar == null) {
            gregorianCalendar = new GregorianCalendar();
        }
        gregorianCalendar.set(1, iArr[0]);
        gregorianCalendar.set(2, iArr[1] - 1);
        gregorianCalendar.set(5, iArr[2]);
        Date time = gregorianCalendar.getTime();
        l.e(time, "calendar.time");
        return time;
    }

    public static final int[] s(Date date, GregorianCalendar gregorianCalendar) {
        l.f(date, "<this>");
        if (gregorianCalendar == null) {
            gregorianCalendar = new GregorianCalendar();
        }
        gregorianCalendar.setTime(date);
        return new int[]{gregorianCalendar.get(1), gregorianCalendar.get(2) + 1, gregorianCalendar.get(5)};
    }

    public static boolean u(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static byte v(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean w(byte b10) {
        if (b10 != 0) {
            if (b10 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static String x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "GRANULARITY_FINE";
                }
                throw new IllegalArgumentException();
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }

    @Override // sa.p
    public Object a() {
        return new LinkedHashMap();
    }
}
