package z9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final ArrayList<b> f32132a = new ArrayList<>();

    /* renamed from: b */
    public ValueAnimator f32133b = null;

    /* renamed from: c */
    public final a f32134c = new a();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
            j.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f32133b == animator) {
                jVar.f32133b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f32134c);
        this.f32132a.add(bVar);
    }
}
