package com.huawei.hms.scankit;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ y f8181a;

    public x(y yVar) {
        this.f8181a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        String string;
        ImageView imageView3;
        if (view.isSelected()) {
            this.f8181a.g();
            this.f8181a.m();
            imageView = this.f8181a.B;
            imageView3 = this.f8181a.B;
            string = imageView3.getResources().getString(R.string.scankit_light);
        } else {
            this.f8181a.h();
            view.setSelected(true);
            textView = this.f8181a.C;
            int i10 = R.string.scankit_light_off;
            textView.setText(i10);
            imageView = this.f8181a.B;
            imageView2 = this.f8181a.B;
            string = imageView2.getResources().getString(i10);
        }
        imageView.setContentDescription(string);
    }
}
