package s5;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.r2;
import cn.sharesdk.framework.InnerShareParams;
import d6.m0;
import d6.w;
import gm.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o5.p;
import o5.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s5.a;
import s5.e;
import t5.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f */
    public static final a f26589f = new a();

    /* renamed from: g */
    public static d f26590g;

    /* renamed from: a */
    public final Handler f26591a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Set<Activity> f26592b;

    /* renamed from: c */
    public final LinkedHashSet f26593c;

    /* renamed from: d */
    public HashSet<String> f26594d;

    /* renamed from: e */
    public final HashMap<Integer, HashSet<String>> f26595e;

    /* loaded from: classes.dex */
    public static final class a {
        public static Bundle b(t5.a aVar, View view, View view2) {
            ArrayList arrayList;
            String simpleName;
            View view3;
            boolean z10;
            String str;
            String str2;
            boolean z11;
            Bundle bundle = new Bundle();
            if (aVar == null) {
                return bundle;
            }
            List<t5.b> unmodifiableList = Collections.unmodifiableList(aVar.f27770c);
            l.e(unmodifiableList, "unmodifiableList(parameters)");
            for (t5.b bVar : unmodifiableList) {
                String str3 = bVar.f27775b;
                if (str3 != null) {
                    if (str3.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        str = bVar.f27774a;
                        str2 = bVar.f27775b;
                        bundle.putString(str, str2);
                        break;
                    }
                }
                if (bVar.f27776c.size() > 0) {
                    if (l.a(bVar.f27777d, "relative")) {
                        arrayList = bVar.f27776c;
                        simpleName = view2.getClass().getSimpleName();
                        view3 = view2;
                    } else {
                        arrayList = bVar.f27776c;
                        simpleName = view.getClass().getSimpleName();
                        view3 = view;
                    }
                    Iterator it = c.a.a(view3, arrayList, 0, -1, simpleName).iterator();
                    while (it.hasNext()) {
                        b bVar2 = (b) it.next();
                        if (bVar2.a() != null) {
                            t5.f fVar = t5.f.f27790a;
                            String i10 = t5.f.i(bVar2.a());
                            if (i10.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                str = bVar.f27774a;
                                str2 = i10;
                                bundle.putString(str, str2);
                                break;
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        public final synchronized d a() {
            d dVar;
            d dVar2;
            try {
                dVar = null;
                if (i6.a.b(d.class)) {
                    dVar2 = null;
                } else {
                    dVar2 = d.f26590g;
                }
                if (dVar2 == null) {
                    d dVar3 = new d();
                    if (!i6.a.b(d.class)) {
                        d.f26590g = dVar3;
                    }
                }
                if (!i6.a.b(d.class)) {
                    dVar = d.f26590g;
                }
                if (dVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final WeakReference<View> f26596a;

        /* renamed from: b */
        public final String f26597b;

        public b(View view, String str) {
            l.f(view, "view");
            l.f(str, "viewMapKey");
            this.f26596a = new WeakReference<>(view);
            this.f26597b = str;
        }

        public final View a() {
            WeakReference<View> weakReference = this.f26596a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: a */
        public final WeakReference<View> f26598a;

        /* renamed from: b */
        public ArrayList f26599b;

        /* renamed from: c */
        public final HashSet<String> f26600c;

        /* renamed from: d */
        public final String f26601d;

        /* loaded from: classes.dex */
        public static final class a {
            /* JADX WARN: Code restructure failed: missing block: B:129:0x00e1, code lost:
                if (gm.l.a(r7.getClass().getSimpleName(), (java.lang.String) r10.get(r10.size() - 1)) == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:141:0x0114, code lost:
                if (gm.l.a(r10, r6) == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x0142, code lost:
                if (gm.l.a(r10, r6) == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x0163, code lost:
                if (gm.l.a(r10, r6) == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x018f, code lost:
                if (gm.l.a(r10, r1) == false) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:174:0x0196 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:186:0x01ca A[LOOP:0: B:183:0x01b6->B:186:0x01ca, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:188:0x01cc A[EDGE_INSN: B:188:0x01cc->B:187:0x01cc ?: BREAK  , SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.util.ArrayList a(android.view.View r7, java.util.List r8, int r9, int r10, java.lang.String r11) {
                /*
                    Method dump skipped, instructions count: 461
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: s5.d.c.a.a(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
            }

            public static ArrayList b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            arrayList.add(childAt);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }
        }

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            l.f(handler, "handler");
            l.f(hashSet, "listenerSet");
            this.f26598a = new WeakReference<>(view);
            this.f26600c = hashSet;
            this.f26601d = str;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, t5.a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String str = bVar.f26597b;
            View.OnClickListener e10 = t5.f.e(a10);
            if (e10 instanceof a.View$OnClickListenerC0471a) {
                if (e10 != null) {
                    if (((a.View$OnClickListenerC0471a) e10).f26572e) {
                        z10 = true;
                        if (this.f26600c.contains(str) && !z10) {
                            s5.a aVar2 = s5.a.f26567a;
                            a.View$OnClickListenerC0471a view$OnClickListenerC0471a = null;
                            if (!i6.a.b(s5.a.class)) {
                                try {
                                    view$OnClickListenerC0471a = new a.View$OnClickListenerC0471a(aVar, view, a10);
                                } catch (Throwable th2) {
                                    i6.a.a(s5.a.class, th2);
                                }
                            }
                            a10.setOnClickListener(view$OnClickListenerC0471a);
                            this.f26600c.add(str);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
            }
            z10 = false;
            if (this.f26600c.contains(str)) {
            }
        }

        public final void b(b bVar, View view, t5.a aVar) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String str = bVar.f26597b;
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof a.b) {
                if (onItemClickListener != null) {
                    if (((a.b) onItemClickListener).f26577e) {
                        z10 = true;
                        if (this.f26600c.contains(str) && !z10) {
                            s5.a aVar2 = s5.a.f26567a;
                            a.b bVar2 = null;
                            if (!i6.a.b(s5.a.class)) {
                                try {
                                    bVar2 = new a.b(aVar, view, adapterView);
                                } catch (Throwable th2) {
                                    i6.a.a(s5.a.class, th2);
                                }
                            }
                            adapterView.setOnItemClickListener(bVar2);
                            this.f26600c.add(str);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
            }
            z10 = false;
            if (this.f26600c.contains(str)) {
            }
        }

        public final void c(b bVar, View view, t5.a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String str = bVar.f26597b;
            View.OnTouchListener f10 = t5.f.f(a10);
            if (f10 instanceof e.a) {
                if (f10 != null) {
                    if (((e.a) f10).f26607e) {
                        z10 = true;
                        if (this.f26600c.contains(str) && !z10) {
                            int i10 = e.f26602a;
                            e.a aVar2 = null;
                            if (!i6.a.b(e.class)) {
                                try {
                                    aVar2 = new e.a(aVar, view, a10);
                                } catch (Throwable th2) {
                                    i6.a.a(e.class, th2);
                                }
                            }
                            a10.setOnTouchListener(aVar2);
                            this.f26600c.add(str);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
            }
            z10 = false;
            if (this.f26600c.contains(str)) {
            }
        }

        public final void d() {
            boolean z10;
            View a10;
            boolean z11;
            ArrayList arrayList = this.f26599b;
            if (arrayList != null && this.f26598a.get() != null) {
                int i10 = -1;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        t5.a aVar = (t5.a) arrayList.get(i11);
                        View view = this.f26598a.get();
                        if (aVar != null && view != null) {
                            String str = aVar.f27771d;
                            if (str != null && str.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10 || l.a(aVar.f27771d, this.f26601d)) {
                                List unmodifiableList = Collections.unmodifiableList(aVar.f27769b);
                                l.e(unmodifiableList, "unmodifiableList(path)");
                                if (unmodifiableList.size() <= 25) {
                                    Iterator it = a.a(view, unmodifiableList, 0, i10, this.f26601d).iterator();
                                    while (it.hasNext()) {
                                        b bVar = (b) it.next();
                                        try {
                                            a10 = bVar.a();
                                        } catch (Exception unused) {
                                            m0 m0Var = m0.f12709a;
                                            i6.a.b(d.class);
                                            v vVar = v.f22837a;
                                        }
                                        if (a10 != null) {
                                            t5.f fVar = t5.f.f27790a;
                                            View view2 = null;
                                            if (!i6.a.b(t5.f.class)) {
                                                View view3 = a10;
                                                while (true) {
                                                    if (view3 == null) {
                                                        break;
                                                    }
                                                    t5.f fVar2 = t5.f.f27790a;
                                                    fVar2.getClass();
                                                    if (!i6.a.b(fVar2)) {
                                                        z11 = l.a(view3.getClass().getName(), "com.facebook.react.ReactRootView");
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        view2 = view3;
                                                        break;
                                                    }
                                                    ViewParent parent = view3.getParent();
                                                    if (!(parent instanceof View)) {
                                                        break;
                                                    }
                                                    view3 = (View) parent;
                                                }
                                            }
                                            if (view2 != null && t5.f.f27790a.l(a10, view2)) {
                                                c(bVar, view, aVar);
                                            } else if (!om.h.a0(a10.getClass().getName(), "com.facebook.react", false)) {
                                                if (!(a10 instanceof AdapterView)) {
                                                    a(bVar, view, aVar);
                                                } else if (a10 instanceof ListView) {
                                                    b(bVar, view, aVar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i12 <= size) {
                            i11 = i12;
                            i10 = -1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            d();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (i6.a.b(this)) {
                return;
            }
            try {
                d6.v b10 = w.b(v.b());
                if (b10 != null && b10.f12802h) {
                    JSONArray jSONArray = b10.f12803i;
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        int i10 = 0;
                        try {
                            int length = jSONArray.length();
                            if (length > 0) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                    l.e(jSONObject, "array.getJSONObject(i)");
                                    arrayList.add(a.b.a(jSONObject));
                                    if (i11 >= length) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    }
                    this.f26599b = arrayList;
                    View view = this.f26598a.get();
                    if (view == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    d();
                }
            } catch (Throwable th2) {
                i6.a.a(this, th2);
            }
        }
    }

    public d() {
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        l.e(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f26592b = newSetFromMap;
        this.f26593c = new LinkedHashSet();
        this.f26594d = new HashSet<>();
        this.f26595e = new HashMap<>();
    }

    public final void a(Activity activity) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            l.f(activity, InnerShareParams.ACTIVITY);
            if (l.a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f26592b.add(activity);
                this.f26594d.clear();
                HashSet<String> hashSet = this.f26595e.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.f26594d = hashSet;
                }
                if (!i6.a.b(this)) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        b();
                        return;
                    } else {
                        this.f26591a.post(new r2(10, this));
                        return;
                    }
                }
                return;
            }
            throw new p("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void b() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f26592b) {
                if (activity != null) {
                    this.f26593c.add(new c(x5.e.b(activity), this.f26591a, this.f26594d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            l.f(activity, InnerShareParams.ACTIVITY);
            if (l.a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f26592b.remove(activity);
                this.f26593c.clear();
                this.f26595e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f26594d.clone());
                this.f26594d.clear();
                return;
            }
            throw new p("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
