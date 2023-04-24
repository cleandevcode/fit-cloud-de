package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f6906r = 0;

    /* renamed from: q */
    public final MaterialButtonToggleGroup f6907q;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            TimePickerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i10 = TimePickerView.f6906r;
            timePickerView.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f6907q = materialButtonToggleGroup;
        materialButtonToggleGroup.f6345c.add(new e(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        g gVar = new g(new GestureDetector(getContext(), new f(this)));
        chip.setOnTouchListener(gVar);
        chip2.setOnTouchListener(gVar);
        int i10 = R.id.selection_type;
        chip.setTag(i10, 12);
        chip2.setTag(i10, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void i() {
        boolean z10;
        d.a aVar;
        if (this.f6907q.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.b(this);
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            char c10 = 1;
            if (o0.e.d(this) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c10 = 2;
            }
            int i10 = R.id.material_clock_display;
            if (dVar.f2028c.containsKey(Integer.valueOf(i10)) && (aVar = dVar.f2028c.get(Integer.valueOf(i10))) != null) {
                switch (c10) {
                    case 1:
                        d.b bVar = aVar.f2032d;
                        bVar.f2064i = -1;
                        bVar.f2062h = -1;
                        bVar.F = -1;
                        bVar.M = Integer.MIN_VALUE;
                        break;
                    case 2:
                        d.b bVar2 = aVar.f2032d;
                        bVar2.f2068k = -1;
                        bVar2.f2066j = -1;
                        bVar2.G = -1;
                        bVar2.O = Integer.MIN_VALUE;
                        break;
                    case 3:
                        d.b bVar3 = aVar.f2032d;
                        bVar3.f2072m = -1;
                        bVar3.f2070l = -1;
                        bVar3.H = 0;
                        bVar3.N = Integer.MIN_VALUE;
                        break;
                    case 4:
                        d.b bVar4 = aVar.f2032d;
                        bVar4.f2074n = -1;
                        bVar4.f2076o = -1;
                        bVar4.I = 0;
                        bVar4.P = Integer.MIN_VALUE;
                        break;
                    case 5:
                        d.b bVar5 = aVar.f2032d;
                        bVar5.f2078p = -1;
                        bVar5.f2079q = -1;
                        bVar5.f2080r = -1;
                        bVar5.L = 0;
                        bVar5.S = Integer.MIN_VALUE;
                        break;
                    case 6:
                        d.b bVar6 = aVar.f2032d;
                        bVar6.f2081s = -1;
                        bVar6.f2082t = -1;
                        bVar6.K = 0;
                        bVar6.R = Integer.MIN_VALUE;
                        break;
                    case 7:
                        d.b bVar7 = aVar.f2032d;
                        bVar7.f2083u = -1;
                        bVar7.f2084v = -1;
                        bVar7.J = 0;
                        bVar7.Q = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        d.b bVar8 = aVar.f2032d;
                        bVar8.B = -1.0f;
                        bVar8.A = -1;
                        bVar8.f2088z = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            dVar.a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            i();
        }
    }
}
