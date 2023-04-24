package u0;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.c0;
import u0.e;

/* loaded from: classes.dex */
public final class d extends ConstraintLayout implements c0 {
    public static final /* synthetic */ int U = 0;
    public boolean A;
    public ArrayList<u0.c> B;
    public ArrayList<u0.c> C;
    public CopyOnWriteArrayList<c> D;
    public int E;
    public float F;
    public boolean H;
    public b L;
    public boolean M;
    public EnumC0510d Q;

    /* renamed from: q */
    public float f28448q;

    /* renamed from: r */
    public int f28449r;

    /* renamed from: s */
    public int f28450s;

    /* renamed from: t */
    public int f28451t;

    /* renamed from: u */
    public float f28452u;

    /* renamed from: v */
    public float f28453v;

    /* renamed from: w */
    public long f28454w;

    /* renamed from: x */
    public float f28455x;

    /* renamed from: y */
    public c f28456y;

    /* renamed from: z */
    public u0.b f28457z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.L.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public float f28459a = Float.NaN;

        /* renamed from: b */
        public float f28460b = Float.NaN;

        /* renamed from: c */
        public int f28461c = -1;

        /* renamed from: d */
        public int f28462d = -1;

        public b() {
            d.this = r1;
        }

        public final void a() {
            androidx.constraintlayout.widget.d dVar;
            ConstraintLayout constraintLayout;
            c.a aVar;
            int a10;
            androidx.constraintlayout.widget.d dVar2;
            EnumC0510d enumC0510d = EnumC0510d.SETUP;
            int i10 = this.f28461c;
            if (i10 != -1 || this.f28462d != -1) {
                if (i10 == -1) {
                    d.this.r(this.f28462d);
                } else {
                    int i11 = this.f28462d;
                    if (i11 == -1) {
                        d dVar3 = d.this;
                        dVar3.setState(enumC0510d);
                        dVar3.f28450s = i10;
                        dVar3.f28449r = -1;
                        dVar3.f28451t = -1;
                        androidx.constraintlayout.widget.c cVar = dVar3.f1933k;
                        if (cVar != null) {
                            float f10 = -1;
                            int i12 = cVar.f2009b;
                            if (i12 == i10) {
                                if (i10 == -1) {
                                    aVar = cVar.f2011d.valueAt(0);
                                } else {
                                    aVar = cVar.f2011d.get(i12);
                                }
                                c.a aVar2 = aVar;
                                int i13 = cVar.f2010c;
                                if ((i13 == -1 || !aVar2.f2014b.get(i13).a(f10, f10)) && cVar.f2010c != (a10 = aVar2.a(f10, f10))) {
                                    if (a10 == -1) {
                                        dVar2 = null;
                                    } else {
                                        dVar2 = aVar2.f2014b.get(a10).f2022f;
                                    }
                                    if (a10 != -1) {
                                        int i14 = aVar2.f2014b.get(a10).f2021e;
                                    }
                                    if (dVar2 != null) {
                                        cVar.f2010c = a10;
                                        constraintLayout = cVar.f2008a;
                                        dVar2.a(constraintLayout);
                                        constraintLayout.setConstraintSet(null);
                                        constraintLayout.requestLayout();
                                    }
                                }
                            } else {
                                cVar.f2009b = i10;
                                c.a aVar3 = cVar.f2011d.get(i10);
                                int a11 = aVar3.a(f10, f10);
                                if (a11 == -1) {
                                    dVar = aVar3.f2016d;
                                } else {
                                    dVar = aVar3.f2014b.get(a11).f2022f;
                                }
                                if (a11 != -1) {
                                    int i15 = aVar3.f2014b.get(a11).f2021e;
                                }
                                if (dVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f10);
                                } else {
                                    cVar.f2010c = a11;
                                    constraintLayout = cVar.f2008a;
                                    dVar.a(constraintLayout);
                                    constraintLayout.setConstraintSet(null);
                                    constraintLayout.requestLayout();
                                }
                            }
                        }
                    } else {
                        d.this.q(i10, i11);
                    }
                }
                d.this.setState(enumC0510d);
            }
            if (Float.isNaN(this.f28460b)) {
                if (Float.isNaN(this.f28459a)) {
                    return;
                }
                d.this.setProgress(this.f28459a);
                return;
            }
            d.this.p(this.f28459a, this.f28460b);
            this.f28459a = Float.NaN;
            this.f28460b = Float.NaN;
            this.f28461c = -1;
            this.f28462d = -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: u0.d$d */
    /* loaded from: classes.dex */
    public enum EnumC0510d {
        /* JADX INFO: Fake field, exist only in values array */
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0102, code lost:
        if (r1 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x010d, code lost:
        if (r1 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0110, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0111, code lost:
        r17.f28450s = r2;
        r8 = r7;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.d.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // k1.c0
    public final void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void f(int i10) {
        this.f1933k = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f28450s;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public u0.b getDesignTool() {
        if (this.f28457z == null) {
            this.f28457z = new u0.b();
        }
        return this.f28457z;
    }

    public int getEndState() {
        return this.f28451t;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f28453v;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.f28449r;
    }

    public float getTargetPosition() {
        return this.f28455x;
    }

    public Bundle getTransitionState() {
        if (this.L == null) {
            this.L = new b();
        }
        b bVar = this.L;
        d dVar = d.this;
        bVar.f28462d = dVar.f28451t;
        bVar.f28461c = dVar.f28449r;
        bVar.f28460b = dVar.getVelocity();
        bVar.f28459a = d.this.getProgress();
        b bVar2 = this.L;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f28459a);
        bundle.putFloat("motion.velocity", bVar2.f28460b);
        bundle.putInt("motion.StartState", bVar2.f28461c);
        bundle.putInt("motion.EndState", bVar2.f28462d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return 0.0f;
    }

    public float getVelocity() {
        return this.f28448q;
    }

    public final void i() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f28456y == null && ((copyOnWriteArrayList = this.D) == null || copyOnWriteArrayList.isEmpty())) || this.F == this.f28452u) {
            return;
        }
        if (this.E != -1) {
            c cVar = this.f28456y;
            if (cVar != null) {
                cVar.b();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.D;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
        this.E = -1;
        this.F = this.f28452u;
        c cVar2 = this.f28456y;
        if (cVar2 != null) {
            cVar2.a();
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.D;
        if (copyOnWriteArrayList3 != null) {
            Iterator<c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.f28456y == null && ((copyOnWriteArrayList2 = this.D) == null || copyOnWriteArrayList2.isEmpty())) || this.E != -1) {
            if (this.f28456y == null && ((copyOnWriteArrayList = this.D) == null || copyOnWriteArrayList.isEmpty())) {
                return;
            }
            throw null;
        }
        this.E = this.f28450s;
        throw null;
    }

    @Override // k1.b0
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // k1.b0
    public final boolean l(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // k1.b0
    public final void m(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    @Override // k1.b0
    public final void n(View view, int i10) {
    }

    @Override // k1.b0
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.L;
        if (bVar != null) {
            if (this.M) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.H = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.H = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof u0.c) {
            u0.c cVar = (u0.c) view;
            if (this.D == null) {
                this.D = new CopyOnWriteArrayList<>();
            }
            this.D.add(cVar);
            if (cVar.f28444i) {
                if (this.B == null) {
                    this.B = new ArrayList<>();
                }
                this.B.add(cVar);
            }
            if (cVar.f28445j) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                this.C.add(cVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<u0.c> arrayList = this.B;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<u0.c> arrayList2 = this.C;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            b bVar = this.L;
            bVar.f28459a = f10;
            bVar.f28460b = f11;
            return;
        }
        setProgress(f10);
        setState(EnumC0510d.MOVING);
        this.f28448q = f11;
    }

    public final void q(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            b bVar = this.L;
            bVar.f28461c = i10;
            bVar.f28462d = i11;
        }
    }

    public final void r(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            this.L.f28462d = i10;
            return;
        }
        int i11 = this.f28450s;
        if (i11 != i10 && this.f28449r != i10 && this.f28451t != i10) {
            this.f28451t = i10;
            if (i11 != -1) {
                q(i11, i10);
                this.f28453v = 0.0f;
                return;
            }
            this.f28455x = 1.0f;
            this.f28452u = 0.0f;
            this.f28453v = 0.0f;
            this.f28454w = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i10 = this.f28450s;
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.M = z10;
    }

    public void setInteractionEnabled(boolean z10) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<u0.c> arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.C.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<u0.c> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.B.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        EnumC0510d enumC0510d = EnumC0510d.FINISHED;
        EnumC0510d enumC0510d2 = EnumC0510d.MOVING;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            this.L.f28459a = f10;
            return;
        }
        if (i10 <= 0) {
            if (this.f28453v == 1.0f && this.f28450s == this.f28451t) {
                setState(enumC0510d2);
            }
            this.f28450s = this.f28449r;
            if (this.f28453v != 0.0f) {
                return;
            }
        } else if (f10 >= 1.0f) {
            if (this.f28453v == 0.0f && this.f28450s == this.f28449r) {
                setState(enumC0510d2);
            }
            this.f28450s = this.f28451t;
            if (this.f28453v != 1.0f) {
                return;
            }
        } else {
            this.f28450s = -1;
            setState(enumC0510d2);
            return;
        }
        setState(enumC0510d);
    }

    public void setScene(e eVar) {
        d();
        throw null;
    }

    public void setStartState(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            b bVar = this.L;
            bVar.f28461c = i10;
            bVar.f28462d = i10;
            return;
        }
        this.f28450s = i10;
    }

    public void setState(EnumC0510d enumC0510d) {
        EnumC0510d enumC0510d2 = EnumC0510d.FINISHED;
        if (enumC0510d == enumC0510d2 && this.f28450s == -1) {
            return;
        }
        EnumC0510d enumC0510d3 = this.Q;
        this.Q = enumC0510d;
        EnumC0510d enumC0510d4 = EnumC0510d.MOVING;
        if (enumC0510d3 == enumC0510d4 && enumC0510d == enumC0510d4) {
            i();
        }
        int ordinal = enumC0510d3.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (enumC0510d == enumC0510d4) {
                i();
            }
            if (enumC0510d != enumC0510d2) {
                return;
            }
        } else if (ordinal != 2 || enumC0510d != enumC0510d2) {
            return;
        }
        j();
    }

    public void setTransition(int i10) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f28456y = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.L == null) {
            this.L = new b();
        }
        b bVar = this.L;
        bVar.getClass();
        bVar.f28459a = bundle.getFloat("motion.progress");
        bVar.f28460b = bundle.getFloat("motion.velocity");
        bVar.f28461c = bundle.getInt("motion.StartState");
        bVar.f28462d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.L.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return u0.a.a(context, this.f28449r) + "->" + u0.a.a(context, this.f28451t) + " (pos:" + this.f28453v + " Dpos/Dt:" + this.f28448q;
    }
}
