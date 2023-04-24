package z9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m extends androidx.transition.i {

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f32159a;

        public a(TextView textView) {
            this.f32159a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f32159a.setScaleX(floatValue);
            this.f32159a.setScaleY(floatValue);
        }
    }

    @Override // androidx.transition.i
    public final void d(x2.g gVar) {
        View view = gVar.f30176b;
        if (view instanceof TextView) {
            gVar.f30175a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.i
    public final void g(x2.g gVar) {
        View view = gVar.f30176b;
        if (view instanceof TextView) {
            gVar.f30175a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.i
    public final Animator m(ViewGroup viewGroup, x2.g gVar, x2.g gVar2) {
        if (gVar == null || gVar2 == null || !(gVar.f30176b instanceof TextView)) {
            return null;
        }
        View view = gVar2.f30176b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            HashMap hashMap = gVar.f30175a;
            HashMap hashMap2 = gVar2.f30175a;
            float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
            float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new a(textView));
            return ofFloat;
        }
        return null;
    }
}
