package h8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l1 extends androidx.fragment.app.r implements g {

    /* renamed from: o0 */
    public static final WeakHashMap f15991o0 = new WeakHashMap();

    /* renamed from: l0 */
    public final Map f15992l0 = Collections.synchronizedMap(new o0.b());

    /* renamed from: m0 */
    public int f15993m0 = 0;

    /* renamed from: n0 */
    public Bundle f15994n0;

    @Override // h8.g
    public final /* synthetic */ Activity A() {
        return f0();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f15993m0 = 1;
        this.f15994n0 = bundle;
        for (Map.Entry entry : this.f15992l0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.r
    public final void D0() {
        this.E = true;
        this.f15993m0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f15992l0.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        this.f15993m0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f15992l0.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        for (Map.Entry entry : this.f15992l0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.r
    public final void M0() {
        this.E = true;
        this.f15993m0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f15992l0.values()) {
            lifecycleCallback.f();
        }
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        this.f15993m0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f15992l0.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.r
    public final void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.d0(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f15992l0.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // h8.g
    public final LifecycleCallback o(Class cls) {
        return (LifecycleCallback) cls.cast(this.f15992l0.get("ConnectionlessLifecycleHelper"));
    }

    @Override // h8.g
    public final void t(LifecycleCallback lifecycleCallback) {
        if (this.f15992l0.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        this.f15992l0.put("ConnectionlessLifecycleHelper", lifecycleCallback);
        if (this.f15993m0 > 0) {
            new w8.e(Looper.getMainLooper()).post(new k1(this, lifecycleCallback));
        }
    }

    @Override // androidx.fragment.app.r
    public final void y0(int i10, int i11, Intent intent) {
        super.y0(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f15992l0.values()) {
            lifecycleCallback.b(i10, i11, intent);
        }
    }
}
