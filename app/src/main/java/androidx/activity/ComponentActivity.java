package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.h0;
import androidx.fragment.app.j0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import e.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.j;
import k1.x;
import q2.a;
import x0.b;
import x0.d0;
import x0.e0;
import x0.g0;
import x0.n;
import x0.o;

/* loaded from: classes.dex */
public class ComponentActivity extends n implements y0, androidx.lifecycle.i, q2.c, l, androidx.activity.result.h, y0.d, y0.e, d0, e0, k1.i {

    /* renamed from: b */
    public final d.a f699b = new d.a();

    /* renamed from: c */
    public final k1.j f700c = new k1.j(new androidx.activity.b(0, this));

    /* renamed from: d */
    public final v f701d;

    /* renamed from: e */
    public final q2.b f702e;

    /* renamed from: f */
    public x0 f703f;

    /* renamed from: g */
    public p0 f704g;

    /* renamed from: h */
    public final OnBackPressedDispatcher f705h;

    /* renamed from: i */
    public final b f706i;

    /* renamed from: j */
    public final CopyOnWriteArrayList<j1.a<Configuration>> f707j;

    /* renamed from: k */
    public final CopyOnWriteArrayList<j1.a<Integer>> f708k;

    /* renamed from: l */
    public final CopyOnWriteArrayList<j1.a<Intent>> f709l;

    /* renamed from: m */
    public final CopyOnWriteArrayList<j1.a<o>> f710m;

    /* renamed from: n */
    public final CopyOnWriteArrayList<j1.a<g0>> f711n;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.g {
        public b() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.g
        public final void b(int i10, e.a aVar, Object obj) {
            String[] strArr;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0233a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new f(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i11 = x0.b.f30088b;
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i12])) {
                        if (!f1.a.b() && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i12));
                        }
                    } else {
                        throw new IllegalArgumentException(e.b(android.support.v4.media.d.a("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                if (size > 0) {
                    strArr = new String[stringArrayExtra.length - size];
                } else {
                    strArr = stringArrayExtra;
                }
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i13 = 0;
                        for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                            if (!hashSet.contains(Integer.valueOf(i14))) {
                                strArr[i13] = stringArrayExtra[i14];
                                i13++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    if (componentActivity instanceof b.d) {
                        ((b.d) componentActivity).y();
                    }
                    b.C0548b.b(componentActivity, stringArrayExtra, i10);
                } else if (componentActivity instanceof b.c) {
                    new Handler(Looper.getMainLooper()).post(new x0.a(componentActivity, strArr, i10));
                }
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.i iVar = (androidx.activity.result.i) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = iVar.f771a;
                    Intent intent = iVar.f772b;
                    int i15 = iVar.f773c;
                    int i16 = iVar.f774d;
                    int i17 = x0.b.f30088b;
                    b.a.c(componentActivity, intentSender, i10, intent, i15, i16, 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new g(this, i10, e10));
                }
            } else {
                int i18 = x0.b.f30088b;
                b.a.b(componentActivity, a10, i10, bundle2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public x0 f717a;
    }

    public ComponentActivity() {
        v vVar = new v(this);
        this.f701d = vVar;
        q2.b bVar = new q2.b(this);
        this.f702e = bVar;
        this.f705h = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f706i = new b();
        this.f707j = new CopyOnWriteArrayList<>();
        this.f708k = new CopyOnWriteArrayList<>();
        this.f709l = new CopyOnWriteArrayList<>();
        this.f710m = new CopyOnWriteArrayList<>();
        this.f711n = new CopyOnWriteArrayList<>();
        int i10 = Build.VERSION.SDK_INT;
        vVar.a(new s() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.s
            public final void d(u uVar, k.b bVar2) {
                if (bVar2 == k.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        vVar.a(new s() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.s
            public final void d(u uVar, k.b bVar2) {
                if (bVar2 == k.b.ON_DESTROY) {
                    ComponentActivity.this.f699b.f12568b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.z().a();
                    }
                }
            }
        });
        vVar.a(new s() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.s
            public final void d(u uVar, k.b bVar2) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f703f == null) {
                    c cVar = (c) componentActivity.getLastNonConfigurationInstance();
                    if (cVar != null) {
                        componentActivity.f703f = cVar.f717a;
                    }
                    if (componentActivity.f703f == null) {
                        componentActivity.f703f = new x0();
                    }
                }
                ComponentActivity.this.f701d.c(this);
            }
        });
        bVar.a();
        m0.b(this);
        if (i10 <= 23) {
            vVar.a(new ImmLeaksCleaner(this));
        }
        bVar.f24512b.c("android:support:activity-result", new a.b() { // from class: androidx.activity.c
            @Override // q2.a.b
            public final Bundle a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar2 = componentActivity.f706i;
                bVar2.getClass();
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(bVar2.f761c.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(bVar2.f761c.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(bVar2.f763e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar2.f766h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar2.f759a);
                return bundle;
            }
        });
        H(new d.b() { // from class: androidx.activity.d
            @Override // d.b
            public final void a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                Bundle a10 = componentActivity.f702e.f24512b.a("android:support:activity-result");
                if (a10 != null) {
                    ComponentActivity.b bVar2 = componentActivity.f706i;
                    bVar2.getClass();
                    ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        bVar2.f763e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bVar2.f759a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        bVar2.f766h.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                            String str = stringArrayList.get(i11);
                            if (bVar2.f761c.containsKey(str)) {
                                Integer num = (Integer) bVar2.f761c.remove(str);
                                if (!bVar2.f766h.containsKey(str)) {
                                    bVar2.f760b.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i11).intValue();
                            String str2 = stringArrayList.get(i11);
                            bVar2.f760b.put(Integer.valueOf(intValue), str2);
                            bVar2.f761c.put(str2, Integer.valueOf(intValue));
                        }
                    }
                }
            }
        });
    }

    private void I() {
        getWindow().getDecorView().setTag(androidx.lifecycle.runtime.R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        gm.l.f(decorView, "<this>");
        decorView.setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        gm.l.f(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // k1.i
    public final void A(j0.c cVar) {
        k1.j jVar = this.f700c;
        jVar.f18127b.remove(cVar);
        if (((j.a) jVar.f18128c.remove(cVar)) == null) {
            jVar.f18126a.run();
            return;
        }
        throw null;
    }

    @Override // q2.c
    public final q2.a C() {
        return this.f702e.f24512b;
    }

    @Override // y0.d
    public final void D(j1.a<Configuration> aVar) {
        this.f707j.add(aVar);
    }

    public final void H(d.b bVar) {
        d.a aVar = this.f699b;
        if (aVar.f12568b != null) {
            bVar.a();
        }
        aVar.f12567a.add(bVar);
    }

    @Override // x0.n, androidx.lifecycle.u
    public final v a0() {
        return this.f701d;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        I();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher b() {
        return this.f705h;
    }

    @Override // x0.e0
    public final void c(androidx.fragment.app.v vVar) {
        this.f711n.add(vVar);
    }

    @Override // x0.d0
    public final void d(z.b bVar) {
        this.f710m.add(bVar);
    }

    @Override // x0.e0
    public final void g(androidx.fragment.app.v vVar) {
        this.f711n.remove(vVar);
    }

    @Override // y0.e
    public final void j(h0 h0Var) {
        this.f708k.remove(h0Var);
    }

    @Override // x0.d0
    public final void l(z.b bVar) {
        this.f710m.remove(bVar);
    }

    @Override // y0.d
    public final void m(androidx.fragment.app.g0 g0Var) {
        this.f707j.remove(g0Var);
    }

    @Override // androidx.activity.result.h
    public final androidx.activity.result.g o() {
        return this.f706i;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f706i.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f705h.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<j1.a<Configuration>> it = this.f707j.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // x0.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f702e.b(bundle);
        d.a aVar = this.f699b;
        aVar.f12568b = this;
        Iterator it = aVar.f12567a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a();
        }
        super.onCreate(bundle);
        i0.c(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            k1.j jVar = this.f700c;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<x> it = jVar.f18127b.iterator();
            while (it.hasNext()) {
                it.next().c(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<x> it = this.f700c.f18127b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        Iterator<j1.a<o>> it = this.f710m.iterator();
        while (it.hasNext()) {
            it.next().accept(new o(z10));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        Iterator<j1.a<o>> it = this.f710m.iterator();
        while (it.hasNext()) {
            it.next().accept(new o(z10, 0));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<j1.a<Intent>> it = this.f709l.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<x> it = this.f700c.f18127b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        Iterator<j1.a<g0>> it = this.f711n.iterator();
        while (it.hasNext()) {
            it.next().accept(new g0(z10));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        Iterator<j1.a<g0>> it = this.f711n.iterator();
        while (it.hasNext()) {
            it.next().accept(new g0(z10, 0));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator<x> it = this.f700c.f18127b.iterator();
            while (it.hasNext()) {
                it.next().d(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f706i.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        x0 x0Var = this.f703f;
        if (x0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            x0Var = cVar.f717a;
        }
        if (x0Var == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f717a = x0Var;
        return cVar2;
    }

    @Override // x0.n, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        v vVar = this.f701d;
        if (vVar instanceof v) {
            vVar.h(k.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f702e.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<j1.a<Integer>> it = this.f708k.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // y0.e
    public final void q(h0 h0Var) {
        this.f708k.add(h0Var);
    }

    @Override // androidx.lifecycle.i
    public v0.b r() {
        if (this.f704g == null) {
            this.f704g = new p0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f704g;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (w2.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.lifecycle.i
    public final d2.c s() {
        d2.c cVar = new d2.c(0);
        if (getApplication() != null) {
            cVar.f12611a.put(u0.f2788a, getApplication());
        }
        cVar.f12611a.put(m0.f2748a, this);
        cVar.f12611a.put(m0.f2749b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            cVar.f12611a.put(m0.f2750c, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        I();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        I();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        I();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // k1.i
    public final void t(j0.c cVar) {
        k1.j jVar = this.f700c;
        jVar.f18127b.add(cVar);
        jVar.f18126a.run();
    }

    @Override // androidx.lifecycle.y0
    public final x0 z() {
        if (getApplication() != null) {
            if (this.f703f == null) {
                c cVar = (c) getLastNonConfigurationInstance();
                if (cVar != null) {
                    this.f703f = cVar.f717a;
                }
                if (this.f703f == null) {
                    this.f703f = new x0();
                }
            }
            return this.f703f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
}
