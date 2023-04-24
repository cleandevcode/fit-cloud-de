package androidx.lifecycle;

import androidx.lifecycle.k;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements s {

    /* renamed from: a */
    public final g f2630a;

    /* renamed from: b */
    public final s f2631b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2632a;

        static {
            int[] iArr = new int[k.b.values().length];
            f2632a = iArr;
            try {
                iArr[k.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2632a[k.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2632a[k.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2632a[k.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2632a[k.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2632a[k.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2632a[k.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(g gVar, s sVar) {
        this.f2630a = gVar;
        this.f2631b = sVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        switch (a.f2632a[bVar.ordinal()]) {
            case 1:
                this.f2630a.c(uVar);
                break;
            case 2:
                this.f2630a.onStart(uVar);
                break;
            case 3:
                this.f2630a.onResume(uVar);
                break;
            case 4:
                this.f2630a.onPause(uVar);
                break;
            case 5:
                this.f2630a.onStop(uVar);
                break;
            case 6:
                this.f2630a.onDestroy(uVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        s sVar = this.f2631b;
        if (sVar != null) {
            sVar.d(uVar, bVar);
        }
    }
}
