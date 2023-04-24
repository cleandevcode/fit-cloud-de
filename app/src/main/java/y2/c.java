package y2;

import a1.f;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import z0.m;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<f.a[]> {

        /* renamed from: a */
        public f.a[] f30853a;

        @Override // android.animation.TypeEvaluator
        public final f.a[] evaluate(float f10, f.a[] aVarArr, f.a[] aVarArr2) {
            f.a[] aVarArr3 = aVarArr;
            f.a[] aVarArr4 = aVarArr2;
            if (a1.f.a(aVarArr3, aVarArr4)) {
                if (!a1.f.a(this.f30853a, aVarArr3)) {
                    this.f30853a = a1.f.e(aVarArr3);
                }
                for (int i10 = 0; i10 < aVarArr3.length; i10++) {
                    f.a aVar = this.f30853a[i10];
                    f.a aVar2 = aVarArr3[i10];
                    f.a aVar3 = aVarArr4[i10];
                    aVar.getClass();
                    aVar.f219a = aVar2.f219a;
                    int i11 = 0;
                    while (true) {
                        float[] fArr = aVar2.f220b;
                        if (i11 < fArr.length) {
                            aVar.f220b[i11] = (aVar3.f220b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                            i11++;
                        }
                    }
                }
                return this.f30853a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:366:0x0321, code lost:
        if (r27 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0323, code lost:
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0325, code lost:
        r1 = new android.animation.Animator[r12.size()];
        r2 = r12.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0334, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0336, code lost:
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0342, code lost:
        if (r28 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0344, code lost:
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0348, code lost:
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x034b, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:361:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, android.content.res.XmlResourceParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && d(i13)) || (z11 && d(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 != 2) {
            d dVar = i10 == 3 ? d.f30854a : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z10) {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : d(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z11) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolder == null || dVar == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(dVar);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        f.a[] c10 = a1.f.c(string);
        f.a[] c11 = a1.f.c(string2);
        if (c10 == null && c11 == null) {
            return null;
        }
        if (c10 == null) {
            if (c11 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), c11);
            }
            return null;
        }
        a aVar = new a();
        if (c11 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, c10);
        } else if (!a1.f.a(c10, c11)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, c10, c11);
        }
        return ofObject;
    }

    public static boolean d(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        TypedArray f10 = m.f(resources, theme, attributeSet, y2.a.f30839g);
        TypedArray f11 = m.f(resources, theme, attributeSet, y2.a.f30843k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long c10 = m.c(f10, xmlResourceParser, "duration", 1, 300);
        int i12 = 0;
        long c11 = m.c(f10, xmlResourceParser, "startOffset", 2, 0);
        int c12 = m.c(f10, xmlResourceParser, "valueType", 7, 4);
        if (m.e(xmlResourceParser, "valueFrom") && m.e(xmlResourceParser, "valueTo")) {
            if (c12 == 4) {
                TypedValue peekValue = f10.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = peekValue.type;
                } else {
                    i10 = 0;
                }
                TypedValue peekValue2 = f10.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = peekValue2.type;
                } else {
                    i11 = 0;
                }
                if ((z10 && d(i10)) || (z11 && d(i11))) {
                    c12 = 3;
                } else {
                    c12 = 0;
                }
            }
            PropertyValuesHolder c13 = c(f10, c12, 5, 6, "");
            if (c13 != null) {
                valueAnimator.setValues(c13);
            }
        }
        valueAnimator.setDuration(c10);
        valueAnimator.setStartDelay(c11);
        valueAnimator.setRepeatCount(m.c(f10, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(m.c(f10, xmlResourceParser, "repeatMode", 4, 1));
        if (f11 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String d10 = m.d(f11, xmlResourceParser, "pathData", 1);
            if (d10 != null) {
                String d11 = m.d(f11, xmlResourceParser, "propertyXName", 2);
                String d12 = m.d(f11, xmlResourceParser, "propertyYName", 3);
                if (d11 == null && d12 == null) {
                    throw new InflateException(f11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d13 = a1.f.d(d10);
                PathMeasure pathMeasure = new PathMeasure(d13, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f12 = 0.0f;
                do {
                    f12 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f12));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d13, false);
                int min = Math.min(100, ((int) (f12 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f13 = f12 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = f10;
                int i13 = 0;
                float f14 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i12 >= min) {
                        break;
                    }
                    int i14 = min;
                    pathMeasure2.getPosTan(f14 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i12] = fArr3[0];
                    fArr2[i12] = fArr3[1];
                    f14 += f13;
                    int i15 = i13 + 1;
                    if (i15 < arrayList.size() && f14 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i12++;
                    min = i14;
                }
                if (d11 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(d11, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (d12 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(d12, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i12 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i12 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = f10;
                objectAnimator2.setPropertyName(m.d(f11, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = f10;
        }
        if (!m.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i12 = typedArray2.getResourceId(i12, i12);
        }
        if (i12 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i12));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (f11 != null) {
            f11.recycle();
        }
        return valueAnimator3;
    }
}
