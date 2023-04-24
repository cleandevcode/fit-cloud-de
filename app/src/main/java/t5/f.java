package t5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import cn.sharesdk.framework.InnerShareParams;
import d6.m0;
import gm.l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import o5.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final f f27790a = new f();

    /* renamed from: b */
    public static final String f27791b = f.class.getCanonicalName();

    /* renamed from: c */
    public static WeakReference<View> f27792c = new WeakReference<>(null);

    /* renamed from: d */
    public static Method f27793d;

    public static final ArrayList a(View view) {
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                int i10 = 0;
                if (childCount > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        arrayList.add(((ViewGroup) view).getChildAt(i10));
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:127:0x005e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final int b(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.b(android.view.View):int");
    }

    public static final JSONObject c(View view) {
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            l.f(view, "view");
            if (l.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f27792c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a10 = a(view);
                int i10 = 0;
                int size = a10.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(c((View) a10.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(f27791b, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            l.e(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            l.e(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnClickListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        try {
            if (i6.a.b(f.class)) {
                return null;
            }
            try {
                Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                l.e(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return null;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                l.e(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnTouchListener\")");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                if (obj2 != null) {
                    return (View.OnTouchListener) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                m0 m0Var = m0.f12709a;
                v vVar = v.f22837a;
                return null;
            } catch (IllegalAccessException unused2) {
                m0 m0Var2 = m0.f12709a;
                v vVar2 = v.f22837a;
                return null;
            }
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0022 A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:34:0x000a, B:36:0x000e, B:37:0x0010, B:46:0x0022, B:38:0x0015, B:40:0x0019), top: B:54:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(android.view.View r3) {
        /*
            java.lang.Class<t5.f> r0 = t5.f.class
            boolean r1 = i6.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r3 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L15
            android.widget.EditText r3 = (android.widget.EditText) r3     // Catch: java.lang.Throwable -> L2b
        L10:
            java.lang.CharSequence r3 = r3.getHint()     // Catch: java.lang.Throwable -> L2b
            goto L1d
        L15:
            boolean r1 = r3 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1c
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> L2b
            goto L10
        L1c:
            r3 = r2
        L1d:
            java.lang.String r1 = ""
            if (r3 != 0) goto L22
            goto L2a
        L22:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            return r1
        L2b:
            r3 = move-exception
            i6.a.a(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.g(android.view.View):java.lang.String");
    }

    public static final ViewGroup h(View view) {
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (i6.a.b(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i10 = 0;
                if (view instanceof DatePicker) {
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    l.e(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    l.e(currentMinute, "view.currentMinute");
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i10);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            } else if (i11 >= childCount) {
                                break;
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
                l.e(valueOf, "java.lang.String.format(format, *args)");
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
            return null;
        }
    }

    public static final void m(View view, JSONObject jSONObject) {
        if (i6.a.b(f.class)) {
            return;
        }
        try {
            l.f(view, "view");
            try {
                String i10 = i(view);
                String g10 = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", b(view));
                jSONObject.put("id", view.getId());
                if (!d.b(view)) {
                    jSONObject.put(InnerShareParams.TEXT, m0.f(m0.O(i10)));
                } else {
                    jSONObject.put(InnerShareParams.TEXT, "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", m0.f(m0.O(g10)));
                if (tag != null) {
                    jSONObject.put("tag", m0.f(m0.O(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", m0.f(m0.O(contentDescription.toString())));
                }
                jSONObject.put("dimension", f27790a.d(view));
            } catch (JSONException unused) {
                m0 m0Var = m0.f12709a;
                v vVar = v.f22837a;
            }
        } catch (Throwable th2) {
            i6.a.a(f.class, th2);
        }
    }

    public final JSONObject d(View view) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e10) {
                Log.e(f27791b, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final View j(float[] fArr, View view) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            k();
            Method method = f27793d;
            if (method != null && view != null) {
                try {
                    if (method != null) {
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke != null) {
                            View view2 = (View) invoke;
                            if (view2.getId() > 0) {
                                ViewParent parent = view2.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalAccessException unused) {
                    m0 m0Var = m0.f12709a;
                    v vVar = v.f22837a;
                    return null;
                } catch (InvocationTargetException unused2) {
                    m0 m0Var2 = m0.f12709a;
                    v vVar2 = v.f22837a;
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void k() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            if (f27793d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f27793d = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException unused) {
                m0 m0Var = m0.f12709a;
                v vVar = v.f22837a;
            } catch (NoSuchMethodException unused2) {
                m0 m0Var2 = m0.f12709a;
                v vVar2 = v.f22837a;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final boolean l(View view, View view2) {
        if (i6.a.b(this)) {
            return false;
        }
        try {
            l.f(view, "view");
            if (!l.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!i6.a.b(this)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                fArr = new float[]{iArr[0], iArr[1]};
            }
            View j10 = j(fArr, view2);
            if (j10 == null) {
                return false;
            }
            if (j10.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }
}
