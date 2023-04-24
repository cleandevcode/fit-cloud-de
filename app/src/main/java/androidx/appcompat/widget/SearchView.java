package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.o0;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements k.b {

    /* renamed from: v0 */
    public static final o f1123v0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int H;
    public final Intent L;
    public final Intent M;
    public final CharSequence Q;
    public View.OnFocusChangeListener U;
    public View.OnClickListener V;
    public boolean W;

    /* renamed from: c0 */
    public boolean f1124c0;

    /* renamed from: d0 */
    public p1.a f1125d0;

    /* renamed from: e0 */
    public boolean f1126e0;

    /* renamed from: f0 */
    public CharSequence f1127f0;

    /* renamed from: g0 */
    public boolean f1128g0;

    /* renamed from: h0 */
    public boolean f1129h0;

    /* renamed from: i0 */
    public int f1130i0;

    /* renamed from: j0 */
    public boolean f1131j0;

    /* renamed from: k0 */
    public String f1132k0;

    /* renamed from: l0 */
    public CharSequence f1133l0;

    /* renamed from: m0 */
    public boolean f1134m0;

    /* renamed from: n0 */
    public int f1135n0;

    /* renamed from: o0 */
    public SearchableInfo f1136o0;

    /* renamed from: p */
    public final SearchAutoComplete f1137p;

    /* renamed from: p0 */
    public Bundle f1138p0;

    /* renamed from: q */
    public final View f1139q;

    /* renamed from: q0 */
    public final b f1140q0;

    /* renamed from: r */
    public final View f1141r;

    /* renamed from: r0 */
    public c f1142r0;

    /* renamed from: s */
    public final View f1143s;

    /* renamed from: s0 */
    public final WeakHashMap<String, Drawable.ConstantState> f1144s0;

    /* renamed from: t */
    public final ImageView f1145t;

    /* renamed from: t0 */
    public g f1146t0;

    /* renamed from: u */
    public final ImageView f1147u;

    /* renamed from: u0 */
    public a f1148u0;

    /* renamed from: v */
    public final ImageView f1149v;

    /* renamed from: w */
    public final ImageView f1150w;

    /* renamed from: x */
    public final View f1151x;

    /* renamed from: y */
    public q f1152y;

    /* renamed from: z */
    public Rect f1153z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: e */
        public int f1154e;

        /* renamed from: f */
        public SearchView f1155f;

        /* renamed from: g */
        public boolean f1156g;

        /* renamed from: h */
        public final a f1157h;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
                SearchAutoComplete.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f1156g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f1156g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f1157h = new a();
            this.f1154e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    return (i10 < 640 || i11 < 480) ? 160 : 192;
                }
                return 192;
            }
            return DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f1123v0;
            oVar.getClass();
            o.a();
            Method method = oVar.f1171c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1154e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1156g) {
                removeCallbacks(this.f1157h);
                post(this.f1157h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f1155f;
            searchView.w(searchView.f1124c0);
            searchView.post(searchView.f1140q0);
            if (searchView.f1137p.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1155f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1155f.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f1156g = true;
                Context context = getContext();
                o oVar = SearchView.f1123v0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1156g = false;
                removeCallbacks(this.f1157h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f1156g = true;
            } else {
                this.f1156g = false;
                removeCallbacks(this.f1157h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1155f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1154e = i10;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
            SearchView.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f1137p.getText();
            searchView.f1133l0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.v(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.f1131j0 && !searchView.f1124c0 && z11) {
                searchView.f1147u.setVisibility(8);
                i13 = 0;
            }
            searchView.f1150w.setVisibility(i13);
            searchView.r();
            searchView.u();
            searchView.getClass();
            searchView.f1132k0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            SearchView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p1.a aVar = SearchView.this.f1125d0;
            if (aVar instanceof f2) {
                aVar.c(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.U;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            SearchView searchView = SearchView.this;
            if (searchView.f1151x.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f1141r.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = x2.a(searchView);
                if (searchView.W) {
                    i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i18 = 0;
                }
                searchView.f1137p.getDropDownBackground().getPadding(rect);
                if (a10) {
                    i19 = -rect.left;
                } else {
                    i19 = paddingLeft - (rect.left + i18);
                }
                searchView.f1137p.setDropDownHorizontalOffset(i19);
                searchView.f1137p.setDropDownWidth((((searchView.f1151x.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            if (view == searchView.f1145t) {
                searchView.w(false);
                searchView.f1137p.requestFocus();
                searchView.f1137p.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.V;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f1149v) {
                searchView.m();
            } else if (view == searchView.f1147u) {
                searchView.q();
            } else if (view == searchView.f1150w) {
                SearchableInfo searchableInfo = searchView.f1136o0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.L);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.M, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.f1137p) {
                searchView.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
            SearchView.this = r1;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z10;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.f1136o0 == null) {
                return false;
            }
            if (searchView.f1137p.isPopupShowing() && SearchView.this.f1137p.getListSelection() != -1) {
                SearchView searchView2 = SearchView.this;
                if (searchView2.f1136o0 == null || searchView2.f1125d0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i10 != 66 && i10 != 84 && i10 != 61) {
                    if (i10 != 21 && i10 != 22) {
                        if (i10 != 19) {
                            return false;
                        }
                        searchView2.f1137p.getListSelection();
                        return false;
                    }
                    if (i10 == 21) {
                        length = 0;
                    } else {
                        length = searchView2.f1137p.length();
                    }
                    searchView2.f1137p.setSelection(length);
                    searchView2.f1137p.setListSelection(0);
                    searchView2.f1137p.clearListSelection();
                    searchView2.f1137p.a();
                    return true;
                }
                return searchView2.n(searchView2.f1137p.getListSelection());
            }
            if (TextUtils.getTrimmedLength(SearchView.this.f1137p.getText()) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView3 = SearchView.this;
            searchView3.getContext().startActivity(searchView3.j("android.intent.action.SEARCH", null, null, searchView3.f1137p.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
            SearchView.this = r1;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.n(i10);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
            SearchView.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.o(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a */
        public Method f1169a;

        /* renamed from: b */
        public Method f1170b;

        /* renamed from: c */
        public Method f1171c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1169a = null;
            this.f1170b = null;
            this.f1171c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1169a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1170b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1171c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends q1.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c */
        public boolean f1172c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new p[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1172c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SearchView.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" isIconified=");
            a10.append(this.f1172c);
            a10.append("}");
            return a10.toString();
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeValue(Boolean.valueOf(this.f1172c));
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {

        /* renamed from: a */
        public final View f1173a;

        /* renamed from: b */
        public final Rect f1174b;

        /* renamed from: c */
        public final Rect f1175c;

        /* renamed from: d */
        public final Rect f1176d;

        /* renamed from: e */
        public final int f1177e;

        /* renamed from: f */
        public boolean f1178f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f1177e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f1174b = rect3;
            Rect rect4 = new Rect();
            this.f1176d = rect4;
            Rect rect5 = new Rect();
            this.f1175c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f1173a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1178f;
                    if (z11 && !this.f1176d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1178f;
                        this.f1178f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1174b.contains(x10, y10)) {
                    this.f1178f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (!z10 || this.f1175c.contains(x10, y10)) {
                    Rect rect = this.f1175c;
                    f10 = x10 - rect.left;
                    i10 = y10 - rect.top;
                } else {
                    f10 = this.f1173a.getWidth() / 2;
                    i10 = this.f1173a.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                return this.f1173a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1123v0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1153z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1140q0 = new b();
        this.f1142r0 = new c();
        this.f1144s0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1146t0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f1148u0 = new a();
        int[] iArr = R.styleable.SearchView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        l2 l2Var = new l2(context, obtainStyledAttributes);
        k1.o0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(l2Var.i(R.styleable.SearchView_layout, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1137p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1139q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1141r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1143s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1145t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1147u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1149v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1150w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        o0.d.q(findViewById, l2Var.e(R.styleable.SearchView_queryBackground));
        o0.d.q(findViewById2, l2Var.e(R.styleable.SearchView_submitBackground));
        int i11 = R.styleable.SearchView_searchIcon;
        imageView.setImageDrawable(l2Var.e(i11));
        imageView2.setImageDrawable(l2Var.e(R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(l2Var.e(R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(l2Var.e(R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(l2Var.e(i11));
        this.E = l2Var.e(R.styleable.SearchView_searchHintIcon);
        q2.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = l2Var.i(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = l2Var.i(R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1148u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1146t0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(l2Var.a(R.styleable.SearchView_iconifiedByDefault, true));
        int d10 = l2Var.d(R.styleable.SearchView_android_maxWidth, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.Q = l2Var.k(R.styleable.SearchView_defaultQueryHint);
        this.f1127f0 = l2Var.k(R.styleable.SearchView_queryHint);
        int h10 = l2Var.h(R.styleable.SearchView_android_imeOptions, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = l2Var.h(R.styleable.SearchView_android_inputType, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(l2Var.a(R.styleable.SearchView_android_focusable, true));
        l2Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1151x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.W);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1137p.setText(charSequence);
        this.f1137p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1129h0 = true;
        super.clearFocus();
        this.f1137p.clearFocus();
        this.f1137p.setImeVisibility(false);
        this.f1129h0 = false;
    }

    public int getImeOptions() {
        return this.f1137p.getImeOptions();
    }

    public int getInputType() {
        return this.f1137p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1130i0;
    }

    public CharSequence getQuery() {
        return this.f1137p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1127f0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1136o0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.Q : getContext().getText(this.f1136o0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public p1.a getSuggestionsAdapter() {
        return this.f1125d0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1133l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1138p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1136o0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1138p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1137p);
            return;
        }
        o oVar = f1123v0;
        SearchAutoComplete searchAutoComplete = this.f1137p;
        oVar.getClass();
        o.a();
        Method method = oVar.f1169a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o oVar2 = f1123v0;
        SearchAutoComplete searchAutoComplete2 = this.f1137p;
        oVar2.getClass();
        o.a();
        Method method2 = oVar2.f1170b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        if (!TextUtils.isEmpty(this.f1137p.getText())) {
            this.f1137p.setText("");
            this.f1137p.requestFocus();
            this.f1137p.setImeVisibility(true);
        } else if (this.W) {
            clearFocus();
            w(true);
        }
    }

    public final boolean n(int i10) {
        int i11;
        Uri parse;
        String i12;
        Cursor cursor = this.f1125d0.f23762c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i13 = f2.f1330x;
                String i14 = f2.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i14 == null) {
                    i14 = this.f1136o0.getSuggestIntentAction();
                }
                if (i14 == null) {
                    i14 = "android.intent.action.SEARCH";
                }
                String i15 = f2.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i15 == null) {
                    i15 = this.f1136o0.getSuggestIntentData();
                }
                if (i15 != null && (i12 = f2.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    i15 = i15 + "/" + Uri.encode(i12);
                }
                if (i15 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(i15);
                }
                intent = j(i14, parse, f2.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), f2.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        this.f1137p.setImeVisibility(false);
        this.f1137p.dismissDropDown();
        return true;
    }

    public final void o(int i10) {
        String d10;
        Editable text = this.f1137p.getText();
        Cursor cursor = this.f1125d0.f23762c;
        if (cursor != null) {
            if (cursor.moveToPosition(i10) && (d10 = this.f1125d0.d(cursor)) != null) {
                setQuery(d10);
            } else {
                setQuery(text);
            }
        }
    }

    @Override // k.b
    public final void onActionViewCollapsed() {
        this.f1137p.setText("");
        SearchAutoComplete searchAutoComplete = this.f1137p;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1133l0 = "";
        clearFocus();
        w(true);
        this.f1137p.setImeOptions(this.f1135n0);
        this.f1134m0 = false;
    }

    @Override // k.b
    public final void onActionViewExpanded() {
        if (this.f1134m0) {
            return;
        }
        this.f1134m0 = true;
        int imeOptions = this.f1137p.getImeOptions();
        this.f1135n0 = imeOptions;
        this.f1137p.setImeOptions(imeOptions | 33554432);
        this.f1137p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1140q0);
        post(this.f1142r0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f1137p;
            Rect rect = this.f1153z;
            searchAutoComplete.getLocationInWindow(this.B);
            getLocationInWindow(this.C);
            int[] iArr = this.B;
            int i14 = iArr[1];
            int[] iArr2 = this.C;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.A;
            Rect rect3 = this.f1153z;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            q qVar = this.f1152y;
            if (qVar == null) {
                q qVar2 = new q(this.A, this.f1153z, this.f1137p);
                this.f1152y = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            Rect rect4 = this.A;
            Rect rect5 = this.f1153z;
            qVar.f1174b.set(rect4);
            qVar.f1176d.set(rect4);
            Rect rect6 = qVar.f1176d;
            int i17 = -qVar.f1177e;
            rect6.inset(i17, i17);
            qVar.f1175c.set(rect5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f1124c0
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f1130i0
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f1130i0
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f1130i0
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f24504a);
        w(pVar.f1172c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1172c = this.f1124c0;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f1140q0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        Editable text = this.f1137p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1136o0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            this.f1137p.setImeVisibility(false);
            this.f1137p.dismissDropDown();
        }
    }

    public final void r() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1137p.getText());
        if (!z11 && (!this.W || this.f1134m0)) {
            z10 = false;
        }
        this.f1149v.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f1149v.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f1129h0 || !isFocusable()) {
            return false;
        }
        if (!this.f1124c0) {
            boolean requestFocus = this.f1137p.requestFocus(i10, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        int[] iArr = this.f1137p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1141r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1143s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1138p0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        this.f1137p.requestFocus();
        this.f1137p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.V;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i10) {
        this.f1137p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1137p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1130i0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.U = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.V = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1127f0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1128g0 = z10;
        p1.a aVar = this.f1125d0;
        if (aVar instanceof f2) {
            ((f2) aVar).f1336p = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1136o0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1137p
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1137p
            android.app.SearchableInfo r3 = r6.f1136o0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f1136o0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1136o0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1137p
            r3.setInputType(r7)
            p1.a r7 = r6.f1125d0
            if (r7 == 0) goto L42
            r7.c(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f1136o0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            androidx.appcompat.widget.f2 r7 = new androidx.appcompat.widget.f2
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1136o0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f1144s0
            r7.<init>(r3, r6, r4, r5)
            r6.f1125d0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1137p
            r3.setAdapter(r7)
            p1.a r7 = r6.f1125d0
            androidx.appcompat.widget.f2 r7 = (androidx.appcompat.widget.f2) r7
            boolean r3 = r6.f1128g0
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.f1336p = r3
        L6b:
            r6.t()
        L6e:
            android.app.SearchableInfo r7 = r6.f1136o0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f1136o0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.L
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f1136o0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.M
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = 0
        La0:
            r6.f1131j0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1137p
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.f1124c0
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1126e0 = z10;
        w(this.f1124c0);
    }

    public void setSuggestionsAdapter(p1.a aVar) {
        this.f1125d0 = aVar;
        this.f1137p.setAdapter(aVar);
    }

    public final void t() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1137p;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.W && this.E != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.E.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z10;
        int i10 = 0;
        if ((this.f1126e0 || this.f1131j0) && !this.f1124c0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (this.f1147u.getVisibility() != 0 && this.f1150w.getVisibility() != 0)) {
            i10 = 8;
        }
        this.f1143s.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x001e, code lost:
        if (r2.f1131j0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f1126e0
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f1131j0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f1124c0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f1131j0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f1147u
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.f1124c0 = z10;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.f1137p.getText());
        this.f1145t.setVisibility(i10);
        v(z11);
        View view = this.f1139q;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        if (this.D.getDrawable() != null && !this.W) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        this.D.setVisibility(i12);
        r();
        boolean z12 = !z11;
        if (this.f1131j0 && !this.f1124c0 && z12) {
            this.f1147u.setVisibility(8);
            i13 = 0;
        }
        this.f1150w.setVisibility(i13);
        u();
    }
}
