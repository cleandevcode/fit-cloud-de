package k7;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import fm.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: k7.a$a */
    /* loaded from: classes.dex */
    public static final class C0316a extends ClickableSpan {

        /* renamed from: a */
        public final /* synthetic */ l<View, tl.l> f18198a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0316a(l<? super View, tl.l> lVar) {
            this.f18198a = lVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            gm.l.f(view, "widget");
            this.f18198a.k(view);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ClickableSpan {

        /* renamed from: a */
        public final /* synthetic */ l<View, tl.l>[] f18199a;

        /* renamed from: b */
        public final /* synthetic */ int f18200b;

        public b(l<View, tl.l>[] lVarArr, int i10) {
            this.f18199a = lVarArr;
            this.f18200b = i10;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            gm.l.f(view, "widget");
            this.f18199a[this.f18200b].k(view);
        }
    }

    public static final void a(TextView textView, String str, String str2, l<? super View, tl.l> lVar) {
        gm.l.f(str, "fullText");
        gm.l.f(str2, "subText");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int h02 = om.l.h0(str, str2, 0, false, 6);
        valueOf.setSpan(new C0316a(lVar), h02, str2.length() + h02, 33);
        textView.setText(valueOf);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final void b(TextView textView, String str, String[] strArr, l<View, tl.l>[] lVarArr) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int h02 = om.l.h0(str, strArr[i10], 0, false, 6);
            valueOf.setSpan(new b(lVarArr, i10), h02, strArr[i10].length() + h02, 33);
        }
        textView.setText(valueOf);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
