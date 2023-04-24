package k1;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public ViewParent f18088a;

    /* renamed from: b */
    public ViewParent f18089b;

    /* renamed from: c */
    public final View f18090c;

    /* renamed from: d */
    public boolean f18091d;

    /* renamed from: e */
    public int[] f18092e;

    public a0(View view) {
        this.f18090c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent g10;
        if (!this.f18091d || (g10 = g(0)) == null) {
            return false;
        }
        try {
            return f2.a(g10, this.f18090c, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent g10;
        if (!this.f18091d || (g10 = g(0)) == null) {
            return false;
        }
        try {
            return f2.b(g10, this.f18090c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent g10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f18091d || (g10 = g(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        } else {
            if (iArr2 != null) {
                this.f18090c.getLocationInWindow(iArr2);
                i13 = iArr2[0];
                i14 = iArr2[1];
            } else {
                i13 = 0;
                i14 = 0;
            }
            if (iArr == null) {
                if (this.f18092e == null) {
                    this.f18092e = new int[2];
                }
                iArr3 = this.f18092e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f18090c;
            if (g10 instanceof b0) {
                ((b0) g10).o(view, i10, i11, iArr3, i12);
            } else if (i12 == 0) {
                try {
                    f2.c(g10, view, i10, i11, iArr3);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedPreScroll", e10);
                }
            }
            if (iArr2 != null) {
                this.f18090c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i13;
                iArr2[1] = iArr2[1] - i14;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        f(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr) {
        return f(i10, i11, i12, i13, iArr, 0, null);
    }

    public final boolean f(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent g10;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f18091d || (g10 = g(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f18090c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f18092e == null) {
                this.f18092e = new int[2];
            }
            int[] iArr4 = this.f18092e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f18090c;
        if (g10 instanceof c0) {
            ((c0) g10).e(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (g10 instanceof b0) {
                ((b0) g10).k(view, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    f2.d(g10, view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            this.f18090c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent g(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f18089b;
        }
        return this.f18088a;
    }

    public final boolean h(int i10) {
        return g(i10) != null;
    }

    public final void i(boolean z10) {
        if (this.f18091d) {
            View view = this.f18090c;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.i.z(view);
        }
        this.f18091d = z10;
    }

    public final boolean j(int i10, int i11) {
        boolean f10;
        if (h(i11)) {
            return true;
        }
        if (this.f18091d) {
            View view = this.f18090c;
            for (ViewParent parent = this.f18090c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f18090c;
                boolean z10 = parent instanceof b0;
                if (z10) {
                    f10 = ((b0) parent).l(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            f10 = f2.f(parent, view, view2, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    f10 = false;
                }
                if (f10) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            this.f18089b = parent;
                        }
                    } else {
                        this.f18088a = parent;
                    }
                    View view3 = this.f18090c;
                    if (z10) {
                        ((b0) parent).m(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            f2.e(parent, view, view3, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void k(int i10) {
        ViewParent g10 = g(i10);
        if (g10 != null) {
            View view = this.f18090c;
            if (g10 instanceof b0) {
                ((b0) g10).n(view, i10);
            } else if (i10 == 0) {
                try {
                    f2.g(g10, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + g10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f18089b = null;
                    return;
                }
                return;
            }
            this.f18088a = null;
        }
    }
}
