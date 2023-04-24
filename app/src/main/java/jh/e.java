package jh;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public final EditText f17773a;

    /* renamed from: b */
    public final EditText f17774b;

    /* renamed from: c */
    public final EditText f17775c;

    /* renamed from: d */
    public final boolean f17776d;

    /* renamed from: e */
    public final boolean f17777e;

    /* renamed from: f */
    public final boolean f17778f;

    /* renamed from: g */
    public final a f17779g;

    /* renamed from: h */
    public final f f17780h;

    /* renamed from: i */
    public boolean f17781i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z10, boolean z11);
    }

    public e(TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, boolean z10, boolean z11, boolean z12, a aVar) {
        gm.l.f(aVar, "listener");
        this.f17773a = textInputEditText;
        this.f17774b = textInputEditText2;
        this.f17775c = textInputEditText3;
        this.f17776d = z10;
        this.f17777e = z11;
        this.f17778f = z12;
        this.f17779g = aVar;
        f fVar = new f(this);
        this.f17780h = fVar;
        textInputEditText.addTextChangedListener(fVar);
        if (textInputEditText2 != null) {
            textInputEditText2.addTextChangedListener(fVar);
        }
        if (textInputEditText3 != null) {
            textInputEditText3.addTextChangedListener(fVar);
        }
    }
}
