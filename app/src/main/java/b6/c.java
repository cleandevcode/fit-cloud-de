package b6;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f4009a = new c();

    /* renamed from: b */
    public static final List<Class<? extends View>> f4010b = h7.a.q(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            l.f(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f4010b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it = t5.f.a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(a((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            l.f(view, "view");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = t5.f.a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View view) {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            l.f(view, "hostView");
            String i10 = t5.f.i(view);
            if (i10.length() > 0) {
                return i10;
            }
            String join = TextUtils.join(" ", f4009a.c(view));
            l.e(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (i6.a.b(c.class)) {
            return;
        }
        try {
            l.f(view, "view");
            try {
                String i10 = t5.f.i(view);
                String g10 = t5.f.g(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", t5.f.b(view));
                if (i10.length() > 0) {
                    jSONObject.put(InnerShareParams.TEXT, i10);
                }
                if (g10.length() > 0) {
                    jSONObject.put("hint", g10);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = t5.f.a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i10 = t5.f.i(view2);
                if (i10.length() > 0) {
                    arrayList.add(i10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
