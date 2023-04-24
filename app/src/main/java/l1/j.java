package l1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.n;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d */
    public static int f18669d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f18670a;

    /* renamed from: b */
    public int f18671b = -1;

    /* renamed from: c */
    public int f18672c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e */
        public static final a f18673e;

        /* renamed from: f */
        public static final a f18674f;

        /* renamed from: g */
        public static final a f18675g;

        /* renamed from: h */
        public static final a f18676h;

        /* renamed from: i */
        public static final a f18677i;

        /* renamed from: j */
        public static final a f18678j;

        /* renamed from: k */
        public static final a f18679k;

        /* renamed from: l */
        public static final a f18680l;

        /* renamed from: a */
        public final Object f18681a;

        /* renamed from: b */
        public final int f18682b;

        /* renamed from: c */
        public final Class<? extends n.a> f18683c;

        /* renamed from: d */
        public final n f18684d;

        static {
            new a(1);
            new a(2);
            new a(4);
            new a(8);
            f18673e = new a(16);
            new a(32);
            new a(64);
            new a(128);
            new a(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, n.b.class);
            new a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE, n.b.class);
            new a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, n.c.class);
            new a(2048, n.c.class);
            f18674f = new a(4096);
            f18675g = new a(DfuBaseService.ERROR_REMOTE_MASK);
            new a(DfuBaseService.ERROR_CONNECTION_MASK);
            new a(DfuBaseService.ERROR_CONNECTION_STATE_MASK);
            new a(65536);
            new a(131072, n.g.class);
            f18676h = new a(262144);
            f18677i = new a(524288);
            f18678j = new a(1048576);
            new a(2097152, n.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, n.e.class);
            f18679k = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f18680l = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, n.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, n.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public a(int i10) {
            this(null, i10, null, null, null);
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(Object obj, int i10, String str, n nVar, Class cls) {
            this.f18682b = i10;
            this.f18684d = nVar;
            this.f18681a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, str) : obj;
            this.f18683c = cls;
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f18681a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f18681a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f18681a;
                Object obj3 = ((a) obj).f18681a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f18681a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Object f18685a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f18685a = collectionInfo;
        }

        public static b a(int i10, int i11, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final Object f18686a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f18686a = collectionItemInfo;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
        }
    }

    public j(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f18670a = accessibilityNodeInfo;
    }

    public final void a(int i10) {
        this.f18670a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f18670a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f18681a);
    }

    public final ArrayList c(String str) {
        ArrayList<Integer> integerArrayList = this.f18670a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f18670a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f18670a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        if (!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f18670a.getText(), 0, this.f18670a.getText().length()));
            for (int i10 = 0; i10 < c10.size(); i10++) {
                spannableString.setSpan(new l1.a(((Integer) c13.get(i10)).intValue(), this, this.f18670a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
            }
            return spannableString;
        }
        return this.f18670a.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f18670a;
            if (accessibilityNodeInfo == null) {
                if (jVar.f18670a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(jVar.f18670a)) {
                return false;
            }
            return this.f18672c == jVar.f18672c && this.f18671b == jVar.f18671b;
        }
        return false;
    }

    public final void f(int i10, boolean z10) {
        Bundle extras = this.f18670a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final void g(CharSequence charSequence) {
        this.f18670a.setClassName(charSequence);
    }

    public final void h(c cVar) {
        this.f18670a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f18686a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f18670a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f18670a.setContentDescription(charSequence);
    }

    public final void j(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f18670a.setHintText(str);
        } else {
            this.f18670a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void k(boolean z10) {
        this.f18670a.setScrollable(z10);
    }

    public final void l(CharSequence charSequence) {
        this.f18670a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f18670a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(this.f18670a.getPackageName());
        sb2.append("; className: ");
        sb2.append(this.f18670a.getClassName());
        sb2.append("; text: ");
        sb2.append(e());
        sb2.append("; contentDescription: ");
        sb2.append(this.f18670a.getContentDescription());
        sb2.append("; viewId: ");
        sb2.append(this.f18670a.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (f1.a.b()) {
            string = this.f18670a.getUniqueId();
        } else {
            string = this.f18670a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(this.f18670a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f18670a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(this.f18670a.isFocusable());
        sb2.append("; focused: ");
        sb2.append(this.f18670a.isFocused());
        sb2.append("; selected: ");
        sb2.append(this.f18670a.isSelected());
        sb2.append("; clickable: ");
        sb2.append(this.f18670a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f18670a.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(this.f18670a.isEnabled());
        sb2.append("; password: ");
        sb2.append(this.f18670a.isPassword());
        sb2.append("; scrollable: " + this.f18670a.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f18670a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                emptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < emptyList.size(); i11++) {
            a aVar = (a) emptyList.get(i11);
            int a10 = aVar.a();
            if (a10 != 1) {
                if (a10 != 2) {
                    switch (a10) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case DfuBaseService.ERROR_REMOTE_TYPE_LEGACY /* 256 */:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case DfuBaseService.ERROR_REMOTE_TYPE_SECURE /* 512 */:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED /* 1024 */:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case DfuBaseService.ERROR_REMOTE_MASK /* 8192 */:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case DfuBaseService.ERROR_CONNECTION_MASK /* 16384 */:
                            str = "ACTION_COPY";
                            break;
                        case DfuBaseService.ERROR_CONNECTION_STATE_MASK /* 32768 */:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case 16908354:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (a10) {
                                case 16908342:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case 16908343:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case 16908344:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case 16908345:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case 16908346:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case 16908347:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case 16908348:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case 16908349:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (a10) {
                                        case 16908356:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case 16908357:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case 16908358:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case 16908359:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case 16908360:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case 16908361:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case 16908362:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (a10) {
                                                case 16908372:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case 16908373:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case 16908374:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case 16908375:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                str = aVar.b().toString();
            }
            sb2.append(str);
            if (i11 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
