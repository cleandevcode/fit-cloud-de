package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import b1.j;
import h.b;
import h.d;
import o0.i;

/* loaded from: classes.dex */
public final class a extends h.d implements j {

    /* renamed from: p */
    public b f15681p;

    /* renamed from: q */
    public f f15682q;

    /* renamed from: r */
    public int f15683r;

    /* renamed from: s */
    public int f15684s;

    /* renamed from: t */
    public boolean f15685t;

    /* renamed from: h.a$a */
    /* loaded from: classes.dex */
    public static class C0279a extends f {

        /* renamed from: a */
        public final Animatable f15686a;

        public C0279a(Animatable animatable) {
            this.f15686a = animatable;
        }

        @Override // h.a.f
        public final void c() {
            this.f15686a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f15686a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d.a {
        public o0.e<Long> I;
        public i<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            i<Integer> iVar;
            if (bVar != null) {
                this.I = bVar.I;
                iVar = bVar.J;
            } else {
                this.I = new o0.e<>();
                iVar = new i<>();
            }
            this.J = iVar;
        }

        @Override // h.d.a, h.b.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // h.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // h.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: a */
        public final y2.b f15687a;

        public c(y2.b bVar) {
            this.f15687a = bVar;
        }

        @Override // h.a.f
        public final void c() {
            this.f15687a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f15687a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: a */
        public final ObjectAnimator f15688a;

        /* renamed from: b */
        public final boolean f15689b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int i10;
            int i11;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i10 = numberOfFrames - 1;
            } else {
                i10 = 0;
            }
            if (z10) {
                i11 = 0;
            } else {
                i11 = numberOfFrames - 1;
            }
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            i.a.a(ofInt, true);
            ofInt.setDuration(eVar.f15692c);
            ofInt.setInterpolator(eVar);
            this.f15689b = z11;
            this.f15688a = ofInt;
        }

        @Override // h.a.f
        public final boolean a() {
            return this.f15689b;
        }

        @Override // h.a.f
        public final void b() {
            this.f15688a.reverse();
        }

        @Override // h.a.f
        public final void c() {
            this.f15688a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f15688a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements TimeInterpolator {

        /* renamed from: a */
        public int[] f15690a;

        /* renamed from: b */
        public int f15691b;

        /* renamed from: c */
        public int f15692c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f15691b = numberOfFrames;
            int[] iArr = this.f15690a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f15690a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f15690a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f15692c = i10;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f15692c) + 0.5f);
            int i11 = this.f15691b;
            int[] iArr = this.f15690a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f15692c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(b bVar, Resources resources) {
        this.f15683r = -1;
        this.f15684s = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0264, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x028e, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0295, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h.a g(android.content.Context r21, android.content.res.Resources.Theme r22, android.content.res.Resources r23, android.util.AttributeSet r24, android.content.res.XmlResourceParser r25) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):h.a");
    }

    @Override // h.d, h.b
    public final b.c b() {
        return new b(this.f15681p, this, null);
    }

    @Override // h.d, h.b
    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.f15681p = (b) cVar;
        }
    }

    @Override // h.d
    public final d.a f() {
        return new b(this.f15681p, this, null);
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f15682q;
        if (fVar != null) {
            fVar.d();
            this.f15682q = null;
            d(this.f15683r);
            this.f15683r = -1;
            this.f15684s = -1;
        }
    }

    @Override // h.d, h.b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f15685t) {
            super.mutate();
            this.f15681p.e();
            this.f15685t = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x010b, code lost:
        if (d(r3) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    @Override // h.d, h.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r18) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.onStateChange(int[]):boolean");
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.f15682q;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
