package k1;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k1.o0;
import l1.j;
import l1.n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f18084c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f18085a;

    /* renamed from: b */
    public final C0313a f18086b;

    /* renamed from: k1.a$a */
    /* loaded from: classes.dex */
    public static final class C0313a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final a f18087a;

        public C0313a(a aVar) {
            this.f18087a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f18087a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            l1.k b10 = this.f18087a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f18687a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f18087a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z10;
            Object tag;
            boolean z11;
            boolean z12;
            Object obj;
            boolean z13;
            boolean z14;
            Object tag2;
            boolean z15;
            Object tag3;
            int i10;
            l1.j jVar = new l1.j(accessibilityNodeInfo);
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            int i11 = R.id.tag_screen_reader_focusable;
            boolean z16 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = true;
            } else {
                z10 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z10) {
                tag = Boolean.valueOf(o0.m.d(view));
            } else {
                tag = view.getTag(i11);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z11);
            } else {
                jVar.f(1, z11);
            }
            int i13 = R.id.tag_accessibility_heading;
            if (Build.VERSION.SDK_INT >= 28) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                obj = Boolean.valueOf(o0.m.c(view));
            } else {
                Object tag4 = view.getTag(i13);
                if (Boolean.class.isInstance(tag4)) {
                    obj = tag4;
                } else {
                    obj = null;
                }
            }
            Boolean bool2 = (Boolean) obj;
            if (bool2 != null && bool2.booleanValue()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i12 >= 28) {
                accessibilityNodeInfo.setHeading(z13);
            } else {
                jVar.f(2, z13);
            }
            int i14 = R.id.tag_accessibility_pane_title;
            if (i12 >= 28) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                tag2 = o0.m.b(view);
            } else {
                tag2 = view.getTag(i14);
                if (!CharSequence.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag2;
            if (i12 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            int i15 = R.id.tag_state_description;
            if (Build.VERSION.SDK_INT >= 30) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                tag3 = o0.o.a(view);
            } else {
                tag3 = view.getTag(i15);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence2 = (CharSequence) tag3;
            if (i12 < 30) {
                z16 = false;
            }
            if (z16) {
                accessibilityNodeInfo.setStateDescription(charSequence2);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
            }
            this.f18087a.d(view, jVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i12 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = 0; i16 < sparseArray.size(); i16++) {
                        if (((WeakReference) sparseArray.valueAt(i16)).get() == null) {
                            arrayList.add(Integer.valueOf(i16));
                        }
                    }
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        sparseArray.remove(((Integer) arrayList.get(i17)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    jVar.f18670a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    int i18 = R.id.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view.getTag(i18);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(i18, sparseArray2);
                    }
                    for (int i19 = 0; i19 < clickableSpanArr.length; i19++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i19];
                        int i20 = 0;
                        while (true) {
                            if (i20 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i20)).get())) {
                                    i10 = sparseArray2.keyAt(i20);
                                    break;
                                }
                                i20++;
                            } else {
                                i10 = l1.j.f18669d;
                                l1.j.f18669d = i10 + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i19]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i19];
                        Spanned spanned = (Spanned) text;
                        jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i21 = 0; i21 < list.size(); i21++) {
                jVar.b((j.a) list.get(i21));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f18087a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f18087a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f18087a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f18087a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f18087a.i(view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f18084c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f18085a = accessibilityDelegate;
        this.f18086b = new C0313a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f18085a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public l1.k b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f18085a, view);
        if (a10 != null) {
            return new l1.k(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f18085a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, l1.j jVar) {
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f18085a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f18085a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        ClickableSpan[] clickableSpanArr;
        String name;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            j.a aVar = (j.a) list.get(i11);
            if (aVar.a() == i10) {
                if (aVar.f18684d != null) {
                    Class<? extends n.a> cls = aVar.f18683c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e10) {
                            Class<? extends n.a> cls2 = aVar.f18683c;
                            if (cls2 == null) {
                                name = "null";
                            } else {
                                name = cls2.getName();
                            }
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e10);
                        }
                    }
                    z10 = aVar.f18684d.a(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f18085a, view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                        if (clickableSpan.equals(clickableSpanArr[i13])) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    clickableSpan.onClick(view);
                    z12 = true;
                }
            }
            return z12;
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f18085a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f18085a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
