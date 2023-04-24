package q5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import gm.l;
import java.util.ArrayList;
import java.util.Iterator;
import t5.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f24592a = new c();

    public static final ArrayList a(View view) {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup h10 = f.h(view);
            if (h10 != null) {
                Iterator it = f.a(h10).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f24592a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }

    public static final ArrayList b(View view) {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(f.g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    l.e(resourceName, "resourceName");
                    Object[] array = new om.c("/").a(resourceName).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if ((str.length() > 0) && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }

    public static final boolean d(ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        if (i6.a.b(c.class)) {
            return false;
        }
        try {
            l.f(arrayList, "indicators");
            l.f(arrayList2, "keys");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c cVar = f24592a;
                cVar.getClass();
                if (!i6.a.b(cVar)) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (om.l.c0(str, (String) it2.next(), false)) {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                }
                z10 = false;
                continue;
                if (z10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return false;
        }
    }

    public final ArrayList c(View view) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator it = f.a(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if ((obj.length() > 0) && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
