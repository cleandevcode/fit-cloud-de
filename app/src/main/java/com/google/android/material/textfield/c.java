package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import ka.k;
import ka.l;
import z9.n;

/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: e */
    public final a f6877e;

    /* renamed from: f */
    public final b f6878f;

    /* renamed from: g */
    public final C0100c f6879g;

    /* loaded from: classes.dex */
    public class a extends n {
        public a() {
            c.this = r1;
        }

        @Override // z9.n, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            cVar.f18218c.setChecked(!c.d(cVar));
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
            c.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c cVar = c.this;
            cVar.f18218c.setChecked(!c.d(cVar));
            editText.removeTextChangedListener(c.this.f6877e);
            editText.addTextChangedListener(c.this.f6877e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    /* loaded from: classes.dex */
    public class C0100c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ EditText f6883a;

            public a(EditText editText) {
                C0100c.this = r1;
                this.f6883a = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6883a.removeTextChangedListener(c.this.f6877e);
            }
        }

        public C0100c() {
            c.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
            c.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PasswordTransformationMethod passwordTransformationMethod;
            EditText editText = c.this.f18216a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (c.d(c.this)) {
                passwordTransformationMethod = null;
            } else {
                passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(passwordTransformationMethod);
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            TextInputLayout textInputLayout = c.this.f18216a;
            l.b(textInputLayout, textInputLayout.f6808q0, textInputLayout.f6812s0);
        }
    }

    public c(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f6877e = new a();
        this.f6878f = new b();
        this.f6879g = new C0100c();
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f18216a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    @Override // ka.k
    public final void a() {
        TextInputLayout textInputLayout = this.f18216a;
        int i10 = this.f18219d;
        if (i10 == 0) {
            i10 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f18216a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z10 = true;
        this.f18216a.setEndIconVisible(true);
        this.f18216a.setEndIconCheckable(true);
        this.f18216a.setEndIconOnClickListener(new d());
        TextInputLayout textInputLayout3 = this.f18216a;
        b bVar = this.f6878f;
        textInputLayout3.f6802n0.add(bVar);
        if (textInputLayout3.f6783e != null) {
            bVar.a(textInputLayout3);
        }
        TextInputLayout textInputLayout4 = this.f18216a;
        textInputLayout4.f6810r0.add(this.f6879g);
        EditText editText = this.f18216a.getEditText();
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            z10 = false;
        }
        if (z10) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
