package r9;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Chip f25449a;

    public a(Chip chip) {
        this.f25449a = chip;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0013, code lost:
        if (r1.f32068a.a(r0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001e, code lost:
        if (r2.e(r0, r2.f32073e) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
        r1.f32068a.d();
     */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
        /*
            r4 = this;
            com.google.android.material.chip.Chip r0 = r4.f25449a
            z9.h$a<com.google.android.material.chip.Chip> r1 = r0.f6369j
            if (r1 == 0) goto L25
            z9.a r1 = (z9.a) r1
            r1.getClass()
            if (r6 == 0) goto L16
            z9.b r2 = r1.f32068a
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L25
            goto L20
        L16:
            z9.b r2 = r1.f32068a
            boolean r3 = r2.f32073e
            boolean r0 = r2.e(r0, r3)
            if (r0 == 0) goto L25
        L20:
            z9.b r0 = r1.f32068a
            r0.d()
        L25:
            com.google.android.material.chip.Chip r0 = r4.f25449a
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.f6368i
            if (r0 == 0) goto L2e
            r0.onCheckedChanged(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.a.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
