package y1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import s.h1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final b f30822a;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a */
        public final TextView f30823a;

        /* renamed from: b */
        public final d f30824b;

        /* renamed from: c */
        public boolean f30825c = true;

        public a(TextView textView) {
            this.f30823a = textView;
            this.f30824b = new d(textView);
        }

        @Override // y1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f30825c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() != 0) {
                    int length = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (sparseArray.indexOfKey(i12) < 0) {
                            inputFilterArr2[i11] = inputFilterArr[i12];
                            i11++;
                        }
                    }
                    return inputFilterArr2;
                }
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter2 : inputFilterArr) {
                if (inputFilter2 == this.f30824b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
            inputFilterArr3[length2] = this.f30824b;
            return inputFilterArr3;
        }

        @Override // y1.f.b
        public final boolean b() {
            return this.f30825c;
        }

        @Override // y1.f.b
        public final void c(boolean z10) {
            if (z10) {
                this.f30823a.setTransformationMethod(e(this.f30823a.getTransformationMethod()));
            }
        }

        @Override // y1.f.b
        public final void d(boolean z10) {
            this.f30825c = z10;
            this.f30823a.setTransformationMethod(e(this.f30823a.getTransformationMethod()));
            this.f30823a.setFilters(a(this.f30823a.getFilters()));
        }

        @Override // y1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f30825c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new h(transformationMethod);
                }
                return transformationMethod;
            } else if (transformationMethod instanceof h) {
                return ((h) transformationMethod).f30832a;
            } else {
                return transformationMethod;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a */
        public final a f30826a;

        public c(TextView textView) {
            this.f30826a = new a(textView);
        }

        @Override // y1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z10;
            if (androidx.emoji2.text.f.f2236j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return inputFilterArr;
            }
            return this.f30826a.a(inputFilterArr);
        }

        @Override // y1.f.b
        public final boolean b() {
            return this.f30826a.f30825c;
        }

        @Override // y1.f.b
        public final void c(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.f.f2236j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            this.f30826a.c(z10);
        }

        @Override // y1.f.b
        public final void d(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.f.f2236j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                this.f30826a.f30825c = z10;
            } else {
                this.f30826a.d(z10);
            }
        }

        @Override // y1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            boolean z10;
            if (androidx.emoji2.text.f.f2236j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return transformationMethod;
            }
            return this.f30826a.e(transformationMethod);
        }
    }

    public f(TextView textView) {
        h1.i(textView, "textView cannot be null");
        this.f30822a = new c(textView);
    }
}
