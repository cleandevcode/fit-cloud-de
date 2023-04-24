package com.huawei.hms.feature.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public static final int STATUS_ONCREATED = 1;
    public static final int STATUS_ONCREATEVIEW = 2;
    public static final int STATUS_ONINFLATE = 0;
    public static final int STATUS_ONRESUME = 5;
    public static final int STATUS_ONSTART = 4;

    /* renamed from: a */
    private static final String f6944a = "DeferredLifecycleHelper";

    /* renamed from: b */
    private T f6945b;

    /* renamed from: c */
    private Bundle f6946c;

    /* renamed from: d */
    private LinkedList<a> f6947d;

    /* renamed from: e */
    private OnDelegateCreatedListener<T> f6948e = (OnDelegateCreatedListener<T>) new OnDelegateCreatedListener<T>() { // from class: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.1
        @Override // com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
        public final void onDelegateCreated(T t10) {
            DeferredLifecycleHelper.this.f6945b = t10;
            Iterator it = DeferredLifecycleHelper.this.f6947d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(DeferredLifecycleHelper.this.f6945b);
            }
            DeferredLifecycleHelper.this.f6947d.clear();
            DeferredLifecycleHelper.c(DeferredLifecycleHelper.this);
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        int a();

        void a(LifecycleDelegate lifecycleDelegate);
    }

    private void a(int i10) {
        while (!this.f6947d.isEmpty() && this.f6947d.getLast().a() >= i10) {
            this.f6947d.removeLast();
        }
    }

    private final void a(Bundle bundle, a aVar) {
        T t10 = this.f6945b;
        if (t10 != null) {
            aVar.a(t10);
            return;
        }
        if (this.f6947d == null) {
            this.f6947d = new LinkedList<>();
        }
        this.f6947d.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f6946c;
            if (bundle2 == null) {
                this.f6946c = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.f6948e);
    }

    public static /* synthetic */ Bundle c(DeferredLifecycleHelper deferredLifecycleHelper) {
        deferredLifecycleHelper.f6946c = null;
        return null;
    }

    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.f6945b;
    }

    public void onCreate(final Bundle bundle) {
        a(bundle, new a() { // from class: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.3
            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final int a() {
                return 1;
            }

            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final void a(LifecycleDelegate lifecycleDelegate) {
                Log.d(DeferredLifecycleHelper.f6944a, "IDelegateLifeCycleCall onCreate:");
                lifecycleDelegate.onCreate(bundle);
            }
        });
    }

    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        a(bundle, new a() { // from class: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.4
            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final int a() {
                return 2;
            }

            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final void a(LifecycleDelegate lifecycleDelegate) {
                frameLayout.removeAllViews();
                frameLayout.addView(DeferredLifecycleHelper.this.f6945b.onCreateView(layoutInflater, viewGroup, bundle));
            }
        });
        return frameLayout;
    }

    public void onDestroy() {
        T t10 = this.f6945b;
        if (t10 != null) {
            t10.onDestroy();
        } else {
            a(0);
        }
    }

    public void onDestroyView() {
        T t10 = this.f6945b;
        if (t10 != null) {
            t10.onDestroyView();
        } else {
            a(1);
        }
    }

    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        a(bundle2, new a() { // from class: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.2
            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final int a() {
                return 0;
            }

            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final void a(LifecycleDelegate lifecycleDelegate) {
                DeferredLifecycleHelper.this.f6945b.onInflate(activity, bundle, bundle2);
            }
        });
    }

    public void onLowMemory() {
        T t10 = this.f6945b;
        if (t10 != null) {
            t10.onLowMemory();
        }
    }

    public void onPause() {
        T t10 = this.f6945b;
        if (t10 != null) {
            t10.onPause();
        } else {
            a(5);
        }
    }

    public void onResume() {
        a((Bundle) null, new a() { // from class: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.6
            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final int a() {
                return 5;
            }

            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final void a(LifecycleDelegate lifecycleDelegate) {
                Log.d(DeferredLifecycleHelper.f6944a, "IDelegateLifeCycleCall onResume:");
                lifecycleDelegate.onResume();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        T t10 = this.f6945b;
        if (t10 != null) {
            t10.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f6946c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        a((Bundle) null, new a() { // from class: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.5
            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final int a() {
                return 4;
            }

            @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.a
            public final void a(LifecycleDelegate lifecycleDelegate) {
                Log.d(DeferredLifecycleHelper.f6944a, "IDelegateLifeCycleCall onStart:");
                lifecycleDelegate.onStart();
            }
        });
    }

    public void onStop() {
        T t10 = this.f6945b;
        if (t10 != null) {
            t10.onStop();
        } else {
            a(4);
        }
    }
}
