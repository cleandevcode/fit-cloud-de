package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class GpsSignalView extends LinearLayout {

    /* renamed from: a */
    public ImageView f12338a;

    /* renamed from: b */
    public TextView f12339b;

    /* renamed from: c */
    public int f12340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsSignalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(getContext()).inflate(R.layout.view_gps_signal, this);
        View findViewById = findViewById(R.id.img_gps_signal);
        l.e(findViewById, "findViewById(R.id.img_gps_signal)");
        this.f12338a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.tv_gps_signal);
        l.e(findViewById2, "findViewById(R.id.tv_gps_signal)");
        this.f12339b = (TextView) findViewById2;
    }

    public final void setGpsSignal(int i10) {
        TextView textView;
        ImageView imageView;
        int i11;
        if (this.f12340c != i10) {
            this.f12340c = i10;
            if (i10 <= 0) {
                ImageView imageView2 = this.f12338a;
                if (imageView2 == null) {
                    l.l("imgGpsSignal");
                    throw null;
                }
                imageView2.setVisibility(8);
                TextView textView2 = this.f12339b;
                if (textView2 == null) {
                    l.l("tvGpsSignal");
                    throw null;
                }
                textView2.setVisibility(0);
            } else {
                ImageView imageView3 = this.f12338a;
                if (imageView3 == null) {
                    l.l("imgGpsSignal");
                    throw null;
                }
                imageView3.setVisibility(0);
                TextView textView3 = this.f12339b;
                if (textView3 == null) {
                    l.l("tvGpsSignal");
                    throw null;
                }
                textView3.setVisibility(8);
            }
            switch (this.f12340c) {
                case -3:
                    textView = this.f12339b;
                    if (textView == null) {
                        l.l("tvGpsSignal");
                        throw null;
                    }
                    textView.setText("...");
                    return;
                case -2:
                    TextView textView4 = this.f12339b;
                    if (textView4 != null) {
                        textView4.setText(R.string.gps_status_disabled);
                        return;
                    } else {
                        l.l("tvGpsSignal");
                        throw null;
                    }
                case -1:
                    textView = this.f12339b;
                    if (textView == null) {
                        l.l("tvGpsSignal");
                        throw null;
                    }
                    textView.setText("...");
                    return;
                case 0:
                    textView = this.f12339b;
                    if (textView == null) {
                        l.l("tvGpsSignal");
                        throw null;
                    }
                    textView.setText("...");
                    return;
                case 1:
                    imageView = this.f12338a;
                    if (imageView == null) {
                        l.l("imgGpsSignal");
                        throw null;
                    }
                    i11 = R.drawable.ic_gps_status_signal_weak;
                    imageView.setImageResource(i11);
                    return;
                case 2:
                    imageView = this.f12338a;
                    if (imageView == null) {
                        l.l("imgGpsSignal");
                        throw null;
                    }
                    i11 = R.drawable.ic_gps_status_signal_medium;
                    imageView.setImageResource(i11);
                    return;
                case 3:
                    imageView = this.f12338a;
                    if (imageView == null) {
                        l.l("imgGpsSignal");
                        throw null;
                    }
                    i11 = R.drawable.ic_gps_status_signal_strong;
                    imageView.setImageResource(i11);
                    return;
                default:
                    return;
            }
        }
    }
}
