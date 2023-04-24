package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import gm.l;
import jh.w;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class LoadingView extends LinearLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f12363g = 0;

    /* renamed from: a */
    public final ProgressBar f12364a;

    /* renamed from: b */
    public final TextView f12365b;

    /* renamed from: c */
    public final Button f12366c;

    /* renamed from: d */
    public int f12367d;

    /* renamed from: e */
    public a f12368e;

    /* renamed from: f */
    public View[] f12369f;

    /* loaded from: classes2.dex */
    public interface a {
        void d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        LayoutInflater.from(context).inflate(R.layout.loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.progress_bar);
        l.e(findViewById, "findViewById(R.id.progress_bar)");
        this.f12364a = (ProgressBar) findViewById;
        View findViewById2 = findViewById(R.id.tv_status);
        l.e(findViewById2, "findViewById(R.id.tv_status)");
        TextView textView = (TextView) findViewById2;
        this.f12365b = textView;
        View findViewById3 = findViewById(R.id.btn_action);
        l.e(findViewById3, "findViewById(R.id.btn_action)");
        this.f12366c = (Button) findViewById3;
        textView.setOnClickListener(new w(7, this));
    }

    public final void a(int i10) {
        this.f12367d = 2;
        setVisibility(0);
        this.f12364a.setVisibility(8);
        this.f12365b.setVisibility(0);
        this.f12365b.setText(i10);
        this.f12366c.setVisibility(8);
    }

    public final void b(int i10) {
        this.f12367d = 3;
        setVisibility(0);
        this.f12364a.setVisibility(8);
        this.f12365b.setVisibility(0);
        this.f12365b.setText(i10);
        this.f12366c.setVisibility(8);
    }

    public final void c() {
        if (this.f12367d == 1) {
            return;
        }
        this.f12367d = 1;
        setVisibility(0);
        this.f12364a.setVisibility(0);
        this.f12365b.setVisibility(8);
        this.f12366c.setVisibility(8);
    }

    public final View[] getAssociateViews() {
        return this.f12369f;
    }

    public final a getListener() {
        return this.f12368e;
    }

    public final void setAssociateViews(View[] viewArr) {
        this.f12369f = viewArr;
    }

    public final void setListener(a aVar) {
        this.f12368e = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            View[] viewArr = this.f12369f;
            if (viewArr != null) {
                for (View view : viewArr) {
                    view.setVisibility(8);
                }
                return;
            }
            return;
        }
        this.f12367d = 0;
        View[] viewArr2 = this.f12369f;
        if (viewArr2 != null) {
            for (View view2 : viewArr2) {
                view2.setVisibility(0);
            }
        }
    }
}
