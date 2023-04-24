package ka;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
public final class f extends ga.f {

    /* renamed from: z */
    public final RectF f18210z;

    public f() {
        this(null);
    }

    public f(ga.i iVar) {
        super(iVar == null ? new ga.i() : iVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f18210z = new RectF();
    }

    @Override // ga.f
    public final void g(Canvas canvas) {
        if (this.f18210z.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f18210z);
        } else {
            canvas.clipRect(this.f18210z, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    public final void r(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f18210z;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
