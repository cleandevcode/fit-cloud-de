package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import ka.k;
import ka.l;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: e */
    public final C0096a f6837e;

    /* renamed from: f */
    public final b f6838f;

    /* renamed from: g */
    public final c f6839g;

    /* renamed from: h */
    public final d f6840h;

    /* renamed from: i */
    public AnimatorSet f6841i;

    /* renamed from: j */
    public ValueAnimator f6842j;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    public class C0096a implements TextWatcher {
        public C0096a() {
            a.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (a.this.f18216a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
            a.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        public c() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            editText.setOnFocusChangeListener(a.this.f6838f);
            a aVar = a.this;
            aVar.f18218c.setOnFocusChangeListener(aVar.f6838f);
            editText.removeTextChangedListener(a.this.f6837e);
            editText.addTextChangedListener(a.this.f6837e);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes.dex */
        public class RunnableC0097a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ EditText f6847a;

            public RunnableC0097a(EditText editText) {
                d.this = r1;
                this.f6847a = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6847a.removeTextChangedListener(a.this.f6837e);
                a.this.e(true);
            }
        }

        public d() {
            a.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 2) {
                editText.post(new RunnableC0097a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f6838f) {
                    editText.setOnFocusChangeListener(null);
                }
                View.OnFocusChangeListener onFocusChangeListener = a.this.f18218c.getOnFocusChangeListener();
                a aVar = a.this;
                if (onFocusChangeListener == aVar.f6838f) {
                    aVar.f18218c.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
            a.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Editable text = a.this.f18216a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            TextInputLayout textInputLayout = a.this.f18216a;
            l.b(textInputLayout, textInputLayout.f6808q0, textInputLayout.f6812s0);
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f6837e = new C0096a();
        this.f6838f = new b();
        this.f6839g = new c();
        this.f6840h = new d();
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f18216a.getEditText();
        if (editText != null && ((editText.hasFocus() || aVar.f18218c.hasFocus()) && editText.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    @Override // ka.k
    public final void a() {
        TextInputLayout textInputLayout = this.f18216a;
        int i10 = this.f18219d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f18216a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f18216a.setEndIconCheckable(false);
        this.f18216a.setEndIconOnClickListener(new e());
        TextInputLayout textInputLayout3 = this.f18216a;
        c cVar = this.f6839g;
        textInputLayout3.f6802n0.add(cVar);
        if (textInputLayout3.f6783e != null) {
            cVar.a(textInputLayout3);
        }
        this.f18216a.f6810r0.add(this.f6840h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(h9.a.f16046d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ka.d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = h9.a.f16043a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new ka.c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6841i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f6841i.addListener(new ka.a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new ka.c(this));
        this.f6842j = ofFloat3;
        ofFloat3.addListener(new ka.b(this));
    }

    @Override // ka.k
    public final void c(boolean z10) {
        if (this.f18216a.getSuffixText() == null) {
            return;
        }
        e(z10);
    }

    public final void e(boolean z10) {
        boolean z11 = this.f18216a.f() == z10;
        if (z10 && !this.f6841i.isRunning()) {
            this.f6842j.cancel();
            this.f6841i.start();
            if (z11) {
                this.f6841i.end();
            }
        } else if (z10) {
        } else {
            this.f6841i.cancel();
            this.f6842j.start();
            if (z11) {
                this.f6842j.end();
            }
        }
    }
}
