package l1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    public final Object f18687a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final k f18688a;

        public a(k kVar) {
            this.f18688a = kVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            j a10 = this.f18688a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f18670a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f18688a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f18688a.c(i10, i11, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(k kVar) {
            super(kVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            j b10 = this.f18688a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f18670a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(k kVar) {
            super(kVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f18688a.getClass();
        }
    }

    public k() {
        this.f18687a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public k(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f18687a = accessibilityNodeProvider;
    }

    public j a(int i10) {
        return null;
    }

    public j b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
