package ka;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d1;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final Context f18220a;

    /* renamed from: b */
    public final TextInputLayout f18221b;

    /* renamed from: c */
    public LinearLayout f18222c;

    /* renamed from: d */
    public int f18223d;

    /* renamed from: e */
    public FrameLayout f18224e;

    /* renamed from: f */
    public Animator f18225f;

    /* renamed from: g */
    public final float f18226g;

    /* renamed from: h */
    public int f18227h;

    /* renamed from: i */
    public int f18228i;

    /* renamed from: j */
    public CharSequence f18229j;

    /* renamed from: k */
    public boolean f18230k;

    /* renamed from: l */
    public d1 f18231l;

    /* renamed from: m */
    public CharSequence f18232m;

    /* renamed from: n */
    public int f18233n;

    /* renamed from: o */
    public ColorStateList f18234o;

    /* renamed from: p */
    public CharSequence f18235p;

    /* renamed from: q */
    public boolean f18236q;

    /* renamed from: r */
    public d1 f18237r;

    /* renamed from: s */
    public int f18238s;

    /* renamed from: t */
    public ColorStateList f18239t;

    /* renamed from: u */
    public Typeface f18240u;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f18241a;

        /* renamed from: b */
        public final /* synthetic */ TextView f18242b;

        /* renamed from: c */
        public final /* synthetic */ int f18243c;

        /* renamed from: d */
        public final /* synthetic */ TextView f18244d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            m.this = r1;
            this.f18241a = i10;
            this.f18242b = textView;
            this.f18243c = i11;
            this.f18244d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d1 d1Var;
            m mVar = m.this;
            mVar.f18227h = this.f18241a;
            mVar.f18225f = null;
            TextView textView = this.f18242b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f18243c == 1 && (d1Var = m.this.f18231l) != null) {
                    d1Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f18244d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f18244d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f18244d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public m(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f18220a = context;
        this.f18221b = textInputLayout;
        this.f18226g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i10) {
        if (this.f18222c == null && this.f18224e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f18220a);
            this.f18222c = linearLayout;
            linearLayout.setOrientation(0);
            this.f18221b.addView(this.f18222c, -1, -2);
            this.f18224e = new FrameLayout(this.f18220a);
            this.f18222c.addView(this.f18224e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f18221b.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f18224e.setVisibility(0);
            this.f18224e.addView(textView);
        } else {
            this.f18222c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f18222c.setVisibility(0);
        this.f18223d++;
    }

    public final void b() {
        boolean z10;
        if (this.f18222c != null && this.f18221b.getEditText() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditText editText = this.f18221b.getEditText();
            boolean d10 = da.d.d(this.f18220a);
            LinearLayout linearLayout = this.f18222c;
            int i10 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            int f10 = o0.e.f(editText);
            if (d10) {
                f10 = this.f18220a.getResources().getDimensionPixelSize(i10);
            }
            int i11 = R.dimen.material_helper_text_font_1_3_padding_top;
            int dimensionPixelSize = this.f18220a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (d10) {
                dimensionPixelSize = this.f18220a.getResources().getDimensionPixelSize(i11);
            }
            int e10 = o0.e.e(editText);
            if (d10) {
                e10 = this.f18220a.getResources().getDimensionPixelSize(i10);
            }
            o0.e.k(linearLayout, f10, dimensionPixelSize, e10, 0);
        }
    }

    public final void c() {
        Animator animator = this.f18225f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f10);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(h9.a.f16043a);
                arrayList.add(ofFloat);
                if (i12 == i10) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f18226g, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(h9.a.f16046d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        return (this.f18228i != 1 || this.f18231l == null || TextUtils.isEmpty(this.f18229j)) ? false : true;
    }

    public final TextView f(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f18237r;
        }
        return this.f18231l;
    }

    public final int g() {
        d1 d1Var = this.f18231l;
        if (d1Var != null) {
            return d1Var.getCurrentTextColor();
        }
        return -1;
    }

    public final void h() {
        this.f18229j = null;
        c();
        if (this.f18227h == 1) {
            this.f18228i = (!this.f18236q || TextUtils.isEmpty(this.f18235p)) ? 0 : 2;
        }
        k(this.f18227h, this.f18228i, j(this.f18231l, ""));
    }

    public final void i(TextView textView, int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f18222c;
        if (viewGroup2 == null) {
            return;
        }
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        if (z10 && (viewGroup = this.f18224e) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i11 = this.f18223d - 1;
        this.f18223d = i11;
        LinearLayout linearLayout = this.f18222c;
        if (i11 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f18221b;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.g.c(textInputLayout) && this.f18221b.isEnabled() && (this.f18228i != this.f18227h || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void k(int i10, int i11, boolean z10) {
        TextView f10;
        TextView f11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f18225f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f18236q, this.f18237r, 2, i10, i11);
            d(arrayList, this.f18230k, this.f18231l, 1, i10, i11);
            tb.a.l(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, f(i10), i10, f(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (f11 = f(i11)) != null) {
                f11.setVisibility(0);
                f11.setAlpha(1.0f);
            }
            if (i10 != 0 && (f10 = f(i10)) != null) {
                f10.setVisibility(4);
                if (i10 == 1) {
                    f10.setText((CharSequence) null);
                }
            }
            this.f18227h = i11;
        }
        this.f18221b.o();
        this.f18221b.s(z10, false);
        this.f18221b.x();
    }
}
