package h9;

import a0.q;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public long f16057a;

    /* renamed from: b */
    public long f16058b;

    /* renamed from: c */
    public TimeInterpolator f16059c;

    /* renamed from: d */
    public int f16060d;

    /* renamed from: e */
    public int f16061e;

    public h(long j10) {
        this.f16059c = null;
        this.f16060d = 0;
        this.f16061e = 1;
        this.f16057a = j10;
        this.f16058b = 150L;
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f16060d = 0;
        this.f16061e = 1;
        this.f16057a = j10;
        this.f16058b = j11;
        this.f16059c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f16057a);
        animator.setDuration(this.f16058b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f16060d);
            valueAnimator.setRepeatMode(this.f16061e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f16059c;
        return timeInterpolator != null ? timeInterpolator : a.f16044b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16057a != hVar.f16057a || this.f16058b != hVar.f16058b || this.f16060d != hVar.f16060d || this.f16061e != hVar.f16061e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public final int hashCode() {
        long j10 = this.f16057a;
        long j11 = this.f16058b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f16060d) * 31) + this.f16061e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\n');
        sb2.append(h.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f16057a);
        sb2.append(" duration: ");
        sb2.append(this.f16058b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f16060d);
        sb2.append(" repeatMode: ");
        return q.b(sb2, this.f16061e, "}\n");
    }
}
