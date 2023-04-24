package h9;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final o0.h<String, h> f16055a = new o0.h<>();

    /* renamed from: b */
    public final o0.h<String, PropertyValuesHolder[]> f16056b = new o0.h<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.d.a("Can't load animation resource ID #0x");
            a10.append(Integer.toHexString(i10));
            Log.w("MotionSpec", a10.toString(), e10);
            return null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f16056b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.f16045c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f16046d;
                    }
                } else {
                    interpolator = a.f16044b;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f16060d = objectAnimator.getRepeatCount();
                hVar.f16061e = objectAnimator.getRepeatMode();
                gVar.f16055a.put(propertyName, hVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h d(String str) {
        boolean z10;
        if (this.f16055a.getOrDefault(str, null) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f16055a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f16055a.equals(((g) obj).f16055a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16055a.hashCode();
    }

    public final String toString() {
        return '\n' + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f16055a + "}\n";
    }
}
