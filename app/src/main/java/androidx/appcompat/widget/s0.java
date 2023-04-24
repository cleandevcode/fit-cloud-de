package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public final class s0 extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: i */
    public static final int[] f1529i = {16843505};

    /* renamed from: a */
    public final androidx.appcompat.widget.e f1530a;

    /* renamed from: b */
    public final Context f1531b;

    /* renamed from: c */
    public r0 f1532c;

    /* renamed from: d */
    public SpinnerAdapter f1533d;

    /* renamed from: e */
    public final boolean f1534e;

    /* renamed from: f */
    public i f1535f;

    /* renamed from: g */
    public int f1536g;

    /* renamed from: h */
    public final Rect f1537h;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
            s0.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!s0.this.getInternalPopup().a()) {
                s0 s0Var = s0.this;
                s0Var.f1535f.n(c.b(s0Var), c.a(s0Var));
            }
            ViewTreeObserver viewTreeObserver = s0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: a */
        public androidx.appcompat.app.d f1539a;

        /* renamed from: b */
        public ListAdapter f1540b;

        /* renamed from: c */
        public CharSequence f1541c;

        public e() {
            s0.this = r1;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final boolean a() {
            androidx.appcompat.app.d dVar = this.f1539a;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void dismiss() {
            androidx.appcompat.app.d dVar = this.f1539a;
            if (dVar != null) {
                dVar.dismiss();
                this.f1539a = null;
            }
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.s0.i
        public final CharSequence f() {
            return this.f1541c;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void i(CharSequence charSequence) {
            this.f1541c = charSequence;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void n(int i10, int i11) {
            if (this.f1540b == null) {
                return;
            }
            d.a aVar = new d.a(s0.this.getPopupContext());
            CharSequence charSequence = this.f1541c;
            if (charSequence != null) {
                aVar.f838a.f808d = charSequence;
            }
            ListAdapter listAdapter = this.f1540b;
            int selectedItemPosition = s0.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f838a;
            bVar.f820p = listAdapter;
            bVar.f821q = this;
            bVar.f827w = selectedItemPosition;
            bVar.f826v = true;
            androidx.appcompat.app.d a10 = aVar.a();
            this.f1539a = a10;
            AlertController.RecycleListView recycleListView = a10.f837e.f782g;
            c.d(recycleListView, i10);
            c.c(recycleListView, i11);
            this.f1539a.show();
        }

        @Override // androidx.appcompat.widget.s0.i
        public final int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            s0.this.setSelection(i10);
            if (s0.this.getOnItemClickListener() != null) {
                s0.this.performItemClick(null, i10, this.f1540b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void p(ListAdapter listAdapter) {
            this.f1540b = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public SpinnerAdapter f1543a;

        /* renamed from: b */
        public ListAdapter f1544b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1543a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1544b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof h2) {
                    h2 h2Var = (h2) spinnerAdapter;
                    if (h2Var.getDropDownViewTheme() == null) {
                        h2Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1544b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1544b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1543a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends r1 implements i {
        public CharSequence C;
        public ListAdapter D;
        public final Rect E;
        public int F;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
                g.this = r1;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                s0.this.setSelection(i10);
                if (s0.this.getOnItemClickListener() != null) {
                    g gVar = g.this;
                    s0.this.performItemClick(view, i10, gVar.D.getItemId(i10));
                }
                g.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
                g.this = r1;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z10;
                g gVar = g.this;
                s0 s0Var = s0.this;
                gVar.getClass();
                WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
                if (o0.g.b(s0Var) && s0Var.getGlobalVisibleRect(gVar.E)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    g.this.dismiss();
                    return;
                }
                g.this.s();
                g.this.b();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1547a;

            public c(b bVar) {
                g.this = r1;
                this.f1547a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = s0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1547a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            s0.this = r2;
            this.E = new Rect();
            this.f1511o = r2;
            this.f1520x = true;
            this.f1521y.setFocusable(true);
            this.f1512p = new a();
        }

        @Override // androidx.appcompat.widget.s0.i
        public final CharSequence f() {
            return this.C;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void i(CharSequence charSequence) {
            this.C = charSequence;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void m(int i10) {
            this.F = i10;
        }

        @Override // androidx.appcompat.widget.s0.i
        public final void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            s();
            this.f1521y.setInputMethodMode(2);
            b();
            m1 m1Var = this.f1499c;
            m1Var.setChoiceMode(1);
            c.d(m1Var, i10);
            c.c(m1Var, i11);
            int selectedItemPosition = s0.this.getSelectedItemPosition();
            m1 m1Var2 = this.f1499c;
            if (a() && m1Var2 != null) {
                m1Var2.setListSelectionHidden(false);
                m1Var2.setSelection(selectedItemPosition);
                if (m1Var2.getChoiceMode() != 0) {
                    m1Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a10 && (viewTreeObserver = s0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f1521y.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.r1, androidx.appcompat.widget.s0.i
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.D = listAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void s() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.h()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.s0 r1 = androidx.appcompat.widget.s0.this
                android.graphics.Rect r1 = r1.f1537h
                r0.getPadding(r1)
                androidx.appcompat.widget.s0 r0 = androidx.appcompat.widget.s0.this
                boolean r0 = androidx.appcompat.widget.x2.a(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.s0 r0 = androidx.appcompat.widget.s0.this
                android.graphics.Rect r0 = r0.f1537h
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.s0 r0 = androidx.appcompat.widget.s0.this
                android.graphics.Rect r0 = r0.f1537h
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.s0 r0 = androidx.appcompat.widget.s0.this
                android.graphics.Rect r0 = r0.f1537h
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.s0 r0 = androidx.appcompat.widget.s0.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.s0 r2 = androidx.appcompat.widget.s0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.s0 r3 = androidx.appcompat.widget.s0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.s0 r4 = androidx.appcompat.widget.s0.this
                int r5 = r4.f1536g
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.D
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.h()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.s0 r5 = androidx.appcompat.widget.s0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.s0 r6 = androidx.appcompat.widget.s0.this
                android.graphics.Rect r6 = r6.f1537h
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.r(r4)
                goto L85
            L82:
                r8.r(r5)
            L85:
                androidx.appcompat.widget.s0 r4 = androidx.appcompat.widget.s0.this
                boolean r4 = androidx.appcompat.widget.x2.a(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f1501e
                int r3 = r3 - r0
                int r0 = r8.F
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.F
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f1502f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.g.s():void");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a */
        public boolean f1549a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f1549a = parcel.readByte() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1549a ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a();

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0057, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s0(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1537h = r0
            android.content.Context r0 = r8.getContext()
            androidx.appcompat.widget.g2.a(r8, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r8)
            r8.f1530a = r2
            int r2 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2f
            k.c r3 = new k.c
            r3.<init>(r9, r2)
            r8.f1531b = r3
            goto L31
        L2f:
            r8.f1531b = r9
        L31:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.s0.f1529i     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r4, r11, r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            if (r5 == 0) goto L59
            int r1 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            r3 = r1
            goto L59
        L45:
            r9 = move-exception
            r2 = r4
            goto Ld5
        L49:
            r1 = move-exception
            goto L50
        L4b:
            r9 = move-exception
            goto Ld5
        L4e:
            r1 = move-exception
            r4 = r2
        L50:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r1)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L5c
        L59:
            r4.recycle()
        L5c:
            r1 = 1
            if (r3 == 0) goto L9a
            if (r3 == r1) goto L62
            goto La9
        L62:
            androidx.appcompat.widget.s0$g r3 = new androidx.appcompat.widget.s0$g
            android.content.Context r4 = r8.f1531b
            r3.<init>(r4, r10, r11)
            android.content.Context r4 = r8.f1531b
            int[] r5 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.l2 r4 = androidx.appcompat.widget.l2.m(r4, r10, r5, r11)
            int r5 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r6 = -2
            android.content.res.TypedArray r7 = r4.f1415b
            int r5 = r7.getLayoutDimension(r5, r6)
            r8.f1536g = r5
            int r5 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r4.e(r5)
            r3.k(r5)
            int r5 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.C = r5
            r4.n()
            r8.f1535f = r3
            androidx.appcompat.widget.r0 r4 = new androidx.appcompat.widget.r0
            r4.<init>(r8, r8, r3)
            r8.f1532c = r4
            goto La9
        L9a:
            androidx.appcompat.widget.s0$e r3 = new androidx.appcompat.widget.s0$e
            r3.<init>()
            r8.f1535f = r3
            int r4 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r4 = r0.getString(r4)
            r3.f1541c = r4
        La9:
            int r3 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r3 = r0.getTextArray(r3)
            if (r3 == 0) goto Lc1
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r4.<init>(r9, r5, r3)
            int r9 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r4.setDropDownViewResource(r9)
            r8.setAdapter(r4)
        Lc1:
            r0.recycle()
            r8.f1534e = r1
            android.widget.SpinnerAdapter r9 = r8.f1533d
            if (r9 == 0) goto Lcf
            r8.setAdapter(r9)
            r8.f1533d = r2
        Lcf:
            androidx.appcompat.widget.e r9 = r8.f1530a
            r9.d(r10, r11)
            return
        Ld5:
            if (r2 == 0) goto Lda
            r2.recycle()
        Lda:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1537h);
            Rect rect = this.f1537h;
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f1535f;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f1535f;
        return iVar != null ? iVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1535f != null ? this.f1536g : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f1535f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f1535f;
        return iVar != null ? iVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1531b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f1535f;
        return iVar != null ? iVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1535f;
        if (iVar == null || !iVar.a()) {
            return;
        }
        this.f1535f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1535f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (!hVar.f1549a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f1535f;
        hVar.f1549a = iVar != null && iVar.a();
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r0 r0Var = this.f1532c;
        if (r0Var == null || !r0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.f1535f;
        if (iVar != null) {
            if (!iVar.a()) {
                this.f1535f.n(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1534e) {
            this.f1533d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1535f != null) {
            Context context = this.f1531b;
            if (context == null) {
                context = getContext();
            }
            this.f1535f.p(new f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f1535f;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i10);
            return;
        }
        iVar.m(i10);
        this.f1535f.e(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f1535f;
        if (iVar != null) {
            iVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1535f != null) {
            this.f1536g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1535f;
        if (iVar != null) {
            iVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1535f;
        if (iVar != null) {
            iVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1530a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
