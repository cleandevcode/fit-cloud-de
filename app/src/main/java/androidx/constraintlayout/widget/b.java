package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;
import java.util.HashMap;
import s0.i;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a */
    public int[] f2000a;

    /* renamed from: b */
    public int f2001b;

    /* renamed from: c */
    public Context f2002c;

    /* renamed from: d */
    public i f2003d;

    /* renamed from: e */
    public String f2004e;

    /* renamed from: f */
    public String f2005f;

    /* renamed from: g */
    public View[] f2006g;

    /* renamed from: h */
    public HashMap<Integer, String> f2007h;

    public b(Context context) {
        super(context);
        this.f2000a = new int[32];
        this.f2006g = null;
        this.f2007h = new HashMap<>();
        this.f2002c = context;
        i(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2000a = new int[32];
        this.f2006g = null;
        this.f2007h = new HashMap<>();
        this.f2002c = context;
        i(attributeSet);
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        Integer num;
        HashMap<String, Integer> hashMap;
        if (str == null || str.length() == 0 || this.f2002c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getParent();
        }
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            if ((trim instanceof String) && (hashMap = constraintLayout.f1935m) != null && hashMap.containsKey(trim)) {
                num = constraintLayout.f1935m.get(trim);
            } else {
                num = null;
            }
            if (num instanceof Integer) {
                i10 = num.intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = h(constraintLayout, trim);
        }
        if (i10 == 0) {
            try {
                i10 = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i10 == 0) {
            i10 = this.f2002c.getResources().getIdentifier(trim, "id", this.f2002c.getPackageName());
        }
        if (i10 != 0) {
            this.f2007h.put(Integer.valueOf(i10), trim);
            d(i10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void d(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2001b + 1;
        int[] iArr = this.f2000a;
        if (i11 > iArr.length) {
            this.f2000a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2000a;
        int i12 = this.f2001b;
        iArr2[i12] = i10;
        this.f2001b = i12 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f2002c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = null;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    StringBuilder a10 = android.support.v4.media.d.a("to use ConstraintTag view ");
                    a10.append(childAt.getClass().getSimpleName());
                    a10.append(" must have an ID");
                    Log.w("ConstraintHelper", a10.toString());
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2001b; i10++) {
            View view = constraintLayout.f1923a.get(this.f2000a[i10]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2000a, this.f2001b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2002c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2004e = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2005f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(s0.d dVar, boolean z10) {
    }

    public final void k() {
        if (this.f2003d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f1971q0 = this.f2003d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2004e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2005f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2004e = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2001b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2005f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2001b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                e(str.substring(i10));
                return;
            } else {
                e(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2004e = null;
        this.f2001b = 0;
        for (int i10 : iArr) {
            d(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2004e == null) {
            d(i10);
        }
    }
}
