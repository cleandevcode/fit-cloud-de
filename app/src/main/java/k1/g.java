package k1;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static boolean f18113a = false;

    /* renamed from: b */
    public static Method f18114b = null;

    /* renamed from: c */
    public static boolean f18115c = false;

    /* renamed from: d */
    public static Field f18116d;

    /* loaded from: classes.dex */
    public interface a {
        boolean u(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = o0.s.f18177d;
            int i10 = R.id.tag_unhandled_key_event_manager;
            o0.s sVar = (o0.s) view.getTag(i10);
            if (sVar == null) {
                sVar = new o0.s();
                view.setTag(i10, sVar);
            }
            WeakReference<KeyEvent> weakReference = sVar.f18180c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                sVar.f18180c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (sVar.f18179b == null) {
                    sVar.f18179b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f18179b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 == null || !o0.g.b(view2)) {
                        return true;
                    }
                    o0.s.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"LambdaLast"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(k1.g.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.u(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L83
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L66
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L66
            if (r8 == 0) goto L66
            boolean r1 = k1.g.f18113a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            k1.g.f18114b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            k1.g.f18113a = r3
        L4c:
            java.lang.reflect.Method r1 = k1.g.f18114b
            if (r1 == 0) goto L63
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r4[r0] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5b
            goto L63
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
        L63:
            if (r0 == 0) goto L66
            goto L82
        L66:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6d
            goto L82
        L6d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = k1.o0.c(r7, r10)
            if (r8 == 0) goto L78
            goto L82
        L78:
            if (r7 == 0) goto L7e
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7e:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L82:
            return r3
        L83:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld7
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = k1.g.f18115c
            if (r7 != 0) goto L9c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L9a
            k1.g.f18116d = r7     // Catch: java.lang.NoSuchFieldException -> L9a
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L9a
        L9a:
            k1.g.f18115c = r3
        L9c:
            java.lang.reflect.Field r7 = k1.g.f18116d
            if (r7 == 0) goto La8
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La7
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La7
            goto La9
        La7:
        La8:
            r7 = r2
        La9:
            if (r7 == 0) goto Lb6
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb6
            goto Ld6
        Lb6:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lc1
            goto Ld6
        Lc1:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = k1.o0.c(r7, r10)
            if (r8 == 0) goto Lcc
            goto Ld6
        Lcc:
            if (r7 == 0) goto Ld2
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Ld2:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld6:
            return r3
        Ld7:
            if (r8 == 0) goto Ldf
            boolean r8 = k1.o0.c(r8, r10)
            if (r8 != 0) goto Le5
        Ldf:
            boolean r7 = r7.u(r10)
            if (r7 == 0) goto Le6
        Le5:
            r0 = 1
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.g.b(k1.g$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
